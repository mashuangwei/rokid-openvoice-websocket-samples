// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: speech_types.proto

package rokid.open.speech.v1;

public final class SpeechTypes {
  private SpeechTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code rokid.open.speech.v1.SpeechErrorCode}
   */
  public enum SpeechErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0),
    /**
     * <code>UNAUTHENTICATED = 2;</code>
     */
    UNAUTHENTICATED(2),
    /**
     * <code>CONNECTION_EXCEED = 3;</code>
     */
    CONNECTION_EXCEED(3),
    /**
     * <code>RESOURCE_EXHASTED = 4;</code>
     */
    RESOURCE_EXHASTED(4),
    /**
     * <code>BUSY = 5;</code>
     */
    BUSY(5),
    /**
     * <code>INTERNAL = 6;</code>
     */
    INTERNAL(6),
    ;

    /**
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <code>UNAUTHENTICATED = 2;</code>
     */
    public static final int UNAUTHENTICATED_VALUE = 2;
    /**
     * <code>CONNECTION_EXCEED = 3;</code>
     */
    public static final int CONNECTION_EXCEED_VALUE = 3;
    /**
     * <code>RESOURCE_EXHASTED = 4;</code>
     */
    public static final int RESOURCE_EXHASTED_VALUE = 4;
    /**
     * <code>BUSY = 5;</code>
     */
    public static final int BUSY_VALUE = 5;
    /**
     * <code>INTERNAL = 6;</code>
     */
    public static final int INTERNAL_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpeechErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static SpeechErrorCode forNumber(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 2: return UNAUTHENTICATED;
        case 3: return CONNECTION_EXCEED;
        case 4: return RESOURCE_EXHASTED;
        case 5: return BUSY;
        case 6: return INTERNAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SpeechErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SpeechErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SpeechErrorCode>() {
            public SpeechErrorCode findValueByNumber(int number) {
              return SpeechErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return rokid.open.speech.v1.SpeechTypes.getDescriptor().getEnumTypes().get(0);
    }

    private static final SpeechErrorCode[] VALUES = values();

    public static SpeechErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SpeechErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rokid.open.speech.v1.SpeechErrorCode)
  }

  /**
   * Protobuf enum {@code rokid.open.speech.v1.ReqType}
   */
  public enum ReqType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>START = 0;</code>
     */
    START(0),
    /**
     * <code>VOICE = 1;</code>
     */
    VOICE(1),
    /**
     * <code>END = 2;</code>
     */
    END(2),
    /**
     * <code>TEXT = 3;</code>
     */
    TEXT(3),
    ;

    /**
     * <code>START = 0;</code>
     */
    public static final int START_VALUE = 0;
    /**
     * <code>VOICE = 1;</code>
     */
    public static final int VOICE_VALUE = 1;
    /**
     * <code>END = 2;</code>
     */
    public static final int END_VALUE = 2;
    /**
     * <code>TEXT = 3;</code>
     */
    public static final int TEXT_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReqType valueOf(int value) {
      return forNumber(value);
    }

    public static ReqType forNumber(int value) {
      switch (value) {
        case 0: return START;
        case 1: return VOICE;
        case 2: return END;
        case 3: return TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReqType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReqType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReqType>() {
            public ReqType findValueByNumber(int number) {
              return ReqType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return rokid.open.speech.v1.SpeechTypes.getDescriptor().getEnumTypes().get(1);
    }

    private static final ReqType[] VALUES = values();

    public static ReqType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ReqType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rokid.open.speech.v1.ReqType)
  }

  /**
   * Protobuf enum {@code rokid.open.speech.v1.Codec}
   */
  public enum Codec
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PCM = 0;</code>
     */
    PCM(0),
    /**
     * <code>OPU = 1;</code>
     */
    OPU(1),
    /**
     * <code>OPU2 = 2;</code>
     */
    OPU2(2),
    ;

    /**
     * <code>PCM = 0;</code>
     */
    public static final int PCM_VALUE = 0;
    /**
     * <code>OPU = 1;</code>
     */
    public static final int OPU_VALUE = 1;
    /**
     * <code>OPU2 = 2;</code>
     */
    public static final int OPU2_VALUE = 2;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Codec valueOf(int value) {
      return forNumber(value);
    }

    public static Codec forNumber(int value) {
      switch (value) {
        case 0: return PCM;
        case 1: return OPU;
        case 2: return OPU2;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Codec>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Codec> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Codec>() {
            public Codec findValueByNumber(int number) {
              return Codec.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return rokid.open.speech.v1.SpeechTypes.getDescriptor().getEnumTypes().get(2);
    }

    private static final Codec[] VALUES = values();

    public static Codec valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Codec(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:rokid.open.speech.v1.Codec)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022speech_types.proto\022\024rokid.open.speech." +
      "v1*y\n\017SpeechErrorCode\022\013\n\007SUCCESS\020\000\022\023\n\017UN" +
      "AUTHENTICATED\020\002\022\025\n\021CONNECTION_EXCEED\020\003\022\025" +
      "\n\021RESOURCE_EXHASTED\020\004\022\010\n\004BUSY\020\005\022\014\n\010INTER" +
      "NAL\020\006*2\n\007ReqType\022\t\n\005START\020\000\022\t\n\005VOICE\020\001\022\007" +
      "\n\003END\020\002\022\010\n\004TEXT\020\003*#\n\005Codec\022\007\n\003PCM\020\000\022\007\n\003O" +
      "PU\020\001\022\010\n\004OPU2\020\002"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
