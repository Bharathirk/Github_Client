package com.google.mediapipe.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CalculatorOptionsProto {

    public interface CalculatorOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<CalculatorOptions, Builder> {
        @Deprecated
        boolean getMergeFields();

        @Deprecated
        boolean hasMergeFields();
    }

    private CalculatorOptionsProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class CalculatorOptions extends GeneratedMessageLite.ExtendableMessage<CalculatorOptions, Builder> implements CalculatorOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final CalculatorOptions DEFAULT_INSTANCE;
        public static final int MERGE_FIELDS_FIELD_NUMBER = 1;
        private static volatile Parser<CalculatorOptions> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private boolean mergeFields_;

        private CalculatorOptions() {
        }

        @Deprecated
        public boolean hasMergeFields() {
            return (this.bitField0_ & 1) != 0;
        }

        @Deprecated
        public boolean getMergeFields() {
            return this.mergeFields_;
        }

        /* access modifiers changed from: private */
        public void setMergeFields(boolean value) {
            this.bitField0_ |= 1;
            this.mergeFields_ = value;
        }

        /* access modifiers changed from: private */
        public void clearMergeFields() {
            this.bitField0_ &= -2;
            this.mergeFields_ = false;
        }

        public static CalculatorOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(InputStream input) throws IOException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (CalculatorOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorOptions parseFrom(CodedInputStream input) throws IOException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CalculatorOptions prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }



        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new CalculatorOptions();
                case NEW_BUILDER:
                    return new CalculatorOptionsProto.Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007\u0000", new Object[]{"bitField0_", "mergeFields_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CalculatorOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CalculatorOptions.class) {
                        try {
                            Parser<CalculatorOptions> parser2 = PARSER;
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
            CalculatorOptions defaultInstance = new CalculatorOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(CalculatorOptions.class, defaultInstance);
        }

        public static CalculatorOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CalculatorOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<CalculatorOptions, Builder> implements CalculatorOptionsOrBuilder {
        private Builder() {
            super(CalculatorOptions.DEFAULT_INSTANCE);
        }

        @Deprecated
        public boolean hasMergeFields() {
            return ((CalculatorOptions) this.instance).hasMergeFields();
        }

        @Deprecated
        public boolean getMergeFields() {
            return ((CalculatorOptions) this.instance).getMergeFields();
        }

        @Deprecated
        public Builder setMergeFields(boolean value) {
            copyOnWrite();
            ((CalculatorOptions) this.instance).setMergeFields(value);
            return this;
        }

        @Deprecated
        public Builder clearMergeFields() {
            copyOnWrite();
            ((CalculatorOptions) this.instance).clearMergeFields();
            return this;
        }
    }
}
