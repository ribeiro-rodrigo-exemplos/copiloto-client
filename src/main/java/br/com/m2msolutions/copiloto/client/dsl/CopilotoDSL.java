package br.com.m2msolutions.copiloto.client.dsl;

import br.com.m2msolutions.copiloto.client.Copiloto;
import br.com.m2msolutions.copiloto.client.builder.CopilotoConfig;
import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.ViagemBuilder;
import br.com.m2msolutions.copiloto.grpc.RegulagemRequest;

public class CopilotoDSL implements Copiloto {

    private RegulagemRequest.Builder request;
    private ViagemBuilder viagemBuilder;
    private CopilotoConfig config;

    public CopilotoDSL(CopilotoConfig config){
        this.config = config;
        request = RegulagemRequest.newBuilder();
        viagemBuilder = new ViagemBuilder(this);
    }

    public RequestBuilder calcular() {
        return new RequestBuilder(request,config);
    }

    public ViagemBuilder emViagem(String viagemId) {
        request.setIdViagem(viagemId);
        return viagemBuilder;
    }

    public RegulagemRequest.Builder getRequest(){
        return request;
    }
}
