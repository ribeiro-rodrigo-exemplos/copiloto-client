package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.CopilotoException;
import br.com.m2msolutions.copiloto.client.builder.CopilotoConfig;
import br.com.m2msolutions.copiloto.grpc.RegulacaoGrpc;
import br.com.m2msolutions.copiloto.grpc.RegulagemRequest;
import br.com.m2msolutions.copiloto.grpc.RegulagemResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class RequestBuilder {

    private RegulagemRequest.Builder requestBuilder;
    private CopilotoConfig config;

    public RequestBuilder(RegulagemRequest.Builder builder,CopilotoConfig config){
        this.requestBuilder = builder;
        this.config = config;
    }

    public Double regulagem(){

        try{

            RegulacaoGrpc.RegulacaoBlockingStub blockingStub = criarStub();
            RegulagemResponse response = blockingStub.regular(requestBuilder.build());

            Boolean calculoRealizado = response.getCopilotoHabilitado() && response.getResult().getRegulagemRealizada();

            return calculoRealizado ? response.getResult().getTempoRegulado() : null;
        }
        catch (StatusRuntimeException e){
            throw new CopilotoException(e.getStatus().getCode().name());
        }
    }

    private RegulacaoGrpc.RegulacaoBlockingStub criarStub(){
        return RegulacaoGrpc.newBlockingStub(criarCanalDeComunicacao());
    }

    private ManagedChannel criarCanalDeComunicacao(){
        return ManagedChannelBuilder
                        .forAddress(config.getIp(),config.getPorta())
                        .usePlaintext(true)
                        .build();
    }
}
