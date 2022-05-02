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
public class AddressValue extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6727631131825901169L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AddressValue\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"addressId\",\"type\":\"string\"},{\"name\":\"street1\",\"type\":\"string\"},{\"name\":\"street2\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"UsStateEnum\",\"symbols\":[\"Alabama\",\"Alaska\",\"Arizona\",\"Arkansas\",\"California\"]}},{\"name\":\"zipCode\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AddressValue> ENCODER =
      new BinaryMessageEncoder<AddressValue>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AddressValue> DECODER =
      new BinaryMessageDecoder<AddressValue>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AddressValue> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AddressValue> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AddressValue> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AddressValue>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AddressValue to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AddressValue from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AddressValue instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AddressValue fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence addressId;
  private java.lang.CharSequence street1;
  private java.lang.CharSequence street2;
  private java.lang.CharSequence city;
  private com.leftybeauty.schema.avro.UsStateEnum state;
  private int zipCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AddressValue() {}

  /**
   * All-args constructor.
   * @param addressId The new value for addressId
   * @param street1 The new value for street1
   * @param street2 The new value for street2
   * @param city The new value for city
   * @param state The new value for state
   * @param zipCode The new value for zipCode
   */
  public AddressValue(java.lang.CharSequence addressId, java.lang.CharSequence street1, java.lang.CharSequence street2, java.lang.CharSequence city, com.leftybeauty.schema.avro.UsStateEnum state, java.lang.Integer zipCode) {
    this.addressId = addressId;
    this.street1 = street1;
    this.street2 = street2;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return addressId;
    case 1: return street1;
    case 2: return street2;
    case 3: return city;
    case 4: return state;
    case 5: return zipCode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: addressId = (java.lang.CharSequence)value$; break;
    case 1: street1 = (java.lang.CharSequence)value$; break;
    case 2: street2 = (java.lang.CharSequence)value$; break;
    case 3: city = (java.lang.CharSequence)value$; break;
    case 4: state = (com.leftybeauty.schema.avro.UsStateEnum)value$; break;
    case 5: zipCode = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'addressId' field.
   * @return The value of the 'addressId' field.
   */
  public java.lang.CharSequence getAddressId() {
    return addressId;
  }


  /**
   * Sets the value of the 'addressId' field.
   * @param value the value to set.
   */
  public void setAddressId(java.lang.CharSequence value) {
    this.addressId = value;
  }

  /**
   * Gets the value of the 'street1' field.
   * @return The value of the 'street1' field.
   */
  public java.lang.CharSequence getStreet1() {
    return street1;
  }


  /**
   * Sets the value of the 'street1' field.
   * @param value the value to set.
   */
  public void setStreet1(java.lang.CharSequence value) {
    this.street1 = value;
  }

  /**
   * Gets the value of the 'street2' field.
   * @return The value of the 'street2' field.
   */
  public java.lang.CharSequence getStreet2() {
    return street2;
  }


  /**
   * Sets the value of the 'street2' field.
   * @param value the value to set.
   */
  public void setStreet2(java.lang.CharSequence value) {
    this.street2 = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.CharSequence getCity() {
    return city;
  }


  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.CharSequence value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public com.leftybeauty.schema.avro.UsStateEnum getState() {
    return state;
  }


  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(com.leftybeauty.schema.avro.UsStateEnum value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'zipCode' field.
   * @return The value of the 'zipCode' field.
   */
  public int getZipCode() {
    return zipCode;
  }


  /**
   * Sets the value of the 'zipCode' field.
   * @param value the value to set.
   */
  public void setZipCode(int value) {
    this.zipCode = value;
  }

  /**
   * Creates a new AddressValue RecordBuilder.
   * @return A new AddressValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.AddressValue.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.AddressValue.Builder();
  }

  /**
   * Creates a new AddressValue RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AddressValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.AddressValue.Builder newBuilder(com.leftybeauty.schema.avro.AddressValue.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.AddressValue.Builder();
    } else {
      return new com.leftybeauty.schema.avro.AddressValue.Builder(other);
    }
  }

  /**
   * Creates a new AddressValue RecordBuilder by copying an existing AddressValue instance.
   * @param other The existing instance to copy.
   * @return A new AddressValue RecordBuilder
   */
  public static com.leftybeauty.schema.avro.AddressValue.Builder newBuilder(com.leftybeauty.schema.avro.AddressValue other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.AddressValue.Builder();
    } else {
      return new com.leftybeauty.schema.avro.AddressValue.Builder(other);
    }
  }

  /**
   * RecordBuilder for AddressValue instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AddressValue>
    implements org.apache.avro.data.RecordBuilder<AddressValue> {

    private java.lang.CharSequence addressId;
    private java.lang.CharSequence street1;
    private java.lang.CharSequence street2;
    private java.lang.CharSequence city;
    private com.leftybeauty.schema.avro.UsStateEnum state;
    private int zipCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.AddressValue.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.addressId)) {
        this.addressId = data().deepCopy(fields()[0].schema(), other.addressId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.street1)) {
        this.street1 = data().deepCopy(fields()[1].schema(), other.street1);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.street2)) {
        this.street2 = data().deepCopy(fields()[2].schema(), other.street2);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.city)) {
        this.city = data().deepCopy(fields()[3].schema(), other.city);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.zipCode)) {
        this.zipCode = data().deepCopy(fields()[5].schema(), other.zipCode);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing AddressValue instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.AddressValue other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.addressId)) {
        this.addressId = data().deepCopy(fields()[0].schema(), other.addressId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.street1)) {
        this.street1 = data().deepCopy(fields()[1].schema(), other.street1);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.street2)) {
        this.street2 = data().deepCopy(fields()[2].schema(), other.street2);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.city)) {
        this.city = data().deepCopy(fields()[3].schema(), other.city);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.zipCode)) {
        this.zipCode = data().deepCopy(fields()[5].schema(), other.zipCode);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'addressId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAddressId() {
      return addressId;
    }


    /**
      * Sets the value of the 'addressId' field.
      * @param value The value of 'addressId'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setAddressId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.addressId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'addressId' field has been set.
      * @return True if the 'addressId' field has been set, false otherwise.
      */
    public boolean hasAddressId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'addressId' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearAddressId() {
      addressId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'street1' field.
      * @return The value.
      */
    public java.lang.CharSequence getStreet1() {
      return street1;
    }


    /**
      * Sets the value of the 'street1' field.
      * @param value The value of 'street1'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setStreet1(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.street1 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'street1' field has been set.
      * @return True if the 'street1' field has been set, false otherwise.
      */
    public boolean hasStreet1() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'street1' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearStreet1() {
      street1 = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'street2' field.
      * @return The value.
      */
    public java.lang.CharSequence getStreet2() {
      return street2;
    }


    /**
      * Sets the value of the 'street2' field.
      * @param value The value of 'street2'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setStreet2(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.street2 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'street2' field has been set.
      * @return True if the 'street2' field has been set, false otherwise.
      */
    public boolean hasStreet2() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'street2' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearStreet2() {
      street2 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.CharSequence getCity() {
      return city;
    }


    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.city = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearCity() {
      city = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public com.leftybeauty.schema.avro.UsStateEnum getState() {
      return state;
    }


    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setState(com.leftybeauty.schema.avro.UsStateEnum value) {
      validate(fields()[4], value);
      this.state = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearState() {
      state = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'zipCode' field.
      * @return The value.
      */
    public int getZipCode() {
      return zipCode;
    }


    /**
      * Sets the value of the 'zipCode' field.
      * @param value The value of 'zipCode'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder setZipCode(int value) {
      validate(fields()[5], value);
      this.zipCode = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'zipCode' field has been set.
      * @return True if the 'zipCode' field has been set, false otherwise.
      */
    public boolean hasZipCode() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'zipCode' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.AddressValue.Builder clearZipCode() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AddressValue build() {
      try {
        AddressValue record = new AddressValue();
        record.addressId = fieldSetFlags()[0] ? this.addressId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.street1 = fieldSetFlags()[1] ? this.street1 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.street2 = fieldSetFlags()[2] ? this.street2 : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.city = fieldSetFlags()[3] ? this.city : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.state = fieldSetFlags()[4] ? this.state : (com.leftybeauty.schema.avro.UsStateEnum) defaultValue(fields()[4]);
        record.zipCode = fieldSetFlags()[5] ? this.zipCode : (java.lang.Integer) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AddressValue>
    WRITER$ = (org.apache.avro.io.DatumWriter<AddressValue>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AddressValue>
    READER$ = (org.apache.avro.io.DatumReader<AddressValue>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.addressId);

    out.writeString(this.street1);

    if (this.street2 == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.street2);
    }

    out.writeString(this.city);

    out.writeEnum(this.state.ordinal());

    out.writeInt(this.zipCode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.addressId = in.readString(this.addressId instanceof Utf8 ? (Utf8)this.addressId : null);

      this.street1 = in.readString(this.street1 instanceof Utf8 ? (Utf8)this.street1 : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.street2 = null;
      } else {
        this.street2 = in.readString(this.street2 instanceof Utf8 ? (Utf8)this.street2 : null);
      }

      this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);

      this.state = com.leftybeauty.schema.avro.UsStateEnum.values()[in.readEnum()];

      this.zipCode = in.readInt();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.addressId = in.readString(this.addressId instanceof Utf8 ? (Utf8)this.addressId : null);
          break;

        case 1:
          this.street1 = in.readString(this.street1 instanceof Utf8 ? (Utf8)this.street1 : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.street2 = null;
          } else {
            this.street2 = in.readString(this.street2 instanceof Utf8 ? (Utf8)this.street2 : null);
          }
          break;

        case 3:
          this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
          break;

        case 4:
          this.state = com.leftybeauty.schema.avro.UsStateEnum.values()[in.readEnum()];
          break;

        case 5:
          this.zipCode = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









