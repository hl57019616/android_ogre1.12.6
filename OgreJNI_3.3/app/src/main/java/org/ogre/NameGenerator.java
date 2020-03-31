/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class NameGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected NameGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NameGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_NameGenerator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public NameGenerator(NameGenerator rhs) {
    this(OgreJNI.new_NameGenerator__SWIG_0(NameGenerator.getCPtr(rhs), rhs), true);
  }

  public NameGenerator(String prefix) {
    this(OgreJNI.new_NameGenerator__SWIG_1(prefix), true);
  }

  public String generate() {
    return OgreJNI.NameGenerator_generate(swigCPtr, this);
  }

  public void reset() {
    OgreJNI.NameGenerator_reset(swigCPtr, this);
  }

  public void setNext(java.math.BigInteger val) {
    OgreJNI.NameGenerator_setNext(swigCPtr, this, val);
  }

  public java.math.BigInteger getNext() {
    return OgreJNI.NameGenerator_getNext(swigCPtr, this);
  }

}