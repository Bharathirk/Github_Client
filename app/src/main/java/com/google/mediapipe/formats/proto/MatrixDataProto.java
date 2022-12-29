package com.google.mediapipe.formats.proto;

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

public final class MatrixDataProto {

    public interface MatrixDataOrBuilder extends MessageLiteOrBuilder {
        int getCols();

        MatrixData.Layout getLayout();

        float getPackedData(int i);

        int getPackedDataCount();

        List<Float> getPackedDataList();

        int getRows();

        boolean hasCols();

        boolean hasLayout();

        boolean hasRows();
    }

    private MatrixDataProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class MatrixData extends GeneratedMessageLite<MatrixData, MatrixData.Builder> implements MatrixDataOrBuilder {
        public static final int COLS_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final MatrixData DEFAULT_INSTANCE;
        public static final int LAYOUT_FIELD_NUMBER = 4;
        public static final int PACKED_DATA_FIELD_NUMBER = 3;
        private static volatile Parser<MatrixData> PARSER = null;
        public static final int ROWS_FIELD_NUMBER = 1;
        private int bitField0_;
        private int cols_;
        private int layout_;
        private int packedDataMemoizedSerializedSize = -1;
        private Internal.FloatList packedData_ = emptyFloatList();
        private int rows_;

        private MatrixData() {
        }

        public enum Layout implements Internal.EnumLite {
            COLUMN_MAJOR(0),
            ROW_MAJOR(1);
            
            public static final int COLUMN_MAJOR_VALUE = 0;
            public static final int ROW_MAJOR_VALUE = 1;
            private static final Internal.EnumLiteMap<Layout> internalValueMap = new Internal.EnumLiteMap<Layout>() {
                public Layout findValueByNumber(int number) {
                    return Layout.forNumber(number);
                }
            };
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static Layout valueOf(int value2) {
                return forNumber(value2);
            }

            public static Layout forNumber(int value2) {
                switch (value2) {
                    case 0:
                        return COLUMN_MAJOR;
                    case 1:
                        return ROW_MAJOR;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<Layout> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return LayoutVerifier.INSTANCE;
            }

            private static final class LayoutVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new LayoutVerifier();

                private LayoutVerifier() {
                }

                public boolean isInRange(int number) {
                    return Layout.forNumber(number) != null;
                }
            }

            private Layout(int value2) {
                this.value = value2;
            }
        }

        public boolean hasRows() {
            return (this.bitField0_ & 1) != 0;
        }

        public int getRows() {
            return this.rows_;
        }

        /* access modifiers changed from: private */
        public void setRows(int value) {
            this.bitField0_ |= 1;
            this.rows_ = value;
        }

        /* access modifiers changed from: private */
        public void clearRows() {
            this.bitField0_ &= -2;
            this.rows_ = 0;
        }

        public boolean hasCols() {
            return (this.bitField0_ & 2) != 0;
        }

        public int getCols() {
            return this.cols_;
        }

        /* access modifiers changed from: private */
        public void setCols(int value) {
            this.bitField0_ |= 2;
            this.cols_ = value;
        }

        /* access modifiers changed from: private */
        public void clearCols() {
            this.bitField0_ &= -3;
            this.cols_ = 0;
        }

        public List<Float> getPackedDataList() {
            return this.packedData_;
        }

        public int getPackedDataCount() {
            return this.packedData_.size();
        }

        public float getPackedData(int index) {
            return this.packedData_.getFloat(index);
        }

        private void ensurePackedDataIsMutable() {
            if (!this.packedData_.isModifiable()) {
                this.packedData_ = GeneratedMessageLite.mutableCopy(this.packedData_);
            }
        }

        /* access modifiers changed from: private */
        public void setPackedData(int index, float value) {
            ensurePackedDataIsMutable();
            this.packedData_.setFloat(index, value);
        }

        /* access modifiers changed from: private */
        public void addPackedData(float value) {
            ensurePackedDataIsMutable();
            this.packedData_.addFloat(value);
        }

        /* access modifiers changed from: private */
        public void addAllPackedData(Iterable<? extends Float> values) {
            ensurePackedDataIsMutable();
            AbstractMessageLite.addAll(values, this.packedData_);
        }

        /* access modifiers changed from: private */
        public void clearPackedData() {
            this.packedData_ = emptyFloatList();
        }

        public boolean hasLayout() {
            return (this.bitField0_ & 4) != 0;
        }

        public Layout getLayout() {
            Layout result = Layout.forNumber(this.layout_);
            return result == null ? Layout.COLUMN_MAJOR : result;
        }

        /* access modifiers changed from: private */
        public void setLayout(Layout value) {
            this.layout_ = value.getNumber();
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearLayout() {
            this.bitField0_ &= -5;
            this.layout_ = 0;
        }

        public static MatrixData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static MatrixData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static MatrixData parseFrom(InputStream input) throws IOException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MatrixData parseDelimitedFrom(InputStream input) throws IOException {
            return (MatrixData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static MatrixData parseFrom(CodedInputStream input) throws IOException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static MatrixData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (MatrixData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(MatrixData prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<MatrixData, Builder> implements MatrixDataOrBuilder {
            private Builder() {
                super(MatrixData.DEFAULT_INSTANCE);
            }

            public boolean hasRows() {
                return ((MatrixData) this.instance).hasRows();
            }

            public int getRows() {
                return ((MatrixData) this.instance).getRows();
            }

            public Builder setRows(int value) {
                copyOnWrite();
                ((MatrixData) this.instance).setRows(value);
                return this;
            }

            public Builder clearRows() {
                copyOnWrite();
                ((MatrixData) this.instance).clearRows();
                return this;
            }

            public boolean hasCols() {
                return ((MatrixData) this.instance).hasCols();
            }

            public int getCols() {
                return ((MatrixData) this.instance).getCols();
            }

            public Builder setCols(int value) {
                copyOnWrite();
                ((MatrixData) this.instance).setCols(value);
                return this;
            }

            public Builder clearCols() {
                copyOnWrite();
                ((MatrixData) this.instance).clearCols();
                return this;
            }

            public List<Float> getPackedDataList() {
                return Collections.unmodifiableList(((MatrixData) this.instance).getPackedDataList());
            }

            public int getPackedDataCount() {
                return ((MatrixData) this.instance).getPackedDataCount();
            }

            public float getPackedData(int index) {
                return ((MatrixData) this.instance).getPackedData(index);
            }

            public Builder setPackedData(int index, float value) {
                copyOnWrite();
                ((MatrixData) this.instance).setPackedData(index, value);
                return this;
            }

            public Builder addPackedData(float value) {
                copyOnWrite();
                ((MatrixData) this.instance).addPackedData(value);
                return this;
            }

            public Builder addAllPackedData(Iterable<? extends Float> values) {
                copyOnWrite();
                ((MatrixData) this.instance).addAllPackedData(values);
                return this;
            }

            public Builder clearPackedData() {
                copyOnWrite();
                ((MatrixData) this.instance).clearPackedData();
                return this;
            }

            public boolean hasLayout() {
                return ((MatrixData) this.instance).hasLayout();
            }

            public Layout getLayout() {
                return ((MatrixData) this.instance).getLayout();
            }

            public Builder setLayout(Layout value) {
                copyOnWrite();
                ((MatrixData) this.instance).setLayout(value);
                return this;
            }

            public Builder clearLayout() {
                copyOnWrite();
                ((MatrixData) this.instance).clearLayout();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new MatrixData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003$\u0004\f\u0002", new Object[]{"bitField0_", "rows_", "cols_", "packedData_", "layout_", Layout.internalGetVerifier()});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<MatrixData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (MatrixData.class) {
                        try {
                            Parser<MatrixData> parser2 = PARSER;
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
            MatrixData defaultInstance = new MatrixData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(MatrixData.class, defaultInstance);
        }

        public static MatrixData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<MatrixData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
