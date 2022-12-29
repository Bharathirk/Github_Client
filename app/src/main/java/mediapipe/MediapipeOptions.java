package mediapipe;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class MediapipeOptions {

    public interface MediaPipeOptionsOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder<MediaPipeOptions, MediaPipeOptions.Builder> {
    }

    private MediapipeOptions() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class MediaPipeOptions extends GeneratedMessageLite.ExtendableMessage<MediaPipeOptions, MediaPipeOptions.Builder> implements MediaPipeOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final MediaPipeOptions DEFAULT_INSTANCE;
        private static volatile Parser<MediaPipeOptions> PARSER;
        private byte memoizedIsInitialized = 2;

        private MediaPipeOptions() {
        }

        public static MediaPipeOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MediaPipeOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(InputStream input) throws IOException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MediaPipeOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (MediaPipeOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MediaPipeOptions parseFrom(CodedInputStream input) throws IOException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MediaPipeOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MediaPipeOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MediaPipeOptions prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<MediaPipeOptions, Builder> implements MediaPipeOptionsOrBuilder {
            private Builder() {
                super(MediaPipeOptions.DEFAULT_INSTANCE);
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new MediaPipeOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0000", (Object[]) null);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MediaPipeOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MediaPipeOptions.class) {
                        try {
                            Parser<MediaPipeOptions> parser2 = PARSER;
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
            MediaPipeOptions defaultInstance = new MediaPipeOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(MediaPipeOptions.class, defaultInstance);
        }

        public static MediaPipeOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MediaPipeOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
