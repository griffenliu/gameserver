// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BseOnlineFrd.proto

package com.xinqihd.sns.gameserver.proto;

public final class XinqiBseOnlineFrd {
  private XinqiBseOnlineFrd() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BseOnlineFrdOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated string frdId = 1;
    java.util.List<String> getFrdIdList();
    int getFrdIdCount();
    String getFrdId(int index);
    
    // repeated string frdName = 2;
    java.util.List<String> getFrdNameList();
    int getFrdNameCount();
    String getFrdName(int index);
    
    // repeated int32 level = 3;
    java.util.List<java.lang.Integer> getLevelList();
    int getLevelCount();
    int getLevel(int index);
    
    // repeated int32 wincount = 4;
    java.util.List<java.lang.Integer> getWincountList();
    int getWincountCount();
    int getWincount(int index);
    
    // repeated int32 totalcount = 5;
    java.util.List<java.lang.Integer> getTotalcountList();
    int getTotalcountCount();
    int getTotalcount(int index);
  }
  public static final class BseOnlineFrd extends
      com.google.protobuf.GeneratedMessage
      implements BseOnlineFrdOrBuilder {
    // Use BseOnlineFrd.newBuilder() to construct.
    private BseOnlineFrd(Builder builder) {
      super(builder);
    }
    private BseOnlineFrd(boolean noInit) {}
    
    private static final BseOnlineFrd defaultInstance;
    public static BseOnlineFrd getDefaultInstance() {
      return defaultInstance;
    }
    
    public BseOnlineFrd getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_fieldAccessorTable;
    }
    
    // repeated string frdId = 1;
    public static final int FRDID_FIELD_NUMBER = 1;
    private com.google.protobuf.LazyStringList frdId_;
    public java.util.List<String>
        getFrdIdList() {
      return frdId_;
    }
    public int getFrdIdCount() {
      return frdId_.size();
    }
    public String getFrdId(int index) {
      return frdId_.get(index);
    }
    
    // repeated string frdName = 2;
    public static final int FRDNAME_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList frdName_;
    public java.util.List<String>
        getFrdNameList() {
      return frdName_;
    }
    public int getFrdNameCount() {
      return frdName_.size();
    }
    public String getFrdName(int index) {
      return frdName_.get(index);
    }
    
    // repeated int32 level = 3;
    public static final int LEVEL_FIELD_NUMBER = 3;
    private java.util.List<java.lang.Integer> level_;
    public java.util.List<java.lang.Integer>
        getLevelList() {
      return level_;
    }
    public int getLevelCount() {
      return level_.size();
    }
    public int getLevel(int index) {
      return level_.get(index);
    }
    
    // repeated int32 wincount = 4;
    public static final int WINCOUNT_FIELD_NUMBER = 4;
    private java.util.List<java.lang.Integer> wincount_;
    public java.util.List<java.lang.Integer>
        getWincountList() {
      return wincount_;
    }
    public int getWincountCount() {
      return wincount_.size();
    }
    public int getWincount(int index) {
      return wincount_.get(index);
    }
    
    // repeated int32 totalcount = 5;
    public static final int TOTALCOUNT_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> totalcount_;
    public java.util.List<java.lang.Integer>
        getTotalcountList() {
      return totalcount_;
    }
    public int getTotalcountCount() {
      return totalcount_.size();
    }
    public int getTotalcount(int index) {
      return totalcount_.get(index);
    }
    
    private void initFields() {
      frdId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      frdName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      level_ = java.util.Collections.emptyList();;
      wincount_ = java.util.Collections.emptyList();;
      totalcount_ = java.util.Collections.emptyList();;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < frdId_.size(); i++) {
        output.writeBytes(1, frdId_.getByteString(i));
      }
      for (int i = 0; i < frdName_.size(); i++) {
        output.writeBytes(2, frdName_.getByteString(i));
      }
      for (int i = 0; i < level_.size(); i++) {
        output.writeInt32(3, level_.get(i));
      }
      for (int i = 0; i < wincount_.size(); i++) {
        output.writeInt32(4, wincount_.get(i));
      }
      for (int i = 0; i < totalcount_.size(); i++) {
        output.writeInt32(5, totalcount_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < frdId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(frdId_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFrdIdList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < frdName_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(frdName_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFrdNameList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < level_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(level_.get(i));
        }
        size += dataSize;
        size += 1 * getLevelList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < wincount_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(wincount_.get(i));
        }
        size += dataSize;
        size += 1 * getWincountList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < totalcount_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(totalcount_.get(i));
        }
        size += dataSize;
        size += 1 * getTotalcountList().size();
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
    
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseDelimitedFrom(
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
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd prototype) {
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
       implements com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrdOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_fieldAccessorTable;
      }
      
      // Construct using com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.newBuilder()
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
        frdId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        frdName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        wincount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000008);
        totalcount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.getDescriptor();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd getDefaultInstanceForType() {
        return com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.getDefaultInstance();
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd build() {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd buildPartial() {
        com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd result = new com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          frdId_ = new com.google.protobuf.UnmodifiableLazyStringList(
              frdId_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.frdId_ = frdId_;
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          frdName_ = new com.google.protobuf.UnmodifiableLazyStringList(
              frdName_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.frdName_ = frdName_;
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          level_ = java.util.Collections.unmodifiableList(level_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.level_ = level_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          wincount_ = java.util.Collections.unmodifiableList(wincount_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.wincount_ = wincount_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          totalcount_ = java.util.Collections.unmodifiableList(totalcount_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.totalcount_ = totalcount_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd) {
          return mergeFrom((com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd other) {
        if (other == com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.getDefaultInstance()) return this;
        if (!other.frdId_.isEmpty()) {
          if (frdId_.isEmpty()) {
            frdId_ = other.frdId_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFrdIdIsMutable();
            frdId_.addAll(other.frdId_);
          }
          onChanged();
        }
        if (!other.frdName_.isEmpty()) {
          if (frdName_.isEmpty()) {
            frdName_ = other.frdName_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFrdNameIsMutable();
            frdName_.addAll(other.frdName_);
          }
          onChanged();
        }
        if (!other.level_.isEmpty()) {
          if (level_.isEmpty()) {
            level_ = other.level_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureLevelIsMutable();
            level_.addAll(other.level_);
          }
          onChanged();
        }
        if (!other.wincount_.isEmpty()) {
          if (wincount_.isEmpty()) {
            wincount_ = other.wincount_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureWincountIsMutable();
            wincount_.addAll(other.wincount_);
          }
          onChanged();
        }
        if (!other.totalcount_.isEmpty()) {
          if (totalcount_.isEmpty()) {
            totalcount_ = other.totalcount_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureTotalcountIsMutable();
            totalcount_.addAll(other.totalcount_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              ensureFrdIdIsMutable();
              frdId_.add(input.readBytes());
              break;
            }
            case 18: {
              ensureFrdNameIsMutable();
              frdName_.add(input.readBytes());
              break;
            }
            case 24: {
              ensureLevelIsMutable();
              level_.add(input.readInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addLevel(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 32: {
              ensureWincountIsMutable();
              wincount_.add(input.readInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addWincount(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 40: {
              ensureTotalcountIsMutable();
              totalcount_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              while (input.getBytesUntilLimit() > 0) {
                addTotalcount(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated string frdId = 1;
      private com.google.protobuf.LazyStringList frdId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFrdIdIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          frdId_ = new com.google.protobuf.LazyStringArrayList(frdId_);
          bitField0_ |= 0x00000001;
         }
      }
      public java.util.List<String>
          getFrdIdList() {
        return java.util.Collections.unmodifiableList(frdId_);
      }
      public int getFrdIdCount() {
        return frdId_.size();
      }
      public String getFrdId(int index) {
        return frdId_.get(index);
      }
      public Builder setFrdId(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFrdIdIsMutable();
        frdId_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addFrdId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFrdIdIsMutable();
        frdId_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllFrdId(
          java.lang.Iterable<String> values) {
        ensureFrdIdIsMutable();
        super.addAll(values, frdId_);
        onChanged();
        return this;
      }
      public Builder clearFrdId() {
        frdId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      void addFrdId(com.google.protobuf.ByteString value) {
        ensureFrdIdIsMutable();
        frdId_.add(value);
        onChanged();
      }
      
      // repeated string frdName = 2;
      private com.google.protobuf.LazyStringList frdName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFrdNameIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          frdName_ = new com.google.protobuf.LazyStringArrayList(frdName_);
          bitField0_ |= 0x00000002;
         }
      }
      public java.util.List<String>
          getFrdNameList() {
        return java.util.Collections.unmodifiableList(frdName_);
      }
      public int getFrdNameCount() {
        return frdName_.size();
      }
      public String getFrdName(int index) {
        return frdName_.get(index);
      }
      public Builder setFrdName(
          int index, String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFrdNameIsMutable();
        frdName_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addFrdName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFrdNameIsMutable();
        frdName_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllFrdName(
          java.lang.Iterable<String> values) {
        ensureFrdNameIsMutable();
        super.addAll(values, frdName_);
        onChanged();
        return this;
      }
      public Builder clearFrdName() {
        frdName_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      void addFrdName(com.google.protobuf.ByteString value) {
        ensureFrdNameIsMutable();
        frdName_.add(value);
        onChanged();
      }
      
      // repeated int32 level = 3;
      private java.util.List<java.lang.Integer> level_ = java.util.Collections.emptyList();;
      private void ensureLevelIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          level_ = new java.util.ArrayList<java.lang.Integer>(level_);
          bitField0_ |= 0x00000004;
         }
      }
      public java.util.List<java.lang.Integer>
          getLevelList() {
        return java.util.Collections.unmodifiableList(level_);
      }
      public int getLevelCount() {
        return level_.size();
      }
      public int getLevel(int index) {
        return level_.get(index);
      }
      public Builder setLevel(
          int index, int value) {
        ensureLevelIsMutable();
        level_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addLevel(int value) {
        ensureLevelIsMutable();
        level_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllLevel(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureLevelIsMutable();
        super.addAll(values, level_);
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        level_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      
      // repeated int32 wincount = 4;
      private java.util.List<java.lang.Integer> wincount_ = java.util.Collections.emptyList();;
      private void ensureWincountIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          wincount_ = new java.util.ArrayList<java.lang.Integer>(wincount_);
          bitField0_ |= 0x00000008;
         }
      }
      public java.util.List<java.lang.Integer>
          getWincountList() {
        return java.util.Collections.unmodifiableList(wincount_);
      }
      public int getWincountCount() {
        return wincount_.size();
      }
      public int getWincount(int index) {
        return wincount_.get(index);
      }
      public Builder setWincount(
          int index, int value) {
        ensureWincountIsMutable();
        wincount_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addWincount(int value) {
        ensureWincountIsMutable();
        wincount_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllWincount(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureWincountIsMutable();
        super.addAll(values, wincount_);
        onChanged();
        return this;
      }
      public Builder clearWincount() {
        wincount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      
      // repeated int32 totalcount = 5;
      private java.util.List<java.lang.Integer> totalcount_ = java.util.Collections.emptyList();;
      private void ensureTotalcountIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          totalcount_ = new java.util.ArrayList<java.lang.Integer>(totalcount_);
          bitField0_ |= 0x00000010;
         }
      }
      public java.util.List<java.lang.Integer>
          getTotalcountList() {
        return java.util.Collections.unmodifiableList(totalcount_);
      }
      public int getTotalcountCount() {
        return totalcount_.size();
      }
      public int getTotalcount(int index) {
        return totalcount_.get(index);
      }
      public Builder setTotalcount(
          int index, int value) {
        ensureTotalcountIsMutable();
        totalcount_.set(index, value);
        onChanged();
        return this;
      }
      public Builder addTotalcount(int value) {
        ensureTotalcountIsMutable();
        totalcount_.add(value);
        onChanged();
        return this;
      }
      public Builder addAllTotalcount(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTotalcountIsMutable();
        super.addAll(values, totalcount_);
        onChanged();
        return this;
      }
      public Builder clearTotalcount() {
        totalcount_ = java.util.Collections.emptyList();;
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.xinqihd.sns.gameserver.proto.BseOnlineFrd)
    }
    
    static {
      defaultInstance = new BseOnlineFrd(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.xinqihd.sns.gameserver.proto.BseOnlineFrd)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022BseOnlineFrd.proto\022 com.xinqihd.sns.ga" +
      "meserver.proto\"c\n\014BseOnlineFrd\022\r\n\005frdId\030" +
      "\001 \003(\t\022\017\n\007frdName\030\002 \003(\t\022\r\n\005level\030\003 \003(\005\022\020\n" +
      "\010wincount\030\004 \003(\005\022\022\n\ntotalcount\030\005 \003(\005B\023B\021X" +
      "inqiBseOnlineFrd"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_xinqihd_sns_gameserver_proto_BseOnlineFrd_descriptor,
              new java.lang.String[] { "FrdId", "FrdName", "Level", "Wincount", "Totalcount", },
              com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.class,
              com.xinqihd.sns.gameserver.proto.XinqiBseOnlineFrd.BseOnlineFrd.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
