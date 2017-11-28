package br.com.m2msolutions.copiloto.client;

import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.VeiculoBuilder;

public interface Copiloto {

    RequestBuilder calcular();
    VeiculoBuilder emViagemComVeiculo(Integer veiculoId);
}
