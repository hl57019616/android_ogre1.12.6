/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ScriptCompilerListener {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ScriptCompilerListener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ScriptCompilerListener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_ScriptCompilerListener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ScriptCompilerListener() {
    this(OgreJNI.new_ScriptCompilerListener(), true);
  }

  public SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__ConcreteNode_t_t_t importFile(ScriptCompiler compiler, String name) {
    return new SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__ConcreteNode_t_t_t(OgreJNI.ScriptCompilerListener_importFile(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, name), true);
  }

  public void preConversion(ScriptCompiler compiler, SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__ConcreteNode_t_t_t nodes) {
    OgreJNI.ScriptCompilerListener_preConversion(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__ConcreteNode_t_t_t.getCPtr(nodes));
  }

  public boolean postConversion(ScriptCompiler compiler, SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__AbstractNode_t_t_t arg1) {
    return OgreJNI.ScriptCompilerListener_postConversion(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, SWIGTYPE_p_Ogre__SharedPtrT_std__listT_Ogre__SharedPtrT_Ogre__AbstractNode_t_t_t.getCPtr(arg1));
  }

  public void handleError(ScriptCompiler compiler, long code, String file, int line, String msg) {
    OgreJNI.ScriptCompilerListener_handleError(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, code, file, line, msg);
  }

  public boolean handleEvent(ScriptCompiler compiler, ScriptCompilerEvent evt, SWIGTYPE_p_void retval) {
    return OgreJNI.ScriptCompilerListener_handleEvent(swigCPtr, this, ScriptCompiler.getCPtr(compiler), compiler, ScriptCompilerEvent.getCPtr(evt), evt, SWIGTYPE_p_void.getCPtr(retval));
  }

}