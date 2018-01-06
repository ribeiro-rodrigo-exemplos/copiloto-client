// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: copiloto.proto

package br.com.m2msolutions.copiloto.grpc;

/**
 * Protobuf type {@code NotificacaoRequest}
 */
public  final class NotificacaoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NotificacaoRequest)
    NotificacaoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NotificacaoRequest.newBuilder() to construct.
  private NotificacaoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NotificacaoRequest() {
    idCliente_ = 0;
    idVeiculo_ = 0;
    idLinha_ = "";
    idTrajeto_ = "";
    tempoRegulado_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NotificacaoRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            idCliente_ = input.readInt32();
            break;
          }
          case 16: {

            idVeiculo_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            idLinha_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            idTrajeto_ = s;
            break;
          }
          case 40: {

            tempoRegulado_ = input.readInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_NotificacaoRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_NotificacaoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.class, br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.Builder.class);
  }

  public static final int IDCLIENTE_FIELD_NUMBER = 1;
  private int idCliente_;
  /**
   * <code>int32 idCliente = 1;</code>
   */
  public int getIdCliente() {
    return idCliente_;
  }

  public static final int IDVEICULO_FIELD_NUMBER = 2;
  private int idVeiculo_;
  /**
   * <code>int32 idVeiculo = 2;</code>
   */
  public int getIdVeiculo() {
    return idVeiculo_;
  }

  public static final int IDLINHA_FIELD_NUMBER = 3;
  private volatile java.lang.Object idLinha_;
  /**
   * <code>string idLinha = 3;</code>
   */
  public java.lang.String getIdLinha() {
    java.lang.Object ref = idLinha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idLinha_ = s;
      return s;
    }
  }
  /**
   * <code>string idLinha = 3;</code>
   */
  public com.google.protobuf.ByteString
      getIdLinhaBytes() {
    java.lang.Object ref = idLinha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idLinha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDTRAJETO_FIELD_NUMBER = 4;
  private volatile java.lang.Object idTrajeto_;
  /**
   * <code>string idTrajeto = 4;</code>
   */
  public java.lang.String getIdTrajeto() {
    java.lang.Object ref = idTrajeto_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      idTrajeto_ = s;
      return s;
    }
  }
  /**
   * <code>string idTrajeto = 4;</code>
   */
  public com.google.protobuf.ByteString
      getIdTrajetoBytes() {
    java.lang.Object ref = idTrajeto_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      idTrajeto_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMPOREGULADO_FIELD_NUMBER = 5;
  private long tempoRegulado_;
  /**
   * <code>int64 tempoRegulado = 5;</code>
   */
  public long getTempoRegulado() {
    return tempoRegulado_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (idCliente_ != 0) {
      output.writeInt32(1, idCliente_);
    }
    if (idVeiculo_ != 0) {
      output.writeInt32(2, idVeiculo_);
    }
    if (!getIdLinhaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, idLinha_);
    }
    if (!getIdTrajetoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, idTrajeto_);
    }
    if (tempoRegulado_ != 0L) {
      output.writeInt64(5, tempoRegulado_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (idCliente_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, idCliente_);
    }
    if (idVeiculo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, idVeiculo_);
    }
    if (!getIdLinhaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, idLinha_);
    }
    if (!getIdTrajetoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, idTrajeto_);
    }
    if (tempoRegulado_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, tempoRegulado_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof br.com.m2msolutions.copiloto.grpc.NotificacaoRequest)) {
      return super.equals(obj);
    }
    br.com.m2msolutions.copiloto.grpc.NotificacaoRequest other = (br.com.m2msolutions.copiloto.grpc.NotificacaoRequest) obj;

    boolean result = true;
    result = result && (getIdCliente()
        == other.getIdCliente());
    result = result && (getIdVeiculo()
        == other.getIdVeiculo());
    result = result && getIdLinha()
        .equals(other.getIdLinha());
    result = result && getIdTrajeto()
        .equals(other.getIdTrajeto());
    result = result && (getTempoRegulado()
        == other.getTempoRegulado());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + IDCLIENTE_FIELD_NUMBER;
    hash = (53 * hash) + getIdCliente();
    hash = (37 * hash) + IDVEICULO_FIELD_NUMBER;
    hash = (53 * hash) + getIdVeiculo();
    hash = (37 * hash) + IDLINHA_FIELD_NUMBER;
    hash = (53 * hash) + getIdLinha().hashCode();
    hash = (37 * hash) + IDTRAJETO_FIELD_NUMBER;
    hash = (53 * hash) + getIdTrajeto().hashCode();
    hash = (37 * hash) + TEMPOREGULADO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTempoRegulado());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(br.com.m2msolutions.copiloto.grpc.NotificacaoRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code NotificacaoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NotificacaoRequest)
      br.com.m2msolutions.copiloto.grpc.NotificacaoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_NotificacaoRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_NotificacaoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.class, br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.Builder.class);
    }

    // Construct using br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      idCliente_ = 0;

      idVeiculo_ = 0;

      idLinha_ = "";

      idTrajeto_ = "";

      tempoRegulado_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_NotificacaoRequest_descriptor;
    }

    public br.com.m2msolutions.copiloto.grpc.NotificacaoRequest getDefaultInstanceForType() {
      return br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.getDefaultInstance();
    }

    public br.com.m2msolutions.copiloto.grpc.NotificacaoRequest build() {
      br.com.m2msolutions.copiloto.grpc.NotificacaoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public br.com.m2msolutions.copiloto.grpc.NotificacaoRequest buildPartial() {
      br.com.m2msolutions.copiloto.grpc.NotificacaoRequest result = new br.com.m2msolutions.copiloto.grpc.NotificacaoRequest(this);
      result.idCliente_ = idCliente_;
      result.idVeiculo_ = idVeiculo_;
      result.idLinha_ = idLinha_;
      result.idTrajeto_ = idTrajeto_;
      result.tempoRegulado_ = tempoRegulado_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof br.com.m2msolutions.copiloto.grpc.NotificacaoRequest) {
        return mergeFrom((br.com.m2msolutions.copiloto.grpc.NotificacaoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.m2msolutions.copiloto.grpc.NotificacaoRequest other) {
      if (other == br.com.m2msolutions.copiloto.grpc.NotificacaoRequest.getDefaultInstance()) return this;
      if (other.getIdCliente() != 0) {
        setIdCliente(other.getIdCliente());
      }
      if (other.getIdVeiculo() != 0) {
        setIdVeiculo(other.getIdVeiculo());
      }
      if (!other.getIdLinha().isEmpty()) {
        idLinha_ = other.idLinha_;
        onChanged();
      }
      if (!other.getIdTrajeto().isEmpty()) {
        idTrajeto_ = other.idTrajeto_;
        onChanged();
      }
      if (other.getTempoRegulado() != 0L) {
        setTempoRegulado(other.getTempoRegulado());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      br.com.m2msolutions.copiloto.grpc.NotificacaoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.m2msolutions.copiloto.grpc.NotificacaoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int idCliente_ ;
    /**
     * <code>int32 idCliente = 1;</code>
     */
    public int getIdCliente() {
      return idCliente_;
    }
    /**
     * <code>int32 idCliente = 1;</code>
     */
    public Builder setIdCliente(int value) {
      
      idCliente_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idCliente = 1;</code>
     */
    public Builder clearIdCliente() {
      
      idCliente_ = 0;
      onChanged();
      return this;
    }

    private int idVeiculo_ ;
    /**
     * <code>int32 idVeiculo = 2;</code>
     */
    public int getIdVeiculo() {
      return idVeiculo_;
    }
    /**
     * <code>int32 idVeiculo = 2;</code>
     */
    public Builder setIdVeiculo(int value) {
      
      idVeiculo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idVeiculo = 2;</code>
     */
    public Builder clearIdVeiculo() {
      
      idVeiculo_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object idLinha_ = "";
    /**
     * <code>string idLinha = 3;</code>
     */
    public java.lang.String getIdLinha() {
      java.lang.Object ref = idLinha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idLinha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idLinha = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIdLinhaBytes() {
      java.lang.Object ref = idLinha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idLinha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idLinha = 3;</code>
     */
    public Builder setIdLinha(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idLinha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idLinha = 3;</code>
     */
    public Builder clearIdLinha() {
      
      idLinha_ = getDefaultInstance().getIdLinha();
      onChanged();
      return this;
    }
    /**
     * <code>string idLinha = 3;</code>
     */
    public Builder setIdLinhaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idLinha_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object idTrajeto_ = "";
    /**
     * <code>string idTrajeto = 4;</code>
     */
    public java.lang.String getIdTrajeto() {
      java.lang.Object ref = idTrajeto_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        idTrajeto_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string idTrajeto = 4;</code>
     */
    public com.google.protobuf.ByteString
        getIdTrajetoBytes() {
      java.lang.Object ref = idTrajeto_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        idTrajeto_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string idTrajeto = 4;</code>
     */
    public Builder setIdTrajeto(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      idTrajeto_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string idTrajeto = 4;</code>
     */
    public Builder clearIdTrajeto() {
      
      idTrajeto_ = getDefaultInstance().getIdTrajeto();
      onChanged();
      return this;
    }
    /**
     * <code>string idTrajeto = 4;</code>
     */
    public Builder setIdTrajetoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      idTrajeto_ = value;
      onChanged();
      return this;
    }

    private long tempoRegulado_ ;
    /**
     * <code>int64 tempoRegulado = 5;</code>
     */
    public long getTempoRegulado() {
      return tempoRegulado_;
    }
    /**
     * <code>int64 tempoRegulado = 5;</code>
     */
    public Builder setTempoRegulado(long value) {
      
      tempoRegulado_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 tempoRegulado = 5;</code>
     */
    public Builder clearTempoRegulado() {
      
      tempoRegulado_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:NotificacaoRequest)
  }

  // @@protoc_insertion_point(class_scope:NotificacaoRequest)
  private static final br.com.m2msolutions.copiloto.grpc.NotificacaoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.m2msolutions.copiloto.grpc.NotificacaoRequest();
  }

  public static br.com.m2msolutions.copiloto.grpc.NotificacaoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NotificacaoRequest>
      PARSER = new com.google.protobuf.AbstractParser<NotificacaoRequest>() {
    public NotificacaoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new NotificacaoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NotificacaoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NotificacaoRequest> getParserForType() {
    return PARSER;
  }

  public br.com.m2msolutions.copiloto.grpc.NotificacaoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
