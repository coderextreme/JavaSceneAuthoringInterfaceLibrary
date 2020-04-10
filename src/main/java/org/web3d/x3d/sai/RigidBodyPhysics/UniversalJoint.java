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
 * UniversalJoint is like a BallJoint that constrains an extra degree of rotational freedom.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DRigidJointNode] UniversalJoint is like a BallJoint that constrains an extra degree of rotational freedom. Contains two RigidBody nodes (containerField values body1, body2).
 * <ul>
 *  <li> <i>Hint:</i> useful in combination with BallJoint. </li> 
 *  <li> <i>Hint:</i>  RigidBodyPhysics component, level 2. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#UniversalJoint" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#UniversalJoint" target="blank">X3D Abstract Specification: UniversalJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#UniversalJoint" target="_blank">X3D Tooltips: UniversalJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface UniversalJoint extends X3DRigidJointNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>anchorPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  anchorPoint is joint center, specified in world coordinates.  * <br>

	 * @return value of anchorPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getAnchorPoint();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>anchorPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  anchorPoint is joint center, specified in world coordinates.  * <br>

	 * @param newValue is new value for the anchorPoint field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setAnchorPoint(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>axis1</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis1 defines axis vector of joint connection to body1.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @return value of axis1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getAxis1();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>axis1</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis1 defines axis vector of joint connection to body1.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @param newValue is new value for the axis1 field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setAxis1(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>axis2</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis2 defines axis vector of joint connection to body2.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @return value of axis2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getAxis2();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>axis2</i>.
	 * <br><br>
	 * <i>Tooltip:</i> axis2 defines axis vector of joint connection to body2.
 * <ul>
 *  <li> <i> Hint:</i>  0 0 0 means motor disabled. </li> 
 * </ul>
	 * @param newValue is new value for the axis2 field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setAxis2(float[] newValue);

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
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public UniversalJoint setBody1(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>body1AnchorPoint</i>.
	 * @return value of body1AnchorPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getBody1AnchorPoint();
	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>body1Axis</i>.
	 * @return value of body1Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getBody1Axis();
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
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public UniversalJoint setBody2(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>body2AnchorPoint</i>.
	 * @return value of body2AnchorPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getBody2AnchorPoint();
	/**
	 * Provide float value from outputOnly SFFloat field named <i>body2Axis</i>.
	 * @return value of body2Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getBody2Axis();
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
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public UniversalJoint setForceOutput(String[] newValue);

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
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public UniversalJoint setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>stop1Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stop1Bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop1Bounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop1Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stop1Bounce field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setStop1Bounce(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>stop1ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stop1ErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop1ErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop1ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stop1ErrorCorrection field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setStop1ErrorCorrection(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>stop2Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @return value of stop2Bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop2Bounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop2Bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2Bounce is velocity factor for bounce back once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no bounce, 1 means return velocity matches. </li> 
 * </ul>
	 * @param newValue is new value for the stop2Bounce field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setStop2Bounce(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>stop2ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @return value of stop2ErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop2ErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop2ErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop2ErrorCorrection is fraction of error correction performed during time step once stop point is reached.
 * <ul>
 *  <li> <i> Hint:</i>  0 means no error correction, 1 means all error corrected in single step. </li> 
 * </ul>
	 * @param newValue is new value for the stop2ErrorCorrection field.
	 * @return {@link UniversalJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public UniversalJoint setStop2ErrorCorrection(float newValue);

}
