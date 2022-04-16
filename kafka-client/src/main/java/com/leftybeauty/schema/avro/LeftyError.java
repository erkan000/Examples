/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.leftybeauty.schema.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class LeftyError extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 965592838534481593L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LeftyError\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"errorName\",\"type\":\"string\"},{\"name\":\"sourceService\",\"type\":\"string\"},{\"name\":\"message\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LeftyError> ENCODER =
      new BinaryMessageEncoder<LeftyError>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LeftyError> DECODER =
      new BinaryMessageDecoder<LeftyError>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LeftyError> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LeftyError> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LeftyError> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LeftyError>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LeftyError to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LeftyError from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LeftyError instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LeftyError fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence errorName;
  private java.lang.CharSequence sourceService;
  private java.lang.CharSequence message;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LeftyError() {}

  /**
   * All-args constructor.
   * @param errorName The new value for errorName
   * @param sourceService The new value for sourceService
   * @param message The new value for message
   */
  public LeftyError(java.lang.CharSequence errorName, java.lang.CharSequence sourceService, java.lang.CharSequence message) {
    this.errorName = errorName;
    this.sourceService = sourceService;
    this.message = message;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return errorName;
    case 1: return sourceService;
    case 2: return message;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: errorName = (java.lang.CharSequence)value$; break;
    case 1: sourceService = (java.lang.CharSequence)value$; break;
    case 2: message = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'errorName' field.
   * @return The value of the 'errorName' field.
   */
  public java.lang.CharSequence getErrorName() {
    return errorName;
  }


  /**
   * Sets the value of the 'errorName' field.
   * @param value the value to set.
   */
  public void setErrorName(java.lang.CharSequence value) {
    this.errorName = value;
  }

  /**
   * Gets the value of the 'sourceService' field.
   * @return The value of the 'sourceService' field.
   */
  public java.lang.CharSequence getSourceService() {
    return sourceService;
  }


  /**
   * Sets the value of the 'sourceService' field.
   * @param value the value to set.
   */
  public void setSourceService(java.lang.CharSequence value) {
    this.sourceService = value;
  }

  /**
   * Gets the value of the 'message' field.
   * @return The value of the 'message' field.
   */
  public java.lang.CharSequence getMessage() {
    return message;
  }


  /**
   * Sets the value of the 'message' field.
   * @param value the value to set.
   */
  public void setMessage(java.lang.CharSequence value) {
    this.message = value;
  }

  /**
   * Creates a new LeftyError RecordBuilder.
   * @return A new LeftyError RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyError.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.LeftyError.Builder();
  }

  /**
   * Creates a new LeftyError RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LeftyError RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyError.Builder newBuilder(com.leftybeauty.schema.avro.LeftyError.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyError.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyError.Builder(other);
    }
  }

  /**
   * Creates a new LeftyError RecordBuilder by copying an existing LeftyError instance.
   * @param other The existing instance to copy.
   * @return A new LeftyError RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyError.Builder newBuilder(com.leftybeauty.schema.avro.LeftyError other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyError.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyError.Builder(other);
    }
  }

  /**
   * RecordBuilder for LeftyError instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LeftyError>
    implements org.apache.avro.data.RecordBuilder<LeftyError> {

    private java.lang.CharSequence errorName;
    private java.lang.CharSequence sourceService;
    private java.lang.CharSequence message;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyError.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.errorName)) {
        this.errorName = data().deepCopy(fields()[0].schema(), other.errorName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sourceService)) {
        this.sourceService = data().deepCopy(fields()[1].schema(), other.sourceService);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing LeftyError instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyError other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.errorName)) {
        this.errorName = data().deepCopy(fields()[0].schema(), other.errorName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sourceService)) {
        this.sourceService = data().deepCopy(fields()[1].schema(), other.sourceService);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.message)) {
        this.message = data().deepCopy(fields()[2].schema(), other.message);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'errorName' field.
      * @return The value.
      */
    public java.lang.CharSequence getErrorName() {
      return errorName;
    }


    /**
      * Sets the value of the 'errorName' field.
      * @param value The value of 'errorName'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder setErrorName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.errorName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'errorName' field has been set.
      * @return True if the 'errorName' field has been set, false otherwise.
      */
    public boolean hasErrorName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'errorName' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder clearErrorName() {
      errorName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sourceService' field.
      * @return The value.
      */
    public java.lang.CharSequence getSourceService() {
      return sourceService;
    }


    /**
      * Sets the value of the 'sourceService' field.
      * @param value The value of 'sourceService'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder setSourceService(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.sourceService = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sourceService' field has been set.
      * @return True if the 'sourceService' field has been set, false otherwise.
      */
    public boolean hasSourceService() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sourceService' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder clearSourceService() {
      sourceService = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'message' field.
      * @return The value.
      */
    public java.lang.CharSequence getMessage() {
      return message;
    }


    /**
      * Sets the value of the 'message' field.
      * @param value The value of 'message'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder setMessage(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.message = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'message' field has been set.
      * @return True if the 'message' field has been set, false otherwise.
      */
    public boolean hasMessage() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'message' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyError.Builder clearMessage() {
      message = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LeftyError build() {
      try {
        LeftyError record = new LeftyError();
        record.errorName = fieldSetFlags()[0] ? this.errorName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.sourceService = fieldSetFlags()[1] ? this.sourceService : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.message = fieldSetFlags()[2] ? this.message : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LeftyError>
    WRITER$ = (org.apache.avro.io.DatumWriter<LeftyError>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LeftyError>
    READER$ = (org.apache.avro.io.DatumReader<LeftyError>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.errorName);

    out.writeString(this.sourceService);

    out.writeString(this.message);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.errorName = in.readString(this.errorName instanceof Utf8 ? (Utf8)this.errorName : null);

      this.sourceService = in.readString(this.sourceService instanceof Utf8 ? (Utf8)this.sourceService : null);

      this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.errorName = in.readString(this.errorName instanceof Utf8 ? (Utf8)this.errorName : null);
          break;

        case 1:
          this.sourceService = in.readString(this.sourceService instanceof Utf8 ? (Utf8)this.sourceService : null);
          break;

        case 2:
          this.message = in.readString(this.message instanceof Utf8 ? (Utf8)this.message : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










