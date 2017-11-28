package br.com.m2msolutions.copiloto.client.dsl.builder;

import br.com.m2msolutions.copiloto.client.dsl.CopilotoDSL;
import java.util.Date;

public class VeiculoBuilder {

    private CopilotoDSL dsl;
    private TrajetoBuilder trajetoBuilder;
    private ModuloBuilder moduloBuilder;

    public VeiculoBuilder(CopilotoDSL dsl){

        this.dsl = dsl;
        trajetoBuilder = new TrajetoBuilder(this,dsl);
        moduloBuilder = new ModuloBuilder(this,dsl);
    }

    public VeiculoBuilder naLinha(String linhaId){
        dsl.getRequest().setIdLinha(linhaId);
        return this;
    }

    public VeiculoBuilder doCliente(Integer clienteId){
        dsl.getRequest().setIdCliente(clienteId);
        return this;
    }

    public TrajetoBuilder noTrajeto(String trajetoId){
        dsl.getRequest().setIdTrajeto(trajetoId);
        return trajetoBuilder;
    }

    public ModuloBuilder comModulo(){
        return moduloBuilder;
    }

    public RequestBuilder calcular(){
        return dsl.calcular();
    }

    public VeiculoBuilder transmitiuEm(Date dataHoraTransmissao){
        dsl.getRequest().setDataHoraTransmissao(dataHoraTransmissao.getTime());
        return this;
    }
}
