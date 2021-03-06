/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class PlaneOptimalShadowCameraSetupPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PlaneOptimalShadowCameraSetupPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PlaneOptimalShadowCameraSetupPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_PlaneOptimalShadowCameraSetupPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PlaneOptimalShadowCameraSetupPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_PlaneOptimalShadowCameraSetupPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public PlaneOptimalShadowCameraSetupPtr() {
    this(OgreJNI.new_PlaneOptimalShadowCameraSetupPtr__SWIG_1(), true);
  }

  public PlaneOptimalShadowCameraSetupPtr(PlaneOptimalShadowCameraSetupPtr r) {
    this(OgreJNI.new_PlaneOptimalShadowCameraSetupPtr__SWIG_2(PlaneOptimalShadowCameraSetupPtr.getCPtr(r), r), true);
  }

  public PlaneOptimalShadowCameraSetup __deref__() {
    long cPtr = OgreJNI.PlaneOptimalShadowCameraSetupPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new PlaneOptimalShadowCameraSetup(cPtr, false);
  }

  public ShadowCameraSetupPtr create(MovablePlane plane) {
    return new ShadowCameraSetupPtr(OgreJNI.PlaneOptimalShadowCameraSetupPtr_create(swigCPtr, this, MovablePlane.getCPtr(plane), plane), true);
  }

  public void getShadowCamera(SceneManager sm, Camera cam, Viewport vp, Light light, Camera texCam, long iteration) {
    OgreJNI.PlaneOptimalShadowCameraSetupPtr_getShadowCamera(swigCPtr, this, SceneManager.getCPtr(sm), sm, Camera.getCPtr(cam), cam, Viewport.getCPtr(vp), vp, Light.getCPtr(light), light, Camera.getCPtr(texCam), texCam, iteration);
  }

}
