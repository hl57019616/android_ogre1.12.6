/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public enum MeshVersion {
  MESH_VERSION_LATEST,
  MESH_VERSION_1_10,
  MESH_VERSION_1_8,
  MESH_VERSION_1_7,
  MESH_VERSION_1_4,
  MESH_VERSION_1_0,
  MESH_VERSION_LEGACY;

  public final int swigValue() {
    return swigValue;
  }

  public static MeshVersion swigToEnum(int swigValue) {
    MeshVersion[] swigValues = MeshVersion.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (MeshVersion swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + MeshVersion.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private MeshVersion() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private MeshVersion(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private MeshVersion(MeshVersion swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
