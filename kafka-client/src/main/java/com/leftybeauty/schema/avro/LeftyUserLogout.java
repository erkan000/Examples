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
public class LeftyUserLogout extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6819542591675699027L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LeftyUserLogout\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"sessionId\",\"type\":\"string\"},{\"name\":\"logoutTimestamp\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LeftyUserLogout> ENCODER =
      new BinaryMessageEncoder<LeftyUserLogout>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LeftyUserLogout> DECODER =
      new BinaryMessageDecoder<LeftyUserLogout>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LeftyUserLogout> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LeftyUserLogout> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LeftyUserLogout> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LeftyUserLogout>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LeftyUserLogout to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LeftyUserLogout from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LeftyUserLogout instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LeftyUserLogout fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence sessionId;
  private java.lang.CharSequence logoutTimestamp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LeftyUserLogout() {}

  /**
   * All-args constructor.
   * @param sessionId The new value for sessionId
   * @param logoutTimestamp The new value for logoutTimestamp
   */
  public LeftyUserLogout(java.lang.CharSequence sessionId, java.lang.CharSequence logoutTimestamp) {
    this.sessionId = sessionId;
    this.logoutTimestamp = logoutTimestamp;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sessionId;
    case 1: return logoutTimestamp;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sessionId = (java.lang.CharSequence)value$; break;
    case 1: logoutTimestamp = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'sessionId' field.
   * @return The value of the 'sessionId' field.
   */
  public java.lang.CharSequence getSessionId() {
    return sessionId;
  }


  /**
   * Sets the value of the 'sessionId' field.
   * @param value the value to set.
   */
  public void setSessionId(java.lang.CharSequence value) {
    this.sessionId = value;
  }

  /**
   * Gets the value of the 'logoutTimestamp' field.
   * @return The value of the 'logoutTimestamp' field.
   */
  public java.lang.CharSequence getLogoutTimestamp() {
    return logoutTimestamp;
  }


  /**
   * Sets the value of the 'logoutTimestamp' field.
   * @param value the value to set.
   */
  public void setLogoutTimestamp(java.lang.CharSequence value) {
    this.logoutTimestamp = value;
  }

  /**
   * Creates a new LeftyUserLogout RecordBuilder.
   * @return A new LeftyUserLogout RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserLogout.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.LeftyUserLogout.Builder();
  }

  /**
   * Creates a new LeftyUserLogout RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LeftyUserLogout RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserLogout.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserLogout.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserLogout.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserLogout.Builder(other);
    }
  }

  /**
   * Creates a new LeftyUserLogout RecordBuilder by copying an existing LeftyUserLogout instance.
   * @param other The existing instance to copy.
   * @return A new LeftyUserLogout RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserLogout.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserLogout other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserLogout.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserLogout.Builder(other);
    }
  }

  /**
   * RecordBuilder for LeftyUserLogout instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LeftyUserLogout>
    implements org.apache.avro.data.RecordBuilder<LeftyUserLogout> {

    private java.lang.CharSequence sessionId;
    private java.lang.CharSequence logoutTimestamp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserLogout.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[0].schema(), other.sessionId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.logoutTimestamp)) {
        this.logoutTimestamp = data().deepCopy(fields()[1].schema(), other.logoutTimestamp);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing LeftyUserLogout instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserLogout other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.sessionId)) {
        this.sessionId = data().deepCopy(fields()[0].schema(), other.sessionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.logoutTimestamp)) {
        this.logoutTimestamp = data().deepCopy(fields()[1].schema(), other.logoutTimestamp);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'sessionId' field.
      * @return The value.
      */
    public java.lang.CharSequence getSessionId() {
      return sessionId;
    }


    /**
      * Sets the value of the 'sessionId' field.
      * @param value The value of 'sessionId'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserLogout.Builder setSessionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.sessionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sessionId' field has been set.
      * @return True if the 'sessionId' field has been set, false otherwise.
      */
    public boolean hasSessionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sessionId' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserLogout.Builder clearSessionId() {
      sessionId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'logoutTimestamp' field.
      * @return The value.
      */
    public java.lang.CharSequence getLogoutTimestamp() {
      return logoutTimestamp;
    }


    /**
      * Sets the value of the 'logoutTimestamp' field.
      * @param value The value of 'logoutTimestamp'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserLogout.Builder setLogoutTimestamp(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.logoutTimestamp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'logoutTimestamp' field has been set.
      * @return True if the 'logoutTimestamp' field has been set, false otherwise.
      */
    public boolean hasLogoutTimestamp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'logoutTimestamp' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserLogout.Builder clearLogoutTimestamp() {
      logoutTimestamp = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LeftyUserLogout build() {
      try {
        LeftyUserLogout record = new LeftyUserLogout();
        record.sessionId = fieldSetFlags()[0] ? this.sessionId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.logoutTimestamp = fieldSetFlags()[1] ? this.logoutTimestamp : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LeftyUserLogout>
    WRITER$ = (org.apache.avro.io.DatumWriter<LeftyUserLogout>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LeftyUserLogout>
    READER$ = (org.apache.avro.io.DatumReader<LeftyUserLogout>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.sessionId);

    out.writeString(this.logoutTimestamp);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.sessionId = in.readString(this.sessionId instanceof Utf8 ? (Utf8)this.sessionId : null);

      this.logoutTimestamp = in.readString(this.logoutTimestamp instanceof Utf8 ? (Utf8)this.logoutTimestamp : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.sessionId = in.readString(this.sessionId instanceof Utf8 ? (Utf8)this.sessionId : null);
          break;

        case 1:
          this.logoutTimestamp = in.readString(this.logoutTimestamp instanceof Utf8 ? (Utf8)this.logoutTimestamp : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










