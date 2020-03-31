/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class MeshSerializer extends Serializer {
  private transient long swigCPtr;

  protected MeshSerializer(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.MeshSerializer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MeshSerializer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_MeshSerializer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MeshSerializer() {
    this(OgreJNI.new_MeshSerializer(), true);
  }

  public void exportMesh(Mesh pMesh, String filename, Serializer.Endian endianMode) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_0(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, filename, endianMode.swigValue());
  }

  public void exportMesh(Mesh pMesh, String filename) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_1(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, filename);
  }

  public void exportMesh(Mesh pMesh, String filename, MeshVersion version, Serializer.Endian endianMode) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_2(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, filename, version.swigValue(), endianMode.swigValue());
  }

  public void exportMesh(Mesh pMesh, String filename, MeshVersion version) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_3(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, filename, version.swigValue());
  }

  public void exportMesh(Mesh pMesh, DataStreamPtr stream, Serializer.Endian endianMode) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_4(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, DataStreamPtr.getCPtr(stream), stream, endianMode.swigValue());
  }

  public void exportMesh(Mesh pMesh, DataStreamPtr stream) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_5(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, DataStreamPtr.getCPtr(stream), stream);
  }

  public void exportMesh(Mesh pMesh, DataStreamPtr stream, MeshVersion version, Serializer.Endian endianMode) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_6(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, DataStreamPtr.getCPtr(stream), stream, version.swigValue(), endianMode.swigValue());
  }

  public void exportMesh(Mesh pMesh, DataStreamPtr stream, MeshVersion version) {
    OgreJNI.MeshSerializer_exportMesh__SWIG_7(swigCPtr, this, Mesh.getCPtr(pMesh), pMesh, DataStreamPtr.getCPtr(stream), stream, version.swigValue());
  }

  public void importMesh(DataStreamPtr stream, Mesh pDest) {
    OgreJNI.MeshSerializer_importMesh(swigCPtr, this, DataStreamPtr.getCPtr(stream), stream, Mesh.getCPtr(pDest), pDest);
  }

  public void setListener(MeshSerializerListener listener) {
    OgreJNI.MeshSerializer_setListener(swigCPtr, this, MeshSerializerListener.getCPtr(listener), listener);
  }

  public MeshSerializerListener getListener() {
    long cPtr = OgreJNI.MeshSerializer_getListener(swigCPtr, this);
    return (cPtr == 0) ? null : new MeshSerializerListener(cPtr, false);
  }

}