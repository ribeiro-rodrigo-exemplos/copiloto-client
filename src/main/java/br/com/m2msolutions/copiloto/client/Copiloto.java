package br.com.m2msolutions.copiloto.client;

import br.com.m2msolutions.copiloto.client.dsl.builder.RequestBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.VeiculoBuilder;
import br.com.m2msolutions.copiloto.client.dsl.builder.ViagemBuilder;

public interface Copiloto {

    RequestBuilder calcular();
    ViagemBuilder emViagem(String viagemId);
}
