/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class ShaderGenerator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ShaderGenerator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShaderGenerator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static boolean initialize() {
    return RTShaderJNI.ShaderGenerator_initialize();
  }

  public static void destroy() {
    RTShaderJNI.ShaderGenerator_destroy();
  }

  public static ShaderGenerator getSingleton() {
    return new ShaderGenerator(RTShaderJNI.ShaderGenerator_getSingleton(), false);
  }

  public void addSceneManager(SceneManager sceneMgr) {
    RTShaderJNI.ShaderGenerator_addSceneManager(swigCPtr, this, SceneManager.getCPtr(sceneMgr), sceneMgr);
  }

  public void removeSceneManager(SceneManager sceneMgr) {
    RTShaderJNI.ShaderGenerator_removeSceneManager(swigCPtr, this, SceneManager.getCPtr(sceneMgr), sceneMgr);
  }

  public SceneManager getActiveSceneManager() {
    long cPtr = RTShaderJNI.ShaderGenerator_getActiveSceneManager(swigCPtr, this);
    return (cPtr == 0) ? null : new SceneManager(cPtr, false);
  }

  public void _setActiveSceneManager(SceneManager sceneManager) {
    RTShaderJNI.ShaderGenerator__setActiveSceneManager(swigCPtr, this, SceneManager.getCPtr(sceneManager), sceneManager);
  }

  public void setTargetLanguage(String shaderLanguage) {
    RTShaderJNI.ShaderGenerator_setTargetLanguage(swigCPtr, this, shaderLanguage);
  }

  public String getTargetLanguage() {
    return RTShaderJNI.ShaderGenerator_getTargetLanguage(swigCPtr, this);
  }

  public void setShaderProfiles(GpuProgramType type, String shaderProfiles) {
    RTShaderJNI.ShaderGenerator_setShaderProfiles(swigCPtr, this, type.swigValue(), shaderProfiles);
  }

  public String getShaderProfiles(GpuProgramType type) {
    return RTShaderJNI.ShaderGenerator_getShaderProfiles(swigCPtr, this, type.swigValue());
  }

  public StringVector getShaderProfilesList(GpuProgramType type) {
    return new StringVector(RTShaderJNI.ShaderGenerator_getShaderProfilesList(swigCPtr, this, type.swigValue()), false);
  }

  public void setShaderCachePath(String cachePath) {
    RTShaderJNI.ShaderGenerator_setShaderCachePath(swigCPtr, this, cachePath);
  }

  public String getShaderCachePath() {
    return RTShaderJNI.ShaderGenerator_getShaderCachePath(swigCPtr, this);
  }

  public void flushShaderCache() {
    RTShaderJNI.ShaderGenerator_flushShaderCache(swigCPtr, this);
  }

  public RenderState getRenderState(String schemeName) {
    long cPtr = RTShaderJNI.ShaderGenerator_getRenderState__SWIG_0(swigCPtr, this, schemeName);
    return (cPtr == 0) ? null : new RenderState(cPtr, false);
  }

  public SWIGTYPE_p_std__pairT_Ogre__RTShader__RenderState_p_bool_t createOrRetrieveRenderState(String schemeName) {
    return new SWIGTYPE_p_std__pairT_Ogre__RTShader__RenderState_p_bool_t(RTShaderJNI.ShaderGenerator_createOrRetrieveRenderState(swigCPtr, this, schemeName), true);
  }

  public boolean hasRenderState(String schemeName) {
    return RTShaderJNI.ShaderGenerator_hasRenderState(swigCPtr, this, schemeName);
  }

  public RenderState getRenderState(String schemeName, String materialName, String groupName, int passIndex) {
    long cPtr = RTShaderJNI.ShaderGenerator_getRenderState__SWIG_1(swigCPtr, this, schemeName, materialName, groupName, passIndex);
    return (cPtr == 0) ? null : new RenderState(cPtr, false);
  }

  public void addSubRenderStateFactory(SubRenderStateFactory factory) {
    RTShaderJNI.ShaderGenerator_addSubRenderStateFactory(swigCPtr, this, SubRenderStateFactory.getCPtr(factory), factory);
  }

  public long getNumSubRenderStateFactories() {
    return RTShaderJNI.ShaderGenerator_getNumSubRenderStateFactories(swigCPtr, this);
  }

  public SubRenderStateFactory getSubRenderStateFactory(long index) {
    long cPtr = RTShaderJNI.ShaderGenerator_getSubRenderStateFactory__SWIG_0(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SubRenderStateFactory(cPtr, false);
  }

  public SubRenderStateFactory getSubRenderStateFactory(String type) {
    long cPtr = RTShaderJNI.ShaderGenerator_getSubRenderStateFactory__SWIG_1(swigCPtr, this, type);
    return (cPtr == 0) ? null : new SubRenderStateFactory(cPtr, false);
  }

  public void removeSubRenderStateFactory(SubRenderStateFactory factory) {
    RTShaderJNI.ShaderGenerator_removeSubRenderStateFactory(swigCPtr, this, SubRenderStateFactory.getCPtr(factory), factory);
  }

  public SubRenderState createSubRenderState(String type) {
    long cPtr = RTShaderJNI.ShaderGenerator_createSubRenderState(swigCPtr, this, type);
    return (cPtr == 0) ? null : new SubRenderState(cPtr, false);
  }

  public void destroySubRenderState(SubRenderState subRenderState) {
    RTShaderJNI.ShaderGenerator_destroySubRenderState(swigCPtr, this, SubRenderState.getCPtr(subRenderState), subRenderState);
  }

  public boolean hasShaderBasedTechnique(String materialName, String srcTechniqueSchemeName, String dstTechniqueSchemeName) {
    return RTShaderJNI.ShaderGenerator_hasShaderBasedTechnique__SWIG_0(swigCPtr, this, materialName, srcTechniqueSchemeName, dstTechniqueSchemeName);
  }

  public boolean hasShaderBasedTechnique(String materialName, String groupName, String srcTechniqueSchemeName, String dstTechniqueSchemeName) {
    return RTShaderJNI.ShaderGenerator_hasShaderBasedTechnique__SWIG_1(swigCPtr, this, materialName, groupName, srcTechniqueSchemeName, dstTechniqueSchemeName);
  }

  public boolean createShaderBasedTechnique(Material srcMat, String srcTechniqueSchemeName, String dstTechniqueSchemeName, boolean overProgrammable) {
    return RTShaderJNI.ShaderGenerator_createShaderBasedTechnique__SWIG_0(swigCPtr, this, Material.getCPtr(srcMat), srcMat, srcTechniqueSchemeName, dstTechniqueSchemeName, overProgrammable);
  }

  public boolean createShaderBasedTechnique(Material srcMat, String srcTechniqueSchemeName, String dstTechniqueSchemeName) {
    return RTShaderJNI.ShaderGenerator_createShaderBasedTechnique__SWIG_1(swigCPtr, this, Material.getCPtr(srcMat), srcMat, srcTechniqueSchemeName, dstTechniqueSchemeName);
  }

  public boolean createShaderBasedTechnique(Technique srcTech, String dstTechniqueSchemeName, boolean overProgrammable) {
    return RTShaderJNI.ShaderGenerator_createShaderBasedTechnique__SWIG_2(swigCPtr, this, Technique.getCPtr(srcTech), srcTech, dstTechniqueSchemeName, overProgrammable);
  }

  public boolean createShaderBasedTechnique(Technique srcTech, String dstTechniqueSchemeName) {
    return RTShaderJNI.ShaderGenerator_createShaderBasedTechnique__SWIG_3(swigCPtr, this, Technique.getCPtr(srcTech), srcTech, dstTechniqueSchemeName);
  }

  public boolean removeShaderBasedTechnique(Technique srcTech, String dstTechniqueSchemeName) {
    return RTShaderJNI.ShaderGenerator_removeShaderBasedTechnique(swigCPtr, this, Technique.getCPtr(srcTech), srcTech, dstTechniqueSchemeName);
  }

  public boolean removeAllShaderBasedTechniques(String materialName, String groupName) {
    return RTShaderJNI.ShaderGenerator_removeAllShaderBasedTechniques__SWIG_0(swigCPtr, this, materialName, groupName);
  }

  public boolean removeAllShaderBasedTechniques(String materialName) {
    return RTShaderJNI.ShaderGenerator_removeAllShaderBasedTechniques__SWIG_1(swigCPtr, this, materialName);
  }

  public boolean cloneShaderBasedTechniques(String srcMaterialName, String srcGroupName, String dstMaterialName, String dstGroupName) {
    return RTShaderJNI.ShaderGenerator_cloneShaderBasedTechniques(swigCPtr, this, srcMaterialName, srcGroupName, dstMaterialName, dstGroupName);
  }

  public void removeAllShaderBasedTechniques() {
    RTShaderJNI.ShaderGenerator_removeAllShaderBasedTechniques__SWIG_2(swigCPtr, this);
  }

  public void createScheme(String schemeName) {
    RTShaderJNI.ShaderGenerator_createScheme(swigCPtr, this, schemeName);
  }

  public void invalidateScheme(String schemeName) {
    RTShaderJNI.ShaderGenerator_invalidateScheme(swigCPtr, this, schemeName);
  }

  public boolean validateScheme(String schemeName) {
    return RTShaderJNI.ShaderGenerator_validateScheme(swigCPtr, this, schemeName);
  }

  public void invalidateMaterial(String schemeName, String materialName, String groupName) {
    RTShaderJNI.ShaderGenerator_invalidateMaterial__SWIG_0(swigCPtr, this, schemeName, materialName, groupName);
  }

  public void invalidateMaterial(String schemeName, String materialName) {
    RTShaderJNI.ShaderGenerator_invalidateMaterial__SWIG_1(swigCPtr, this, schemeName, materialName);
  }

  public boolean validateMaterial(String schemeName, String materialName, String groupName) {
    return RTShaderJNI.ShaderGenerator_validateMaterial__SWIG_0(swigCPtr, this, schemeName, materialName, groupName);
  }

  public boolean validateMaterial(String schemeName, String materialName) {
    return RTShaderJNI.ShaderGenerator_validateMaterial__SWIG_1(swigCPtr, this, schemeName, materialName);
  }

  public void invalidateMaterialIlluminationPasses(String schemeName, String materialName, String groupName) {
    RTShaderJNI.ShaderGenerator_invalidateMaterialIlluminationPasses__SWIG_0(swigCPtr, this, schemeName, materialName, groupName);
  }

  public void invalidateMaterialIlluminationPasses(String schemeName, String materialName) {
    RTShaderJNI.ShaderGenerator_invalidateMaterialIlluminationPasses__SWIG_1(swigCPtr, this, schemeName, materialName);
  }

  public boolean validateMaterialIlluminationPasses(String schemeName, String materialName, String groupName) {
    return RTShaderJNI.ShaderGenerator_validateMaterialIlluminationPasses__SWIG_0(swigCPtr, this, schemeName, materialName, groupName);
  }

  public boolean validateMaterialIlluminationPasses(String schemeName, String materialName) {
    return RTShaderJNI.ShaderGenerator_validateMaterialIlluminationPasses__SWIG_1(swigCPtr, this, schemeName, materialName);
  }

  public MaterialSerializer.Listener getMaterialSerializerListener() {
    long cPtr = RTShaderJNI.ShaderGenerator_getMaterialSerializerListener(swigCPtr, this);
    return (cPtr == 0) ? null : new MaterialSerializer.Listener(cPtr, false);
  }

  public long getShaderCount(GpuProgramType type) {
    return RTShaderJNI.ShaderGenerator_getShaderCount(swigCPtr, this, type.swigValue());
  }

  public void setVertexShaderOutputsCompactPolicy(VSOutputCompactPolicy policy) {
    RTShaderJNI.ShaderGenerator_setVertexShaderOutputsCompactPolicy(swigCPtr, this, policy.swigValue());
  }

  public VSOutputCompactPolicy getVertexShaderOutputsCompactPolicy() {
    return VSOutputCompactPolicy.swigToEnum(RTShaderJNI.ShaderGenerator_getVertexShaderOutputsCompactPolicy(swigCPtr, this));
  }

  public void setCreateShaderOverProgrammablePass(boolean value) {
    RTShaderJNI.ShaderGenerator_setCreateShaderOverProgrammablePass(swigCPtr, this, value);
  }

  public boolean getCreateShaderOverProgrammablePass() {
    return RTShaderJNI.ShaderGenerator_getCreateShaderOverProgrammablePass(swigCPtr, this);
  }

  public long getRTShaderSchemeCount() {
    return RTShaderJNI.ShaderGenerator_getRTShaderSchemeCount(swigCPtr, this);
  }

  public String getRTShaderScheme(long index) {
    return RTShaderJNI.ShaderGenerator_getRTShaderScheme(swigCPtr, this, index);
  }

  public static void setDEFAULT_SCHEME_NAME(String value) {
    RTShaderJNI.ShaderGenerator_DEFAULT_SCHEME_NAME_set(value);
  }

  public static String getDEFAULT_SCHEME_NAME() {
    return RTShaderJNI.ShaderGenerator_DEFAULT_SCHEME_NAME_get();
  }

}