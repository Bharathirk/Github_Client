package com.google.mediapipe.proto;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class CalculatorProfileProto {

    public interface CalculatorProfileOrBuilder extends MessageLiteOrBuilder {
        long getCloseRuntime();

        StreamProfile getInputStreamProfiles(int i);

        int getInputStreamProfilesCount();

        List<StreamProfile> getInputStreamProfilesList();

        String getName();

        ByteString getNameBytes();

        long getOpenRuntime();

        TimeHistogram getProcessInputLatency();

        TimeHistogram getProcessOutputLatency();

        TimeHistogram getProcessRuntime();

        boolean hasCloseRuntime();

        boolean hasName();

        boolean hasOpenRuntime();

        boolean hasProcessInputLatency();

        boolean hasProcessOutputLatency();

        boolean hasProcessRuntime();
    }

    public interface GraphProfileOrBuilder extends MessageLiteOrBuilder {
        CalculatorProfile getCalculatorProfiles(int i);

        int getCalculatorProfilesCount();

        List<CalculatorProfile> getCalculatorProfilesList();

        CalculatorProto.CalculatorGraphConfig getConfig();

        GraphTrace getGraphTrace(int i);

        int getGraphTraceCount();

        List<GraphTrace> getGraphTraceList();

        boolean hasConfig();
    }

    public interface GraphTraceOrBuilder extends MessageLiteOrBuilder {
        long getBaseTime();

        long getBaseTimestamp();

        String getCalculatorName(int i);

        ByteString getCalculatorNameBytes(int i);

        int getCalculatorNameCount();

        List<String> getCalculatorNameList();

        GraphTrace.CalculatorTrace getCalculatorTrace(int i);

        int getCalculatorTraceCount();

        List<GraphTrace.CalculatorTrace> getCalculatorTraceList();

        String getStreamName(int i);

        ByteString getStreamNameBytes(int i);

        int getStreamNameCount();

        List<String> getStreamNameList();

        boolean hasBaseTime();

        boolean hasBaseTimestamp();
    }

    public interface StreamProfileOrBuilder extends MessageLiteOrBuilder {
        boolean getBackEdge();

        TimeHistogram getLatency();

        String getName();

        ByteString getNameBytes();

        boolean hasBackEdge();

        boolean hasLatency();

        boolean hasName();
    }

    public interface TimeHistogramOrBuilder extends MessageLiteOrBuilder {
        long getCount(int i);

        int getCountCount();

        List<Long> getCountList();

        long getIntervalSizeUsec();

        long getNumIntervals();

        long getTotal();

        boolean hasIntervalSizeUsec();

        boolean hasNumIntervals();

        boolean hasTotal();
    }

    private CalculatorProfileProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class TimeHistogram extends GeneratedMessageLite<TimeHistogram, TimeHistogram.Builder> implements TimeHistogramOrBuilder {
        public static final int COUNT_FIELD_NUMBER = 4;
        /* access modifiers changed from: private */
        public static final TimeHistogram DEFAULT_INSTANCE;
        public static final int INTERVAL_SIZE_USEC_FIELD_NUMBER = 2;
        public static final int NUM_INTERVALS_FIELD_NUMBER = 3;
        private static volatile Parser<TimeHistogram> PARSER = null;
        public static final int TOTAL_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.LongList count_ = emptyLongList();
        private long intervalSizeUsec_ = 1000000;
        private long numIntervals_ = 1;
        private long total_;

        private TimeHistogram() {
        }

        public boolean hasTotal() {
            return (this.bitField0_ & 1) != 0;
        }

        public long getTotal() {
            return this.total_;
        }

        /* access modifiers changed from: private */
        public void setTotal(long value) {
            this.bitField0_ |= 1;
            this.total_ = value;
        }

        /* access modifiers changed from: private */
        public void clearTotal() {
            this.bitField0_ &= -2;
            this.total_ = 0;
        }

        public boolean hasIntervalSizeUsec() {
            return (this.bitField0_ & 2) != 0;
        }

        public long getIntervalSizeUsec() {
            return this.intervalSizeUsec_;
        }

        /* access modifiers changed from: private */
        public void setIntervalSizeUsec(long value) {
            this.bitField0_ |= 2;
            this.intervalSizeUsec_ = value;
        }

        /* access modifiers changed from: private */
        public void clearIntervalSizeUsec() {
            this.bitField0_ &= -3;
            this.intervalSizeUsec_ = 1000000;
        }

        public boolean hasNumIntervals() {
            return (this.bitField0_ & 4) != 0;
        }

        public long getNumIntervals() {
            return this.numIntervals_;
        }

        /* access modifiers changed from: private */
        public void setNumIntervals(long value) {
            this.bitField0_ |= 4;
            this.numIntervals_ = value;
        }

        /* access modifiers changed from: private */
        public void clearNumIntervals() {
            this.bitField0_ &= -5;
            this.numIntervals_ = 1;
        }

        public List<Long> getCountList() {
            return this.count_;
        }

        public int getCountCount() {
            return this.count_.size();
        }

        public long getCount(int index) {
            return this.count_.getLong(index);
        }

        private void ensureCountIsMutable() {
            if (!this.count_.isModifiable()) {
                this.count_ = GeneratedMessageLite.mutableCopy(this.count_);
            }
        }

        /* access modifiers changed from: private */
        public void setCount(int index, long value) {
            ensureCountIsMutable();
            this.count_.setLong(index, value);
        }

        /* access modifiers changed from: private */
        public void addCount(long value) {
            ensureCountIsMutable();
            this.count_.addLong(value);
        }

        /* access modifiers changed from: private */
        public void addAllCount(Iterable<? extends Long> values) {
            ensureCountIsMutable();
            AbstractMessageLite.addAll(values, this.count_);
        }

        /* access modifiers changed from: private */
        public void clearCount() {
            this.count_ = emptyLongList();
        }

        public static TimeHistogram parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimeHistogram parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeHistogram parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimeHistogram parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeHistogram parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimeHistogram parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimeHistogram parseFrom(InputStream input) throws IOException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeHistogram parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimeHistogram parseDelimitedFrom(InputStream input) throws IOException {
            return (TimeHistogram) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeHistogram parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeHistogram) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimeHistogram parseFrom(CodedInputStream input) throws IOException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimeHistogram parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimeHistogram) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(TimeHistogram prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<TimeHistogram, Builder> implements TimeHistogramOrBuilder {
            private Builder() {
                super(TimeHistogram.DEFAULT_INSTANCE);
            }

            public boolean hasTotal() {
                return ((TimeHistogram) this.instance).hasTotal();
            }

            public long getTotal() {
                return ((TimeHistogram) this.instance).getTotal();
            }

            public Builder setTotal(long value) {
                copyOnWrite();
                ((TimeHistogram) this.instance).setTotal(value);
                return this;
            }

            public Builder clearTotal() {
                copyOnWrite();
                ((TimeHistogram) this.instance).clearTotal();
                return this;
            }

            public boolean hasIntervalSizeUsec() {
                return ((TimeHistogram) this.instance).hasIntervalSizeUsec();
            }

            public long getIntervalSizeUsec() {
                return ((TimeHistogram) this.instance).getIntervalSizeUsec();
            }

            public Builder setIntervalSizeUsec(long value) {
                copyOnWrite();
                ((TimeHistogram) this.instance).setIntervalSizeUsec(value);
                return this;
            }

            public Builder clearIntervalSizeUsec() {
                copyOnWrite();
                ((TimeHistogram) this.instance).clearIntervalSizeUsec();
                return this;
            }

            public boolean hasNumIntervals() {
                return ((TimeHistogram) this.instance).hasNumIntervals();
            }

            public long getNumIntervals() {
                return ((TimeHistogram) this.instance).getNumIntervals();
            }

            public Builder setNumIntervals(long value) {
                copyOnWrite();
                ((TimeHistogram) this.instance).setNumIntervals(value);
                return this;
            }

            public Builder clearNumIntervals() {
                copyOnWrite();
                ((TimeHistogram) this.instance).clearNumIntervals();
                return this;
            }

            public List<Long> getCountList() {
                return Collections.unmodifiableList(((TimeHistogram) this.instance).getCountList());
            }

            public int getCountCount() {
                return ((TimeHistogram) this.instance).getCountCount();
            }

            public long getCount(int index) {
                return ((TimeHistogram) this.instance).getCount(index);
            }

            public Builder setCount(int index, long value) {
                copyOnWrite();
                ((TimeHistogram) this.instance).setCount(index, value);
                return this;
            }

            public Builder addCount(long value) {
                copyOnWrite();
                ((TimeHistogram) this.instance).addCount(value);
                return this;
            }

            public Builder addAllCount(Iterable<? extends Long> values) {
                copyOnWrite();
                ((TimeHistogram) this.instance).addAllCount(values);
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((TimeHistogram) this.instance).clearCount();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new TimeHistogram();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0014", new Object[]{"bitField0_", "total_", "intervalSizeUsec_", "numIntervals_", "count_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<TimeHistogram> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (TimeHistogram.class) {
                        try {
                            Parser<TimeHistogram> parser2 = PARSER;
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
            TimeHistogram defaultInstance = new TimeHistogram();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(TimeHistogram.class, defaultInstance);
        }

        public static TimeHistogram getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<TimeHistogram> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class StreamProfile extends GeneratedMessageLite<StreamProfile, StreamProfile.Builder> implements StreamProfileOrBuilder {
        public static final int BACK_EDGE_FIELD_NUMBER = 2;
        /* access modifiers changed from: private */
        public static final StreamProfile DEFAULT_INSTANCE;
        public static final int LATENCY_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile Parser<StreamProfile> PARSER;
        private boolean backEdge_;
        private int bitField0_;
        private TimeHistogram latency_;
        private String name_ = "";

        private StreamProfile() {
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasBackEdge() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean getBackEdge() {
            return this.backEdge_;
        }

        /* access modifiers changed from: private */
        public void setBackEdge(boolean value) {
            this.bitField0_ |= 2;
            this.backEdge_ = value;
        }

        /* access modifiers changed from: private */
        public void clearBackEdge() {
            this.bitField0_ &= -3;
            this.backEdge_ = false;
        }

        public boolean hasLatency() {
            return (this.bitField0_ & 4) != 0;
        }

        public TimeHistogram getLatency() {
            return this.latency_ == null ? TimeHistogram.getDefaultInstance() : this.latency_;
        }

        /* access modifiers changed from: private */
        public void setLatency(TimeHistogram value) {
            value.getClass();
            this.latency_ = value;
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void mergeLatency(TimeHistogram value) {
            value.getClass();
            if (this.latency_ == null || this.latency_ == TimeHistogram.getDefaultInstance()) {
                this.latency_ = value;
            } else {
                this.latency_ = (TimeHistogram) ((TimeHistogram.Builder) TimeHistogram.newBuilder(this.latency_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        /* access modifiers changed from: private */
        public void clearLatency() {
            this.latency_ = null;
            this.bitField0_ &= -5;
        }

        public static StreamProfile parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StreamProfile parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StreamProfile parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StreamProfile parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StreamProfile parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static StreamProfile parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static StreamProfile parseFrom(InputStream input) throws IOException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StreamProfile parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StreamProfile parseDelimitedFrom(InputStream input) throws IOException {
            return (StreamProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static StreamProfile parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StreamProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static StreamProfile parseFrom(CodedInputStream input) throws IOException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static StreamProfile parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (StreamProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(StreamProfile prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<StreamProfile, Builder> implements StreamProfileOrBuilder {
            private Builder() {
                super(StreamProfile.DEFAULT_INSTANCE);
            }

            public boolean hasName() {
                return ((StreamProfile) this.instance).hasName();
            }

            public String getName() {
                return ((StreamProfile) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((StreamProfile) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((StreamProfile) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((StreamProfile) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((StreamProfile) this.instance).setNameBytes(value);
                return this;
            }

            public boolean hasBackEdge() {
                return ((StreamProfile) this.instance).hasBackEdge();
            }

            public boolean getBackEdge() {
                return ((StreamProfile) this.instance).getBackEdge();
            }

            public Builder setBackEdge(boolean value) {
                copyOnWrite();
                ((StreamProfile) this.instance).setBackEdge(value);
                return this;
            }

            public Builder clearBackEdge() {
                copyOnWrite();
                ((StreamProfile) this.instance).clearBackEdge();
                return this;
            }

            public boolean hasLatency() {
                return ((StreamProfile) this.instance).hasLatency();
            }

            public TimeHistogram getLatency() {
                return ((StreamProfile) this.instance).getLatency();
            }

            public Builder setLatency(TimeHistogram value) {
                copyOnWrite();
                ((StreamProfile) this.instance).setLatency(value);
                return this;
            }

            public Builder setLatency(TimeHistogram.Builder builderForValue) {
                copyOnWrite();
                ((StreamProfile) this.instance).setLatency((TimeHistogram) builderForValue.build());
                return this;
            }

            public Builder mergeLatency(TimeHistogram value) {
                copyOnWrite();
                ((StreamProfile) this.instance).mergeLatency(value);
                return this;
            }

            public Builder clearLatency() {
                copyOnWrite();
                ((StreamProfile) this.instance).clearLatency();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new StreamProfile();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\t\u0002", new Object[]{"bitField0_", "name_", "backEdge_", "latency_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<StreamProfile> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StreamProfile.class) {
                        try {
                            Parser<StreamProfile> parser2 = PARSER;
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
            StreamProfile defaultInstance = new StreamProfile();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(StreamProfile.class, defaultInstance);
        }

        public static StreamProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<StreamProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class CalculatorProfile extends GeneratedMessageLite<CalculatorProfile, CalculatorProfile.Builder> implements CalculatorProfileOrBuilder {
        public static final int CLOSE_RUNTIME_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final CalculatorProfile DEFAULT_INSTANCE;
        public static final int INPUT_STREAM_PROFILES_FIELD_NUMBER = 7;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPEN_RUNTIME_FIELD_NUMBER = 2;
        private static volatile Parser<CalculatorProfile> PARSER = null;
        public static final int PROCESS_INPUT_LATENCY_FIELD_NUMBER = 5;
        public static final int PROCESS_OUTPUT_LATENCY_FIELD_NUMBER = 6;
        public static final int PROCESS_RUNTIME_FIELD_NUMBER = 4;
        private int bitField0_;
        private long closeRuntime_;
        private Internal.ProtobufList<StreamProfile> inputStreamProfiles_ = emptyProtobufList();
        private String name_ = "";
        private long openRuntime_;
        private TimeHistogram processInputLatency_;
        private TimeHistogram processOutputLatency_;
        private TimeHistogram processRuntime_;

        private CalculatorProfile() {
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public String getName() {
            return this.name_;
        }

        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        /* access modifiers changed from: private */
        public void setName(String value) {
            value.getClass();
            this.bitField0_ |= 1;
            this.name_ = value;
        }

        /* access modifiers changed from: private */
        public void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        /* access modifiers changed from: private */
        public void setNameBytes(ByteString value) {
            this.name_ = value.toStringUtf8();
            this.bitField0_ |= 1;
        }

        public boolean hasOpenRuntime() {
            return (this.bitField0_ & 2) != 0;
        }

        public long getOpenRuntime() {
            return this.openRuntime_;
        }

        /* access modifiers changed from: private */
        public void setOpenRuntime(long value) {
            this.bitField0_ |= 2;
            this.openRuntime_ = value;
        }

        /* access modifiers changed from: private */
        public void clearOpenRuntime() {
            this.bitField0_ &= -3;
            this.openRuntime_ = 0;
        }

        public boolean hasCloseRuntime() {
            return (this.bitField0_ & 4) != 0;
        }

        public long getCloseRuntime() {
            return this.closeRuntime_;
        }

        /* access modifiers changed from: private */
        public void setCloseRuntime(long value) {
            this.bitField0_ |= 4;
            this.closeRuntime_ = value;
        }

        /* access modifiers changed from: private */
        public void clearCloseRuntime() {
            this.bitField0_ &= -5;
            this.closeRuntime_ = 0;
        }

        public boolean hasProcessRuntime() {
            return (this.bitField0_ & 8) != 0;
        }

        public TimeHistogram getProcessRuntime() {
            return this.processRuntime_ == null ? TimeHistogram.getDefaultInstance() : this.processRuntime_;
        }

        /* access modifiers changed from: private */
        public void setProcessRuntime(TimeHistogram value) {
            value.getClass();
            this.processRuntime_ = value;
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void mergeProcessRuntime(TimeHistogram value) {
            value.getClass();
            if (this.processRuntime_ == null || this.processRuntime_ == TimeHistogram.getDefaultInstance()) {
                this.processRuntime_ = value;
            } else {
                this.processRuntime_ = (TimeHistogram) ((TimeHistogram.Builder) TimeHistogram.newBuilder(this.processRuntime_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* access modifiers changed from: private */
        public void clearProcessRuntime() {
            this.processRuntime_ = null;
            this.bitField0_ &= -9;
        }

        public boolean hasProcessInputLatency() {
            return (this.bitField0_ & 16) != 0;
        }

        public TimeHistogram getProcessInputLatency() {
            return this.processInputLatency_ == null ? TimeHistogram.getDefaultInstance() : this.processInputLatency_;
        }

        /* access modifiers changed from: private */
        public void setProcessInputLatency(TimeHistogram value) {
            value.getClass();
            this.processInputLatency_ = value;
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void mergeProcessInputLatency(TimeHistogram value) {
            value.getClass();
            if (this.processInputLatency_ == null || this.processInputLatency_ == TimeHistogram.getDefaultInstance()) {
                this.processInputLatency_ = value;
            } else {
                this.processInputLatency_ = (TimeHistogram) ((TimeHistogram.Builder) TimeHistogram.newBuilder(this.processInputLatency_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        /* access modifiers changed from: private */
        public void clearProcessInputLatency() {
            this.processInputLatency_ = null;
            this.bitField0_ &= -17;
        }

        public boolean hasProcessOutputLatency() {
            return (this.bitField0_ & 32) != 0;
        }

        public TimeHistogram getProcessOutputLatency() {
            return this.processOutputLatency_ == null ? TimeHistogram.getDefaultInstance() : this.processOutputLatency_;
        }

        /* access modifiers changed from: private */
        public void setProcessOutputLatency(TimeHistogram value) {
            value.getClass();
            this.processOutputLatency_ = value;
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void mergeProcessOutputLatency(TimeHistogram value) {
            value.getClass();
            if (this.processOutputLatency_ == null || this.processOutputLatency_ == TimeHistogram.getDefaultInstance()) {
                this.processOutputLatency_ = value;
            } else {
                this.processOutputLatency_ = (TimeHistogram) ((TimeHistogram.Builder) TimeHistogram.newBuilder(this.processOutputLatency_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 32;
        }

        /* access modifiers changed from: private */
        public void clearProcessOutputLatency() {
            this.processOutputLatency_ = null;
            this.bitField0_ &= -33;
        }

        public List<StreamProfile> getInputStreamProfilesList() {
            return this.inputStreamProfiles_;
        }

        public List<? extends StreamProfileOrBuilder> getInputStreamProfilesOrBuilderList() {
            return this.inputStreamProfiles_;
        }

        public int getInputStreamProfilesCount() {
            return this.inputStreamProfiles_.size();
        }

        public StreamProfile getInputStreamProfiles(int index) {
            return (StreamProfile) this.inputStreamProfiles_.get(index);
        }

        public StreamProfileOrBuilder getInputStreamProfilesOrBuilder(int index) {
            return (StreamProfileOrBuilder) this.inputStreamProfiles_.get(index);
        }

        private void ensureInputStreamProfilesIsMutable() {
            if (!this.inputStreamProfiles_.isModifiable()) {
                this.inputStreamProfiles_ = GeneratedMessageLite.mutableCopy(this.inputStreamProfiles_);
            }
        }

        /* access modifiers changed from: private */
        public void setInputStreamProfiles(int index, StreamProfile value) {
            value.getClass();
            ensureInputStreamProfilesIsMutable();
            this.inputStreamProfiles_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addInputStreamProfiles(StreamProfile value) {
            value.getClass();
            ensureInputStreamProfilesIsMutable();
            this.inputStreamProfiles_.add(value);
        }

        /* access modifiers changed from: private */
        public void addInputStreamProfiles(int index, StreamProfile value) {
            value.getClass();
            ensureInputStreamProfilesIsMutable();
            this.inputStreamProfiles_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllInputStreamProfiles(Iterable<? extends StreamProfile> values) {
            ensureInputStreamProfilesIsMutable();
            AbstractMessageLite.addAll(values, this.inputStreamProfiles_);
        }

        /* access modifiers changed from: private */
        public void clearInputStreamProfiles() {
            this.inputStreamProfiles_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeInputStreamProfiles(int index) {
            ensureInputStreamProfilesIsMutable();
            this.inputStreamProfiles_.remove(index);
        }

        public static CalculatorProfile parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorProfile parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorProfile parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorProfile parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorProfile parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CalculatorProfile parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CalculatorProfile parseFrom(InputStream input) throws IOException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorProfile parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorProfile parseDelimitedFrom(InputStream input) throws IOException {
            return (CalculatorProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorProfile parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CalculatorProfile parseFrom(CodedInputStream input) throws IOException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CalculatorProfile parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CalculatorProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(CalculatorProfile prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<CalculatorProfile, Builder> implements CalculatorProfileOrBuilder {
            private Builder() {
                super(CalculatorProfile.DEFAULT_INSTANCE);
            }

            public boolean hasName() {
                return ((CalculatorProfile) this.instance).hasName();
            }

            public String getName() {
                return ((CalculatorProfile) this.instance).getName();
            }

            public ByteString getNameBytes() {
                return ((CalculatorProfile) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setNameBytes(value);
                return this;
            }

            public boolean hasOpenRuntime() {
                return ((CalculatorProfile) this.instance).hasOpenRuntime();
            }

            public long getOpenRuntime() {
                return ((CalculatorProfile) this.instance).getOpenRuntime();
            }

            public Builder setOpenRuntime(long value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setOpenRuntime(value);
                return this;
            }

            public Builder clearOpenRuntime() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearOpenRuntime();
                return this;
            }

            public boolean hasCloseRuntime() {
                return ((CalculatorProfile) this.instance).hasCloseRuntime();
            }

            public long getCloseRuntime() {
                return ((CalculatorProfile) this.instance).getCloseRuntime();
            }

            public Builder setCloseRuntime(long value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setCloseRuntime(value);
                return this;
            }

            public Builder clearCloseRuntime() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearCloseRuntime();
                return this;
            }

            public boolean hasProcessRuntime() {
                return ((CalculatorProfile) this.instance).hasProcessRuntime();
            }

            public TimeHistogram getProcessRuntime() {
                return ((CalculatorProfile) this.instance).getProcessRuntime();
            }

            public Builder setProcessRuntime(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessRuntime(value);
                return this;
            }

            public Builder setProcessRuntime(TimeHistogram.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessRuntime((TimeHistogram) builderForValue.build());
                return this;
            }

            public Builder mergeProcessRuntime(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).mergeProcessRuntime(value);
                return this;
            }

            public Builder clearProcessRuntime() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearProcessRuntime();
                return this;
            }

            public boolean hasProcessInputLatency() {
                return ((CalculatorProfile) this.instance).hasProcessInputLatency();
            }

            public TimeHistogram getProcessInputLatency() {
                return ((CalculatorProfile) this.instance).getProcessInputLatency();
            }

            public Builder setProcessInputLatency(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessInputLatency(value);
                return this;
            }

            public Builder setProcessInputLatency(TimeHistogram.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessInputLatency((TimeHistogram) builderForValue.build());
                return this;
            }

            public Builder mergeProcessInputLatency(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).mergeProcessInputLatency(value);
                return this;
            }

            public Builder clearProcessInputLatency() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearProcessInputLatency();
                return this;
            }

            public boolean hasProcessOutputLatency() {
                return ((CalculatorProfile) this.instance).hasProcessOutputLatency();
            }

            public TimeHistogram getProcessOutputLatency() {
                return ((CalculatorProfile) this.instance).getProcessOutputLatency();
            }

            public Builder setProcessOutputLatency(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessOutputLatency(value);
                return this;
            }

            public Builder setProcessOutputLatency(TimeHistogram.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setProcessOutputLatency((TimeHistogram) builderForValue.build());
                return this;
            }

            public Builder mergeProcessOutputLatency(TimeHistogram value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).mergeProcessOutputLatency(value);
                return this;
            }

            public Builder clearProcessOutputLatency() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearProcessOutputLatency();
                return this;
            }

            public List<StreamProfile> getInputStreamProfilesList() {
                return Collections.unmodifiableList(((CalculatorProfile) this.instance).getInputStreamProfilesList());
            }

            public int getInputStreamProfilesCount() {
                return ((CalculatorProfile) this.instance).getInputStreamProfilesCount();
            }

            public StreamProfile getInputStreamProfiles(int index) {
                return ((CalculatorProfile) this.instance).getInputStreamProfiles(index);
            }

            public Builder setInputStreamProfiles(int index, StreamProfile value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setInputStreamProfiles(index, value);
                return this;
            }

            public Builder setInputStreamProfiles(int index, StreamProfile.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).setInputStreamProfiles(index, (StreamProfile) builderForValue.build());
                return this;
            }

            public Builder addInputStreamProfiles(StreamProfile value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).addInputStreamProfiles(value);
                return this;
            }

            public Builder addInputStreamProfiles(int index, StreamProfile value) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).addInputStreamProfiles(index, value);
                return this;
            }

            public Builder addInputStreamProfiles(StreamProfile.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).addInputStreamProfiles((StreamProfile) builderForValue.build());
                return this;
            }

            public Builder addInputStreamProfiles(int index, StreamProfile.Builder builderForValue) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).addInputStreamProfiles(index, (StreamProfile) builderForValue.build());
                return this;
            }

            public Builder addAllInputStreamProfiles(Iterable<? extends StreamProfile> values) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).addAllInputStreamProfiles(values);
                return this;
            }

            public Builder clearInputStreamProfiles() {
                copyOnWrite();
                ((CalculatorProfile) this.instance).clearInputStreamProfiles();
                return this;
            }

            public Builder removeInputStreamProfiles(int index) {
                copyOnWrite();
                ((CalculatorProfile) this.instance).removeInputStreamProfiles(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new CalculatorProfile();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u001b", new Object[]{"bitField0_", "name_", "openRuntime_", "closeRuntime_", "processRuntime_", "processInputLatency_", "processOutputLatency_", "inputStreamProfiles_", StreamProfile.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<CalculatorProfile> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (CalculatorProfile.class) {
                        try {
                            Parser<CalculatorProfile> parser2 = PARSER;
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
            CalculatorProfile defaultInstance = new CalculatorProfile();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(CalculatorProfile.class, defaultInstance);
        }

        public static CalculatorProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<CalculatorProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class GraphTrace extends GeneratedMessageLite<GraphTrace, GraphTrace.Builder> implements GraphTraceOrBuilder {
        public static final int BASE_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int BASE_TIME_FIELD_NUMBER = 1;
        public static final int CALCULATOR_NAME_FIELD_NUMBER = 3;
        public static final int CALCULATOR_TRACE_FIELD_NUMBER = 5;
        /* access modifiers changed from: private */
        public static final GraphTrace DEFAULT_INSTANCE;
        private static volatile Parser<GraphTrace> PARSER = null;
        public static final int STREAM_NAME_FIELD_NUMBER = 4;
        private long baseTime_;
        private long baseTimestamp_;
        private int bitField0_;
        private Internal.ProtobufList<String> calculatorName_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<CalculatorTrace> calculatorTrace_ = emptyProtobufList();
        private Internal.ProtobufList<String> streamName_ = GeneratedMessageLite.emptyProtobufList();

        public interface CalculatorTraceOrBuilder extends MessageLiteOrBuilder {
            EventType getEventType();

            long getFinishTime();

            long getInputTimestamp();

            StreamTrace getInputTrace(int i);

            int getInputTraceCount();

            List<StreamTrace> getInputTraceList();

            int getNodeId();

            StreamTrace getOutputTrace(int i);

            int getOutputTraceCount();

            List<StreamTrace> getOutputTraceList();

            long getStartTime();

            int getThreadId();

            boolean hasEventType();

            boolean hasFinishTime();

            boolean hasInputTimestamp();

            boolean hasNodeId();

            boolean hasStartTime();

            boolean hasThreadId();
        }

        public interface StreamTraceOrBuilder extends MessageLiteOrBuilder {
            long getEventData();

            long getFinishTime();

            @Deprecated
            long getPacketId();

            long getPacketTimestamp();

            long getStartTime();

            int getStreamId();

            boolean hasEventData();

            boolean hasFinishTime();

            @Deprecated
            boolean hasPacketId();

            boolean hasPacketTimestamp();

            boolean hasStartTime();

            boolean hasStreamId();
        }

        private GraphTrace() {
        }

        public enum EventType implements Internal.EnumLite {
            UNKNOWN(0),
            OPEN(1),
            PROCESS(2),
            CLOSE(3),
            NOT_READY(4),
            READY_FOR_PROCESS(5),
            READY_FOR_CLOSE(6),
            THROTTLED(7),
            UNTHROTTLED(8),
            CPU_TASK_USER(9),
            CPU_TASK_SYSTEM(10),
            GPU_TASK(11),
            DSP_TASK(12),
            TPU_TASK(13),
            GPU_CALIBRATION(14),
            PACKET_QUEUED(15);
            
            public static final int CLOSE_VALUE = 3;
            public static final int CPU_TASK_SYSTEM_VALUE = 10;
            public static final int CPU_TASK_USER_VALUE = 9;
            public static final int DSP_TASK_VALUE = 12;
            public static final int GPU_CALIBRATION_VALUE = 14;
            public static final int GPU_TASK_VALUE = 11;
            public static final int NOT_READY_VALUE = 4;
            public static final int OPEN_VALUE = 1;
            public static final int PACKET_QUEUED_VALUE = 15;
            public static final int PROCESS_VALUE = 2;
            public static final int READY_FOR_CLOSE_VALUE = 6;
            public static final int READY_FOR_PROCESS_VALUE = 5;
            public static final int THROTTLED_VALUE = 7;
            public static final int TPU_TASK_VALUE = 13;
            public static final int UNKNOWN_VALUE = 0;
            public static final int UNTHROTTLED_VALUE = 8;
            private static final Internal.EnumLiteMap<EventType> internalValueMap = new Internal.EnumLiteMap<EventType>() {
                public EventType findValueByNumber(int number) {
                    return EventType.forNumber(number);
                }
            };;
            private final int value;

            public final int getNumber() {
                return this.value;
            }

            @Deprecated
            public static EventType valueOf(int value2) {
                return forNumber(value2);
            }

            public static EventType forNumber(int value2) {
                switch (value2) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return OPEN;
                    case 2:
                        return PROCESS;
                    case 3:
                        return CLOSE;
                    case 4:
                        return NOT_READY;
                    case 5:
                        return READY_FOR_PROCESS;
                    case 6:
                        return READY_FOR_CLOSE;
                    case 7:
                        return THROTTLED;
                    case 8:
                        return UNTHROTTLED;
                    case 9:
                        return CPU_TASK_USER;
                    case 10:
                        return CPU_TASK_SYSTEM;
                    case 11:
                        return GPU_TASK;
                    case 12:
                        return DSP_TASK;
                    case 13:
                        return TPU_TASK;
                    case 14:
                        return GPU_CALIBRATION;
                    case 15:
                        return PACKET_QUEUED;
                    default:
                        return null;
                }
            }

            public static Internal.EnumLiteMap<EventType> internalGetValueMap() {
                return internalValueMap;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return EventTypeVerifier.INSTANCE;
            }

            private static final class EventTypeVerifier implements Internal.EnumVerifier {
                static final Internal.EnumVerifier INSTANCE = new EventTypeVerifier();

                private EventTypeVerifier() {
                }

                public boolean isInRange(int number) {
                    return EventType.forNumber(number) != null;
                }
            }

            private EventType(int value2) {
                this.value = value2;
            }
        }

        public static final class StreamTrace extends GeneratedMessageLite<StreamTrace, StreamTrace.Builder> implements StreamTraceOrBuilder {
            /* access modifiers changed from: private */
            public static final StreamTrace DEFAULT_INSTANCE;
            public static final int EVENT_DATA_FIELD_NUMBER = 6;
            public static final int FINISH_TIME_FIELD_NUMBER = 2;
            public static final int PACKET_ID_FIELD_NUMBER = 5;
            public static final int PACKET_TIMESTAMP_FIELD_NUMBER = 3;
            private static volatile Parser<StreamTrace> PARSER = null;
            public static final int START_TIME_FIELD_NUMBER = 1;
            public static final int STREAM_ID_FIELD_NUMBER = 4;
            private int bitField0_;
            private long eventData_;
            private long finishTime_;
            private long packetId_;
            private long packetTimestamp_;
            private long startTime_;
            private int streamId_;

            private StreamTrace() {
            }

            public boolean hasStartTime() {
                return (this.bitField0_ & 1) != 0;
            }

            public long getStartTime() {
                return this.startTime_;
            }

            /* access modifiers changed from: private */
            public void setStartTime(long value) {
                this.bitField0_ |= 1;
                this.startTime_ = value;
            }

            /* access modifiers changed from: private */
            public void clearStartTime() {
                this.bitField0_ &= -2;
                this.startTime_ = 0;
            }

            public boolean hasFinishTime() {
                return (this.bitField0_ & 2) != 0;
            }

            public long getFinishTime() {
                return this.finishTime_;
            }

            /* access modifiers changed from: private */
            public void setFinishTime(long value) {
                this.bitField0_ |= 2;
                this.finishTime_ = value;
            }

            /* access modifiers changed from: private */
            public void clearFinishTime() {
                this.bitField0_ &= -3;
                this.finishTime_ = 0;
            }

            public boolean hasPacketTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            public long getPacketTimestamp() {
                return this.packetTimestamp_;
            }

            /* access modifiers changed from: private */
            public void setPacketTimestamp(long value) {
                this.bitField0_ |= 4;
                this.packetTimestamp_ = value;
            }

            /* access modifiers changed from: private */
            public void clearPacketTimestamp() {
                this.bitField0_ &= -5;
                this.packetTimestamp_ = 0;
            }

            public boolean hasStreamId() {
                return (this.bitField0_ & 8) != 0;
            }

            public int getStreamId() {
                return this.streamId_;
            }

            /* access modifiers changed from: private */
            public void setStreamId(int value) {
                this.bitField0_ |= 8;
                this.streamId_ = value;
            }

            /* access modifiers changed from: private */
            public void clearStreamId() {
                this.bitField0_ &= -9;
                this.streamId_ = 0;
            }

            @Deprecated
            public boolean hasPacketId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Deprecated
            public long getPacketId() {
                return this.packetId_;
            }

            /* access modifiers changed from: private */
            public void setPacketId(long value) {
                this.bitField0_ |= 16;
                this.packetId_ = value;
            }

            /* access modifiers changed from: private */
            public void clearPacketId() {
                this.bitField0_ &= -17;
                this.packetId_ = 0;
            }

            public boolean hasEventData() {
                return (this.bitField0_ & 32) != 0;
            }

            public long getEventData() {
                return this.eventData_;
            }

            /* access modifiers changed from: private */
            public void setEventData(long value) {
                this.bitField0_ |= 32;
                this.eventData_ = value;
            }

            /* access modifiers changed from: private */
            public void clearEventData() {
                this.bitField0_ &= -33;
                this.eventData_ = 0;
            }

            public static StreamTrace parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamTrace parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamTrace parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamTrace parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamTrace parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamTrace parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamTrace parseFrom(InputStream input) throws IOException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamTrace parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static StreamTrace parseDelimitedFrom(InputStream input) throws IOException {
                return (StreamTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamTrace parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static StreamTrace parseFrom(CodedInputStream input) throws IOException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamTrace parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(StreamTrace prototype) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<StreamTrace, Builder> implements StreamTraceOrBuilder {
                private Builder() {
                    super(StreamTrace.DEFAULT_INSTANCE);
                }

                public boolean hasStartTime() {
                    return ((StreamTrace) this.instance).hasStartTime();
                }

                public long getStartTime() {
                    return ((StreamTrace) this.instance).getStartTime();
                }

                public Builder setStartTime(long value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setStartTime(value);
                    return this;
                }

                public Builder clearStartTime() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearStartTime();
                    return this;
                }

                public boolean hasFinishTime() {
                    return ((StreamTrace) this.instance).hasFinishTime();
                }

                public long getFinishTime() {
                    return ((StreamTrace) this.instance).getFinishTime();
                }

                public Builder setFinishTime(long value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setFinishTime(value);
                    return this;
                }

                public Builder clearFinishTime() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearFinishTime();
                    return this;
                }

                public boolean hasPacketTimestamp() {
                    return ((StreamTrace) this.instance).hasPacketTimestamp();
                }

                public long getPacketTimestamp() {
                    return ((StreamTrace) this.instance).getPacketTimestamp();
                }

                public Builder setPacketTimestamp(long value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setPacketTimestamp(value);
                    return this;
                }

                public Builder clearPacketTimestamp() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearPacketTimestamp();
                    return this;
                }

                public boolean hasStreamId() {
                    return ((StreamTrace) this.instance).hasStreamId();
                }

                public int getStreamId() {
                    return ((StreamTrace) this.instance).getStreamId();
                }

                public Builder setStreamId(int value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setStreamId(value);
                    return this;
                }

                public Builder clearStreamId() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearStreamId();
                    return this;
                }

                @Deprecated
                public boolean hasPacketId() {
                    return ((StreamTrace) this.instance).hasPacketId();
                }

                @Deprecated
                public long getPacketId() {
                    return ((StreamTrace) this.instance).getPacketId();
                }

                @Deprecated
                public Builder setPacketId(long value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setPacketId(value);
                    return this;
                }

                @Deprecated
                public Builder clearPacketId() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearPacketId();
                    return this;
                }

                public boolean hasEventData() {
                    return ((StreamTrace) this.instance).hasEventData();
                }

                public long getEventData() {
                    return ((StreamTrace) this.instance).getEventData();
                }

                public Builder setEventData(long value) {
                    copyOnWrite();
                    ((StreamTrace) this.instance).setEventData(value);
                    return this;
                }

                public Builder clearEventData() {
                    copyOnWrite();
                    ((StreamTrace) this.instance).clearEventData();
                    return this;
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new StreamTrace();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0004\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"bitField0_", "startTime_", "finishTime_", "packetTimestamp_", "streamId_", "packetId_", "eventData_"});
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<StreamTrace> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (StreamTrace.class) {
                            try {
                                Parser<StreamTrace> parser2 = PARSER;
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
                StreamTrace defaultInstance = new StreamTrace();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(StreamTrace.class, defaultInstance);
            }

            public static StreamTrace getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<StreamTrace> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public static final class CalculatorTrace extends GeneratedMessageLite<CalculatorTrace, CalculatorTrace.Builder> implements CalculatorTraceOrBuilder {
            /* access modifiers changed from: private */
            public static final CalculatorTrace DEFAULT_INSTANCE;
            public static final int EVENT_TYPE_FIELD_NUMBER = 3;
            public static final int FINISH_TIME_FIELD_NUMBER = 5;
            public static final int INPUT_TIMESTAMP_FIELD_NUMBER = 2;
            public static final int INPUT_TRACE_FIELD_NUMBER = 6;
            public static final int NODE_ID_FIELD_NUMBER = 1;
            public static final int OUTPUT_TRACE_FIELD_NUMBER = 7;
            private static volatile Parser<CalculatorTrace> PARSER = null;
            public static final int START_TIME_FIELD_NUMBER = 4;
            public static final int THREAD_ID_FIELD_NUMBER = 8;
            private int bitField0_;
            private int eventType_;
            private long finishTime_;
            private long inputTimestamp_;
            private Internal.ProtobufList<StreamTrace> inputTrace_ = emptyProtobufList();
            private int nodeId_;
            private Internal.ProtobufList<StreamTrace> outputTrace_ = emptyProtobufList();
            private long startTime_;
            private int threadId_;

            private CalculatorTrace() {
            }

            public boolean hasNodeId() {
                return (this.bitField0_ & 1) != 0;
            }

            public int getNodeId() {
                return this.nodeId_;
            }

            /* access modifiers changed from: private */
            public void setNodeId(int value) {
                this.bitField0_ |= 1;
                this.nodeId_ = value;
            }

            /* access modifiers changed from: private */
            public void clearNodeId() {
                this.bitField0_ &= -2;
                this.nodeId_ = 0;
            }

            public boolean hasInputTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            public long getInputTimestamp() {
                return this.inputTimestamp_;
            }

            /* access modifiers changed from: private */
            public void setInputTimestamp(long value) {
                this.bitField0_ |= 2;
                this.inputTimestamp_ = value;
            }

            /* access modifiers changed from: private */
            public void clearInputTimestamp() {
                this.bitField0_ &= -3;
                this.inputTimestamp_ = 0;
            }

            public boolean hasEventType() {
                return (this.bitField0_ & 4) != 0;
            }

            public EventType getEventType() {
                EventType result = EventType.forNumber(this.eventType_);
                return result == null ? EventType.UNKNOWN : result;
            }

            /* access modifiers changed from: private */
            public void setEventType(EventType value) {
                this.eventType_ = value.getNumber();
                this.bitField0_ |= 4;
            }

            /* access modifiers changed from: private */
            public void clearEventType() {
                this.bitField0_ &= -5;
                this.eventType_ = 0;
            }

            public boolean hasStartTime() {
                return (this.bitField0_ & 8) != 0;
            }

            public long getStartTime() {
                return this.startTime_;
            }

            /* access modifiers changed from: private */
            public void setStartTime(long value) {
                this.bitField0_ |= 8;
                this.startTime_ = value;
            }

            /* access modifiers changed from: private */
            public void clearStartTime() {
                this.bitField0_ &= -9;
                this.startTime_ = 0;
            }

            public boolean hasFinishTime() {
                return (this.bitField0_ & 16) != 0;
            }

            public long getFinishTime() {
                return this.finishTime_;
            }

            /* access modifiers changed from: private */
            public void setFinishTime(long value) {
                this.bitField0_ |= 16;
                this.finishTime_ = value;
            }

            /* access modifiers changed from: private */
            public void clearFinishTime() {
                this.bitField0_ &= -17;
                this.finishTime_ = 0;
            }

            public List<StreamTrace> getInputTraceList() {
                return this.inputTrace_;
            }

            public List<? extends StreamTraceOrBuilder> getInputTraceOrBuilderList() {
                return this.inputTrace_;
            }

            public int getInputTraceCount() {
                return this.inputTrace_.size();
            }

            public StreamTrace getInputTrace(int index) {
                return (StreamTrace) this.inputTrace_.get(index);
            }

            public StreamTraceOrBuilder getInputTraceOrBuilder(int index) {
                return (StreamTraceOrBuilder) this.inputTrace_.get(index);
            }

            private void ensureInputTraceIsMutable() {
                if (!this.inputTrace_.isModifiable()) {
                    this.inputTrace_ = GeneratedMessageLite.mutableCopy(this.inputTrace_);
                }
            }

            /* access modifiers changed from: private */
            public void setInputTrace(int index, StreamTrace value) {
                value.getClass();
                ensureInputTraceIsMutable();
                this.inputTrace_.set(index, value);
            }

            /* access modifiers changed from: private */
            public void addInputTrace(StreamTrace value) {
                value.getClass();
                ensureInputTraceIsMutable();
                this.inputTrace_.add(value);
            }

            /* access modifiers changed from: private */
            public void addInputTrace(int index, StreamTrace value) {
                value.getClass();
                ensureInputTraceIsMutable();
                this.inputTrace_.add(index, value);
            }

            /* access modifiers changed from: private */
            public void addAllInputTrace(Iterable<? extends StreamTrace> values) {
                ensureInputTraceIsMutable();
                AbstractMessageLite.addAll(values, this.inputTrace_);
            }

            /* access modifiers changed from: private */
            public void clearInputTrace() {
                this.inputTrace_ = emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void removeInputTrace(int index) {
                ensureInputTraceIsMutable();
                this.inputTrace_.remove(index);
            }

            public List<StreamTrace> getOutputTraceList() {
                return this.outputTrace_;
            }

            public List<? extends StreamTraceOrBuilder> getOutputTraceOrBuilderList() {
                return this.outputTrace_;
            }

            public int getOutputTraceCount() {
                return this.outputTrace_.size();
            }

            public StreamTrace getOutputTrace(int index) {
                return (StreamTrace) this.outputTrace_.get(index);
            }

            public StreamTraceOrBuilder getOutputTraceOrBuilder(int index) {
                return (StreamTraceOrBuilder) this.outputTrace_.get(index);
            }

            private void ensureOutputTraceIsMutable() {
                if (!this.outputTrace_.isModifiable()) {
                    this.outputTrace_ = GeneratedMessageLite.mutableCopy(this.outputTrace_);
                }
            }

            /* access modifiers changed from: private */
            public void setOutputTrace(int index, StreamTrace value) {
                value.getClass();
                ensureOutputTraceIsMutable();
                this.outputTrace_.set(index, value);
            }

            /* access modifiers changed from: private */
            public void addOutputTrace(StreamTrace value) {
                value.getClass();
                ensureOutputTraceIsMutable();
                this.outputTrace_.add(value);
            }

            /* access modifiers changed from: private */
            public void addOutputTrace(int index, StreamTrace value) {
                value.getClass();
                ensureOutputTraceIsMutable();
                this.outputTrace_.add(index, value);
            }

            /* access modifiers changed from: private */
            public void addAllOutputTrace(Iterable<? extends StreamTrace> values) {
                ensureOutputTraceIsMutable();
                AbstractMessageLite.addAll(values, this.outputTrace_);
            }

            /* access modifiers changed from: private */
            public void clearOutputTrace() {
                this.outputTrace_ = emptyProtobufList();
            }

            /* access modifiers changed from: private */
            public void removeOutputTrace(int index) {
                ensureOutputTraceIsMutable();
                this.outputTrace_.remove(index);
            }

            public boolean hasThreadId() {
                return (this.bitField0_ & 32) != 0;
            }

            public int getThreadId() {
                return this.threadId_;
            }

            /* access modifiers changed from: private */
            public void setThreadId(int value) {
                this.bitField0_ |= 32;
                this.threadId_ = value;
            }

            /* access modifiers changed from: private */
            public void clearThreadId() {
                this.bitField0_ &= -33;
                this.threadId_ = 0;
            }

            public static CalculatorTrace parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static CalculatorTrace parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static CalculatorTrace parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static CalculatorTrace parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static CalculatorTrace parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static CalculatorTrace parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static CalculatorTrace parseFrom(InputStream input) throws IOException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static CalculatorTrace parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static CalculatorTrace parseDelimitedFrom(InputStream input) throws IOException {
                return (CalculatorTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static CalculatorTrace parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (CalculatorTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static CalculatorTrace parseFrom(CodedInputStream input) throws IOException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static CalculatorTrace parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (CalculatorTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return (Builder) DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(CalculatorTrace prototype) {
                return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<CalculatorTrace, Builder> implements CalculatorTraceOrBuilder {
                private Builder() {
                    super(CalculatorTrace.DEFAULT_INSTANCE);
                }

                public boolean hasNodeId() {
                    return ((CalculatorTrace) this.instance).hasNodeId();
                }

                public int getNodeId() {
                    return ((CalculatorTrace) this.instance).getNodeId();
                }

                public Builder setNodeId(int value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setNodeId(value);
                    return this;
                }

                public Builder clearNodeId() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearNodeId();
                    return this;
                }

                public boolean hasInputTimestamp() {
                    return ((CalculatorTrace) this.instance).hasInputTimestamp();
                }

                public long getInputTimestamp() {
                    return ((CalculatorTrace) this.instance).getInputTimestamp();
                }

                public Builder setInputTimestamp(long value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setInputTimestamp(value);
                    return this;
                }

                public Builder clearInputTimestamp() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearInputTimestamp();
                    return this;
                }

                public boolean hasEventType() {
                    return ((CalculatorTrace) this.instance).hasEventType();
                }

                public EventType getEventType() {
                    return ((CalculatorTrace) this.instance).getEventType();
                }

                public Builder setEventType(EventType value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setEventType(value);
                    return this;
                }

                public Builder clearEventType() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearEventType();
                    return this;
                }

                public boolean hasStartTime() {
                    return ((CalculatorTrace) this.instance).hasStartTime();
                }

                public long getStartTime() {
                    return ((CalculatorTrace) this.instance).getStartTime();
                }

                public Builder setStartTime(long value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setStartTime(value);
                    return this;
                }

                public Builder clearStartTime() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearStartTime();
                    return this;
                }

                public boolean hasFinishTime() {
                    return ((CalculatorTrace) this.instance).hasFinishTime();
                }

                public long getFinishTime() {
                    return ((CalculatorTrace) this.instance).getFinishTime();
                }

                public Builder setFinishTime(long value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setFinishTime(value);
                    return this;
                }

                public Builder clearFinishTime() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearFinishTime();
                    return this;
                }

                public List<StreamTrace> getInputTraceList() {
                    return Collections.unmodifiableList(((CalculatorTrace) this.instance).getInputTraceList());
                }

                public int getInputTraceCount() {
                    return ((CalculatorTrace) this.instance).getInputTraceCount();
                }

                public StreamTrace getInputTrace(int index) {
                    return ((CalculatorTrace) this.instance).getInputTrace(index);
                }

                public Builder setInputTrace(int index, StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setInputTrace(index, value);
                    return this;
                }

                public Builder setInputTrace(int index, StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setInputTrace(index, (StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addInputTrace(StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addInputTrace(value);
                    return this;
                }

                public Builder addInputTrace(int index, StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addInputTrace(index, value);
                    return this;
                }

                public Builder addInputTrace(StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addInputTrace((StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addInputTrace(int index, StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addInputTrace(index, (StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addAllInputTrace(Iterable<? extends StreamTrace> values) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addAllInputTrace(values);
                    return this;
                }

                public Builder clearInputTrace() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearInputTrace();
                    return this;
                }

                public Builder removeInputTrace(int index) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).removeInputTrace(index);
                    return this;
                }

                public List<StreamTrace> getOutputTraceList() {
                    return Collections.unmodifiableList(((CalculatorTrace) this.instance).getOutputTraceList());
                }

                public int getOutputTraceCount() {
                    return ((CalculatorTrace) this.instance).getOutputTraceCount();
                }

                public StreamTrace getOutputTrace(int index) {
                    return ((CalculatorTrace) this.instance).getOutputTrace(index);
                }

                public Builder setOutputTrace(int index, StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setOutputTrace(index, value);
                    return this;
                }

                public Builder setOutputTrace(int index, StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setOutputTrace(index, (StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addOutputTrace(StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addOutputTrace(value);
                    return this;
                }

                public Builder addOutputTrace(int index, StreamTrace value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addOutputTrace(index, value);
                    return this;
                }

                public Builder addOutputTrace(StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addOutputTrace((StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addOutputTrace(int index, StreamTrace.Builder builderForValue) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addOutputTrace(index, (StreamTrace) builderForValue.build());
                    return this;
                }

                public Builder addAllOutputTrace(Iterable<? extends StreamTrace> values) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).addAllOutputTrace(values);
                    return this;
                }

                public Builder clearOutputTrace() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearOutputTrace();
                    return this;
                }

                public Builder removeOutputTrace(int index) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).removeOutputTrace(index);
                    return this;
                }

                public boolean hasThreadId() {
                    return ((CalculatorTrace) this.instance).hasThreadId();
                }

                public int getThreadId() {
                    return ((CalculatorTrace) this.instance).getThreadId();
                }

                public Builder setThreadId(int value) {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).setThreadId(value);
                    return this;
                }

                public Builder clearThreadId() {
                    copyOnWrite();
                    ((CalculatorTrace) this.instance).clearThreadId();
                    return this;
                }
            }

            /* access modifiers changed from: protected */
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new CalculatorTrace();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u001b\u0007\u001b\b\u0004\u0005", new Object[]{"bitField0_", "nodeId_", "inputTimestamp_", "eventType_", EventType.internalGetVerifier(), "startTime_", "finishTime_", "inputTrace_", StreamTrace.class, "outputTrace_", StreamTrace.class, "threadId_"});
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<CalculatorTrace> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (CalculatorTrace.class) {
                            try {
                                Parser<CalculatorTrace> parser2 = PARSER;
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
                CalculatorTrace defaultInstance = new CalculatorTrace();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(CalculatorTrace.class, defaultInstance);
            }

            public static CalculatorTrace getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<CalculatorTrace> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        public boolean hasBaseTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public long getBaseTime() {
            return this.baseTime_;
        }

        /* access modifiers changed from: private */
        public void setBaseTime(long value) {
            this.bitField0_ |= 1;
            this.baseTime_ = value;
        }

        /* access modifiers changed from: private */
        public void clearBaseTime() {
            this.bitField0_ &= -2;
            this.baseTime_ = 0;
        }

        public boolean hasBaseTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public long getBaseTimestamp() {
            return this.baseTimestamp_;
        }

        /* access modifiers changed from: private */
        public void setBaseTimestamp(long value) {
            this.bitField0_ |= 2;
            this.baseTimestamp_ = value;
        }

        /* access modifiers changed from: private */
        public void clearBaseTimestamp() {
            this.bitField0_ &= -3;
            this.baseTimestamp_ = 0;
        }

        public List<String> getCalculatorNameList() {
            return this.calculatorName_;
        }

        public int getCalculatorNameCount() {
            return this.calculatorName_.size();
        }

        public String getCalculatorName(int index) {
            return (String) this.calculatorName_.get(index);
        }

        public ByteString getCalculatorNameBytes(int index) {
            return ByteString.copyFromUtf8((String) this.calculatorName_.get(index));
        }

        private void ensureCalculatorNameIsMutable() {
            if (!this.calculatorName_.isModifiable()) {
                this.calculatorName_ = GeneratedMessageLite.mutableCopy(this.calculatorName_);
            }
        }

        /* access modifiers changed from: private */
        public void setCalculatorName(int index, String value) {
            value.getClass();
            ensureCalculatorNameIsMutable();
            this.calculatorName_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addCalculatorName(String value) {
            value.getClass();
            ensureCalculatorNameIsMutable();
            this.calculatorName_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllCalculatorName(Iterable<String> values) {
            ensureCalculatorNameIsMutable();
            AbstractMessageLite.addAll(values, this.calculatorName_);
        }

        /* access modifiers changed from: private */
        public void clearCalculatorName() {
            this.calculatorName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addCalculatorNameBytes(ByteString value) {
            ensureCalculatorNameIsMutable();
            this.calculatorName_.add(value.toStringUtf8());
        }

        public List<String> getStreamNameList() {
            return this.streamName_;
        }

        public int getStreamNameCount() {
            return this.streamName_.size();
        }

        public String getStreamName(int index) {
            return (String) this.streamName_.get(index);
        }

        public ByteString getStreamNameBytes(int index) {
            return ByteString.copyFromUtf8((String) this.streamName_.get(index));
        }

        private void ensureStreamNameIsMutable() {
            if (!this.streamName_.isModifiable()) {
                this.streamName_ = GeneratedMessageLite.mutableCopy(this.streamName_);
            }
        }

        /* access modifiers changed from: private */
        public void setStreamName(int index, String value) {
            value.getClass();
            ensureStreamNameIsMutable();
            this.streamName_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addStreamName(String value) {
            value.getClass();
            ensureStreamNameIsMutable();
            this.streamName_.add(value);
        }

        /* access modifiers changed from: private */
        public void addAllStreamName(Iterable<String> values) {
            ensureStreamNameIsMutable();
            AbstractMessageLite.addAll(values, this.streamName_);
        }

        /* access modifiers changed from: private */
        public void clearStreamName() {
            this.streamName_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void addStreamNameBytes(ByteString value) {
            ensureStreamNameIsMutable();
            this.streamName_.add(value.toStringUtf8());
        }

        public List<CalculatorTrace> getCalculatorTraceList() {
            return this.calculatorTrace_;
        }

        public List<? extends CalculatorTraceOrBuilder> getCalculatorTraceOrBuilderList() {
            return this.calculatorTrace_;
        }

        public int getCalculatorTraceCount() {
            return this.calculatorTrace_.size();
        }

        public CalculatorTrace getCalculatorTrace(int index) {
            return (CalculatorTrace) this.calculatorTrace_.get(index);
        }

        public CalculatorTraceOrBuilder getCalculatorTraceOrBuilder(int index) {
            return (CalculatorTraceOrBuilder) this.calculatorTrace_.get(index);
        }

        private void ensureCalculatorTraceIsMutable() {
            if (!this.calculatorTrace_.isModifiable()) {
                this.calculatorTrace_ = GeneratedMessageLite.mutableCopy(this.calculatorTrace_);
            }
        }

        /* access modifiers changed from: private */
        public void setCalculatorTrace(int index, CalculatorTrace value) {
            value.getClass();
            ensureCalculatorTraceIsMutable();
            this.calculatorTrace_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addCalculatorTrace(CalculatorTrace value) {
            value.getClass();
            ensureCalculatorTraceIsMutable();
            this.calculatorTrace_.add(value);
        }

        /* access modifiers changed from: private */
        public void addCalculatorTrace(int index, CalculatorTrace value) {
            value.getClass();
            ensureCalculatorTraceIsMutable();
            this.calculatorTrace_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllCalculatorTrace(Iterable<? extends CalculatorTrace> values) {
            ensureCalculatorTraceIsMutable();
            AbstractMessageLite.addAll(values, this.calculatorTrace_);
        }

        /* access modifiers changed from: private */
        public void clearCalculatorTrace() {
            this.calculatorTrace_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeCalculatorTrace(int index) {
            ensureCalculatorTraceIsMutable();
            this.calculatorTrace_.remove(index);
        }

        public static GraphTrace parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphTrace parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphTrace parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphTrace parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphTrace parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphTrace parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphTrace parseFrom(InputStream input) throws IOException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphTrace parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GraphTrace parseDelimitedFrom(InputStream input) throws IOException {
            return (GraphTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphTrace parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphTrace) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GraphTrace parseFrom(CodedInputStream input) throws IOException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphTrace parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphTrace) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(GraphTrace prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<GraphTrace, Builder> implements GraphTraceOrBuilder {
            private Builder() {
                super(GraphTrace.DEFAULT_INSTANCE);
            }

            public boolean hasBaseTime() {
                return ((GraphTrace) this.instance).hasBaseTime();
            }

            public long getBaseTime() {
                return ((GraphTrace) this.instance).getBaseTime();
            }

            public Builder setBaseTime(long value) {
                copyOnWrite();
                ((GraphTrace) this.instance).setBaseTime(value);
                return this;
            }

            public Builder clearBaseTime() {
                copyOnWrite();
                ((GraphTrace) this.instance).clearBaseTime();
                return this;
            }

            public boolean hasBaseTimestamp() {
                return ((GraphTrace) this.instance).hasBaseTimestamp();
            }

            public long getBaseTimestamp() {
                return ((GraphTrace) this.instance).getBaseTimestamp();
            }

            public Builder setBaseTimestamp(long value) {
                copyOnWrite();
                ((GraphTrace) this.instance).setBaseTimestamp(value);
                return this;
            }

            public Builder clearBaseTimestamp() {
                copyOnWrite();
                ((GraphTrace) this.instance).clearBaseTimestamp();
                return this;
            }

            public List<String> getCalculatorNameList() {
                return Collections.unmodifiableList(((GraphTrace) this.instance).getCalculatorNameList());
            }

            public int getCalculatorNameCount() {
                return ((GraphTrace) this.instance).getCalculatorNameCount();
            }

            public String getCalculatorName(int index) {
                return ((GraphTrace) this.instance).getCalculatorName(index);
            }

            public ByteString getCalculatorNameBytes(int index) {
                return ((GraphTrace) this.instance).getCalculatorNameBytes(index);
            }

            public Builder setCalculatorName(int index, String value) {
                copyOnWrite();
                ((GraphTrace) this.instance).setCalculatorName(index, value);
                return this;
            }

            public Builder addCalculatorName(String value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorName(value);
                return this;
            }

            public Builder addAllCalculatorName(Iterable<String> values) {
                copyOnWrite();
                ((GraphTrace) this.instance).addAllCalculatorName(values);
                return this;
            }

            public Builder clearCalculatorName() {
                copyOnWrite();
                ((GraphTrace) this.instance).clearCalculatorName();
                return this;
            }

            public Builder addCalculatorNameBytes(ByteString value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorNameBytes(value);
                return this;
            }

            public List<String> getStreamNameList() {
                return Collections.unmodifiableList(((GraphTrace) this.instance).getStreamNameList());
            }

            public int getStreamNameCount() {
                return ((GraphTrace) this.instance).getStreamNameCount();
            }

            public String getStreamName(int index) {
                return ((GraphTrace) this.instance).getStreamName(index);
            }

            public ByteString getStreamNameBytes(int index) {
                return ((GraphTrace) this.instance).getStreamNameBytes(index);
            }

            public Builder setStreamName(int index, String value) {
                copyOnWrite();
                ((GraphTrace) this.instance).setStreamName(index, value);
                return this;
            }

            public Builder addStreamName(String value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addStreamName(value);
                return this;
            }

            public Builder addAllStreamName(Iterable<String> values) {
                copyOnWrite();
                ((GraphTrace) this.instance).addAllStreamName(values);
                return this;
            }

            public Builder clearStreamName() {
                copyOnWrite();
                ((GraphTrace) this.instance).clearStreamName();
                return this;
            }

            public Builder addStreamNameBytes(ByteString value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addStreamNameBytes(value);
                return this;
            }

            public List<CalculatorTrace> getCalculatorTraceList() {
                return Collections.unmodifiableList(((GraphTrace) this.instance).getCalculatorTraceList());
            }

            public int getCalculatorTraceCount() {
                return ((GraphTrace) this.instance).getCalculatorTraceCount();
            }

            public CalculatorTrace getCalculatorTrace(int index) {
                return ((GraphTrace) this.instance).getCalculatorTrace(index);
            }

            public Builder setCalculatorTrace(int index, CalculatorTrace value) {
                copyOnWrite();
                ((GraphTrace) this.instance).setCalculatorTrace(index, value);
                return this;
            }

            public Builder setCalculatorTrace(int index, CalculatorTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphTrace) this.instance).setCalculatorTrace(index, (CalculatorTrace) builderForValue.build());
                return this;
            }

            public Builder addCalculatorTrace(CalculatorTrace value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorTrace(value);
                return this;
            }

            public Builder addCalculatorTrace(int index, CalculatorTrace value) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorTrace(index, value);
                return this;
            }

            public Builder addCalculatorTrace(CalculatorTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorTrace((CalculatorTrace) builderForValue.build());
                return this;
            }

            public Builder addCalculatorTrace(int index, CalculatorTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphTrace) this.instance).addCalculatorTrace(index, (CalculatorTrace) builderForValue.build());
                return this;
            }

            public Builder addAllCalculatorTrace(Iterable<? extends CalculatorTrace> values) {
                copyOnWrite();
                ((GraphTrace) this.instance).addAllCalculatorTrace(values);
                return this;
            }

            public Builder clearCalculatorTrace() {
                copyOnWrite();
                ((GraphTrace) this.instance).clearCalculatorTrace();
                return this;
            }

            public Builder removeCalculatorTrace(int index) {
                copyOnWrite();
                ((GraphTrace) this.instance).removeCalculatorTrace(index);
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new GraphTrace();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u001a\u0004\u001a\u0005\u001b", new Object[]{"bitField0_", "baseTime_", "baseTimestamp_", "calculatorName_", "streamName_", "calculatorTrace_", CalculatorTrace.class});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<GraphTrace> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GraphTrace.class) {
                        try {
                            Parser<GraphTrace> parser2 = PARSER;
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
            GraphTrace defaultInstance = new GraphTrace();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(GraphTrace.class, defaultInstance);
        }

        public static GraphTrace getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<GraphTrace> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class GraphProfile extends GeneratedMessageLite<GraphProfile, GraphProfile.Builder> implements GraphProfileOrBuilder {
        public static final int CALCULATOR_PROFILES_FIELD_NUMBER = 2;
        public static final int CONFIG_FIELD_NUMBER = 3;
        /* access modifiers changed from: private */
        public static final GraphProfile DEFAULT_INSTANCE;
        public static final int GRAPH_TRACE_FIELD_NUMBER = 1;
        private static volatile Parser<GraphProfile> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<CalculatorProfile> calculatorProfiles_ = emptyProtobufList();
        private CalculatorProto.CalculatorGraphConfig config_;
        private Internal.ProtobufList<GraphTrace> graphTrace_ = emptyProtobufList();
        private byte memoizedIsInitialized = 2;

        private GraphProfile() {
        }

        public List<GraphTrace> getGraphTraceList() {
            return this.graphTrace_;
        }

        public List<? extends GraphTraceOrBuilder> getGraphTraceOrBuilderList() {
            return this.graphTrace_;
        }

        public int getGraphTraceCount() {
            return this.graphTrace_.size();
        }

        public GraphTrace getGraphTrace(int index) {
            return (GraphTrace) this.graphTrace_.get(index);
        }

        public GraphTraceOrBuilder getGraphTraceOrBuilder(int index) {
            return (GraphTraceOrBuilder) this.graphTrace_.get(index);
        }

        private void ensureGraphTraceIsMutable() {
            if (!this.graphTrace_.isModifiable()) {
                this.graphTrace_ = GeneratedMessageLite.mutableCopy(this.graphTrace_);
            }
        }

        /* access modifiers changed from: private */
        public void setGraphTrace(int index, GraphTrace value) {
            value.getClass();
            ensureGraphTraceIsMutable();
            this.graphTrace_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addGraphTrace(GraphTrace value) {
            value.getClass();
            ensureGraphTraceIsMutable();
            this.graphTrace_.add(value);
        }

        /* access modifiers changed from: private */
        public void addGraphTrace(int index, GraphTrace value) {
            value.getClass();
            ensureGraphTraceIsMutable();
            this.graphTrace_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllGraphTrace(Iterable<? extends GraphTrace> values) {
            ensureGraphTraceIsMutable();
            AbstractMessageLite.addAll(values, this.graphTrace_);
        }

        /* access modifiers changed from: private */
        public void clearGraphTrace() {
            this.graphTrace_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeGraphTrace(int index) {
            ensureGraphTraceIsMutable();
            this.graphTrace_.remove(index);
        }

        public List<CalculatorProfile> getCalculatorProfilesList() {
            return this.calculatorProfiles_;
        }

        public List<? extends CalculatorProfileOrBuilder> getCalculatorProfilesOrBuilderList() {
            return this.calculatorProfiles_;
        }

        public int getCalculatorProfilesCount() {
            return this.calculatorProfiles_.size();
        }

        public CalculatorProfile getCalculatorProfiles(int index) {
            return (CalculatorProfile) this.calculatorProfiles_.get(index);
        }

        public CalculatorProfileOrBuilder getCalculatorProfilesOrBuilder(int index) {
            return (CalculatorProfileOrBuilder) this.calculatorProfiles_.get(index);
        }

        private void ensureCalculatorProfilesIsMutable() {
            if (!this.calculatorProfiles_.isModifiable()) {
                this.calculatorProfiles_ = GeneratedMessageLite.mutableCopy(this.calculatorProfiles_);
            }
        }

        /* access modifiers changed from: private */
        public void setCalculatorProfiles(int index, CalculatorProfile value) {
            value.getClass();
            ensureCalculatorProfilesIsMutable();
            this.calculatorProfiles_.set(index, value);
        }

        /* access modifiers changed from: private */
        public void addCalculatorProfiles(CalculatorProfile value) {
            value.getClass();
            ensureCalculatorProfilesIsMutable();
            this.calculatorProfiles_.add(value);
        }

        /* access modifiers changed from: private */
        public void addCalculatorProfiles(int index, CalculatorProfile value) {
            value.getClass();
            ensureCalculatorProfilesIsMutable();
            this.calculatorProfiles_.add(index, value);
        }

        /* access modifiers changed from: private */
        public void addAllCalculatorProfiles(Iterable<? extends CalculatorProfile> values) {
            ensureCalculatorProfilesIsMutable();
            AbstractMessageLite.addAll(values, this.calculatorProfiles_);
        }

        /* access modifiers changed from: private */
        public void clearCalculatorProfiles() {
            this.calculatorProfiles_ = emptyProtobufList();
        }

        /* access modifiers changed from: private */
        public void removeCalculatorProfiles(int index) {
            ensureCalculatorProfilesIsMutable();
            this.calculatorProfiles_.remove(index);
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

        public static GraphProfile parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphProfile parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphProfile parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphProfile parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphProfile parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static GraphProfile parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static GraphProfile parseFrom(InputStream input) throws IOException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphProfile parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GraphProfile parseDelimitedFrom(InputStream input) throws IOException {
            return (GraphProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphProfile parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphProfile) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static GraphProfile parseFrom(CodedInputStream input) throws IOException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static GraphProfile parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (GraphProfile) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(GraphProfile prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<GraphProfile, Builder> implements GraphProfileOrBuilder {
            private Builder() {
                super(GraphProfile.DEFAULT_INSTANCE);
            }

            public List<GraphTrace> getGraphTraceList() {
                return Collections.unmodifiableList(((GraphProfile) this.instance).getGraphTraceList());
            }

            public int getGraphTraceCount() {
                return ((GraphProfile) this.instance).getGraphTraceCount();
            }

            public GraphTrace getGraphTrace(int index) {
                return ((GraphProfile) this.instance).getGraphTrace(index);
            }

            public Builder setGraphTrace(int index, GraphTrace value) {
                copyOnWrite();
                ((GraphProfile) this.instance).setGraphTrace(index, value);
                return this;
            }

            public Builder setGraphTrace(int index, GraphTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).setGraphTrace(index, (GraphTrace) builderForValue.build());
                return this;
            }

            public Builder addGraphTrace(GraphTrace value) {
                copyOnWrite();
                ((GraphProfile) this.instance).addGraphTrace(value);
                return this;
            }

            public Builder addGraphTrace(int index, GraphTrace value) {
                copyOnWrite();
                ((GraphProfile) this.instance).addGraphTrace(index, value);
                return this;
            }

            public Builder addGraphTrace(GraphTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).addGraphTrace((GraphTrace) builderForValue.build());
                return this;
            }

            public Builder addGraphTrace(int index, GraphTrace.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).addGraphTrace(index, (GraphTrace) builderForValue.build());
                return this;
            }

            public Builder addAllGraphTrace(Iterable<? extends GraphTrace> values) {
                copyOnWrite();
                ((GraphProfile) this.instance).addAllGraphTrace(values);
                return this;
            }

            public Builder clearGraphTrace() {
                copyOnWrite();
                ((GraphProfile) this.instance).clearGraphTrace();
                return this;
            }

            public Builder removeGraphTrace(int index) {
                copyOnWrite();
                ((GraphProfile) this.instance).removeGraphTrace(index);
                return this;
            }

            public List<CalculatorProfile> getCalculatorProfilesList() {
                return Collections.unmodifiableList(((GraphProfile) this.instance).getCalculatorProfilesList());
            }

            public int getCalculatorProfilesCount() {
                return ((GraphProfile) this.instance).getCalculatorProfilesCount();
            }

            public CalculatorProfile getCalculatorProfiles(int index) {
                return ((GraphProfile) this.instance).getCalculatorProfiles(index);
            }

            public Builder setCalculatorProfiles(int index, CalculatorProfile value) {
                copyOnWrite();
                ((GraphProfile) this.instance).setCalculatorProfiles(index, value);
                return this;
            }

            public Builder setCalculatorProfiles(int index, CalculatorProfile.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).setCalculatorProfiles(index, (CalculatorProfile) builderForValue.build());
                return this;
            }

            public Builder addCalculatorProfiles(CalculatorProfile value) {
                copyOnWrite();
                ((GraphProfile) this.instance).addCalculatorProfiles(value);
                return this;
            }

            public Builder addCalculatorProfiles(int index, CalculatorProfile value) {
                copyOnWrite();
                ((GraphProfile) this.instance).addCalculatorProfiles(index, value);
                return this;
            }

            public Builder addCalculatorProfiles(CalculatorProfile.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).addCalculatorProfiles((CalculatorProfile) builderForValue.build());
                return this;
            }

            public Builder addCalculatorProfiles(int index, CalculatorProfile.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).addCalculatorProfiles(index, (CalculatorProfile) builderForValue.build());
                return this;
            }

            public Builder addAllCalculatorProfiles(Iterable<? extends CalculatorProfile> values) {
                copyOnWrite();
                ((GraphProfile) this.instance).addAllCalculatorProfiles(values);
                return this;
            }

            public Builder clearCalculatorProfiles() {
                copyOnWrite();
                ((GraphProfile) this.instance).clearCalculatorProfiles();
                return this;
            }

            public Builder removeCalculatorProfiles(int index) {
                copyOnWrite();
                ((GraphProfile) this.instance).removeCalculatorProfiles(index);
                return this;
            }

            public boolean hasConfig() {
                return ((GraphProfile) this.instance).hasConfig();
            }

            public CalculatorProto.CalculatorGraphConfig getConfig() {
                return ((GraphProfile) this.instance).getConfig();
            }

            public Builder setConfig(CalculatorProto.CalculatorGraphConfig value) {
                copyOnWrite();
                ((GraphProfile) this.instance).setConfig(value);
                return this;
            }

            public Builder setConfig(CalculatorProto.CalculatorGraphConfig.Builder builderForValue) {
                copyOnWrite();
                ((GraphProfile) this.instance).setConfig((CalculatorProto.CalculatorGraphConfig) builderForValue.build());
                return this;
            }

            public Builder mergeConfig(CalculatorProto.CalculatorGraphConfig value) {
                copyOnWrite();
                ((GraphProfile) this.instance).mergeConfig(value);
                return this;
            }

            public Builder clearConfig() {
                copyOnWrite();
                ((GraphProfile) this.instance).clearConfig();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            int i = 0;
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new GraphProfile();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u001b\u0002\u001b\u0003Љ\u0000", new Object[]{"bitField0_", "graphTrace_", GraphTrace.class, "calculatorProfiles_", CalculatorProfile.class, "config_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<GraphProfile> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GraphProfile.class) {
                        try {
                            Parser<GraphProfile> parser2 = PARSER;
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
            GraphProfile defaultInstance = new GraphProfile();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(GraphProfile.class, defaultInstance);
        }

        public static GraphProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<GraphProfile> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
