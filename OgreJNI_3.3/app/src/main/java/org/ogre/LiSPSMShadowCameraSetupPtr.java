/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class LiSPSMShadowCameraSetupPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LiSPSMShadowCameraSetupPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LiSPSMShadowCameraSetupPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_LiSPSMShadowCameraSetupPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LiSPSMShadowCameraSetupPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_LiSPSMShadowCameraSetupPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public LiSPSMShadowCameraSetupPtr() {
    this(OgreJNI.new_LiSPSMShadowCameraSetupPtr__SWIG_1(), true);
  }

  public LiSPSMShadowCameraSetupPtr(LiSPSMShadowCameraSetupPtr r) {
    this(OgreJNI.new_LiSPSMShadowCameraSetupPtr__SWIG_2(LiSPSMShadowCameraSetupPtr.getCPtr(r), r), true);
  }

  public LiSPSMShadowCameraSetup __deref__() {
    long cPtr = OgreJNI.LiSPSMShadowCameraSetupPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new LiSPSMShadowCameraSetup(cPtr, false);
  }

  public ShadowCameraSetupPtr create(float n, boolean useSimpleNOpt, Degree angle) {
    return new ShadowCameraSetupPtr(OgreJNI.LiSPSMShadowCameraSetupPtr_create__SWIG_0(swigCPtr, this, n, useSimpleNOpt, Degree.getCPtr(angle), angle), true);
  }

  public ShadowCameraSetupPtr create(float n, boolean useSimpleNOpt) {
    return new ShadowCameraSetupPtr(OgreJNI.LiSPSMShadowCameraSetupPtr_create__SWIG_1(swigCPtr, this, n, useSimpleNOpt), true);
  }

  public ShadowCameraSetupPtr create(float n) {
    return new ShadowCameraSetupPtr(OgreJNI.LiSPSMShadowCameraSetupPtr_create__SWIG_2(swigCPtr, this, n), true);
  }

  public ShadowCameraSetupPtr create() {
    return new ShadowCameraSetupPtr(OgreJNI.LiSPSMShadowCameraSetupPtr_create__SWIG_3(swigCPtr, this), true);
  }

  public void getShadowCamera(SceneManager sm, Camera cam, Viewport vp, Light light, Camera texCam, long iteration) {
    OgreJNI.LiSPSMShadowCameraSetupPtr_getShadowCamera(swigCPtr, this, SceneManager.getCPtr(sm), sm, Camera.getCPtr(cam), cam, Viewport.getCPtr(vp), vp, Light.getCPtr(light), light, Camera.getCPtr(texCam), texCam, iteration);
  }

  public void setOptimalAdjustFactor(float n) {
    OgreJNI.LiSPSMShadowCameraSetupPtr_setOptimalAdjustFactor(swigCPtr, this, n);
  }

  public float getOptimalAdjustFactor() {
    return OgreJNI.LiSPSMShadowCameraSetupPtr_getOptimalAdjustFactor(swigCPtr, this);
  }

  public void setUseSimpleOptimalAdjust(boolean s) {
    OgreJNI.LiSPSMShadowCameraSetupPtr_setUseSimpleOptimalAdjust(swigCPtr, this, s);
  }

  public boolean getUseSimpleOptimalAdjust() {
    return OgreJNI.LiSPSMShadowCameraSetupPtr_getUseSimpleOptimalAdjust(swigCPtr, this);
  }

  public void setCameraLightDirectionThreshold(Degree angle) {
    OgreJNI.LiSPSMShadowCameraSetupPtr_setCameraLightDirectionThreshold(swigCPtr, this, Degree.getCPtr(angle), angle);
  }

  public Degree getCameraLightDirectionThreshold() {
    return new Degree(OgreJNI.LiSPSMShadowCameraSetupPtr_getCameraLightDirectionThreshold(swigCPtr, this), true);
  }

  public void setUseAggressiveFocusRegion(boolean aggressive) {
    OgreJNI.LiSPSMShadowCameraSetupPtr_setUseAggressiveFocusRegion(swigCPtr, this, aggressive);
  }

  public boolean getUseAggressiveFocusRegion() {
    return OgreJNI.LiSPSMShadowCameraSetupPtr_getUseAggressiveFocusRegion(swigCPtr, this);
  }

}