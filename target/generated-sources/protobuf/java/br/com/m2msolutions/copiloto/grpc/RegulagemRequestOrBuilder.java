// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: copiloto.proto

package br.com.m2msolutions.copiloto.grpc;

public interface RegulagemRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RegulagemRequest)
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
   * <code>string idViagem = 3;</code>
   */
  java.lang.String getIdViagem();
  /**
   * <code>string idViagem = 3;</code>
   */
  com.google.protobuf.ByteString
      getIdViagemBytes();

  /**
   * <code>string idLinha = 4;</code>
   */
  java.lang.String getIdLinha();
  /**
   * <code>string idLinha = 4;</code>
   */
  com.google.protobuf.ByteString
      getIdLinhaBytes();

  /**
   * <code>string idTrajeto = 5;</code>
   */
  java.lang.String getIdTrajeto();
  /**
   * <code>string idTrajeto = 5;</code>
   */
  com.google.protobuf.ByteString
      getIdTrajetoBytes();

  /**
   * <code>string modeloModulo = 6;</code>
   */
  java.lang.String getModeloModulo();
  /**
   * <code>string modeloModulo = 6;</code>
   */
  com.google.protobuf.ByteString
      getModeloModuloBytes();

  /**
   * <code>string identificadorModulo = 7;</code>
   */
  java.lang.String getIdentificadorModulo();
  /**
   * <code>string identificadorModulo = 7;</code>
   */
  com.google.protobuf.ByteString
      getIdentificadorModuloBytes();

  /**
   * <code>int64 dataHoraTransmissao = 8;</code>
   */
  long getDataHoraTransmissao();

  /**
   * <code>float percentualConclusao = 9;</code>
   */
  float getPercentualConclusao();
}
