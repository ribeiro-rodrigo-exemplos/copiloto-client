package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.dsl.CopilotoDSL;

public class ViagemBuilder {

    private CopilotoDSL dsl;
    private VeiculoBuilder veiculoBuilder;

    public ViagemBuilder(CopilotoDSL dsl){
        this.dsl = dsl;
        veiculoBuilder = new VeiculoBuilder(dsl);
    }

    public VeiculoBuilder comVeiculo(Integer idVeiculo){
        dsl.getRequest().setIdVeiculo(idVeiculo);
        return veiculoBuilder;
    }
}
