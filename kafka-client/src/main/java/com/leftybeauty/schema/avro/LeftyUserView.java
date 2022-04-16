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
public class LeftyUserView extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4761002439781115302L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LeftyUserView\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"leftyUserId\",\"type\":\"string\"},{\"name\":\"newUser\",\"type\":\"boolean\"},{\"name\":\"firstName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"emails\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"userTypes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"LeftyUserTypeEnum\",\"symbols\":[\"Client\",\"Provider\"]}}],\"default\":null},{\"name\":\"avatarStorageProviderLocation\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LeftyUserView> ENCODER =
      new BinaryMessageEncoder<LeftyUserView>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LeftyUserView> DECODER =
      new BinaryMessageDecoder<LeftyUserView>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LeftyUserView> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LeftyUserView> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LeftyUserView> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LeftyUserView>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LeftyUserView to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LeftyUserView from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LeftyUserView instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LeftyUserView fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence leftyUserId;
  private boolean newUser;
  private java.lang.CharSequence firstName;
  private java.lang.CharSequence lastName;
  private java.util.List<java.lang.CharSequence> emails;
  private java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> userTypes;
  private java.lang.CharSequence avatarStorageProviderLocation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LeftyUserView() {}

  /**
   * All-args constructor.
   * @param leftyUserId The new value for leftyUserId
   * @param newUser The new value for newUser
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param emails The new value for emails
   * @param userTypes The new value for userTypes
   * @param avatarStorageProviderLocation The new value for avatarStorageProviderLocation
   */
  public LeftyUserView(java.lang.CharSequence leftyUserId, java.lang.Boolean newUser, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.util.List<java.lang.CharSequence> emails, java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> userTypes, java.lang.CharSequence avatarStorageProviderLocation) {
    this.leftyUserId = leftyUserId;
    this.newUser = newUser;
    this.firstName = firstName;
    this.lastName = lastName;
    this.emails = emails;
    this.userTypes = userTypes;
    this.avatarStorageProviderLocation = avatarStorageProviderLocation;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return leftyUserId;
    case 1: return newUser;
    case 2: return firstName;
    case 3: return lastName;
    case 4: return emails;
    case 5: return userTypes;
    case 6: return avatarStorageProviderLocation;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: leftyUserId = (java.lang.CharSequence)value$; break;
    case 1: newUser = (java.lang.Boolean)value$; break;
    case 2: firstName = (java.lang.CharSequence)value$; break;
    case 3: lastName = (java.lang.CharSequence)value$; break;
    case 4: emails = (java.util.List<java.lang.CharSequence>)value$; break;
    case 5: userTypes = (java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum>)value$; break;
    case 6: avatarStorageProviderLocation = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'leftyUserId' field.
   * @return The value of the 'leftyUserId' field.
   */
  public java.lang.CharSequence getLeftyUserId() {
    return leftyUserId;
  }


  /**
   * Sets the value of the 'leftyUserId' field.
   * @param value the value to set.
   */
  public void setLeftyUserId(java.lang.CharSequence value) {
    this.leftyUserId = value;
  }

  /**
   * Gets the value of the 'newUser' field.
   * @return The value of the 'newUser' field.
   */
  public boolean getNewUser() {
    return newUser;
  }


  /**
   * Sets the value of the 'newUser' field.
   * @param value the value to set.
   */
  public void setNewUser(boolean value) {
    this.newUser = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }


  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }


  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'emails' field.
   * @return The value of the 'emails' field.
   */
  public java.util.List<java.lang.CharSequence> getEmails() {
    return emails;
  }


  /**
   * Sets the value of the 'emails' field.
   * @param value the value to set.
   */
  public void setEmails(java.util.List<java.lang.CharSequence> value) {
    this.emails = value;
  }

  /**
   * Gets the value of the 'userTypes' field.
   * @return The value of the 'userTypes' field.
   */
  public java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> getUserTypes() {
    return userTypes;
  }


  /**
   * Sets the value of the 'userTypes' field.
   * @param value the value to set.
   */
  public void setUserTypes(java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> value) {
    this.userTypes = value;
  }

  /**
   * Gets the value of the 'avatarStorageProviderLocation' field.
   * @return The value of the 'avatarStorageProviderLocation' field.
   */
  public java.lang.CharSequence getAvatarStorageProviderLocation() {
    return avatarStorageProviderLocation;
  }


  /**
   * Sets the value of the 'avatarStorageProviderLocation' field.
   * @param value the value to set.
   */
  public void setAvatarStorageProviderLocation(java.lang.CharSequence value) {
    this.avatarStorageProviderLocation = value;
  }

  /**
   * Creates a new LeftyUserView RecordBuilder.
   * @return A new LeftyUserView RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserView.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.LeftyUserView.Builder();
  }

  /**
   * Creates a new LeftyUserView RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LeftyUserView RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserView.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserView.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserView.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserView.Builder(other);
    }
  }

  /**
   * Creates a new LeftyUserView RecordBuilder by copying an existing LeftyUserView instance.
   * @param other The existing instance to copy.
   * @return A new LeftyUserView RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserView.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserView other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserView.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserView.Builder(other);
    }
  }

  /**
   * RecordBuilder for LeftyUserView instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LeftyUserView>
    implements org.apache.avro.data.RecordBuilder<LeftyUserView> {

    private java.lang.CharSequence leftyUserId;
    private boolean newUser;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.util.List<java.lang.CharSequence> emails;
    private java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> userTypes;
    private java.lang.CharSequence avatarStorageProviderLocation;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserView.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.leftyUserId)) {
        this.leftyUserId = data().deepCopy(fields()[0].schema(), other.leftyUserId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.newUser)) {
        this.newUser = data().deepCopy(fields()[1].schema(), other.newUser);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.firstName)) {
        this.firstName = data().deepCopy(fields()[2].schema(), other.firstName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.lastName)) {
        this.lastName = data().deepCopy(fields()[3].schema(), other.lastName);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.emails)) {
        this.emails = data().deepCopy(fields()[4].schema(), other.emails);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.userTypes)) {
        this.userTypes = data().deepCopy(fields()[5].schema(), other.userTypes);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.avatarStorageProviderLocation)) {
        this.avatarStorageProviderLocation = data().deepCopy(fields()[6].schema(), other.avatarStorageProviderLocation);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing LeftyUserView instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserView other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.leftyUserId)) {
        this.leftyUserId = data().deepCopy(fields()[0].schema(), other.leftyUserId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.newUser)) {
        this.newUser = data().deepCopy(fields()[1].schema(), other.newUser);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.firstName)) {
        this.firstName = data().deepCopy(fields()[2].schema(), other.firstName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastName)) {
        this.lastName = data().deepCopy(fields()[3].schema(), other.lastName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.emails)) {
        this.emails = data().deepCopy(fields()[4].schema(), other.emails);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.userTypes)) {
        this.userTypes = data().deepCopy(fields()[5].schema(), other.userTypes);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.avatarStorageProviderLocation)) {
        this.avatarStorageProviderLocation = data().deepCopy(fields()[6].schema(), other.avatarStorageProviderLocation);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'leftyUserId' field.
      * @return The value.
      */
    public java.lang.CharSequence getLeftyUserId() {
      return leftyUserId;
    }


    /**
      * Sets the value of the 'leftyUserId' field.
      * @param value The value of 'leftyUserId'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setLeftyUserId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.leftyUserId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'leftyUserId' field has been set.
      * @return True if the 'leftyUserId' field has been set, false otherwise.
      */
    public boolean hasLeftyUserId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'leftyUserId' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearLeftyUserId() {
      leftyUserId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'newUser' field.
      * @return The value.
      */
    public boolean getNewUser() {
      return newUser;
    }


    /**
      * Sets the value of the 'newUser' field.
      * @param value The value of 'newUser'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setNewUser(boolean value) {
      validate(fields()[1], value);
      this.newUser = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'newUser' field has been set.
      * @return True if the 'newUser' field has been set, false otherwise.
      */
    public boolean hasNewUser() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'newUser' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearNewUser() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }


    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.firstName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }


    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.lastName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'emails' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getEmails() {
      return emails;
    }


    /**
      * Sets the value of the 'emails' field.
      * @param value The value of 'emails'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setEmails(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[4], value);
      this.emails = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'emails' field has been set.
      * @return True if the 'emails' field has been set, false otherwise.
      */
    public boolean hasEmails() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'emails' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearEmails() {
      emails = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'userTypes' field.
      * @return The value.
      */
    public java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> getUserTypes() {
      return userTypes;
    }


    /**
      * Sets the value of the 'userTypes' field.
      * @param value The value of 'userTypes'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setUserTypes(java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> value) {
      validate(fields()[5], value);
      this.userTypes = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'userTypes' field has been set.
      * @return True if the 'userTypes' field has been set, false otherwise.
      */
    public boolean hasUserTypes() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'userTypes' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearUserTypes() {
      userTypes = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'avatarStorageProviderLocation' field.
      * @return The value.
      */
    public java.lang.CharSequence getAvatarStorageProviderLocation() {
      return avatarStorageProviderLocation;
    }


    /**
      * Sets the value of the 'avatarStorageProviderLocation' field.
      * @param value The value of 'avatarStorageProviderLocation'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder setAvatarStorageProviderLocation(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.avatarStorageProviderLocation = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'avatarStorageProviderLocation' field has been set.
      * @return True if the 'avatarStorageProviderLocation' field has been set, false otherwise.
      */
    public boolean hasAvatarStorageProviderLocation() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'avatarStorageProviderLocation' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserView.Builder clearAvatarStorageProviderLocation() {
      avatarStorageProviderLocation = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LeftyUserView build() {
      try {
        LeftyUserView record = new LeftyUserView();
        record.leftyUserId = fieldSetFlags()[0] ? this.leftyUserId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.newUser = fieldSetFlags()[1] ? this.newUser : (java.lang.Boolean) defaultValue(fields()[1]);
        record.firstName = fieldSetFlags()[2] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.lastName = fieldSetFlags()[3] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.emails = fieldSetFlags()[4] ? this.emails : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[4]);
        record.userTypes = fieldSetFlags()[5] ? this.userTypes : (java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum>) defaultValue(fields()[5]);
        record.avatarStorageProviderLocation = fieldSetFlags()[6] ? this.avatarStorageProviderLocation : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LeftyUserView>
    WRITER$ = (org.apache.avro.io.DatumWriter<LeftyUserView>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LeftyUserView>
    READER$ = (org.apache.avro.io.DatumReader<LeftyUserView>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.leftyUserId);

    out.writeBoolean(this.newUser);

    if (this.firstName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.firstName);
    }

    if (this.lastName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.lastName);
    }

    if (this.emails == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.emails.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.lang.CharSequence e0: this.emails) {
        actualSize0++;
        out.startItem();
        out.writeString(e0);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    if (this.userTypes == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size1 = this.userTypes.size();
      out.writeArrayStart();
      out.setItemCount(size1);
      long actualSize1 = 0;
      for (com.leftybeauty.schema.avro.LeftyUserTypeEnum e1: this.userTypes) {
        actualSize1++;
        out.startItem();
        out.writeEnum(e1.ordinal());
      }
      out.writeArrayEnd();
      if (actualSize1 != size1)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");
    }

    if (this.avatarStorageProviderLocation == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.avatarStorageProviderLocation);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.leftyUserId = in.readString(this.leftyUserId instanceof Utf8 ? (Utf8)this.leftyUserId : null);

      this.newUser = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.firstName = null;
      } else {
        this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.lastName = null;
      } else {
        this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.emails = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<java.lang.CharSequence> a0 = this.emails;
        if (a0 == null) {
          a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("emails").schema().getTypes().get(1));
          this.emails = a0;
        } else a0.clear();
        SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
            e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
            a0.add(e0);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.userTypes = null;
      } else {
        long size1 = in.readArrayStart();
        java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> a1 = this.userTypes;
        if (a1 == null) {
          a1 = new SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum>((int)size1, SCHEMA$.getField("userTypes").schema().getTypes().get(1));
          this.userTypes = a1;
        } else a1.clear();
        SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum>)a1 : null);
        for ( ; 0 < size1; size1 = in.arrayNext()) {
          for ( ; size1 != 0; size1--) {
            com.leftybeauty.schema.avro.LeftyUserTypeEnum e1 = (ga1 != null ? ga1.peek() : null);
            e1 = com.leftybeauty.schema.avro.LeftyUserTypeEnum.values()[in.readEnum()];
            a1.add(e1);
          }
        }
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.avatarStorageProviderLocation = null;
      } else {
        this.avatarStorageProviderLocation = in.readString(this.avatarStorageProviderLocation instanceof Utf8 ? (Utf8)this.avatarStorageProviderLocation : null);
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.leftyUserId = in.readString(this.leftyUserId instanceof Utf8 ? (Utf8)this.leftyUserId : null);
          break;

        case 1:
          this.newUser = in.readBoolean();
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.firstName = null;
          } else {
            this.firstName = in.readString(this.firstName instanceof Utf8 ? (Utf8)this.firstName : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.lastName = null;
          } else {
            this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8)this.lastName : null);
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.emails = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<java.lang.CharSequence> a0 = this.emails;
            if (a0 == null) {
              a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("emails").schema().getTypes().get(1));
              this.emails = a0;
            } else a0.clear();
            SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
                e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
                a0.add(e0);
              }
            }
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.userTypes = null;
          } else {
            long size1 = in.readArrayStart();
            java.util.List<com.leftybeauty.schema.avro.LeftyUserTypeEnum> a1 = this.userTypes;
            if (a1 == null) {
              a1 = new SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum>((int)size1, SCHEMA$.getField("userTypes").schema().getTypes().get(1));
              this.userTypes = a1;
            } else a1.clear();
            SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<com.leftybeauty.schema.avro.LeftyUserTypeEnum>)a1 : null);
            for ( ; 0 < size1; size1 = in.arrayNext()) {
              for ( ; size1 != 0; size1--) {
                com.leftybeauty.schema.avro.LeftyUserTypeEnum e1 = (ga1 != null ? ga1.peek() : null);
                e1 = com.leftybeauty.schema.avro.LeftyUserTypeEnum.values()[in.readEnum()];
                a1.add(e1);
              }
            }
          }
          break;

        case 6:
          if (in.readIndex() != 1) {
            in.readNull();
            this.avatarStorageProviderLocation = null;
          } else {
            this.avatarStorageProviderLocation = in.readString(this.avatarStorageProviderLocation instanceof Utf8 ? (Utf8)this.avatarStorageProviderLocation : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










