package br.com.m2msolutions.copiloto.client.dsl;

import br.com.m2msolutions.copiloto.client.Copiloto;
import br.com.m2msolutions.copiloto.client.builder.CopilotoConfig;
import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.VeiculoBuilder;
import br.com.m2msolutions.copiloto.grpc.CopilotoRequest;

public class CopilotoDSL implements Copiloto {

    private CopilotoRequest.Builder request;
    private VeiculoBuilder veiculoBuilder;
    private CopilotoConfig config;

    public CopilotoDSL(CopilotoConfig config){
        this.config = config;
        request = CopilotoRequest.newBuilder();
        veiculoBuilder = new VeiculoBuilder(this);
    }

    public RequestBuilder calcular() {
        return new RequestBuilder(request,config);
    }

    public VeiculoBuilder emViagemComVeiculo(Integer veiculoId) {
        request.setIdVeiculo(veiculoId);
        return veiculoBuilder;
    }

    public Copiloto cliente(Integer clienteId) {
        request.setIdCliente(clienteId);
        return this;
    }

    public CopilotoRequest.Builder getRequest(){
        return request;
    }
}
