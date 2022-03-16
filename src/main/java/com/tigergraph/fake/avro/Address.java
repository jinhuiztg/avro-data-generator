/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.tigergraph.fake.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Address extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5633511787077195639L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Address\",\"namespace\":\"com.tigergraph.fake.avro\",\"fields\":[{\"name\":\"line1\",\"type\":\"string\"},{\"name\":\"line2\",\"type\":[\"string\",\"null\"]},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"zipcode\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Address> ENCODER =
      new BinaryMessageEncoder<Address>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Address> DECODER =
      new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Address> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Address> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Address> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Address>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Address to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Address from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Address instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Address fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence line1;
  private java.lang.CharSequence line2;
  private java.lang.CharSequence city;
  private java.lang.CharSequence state;
  private java.lang.CharSequence zipcode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Address() {}

  /**
   * All-args constructor.
   * @param line1 The new value for line1
   * @param line2 The new value for line2
   * @param city The new value for city
   * @param state The new value for state
   * @param zipcode The new value for zipcode
   */
  public Address(java.lang.CharSequence line1, java.lang.CharSequence line2, java.lang.CharSequence city, java.lang.CharSequence state, java.lang.CharSequence zipcode) {
    this.line1 = line1;
    this.line2 = line2;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return line1;
    case 1: return line2;
    case 2: return city;
    case 3: return state;
    case 4: return zipcode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: line1 = (java.lang.CharSequence)value$; break;
    case 1: line2 = (java.lang.CharSequence)value$; break;
    case 2: city = (java.lang.CharSequence)value$; break;
    case 3: state = (java.lang.CharSequence)value$; break;
    case 4: zipcode = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'line1' field.
   * @return The value of the 'line1' field.
   */
  public java.lang.CharSequence getLine1() {
    return line1;
  }


  /**
   * Sets the value of the 'line1' field.
   * @param value the value to set.
   */
  public void setLine1(java.lang.CharSequence value) {
    this.line1 = value;
  }

  /**
   * Gets the value of the 'line2' field.
   * @return The value of the 'line2' field.
   */
  public java.lang.CharSequence getLine2() {
    return line2;
  }


  /**
   * Sets the value of the 'line2' field.
   * @param value the value to set.
   */
  public void setLine2(java.lang.CharSequence value) {
    this.line2 = value;
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
  public java.lang.CharSequence getState() {
    return state;
  }


  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'zipcode' field.
   * @return The value of the 'zipcode' field.
   */
  public java.lang.CharSequence getZipcode() {
    return zipcode;
  }


  /**
   * Sets the value of the 'zipcode' field.
   * @param value the value to set.
   */
  public void setZipcode(java.lang.CharSequence value) {
    this.zipcode = value;
  }

  /**
   * Creates a new Address RecordBuilder.
   * @return A new Address RecordBuilder
   */
  public static com.tigergraph.fake.avro.Address.Builder newBuilder() {
    return new com.tigergraph.fake.avro.Address.Builder();
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Address RecordBuilder
   */
  public static com.tigergraph.fake.avro.Address.Builder newBuilder(com.tigergraph.fake.avro.Address.Builder other) {
    if (other == null) {
      return new com.tigergraph.fake.avro.Address.Builder();
    } else {
      return new com.tigergraph.fake.avro.Address.Builder(other);
    }
  }

  /**
   * Creates a new Address RecordBuilder by copying an existing Address instance.
   * @param other The existing instance to copy.
   * @return A new Address RecordBuilder
   */
  public static com.tigergraph.fake.avro.Address.Builder newBuilder(com.tigergraph.fake.avro.Address other) {
    if (other == null) {
      return new com.tigergraph.fake.avro.Address.Builder();
    } else {
      return new com.tigergraph.fake.avro.Address.Builder(other);
    }
  }

  /**
   * RecordBuilder for Address instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Address>
    implements org.apache.avro.data.RecordBuilder<Address> {

    private java.lang.CharSequence line1;
    private java.lang.CharSequence line2;
    private java.lang.CharSequence city;
    private java.lang.CharSequence state;
    private java.lang.CharSequence zipcode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.tigergraph.fake.avro.Address.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.line1)) {
        this.line1 = data().deepCopy(fields()[0].schema(), other.line1);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.line2)) {
        this.line2 = data().deepCopy(fields()[1].schema(), other.line2);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.zipcode)) {
        this.zipcode = data().deepCopy(fields()[4].schema(), other.zipcode);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Address instance
     * @param other The existing instance to copy.
     */
    private Builder(com.tigergraph.fake.avro.Address other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.line1)) {
        this.line1 = data().deepCopy(fields()[0].schema(), other.line1);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.line2)) {
        this.line2 = data().deepCopy(fields()[1].schema(), other.line2);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.city)) {
        this.city = data().deepCopy(fields()[2].schema(), other.city);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.zipcode)) {
        this.zipcode = data().deepCopy(fields()[4].schema(), other.zipcode);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'line1' field.
      * @return The value.
      */
    public java.lang.CharSequence getLine1() {
      return line1;
    }


    /**
      * Sets the value of the 'line1' field.
      * @param value The value of 'line1'.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder setLine1(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.line1 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'line1' field has been set.
      * @return True if the 'line1' field has been set, false otherwise.
      */
    public boolean hasLine1() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'line1' field.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder clearLine1() {
      line1 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'line2' field.
      * @return The value.
      */
    public java.lang.CharSequence getLine2() {
      return line2;
    }


    /**
      * Sets the value of the 'line2' field.
      * @param value The value of 'line2'.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder setLine2(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.line2 = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'line2' field has been set.
      * @return True if the 'line2' field has been set, false otherwise.
      */
    public boolean hasLine2() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'line2' field.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder clearLine2() {
      line2 = null;
      fieldSetFlags()[1] = false;
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
    public com.tigergraph.fake.avro.Address.Builder setCity(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.city = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder clearCity() {
      city = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }


    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder setState(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.state = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder clearState() {
      state = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'zipcode' field.
      * @return The value.
      */
    public java.lang.CharSequence getZipcode() {
      return zipcode;
    }


    /**
      * Sets the value of the 'zipcode' field.
      * @param value The value of 'zipcode'.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder setZipcode(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.zipcode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'zipcode' field has been set.
      * @return True if the 'zipcode' field has been set, false otherwise.
      */
    public boolean hasZipcode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'zipcode' field.
      * @return This builder.
      */
    public com.tigergraph.fake.avro.Address.Builder clearZipcode() {
      zipcode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Address build() {
      try {
        Address record = new Address();
        record.line1 = fieldSetFlags()[0] ? this.line1 : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.line2 = fieldSetFlags()[1] ? this.line2 : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.city = fieldSetFlags()[2] ? this.city : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.state = fieldSetFlags()[3] ? this.state : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.zipcode = fieldSetFlags()[4] ? this.zipcode : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Address>
    WRITER$ = (org.apache.avro.io.DatumWriter<Address>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Address>
    READER$ = (org.apache.avro.io.DatumReader<Address>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.line1);

    if (this.line2 == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.line2);
    }

    out.writeString(this.city);

    out.writeString(this.state);

    out.writeString(this.zipcode);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.line1 = in.readString(this.line1 instanceof Utf8 ? (Utf8)this.line1 : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.line2 = null;
      } else {
        this.line2 = in.readString(this.line2 instanceof Utf8 ? (Utf8)this.line2 : null);
      }

      this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);

      this.state = in.readString(this.state instanceof Utf8 ? (Utf8)this.state : null);

      this.zipcode = in.readString(this.zipcode instanceof Utf8 ? (Utf8)this.zipcode : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.line1 = in.readString(this.line1 instanceof Utf8 ? (Utf8)this.line1 : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.line2 = null;
          } else {
            this.line2 = in.readString(this.line2 instanceof Utf8 ? (Utf8)this.line2 : null);
          }
          break;

        case 2:
          this.city = in.readString(this.city instanceof Utf8 ? (Utf8)this.city : null);
          break;

        case 3:
          this.state = in.readString(this.state instanceof Utf8 ? (Utf8)this.state : null);
          break;

        case 4:
          this.zipcode = in.readString(this.zipcode instanceof Utf8 ? (Utf8)this.zipcode : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









