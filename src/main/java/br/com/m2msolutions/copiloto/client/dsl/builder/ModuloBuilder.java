package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.dsl.CopilotoDSL;

public class ModuloBuilder {

    private VeiculoBuilder veiculoBuilder;
    private CopilotoDSL dsl;

    public ModuloBuilder(VeiculoBuilder veiculoBuilder,CopilotoDSL dsl){
        this.veiculoBuilder = veiculoBuilder;
        this.dsl = dsl;
    }

    public ModuloBuilder.IndetificadorModuloBuilder modelo(String modelo){
        dsl.getRequest().setModeloModulo(modelo);
        return new ModuloBuilder.IndetificadorModuloBuilder();
    }

    public class IndetificadorModuloBuilder{
        public VeiculoBuilder identificador(String identificador){
            dsl.getRequest().setIdentificadorModulo(identificador);
            return veiculoBuilder;
        }
    }
}
