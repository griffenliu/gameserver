// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseBossSync.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseBossSync {
  private XinqiBseBossSync() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseBossSyncOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string bossid = 1;
    boolean hasBossid();
    String getBossid();
    
    // optional bool success = 2;
    boolean hasSuccess();
    boolean getSuccess();
    
    // optional uint32 status = 3;
    boolean hasStatus();
    int getStatus();
    
    // optional uint32 usedtime = 4;
    boolean hasUsedtime();
    int getUsedtime();
    
    // optional uint32 totaltime = 5;
    boolean hasTotaltime();
    int getTotaltime();
    
    // optional uint32 totaluser = 10;
    boolean hasTotaluser();
    int getTotaluser();
    
    // optional uint32 progress = 11;
    boolean hasProgress();
    int getProgress();
    
    // optional uint32 totalprogress = 12;
    boolean hasTotalprogress();
    int getTotalprogress();
  }
  public static final class BseBossSync extends
      com.google.protobuf.GeneratedMessage
      implements BseBossSyncOrBuilder {
    // Use BseBossSync.newBuilder() to construct.
    private BseBossSync(Builder builder) {
      super(builder);
    }
    private BseBossSync(boolean noInit) {}
    
    private static final BseBossSync defaultInstance;
    public static BseBossSync getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseBossSync getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string bossid = 1;
    public static final int BOSSID_FIELD_NUMBER = 1;
    private java.lang.Object bossid_;
    public boolean hasBossid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getBossid() {
      java.lang.Object ref = bossid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          bossid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getBossidBytes() {
      java.lang.Object ref = bossid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        bossid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool success = 2;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private boolean success_;
    public boolean hasSuccess() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public boolean getSuccess() {
      return success_;
    }
    
    // optional uint32 status = 3;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int status_;
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getStatus() {
      return status_;
    }
    
    // optional uint32 usedtime = 4;
    public static final int USEDTIME_FIELD_NUMBER = 4;
    private int usedtime_;
    public boolean hasUsedtime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getUsedtime() {
      return usedtime_;
    }
    
    // optional uint32 totaltime = 5;
    public static final int TOTALTIME_FIELD_NUMBER = 5;
    private int totaltime_;
    public boolean hasTotaltime() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getTotaltime() {
      return totaltime_;
    }
    
    // optional uint32 totaluser = 10;
    public static final int TOTALUSER_FIELD_NUMBER = 10;
    private int totaluser_;
    public boolean hasTotaluser() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getTotaluser() {
      return totaluser_;
    }
    
    // optional uint32 progress = 11;
    public static final int PROGRESS_FIELD_NUMBER = 11;
    private int progress_;
    public boolean hasProgress() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getProgress() {
      return progress_;
    }
    
    // optional uint32 totalprogress = 12;
    public static final int TOTALPROGRESS_FIELD_NUMBER = 12;
    private int totalprogress_;
    public boolean hasTotalprogress() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getTotalprogress() {
      return totalprogress_;
    }
    
    private void initFields() {
      bossid_ = "";
      success_ = false;
      status_ = 0;
      usedtime_ = 0;
      totaltime_ = 0;
      totaluser_ = 0;
      progress_ = 0;
      totalprogress_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasBossid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getBossidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, status_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, usedtime_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, totaltime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt32(10, totaluser_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt32(11, progress_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeUInt32(12, totalprogress_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getBossidBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, success_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, status_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, usedtime_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, totaltime_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, totaluser_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, progress_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, totalprogress_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSyncOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        bossid_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        success_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        status_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        usedtime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        totaltime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        totaluser_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        progress_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        totalprogress_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync result = new com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.bossid_ = bossid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.success_ = success_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.status_ = status_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.usedtime_ = usedtime_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.totaltime_ = totaltime_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.totaluser_ = totaluser_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.progress_ = progress_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.totalprogress_ = totalprogress_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.getDefaultInstance()) return this;
        if (other.hasBossid()) {
          setBossid(other.getBossid());
        }
        if (other.hasSuccess()) {
          setSuccess(other.getSuccess());
        }
        if (other.hasStatus()) {
          setStatus(other.getStatus());
        }
        if (other.hasUsedtime()) {
          setUsedtime(other.getUsedtime());
        }
        if (other.hasTotaltime()) {
          setTotaltime(other.getTotaltime());
        }
        if (other.hasTotaluser()) {
          setTotaluser(other.getTotaluser());
        }
        if (other.hasProgress()) {
          setProgress(other.getProgress());
        }
        if (other.hasTotalprogress()) {
          setTotalprogress(other.getTotalprogress());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasBossid()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              bossid_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              success_ = input.readBool();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              status_ = input.readUInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              usedtime_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              totaltime_ = input.readUInt32();
              break;
            }
            case 80: {
              bitField0_ |= 0x00000020;
              totaluser_ = input.readUInt32();
              break;
            }
            case 88: {
              bitField0_ |= 0x00000040;
              progress_ = input.readUInt32();
              break;
            }
            case 96: {
              bitField0_ |= 0x00000080;
              totalprogress_ = input.readUInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string bossid = 1;
      private java.lang.Object bossid_ = "";
      public boolean hasBossid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getBossid() {
        java.lang.Object ref = bossid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          bossid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setBossid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        bossid_ = value;
        onChanged();
        return this;
      }
      public Builder clearBossid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        bossid_ = getDefaultInstance().getBossid();
        onChanged();
        return this;
      }
      void setBossid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        bossid_ = value;
        onChanged();
      }
      
      // optional bool success = 2;
      private boolean success_ ;
      public boolean hasSuccess() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public boolean getSuccess() {
        return success_;
      }
      public Builder setSuccess(boolean value) {
        bitField0_ |= 0x00000002;
        success_ = value;
        onChanged();
        return this;
      }
      public Builder clearSuccess() {
        bitField0_ = (bitField0_ & ~0x00000002);
        success_ = false;
        onChanged();
        return this;
      }
      
      // optional uint32 status = 3;
      private int status_ ;
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getStatus() {
        return status_;
      }
      public Builder setStatus(int value) {
        bitField0_ |= 0x00000004;
        status_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000004);
        status_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 usedtime = 4;
      private int usedtime_ ;
      public boolean hasUsedtime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getUsedtime() {
        return usedtime_;
      }
      public Builder setUsedtime(int value) {
        bitField0_ |= 0x00000008;
        usedtime_ = value;
        onChanged();
        return this;
      }
      public Builder clearUsedtime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        usedtime_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 totaltime = 5;
      private int totaltime_ ;
      public boolean hasTotaltime() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getTotaltime() {
        return totaltime_;
      }
      public Builder setTotaltime(int value) {
        bitField0_ |= 0x00000010;
        totaltime_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotaltime() {
        bitField0_ = (bitField0_ & ~0x00000010);
        totaltime_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 totaluser = 10;
      private int totaluser_ ;
      public boolean hasTotaluser() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getTotaluser() {
        return totaluser_;
      }
      public Builder setTotaluser(int value) {
        bitField0_ |= 0x00000020;
        totaluser_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotaluser() {
        bitField0_ = (bitField0_ & ~0x00000020);
        totaluser_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 progress = 11;
      private int progress_ ;
      public boolean hasProgress() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getProgress() {
        return progress_;
      }
      public Builder setProgress(int value) {
        bitField0_ |= 0x00000040;
        progress_ = value;
        onChanged();
        return this;
      }
      public Builder clearProgress() {
        bitField0_ = (bitField0_ & ~0x00000040);
        progress_ = 0;
        onChanged();
        return this;
      }
      
      // optional uint32 totalprogress = 12;
      private int totalprogress_ ;
      public boolean hasTotalprogress() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getTotalprogress() {
        return totalprogress_;
      }
      public Builder setTotalprogress(int value) {
        bitField0_ |= 0x00000080;
        totalprogress_ = value;
        onChanged();
        return this;
      }
      public Builder clearTotalprogress() {
        bitField0_ = (bitField0_ & ~0x00000080);
        totalprogress_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseBossSync)
    }
    
    static {
      defaultInstance = new BseBossSync(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseBossSync)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BseBossSync.proto\022 com.xinqihd.sns.gam" +
      "eserver.proto\032\016MailData.proto\"\237\001\n\013BseBos" +
      "sSync\022\016\n\006bossid\030\001 \002(\t\022\017\n\007success\030\002 \001(\010\022\016" +
      "\n\006status\030\003 \001(\r\022\020\n\010usedtime\030\004 \001(\r\022\021\n\ttota" +
      "ltime\030\005 \001(\r\022\021\n\ttotaluser\030\n \001(\r\022\020\n\010progre" +
      "ss\030\013 \001(\r\022\025\n\rtotalprogress\030\014 \001(\rB\022B\020Xinqi" +
      "BseBossSync"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseBossSync_descriptor,
              new java.lang.String[] { "Bossid", "Success", "Status", "Usedtime", "Totaltime", "Totaluser", "Progress", "Totalprogress", },
              com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseBossSync.BseBossSync.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.xinqihd.sns.gameserver.proto.XinqiMailData.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
