// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: copiloto.proto

package br.com.m2msolutions.copiloto.grpc;

public interface NotificacaoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:NotificacaoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 idCliente = 1;</code>
   */
  int getIdCliente();

  /**
   * <code>int32 idVeiculo = 2;</code>
   */
  int getIdVeiculo();

  /**
   * <code>string idLinha = 3;</code>
   */
  java.lang.String getIdLinha();
  /**
   * <code>string idLinha = 3;</code>
   */
  com.google.protobuf.ByteString
      getIdLinhaBytes();

  /**
   * <code>string idTrajeto = 4;</code>
   */
  java.lang.String getIdTrajeto();
  /**
   * <code>string idTrajeto = 4;</code>
   */
  com.google.protobuf.ByteString
      getIdTrajetoBytes();

  /**
   * <code>int64 tempoRegulado = 5;</code>
   */
  long getTempoRegulado();

  /**
   * <code>int64 distribuicao = 6;</code>
   */
  long getDistribuicao();
}
