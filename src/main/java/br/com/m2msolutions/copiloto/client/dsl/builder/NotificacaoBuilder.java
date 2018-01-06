package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.CopilotoException;
import br.com.m2msolutions.copiloto.client.builder.CopilotoConfig;
import br.com.m2msolutions.copiloto.grpc.NotificacaoGrpc;
import br.com.m2msolutions.copiloto.grpc.NotificacaoRequest;
import br.com.m2msolutions.copiloto.grpc.NotificacaoResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class NotificacaoBuilder {
    private CopilotoConfig config;
    private NotificacaoRequest.Builder builder;

    public NotificacaoBuilder(NotificacaoRequest.Builder builder,CopilotoConfig config){
        this.config = config;
        this.builder = builder;
    }

    public Boolean notificar(){

        try{

            NotificacaoGrpc.NotificacaoBlockingStub stub = criarStub();
            NotificacaoResponse response = stub.notificar(builder.build());
            return response.getNotificacaoEnviada();
        }
        catch (StatusRuntimeException e){
            throw new CopilotoException(e.getStatus().getCode().name());
        }
    }

    private NotificacaoGrpc.NotificacaoBlockingStub criarStub(){
        return NotificacaoGrpc.newBlockingStub(criarCanalDeComunicacao());
    }

    private ManagedChannel criarCanalDeComunicacao(){
        return ManagedChannelBuilder
                        .forAddress(config.getIp(),config.getPorta())
                        .usePlaintext(true)
                        .build();
    }
}
