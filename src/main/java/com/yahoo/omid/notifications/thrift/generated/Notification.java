/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yahoo.omid.notifications.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Notification implements org.apache.thrift.TBase<Notification, Notification._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Notification");

  private static final org.apache.thrift.protocol.TField OBSERVER_FIELD_DESC = new org.apache.thrift.protocol.TField("observer", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ROW_KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("rowKey", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new NotificationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new NotificationTupleSchemeFactory());
  }

  public String observer; // required
  public ByteBuffer rowKey; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBSERVER((short)1, "observer"),
    ROW_KEY((short)2, "rowKey");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OBSERVER
          return OBSERVER;
        case 2: // ROW_KEY
          return ROW_KEY;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBSERVER, new org.apache.thrift.meta_data.FieldMetaData("observer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ROW_KEY, new org.apache.thrift.meta_data.FieldMetaData("rowKey", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Notification.class, metaDataMap);
  }

  public Notification() {
  }

  public Notification(
    String observer,
    ByteBuffer rowKey)
  {
    this();
    this.observer = observer;
    this.rowKey = rowKey;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Notification(Notification other) {
    if (other.isSetObserver()) {
      this.observer = other.observer;
    }
    if (other.isSetRowKey()) {
      this.rowKey = org.apache.thrift.TBaseHelper.copyBinary(other.rowKey);
;
    }
  }

  public Notification deepCopy() {
    return new Notification(this);
  }

  @Override
  public void clear() {
    this.observer = null;
    this.rowKey = null;
  }

  public String getObserver() {
    return this.observer;
  }

  public Notification setObserver(String observer) {
    this.observer = observer;
    return this;
  }

  public void unsetObserver() {
    this.observer = null;
  }

  /** Returns true if field observer is set (has been assigned a value) and false otherwise */
  public boolean isSetObserver() {
    return this.observer != null;
  }

  public void setObserverIsSet(boolean value) {
    if (!value) {
      this.observer = null;
    }
  }

  public byte[] getRowKey() {
    setRowKey(org.apache.thrift.TBaseHelper.rightSize(rowKey));
    return rowKey == null ? null : rowKey.array();
  }

  public ByteBuffer bufferForRowKey() {
    return rowKey;
  }

  public Notification setRowKey(byte[] rowKey) {
    setRowKey(rowKey == null ? (ByteBuffer)null : ByteBuffer.wrap(rowKey));
    return this;
  }

  public Notification setRowKey(ByteBuffer rowKey) {
    this.rowKey = rowKey;
    return this;
  }

  public void unsetRowKey() {
    this.rowKey = null;
  }

  /** Returns true if field rowKey is set (has been assigned a value) and false otherwise */
  public boolean isSetRowKey() {
    return this.rowKey != null;
  }

  public void setRowKeyIsSet(boolean value) {
    if (!value) {
      this.rowKey = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OBSERVER:
      if (value == null) {
        unsetObserver();
      } else {
        setObserver((String)value);
      }
      break;

    case ROW_KEY:
      if (value == null) {
        unsetRowKey();
      } else {
        setRowKey((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OBSERVER:
      return getObserver();

    case ROW_KEY:
      return getRowKey();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OBSERVER:
      return isSetObserver();
    case ROW_KEY:
      return isSetRowKey();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Notification)
      return this.equals((Notification)that);
    return false;
  }

  public boolean equals(Notification that) {
    if (that == null)
      return false;

    boolean this_present_observer = true && this.isSetObserver();
    boolean that_present_observer = true && that.isSetObserver();
    if (this_present_observer || that_present_observer) {
      if (!(this_present_observer && that_present_observer))
        return false;
      if (!this.observer.equals(that.observer))
        return false;
    }

    boolean this_present_rowKey = true && this.isSetRowKey();
    boolean that_present_rowKey = true && that.isSetRowKey();
    if (this_present_rowKey || that_present_rowKey) {
      if (!(this_present_rowKey && that_present_rowKey))
        return false;
      if (!this.rowKey.equals(that.rowKey))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(Notification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Notification typedOther = (Notification)other;

    lastComparison = Boolean.valueOf(isSetObserver()).compareTo(typedOther.isSetObserver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObserver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.observer, typedOther.observer);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowKey()).compareTo(typedOther.isSetRowKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowKey, typedOther.rowKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Notification(");
    boolean first = true;

    sb.append("observer:");
    if (this.observer == null) {
      sb.append("null");
    } else {
      sb.append(this.observer);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("rowKey:");
    if (this.rowKey == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.rowKey, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class NotificationStandardSchemeFactory implements SchemeFactory {
    public NotificationStandardScheme getScheme() {
      return new NotificationStandardScheme();
    }
  }

  private static class NotificationStandardScheme extends StandardScheme<Notification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Notification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBSERVER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.observer = iprot.readString();
              struct.setObserverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROW_KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rowKey = iprot.readBinary();
              struct.setRowKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Notification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.observer != null) {
        oprot.writeFieldBegin(OBSERVER_FIELD_DESC);
        oprot.writeString(struct.observer);
        oprot.writeFieldEnd();
      }
      if (struct.rowKey != null) {
        oprot.writeFieldBegin(ROW_KEY_FIELD_DESC);
        oprot.writeBinary(struct.rowKey);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class NotificationTupleSchemeFactory implements SchemeFactory {
    public NotificationTupleScheme getScheme() {
      return new NotificationTupleScheme();
    }
  }

  private static class NotificationTupleScheme extends TupleScheme<Notification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Notification struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetObserver()) {
        optionals.set(0);
      }
      if (struct.isSetRowKey()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetObserver()) {
        oprot.writeString(struct.observer);
      }
      if (struct.isSetRowKey()) {
        oprot.writeBinary(struct.rowKey);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Notification struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.observer = iprot.readString();
        struct.setObserverIsSet(true);
      }
      if (incoming.get(1)) {
        struct.rowKey = iprot.readBinary();
        struct.setRowKeyIsSet(true);
      }
    }
  }

}

