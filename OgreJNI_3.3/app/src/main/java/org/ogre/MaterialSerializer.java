/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MaterialSerializer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MaterialSerializer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MaterialSerializer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MaterialSerializer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Listener {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected Listener(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(Listener obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          OgreJNI.delete_MaterialSerializer_Listener(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    protected void swigDirectorDisconnect() {
      swigCMemOwn = false;
      delete();
    }
  
    public void swigReleaseOwnership() {
      swigCMemOwn = false;
      OgreJNI.MaterialSerializer_Listener_change_ownership(this, swigCPtr, false);
    }
  
    public void swigTakeOwnership() {
      swigCMemOwn = true;
      OgreJNI.MaterialSerializer_Listener_change_ownership(this, swigCPtr, true);
    }
  
    public void materialEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Material mat) {
      if (getClass() == Listener.class) OgreJNI.MaterialSerializer_Listener_materialEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Material.getCPtr(mat), mat); else OgreJNI.MaterialSerializer_Listener_materialEventRaisedSwigExplicitListener(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Material.getCPtr(mat), mat);
    }
  
    public void techniqueEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Technique tech) {
      if (getClass() == Listener.class) OgreJNI.MaterialSerializer_Listener_techniqueEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Technique.getCPtr(tech), tech); else OgreJNI.MaterialSerializer_Listener_techniqueEventRaisedSwigExplicitListener(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Technique.getCPtr(tech), tech);
    }
  
    public void passEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, Pass pass) {
      if (getClass() == Listener.class) OgreJNI.MaterialSerializer_Listener_passEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Pass.getCPtr(pass), pass); else OgreJNI.MaterialSerializer_Listener_passEventRaisedSwigExplicitListener(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), Pass.getCPtr(pass), pass);
    }
  
    public void gpuProgramRefEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, String attrib, GpuProgramPtr program, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t params, GpuProgramParameters defaultParams) {
      OgreJNI.MaterialSerializer_Listener_gpuProgramRefEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), attrib, GpuProgramPtr.getCPtr(program), program, SWIGTYPE_p_Ogre__SharedPtrT_Ogre__GpuProgramParameters_t.getCPtr(params), GpuProgramParameters.getCPtr(defaultParams), defaultParams);
    }
  
    public void textureUnitStateEventRaised(MaterialSerializer ser, MaterialSerializer.SerializeEvent event, SWIGTYPE_p_bool skip, TextureUnitState textureUnit) {
      if (getClass() == Listener.class) OgreJNI.MaterialSerializer_Listener_textureUnitStateEventRaised(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), TextureUnitState.getCPtr(textureUnit), textureUnit); else OgreJNI.MaterialSerializer_Listener_textureUnitStateEventRaisedSwigExplicitListener(swigCPtr, this, MaterialSerializer.getCPtr(ser), ser, event.swigValue(), SWIGTYPE_p_bool.getCPtr(skip), TextureUnitState.getCPtr(textureUnit), textureUnit);
    }
  
    public Listener() {
      this(OgreJNI.new_MaterialSerializer_Listener(), true);
      OgreJNI.MaterialSerializer_Listener_director_connect(this, swigCPtr, swigCMemOwn, true);
    }
  
  }

  public MaterialSerializer() {
    this(OgreJNI.new_MaterialSerializer(), true);
  }

  public void queueForExport(MaterialPtr pMat, boolean clearQueued, boolean exportDefaults, String materialName) {
    OgreJNI.MaterialSerializer_queueForExport__SWIG_0(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, clearQueued, exportDefaults, materialName);
  }

  public void queueForExport(MaterialPtr pMat, boolean clearQueued, boolean exportDefaults) {
    OgreJNI.MaterialSerializer_queueForExport__SWIG_1(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, clearQueued, exportDefaults);
  }

  public void queueForExport(MaterialPtr pMat, boolean clearQueued) {
    OgreJNI.MaterialSerializer_queueForExport__SWIG_2(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, clearQueued);
  }

  public void queueForExport(MaterialPtr pMat) {
    OgreJNI.MaterialSerializer_queueForExport__SWIG_3(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat);
  }

  public void exportQueued(String filename, boolean includeProgDef, String programFilename) {
    OgreJNI.MaterialSerializer_exportQueued__SWIG_0(swigCPtr, this, filename, includeProgDef, programFilename);
  }

  public void exportQueued(String filename, boolean includeProgDef) {
    OgreJNI.MaterialSerializer_exportQueued__SWIG_1(swigCPtr, this, filename, includeProgDef);
  }

  public void exportQueued(String filename) {
    OgreJNI.MaterialSerializer_exportQueued__SWIG_2(swigCPtr, this, filename);
  }

  public void exportMaterial(MaterialPtr pMat, String filename, boolean exportDefaults, boolean includeProgDef, String programFilename, String materialName) {
    OgreJNI.MaterialSerializer_exportMaterial__SWIG_0(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, filename, exportDefaults, includeProgDef, programFilename, materialName);
  }

  public void exportMaterial(MaterialPtr pMat, String filename, boolean exportDefaults, boolean includeProgDef, String programFilename) {
    OgreJNI.MaterialSerializer_exportMaterial__SWIG_1(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, filename, exportDefaults, includeProgDef, programFilename);
  }

  public void exportMaterial(MaterialPtr pMat, String filename, boolean exportDefaults, boolean includeProgDef) {
    OgreJNI.MaterialSerializer_exportMaterial__SWIG_2(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, filename, exportDefaults, includeProgDef);
  }

  public void exportMaterial(MaterialPtr pMat, String filename, boolean exportDefaults) {
    OgreJNI.MaterialSerializer_exportMaterial__SWIG_3(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, filename, exportDefaults);
  }

  public void exportMaterial(MaterialPtr pMat, String filename) {
    OgreJNI.MaterialSerializer_exportMaterial__SWIG_4(swigCPtr, this, MaterialPtr.getCPtr(pMat), pMat, filename);
  }

  public String getQueuedAsString() {
    return OgreJNI.MaterialSerializer_getQueuedAsString(swigCPtr, this);
  }

  public void clearQueue() {
    OgreJNI.MaterialSerializer_clearQueue(swigCPtr, this);
  }

  public void addListener(MaterialSerializer.Listener listener) {
    OgreJNI.MaterialSerializer_addListener(swigCPtr, this, MaterialSerializer.Listener.getCPtr(listener), listener);
  }

  public void removeListener(MaterialSerializer.Listener listener) {
    OgreJNI.MaterialSerializer_removeListener(swigCPtr, this, MaterialSerializer.Listener.getCPtr(listener), listener);
  }

  public void beginSection(int level, boolean useMainBuffer) {
    OgreJNI.MaterialSerializer_beginSection__SWIG_0(swigCPtr, this, level, useMainBuffer);
  }

  public void beginSection(int level) {
    OgreJNI.MaterialSerializer_beginSection__SWIG_1(swigCPtr, this, level);
  }

  public void endSection(int level, boolean useMainBuffer) {
    OgreJNI.MaterialSerializer_endSection__SWIG_0(swigCPtr, this, level, useMainBuffer);
  }

  public void endSection(int level) {
    OgreJNI.MaterialSerializer_endSection__SWIG_1(swigCPtr, this, level);
  }

  public void writeAttribute(int level, String att, boolean useMainBuffer) {
    OgreJNI.MaterialSerializer_writeAttribute__SWIG_0(swigCPtr, this, level, att, useMainBuffer);
  }

  public void writeAttribute(int level, String att) {
    OgreJNI.MaterialSerializer_writeAttribute__SWIG_1(swigCPtr, this, level, att);
  }

  public void writeValue(String val, boolean useMainBuffer) {
    OgreJNI.MaterialSerializer_writeValue__SWIG_0(swigCPtr, this, val, useMainBuffer);
  }

  public void writeValue(String val) {
    OgreJNI.MaterialSerializer_writeValue__SWIG_1(swigCPtr, this, val);
  }

  public String quoteWord(String val) {
    return OgreJNI.MaterialSerializer_quoteWord(swigCPtr, this, val);
  }

  public void writeComment(int level, String comment, boolean useMainBuffer) {
    OgreJNI.MaterialSerializer_writeComment__SWIG_0(swigCPtr, this, level, comment, useMainBuffer);
  }

  public void writeComment(int level, String comment) {
    OgreJNI.MaterialSerializer_writeComment__SWIG_1(swigCPtr, this, level, comment);
  }

  public enum SerializeEvent {
    MSE_PRE_WRITE,
    MSE_WRITE_BEGIN,
    MSE_WRITE_END,
    MSE_POST_WRITE;

    public final int swigValue() {
      return swigValue;
    }

    public static SerializeEvent swigToEnum(int swigValue) {
      SerializeEvent[] swigValues = SerializeEvent.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (SerializeEvent swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + SerializeEvent.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private SerializeEvent() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private SerializeEvent(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private SerializeEvent(SerializeEvent swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}