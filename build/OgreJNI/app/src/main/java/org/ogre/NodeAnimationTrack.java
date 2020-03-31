/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.ogre;

public class NodeAnimationTrack extends AnimationTrack {
  private transient long swigCPtr;

  protected NodeAnimationTrack(long cPtr, boolean cMemoryOwn) {
    super(OgreJNI.NodeAnimationTrack_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NodeAnimationTrack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OgreJNI.delete_NodeAnimationTrack(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NodeAnimationTrack(Animation parent, int handle) {
    this(OgreJNI.new_NodeAnimationTrack__SWIG_0(Animation.getCPtr(parent), parent, handle), true);
  }

  public NodeAnimationTrack(Animation parent, int handle, Node targetNode) {
    this(OgreJNI.new_NodeAnimationTrack__SWIG_1(Animation.getCPtr(parent), parent, handle, Node.getCPtr(targetNode), targetNode), true);
  }

  public TransformKeyFrame createNodeKeyFrame(float timePos) {
    long cPtr = OgreJNI.NodeAnimationTrack_createNodeKeyFrame(swigCPtr, this, timePos);
    return (cPtr == 0) ? null : new TransformKeyFrame(cPtr, false);
  }

  public Node getAssociatedNode() {
    long cPtr = OgreJNI.NodeAnimationTrack_getAssociatedNode(swigCPtr, this);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public void setAssociatedNode(Node node) {
    OgreJNI.NodeAnimationTrack_setAssociatedNode(swigCPtr, this, Node.getCPtr(node), node);
  }

  public void applyToNode(Node node, TimeIndex timeIndex, float weight, float scale) {
    OgreJNI.NodeAnimationTrack_applyToNode__SWIG_0(swigCPtr, this, Node.getCPtr(node), node, TimeIndex.getCPtr(timeIndex), timeIndex, weight, scale);
  }

  public void applyToNode(Node node, TimeIndex timeIndex, float weight) {
    OgreJNI.NodeAnimationTrack_applyToNode__SWIG_1(swigCPtr, this, Node.getCPtr(node), node, TimeIndex.getCPtr(timeIndex), timeIndex, weight);
  }

  public void applyToNode(Node node, TimeIndex timeIndex) {
    OgreJNI.NodeAnimationTrack_applyToNode__SWIG_2(swigCPtr, this, Node.getCPtr(node), node, TimeIndex.getCPtr(timeIndex), timeIndex);
  }

  public void setUseShortestRotationPath(boolean useShortestPath) {
    OgreJNI.NodeAnimationTrack_setUseShortestRotationPath(swigCPtr, this, useShortestPath);
  }

  public boolean getUseShortestRotationPath() {
    return OgreJNI.NodeAnimationTrack_getUseShortestRotationPath(swigCPtr, this);
  }

  public void getInterpolatedKeyFrame(TimeIndex timeIndex, KeyFrame kf) {
    OgreJNI.NodeAnimationTrack_getInterpolatedKeyFrame(swigCPtr, this, TimeIndex.getCPtr(timeIndex), timeIndex, KeyFrame.getCPtr(kf), kf);
  }

  public void apply(TimeIndex timeIndex, float weight, float scale) {
    OgreJNI.NodeAnimationTrack_apply__SWIG_0(swigCPtr, this, TimeIndex.getCPtr(timeIndex), timeIndex, weight, scale);
  }

  public void apply(TimeIndex timeIndex, float weight) {
    OgreJNI.NodeAnimationTrack_apply__SWIG_1(swigCPtr, this, TimeIndex.getCPtr(timeIndex), timeIndex, weight);
  }

  public void apply(TimeIndex timeIndex) {
    OgreJNI.NodeAnimationTrack_apply__SWIG_2(swigCPtr, this, TimeIndex.getCPtr(timeIndex), timeIndex);
  }

  public void _keyFrameDataChanged() {
    OgreJNI.NodeAnimationTrack__keyFrameDataChanged(swigCPtr, this);
  }

  public TransformKeyFrame getNodeKeyFrame(int index) {
    long cPtr = OgreJNI.NodeAnimationTrack_getNodeKeyFrame(swigCPtr, this, index);
    return (cPtr == 0) ? null : new TransformKeyFrame(cPtr, false);
  }

  public boolean hasNonZeroKeyFrames() {
    return OgreJNI.NodeAnimationTrack_hasNonZeroKeyFrames(swigCPtr, this);
  }

  public void optimise() {
    OgreJNI.NodeAnimationTrack_optimise(swigCPtr, this);
  }

  public NodeAnimationTrack _clone(Animation newParent) {
    long cPtr = OgreJNI.NodeAnimationTrack__clone(swigCPtr, this, Animation.getCPtr(newParent), newParent);
    return (cPtr == 0) ? null : new NodeAnimationTrack(cPtr, false);
  }

  public void _applyBaseKeyFrame(KeyFrame base) {
    OgreJNI.NodeAnimationTrack__applyBaseKeyFrame(swigCPtr, this, KeyFrame.getCPtr(base), base);
  }

}