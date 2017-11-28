package br.com.m2msolutions.copiloto.client.builder;

public class CopilotoConfig {

    private String ip;
    private Integer porta;

    CopilotoConfig(String ip,Integer porta){
        this.ip = ip;
        this.porta = porta;
    }

    public String getIp() {
        return ip;
    }

    public Integer getPorta() {
        return porta;
    }

}
