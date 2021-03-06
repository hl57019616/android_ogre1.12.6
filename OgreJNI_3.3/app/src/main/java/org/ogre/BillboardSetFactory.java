/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class BillboardSetFactory extends MovableObjectFactory {
  private transient long swigCPtr;

  protected BillboardSetFactory(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.BillboardSetFactory_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BillboardSetFactory obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_BillboardSetFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static void setFACTORY_TYPE_NAME(String value) {
    OgreJNI.BillboardSetFactory_FACTORY_TYPE_NAME_set(value);
  }

  public static String getFACTORY_TYPE_NAME() {
    return OgreJNI.BillboardSetFactory_FACTORY_TYPE_NAME_get();
  }

  public void destroyInstance(MovableObject obj) {
    OgreJNI.BillboardSetFactory_destroyInstance(swigCPtr, this, MovableObject.getCPtr(obj), obj);
  }

}
