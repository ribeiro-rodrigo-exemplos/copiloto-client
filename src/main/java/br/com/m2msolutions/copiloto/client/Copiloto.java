package br.com.m2msolutions.copiloto.client;

import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.VeiculoBuilder;

public interface Copiloto {

    RequestBuilder calcular();
    Boolean notificar(Integer idCliente, Integer idVeiculo, String idLinha, String idTrajeto,
                      Long tempoRegulado,Long distribuicao);
    VeiculoBuilder emViagemComVeiculo(Integer veiculoId);
}
