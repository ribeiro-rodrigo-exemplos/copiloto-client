// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: copiloto.proto

package br.com.m2msolutions.copiloto.grpc;

/**
 * Protobuf type {@code CopilotoResponse}
 */
public  final class CopilotoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CopilotoResponse)
    CopilotoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CopilotoResponse.newBuilder() to construct.
  private CopilotoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CopilotoResponse() {
    minutosAdiantado_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CopilotoResponse(
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

            minutosAdiantado_ = input.readInt32();
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
    return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_CopilotoResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_CopilotoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            br.com.m2msolutions.copiloto.grpc.CopilotoResponse.class, br.com.m2msolutions.copiloto.grpc.CopilotoResponse.Builder.class);
  }

  public static final int MINUTOSADIANTADO_FIELD_NUMBER = 1;
  private int minutosAdiantado_;
  /**
   * <code>int32 minutosAdiantado = 1;</code>
   */
  public int getMinutosAdiantado() {
    return minutosAdiantado_;
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
    if (minutosAdiantado_ != 0) {
      output.writeInt32(1, minutosAdiantado_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minutosAdiantado_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minutosAdiantado_);
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
    if (!(obj instanceof br.com.m2msolutions.copiloto.grpc.CopilotoResponse)) {
      return super.equals(obj);
    }
    br.com.m2msolutions.copiloto.grpc.CopilotoResponse other = (br.com.m2msolutions.copiloto.grpc.CopilotoResponse) obj;

    boolean result = true;
    result = result && (getMinutosAdiantado()
        == other.getMinutosAdiantado());
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
    hash = (37 * hash) + MINUTOSADIANTADO_FIELD_NUMBER;
    hash = (53 * hash) + getMinutosAdiantado();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse parseFrom(
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
  public static Builder newBuilder(br.com.m2msolutions.copiloto.grpc.CopilotoResponse prototype) {
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
   * Protobuf type {@code CopilotoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CopilotoResponse)
      br.com.m2msolutions.copiloto.grpc.CopilotoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_CopilotoResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_CopilotoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              br.com.m2msolutions.copiloto.grpc.CopilotoResponse.class, br.com.m2msolutions.copiloto.grpc.CopilotoResponse.Builder.class);
    }

    // Construct using br.com.m2msolutions.copiloto.grpc.CopilotoResponse.newBuilder()
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
      minutosAdiantado_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoProto.internal_static_CopilotoResponse_descriptor;
    }

    public br.com.m2msolutions.copiloto.grpc.CopilotoResponse getDefaultInstanceForType() {
      return br.com.m2msolutions.copiloto.grpc.CopilotoResponse.getDefaultInstance();
    }

    public br.com.m2msolutions.copiloto.grpc.CopilotoResponse build() {
      br.com.m2msolutions.copiloto.grpc.CopilotoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public br.com.m2msolutions.copiloto.grpc.CopilotoResponse buildPartial() {
      br.com.m2msolutions.copiloto.grpc.CopilotoResponse result = new br.com.m2msolutions.copiloto.grpc.CopilotoResponse(this);
      result.minutosAdiantado_ = minutosAdiantado_;
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
      if (other instanceof br.com.m2msolutions.copiloto.grpc.CopilotoResponse) {
        return mergeFrom((br.com.m2msolutions.copiloto.grpc.CopilotoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(br.com.m2msolutions.copiloto.grpc.CopilotoResponse other) {
      if (other == br.com.m2msolutions.copiloto.grpc.CopilotoResponse.getDefaultInstance()) return this;
      if (other.getMinutosAdiantado() != 0) {
        setMinutosAdiantado(other.getMinutosAdiantado());
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
      br.com.m2msolutions.copiloto.grpc.CopilotoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (br.com.m2msolutions.copiloto.grpc.CopilotoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minutosAdiantado_ ;
    /**
     * <code>int32 minutosAdiantado = 1;</code>
     */
    public int getMinutosAdiantado() {
      return minutosAdiantado_;
    }
    /**
     * <code>int32 minutosAdiantado = 1;</code>
     */
    public Builder setMinutosAdiantado(int value) {
      
      minutosAdiantado_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 minutosAdiantado = 1;</code>
     */
    public Builder clearMinutosAdiantado() {
      
      minutosAdiantado_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CopilotoResponse)
  }

  // @@protoc_insertion_point(class_scope:CopilotoResponse)
  private static final br.com.m2msolutions.copiloto.grpc.CopilotoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new br.com.m2msolutions.copiloto.grpc.CopilotoResponse();
  }

  public static br.com.m2msolutions.copiloto.grpc.CopilotoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopilotoResponse>
      PARSER = new com.google.protobuf.AbstractParser<CopilotoResponse>() {
    public CopilotoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CopilotoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CopilotoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopilotoResponse> getParserForType() {
    return PARSER;
  }

  public br.com.m2msolutions.copiloto.grpc.CopilotoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
