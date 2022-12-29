package com.google.mediapipe.proto;

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

public final class StreamHandlerProto {

    public interface InputStreamHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        String getInputStreamHandler();

        ByteString getInputStreamHandlerBytes();

        MediapipeOptions.MediaPipeOptions getOptions();

        boolean hasInputStreamHandler();

        boolean hasOptions();
    }

    public interface OutputStreamHandlerConfigOrBuilder extends MessageLiteOrBuilder {
        String getInputSidePacket(int i);

        ByteString getInputSidePacketBytes(int i);

        int getInputSidePacketCount();

        List<String> getInputSidePacketList();

        MediapipeOptions.MediaPipeOptions getOptions();

        String getOutputStreamHandler();

        ByteString getOutputStreamHandlerBytes();

        boolean hasOptions();

        boolean hasOutputStreamHandler();
    }

    private StreamHandlerProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class InputStreamHandlerConfig extends GeneratedMessageLite<InputStreamHandlerConfig, InputStreamHandlerConfig.Builder> implements InputStreamHandlerConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final InputStreamHandlerConfig DEFAULT_INSTANCE;
        public static final int INPUT_STREAM_HANDLER_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile Parser<InputStreamHandlerConfig> PARSER;
        private int bitField0_;
        private String inputStreamHandler_ = "DefaultInputStreamHandler";
        private byte memoizedIsInitialized = 2;
        private MediapipeOptions.MediaPipeOptions options_;

        private InputStreamHandlerConfig() {
        }

        public boolean hasInputStreamHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getInputStreamHandler() {
            return this.inputStreamHandler_;
        }

        public ByteString getInputStreamHandlerBytes() {
            return ByteString.copyFromUtf8(this.inputStreamHandler_);
        }

        /* access modifiers changed from: private */
        public void setInputStreamHandler(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.inputStreamHandler_ = value;
        }

        /* access modifiers changed from: private */
        public void clearInputStreamHandler() {
            this.bitField0_ &= -2;
            this.inputStreamHandler_ = getDefaultInstance().getInputStreamHandler();
        }

        /* access modifiers changed from: private */
        public void setInputStreamHandlerBytes(ByteString value) {
            this.inputStreamHandler_ = value.toStringUtf8();
            this.bitField0_ |= 1;
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

        public static InputStreamHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static InputStreamHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(InputStream input) throws IOException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (InputStreamHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static InputStreamHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static InputStreamHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (InputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(InputStreamHandlerConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<InputStreamHandlerConfig, Builder> implements InputStreamHandlerConfigOrBuilder {
            private Builder() {
                super(InputStreamHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasInputStreamHandler() {
                return ((InputStreamHandlerConfig) this.instance).hasInputStreamHandler();
            }

            public String getInputStreamHandler() {
                return ((InputStreamHandlerConfig) this.instance).getInputStreamHandler();
            }

            public ByteString getInputStreamHandlerBytes() {
                return ((InputStreamHandlerConfig) this.instance).getInputStreamHandlerBytes();
            }

            public Builder setInputStreamHandler(String value) {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).setInputStreamHandler(value);
                return this;
            }

            public Builder clearInputStreamHandler() {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).clearInputStreamHandler();
                return this;
            }

            public Builder setInputStreamHandlerBytes(ByteString value) {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).setInputStreamHandlerBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((InputStreamHandlerConfig) this.instance).hasOptions();
            }

            public MediapipeOptions.MediaPipeOptions getOptions() {
                return ((InputStreamHandlerConfig) this.instance).getOptions();
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions.Builder builderForValue) {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).setOptions((MediapipeOptions.MediaPipeOptions) builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((InputStreamHandlerConfig) this.instance).clearOptions();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new InputStreamHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001\b\u0000\u0003Љ\u0001", new Object[]{"bitField0_", "inputStreamHandler_", "options_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<InputStreamHandlerConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (InputStreamHandlerConfig.class) {
                        try {
                            Parser<InputStreamHandlerConfig> parser2 = PARSER;
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
            InputStreamHandlerConfig defaultInstance = new InputStreamHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(InputStreamHandlerConfig.class, defaultInstance);
        }

        public static InputStreamHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<InputStreamHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class OutputStreamHandlerConfig extends GeneratedMessageLite<OutputStreamHandlerConfig, OutputStreamHandlerConfig.Builder> implements OutputStreamHandlerConfigOrBuilder {
        /* access modifiers changed from: private */
        public static final OutputStreamHandlerConfig DEFAULT_INSTANCE;
        public static final int INPUT_SIDE_PACKET_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        public static final int OUTPUT_STREAM_HANDLER_FIELD_NUMBER = 1;
        private static volatile Parser<OutputStreamHandlerConfig> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<String> inputSidePacket_ = GeneratedMessageLite.emptyProtobufList();
        private byte memoizedIsInitialized = 2;
        private MediapipeOptions.MediaPipeOptions options_;
        private String outputStreamHandler_ = "InOrderOutputStreamHandler";

        private OutputStreamHandlerConfig() {
        }

        public boolean hasOutputStreamHandler() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getOutputStreamHandler() {
            return this.outputStreamHandler_;
        }

        public ByteString getOutputStreamHandlerBytes() {
            return ByteString.copyFromUtf8(this.outputStreamHandler_);
        }

        /* access modifiers changed from: private */
        public void setOutputStreamHandler(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.outputStreamHandler_ = value;
        }

        /* access modifiers changed from: private */
        public void clearOutputStreamHandler() {
            this.bitField0_ &= -2;
            this.outputStreamHandler_ = getDefaultInstance().getOutputStreamHandler();
        }

        /* access modifiers changed from: private */
        public void setOutputStreamHandlerBytes(ByteString value) {
            this.outputStreamHandler_ = value.toStringUtf8();
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

        public static OutputStreamHandlerConfig parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static OutputStreamHandlerConfig parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(InputStream input) throws IOException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseDelimitedFrom(InputStream input) throws IOException {
            return (OutputStreamHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static OutputStreamHandlerConfig parseFrom(CodedInputStream input) throws IOException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static OutputStreamHandlerConfig parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (OutputStreamHandlerConfig) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(OutputStreamHandlerConfig prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<OutputStreamHandlerConfig, Builder> implements OutputStreamHandlerConfigOrBuilder {
            private Builder() {
                super(OutputStreamHandlerConfig.DEFAULT_INSTANCE);
            }

            public boolean hasOutputStreamHandler() {
                return ((OutputStreamHandlerConfig) this.instance).hasOutputStreamHandler();
            }

            public String getOutputStreamHandler() {
                return ((OutputStreamHandlerConfig) this.instance).getOutputStreamHandler();
            }

            public ByteString getOutputStreamHandlerBytes() {
                return ((OutputStreamHandlerConfig) this.instance).getOutputStreamHandlerBytes();
            }

            public Builder setOutputStreamHandler(String value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).setOutputStreamHandler(value);
                return this;
            }

            public Builder clearOutputStreamHandler() {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).clearOutputStreamHandler();
                return this;
            }

            public Builder setOutputStreamHandlerBytes(ByteString value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).setOutputStreamHandlerBytes(value);
                return this;
            }

            public List<String> getInputSidePacketList() {
                return Collections.unmodifiableList(((OutputStreamHandlerConfig) this.instance).getInputSidePacketList());
            }

            public int getInputSidePacketCount() {
                return ((OutputStreamHandlerConfig) this.instance).getInputSidePacketCount();
            }

            public String getInputSidePacket(int index) {
                return ((OutputStreamHandlerConfig) this.instance).getInputSidePacket(index);
            }

            public ByteString getInputSidePacketBytes(int index) {
                return ((OutputStreamHandlerConfig) this.instance).getInputSidePacketBytes(index);
            }

            public Builder setInputSidePacket(int index, String value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).setInputSidePacket(index, value);
                return this;
            }

            public Builder addInputSidePacket(String value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).addInputSidePacket(value);
                return this;
            }

            public Builder addAllInputSidePacket(Iterable<String> values) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).addAllInputSidePacket(values);
                return this;
            }

            public Builder clearInputSidePacket() {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).clearInputSidePacket();
                return this;
            }

            public Builder addInputSidePacketBytes(ByteString value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).addInputSidePacketBytes(value);
                return this;
            }

            public boolean hasOptions() {
                return ((OutputStreamHandlerConfig) this.instance).hasOptions();
            }

            public MediapipeOptions.MediaPipeOptions getOptions() {
                return ((OutputStreamHandlerConfig) this.instance).getOptions();
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).setOptions(value);
                return this;
            }

            public Builder setOptions(MediapipeOptions.MediaPipeOptions.Builder builderForValue) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).setOptions((MediapipeOptions.MediaPipeOptions) builderForValue.build());
                return this;
            }

            public Builder mergeOptions(MediapipeOptions.MediaPipeOptions value) {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).mergeOptions(value);
                return this;
            }

            public Builder clearOptions() {
                copyOnWrite();
                ((OutputStreamHandlerConfig) this.instance).clearOptions();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new OutputStreamHandlerConfig();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\b\u0000\u0002\u001a\u0003Љ\u0001", new Object[]{"bitField0_", "outputStreamHandler_", "inputSidePacket_", "options_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<OutputStreamHandlerConfig> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OutputStreamHandlerConfig.class) {
                        try {
                            Parser<OutputStreamHandlerConfig> parser2 = PARSER;
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
            OutputStreamHandlerConfig defaultInstance = new OutputStreamHandlerConfig();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(OutputStreamHandlerConfig.class, defaultInstance);
        }

        public static OutputStreamHandlerConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<OutputStreamHandlerConfig> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
