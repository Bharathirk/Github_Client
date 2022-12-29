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
import mediapipe.MediapipeOptions;

public final class StatusHandler {

    public interface StatusHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        String getExternalInput(int i);

        ByteString getExternalInputBytes(int i);

        int getExternalInputCount();

        List<String> getExternalInputList();

        String getInputSidePacket(int i);

        ByteString getInputSidePacketBytes(int i);

        int getInputSidePacketCount();

        List<String> getInputSidePacketList();

        MediapipeOptions.MediaPipeOptions getOptions();

        String getStatusHandler();

        ByteString getStatusHandlerBytes();

        boolean hasOptions();

        boolean hasStatusHandler();
    }

    private StatusHandler() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class StatusHandlerConfig extends GeneratedMessageLite<StatusHandlerConfig, StatusHandlerConfig.Builder> implements StatusHandlerConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final StatusHandlerConfig DEFAULT_INSTANCE;
        public static final int EXTERNAL_INPUT_FIELD_NUMBER = 1002;
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<StatusHandlerConfig> PARSER = null;
        public static final int STATUS_HANDLER_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<String> externalInput_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private MediapipeOptions.MediaPipeOptions options_;
        private String statusHandler_ = "";

        private StatusHandlerConfig() {
        }

        public boolean hasStatusHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getStatusHandler() {
            return this.statusHandler_;
        }

        public ByteString getStatusHandlerBytes() {
            return ByteString.copyFromUtf8(this.statusHandler_);
        }

        /* access modifiers changed from: private */
        public void setStatusHandler(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.statusHandler_ = value;
        }

        /* access modifiers changed from: private */
        public void clearStatusHandler() {
            this.bitField0_ &= -2;
            this.statusHandler_ = getDefaultInstance().getStatusHandler();
        }

        /* access modifiers changed from: private */
        public void setStatusHandlerBytes(ByteString value) {
            this.statusHandler_ = value.toStringUtf8();
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

        public boolean hasOptions() {
            return (this.bitField0_ & 2) != 0;
        }

        public MediapipeOptions.MediaPipeOptions getOptions() {
            return this.options_ == null ? MediapipeOptions.MediaPipeOptions.getDefaultInstance() : this.options_;
        }

        /* access modifiers changed from: private */
        public void setOptions(MediapipeOptions.MediaPipeOptions value) {
            value.getClass();
            this.options_ = value;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergeOptions(MediapipeOptions.MediaPipeOptions value) {
            value.getClass();
            if (this.options_ == null || this.options_ == MediapipeOptions.MediaPipeOptions.getDefaultInstance()) {
                this.options_ = value;
            } else {
                this.options_ = (MediapipeOptions.MediaPipeOptions) ((MediapipeOptions.MediaPipeOptions.Builder) MediapipeOptions.MediaPipeOptions.newBuilder(this.options_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -3;
        }

        public static StatusHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StatusHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(InputStream input) throws IOException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatusHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (StatusHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StatusHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StatusHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StatusHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StatusHandlerConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StatusHandlerConfig, Builder> implements StatusHandlerConfigOrBuilder {
            private Builder() {
                super(StatusHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasStatusHandler() {
                return ((StatusHandlerConfig) this.instance).hasStatusHandler();
            }

            public String getStatusHandler() {
                return ((StatusHandlerConfig) this.instance).getStatusHandler();
            }

            public ByteString getStatusHandlerBytes() {
                return ((StatusHandlerConfig) this.instance).getStatusHandlerBytes();
            }

            public Builder setStatusHandler(String value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setStatusHandler(value);
                return this;
            }

            public Builder clearStatusHandler() {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).clearStatusHandler();
                return this;
            }

            public Builder setStatusHandlerBytes(ByteString value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setStatusHandlerBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((StatusHandlerConfig) this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((StatusHandlerConfig) this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((StatusHandlerConfig) this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((StatusHandlerConfig) this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public List<String> getExternalInputList() {
                return Collections.unmodifiableList(((StatusHandlerConfig) this.instance).getExternalInputList());
            }

            public int getExternalInputCount() {
                return ((StatusHandlerConfig) this.instance).getExternalInputCount();
            }

            public String getExternalInput(int index) {
                return ((StatusHandlerConfig) this.instance).getExternalInput(index);
            }

            public ByteString getExternalInputBytes(int index) {
                return ((StatusHandlerConfig) this.instance).getExternalInputBytes(index);
            }

            public Builder setExternalInput(int index, String value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setExternalInput(index, value);
                return this;
            }

            public Builder addExternalInput(String value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addExternalInput(value);
                return this;
            }

            public Builder addAllExternalInput(Iterable<String> values) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addAllExternalInput(values);
                return this;
            }

            public Builder clearExternalInput() {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).clearExternalInput();
                return this;
            }

            public Builder addExternalInputBytes(ByteString value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).addExternalInputBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((StatusHandlerConfig) this.instance).hasOptions();
            }

            public MediapipeOptions.MediaPipeOptions getOptions() {
                return ((StatusHandlerConfig) this.instance).getOptions();
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions.Builder builderForValue) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).setOptions((MediapipeOptions.MediaPipeOptions) builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((StatusHandlerConfig) this.instance).clearOptions();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new StatusHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001Ϫ\u0004\u0000\u0002\u0001\u0001\b\u0000\u0002\u001a\u0003Љ\u0001Ϫ\u001a", new Object[]{"bitField0_", "statusHandler_", "inputSidePacket_", "options_", "externalInput_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<StatusHandlerConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StatusHandlerConfig.class) {
                        try {
                            Parser<StatusHandlerConfig> parser2 = PARSER;
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
            StatusHandlerConfig defaultInstance = new StatusHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(StatusHandlerConfig.class, defaultInstance);
        }

        public static StatusHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StatusHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
