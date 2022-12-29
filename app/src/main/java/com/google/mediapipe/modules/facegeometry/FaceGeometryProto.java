package com.google.mediapipe.modules.facegeometry;

import com.google.mediapipe.formats.proto.MatrixDataProto;
import com.google.mediapipe.modules.facegeometry.Mesh3dProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FaceGeometryProto {

    public interface FaceGeometryOrBuilder extends MessageLiteOrBuilder {
        Mesh3dProto.Mesh3d getMesh();

        MatrixDataProto.MatrixData getPoseTransformMatrix();

        boolean hasMesh();

        boolean hasPoseTransformMatrix();
    }

    private FaceGeometryProto() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class FaceGeometry extends GeneratedMessageLite<FaceGeometry, FaceGeometry.Builder> implements FaceGeometryOrBuilder {
        /* access modifiers changed from: private */
        public static final FaceGeometry DEFAULT_INSTANCE;
        public static final int MESH_FIELD_NUMBER = 1;
        private static volatile Parser<FaceGeometry> PARSER = null;
        public static final int POSE_TRANSFORM_MATRIX_FIELD_NUMBER = 2;
        private int bitField0_;
        private Mesh3dProto.Mesh3d mesh_;
        private MatrixDataProto.MatrixData poseTransformMatrix_;

        private FaceGeometry() {
        }

        public boolean hasMesh() {
            return (this.bitField0_ & 1) != 0;
        }

        public Mesh3dProto.Mesh3d getMesh() {
            return this.mesh_ == null ? Mesh3dProto.Mesh3d.getDefaultInstance() : this.mesh_;
        }

        /* access modifiers changed from: private */
        public void setMesh(Mesh3dProto.Mesh3d value) {
            value.getClass();
            this.mesh_ = value;
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void mergeMesh(Mesh3dProto.Mesh3d value) {
            value.getClass();
            if (this.mesh_ == null || this.mesh_ == Mesh3dProto.Mesh3d.getDefaultInstance()) {
                this.mesh_ = value;
            } else {
                this.mesh_ = (Mesh3dProto.Mesh3d) ((Mesh3dProto.Mesh3d.Builder) Mesh3dProto.Mesh3d.newBuilder(this.mesh_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* access modifiers changed from: private */
        public void clearMesh() {
            this.mesh_ = null;
            this.bitField0_ &= -2;
        }

        public boolean hasPoseTransformMatrix() {
            return (this.bitField0_ & 2) != 0;
        }

        public MatrixDataProto.MatrixData getPoseTransformMatrix() {
            return this.poseTransformMatrix_ == null ? MatrixDataProto.MatrixData.getDefaultInstance() : this.poseTransformMatrix_;
        }

        /* access modifiers changed from: private */
        public void setPoseTransformMatrix(MatrixDataProto.MatrixData value) {
            value.getClass();
            this.poseTransformMatrix_ = value;
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void mergePoseTransformMatrix(MatrixDataProto.MatrixData value) {
            value.getClass();
            if (this.poseTransformMatrix_ == null || this.poseTransformMatrix_ == MatrixDataProto.MatrixData.getDefaultInstance()) {
                this.poseTransformMatrix_ = value;
            } else {
                this.poseTransformMatrix_ = (MatrixDataProto.MatrixData) ((MatrixDataProto.MatrixData.Builder) MatrixDataProto.MatrixData.newBuilder(this.poseTransformMatrix_).mergeFrom(value)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* access modifiers changed from: private */
        public void clearPoseTransformMatrix() {
            this.poseTransformMatrix_ = null;
            this.bitField0_ &= -3;
        }

        public static FaceGeometry parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FaceGeometry parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FaceGeometry parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FaceGeometry parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FaceGeometry parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FaceGeometry parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FaceGeometry parseFrom(InputStream input) throws IOException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FaceGeometry parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FaceGeometry parseDelimitedFrom(InputStream input) throws IOException {
            return (FaceGeometry) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FaceGeometry parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FaceGeometry) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FaceGeometry parseFrom(CodedInputStream input) throws IOException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FaceGeometry parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FaceGeometry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FaceGeometry prototype) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FaceGeometry, Builder> implements FaceGeometryOrBuilder {
            private Builder() {
                super(FaceGeometry.DEFAULT_INSTANCE);
            }

            public boolean hasMesh() {
                return ((FaceGeometry) this.instance).hasMesh();
            }

            public Mesh3dProto.Mesh3d getMesh() {
                return ((FaceGeometry) this.instance).getMesh();
            }

            public Builder setMesh(Mesh3dProto.Mesh3d value) {
                copyOnWrite();
                ((FaceGeometry) this.instance).setMesh(value);
                return this;
            }

            public Builder setMesh(Mesh3dProto.Mesh3d.Builder builderForValue) {
                copyOnWrite();
                ((FaceGeometry) this.instance).setMesh((Mesh3dProto.Mesh3d) builderForValue.build());
                return this;
            }

            public Builder mergeMesh(Mesh3dProto.Mesh3d value) {
                copyOnWrite();
                ((FaceGeometry) this.instance).mergeMesh(value);
                return this;
            }

            public Builder clearMesh() {
                copyOnWrite();
                ((FaceGeometry) this.instance).clearMesh();
                return this;
            }

            public boolean hasPoseTransformMatrix() {
                return ((FaceGeometry) this.instance).hasPoseTransformMatrix();
            }

            public MatrixDataProto.MatrixData getPoseTransformMatrix() {
                return ((FaceGeometry) this.instance).getPoseTransformMatrix();
            }

            public Builder setPoseTransformMatrix(MatrixDataProto.MatrixData value) {
                copyOnWrite();
                ((FaceGeometry) this.instance).setPoseTransformMatrix(value);
                return this;
            }

            public Builder setPoseTransformMatrix(MatrixDataProto.MatrixData.Builder builderForValue) {
                copyOnWrite();
                ((FaceGeometry) this.instance).setPoseTransformMatrix((MatrixDataProto.MatrixData) builderForValue.build());
                return this;
            }

            public Builder mergePoseTransformMatrix(MatrixDataProto.MatrixData value) {
                copyOnWrite();
                ((FaceGeometry) this.instance).mergePoseTransformMatrix(value);
                return this;
            }

            public Builder clearPoseTransformMatrix() {
                copyOnWrite();
                ((FaceGeometry) this.instance).clearPoseTransformMatrix();
                return this;
            }
        }

        /* access modifiers changed from: protected */
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new FaceGeometry();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"bitField0_", "mesh_", "poseTransformMatrix_"});
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FaceGeometry> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (FaceGeometry.class) {
                        try {
                            Parser<FaceGeometry> parser2 = PARSER;
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
            FaceGeometry defaultInstance = new FaceGeometry();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(FaceGeometry.class, defaultInstance);
        }

        public static FaceGeometry getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FaceGeometry> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
