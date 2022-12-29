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

public final class PacketGenerator {

    public interface PacketGeneratorConfigOrBuilder extends MessageLiteOrBuilder {
        String getExternalInput(int i);

        ByteString getExternalInputBytes(int i);

        int getExternalInputCount();

        List<String> getExternalInputList();

        String getExternalOutput(int i);

        ByteString getExternalOutputBytes(int i);

        int getExternalOutputCount();

        List<String> getExternalOutputList();

        String getInputSidePacket(int i);

        ByteString getInputSidePacketBytes(int i);

        int getInputSidePacketCount();

        List<String> getInputSidePacketList();

        PacketGeneratorOptions getOptions();

        String getOutputSidePacket(int i);

        ByteString getOutputSidePacketBytes(int i);

        int getOutputSidePacketCount();

        List<String> getOutputSidePacketList();

        String getPacketGenerator();

        ByteString getPacketGeneratorBytes();

        boolean hasOptions();

        boolean hasPacketGenerator();
    }

    public interface PacketGeneratorOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<PacketGeneratorOptions, PacketGeneratorOptions.Builder> {
    }

    private PacketGenerator() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class PacketGeneratorOptions extends GeneratedMessageLite.ExtendableMessage<PacketGeneratorOptions, PacketGeneratorOptions.Builder> implements PacketGeneratorOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final PacketGeneratorOptions DEFAULT_INSTANCE;
        private static volatile Parser<PacketGeneratorOptions> PARSER;
        private byte memoizedIsInitialized = 2;

        private PacketGeneratorOptions() {
        }

        public static PacketGeneratorOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(InputStream input) throws IOException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketGeneratorOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorOptions parseFrom(CodedInputStream input) throws IOException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketGeneratorOptions prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PacketGeneratorOptions, Builder> implements PacketGeneratorOptionsOrBuilder {
            private Builder() {
                super(PacketGeneratorOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketGeneratorOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketGeneratorOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PacketGeneratorOptions.class) {
                        try {
                            Parser<PacketGeneratorOptions> parser2 = PARSER;
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
            PacketGeneratorOptions defaultInstance = new PacketGeneratorOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketGeneratorOptions.class, defaultInstance);
        }

        public static PacketGeneratorOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketGeneratorOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class PacketGeneratorConfig extends GeneratedMessageLite<PacketGeneratorConfig, PacketGeneratorConfig.Builder> implements PacketGeneratorConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final PacketGeneratorConfig DEFAULT_INSTANCE;
        public static final int EXTERNAL_INPUT_FIELD_NUMBER = 1002;
        public static final int EXTERNAL_OUTPUT_FIELD_NUMBER = 1003;
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 4;
        public static final int OUTPUT_SIDE_PACKET_FIELD_NUMBER = 3;
        public static final int PACKET_GENERATOR_FIELD_NUMBER = 1;
        private static volatile Parser<PacketGeneratorConfig> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<String> externalInput_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> externalOutput_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private PacketGeneratorOptions options_;
        private Internal.ProtobufList<String> outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        private String packetGenerator_ = "";

        private PacketGeneratorConfig() {
        }

        public boolean hasPacketGenerator() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getPacketGenerator() {
            return this.packetGenerator_;
        }

        public ByteString getPacketGeneratorBytes() {
            return ByteString.copyFromUtf8(this.packetGenerator_);
        }

        /* access modifiers changed from: private */
        public void setPacketGenerator(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.packetGenerator_ = value;
        }

        /* access modifiers changed from: private */
        public void clearPacketGenerator() {
            this.bitField0_ &= -2;
            this.packetGenerator_ = getDefaultInstance().getPacketGenerator();
        }

        /* access modifiers changed from: private */
        public void setPacketGeneratorBytes(ByteString value) {
            this.packetGenerator_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public List<String> getInputSidePacketList() {
            return this.inputSidePacket_;
        }

        public int getInputSidePacketCount() {
            return this.inputSidePacket_.size();
        }

        public String getInputSidePacket(int index) {
            return (String) this.inputSidePacket_.get(index);
        }

        public ByteString getInputSidePacketBytes(int index) {
            return ByteString.copyFromUtf8((String) this.inputSidePacket_.get(index));
        }

        private void ensureInputSidePacketIsMutable() {
            if (!this.inputSidePacket_.isModifiable()) {
                this.inputSidePacket_ = GeneratedMessageLite.mutableCopy(this.inputSidePacket_);
            }
        }

        /* access modifiers changed from: private */
        public void setInputSidePacket(int index, String value) {
            value.getClass();
            ensureInputSidePacketIsMutable();
            this.inputSidePacket_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addInputSidePacket(String value) {
            value.getClass();
            ensureInputSidePacketIsMutable();
            this.inputSidePacket_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllInputSidePacket(Iterable<String> values) {
            ensureInputSidePacketIsMutable();
            AbstractMessageLite.addAll(values, this.inputSidePacket_);
        }

        /* access modifiers changed from: private */
        public void clearInputSidePacket() {
            this.inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addInputSidePacketBytes(ByteString value) {
            ensureInputSidePacketIsMutable();
            this.inputSidePacket_.add(value.toStringUtf8());
        }

        public List<String> getExternalInputList() {
            return this.externalInput_;
        }

        public int getExternalInputCount() {
            return this.externalInput_.size();
        }

        public String getExternalInput(int index) {
            return (String) this.externalInput_.get(index);
        }

        public ByteString getExternalInputBytes(int index) {
            return ByteString.copyFromUtf8((String) this.externalInput_.get(index));
        }

        private void ensureExternalInputIsMutable() {
            if (!this.externalInput_.isModifiable()) {
                this.externalInput_ = GeneratedMessageLite.mutableCopy(this.externalInput_);
            }
        }

        /* access modifiers changed from: private */
        public void setExternalInput(int index, String value) {
            value.getClass();
            ensureExternalInputIsMutable();
            this.externalInput_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addExternalInput(String value) {
            value.getClass();
            ensureExternalInputIsMutable();
            this.externalInput_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllExternalInput(Iterable<String> values) {
            ensureExternalInputIsMutable();
            AbstractMessageLite.addAll(values, this.externalInput_);
        }

        /* access modifiers changed from: private */
        public void clearExternalInput() {
            this.externalInput_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addExternalInputBytes(ByteString value) {
            ensureExternalInputIsMutable();
            this.externalInput_.add(value.toStringUtf8());
        }

        public List<String> getOutputSidePacketList() {
            return this.outputSidePacket_;
        }

        public int getOutputSidePacketCount() {
            return this.outputSidePacket_.size();
        }

        public String getOutputSidePacket(int index) {
            return (String) this.outputSidePacket_.get(index);
        }

        public ByteString getOutputSidePacketBytes(int index) {
            return ByteString.copyFromUtf8((String) this.outputSidePacket_.get(index));
        }

        private void ensureOutputSidePacketIsMutable() {
            if (!this.outputSidePacket_.isModifiable()) {
                this.outputSidePacket_ = GeneratedMessageLite.mutableCopy(this.outputSidePacket_);
            }
        }

        /* access modifiers changed from: private */
        public void setOutputSidePacket(int index, String value) {
            value.getClass();
            ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addOutputSidePacket(String value) {
            value.getClass();
            ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllOutputSidePacket(Iterable<String> values) {
            ensureOutputSidePacketIsMutable();
            AbstractMessageLite.addAll(values, this.outputSidePacket_);
        }

        /* access modifiers changed from: private */
        public void clearOutputSidePacket() {
            this.outputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addOutputSidePacketBytes(ByteString value) {
            ensureOutputSidePacketIsMutable();
            this.outputSidePacket_.add(value.toStringUtf8());
        }

        public List<String> getExternalOutputList() {
            return this.externalOutput_;
        }

        public int getExternalOutputCount() {
            return this.externalOutput_.size();
        }

        public String getExternalOutput(int index) {
            return (String) this.externalOutput_.get(index);
        }

        public ByteString getExternalOutputBytes(int index) {
            return ByteString.copyFromUtf8((String) this.externalOutput_.get(index));
        }

        private void ensureExternalOutputIsMutable() {
            if (!this.externalOutput_.isModifiable()) {
                this.externalOutput_ = GeneratedMessageLite.mutableCopy(this.externalOutput_);
            }
        }

        /* access modifiers changed from: private */
        public void setExternalOutput(int index, String value) {
            value.getClass();
            ensureExternalOutputIsMutable();
            this.externalOutput_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addExternalOutput(String value) {
            value.getClass();
            ensureExternalOutputIsMutable();
            this.externalOutput_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllExternalOutput(Iterable<String> values) {
            ensureExternalOutputIsMutable();
            AbstractMessageLite.addAll(values, this.externalOutput_);
        }

        /* access modifiers changed from: private */
        public void clearExternalOutput() {
            this.externalOutput_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addExternalOutputBytes(ByteString value) {
            ensureExternalOutputIsMutable();
            this.externalOutput_.add(value.toStringUtf8());
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public PacketGeneratorOptions getOptions() {
            return this.options_ == null ? PacketGeneratorOptions.getDefaultInstance() : this.options_;
        }

        /* access modifiers changed from: private */
        public void setOptions(PacketGeneratorOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(PacketGeneratorOptions value) {
            value.getClass();
            if (this.options_ == null || this.options_ == PacketGeneratorOptions.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = (PacketGeneratorOptions) ((PacketGeneratorOptions.Builder) PacketGeneratorOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static PacketGeneratorConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PacketGeneratorConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(InputStream input) throws IOException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (PacketGeneratorConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PacketGeneratorConfig parseFrom(CodedInputStream input) throws IOException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PacketGeneratorConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PacketGeneratorConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PacketGeneratorConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PacketGeneratorConfig, Builder> implements PacketGeneratorConfigOrBuilder {
            private Builder() {
                super(PacketGeneratorConfig.DEFAULT_INSTANCE);
            }

            public boolean hasPacketGenerator() {
                return ((PacketGeneratorConfig) this.instance).hasPacketGenerator();
            }

            public String getPacketGenerator() {
                return ((PacketGeneratorConfig) this.instance).getPacketGenerator();
            }

            public ByteString getPacketGeneratorBytes() {
                return ((PacketGeneratorConfig) this.instance).getPacketGeneratorBytes();
            }

            public Builder setPacketGenerator(String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setPacketGenerator(value);
                return this;
            }

            public Builder clearPacketGenerator() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearPacketGenerator();
                return this;
            }

            public Builder setPacketGeneratorBytes(ByteString value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setPacketGeneratorBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig) this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((PacketGeneratorConfig) this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((PacketGeneratorConfig) this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((PacketGeneratorConfig) this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalInputList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig) this.instance).getExternalInputList());
            }

            public int getExternalInputCount() {
                return ((PacketGeneratorConfig) this.instance).getExternalInputCount();
            }

            public String getExternalInput(int index) {
                return ((PacketGeneratorConfig) this.instance).getExternalInput(index);
            }

            public ByteString getExternalInputBytes(int index) {
                return ((PacketGeneratorConfig) this.instance).getExternalInputBytes(index);
            }

            public Builder setExternalInput(int index, String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setExternalInput(index, value);
                return this;
            }

            public Builder addExternalInput(String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addExternalInput(value);
                return this;
            }

            public Builder addAllExternalInput(Iterable<String> values) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addAllExternalInput(values);
                return this;
            }

            public Builder clearExternalInput() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearExternalInput();
                return this;
            }

            public Builder addExternalInputBytes(ByteString value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addExternalInputBytes(value);
                return this;
            }

            public List<String> getOutputSidePacketList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig) this.instance).getOutputSidePacketList());
            }

            public int getOutputSidePacketCount() {
                return ((PacketGeneratorConfig) this.instance).getOutputSidePacketCount();
            }

            public String getOutputSidePacket(int index) {
                return ((PacketGeneratorConfig) this.instance).getOutputSidePacket(index);
            }

            public ByteString getOutputSidePacketBytes(int index) {
                return ((PacketGeneratorConfig) this.instance).getOutputSidePacketBytes(index);
            }

            public Builder setOutputSidePacket(int index, String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setOutputSidePacket(index, value);
                return this;
            }

            public Builder addOutputSidePacket(String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addOutputSidePacket(value);
                return this;
            }

            public Builder addAllOutputSidePacket(Iterable<String> values) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addAllOutputSidePacket(values);
                return this;
            }

            public Builder clearOutputSidePacket() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearOutputSidePacket();
                return this;
            }

            public Builder addOutputSidePacketBytes(ByteString value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addOutputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalOutputList() {
                return Collections.unmodifiableList(((PacketGeneratorConfig) this.instance).getExternalOutputList());
            }

            public int getExternalOutputCount() {
                return ((PacketGeneratorConfig) this.instance).getExternalOutputCount();
            }

            public String getExternalOutput(int index) {
                return ((PacketGeneratorConfig) this.instance).getExternalOutput(index);
            }

            public ByteString getExternalOutputBytes(int index) {
                return ((PacketGeneratorConfig) this.instance).getExternalOutputBytes(index);
            }

            public Builder setExternalOutput(int index, String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setExternalOutput(index, value);
                return this;
            }

            public Builder addExternalOutput(String value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addExternalOutput(value);
                return this;
            }

            public Builder addAllExternalOutput(Iterable<String> values) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addAllExternalOutput(values);
                return this;
            }

            public Builder clearExternalOutput() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearExternalOutput();
                return this;
            }

            public Builder addExternalOutputBytes(ByteString value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).addExternalOutputBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((PacketGeneratorConfig) this.instance).hasOptions();
            }

            public PacketGeneratorOptions getOptions() {
                return ((PacketGeneratorConfig) this.instance).getOptions();
            }

            public Builder setOptions(PacketGeneratorOptions value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(PacketGeneratorOptions.Builder builderForValue) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).setOptions((PacketGeneratorOptions) builderForValue.build());
                return this;
            }

            public Builder mergeOptions(PacketGeneratorOptions value) {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((PacketGeneratorConfig) this.instance).clearOptions();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PacketGeneratorConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001ϫ\u0006\u0000\u0004\u0001\u0001\b\u0000\u0002\u001a\u0003\u001a\u0004Љ\u0001Ϫ\u001aϫ\u001a", new Object[]{"bitField0_", "packetGenerator_", "inputSidePacket_", "outputSidePacket_", "options_", "externalInput_", "externalOutput_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PacketGeneratorConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PacketGeneratorConfig.class) {
                        try {
                            Parser<PacketGeneratorConfig> parser2 = PARSER;
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
            PacketGeneratorConfig defaultInstance = new PacketGeneratorConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PacketGeneratorConfig.class, defaultInstance);
        }

        public static PacketGeneratorConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PacketGeneratorConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
