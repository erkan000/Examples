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
public class LeftyUserFeedback extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8249687716161090025L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"LeftyUserFeedback\",\"namespace\":\"com.leftybeauty.schema.avro\",\"fields\":[{\"name\":\"leftyUserId\",\"type\":\"string\"},{\"name\":\"appointmentId\",\"type\":\"string\"},{\"name\":\"rating\",\"type\":\"double\"},{\"name\":\"feedbackTarget\",\"type\":{\"type\":\"enum\",\"name\":\"LeftyUserTypeEnum\",\"symbols\":[\"Client\",\"Provider\"]}},{\"name\":\"comment\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"reason\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"RatingReasonEnum\",\"symbols\":[\"DidntListenToRequest\",\"Rude\",\"UnhappyWithResult\",\"Late\",\"GreatService\",\"Friendly\",\"Professional\",\"OnTime\"]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<LeftyUserFeedback> ENCODER =
      new BinaryMessageEncoder<LeftyUserFeedback>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<LeftyUserFeedback> DECODER =
      new BinaryMessageDecoder<LeftyUserFeedback>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<LeftyUserFeedback> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<LeftyUserFeedback> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<LeftyUserFeedback> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<LeftyUserFeedback>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this LeftyUserFeedback to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a LeftyUserFeedback from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a LeftyUserFeedback instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static LeftyUserFeedback fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence leftyUserId;
  private java.lang.CharSequence appointmentId;
  private double rating;
  private com.leftybeauty.schema.avro.LeftyUserTypeEnum feedbackTarget;
  private java.lang.CharSequence comment;
  private com.leftybeauty.schema.avro.RatingReasonEnum reason;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public LeftyUserFeedback() {}

  /**
   * All-args constructor.
   * @param leftyUserId The new value for leftyUserId
   * @param appointmentId The new value for appointmentId
   * @param rating The new value for rating
   * @param feedbackTarget The new value for feedbackTarget
   * @param comment The new value for comment
   * @param reason The new value for reason
   */
  public LeftyUserFeedback(java.lang.CharSequence leftyUserId, java.lang.CharSequence appointmentId, java.lang.Double rating, com.leftybeauty.schema.avro.LeftyUserTypeEnum feedbackTarget, java.lang.CharSequence comment, com.leftybeauty.schema.avro.RatingReasonEnum reason) {
    this.leftyUserId = leftyUserId;
    this.appointmentId = appointmentId;
    this.rating = rating;
    this.feedbackTarget = feedbackTarget;
    this.comment = comment;
    this.reason = reason;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return leftyUserId;
    case 1: return appointmentId;
    case 2: return rating;
    case 3: return feedbackTarget;
    case 4: return comment;
    case 5: return reason;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: leftyUserId = (java.lang.CharSequence)value$; break;
    case 1: appointmentId = (java.lang.CharSequence)value$; break;
    case 2: rating = (java.lang.Double)value$; break;
    case 3: feedbackTarget = (com.leftybeauty.schema.avro.LeftyUserTypeEnum)value$; break;
    case 4: comment = (java.lang.CharSequence)value$; break;
    case 5: reason = (com.leftybeauty.schema.avro.RatingReasonEnum)value$; break;
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
   * Gets the value of the 'appointmentId' field.
   * @return The value of the 'appointmentId' field.
   */
  public java.lang.CharSequence getAppointmentId() {
    return appointmentId;
  }


  /**
   * Sets the value of the 'appointmentId' field.
   * @param value the value to set.
   */
  public void setAppointmentId(java.lang.CharSequence value) {
    this.appointmentId = value;
  }

  /**
   * Gets the value of the 'rating' field.
   * @return The value of the 'rating' field.
   */
  public double getRating() {
    return rating;
  }


  /**
   * Sets the value of the 'rating' field.
   * @param value the value to set.
   */
  public void setRating(double value) {
    this.rating = value;
  }

  /**
   * Gets the value of the 'feedbackTarget' field.
   * @return The value of the 'feedbackTarget' field.
   */
  public com.leftybeauty.schema.avro.LeftyUserTypeEnum getFeedbackTarget() {
    return feedbackTarget;
  }


  /**
   * Sets the value of the 'feedbackTarget' field.
   * @param value the value to set.
   */
  public void setFeedbackTarget(com.leftybeauty.schema.avro.LeftyUserTypeEnum value) {
    this.feedbackTarget = value;
  }

  /**
   * Gets the value of the 'comment' field.
   * @return The value of the 'comment' field.
   */
  public java.lang.CharSequence getComment() {
    return comment;
  }


  /**
   * Sets the value of the 'comment' field.
   * @param value the value to set.
   */
  public void setComment(java.lang.CharSequence value) {
    this.comment = value;
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public com.leftybeauty.schema.avro.RatingReasonEnum getReason() {
    return reason;
  }


  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(com.leftybeauty.schema.avro.RatingReasonEnum value) {
    this.reason = value;
  }

  /**
   * Creates a new LeftyUserFeedback RecordBuilder.
   * @return A new LeftyUserFeedback RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserFeedback.Builder newBuilder() {
    return new com.leftybeauty.schema.avro.LeftyUserFeedback.Builder();
  }

  /**
   * Creates a new LeftyUserFeedback RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new LeftyUserFeedback RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserFeedback.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserFeedback.Builder other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserFeedback.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserFeedback.Builder(other);
    }
  }

  /**
   * Creates a new LeftyUserFeedback RecordBuilder by copying an existing LeftyUserFeedback instance.
   * @param other The existing instance to copy.
   * @return A new LeftyUserFeedback RecordBuilder
   */
  public static com.leftybeauty.schema.avro.LeftyUserFeedback.Builder newBuilder(com.leftybeauty.schema.avro.LeftyUserFeedback other) {
    if (other == null) {
      return new com.leftybeauty.schema.avro.LeftyUserFeedback.Builder();
    } else {
      return new com.leftybeauty.schema.avro.LeftyUserFeedback.Builder(other);
    }
  }

  /**
   * RecordBuilder for LeftyUserFeedback instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<LeftyUserFeedback>
    implements org.apache.avro.data.RecordBuilder<LeftyUserFeedback> {

    private java.lang.CharSequence leftyUserId;
    private java.lang.CharSequence appointmentId;
    private double rating;
    private com.leftybeauty.schema.avro.LeftyUserTypeEnum feedbackTarget;
    private java.lang.CharSequence comment;
    private com.leftybeauty.schema.avro.RatingReasonEnum reason;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserFeedback.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.leftyUserId)) {
        this.leftyUserId = data().deepCopy(fields()[0].schema(), other.leftyUserId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.appointmentId)) {
        this.appointmentId = data().deepCopy(fields()[1].schema(), other.appointmentId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.feedbackTarget)) {
        this.feedbackTarget = data().deepCopy(fields()[3].schema(), other.feedbackTarget);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.comment)) {
        this.comment = data().deepCopy(fields()[4].schema(), other.comment);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.reason)) {
        this.reason = data().deepCopy(fields()[5].schema(), other.reason);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing LeftyUserFeedback instance
     * @param other The existing instance to copy.
     */
    private Builder(com.leftybeauty.schema.avro.LeftyUserFeedback other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.leftyUserId)) {
        this.leftyUserId = data().deepCopy(fields()[0].schema(), other.leftyUserId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.appointmentId)) {
        this.appointmentId = data().deepCopy(fields()[1].schema(), other.appointmentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.rating)) {
        this.rating = data().deepCopy(fields()[2].schema(), other.rating);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.feedbackTarget)) {
        this.feedbackTarget = data().deepCopy(fields()[3].schema(), other.feedbackTarget);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.comment)) {
        this.comment = data().deepCopy(fields()[4].schema(), other.comment);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.reason)) {
        this.reason = data().deepCopy(fields()[5].schema(), other.reason);
        fieldSetFlags()[5] = true;
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
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setLeftyUserId(java.lang.CharSequence value) {
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
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearLeftyUserId() {
      leftyUserId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'appointmentId' field.
      * @return The value.
      */
    public java.lang.CharSequence getAppointmentId() {
      return appointmentId;
    }


    /**
      * Sets the value of the 'appointmentId' field.
      * @param value The value of 'appointmentId'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setAppointmentId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.appointmentId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'appointmentId' field has been set.
      * @return True if the 'appointmentId' field has been set, false otherwise.
      */
    public boolean hasAppointmentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'appointmentId' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearAppointmentId() {
      appointmentId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'rating' field.
      * @return The value.
      */
    public double getRating() {
      return rating;
    }


    /**
      * Sets the value of the 'rating' field.
      * @param value The value of 'rating'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setRating(double value) {
      validate(fields()[2], value);
      this.rating = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'rating' field has been set.
      * @return True if the 'rating' field has been set, false otherwise.
      */
    public boolean hasRating() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'rating' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearRating() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'feedbackTarget' field.
      * @return The value.
      */
    public com.leftybeauty.schema.avro.LeftyUserTypeEnum getFeedbackTarget() {
      return feedbackTarget;
    }


    /**
      * Sets the value of the 'feedbackTarget' field.
      * @param value The value of 'feedbackTarget'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setFeedbackTarget(com.leftybeauty.schema.avro.LeftyUserTypeEnum value) {
      validate(fields()[3], value);
      this.feedbackTarget = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'feedbackTarget' field has been set.
      * @return True if the 'feedbackTarget' field has been set, false otherwise.
      */
    public boolean hasFeedbackTarget() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'feedbackTarget' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearFeedbackTarget() {
      feedbackTarget = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'comment' field.
      * @return The value.
      */
    public java.lang.CharSequence getComment() {
      return comment;
    }


    /**
      * Sets the value of the 'comment' field.
      * @param value The value of 'comment'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setComment(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.comment = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'comment' field has been set.
      * @return True if the 'comment' field has been set, false otherwise.
      */
    public boolean hasComment() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'comment' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearComment() {
      comment = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public com.leftybeauty.schema.avro.RatingReasonEnum getReason() {
      return reason;
    }


    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder setReason(com.leftybeauty.schema.avro.RatingReasonEnum value) {
      validate(fields()[5], value);
      this.reason = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public com.leftybeauty.schema.avro.LeftyUserFeedback.Builder clearReason() {
      reason = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public LeftyUserFeedback build() {
      try {
        LeftyUserFeedback record = new LeftyUserFeedback();
        record.leftyUserId = fieldSetFlags()[0] ? this.leftyUserId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.appointmentId = fieldSetFlags()[1] ? this.appointmentId : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.rating = fieldSetFlags()[2] ? this.rating : (java.lang.Double) defaultValue(fields()[2]);
        record.feedbackTarget = fieldSetFlags()[3] ? this.feedbackTarget : (com.leftybeauty.schema.avro.LeftyUserTypeEnum) defaultValue(fields()[3]);
        record.comment = fieldSetFlags()[4] ? this.comment : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.reason = fieldSetFlags()[5] ? this.reason : (com.leftybeauty.schema.avro.RatingReasonEnum) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<LeftyUserFeedback>
    WRITER$ = (org.apache.avro.io.DatumWriter<LeftyUserFeedback>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<LeftyUserFeedback>
    READER$ = (org.apache.avro.io.DatumReader<LeftyUserFeedback>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.leftyUserId);

    out.writeString(this.appointmentId);

    out.writeDouble(this.rating);

    out.writeEnum(this.feedbackTarget.ordinal());

    if (this.comment == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.comment);
    }

    if (this.reason == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.reason.ordinal());
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.leftyUserId = in.readString(this.leftyUserId instanceof Utf8 ? (Utf8)this.leftyUserId : null);

      this.appointmentId = in.readString(this.appointmentId instanceof Utf8 ? (Utf8)this.appointmentId : null);

      this.rating = in.readDouble();

      this.feedbackTarget = com.leftybeauty.schema.avro.LeftyUserTypeEnum.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.comment = null;
      } else {
        this.comment = in.readString(this.comment instanceof Utf8 ? (Utf8)this.comment : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.reason = null;
      } else {
        this.reason = com.leftybeauty.schema.avro.RatingReasonEnum.values()[in.readEnum()];
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.leftyUserId = in.readString(this.leftyUserId instanceof Utf8 ? (Utf8)this.leftyUserId : null);
          break;

        case 1:
          this.appointmentId = in.readString(this.appointmentId instanceof Utf8 ? (Utf8)this.appointmentId : null);
          break;

        case 2:
          this.rating = in.readDouble();
          break;

        case 3:
          this.feedbackTarget = com.leftybeauty.schema.avro.LeftyUserTypeEnum.values()[in.readEnum()];
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.comment = null;
          } else {
            this.comment = in.readString(this.comment instanceof Utf8 ? (Utf8)this.comment : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.reason = null;
          } else {
            this.reason = com.leftybeauty.schema.avro.RatingReasonEnum.values()[in.readEnum()];
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










