package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.dsl.CopilotoDSL;

public class TrajetoBuilder {

    private CopilotoDSL dsl;
    private VeiculoBuilder veiculoBuilder;

    public TrajetoBuilder(VeiculoBuilder veiculoBuilder,CopilotoDSL dsl){
        this.dsl = dsl;
        this.veiculoBuilder = veiculoBuilder;
    }

    public VeiculoBuilder comPercentualDeConclusao(Float percentual){
        dsl.getRequest().setPercentualConclusao(percentual);
        return veiculoBuilder;
    }
}
