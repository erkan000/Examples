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
public class DiscountValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3277610985296707152L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DiscountValue\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"discountId\",\"type\":\"string\"},{\"name\":\"code\",\"type\":\"string\"},{\"name\":\"amount\",\"type\":\"double\"},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"DiscountTypeEnum\",\"symbols\":[\"Percentage\",\"FlatAmount\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DiscountValue> ENCODER =
      new BinaryMessageEncoder<DiscountValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DiscountValue> DECODER =
      new BinaryMessageDecoder<DiscountValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DiscountValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DiscountValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DiscountValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DiscountValue>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DiscountValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DiscountValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DiscountValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DiscountValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence discountId;
  private java.lang.CharSequence code;
  private double amount;
  private com.leftybeauty.schema.avro.DiscountTypeEnum type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DiscountValue() {}

  /**
   * All-args constructor.
   * @param discountId The new value for discountId
   * @param code The new value for code
   * @param amount The new value for amount
   * @param type The new value for type
   */
  public DiscountValue(java.lang.CharSequence discountId, java.lang.CharSequence code, java.lang.Double amount, com.leftybeauty.schema.avro.DiscountTypeEnum type) {
    this.discountId = discountId;
    this.code = code;
    this.amount = amount;
    this.type = type;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return discountId;
    case 1: return code;
    case 2: return amount;
    case 3: return type;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: discountId = (java.lang.CharSequence)value$; break;
    case 1: code = (java.lang.CharSequence)value$; break;
    case 2: amount = (java.lang.Double)value$; break;
    case 3: type = (com.leftybeauty.schema.avro.DiscountTypeEnum)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'discountId' field.
   * @return The value of the 'discountId' field.
   */
  public java.lang.CharSequence getDiscountId() {
    return discountId;
  }


  /**
   * Sets the value of the 'discountId' field.
   * @param value the value to set.
   */
  public void setDiscountId(java.lang.CharSequence value) {
    this.discountId = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public double getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(double value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public com.leftybeauty.schema.avro.DiscountTypeEnum getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(com.leftybeauty.schema.avro.DiscountTypeEnum value) {
    this.type = value;
  }

  /**
   * Creates a new DiscountValue RecordBuilder.
   * @return A new DiscountValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.DiscountValue.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.DiscountValue.Builder();
  }

  /**
   * Creates a new DiscountValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DiscountValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.DiscountValue.Builder newBuilder(com.leftybeauty.schema.avro.DiscountValue.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.DiscountValue.Builder();
    } else {
      return new com.leftybeauty.schema.avro.DiscountValue.Builder(other);
    }
  }

  /**
   * Creates a new DiscountValue RecordBuilder by copying an existing DiscountValue instance.
   * @param other The existing instance to copy.
   * @return A new DiscountValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.DiscountValue.Builder newBuilder(com.leftybeauty.schema.avro.DiscountValue other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.DiscountValue.Builder();
    } else {
      return new com.leftybeauty.schema.avro.DiscountValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for DiscountValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DiscountValue>
    implements org.apache.avro.data.RecordBuilder<DiscountValue> {

    private java.lang.CharSequence discountId;
    private java.lang.CharSequence code;
    private double amount;
    private com.leftybeauty.schema.avro.DiscountTypeEnum type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.DiscountValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.discountId)) {
        this.discountId = data().deepCopy(fields()[0].schema(), other.discountId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing DiscountValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.DiscountValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.discountId)) {
        this.discountId = data().deepCopy(fields()[0].schema(), other.discountId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.code)) {
        this.code = data().deepCopy(fields()[1].schema(), other.code);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.type)) {
        this.type = data().deepCopy(fields()[3].schema(), other.type);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'discountId' field.
      * @return The value.
      */
    public java.lang.CharSequence getDiscountId() {
      return discountId;
    }


    /**
      * Sets the value of the 'discountId' field.
      * @param value The value of 'discountId'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder setDiscountId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.discountId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'discountId' field has been set.
      * @return True if the 'discountId' field has been set, false otherwise.
      */
    public boolean hasDiscountId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'discountId' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder clearDiscountId() {
      discountId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder setCode(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.code = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder clearCode() {
      code = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public double getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder setAmount(double value) {
      validate(fields()[2], value);
      this.amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder clearAmount() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public com.leftybeauty.schema.avro.DiscountTypeEnum getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder setType(com.leftybeauty.schema.avro.DiscountTypeEnum value) {
      validate(fields()[3], value);
      this.type = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.DiscountValue.Builder clearType() {
      type = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DiscountValue build() {
      try {
        DiscountValue record = new DiscountValue();
        record.discountId = fieldSetFlags()[0] ? this.discountId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.code = fieldSetFlags()[1] ? this.code : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.amount = fieldSetFlags()[2] ? this.amount : (java.lang.Double) defaultValue(fields()[2]);
        record.type = fieldSetFlags()[3] ? this.type : (com.leftybeauty.schema.avro.DiscountTypeEnum) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DiscountValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<DiscountValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DiscountValue>
    READER$ = (org.apache.avro.io.DatumReader<DiscountValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.discountId);

    out.writeString(this.code);

    out.writeDouble(this.amount);

    out.writeEnum(this.type.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.discountId = in.readString(this.discountId instanceof Utf8 ? (Utf8)this.discountId : null);

      this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);

      this.amount = in.readDouble();

      this.type = com.leftybeauty.schema.avro.DiscountTypeEnum.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.discountId = in.readString(this.discountId instanceof Utf8 ? (Utf8)this.discountId : null);
          break;

        case 1:
          this.code = in.readString(this.code instanceof Utf8 ? (Utf8)this.code : null);
          break;

        case 2:
          this.amount = in.readDouble();
          break;

        case 3:
          this.type = com.leftybeauty.schema.avro.DiscountTypeEnum.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










