package br.com.m2msolutions.copiloto.client.dsl;

import br.com.m2msolutions.copiloto.client.Copiloto;
import br.com.m2msolutions.copiloto.client.builder.CopilotoConfig;
import br.com.m2msolutions.copiloto.client.dsl.builder.NotificacaoBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.VeiculoBuilder;
import br.com.m2msolutions.copiloto.grpc.NotificacaoRequest;
import br.com.m2msolutions.copiloto.grpc.RegulagemRequest;

public class CopilotoDSL implements Copiloto {

    private RegulagemRequest.Builder request;
    private VeiculoBuilder veiculoBuilder;
    private CopilotoConfig config;

    public CopilotoDSL(CopilotoConfig config){
        this.config = config;
        request = RegulagemRequest.newBuilder();
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

    public RegulagemRequest.Builder getRequest(){
        return request;
    }

    public Boolean notificar(Integer idCliente, Integer idVeiculo, String idLinha, String idTrajeto,
                             Long tempoRegulado) {

        NotificacaoRequest.Builder builder = NotificacaoRequest.newBuilder();
        builder.setIdCliente(idCliente);
        builder.setIdVeiculo(idVeiculo);
        builder.setIdLinha(idLinha);
        builder.setIdTrajeto(idTrajeto);
        builder.setTempoRegulado(tempoRegulado);

        return new NotificacaoBuilder(builder,config).notificar();
    }
}
