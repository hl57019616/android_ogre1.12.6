/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class FileStreamDataStreamPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FileStreamDataStreamPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FileStreamDataStreamPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_FileStreamDataStreamPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FileStreamDataStreamPtr(SWIGTYPE_p_std__nullptr_t arg0) {
    this(OgreJNI.new_FileStreamDataStreamPtr__SWIG_0(SWIGTYPE_p_std__nullptr_t.getCPtr(arg0)), true);
  }

  public FileStreamDataStreamPtr() {
    this(OgreJNI.new_FileStreamDataStreamPtr__SWIG_1(), true);
  }

  public FileStreamDataStreamPtr(FileStreamDataStreamPtr r) {
    this(OgreJNI.new_FileStreamDataStreamPtr__SWIG_2(FileStreamDataStreamPtr.getCPtr(r), r), true);
  }

  public FileStreamDataStream __deref__() {
    long cPtr = OgreJNI.FileStreamDataStreamPtr___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new FileStreamDataStream(cPtr, false);
  }

  public long read(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileStreamDataStreamPtr_read(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long write(SWIGTYPE_p_void buf, long count) {
    return OgreJNI.FileStreamDataStreamPtr_write(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buf), count);
  }

  public long readLine(String buf, long maxCount, String delim) {
    return OgreJNI.FileStreamDataStreamPtr_readLine__SWIG_0(swigCPtr, this, buf, maxCount, delim);
  }

  public long readLine(String buf, long maxCount) {
    return OgreJNI.FileStreamDataStreamPtr_readLine__SWIG_1(swigCPtr, this, buf, maxCount);
  }

  public void skip(int count) {
    OgreJNI.FileStreamDataStreamPtr_skip(swigCPtr, this, count);
  }

  public void seek(long pos) {
    OgreJNI.FileStreamDataStreamPtr_seek(swigCPtr, this, pos);
  }

  public long tell() {
    return OgreJNI.FileStreamDataStreamPtr_tell(swigCPtr, this);
  }

  public boolean eof() {
    return OgreJNI.FileStreamDataStreamPtr_eof(swigCPtr, this);
  }

  public void close() {
    OgreJNI.FileStreamDataStreamPtr_close(swigCPtr, this);
  }

  public String getName() {
    return OgreJNI.FileStreamDataStreamPtr_getName(swigCPtr, this);
  }

  public int getAccessMode() {
    return OgreJNI.FileStreamDataStreamPtr_getAccessMode(swigCPtr, this);
  }

  public boolean isReadable() {
    return OgreJNI.FileStreamDataStreamPtr_isReadable(swigCPtr, this);
  }

  public boolean isWriteable() {
    return OgreJNI.FileStreamDataStreamPtr_isWriteable(swigCPtr, this);
  }

  public String getLine(boolean trimAfter) {
    return OgreJNI.FileStreamDataStreamPtr_getLine__SWIG_0(swigCPtr, this, trimAfter);
  }

  public String getLine() {
    return OgreJNI.FileStreamDataStreamPtr_getLine__SWIG_1(swigCPtr, this);
  }

  public String getAsString() {
    return OgreJNI.FileStreamDataStreamPtr_getAsString(swigCPtr, this);
  }

  public long skipLine(String delim) {
    return OgreJNI.FileStreamDataStreamPtr_skipLine__SWIG_0(swigCPtr, this, delim);
  }

  public long skipLine() {
    return OgreJNI.FileStreamDataStreamPtr_skipLine__SWIG_1(swigCPtr, this);
  }

  public long size() {
    return OgreJNI.FileStreamDataStreamPtr_size(swigCPtr, this);
  }

}