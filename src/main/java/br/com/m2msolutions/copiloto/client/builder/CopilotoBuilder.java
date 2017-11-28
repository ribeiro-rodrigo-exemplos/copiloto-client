package br.com.m2msolutions.copiloto.client.builder;

import br.com.m2msolutions.copiloto.client.Copiloto;
import br.com.m2msolutions.copiloto.client.dsl.CopilotoDSL;

public abstract class CopilotoBuilder {

    public static Copiloto build(String ip,Integer porta){
        return new CopilotoDSL(new CopilotoConfig(ip,porta));
    }
}
