package mediapipe;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class PacketFactory {

    public interface PacketFactoryConfigOrBuilder extends MessageLiteOrBuilder {
        String getExternalOutput();

        ByteString getExternalOutputBytes();

        PacketFactoryOptions getOptions();

        String getOutputSidePacket();

        ByteString getOutputSidePacketBytes();

        String getPacketFactory();

        ByteString getPacketFactoryBytes();

        boolean hasExternalOutput();

        boolean hasOptions();

        boolean hasOutputSidePacket();

        boolean hasPacketFactory();
    }

    public interface PacketFactoryOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<PacketFactoryOptions, PacketFactoryOptions.Builder> {
    }

    public interface PacketManagerConfigOrBuilder extends MessageLiteOrBuilder {
        PacketFactoryConfig getPacket(int i);

        int getPacketCount();

        List<PacketFactoryConfig> getPacketList();
    }

    private PacketFactory() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class PacketFactoryOptions extends GeneratedMessageLite.ExtendableMessage<PacketFactoryOptions, PacketFactoryOptions.Builder> implements PacketFactoryOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final PacketFactoryOptions DEFAULT_INSTANCE;
        private static volatile Parser<PacketFactoryOptions> PARSER;
        private byte memoizedIsInitialized = 2;

        private PacketFactoryOptions() {
        }

        public static PacketFactoryOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryOptions parseFrom(InputStream input) throws IOException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketFactoryOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketFactoryOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketFactoryOptions parseFrom(CodedInputStream input) throws IOException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketFactoryOptions prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PacketFactoryOptions, Builder> implements PacketFactoryOptionsOrBuilder {
            private Builder() {
                super(PacketFactoryOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketFactoryOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketFactoryOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PacketFactoryOptions.class) {
                        try {
                            Parser<PacketFactoryOptions> parser2 = PARSER;
                            if (parser2 == null) {
                                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                try {
                                    PARSER = defaultInstanceBasedParser;
                                    parser2 = defaultInstanceBasedParser;
                                } catch (Throwable th) {
                                    th = th;
                                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                                    throw th;
                                }
                            }
                            return parser2;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PacketFactoryOptions defaultInstance = new PacketFactoryOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketFactoryOptions.class, defaultInstance);
        }

        public static PacketFactoryOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketFactoryOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class PacketFactoryConfig extends GeneratedMessageLite<PacketFactoryConfig, PacketFactoryConfig.Builder> implements PacketFactoryConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final PacketFactoryConfig DEFAULT_INSTANCE;
        public static final int EXTERNAL_OUTPUT_FIELD_NUMBER = 1002;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static final int OUTPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        public static final int PACKET_FACTORY_FIELD_NUMBER = 1;
        private static volatile Parser<PacketFactoryConfig> PARSER;
        private int bitField0_;
        private String externalOutput_ = "";
        private byte memoizedIsInitialized = 2;
        private PacketFactoryOptions options_;
        private String outputSidePacket_ = "";
        private String packetFactory_ = "";

        private PacketFactoryConfig() {
        }

        public boolean hasPacketFactory() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getPacketFactory() {
            return this.packetFactory_;
        }

        public ByteString getPacketFactoryBytes() {
            return ByteString.copyFromUtf8(this.packetFactory_);
        }

        /* access modifiers changed from: private */
        public void setPacketFactory(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.packetFactory_ = value;
        }

        /* access modifiers changed from: private */
        public void clearPacketFactory() {
            this.bitField0_ &= -2;
            this.packetFactory_ = getDefaultInstance().getPacketFactory();
        }

        /* access modifiers changed from: private */
        public void setPacketFactoryBytes(ByteString value) {
            this.packetFactory_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasOutputSidePacket() {
            return (this.bitField0_ & 2) != 0;
        }

        public String getOutputSidePacket() {
            return this.outputSidePacket_;
        }

        public ByteString getOutputSidePacketBytes() {
            return ByteString.copyFromUtf8(this.outputSidePacket_);
        }

        /* access modifiers changed from: private */
        public void setOutputSidePacket(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.outputSidePacket_ = value;
        }

        /* access modifiers changed from: private */
        public void clearOutputSidePacket() {
            this.bitField0_ &= -3;
            this.outputSidePacket_ = getDefaultInstance().getOutputSidePacket();
        }

        /* access modifiers changed from: private */
        public void setOutputSidePacketBytes(ByteString value) {
            this.outputSidePacket_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public boolean hasExternalOutput() {
            return (this.bitField0_ & 4) != 0;
        }

        public String getExternalOutput() {
            return this.externalOutput_;
        }

        public ByteString getExternalOutputBytes() {
            return ByteString.copyFromUtf8(this.externalOutput_);
        }

        /* access modifiers changed from: private */
        public void setExternalOutput(String value) {
            value.getClass();
            this.bitField0_ |= 4;
            this.externalOutput_ = value;
        }

        /* access modifiers changed from: private */
        public void clearExternalOutput() {
            this.bitField0_ &= -5;
            this.externalOutput_ = getDefaultInstance().getExternalOutput();
        }

        /* access modifiers changed from: private */
        public void setExternalOutputBytes(ByteString value) {
            this.externalOutput_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 8) != 0;
        }

        public PacketFactoryOptions getOptions() {
            return this.options_ == null ? PacketFactoryOptions.getDefaultInstance() : this.options_;
        }

        /* access modifiers changed from: private */
        public void setOptions(PacketFactoryOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(PacketFactoryOptions value) {
            value.getClass();
            if (this.options_ == null || this.options_ == PacketFactoryOptions.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = (PacketFactoryOptions) ((PacketFactoryOptions.Builder) PacketFactoryOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -9;
        }

        public static PacketFactoryConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketFactoryConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketFactoryConfig parseFrom(InputStream input) throws IOException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketFactoryConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketFactoryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketFactoryConfig parseFrom(CodedInputStream input) throws IOException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketFactoryConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketFactoryConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketFactoryConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PacketFactoryConfig, Builder> implements PacketFactoryConfigOrBuilder {
            private Builder() {
                super(PacketFactoryConfig.DEFAULT_INSTANCE);
            }

            public boolean hasPacketFactory() {
                return ((PacketFactoryConfig) this.instance).hasPacketFactory();
            }

            public String getPacketFactory() {
                return ((PacketFactoryConfig) this.instance).getPacketFactory();
            }

            public ByteString getPacketFactoryBytes() {
                return ((PacketFactoryConfig) this.instance).getPacketFactoryBytes();
            }

            public Builder setPacketFactory(String value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setPacketFactory(value);
                return this;
            }

            public Builder clearPacketFactory() {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).clearPacketFactory();
                return this;
            }

            public Builder setPacketFactoryBytes(ByteString value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setPacketFactoryBytes(value);
                return this;
            }

            public boolean hasOutputSidePacket() {
                return ((PacketFactoryConfig) this.instance).hasOutputSidePacket();
            }

            public String getOutputSidePacket() {
                return ((PacketFactoryConfig) this.instance).getOutputSidePacket();
            }

            public ByteString getOutputSidePacketBytes() {
                return ((PacketFactoryConfig) this.instance).getOutputSidePacketBytes();
            }

            public Builder setOutputSidePacket(String value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setOutputSidePacket(value);
                return this;
            }

            public Builder clearOutputSidePacket() {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).clearOutputSidePacket();
                return this;
            }

            public Builder setOutputSidePacketBytes(ByteString value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setOutputSidePacketBytes(value);
                return this;
            }

            public boolean hasExternalOutput() {
                return ((PacketFactoryConfig) this.instance).hasExternalOutput();
            }

            public String getExternalOutput() {
                return ((PacketFactoryConfig) this.instance).getExternalOutput();
            }

            public ByteString getExternalOutputBytes() {
                return ((PacketFactoryConfig) this.instance).getExternalOutputBytes();
            }

            public Builder setExternalOutput(String value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setExternalOutput(value);
                return this;
            }

            public Builder clearExternalOutput() {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).clearExternalOutput();
                return this;
            }

            public Builder setExternalOutputBytes(ByteString value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setExternalOutputBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((PacketFactoryConfig) this.instance).hasOptions();
            }

            public PacketFactoryOptions getOptions() {
                return ((PacketFactoryConfig) this.instance).getOptions();
            }

            public Builder setOptions(PacketFactoryOptions value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(PacketFactoryOptions.Builder builderForValue) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).setOptions((PacketFactoryOptions) builderForValue.build());
                return this;
            }

            public Builder mergeOptions(PacketFactoryOptions value) {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((PacketFactoryConfig) this.instance).clearOptions();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketFactoryConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003Љ\u0003Ϫ\b\u0002", new Object[]{"bitField0_", "packetFactory_", "outputSidePacket_", "options_", "externalOutput_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketFactoryConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PacketFactoryConfig.class) {
                        try {
                            Parser<PacketFactoryConfig> parser2 = PARSER;
                            if (parser2 == null) {
                                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                try {
                                    PARSER = defaultInstanceBasedParser;
                                    parser2 = defaultInstanceBasedParser;
                                } catch (Throwable th) {
                                    th = th;
                                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                                    throw th;
                                }
                            }
                            return parser2;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    if (arg0 != null) {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PacketFactoryConfig defaultInstance = new PacketFactoryConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketFactoryConfig.class, defaultInstance);
        }

        public static PacketFactoryConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketFactoryConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class PacketManagerConfig extends GeneratedMessageLite<PacketManagerConfig, PacketManagerConfig.Builder> implements PacketManagerConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final PacketManagerConfig DEFAULT_INSTANCE;
        public static final int PACKET_FIELD_NUMBER = 1;
        private static volatile Parser<PacketManagerConfig> PARSER;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<PacketFactoryConfig> packet_ = emptyProtobufList();

        private PacketManagerConfig() {
        }

        public List<PacketFactoryConfig> getPacketList() {
            return this.packet_;
        }

        public List<? extends PacketFactoryConfigOrBuilder> getPacketOrBuilderList() {
            return this.packet_;
        }

        public int getPacketCount() {
            return this.packet_.size();
        }

        public PacketFactoryConfig getPacket(int index) {
            return (PacketFactoryConfig) this.packet_.get(index);
        }

        public PacketFactoryConfigOrBuilder getPacketOrBuilder(int index) {
            return (PacketFactoryConfigOrBuilder) this.packet_.get(index);
        }

        private void ensurePacketIsMutable() {
            if (!this.packet_.isModifiable()) {
                this.packet_ = GeneratedMessageLite.mutableCopy(this.packet_);
            }
        }

        /* access modifiers changed from: private */
        public void setPacket(int index, PacketFactoryConfig value) {
            value.getClass();
            ensurePacketIsMutable();
            this.packet_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addPacket(PacketFactoryConfig value) {
            value.getClass();
            ensurePacketIsMutable();
            this.packet_.add(value);
        }

        /* access modifiers changed from: private */
        public void addPacket(int index, PacketFactoryConfig value) {
            value.getClass();
            ensurePacketIsMutable();
            this.packet_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllPacket(Iterable<? extends PacketFactoryConfig> values) {
            ensurePacketIsMutable();
            AbstractMessageLite.addAll(values, this.packet_);
        }

        /* access modifiers changed from: private */
        public void clearPacket() {
            this.packet_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removePacket(int index) {
            ensurePacketIsMutable();
            this.packet_.remove(index);
        }

        public static PacketManagerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketManagerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketManagerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketManagerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketManagerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketManagerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketManagerConfig parseFrom(InputStream input) throws IOException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketManagerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketManagerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketManagerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketManagerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketManagerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketManagerConfig parseFrom(CodedInputStream input) throws IOException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketManagerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketManagerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketManagerConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PacketManagerConfig, Builder> implements PacketManagerConfigOrBuilder {
            private Builder() {
                super(PacketManagerConfig.DEFAULT_INSTANCE);
            }

            public List<PacketFactoryConfig> getPacketList() {
                return Collections.unmodifiableList(((PacketManagerConfig) this.instance).getPacketList());
            }

            public int getPacketCount() {
                return ((PacketManagerConfig) this.instance).getPacketCount();
            }

            public PacketFactoryConfig getPacket(int index) {
                return ((PacketManagerConfig) this.instance).getPacket(index);
            }

            public Builder setPacket(int index, PacketFactoryConfig value) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).setPacket(index, value);
                return this;
            }

            public Builder setPacket(int index, PacketFactoryConfig.Builder builderForValue) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).setPacket(index, (PacketFactoryConfig) builderForValue.build());
                return this;
            }

            public Builder addPacket(PacketFactoryConfig value) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).addPacket(value);
                return this;
            }

            public Builder addPacket(int index, PacketFactoryConfig value) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).addPacket(index, value);
                return this;
            }

            public Builder addPacket(PacketFactoryConfig.Builder builderForValue) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).addPacket((PacketFactoryConfig) builderForValue.build());
                return this;
            }

            public Builder addPacket(int index, PacketFactoryConfig.Builder builderForValue) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).addPacket(index, (PacketFactoryConfig) builderForValue.build());
                return this;
            }

            public Builder addAllPacket(Iterable<? extends PacketFactoryConfig> values) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).addAllPacket(values);
                return this;
            }

            public Builder clearPacket() {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).clearPacket();
                return this;
            }

            public Builder removePacket(int index) {
                copyOnWrite();
                ((PacketManagerConfig) this.instance).removePacket(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketManagerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"packet_", PacketFactoryConfig.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketManagerConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PacketManagerConfig.class) {
                        try {
                            Parser<PacketManagerConfig> parser2 = PARSER;
                            if (parser2 == null) {
                                GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                try {
                                    PARSER = defaultInstanceBasedParser;
                                    parser2 = defaultInstanceBasedParser;
                                } catch (Throwable th) {
                                    th = th;
                                    GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser2 = defaultInstanceBasedParser;
                                    throw th;
                                }
                            }
                            return parser2;
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case SET_MEMOIZED_IS_INITIALIZED:
                    if (arg0 != null) {
                        i = 1;
                    }
                    this.memoizedIsInitialized = (byte) i;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            PacketManagerConfig defaultInstance = new PacketManagerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketManagerConfig.class, defaultInstance);
        }

        public static PacketManagerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketManagerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
