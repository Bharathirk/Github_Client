package com.google.mediapipe.modules.facegeometry;

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

public final class Mesh3dProto {

    public interface Mesh3dOrBuilder extends MessageLiteOrBuilder {
        int getIndexBuffer(int i);

        int getIndexBufferCount();

        List<Integer> getIndexBufferList();

        Mesh3d.PrimitiveType getPrimitiveType();

        float getVertexBuffer(int i);

        int getVertexBufferCount();

        List<Float> getVertexBufferList();

        Mesh3d.VertexType getVertexType();

        boolean hasPrimitiveType();

        boolean hasVertexType();
    }

    private Mesh3dProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class Mesh3d extends GeneratedMessageLite<Mesh3d, Mesh3d.Builder> implements Mesh3dOrBuilder {
        /* access modifiers changed from: private */
        public static final Mesh3d DEFAULT_INSTANCE;
        public static final int INDEX_BUFFER_FIELD_NUMBER = 4;
        private static volatile Parser<Mesh3d> PARSER = null;
        public static final int PRIMITIVE_TYPE_FIELD_NUMBER = 2;
        public static final int VERTEX_BUFFER_FIELD_NUMBER = 3;
        public static final int VERTEX_TYPE_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.IntList indexBuffer_ = emptyIntList();
        private int primitiveType_;
        private Internal.FloatList vertexBuffer_ = emptyFloatList();
        private int vertexType_;

        private Mesh3d() {
        }

        public enum VertexType implements Internal.EnumLite {
            VERTEX_PT(0);
            
            public static final int VERTEX_PT_VALUE = 0;
            private static final Internal.EnumLiteMap<VertexType> internalValueMap = new Internal.EnumLiteMap<VertexType>() {
                public VertexType findValueByNumber(int number) {
                    return VertexType.forNumber(number);
                }
            };;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static VertexType valueOf(int value2) {
                return forNumber(value2);
            }

            public static VertexType forNumber(int value2) {
                switch (value2) {
                    case 0:
                        return VERTEX_PT;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<VertexType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return VertexTypeVerifier.INSTANCE;
            }

            private static final class VertexTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new VertexTypeVerifier();

                private VertexTypeVerifier() {
                }

                public boolean isInRange(int number) {
                    return VertexType.forNumber(number) != null;
                }
            }

            private VertexType(int value2) {
                this.value = value2;
            }
        }

        public enum PrimitiveType implements Internal.EnumLite {
            TRIANGLE(0);
            
            public static final int TRIANGLE_VALUE = 0;
            private static final Internal.EnumLiteMap<PrimitiveType> internalValueMap = new Internal.EnumLiteMap<PrimitiveType>() {
                public PrimitiveType findValueByNumber(int number) {
                    return PrimitiveType.forNumber(number);
                }
            };;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static PrimitiveType valueOf(int value2) {
                return forNumber(value2);
            }

            public static PrimitiveType forNumber(int value2) {
                switch (value2) {
                    case 0:
                        return TRIANGLE;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<PrimitiveType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return PrimitiveTypeVerifier.INSTANCE;
            }

            private static final class PrimitiveTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new PrimitiveTypeVerifier();

                private PrimitiveTypeVerifier() {
                }

                public boolean isInRange(int number) {
                    return PrimitiveType.forNumber(number) != null;
                }
            }

            private PrimitiveType(int value2) {
                this.value = value2;
            }
        }

        public boolean hasVertexType() {
            return (this.bitField0_ & 1) != 0;
        }

        public VertexType getVertexType() {
            VertexType result = VertexType.forNumber(this.vertexType_);
            return result == null ? VertexType.VERTEX_PT : result;
        }

        /* access modifiers changed from: private */
        public void setVertexType(VertexType value) {
            this.vertexType_ = value.getNumber();
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void clearVertexType() {
            this.bitField0_ &= -2;
            this.vertexType_ = 0;
        }

        public boolean hasPrimitiveType() {
            return (this.bitField0_ & 2) != 0;
        }

        public PrimitiveType getPrimitiveType() {
            PrimitiveType result = PrimitiveType.forNumber(this.primitiveType_);
            return result == null ? PrimitiveType.TRIANGLE : result;
        }

        /* access modifiers changed from: private */
        public void setPrimitiveType(PrimitiveType value) {
            this.primitiveType_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearPrimitiveType() {
            this.bitField0_ &= -3;
            this.primitiveType_ = 0;
        }

        public List<Float> getVertexBufferList() {
            return this.vertexBuffer_;
        }

        public int getVertexBufferCount() {
            return this.vertexBuffer_.size();
        }

        public float getVertexBuffer(int index) {
            return this.vertexBuffer_.getFloat(index);
        }

        private void ensureVertexBufferIsMutable() {
            if (!this.vertexBuffer_.isModifiable()) {
                this.vertexBuffer_ = GeneratedMessageLite.mutableCopy(this.vertexBuffer_);
            }
        }

        /* access modifiers changed from: private */
        public void setVertexBuffer(int index, float value) {
            ensureVertexBufferIsMutable();
            this.vertexBuffer_.setFloat(index, value);
        }

        /* access modifiers changed from: private */
        public void addVertexBuffer(float value) {
            ensureVertexBufferIsMutable();
            this.vertexBuffer_.addFloat(value);
        }

        /* access modifiers changed from: private */
        public void addAllVertexBuffer(Iterable<? extends Float> values) {
            ensureVertexBufferIsMutable();
            AbstractMessageLite.addAll(values, this.vertexBuffer_);
        }

        /* access modifiers changed from: private */
        public void clearVertexBuffer() {
            this.vertexBuffer_ = emptyFloatList();
        }

        public List<Integer> getIndexBufferList() {
            return this.indexBuffer_;
        }

        public int getIndexBufferCount() {
            return this.indexBuffer_.size();
        }

        public int getIndexBuffer(int index) {
            return this.indexBuffer_.getInt(index);
        }

        private void ensureIndexBufferIsMutable() {
            if (!this.indexBuffer_.isModifiable()) {
                this.indexBuffer_ = GeneratedMessageLite.mutableCopy(this.indexBuffer_);
            }
        }

        /* access modifiers changed from: private */
        public void setIndexBuffer(int index, int value) {
            ensureIndexBufferIsMutable();
            this.indexBuffer_.setInt(index, value);
        }

        /* access modifiers changed from: private */
        public void addIndexBuffer(int value) {
            ensureIndexBufferIsMutable();
            this.indexBuffer_.addInt(value);
        }

        /* access modifiers changed from: private */
        public void addAllIndexBuffer(Iterable<? extends Integer> values) {
            ensureIndexBufferIsMutable();
            AbstractMessageLite.addAll(values, this.indexBuffer_);
        }

        /* access modifiers changed from: private */
        public void clearIndexBuffer() {
            this.indexBuffer_ = emptyIntList();
        }

        public static Mesh3d parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Mesh3d parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Mesh3d parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Mesh3d parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Mesh3d parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Mesh3d parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Mesh3d parseFrom(InputStream input) throws IOException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Mesh3d parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Mesh3d parseDelimitedFrom(InputStream input) throws IOException {
            return (Mesh3d) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Mesh3d parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Mesh3d) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Mesh3d parseFrom(CodedInputStream input) throws IOException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Mesh3d parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Mesh3d) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Mesh3d prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Mesh3d, Builder> implements Mesh3dOrBuilder {
            private Builder() {
                super(Mesh3d.DEFAULT_INSTANCE);
            }

            public boolean hasVertexType() {
                return ((Mesh3d) this.instance).hasVertexType();
            }

            public VertexType getVertexType() {
                return ((Mesh3d) this.instance).getVertexType();
            }

            public Builder setVertexType(VertexType value) {
                copyOnWrite();
                ((Mesh3d) this.instance).setVertexType(value);
                return this;
            }

            public Builder clearVertexType() {
                copyOnWrite();
                ((Mesh3d) this.instance).clearVertexType();
                return this;
            }

            public boolean hasPrimitiveType() {
                return ((Mesh3d) this.instance).hasPrimitiveType();
            }

            public PrimitiveType getPrimitiveType() {
                return ((Mesh3d) this.instance).getPrimitiveType();
            }

            public Builder setPrimitiveType(PrimitiveType value) {
                copyOnWrite();
                ((Mesh3d) this.instance).setPrimitiveType(value);
                return this;
            }

            public Builder clearPrimitiveType() {
                copyOnWrite();
                ((Mesh3d) this.instance).clearPrimitiveType();
                return this;
            }

            public List<Float> getVertexBufferList() {
                return Collections.unmodifiableList(((Mesh3d) this.instance).getVertexBufferList());
            }

            public int getVertexBufferCount() {
                return ((Mesh3d) this.instance).getVertexBufferCount();
            }

            public float getVertexBuffer(int index) {
                return ((Mesh3d) this.instance).getVertexBuffer(index);
            }

            public Builder setVertexBuffer(int index, float value) {
                copyOnWrite();
                ((Mesh3d) this.instance).setVertexBuffer(index, value);
                return this;
            }

            public Builder addVertexBuffer(float value) {
                copyOnWrite();
                ((Mesh3d) this.instance).addVertexBuffer(value);
                return this;
            }

            public Builder addAllVertexBuffer(Iterable<? extends Float> values) {
                copyOnWrite();
                ((Mesh3d) this.instance).addAllVertexBuffer(values);
                return this;
            }

            public Builder clearVertexBuffer() {
                copyOnWrite();
                ((Mesh3d) this.instance).clearVertexBuffer();
                return this;
            }

            public List<Integer> getIndexBufferList() {
                return Collections.unmodifiableList(((Mesh3d) this.instance).getIndexBufferList());
            }

            public int getIndexBufferCount() {
                return ((Mesh3d) this.instance).getIndexBufferCount();
            }

            public int getIndexBuffer(int index) {
                return ((Mesh3d) this.instance).getIndexBuffer(index);
            }

            public Builder setIndexBuffer(int index, int value) {
                copyOnWrite();
                ((Mesh3d) this.instance).setIndexBuffer(index, value);
                return this;
            }

            public Builder addIndexBuffer(int value) {
                copyOnWrite();
                ((Mesh3d) this.instance).addIndexBuffer(value);
                return this;
            }

            public Builder addAllIndexBuffer(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((Mesh3d) this.instance).addAllIndexBuffer(values);
                return this;
            }

            public Builder clearIndexBuffer() {
                copyOnWrite();
                ((Mesh3d) this.instance).clearIndexBuffer();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Mesh3d();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0013\u0004\u001d", new Object[]{"bitField0_", "vertexType_", VertexType.internalGetVerifier(), "primitiveType_", PrimitiveType.internalGetVerifier(), "vertexBuffer_", "indexBuffer_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Mesh3d> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Mesh3d.class) {
                        try {
                            Parser<Mesh3d> parser2 = PARSER;
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
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            Mesh3d defaultInstance = new Mesh3d();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Mesh3d.class, defaultInstance);
        }

        public static Mesh3d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Mesh3d> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
