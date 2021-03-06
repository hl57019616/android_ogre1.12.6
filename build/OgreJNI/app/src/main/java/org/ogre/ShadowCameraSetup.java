/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ShadowCameraSetup {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ShadowCameraSetup(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShadowCameraSetup obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ShadowCameraSetup(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void getShadowCamera(SceneManager sm, Camera cam, Viewport vp, Light light, Camera texCam, long iteration) {
    OgreJNI.ShadowCameraSetup_getShadowCamera(swigCPtr, this, SceneManager.getCPtr(sm), sm, Camera.getCPtr(cam), cam, Viewport.getCPtr(vp), vp, Light.getCPtr(light), light, Camera.getCPtr(texCam), texCam, iteration);
  }

}
