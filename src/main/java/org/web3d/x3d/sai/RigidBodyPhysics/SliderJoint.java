/*
Copyright (c) 1995-2017 held by the author(s).  All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer
      in the documentation and/or other materials provided with the
      distribution.
    * Neither the name of the Web3D Consortium (http://www.web3D.org)
      nor the names of its contributors may be used to endorse or
      promote products derived from this software without specific
      prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
*/

package org.web3d.x3d.sai.RigidBodyPhysics;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.RigidBodyPhysics.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * SliderJoint constrains all movement between body1 and body2 along a single axis. Contains two RigidBody nodes (containerField values body1, body2).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DRigidJointNode] SliderJoint constrains all movement between body1 and body2 along a single axis. Contains two RigidBody nodes (containerField values body1, body2).
 * <ul>
 *  <li> <i> Hint:</i>  RigidBodyPhysics component, level 2. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#SliderJoint" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#SliderJoint" target="blank">X3D Abstract Specification: SliderJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SliderJoint" target="_blank">X3D Tooltips: SliderJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface SliderJoint extends X3DRigidJointNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] axis is normalized vector specifying direction of motion.  * <br>

	 * @return value of axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getAxis();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>axis</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] axis is normalized vector specifying direction of motion.  * <br>

	 * @param newValue is new value for the axis field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setAxis(float[] newValue);

	/**
	 * Provide RigidBody instance (using a properly typed node) from inputOutput SFNode field <i>body1</i>.
	 * @return value of body1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody1(); // acceptable node types #1: RigidBody

	/**
	 * Accessor method to assign RigidBody instance (using a properly typed node) to inputOutput SFNode field <i>body1</i>.
	 * @param newValue is new value for the body1 field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJoint setBody1(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide RigidBody instance (using a properly typed node) from inputOutput SFNode field <i>body2</i>.
	 * @return value of body2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public RigidBody getBody2(); // acceptable node types #1: RigidBody

	/**
	 * Accessor method to assign RigidBody instance (using a properly typed node) to inputOutput SFNode field <i>body2</i>.
	 * @param newValue is new value for the body2 field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJoint setBody2(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide array of String enumeration results (baseType forceOutputValues) ['"ALL"' | '"NONE"' | '"etc."'] from inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * @return value of forceOutput field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public String[] getForceOutput();

	/**
	 * Accessor method to assign String enumeration array (""ALL"" | ""NONE"") to inputOutput MFString field named <i>forceOutput</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  forceOutput controls which output fields are generated for the next frame. Values are ALL, NONE, or exact names of output fields updated at start of next frame.  * <br>

	 * @param newValue is new value for the forceOutput field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJoint setForceOutput(String[] newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>maxSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> maxSeparation is maximum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @return value of maxSeparation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMaxSeparation();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> maxSeparation is maximum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @param newValue is new value for the maxSeparation field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setMaxSeparation(float newValue);

	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata(); // acceptable node types #1: X3DMetadataObject

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SliderJoint setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value from inputOutput SFFloat field named <i>minSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minSeparation is minimum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @return value of minSeparation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMinSeparation();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minSeparation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> minSeparation is minimum separation distance between the two bodies.
 * <ul>
 *  <li> <i> Hint:</i>  if (minSeparation is less than maxSeparation) then no stop is effective. </li> 
 * </ul>
	 * @param newValue is new value for the minSeparation field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setMinSeparation(float newValue);

	/**
	 * Provide float value from outputOnly SFFloat field named <i>separation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separation indicates final separation distance between the two bodies.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of separation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getSeparation();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>separationRate</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separationRate indicates change in separation distance over time between the two bodies.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of separationRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getSeparationRate();
	/**
	 * Provide float value from inputOutput SFFloat field named <i>sliderForce</i>.
	 * @return value of sliderForce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getSliderForce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>sliderForce</i>.
	 * @param newValue is new value for the sliderForce field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setSliderForce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stopBounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopBounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stopBounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStopBounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stopBounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopBounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stopBounce field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setStopBounce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stopErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stopErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStopErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stopErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stopErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stopErrorCorrection field.
	 * @return {@link SliderJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SliderJoint setStopErrorCorrection(float newValue);

}
