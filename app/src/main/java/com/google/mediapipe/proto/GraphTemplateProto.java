package com.google.mediapipe.proto;

import com.google.mediapipe.proto.CalculatorOptionsProto;
import com.google.mediapipe.proto.CalculatorProto;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import mediapipe.ProtoDescriptor;

public final class GraphTemplateProto {

    public interface CalculatorGraphTemplateOrBuilder extends MessageLiteOrBuilder {
        CalculatorProto.CalculatorGraphConfig getConfig();

        TemplateExpression getRule(int i);

        int getRuleCount();

        List<TemplateExpression> getRuleList();

        boolean hasConfig();
    }

    public interface TemplateArgumentOrBuilder extends MessageLiteOrBuilder {
        TemplateDict getDict();

        TemplateArgument getElement(int i);

        int getElementCount();

        List<TemplateArgument> getElementList();

        double getNum();

        TemplateArgument.ParamValueCase getParamValueCase();

        String getStr();

        ByteString getStrBytes();

        boolean hasDict();

        boolean hasNum();

        boolean hasStr();
    }

    public interface TemplateDictOrBuilder extends MessageLiteOrBuilder {
        TemplateDict.Parameter getArg(int i);

        int getArgCount();

        List<TemplateDict.Parameter> getArgList();
    }

    public interface TemplateExpressionOrBuilder extends MessageLiteOrBuilder {
        TemplateExpression getArg(int i);

        int getArgCount();

        List<TemplateExpression> getArgList();

        ProtoDescriptor.FieldDescriptorProto.Type getFieldType();

        String getFieldValue();

        ByteString getFieldValueBytes();

        String getOp();

        ByteString getOpBytes();

        String getParam();

        ByteString getParamBytes();

        String getPath();

        ByteString getPathBytes();

        boolean hasFieldType();

        boolean hasFieldValue();

        boolean hasOp();

        boolean hasParam();

        boolean hasPath();
    }

    public interface TemplateSubgraphOptionsOrBuilder extends MessageLiteOrBuilder {
        TemplateDict getDict();

        boolean hasDict();
    }

    private GraphTemplateProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
        registry.add((GeneratedMessageLite.GeneratedExtension<?, ?>) TemplateSubgraphOptions.ext);
    }

    public static final class TemplateExpression extends GeneratedMessageLite<TemplateExpression, TemplateExpression.Builder> implements TemplateExpressionOrBuilder {
        public static final int ARG_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final TemplateExpression DEFAULT_INSTANCE;
        public static final int FIELD_TYPE_FIELD_NUMBER = 5;
        public static final int FIELD_VALUE_FIELD_NUMBER = 7;
        public static final int OP_FIELD_NUMBER = 2;
        public static final int PARAM_FIELD_NUMBER = 1;
        private static volatile Parser<TemplateExpression> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 4;
        private Internal.ProtobufList<TemplateExpression> arg_ = emptyProtobufList();
        private int bitField0_;
        private int fieldType_;
        private String fieldValue_ = "";
        private String op_ = "";
        private String param_ = "";
        private String path_ = "";

        private TemplateExpression() {
        }

        public boolean hasParam() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getParam() {
            return this.param_;
        }

        public ByteString getParamBytes() {
            return ByteString.copyFromUtf8(this.param_);
        }

        /* access modifiers changed from: private */
        public void setParam(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.param_ = value;
        }

        /* access modifiers changed from: private */
        public void clearParam() {
            this.bitField0_ &= -2;
            this.param_ = getDefaultInstance().getParam();
        }

        /* access modifiers changed from: private */
        public void setParamBytes(ByteString value) {
            this.param_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasOp() {
            return (this.bitField0_ & 2) != 0;
        }

        public String getOp() {
            return this.op_;
        }

        public ByteString getOpBytes() {
            return ByteString.copyFromUtf8(this.op_);
        }

        /* access modifiers changed from: private */
        public void setOp(String value) {
            value.getClass();
            this.bitField0_ |= 2;
            this.op_ = value;
        }

        /* access modifiers changed from: private */
        public void clearOp() {
            this.bitField0_ &= -3;
            this.op_ = getDefaultInstance().getOp();
        }

        /* access modifiers changed from: private */
        public void setOpBytes(ByteString value) {
            this.op_ = value.toStringUtf8();
            this.bitField0_ |= 2;
        }

        public List<TemplateExpression> getArgList() {
            return this.arg_;
        }

        public List<? extends TemplateExpressionOrBuilder> getArgOrBuilderList() {
            return this.arg_;
        }

        public int getArgCount() {
            return this.arg_.size();
        }

        public TemplateExpression getArg(int index) {
            return (TemplateExpression) this.arg_.get(index);
        }

        public TemplateExpressionOrBuilder getArgOrBuilder(int index) {
            return (TemplateExpressionOrBuilder) this.arg_.get(index);
        }

        private void ensureArgIsMutable() {
            if (!this.arg_.isModifiable()) {
                this.arg_ = GeneratedMessageLite.mutableCopy(this.arg_);
            }
        }

        /* access modifiers changed from: private */
        public void setArg(int index, TemplateExpression value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addArg(TemplateExpression value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.add(value);
        }

        /* access modifiers changed from: private */
        public void addArg(int index, TemplateExpression value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllArg(Iterable<? extends TemplateExpression> values) {
            ensureArgIsMutable();
            AbstractMessageLite.addAll(values, this.arg_);
        }

        /* access modifiers changed from: private */
        public void clearArg() {
            this.arg_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeArg(int index) {
            ensureArgIsMutable();
            this.arg_.remove(index);
        }

        public boolean hasPath() {
            return (this.bitField0_ & 4) != 0;
        }

        public String getPath() {
            return this.path_;
        }

        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8(this.path_);
        }

        /* access modifiers changed from: private */
        public void setPath(String value) {
            value.getClass();
            this.bitField0_ |= 4;
            this.path_ = value;
        }

        /* access modifiers changed from: private */
        public void clearPath() {
            this.bitField0_ &= -5;
            this.path_ = getDefaultInstance().getPath();
        }

        /* access modifiers changed from: private */
        public void setPathBytes(ByteString value) {
            this.path_ = value.toStringUtf8();
            this.bitField0_ |= 4;
        }

        public boolean hasFieldType() {
            return (this.bitField0_ & 8) != 0;
        }

        public ProtoDescriptor.FieldDescriptorProto.Type getFieldType() {
            ProtoDescriptor.FieldDescriptorProto.Type result = ProtoDescriptor.FieldDescriptorProto.Type.forNumber(this.fieldType_);
            return result == null ? ProtoDescriptor.FieldDescriptorProto.Type.TYPE_INVALID : result;
        }

        /* access modifiers changed from: private */
        public void setFieldType(ProtoDescriptor.FieldDescriptorProto.Type value) {
            this.fieldType_ = value.getNumber();
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearFieldType() {
            this.bitField0_ &= -9;
            this.fieldType_ = 0;
        }

        public boolean hasFieldValue() {
            return (this.bitField0_ & 16) != 0;
        }

        public String getFieldValue() {
            return this.fieldValue_;
        }

        public ByteString getFieldValueBytes() {
            return ByteString.copyFromUtf8(this.fieldValue_);
        }

        /* access modifiers changed from: private */
        public void setFieldValue(String value) {
            value.getClass();
            this.bitField0_ |= 16;
            this.fieldValue_ = value;
        }

        /* access modifiers changed from: private */
        public void clearFieldValue() {
            this.bitField0_ &= -17;
            this.fieldValue_ = getDefaultInstance().getFieldValue();
        }

        /* access modifiers changed from: private */
        public void setFieldValueBytes(ByteString value) {
            this.fieldValue_ = value.toStringUtf8();
            this.bitField0_ |= 16;
        }

        public static TemplateExpression parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateExpression parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateExpression parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateExpression parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateExpression parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateExpression parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateExpression parseFrom(InputStream input) throws IOException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateExpression parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateExpression parseDelimitedFrom(InputStream input) throws IOException {
            return (TemplateExpression) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateExpression parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateExpression) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateExpression parseFrom(CodedInputStream input) throws IOException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateExpression parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateExpression) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TemplateExpression prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TemplateExpression, Builder> implements TemplateExpressionOrBuilder {
            private Builder() {
                super(TemplateExpression.DEFAULT_INSTANCE);
            }

            public boolean hasParam() {
                return ((TemplateExpression) this.instance).hasParam();
            }

            public String getParam() {
                return ((TemplateExpression) this.instance).getParam();
            }

            public ByteString getParamBytes() {
                return ((TemplateExpression) this.instance).getParamBytes();
            }

            public Builder setParam(String value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setParam(value);
                return this;
            }

            public Builder clearParam() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearParam();
                return this;
            }

            public Builder setParamBytes(ByteString value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setParamBytes(value);
                return this;
            }

            public boolean hasOp() {
                return ((TemplateExpression) this.instance).hasOp();
            }

            public String getOp() {
                return ((TemplateExpression) this.instance).getOp();
            }

            public ByteString getOpBytes() {
                return ((TemplateExpression) this.instance).getOpBytes();
            }

            public Builder setOp(String value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setOp(value);
                return this;
            }

            public Builder clearOp() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearOp();
                return this;
            }

            public Builder setOpBytes(ByteString value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setOpBytes(value);
                return this;
            }

            public List<TemplateExpression> getArgList() {
                return Collections.unmodifiableList(((TemplateExpression) this.instance).getArgList());
            }

            public int getArgCount() {
                return ((TemplateExpression) this.instance).getArgCount();
            }

            public TemplateExpression getArg(int index) {
                return ((TemplateExpression) this.instance).getArg(index);
            }

            public Builder setArg(int index, TemplateExpression value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setArg(index, value);
                return this;
            }

            public Builder setArg(int index, Builder builderForValue) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setArg(index, (TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addArg(TemplateExpression value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).addArg(value);
                return this;
            }

            public Builder addArg(int index, TemplateExpression value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).addArg(index, value);
                return this;
            }

            public Builder addArg(Builder builderForValue) {
                copyOnWrite();
                ((TemplateExpression) this.instance).addArg((TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addArg(int index, Builder builderForValue) {
                copyOnWrite();
                ((TemplateExpression) this.instance).addArg(index, (TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addAllArg(Iterable<? extends TemplateExpression> values) {
                copyOnWrite();
                ((TemplateExpression) this.instance).addAllArg(values);
                return this;
            }

            public Builder clearArg() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearArg();
                return this;
            }

            public Builder removeArg(int index) {
                copyOnWrite();
                ((TemplateExpression) this.instance).removeArg(index);
                return this;
            }

            public boolean hasPath() {
                return ((TemplateExpression) this.instance).hasPath();
            }

            public String getPath() {
                return ((TemplateExpression) this.instance).getPath();
            }

            public ByteString getPathBytes() {
                return ((TemplateExpression) this.instance).getPathBytes();
            }

            public Builder setPath(String value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setPath(value);
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearPath();
                return this;
            }

            public Builder setPathBytes(ByteString value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setPathBytes(value);
                return this;
            }

            public boolean hasFieldType() {
                return ((TemplateExpression) this.instance).hasFieldType();
            }

            public ProtoDescriptor.FieldDescriptorProto.Type getFieldType() {
                return ((TemplateExpression) this.instance).getFieldType();
            }

            public Builder setFieldType(ProtoDescriptor.FieldDescriptorProto.Type value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setFieldType(value);
                return this;
            }

            public Builder clearFieldType() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearFieldType();
                return this;
            }

            public boolean hasFieldValue() {
                return ((TemplateExpression) this.instance).hasFieldValue();
            }

            public String getFieldValue() {
                return ((TemplateExpression) this.instance).getFieldValue();
            }

            public ByteString getFieldValueBytes() {
                return ((TemplateExpression) this.instance).getFieldValueBytes();
            }

            public Builder setFieldValue(String value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setFieldValue(value);
                return this;
            }

            public Builder clearFieldValue() {
                copyOnWrite();
                ((TemplateExpression) this.instance).clearFieldValue();
                return this;
            }

            public Builder setFieldValueBytes(ByteString value) {
                copyOnWrite();
                ((TemplateExpression) this.instance).setFieldValueBytes(value);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new TemplateExpression();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\b\u0002\u0005\f\u0003\u0007\b\u0004", new Object[]{"bitField0_", "param_", "op_", "arg_", TemplateExpression.class, "path_", "fieldType_", ProtoDescriptor.FieldDescriptorProto.Type.internalGetVerifier(), "fieldValue_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TemplateExpression> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TemplateExpression.class) {
                        try {
                            Parser<TemplateExpression> parser2 = PARSER;
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
            TemplateExpression defaultInstance = new TemplateExpression();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(TemplateExpression.class, defaultInstance);
        }

        public static TemplateExpression getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TemplateExpression> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class CalculatorGraphTemplate extends GeneratedMessageLite<CalculatorGraphTemplate, CalculatorGraphTemplate.Builder> implements CalculatorGraphTemplateOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final CalculatorGraphTemplate DEFAULT_INSTANCE;
        private static volatile Parser<CalculatorGraphTemplate> PARSER = null;
        public static final int RULE_FIELD_NUMBER = 2;
        private int bitField0_;
        private CalculatorProto.CalculatorGraphConfig config_;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<TemplateExpression> rule_ = emptyProtobufList();

        private CalculatorGraphTemplate() {
        }

        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        public CalculatorProto.CalculatorGraphConfig getConfig() {
            return this.config_ == null ? CalculatorProto.CalculatorGraphConfig.getDefaultInstance() : this.config_;
        }

        /* access modifiers changed from: private */
        public void setConfig(CalculatorProto.CalculatorGraphConfig value) {
            value.getClass();
            this.config_ = value;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeConfig(CalculatorProto.CalculatorGraphConfig value) {
            value.getClass();
            if (this.config_ == null || this.config_ == CalculatorProto.CalculatorGraphConfig.getDefaultInstance()) {
                this.config_ = value;
            } else {
                this.config_ = (CalculatorProto.CalculatorGraphConfig) ((CalculatorProto.CalculatorGraphConfig.Builder) CalculatorProto.CalculatorGraphConfig.newBuilder(this.config_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void clearConfig() {
            this.config_ = null;
            this.bitField0_ &= -2;
        }

        public List<TemplateExpression> getRuleList() {
            return this.rule_;
        }

        public List<? extends TemplateExpressionOrBuilder> getRuleOrBuilderList() {
            return this.rule_;
        }

        public int getRuleCount() {
            return this.rule_.size();
        }

        public TemplateExpression getRule(int index) {
            return (TemplateExpression) this.rule_.get(index);
        }

        public TemplateExpressionOrBuilder getRuleOrBuilder(int index) {
            return (TemplateExpressionOrBuilder) this.rule_.get(index);
        }

        private void ensureRuleIsMutable() {
            if (!this.rule_.isModifiable()) {
                this.rule_ = GeneratedMessageLite.mutableCopy(this.rule_);
            }
        }

        /* access modifiers changed from: private */
        public void setRule(int index, TemplateExpression value) {
            value.getClass();
            ensureRuleIsMutable();
            this.rule_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addRule(TemplateExpression value) {
            value.getClass();
            ensureRuleIsMutable();
            this.rule_.add(value);
        }

        /* access modifiers changed from: private */
        public void addRule(int index, TemplateExpression value) {
            value.getClass();
            ensureRuleIsMutable();
            this.rule_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllRule(Iterable<? extends TemplateExpression> values) {
            ensureRuleIsMutable();
            AbstractMessageLite.addAll(values, this.rule_);
        }

        /* access modifiers changed from: private */
        public void clearRule() {
            this.rule_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeRule(int index) {
            ensureRuleIsMutable();
            this.rule_.remove(index);
        }

        public static CalculatorGraphTemplate parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphTemplate parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphTemplate parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphTemplate parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphTemplate parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorGraphTemplate parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorGraphTemplate parseFrom(InputStream input) throws IOException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphTemplate parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorGraphTemplate parseDelimitedFrom(InputStream input) throws IOException {
            return (CalculatorGraphTemplate) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphTemplate parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphTemplate) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorGraphTemplate parseFrom(CodedInputStream input) throws IOException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorGraphTemplate parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorGraphTemplate) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CalculatorGraphTemplate prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CalculatorGraphTemplate, Builder> implements CalculatorGraphTemplateOrBuilder {
            private Builder() {
                super(CalculatorGraphTemplate.DEFAULT_INSTANCE);
            }

            public boolean hasConfig() {
                return ((CalculatorGraphTemplate) this.instance).hasConfig();
            }

            public CalculatorProto.CalculatorGraphConfig getConfig() {
                return ((CalculatorGraphTemplate) this.instance).getConfig();
            }

            public Builder setConfig(CalculatorProto.CalculatorGraphConfig value) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).setConfig(value);
                return this;
            }

            public Builder setConfig(CalculatorProto.CalculatorGraphConfig.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).setConfig((CalculatorProto.CalculatorGraphConfig) builderForValue.build());
                return this;
            }

            public Builder mergeConfig(CalculatorProto.CalculatorGraphConfig value) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).mergeConfig(value);
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).clearConfig();
                return this;
            }

            public List<TemplateExpression> getRuleList() {
                return Collections.unmodifiableList(((CalculatorGraphTemplate) this.instance).getRuleList());
            }

            public int getRuleCount() {
                return ((CalculatorGraphTemplate) this.instance).getRuleCount();
            }

            public TemplateExpression getRule(int index) {
                return ((CalculatorGraphTemplate) this.instance).getRule(index);
            }

            public Builder setRule(int index, TemplateExpression value) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).setRule(index, value);
                return this;
            }

            public Builder setRule(int index, TemplateExpression.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).setRule(index, (TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addRule(TemplateExpression value) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).addRule(value);
                return this;
            }

            public Builder addRule(int index, TemplateExpression value) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).addRule(index, value);
                return this;
            }

            public Builder addRule(TemplateExpression.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).addRule((TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addRule(int index, TemplateExpression.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).addRule(index, (TemplateExpression) builderForValue.build());
                return this;
            }

            public Builder addAllRule(Iterable<? extends TemplateExpression> values) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).addAllRule(values);
                return this;
            }

            public Builder clearRule() {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).clearRule();
                return this;
            }

            public Builder removeRule(int index) {
                copyOnWrite();
                ((CalculatorGraphTemplate) this.instance).removeRule(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new CalculatorGraphTemplate();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b", new Object[]{"bitField0_", "config_", "rule_", TemplateExpression.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CalculatorGraphTemplate> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CalculatorGraphTemplate.class) {
                        try {
                            Parser<CalculatorGraphTemplate> parser2 = PARSER;
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
            CalculatorGraphTemplate defaultInstance = new CalculatorGraphTemplate();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(CalculatorGraphTemplate.class, defaultInstance);
        }

        public static CalculatorGraphTemplate getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CalculatorGraphTemplate> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TemplateArgument extends GeneratedMessageLite<TemplateArgument, TemplateArgument.Builder> implements TemplateArgumentOrBuilder {
        /* access modifiers changed from: private */
        public static final TemplateArgument DEFAULT_INSTANCE;
        public static final int DICT_FIELD_NUMBER = 3;
        public static final int ELEMENT_FIELD_NUMBER = 4;
        public static final int NUM_FIELD_NUMBER = 2;
        private static volatile Parser<TemplateArgument> PARSER = null;
        public static final int STR_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<TemplateArgument> element_ = emptyProtobufList();
        private int paramValueCase_ = 0;
        private Object paramValue_;

        private TemplateArgument() {
        }

        public enum ParamValueCase {
            STR(1),
            NUM(2),
            DICT(3),
            PARAMVALUE_NOT_SET(0);
            
            private final int value;

            private ParamValueCase(int value2) {
                this.value = value2;
            }

            @Deprecated
            public static ParamValueCase valueOf(int value2) {
                return forNumber(value2);
            }

            public static ParamValueCase forNumber(int value2) {
                switch (value2) {
                    case 0:
                        return PARAMVALUE_NOT_SET;
                    case 1:
                        return STR;
                    case 2:
                        return NUM;
                    case 3:
                        return DICT;
                    default:
                        return null;
                }
            }

            public int getNumber() {
                return this.value;
            }
        }

        public ParamValueCase getParamValueCase() {
            return ParamValueCase.forNumber(this.paramValueCase_);
        }

        /* access modifiers changed from: private */
        public void clearParamValue() {
            this.paramValueCase_ = 0;
            this.paramValue_ = null;
        }

        public boolean hasStr() {
            return this.paramValueCase_ == 1;
        }

        public String getStr() {
            if (this.paramValueCase_ == 1) {
                return (String) this.paramValue_;
            }
            return "";
        }

        public ByteString getStrBytes() {
            String ref = "";
            if (this.paramValueCase_ == 1) {
                ref = (String) this.paramValue_;
            }
            return ByteString.copyFromUtf8(ref);
        }

        /* access modifiers changed from: private */
        public void setStr(String value) {
            value.getClass();
            this.paramValueCase_ = 1;
            this.paramValue_ = value;
        }

        /* access modifiers changed from: private */
        public void clearStr() {
            if (this.paramValueCase_ == 1) {
                this.paramValueCase_ = 0;
                this.paramValue_ = null;
            }
        }

        /* access modifiers changed from: private */
        public void setStrBytes(ByteString value) {
            this.paramValue_ = value.toStringUtf8();
            this.paramValueCase_ = 1;
        }

        public boolean hasNum() {
            return this.paramValueCase_ == 2;
        }

        public double getNum() {
            if (this.paramValueCase_ == 2) {
                return ((Double) this.paramValue_).doubleValue();
            }
            return 0.0d;
        }

        /* access modifiers changed from: private */
        public void setNum(double value) {
            this.paramValueCase_ = 2;
            this.paramValue_ = Double.valueOf(value);
        }

        /* access modifiers changed from: private */
        public void clearNum() {
            if (this.paramValueCase_ == 2) {
                this.paramValueCase_ = 0;
                this.paramValue_ = null;
            }
        }

        public boolean hasDict() {
            return this.paramValueCase_ == 3;
        }

        public TemplateDict getDict() {
            if (this.paramValueCase_ == 3) {
                return (TemplateDict) this.paramValue_;
            }
            return TemplateDict.getDefaultInstance();
        }

        /* access modifiers changed from: private */
        public void setDict(TemplateDict value) {
            value.getClass();
            this.paramValue_ = value;
            this.paramValueCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void mergeDict(TemplateDict value) {
            value.getClass();
            if (this.paramValueCase_ != 3 || this.paramValue_ == TemplateDict.getDefaultInstance()) {
                this.paramValue_ = value;
            } else {
                this.paramValue_ = ((TemplateDict.Builder) TemplateDict.newBuilder((TemplateDict) this.paramValue_).mergeFrom(value)).buildPartial();
            }
            this.paramValueCase_ = 3;
        }

        /* access modifiers changed from: private */
        public void clearDict() {
            if (this.paramValueCase_ == 3) {
                this.paramValueCase_ = 0;
                this.paramValue_ = null;
            }
        }

        public List<TemplateArgument> getElementList() {
            return this.element_;
        }

        public List<? extends TemplateArgumentOrBuilder> getElementOrBuilderList() {
            return this.element_;
        }

        public int getElementCount() {
            return this.element_.size();
        }

        public TemplateArgument getElement(int index) {
            return (TemplateArgument) this.element_.get(index);
        }

        public TemplateArgumentOrBuilder getElementOrBuilder(int index) {
            return (TemplateArgumentOrBuilder) this.element_.get(index);
        }

        private void ensureElementIsMutable() {
            if (!this.element_.isModifiable()) {
                this.element_ = GeneratedMessageLite.mutableCopy(this.element_);
            }
        }

        /* access modifiers changed from: private */
        public void setElement(int index, TemplateArgument value) {
            value.getClass();
            ensureElementIsMutable();
            this.element_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addElement(TemplateArgument value) {
            value.getClass();
            ensureElementIsMutable();
            this.element_.add(value);
        }

        /* access modifiers changed from: private */
        public void addElement(int index, TemplateArgument value) {
            value.getClass();
            ensureElementIsMutable();
            this.element_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllElement(Iterable<? extends TemplateArgument> values) {
            ensureElementIsMutable();
            AbstractMessageLite.addAll(values, this.element_);
        }

        /* access modifiers changed from: private */
        public void clearElement() {
            this.element_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeElement(int index) {
            ensureElementIsMutable();
            this.element_.remove(index);
        }

        public static TemplateArgument parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateArgument parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateArgument parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateArgument parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateArgument parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateArgument parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateArgument parseFrom(InputStream input) throws IOException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateArgument parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateArgument parseDelimitedFrom(InputStream input) throws IOException {
            return (TemplateArgument) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateArgument parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateArgument) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateArgument parseFrom(CodedInputStream input) throws IOException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateArgument parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateArgument) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TemplateArgument prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TemplateArgument, Builder> implements TemplateArgumentOrBuilder {
            private Builder() {
                super(TemplateArgument.DEFAULT_INSTANCE);
            }

            public ParamValueCase getParamValueCase() {
                return ((TemplateArgument) this.instance).getParamValueCase();
            }

            public Builder clearParamValue() {
                copyOnWrite();
                ((TemplateArgument) this.instance).clearParamValue();
                return this;
            }

            public boolean hasStr() {
                return ((TemplateArgument) this.instance).hasStr();
            }

            public String getStr() {
                return ((TemplateArgument) this.instance).getStr();
            }

            public ByteString getStrBytes() {
                return ((TemplateArgument) this.instance).getStrBytes();
            }

            public Builder setStr(String value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setStr(value);
                return this;
            }

            public Builder clearStr() {
                copyOnWrite();
                ((TemplateArgument) this.instance).clearStr();
                return this;
            }

            public Builder setStrBytes(ByteString value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setStrBytes(value);
                return this;
            }

            public boolean hasNum() {
                return ((TemplateArgument) this.instance).hasNum();
            }

            public double getNum() {
                return ((TemplateArgument) this.instance).getNum();
            }

            public Builder setNum(double value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setNum(value);
                return this;
            }

            public Builder clearNum() {
                copyOnWrite();
                ((TemplateArgument) this.instance).clearNum();
                return this;
            }

            public boolean hasDict() {
                return ((TemplateArgument) this.instance).hasDict();
            }

            public TemplateDict getDict() {
                return ((TemplateArgument) this.instance).getDict();
            }

            public Builder setDict(TemplateDict value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setDict(value);
                return this;
            }

            public Builder setDict(TemplateDict.Builder builderForValue) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setDict((TemplateDict) builderForValue.build());
                return this;
            }

            public Builder mergeDict(TemplateDict value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).mergeDict(value);
                return this;
            }

            public Builder clearDict() {
                copyOnWrite();
                ((TemplateArgument) this.instance).clearDict();
                return this;
            }

            public List<TemplateArgument> getElementList() {
                return Collections.unmodifiableList(((TemplateArgument) this.instance).getElementList());
            }

            public int getElementCount() {
                return ((TemplateArgument) this.instance).getElementCount();
            }

            public TemplateArgument getElement(int index) {
                return ((TemplateArgument) this.instance).getElement(index);
            }

            public Builder setElement(int index, TemplateArgument value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setElement(index, value);
                return this;
            }

            public Builder setElement(int index, Builder builderForValue) {
                copyOnWrite();
                ((TemplateArgument) this.instance).setElement(index, (TemplateArgument) builderForValue.build());
                return this;
            }

            public Builder addElement(TemplateArgument value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).addElement(value);
                return this;
            }

            public Builder addElement(int index, TemplateArgument value) {
                copyOnWrite();
                ((TemplateArgument) this.instance).addElement(index, value);
                return this;
            }

            public Builder addElement(Builder builderForValue) {
                copyOnWrite();
                ((TemplateArgument) this.instance).addElement((TemplateArgument) builderForValue.build());
                return this;
            }

            public Builder addElement(int index, Builder builderForValue) {
                copyOnWrite();
                ((TemplateArgument) this.instance).addElement(index, (TemplateArgument) builderForValue.build());
                return this;
            }

            public Builder addAllElement(Iterable<? extends TemplateArgument> values) {
                copyOnWrite();
                ((TemplateArgument) this.instance).addAllElement(values);
                return this;
            }

            public Builder clearElement() {
                copyOnWrite();
                ((TemplateArgument) this.instance).clearElement();
                return this;
            }

            public Builder removeElement(int index) {
                copyOnWrite();
                ((TemplateArgument) this.instance).removeElement(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new TemplateArgument();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001;\u0000\u00023\u0000\u0003<\u0000\u0004\u001b", new Object[]{"paramValue_", "paramValueCase_", "bitField0_", TemplateDict.class, "element_", TemplateArgument.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TemplateArgument> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TemplateArgument.class) {
                        try {
                            Parser<TemplateArgument> parser2 = PARSER;
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
            TemplateArgument defaultInstance = new TemplateArgument();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(TemplateArgument.class, defaultInstance);
        }

        public static TemplateArgument getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TemplateArgument> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TemplateDict extends GeneratedMessageLite<TemplateDict, TemplateDict.Builder> implements TemplateDictOrBuilder {
        public static final int ARG_FIELD_NUMBER = 1;
        /* access modifiers changed from: private */
        public static final TemplateDict DEFAULT_INSTANCE;
        private static volatile Parser<TemplateDict> PARSER;
        private Internal.ProtobufList<Parameter> arg_ = emptyProtobufList();

        public interface ParameterOrBuilder extends MessageLiteOrBuilder {
            String getKey();

            ByteString getKeyBytes();

            TemplateArgument getValue();

            boolean hasKey();

            boolean hasValue();
        }

        private TemplateDict() {
        }

        public static final class Parameter extends GeneratedMessageLite<Parameter, Parameter.Builder> implements ParameterOrBuilder {
            /* access modifiers changed from: private */
            public static final Parameter DEFAULT_INSTANCE;
            public static final int KEY_FIELD_NUMBER = 1;
            private static volatile Parser<Parameter> PARSER = null;
            public static final int VALUE_FIELD_NUMBER = 2;
            private int bitField0_;
            private String key_ = "";
            private TemplateArgument value_;

            private Parameter() {
            }

            public boolean hasKey() {
                return (this.bitField0_ & 1) != 0;
            }

            public String getKey() {
                return this.key_;
            }

            public ByteString getKeyBytes() {
                return ByteString.copyFromUtf8(this.key_);
            }

            /* access modifiers changed from: private */
            public void setKey(String value) {
                value.getClass();
                this.bitField0_ |= 1;
                this.key_ = value;
            }

            /* access modifiers changed from: private */
            public void clearKey() {
                this.bitField0_ &= -2;
                this.key_ = getDefaultInstance().getKey();
            }

            /* access modifiers changed from: private */
            public void setKeyBytes(ByteString value) {
                this.key_ = value.toStringUtf8();
                this.bitField0_ |= 1;
            }

            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            public TemplateArgument getValue() {
                return this.value_ == null ? TemplateArgument.getDefaultInstance() : this.value_;
            }

            /* access modifiers changed from: private */
            public void setValue(TemplateArgument value) {
                value.getClass();
                this.value_ = value;
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void mergeValue(TemplateArgument value) {
                value.getClass();
                if (this.value_ == null || this.value_ == TemplateArgument.getDefaultInstance()) {
                    this.value_ = value;
                } else {
                    this.value_ = (TemplateArgument) ((TemplateArgument.Builder) TemplateArgument.newBuilder(this.value_).mergeFrom(value)).buildPartial();
                }
                this.bitField0_ |= 2;
            }

            /* access modifiers changed from: private */
            public void clearValue() {
                this.value_ = null;
                this.bitField0_ &= -3;
            }

            public static Parameter parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Parameter parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Parameter parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Parameter parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Parameter parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Parameter parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Parameter parseFrom(InputStream input) throws IOException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Parameter parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Parameter parseDelimitedFrom(InputStream input) throws IOException {
                return (Parameter) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Parameter parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Parameter) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Parameter parseFrom(CodedInputStream input) throws IOException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Parameter parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Parameter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Parameter prototype) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Parameter, Builder> implements ParameterOrBuilder {
                private Builder() {
                    super(Parameter.DEFAULT_INSTANCE);
                }

                public boolean hasKey() {
                    return ((Parameter) this.instance).hasKey();
                }

                public String getKey() {
                    return ((Parameter) this.instance).getKey();
                }

                public ByteString getKeyBytes() {
                    return ((Parameter) this.instance).getKeyBytes();
                }

                public Builder setKey(String value) {
                    copyOnWrite();
                    ((Parameter) this.instance).setKey(value);
                    return this;
                }

                public Builder clearKey() {
                    copyOnWrite();
                    ((Parameter) this.instance).clearKey();
                    return this;
                }

                public Builder setKeyBytes(ByteString value) {
                    copyOnWrite();
                    ((Parameter) this.instance).setKeyBytes(value);
                    return this;
                }

                public boolean hasValue() {
                    return ((Parameter) this.instance).hasValue();
                }

                public TemplateArgument getValue() {
                    return ((Parameter) this.instance).getValue();
                }

                public Builder setValue(TemplateArgument value) {
                    copyOnWrite();
                    ((Parameter) this.instance).setValue(value);
                    return this;
                }

                public Builder setValue(TemplateArgument.Builder builderForValue) {
                    copyOnWrite();
                    ((Parameter) this.instance).setValue((TemplateArgument) builderForValue.build());
                    return this;
                }

                public Builder mergeValue(TemplateArgument value) {
                    copyOnWrite();
                    ((Parameter) this.instance).mergeValue(value);
                    return this;
                }

                public Builder clearValue() {
                    copyOnWrite();
                    ((Parameter) this.instance).clearValue();
                    return this;
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Parameter();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001", new Object[]{"bitField0_", "key_", "value_"});
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Parameter> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Parameter.class) {
                            try {
                                Parser<Parameter> parser2 = PARSER;
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
                Parameter defaultInstance = new Parameter();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Parameter.class, defaultInstance);
            }

            public static Parameter getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Parameter> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public List<Parameter> getArgList() {
            return this.arg_;
        }

        public List<? extends ParameterOrBuilder> getArgOrBuilderList() {
            return this.arg_;
        }

        public int getArgCount() {
            return this.arg_.size();
        }

        public Parameter getArg(int index) {
            return (Parameter) this.arg_.get(index);
        }

        public ParameterOrBuilder getArgOrBuilder(int index) {
            return (ParameterOrBuilder) this.arg_.get(index);
        }

        private void ensureArgIsMutable() {
            if (!this.arg_.isModifiable()) {
                this.arg_ = GeneratedMessageLite.mutableCopy(this.arg_);
            }
        }

        /* access modifiers changed from: private */
        public void setArg(int index, Parameter value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addArg(Parameter value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.add(value);
        }

        /* access modifiers changed from: private */
        public void addArg(int index, Parameter value) {
            value.getClass();
            ensureArgIsMutable();
            this.arg_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllArg(Iterable<? extends Parameter> values) {
            ensureArgIsMutable();
            AbstractMessageLite.addAll(values, this.arg_);
        }

        /* access modifiers changed from: private */
        public void clearArg() {
            this.arg_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeArg(int index) {
            ensureArgIsMutable();
            this.arg_.remove(index);
        }

        public static TemplateDict parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateDict parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateDict parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateDict parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateDict parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateDict parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateDict parseFrom(InputStream input) throws IOException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateDict parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateDict parseDelimitedFrom(InputStream input) throws IOException {
            return (TemplateDict) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateDict parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateDict) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateDict parseFrom(CodedInputStream input) throws IOException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateDict parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateDict) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TemplateDict prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TemplateDict, Builder> implements TemplateDictOrBuilder {
            private Builder() {
                super(TemplateDict.DEFAULT_INSTANCE);
            }

            public List<Parameter> getArgList() {
                return Collections.unmodifiableList(((TemplateDict) this.instance).getArgList());
            }

            public int getArgCount() {
                return ((TemplateDict) this.instance).getArgCount();
            }

            public Parameter getArg(int index) {
                return ((TemplateDict) this.instance).getArg(index);
            }

            public Builder setArg(int index, Parameter value) {
                copyOnWrite();
                ((TemplateDict) this.instance).setArg(index, value);
                return this;
            }

            public Builder setArg(int index, Parameter.Builder builderForValue) {
                copyOnWrite();
                ((TemplateDict) this.instance).setArg(index, (Parameter) builderForValue.build());
                return this;
            }

            public Builder addArg(Parameter value) {
                copyOnWrite();
                ((TemplateDict) this.instance).addArg(value);
                return this;
            }

            public Builder addArg(int index, Parameter value) {
                copyOnWrite();
                ((TemplateDict) this.instance).addArg(index, value);
                return this;
            }

            public Builder addArg(Parameter.Builder builderForValue) {
                copyOnWrite();
                ((TemplateDict) this.instance).addArg((Parameter) builderForValue.build());
                return this;
            }

            public Builder addArg(int index, Parameter.Builder builderForValue) {
                copyOnWrite();
                ((TemplateDict) this.instance).addArg(index, (Parameter) builderForValue.build());
                return this;
            }

            public Builder addAllArg(Iterable<? extends Parameter> values) {
                copyOnWrite();
                ((TemplateDict) this.instance).addAllArg(values);
                return this;
            }

            public Builder clearArg() {
                copyOnWrite();
                ((TemplateDict) this.instance).clearArg();
                return this;
            }

            public Builder removeArg(int index) {
                copyOnWrite();
                ((TemplateDict) this.instance).removeArg(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new TemplateDict();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"arg_", Parameter.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TemplateDict> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TemplateDict.class) {
                        try {
                            Parser<TemplateDict> parser2 = PARSER;
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
            TemplateDict defaultInstance = new TemplateDict();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(TemplateDict.class, defaultInstance);
        }

        public static TemplateDict getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TemplateDict> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class TemplateSubgraphOptions extends GeneratedMessageLite<TemplateSubgraphOptions, TemplateSubgraphOptions.Builder> implements TemplateSubgraphOptionsOrBuilder {
        /* access modifiers changed from: private */
        public static final TemplateSubgraphOptions DEFAULT_INSTANCE;
        public static final int DICT_FIELD_NUMBER = 1;
        public static final int EXT_FIELD_NUMBER = 172998261;
        private static volatile Parser<TemplateSubgraphOptions> PARSER;
        public static final GeneratedMessageLite.GeneratedExtension<CalculatorOptionsProto.CalculatorOptions, TemplateSubgraphOptions> ext = GeneratedMessageLite.newSingularGeneratedExtension(CalculatorOptionsProto.CalculatorOptions.getDefaultInstance(), getDefaultInstance(), getDefaultInstance(), (Internal.EnumLiteMap<?>) null, EXT_FIELD_NUMBER, WireFormat.FieldType.MESSAGE, TemplateSubgraphOptions.class);
        private int bitField0_;
        private TemplateDict dict_;

        private TemplateSubgraphOptions() {
        }

        public boolean hasDict() {
            return (this.bitField0_ & 1) != 0;
        }

        public TemplateDict getDict() {
            return this.dict_ == null ? TemplateDict.getDefaultInstance() : this.dict_;
        }

        /* access modifiers changed from: private */
        public void setDict(TemplateDict value) {
            value.getClass();
            this.dict_ = value;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeDict(TemplateDict value) {
            value.getClass();
            if (this.dict_ == null || this.dict_ == TemplateDict.getDefaultInstance()) {
                this.dict_ = value;
            } else {
                this.dict_ = (TemplateDict) ((TemplateDict.Builder) TemplateDict.newBuilder(this.dict_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void clearDict() {
            this.dict_ = null;
            this.bitField0_ &= -2;
        }

        public static TemplateSubgraphOptions parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateSubgraphOptions parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateSubgraphOptions parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateSubgraphOptions parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateSubgraphOptions parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TemplateSubgraphOptions parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TemplateSubgraphOptions parseFrom(InputStream input) throws IOException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateSubgraphOptions parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateSubgraphOptions parseDelimitedFrom(InputStream input) throws IOException {
            return (TemplateSubgraphOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateSubgraphOptions parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateSubgraphOptions) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TemplateSubgraphOptions parseFrom(CodedInputStream input) throws IOException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TemplateSubgraphOptions parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TemplateSubgraphOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TemplateSubgraphOptions prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TemplateSubgraphOptions, Builder> implements TemplateSubgraphOptionsOrBuilder {
            private Builder() {
                super(TemplateSubgraphOptions.DEFAULT_INSTANCE);
            }

            public boolean hasDict() {
                return ((TemplateSubgraphOptions) this.instance).hasDict();
            }

            public TemplateDict getDict() {
                return ((TemplateSubgraphOptions) this.instance).getDict();
            }

            public Builder setDict(TemplateDict value) {
                copyOnWrite();
                ((TemplateSubgraphOptions) this.instance).setDict(value);
                return this;
            }

            public Builder setDict(TemplateDict.Builder builderForValue) {
                copyOnWrite();
                ((TemplateSubgraphOptions) this.instance).setDict((TemplateDict) builderForValue.build());
                return this;
            }

            public Builder mergeDict(TemplateDict value) {
                copyOnWrite();
                ((TemplateSubgraphOptions) this.instance).mergeDict(value);
                return this;
            }

            public Builder clearDict() {
                copyOnWrite();
                ((TemplateSubgraphOptions) this.instance).clearDict();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new TemplateSubgraphOptions();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"bitField0_", "dict_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TemplateSubgraphOptions> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TemplateSubgraphOptions.class) {
                        try {
                            Parser<TemplateSubgraphOptions> parser2 = PARSER;
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
            TemplateSubgraphOptions defaultInstance = new TemplateSubgraphOptions();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(TemplateSubgraphOptions.class, defaultInstance);
        }

        public static TemplateSubgraphOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TemplateSubgraphOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
