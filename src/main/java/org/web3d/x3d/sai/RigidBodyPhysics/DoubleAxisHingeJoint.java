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
 * DoubleAxisHingeJoint has two independent axes located around a common anchor point.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DRigidJointNode] DoubleAxisHingeJoint has two independent axes located around a common anchor point. axis1 has limits and a motor, axis 2 only has a motor Contains two RigidBody nodes (containerField values body1, body2).
 * <ul>
 *  <li> <i> Hint:</i>  RigidBodyPhysics component, level 2. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#DoubleAxisHingeJoint" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#DoubleAxisHingeJoint" target="blank">X3D Abstract Specification: DoubleAxisHingeJoint</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#DoubleAxisHingeJoint" target="_blank">X3D Tooltips: DoubleAxisHingeJoint</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface DoubleAxisHingeJoint extends X3DRigidJointNode
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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setAnchorPoint(float[] newValue);

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setAxis1(float[] newValue);

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setAxis2(float[] newValue);

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DoubleAxisHingeJoint setBody1(RigidBody newValue); // acceptable node types #2: RigidBody

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DoubleAxisHingeJoint setBody2(RigidBody newValue); // acceptable node types #2: RigidBody

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>body2AnchorPoint</i>.
	 * @return value of body2AnchorPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getBody2AnchorPoint();
	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>body2Axis</i>.
	 * @return value of body2Axis field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float[] getBody2Axis();
	/**
	 * Provide float value from inputOutput SFFloat field named <i>desiredAngularVelocity1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  desiredAngularVelocity1 is goal rotation rate for hinge connection to body1.  * <br>

	 * @return value of desiredAngularVelocity1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getDesiredAngularVelocity1();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>desiredAngularVelocity1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  desiredAngularVelocity1 is goal rotation rate for hinge connection to body1.  * <br>

	 * @param newValue is new value for the desiredAngularVelocity1 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setDesiredAngularVelocity1(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>desiredAngularVelocity2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  desiredAngularVelocity2 is goal rotation rate for hinge connection to body2.  * <br>

	 * @return value of desiredAngularVelocity2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getDesiredAngularVelocity2();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>desiredAngularVelocity2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  desiredAngularVelocity2 is goal rotation rate for hinge connection to body2.  * <br>

	 * @param newValue is new value for the desiredAngularVelocity2 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setDesiredAngularVelocity2(float newValue);

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DoubleAxisHingeJoint setForceOutput(String[] newValue);

	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>hinge1Angle</i>.
	 * @return value of hinge1Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getHinge1Angle();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>hinge1AngleRate</i>.
	 * @return value of hinge1AngleRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getHinge1AngleRate();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>hinge2Angle</i>.
	 * @return value of hinge2Angle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getHinge2Angle();
	/**
	 * Provide float value unit axis, angle (in radians) from outputOnly SFFloat field named <i>hinge2AngleRate</i>.
	 * @return value of hinge2AngleRate field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getHinge2AngleRate();
	/**
	 * Provide float value unit axis, angle (in radians) from inputOutput SFFloat field named <i>maxAngle1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [-pi,pi] maxAngle1 is maximum rotation angle for hinge.  * <br>

	 * @return value of maxAngle1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMaxAngle1();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to inputOutput SFFloat field named <i>maxAngle1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [-pi,pi] maxAngle1 is maximum rotation angle for hinge.  * <br>

	 * @param newValue is new value for the maxAngle1 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setMaxAngle1(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>maxTorque1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  maxTorque1 is maximum rotational torque applied by corresponding motor axis to achieve desiredAngularVelocity1.  * <br>

	 * @return value of maxTorque1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMaxTorque1();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxTorque1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  maxTorque1 is maximum rotational torque applied by corresponding motor axis to achieve desiredAngularVelocity1.  * <br>

	 * @param newValue is new value for the maxTorque1 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setMaxTorque1(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>maxTorque2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  maxTorque2 is maximum rotational torque applied by corresponding motor axis to achieve desiredAngularVelocity2.  * <br>

	 * @return value of maxTorque2 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMaxTorque2();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxTorque2</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  maxTorque2 is maximum rotational torque applied by corresponding motor axis to achieve desiredAngularVelocity2.  * <br>

	 * @param newValue is new value for the maxTorque2 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setMaxTorque2(float newValue);

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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DoubleAxisHingeJoint setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value unit axis, angle (in radians) from inputOutput SFFloat field named <i>minAngle1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [-pi,pi] minAngle1 is minimum rotation angle for hinge.  * <br>

	 * @return value of minAngle1 field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getMinAngle1();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to inputOutput SFFloat field named <i>minAngle1</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [-pi,pi] minAngle1 is minimum rotation angle for hinge.  * <br>

	 * @param newValue is new value for the minAngle1 field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setMinAngle1(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop1Bounce</i>.
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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setStop1Bounce(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop1ConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.
 * <ul>
 *  <li> <i>Hint:</i> use with suspensionForce to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @return value of stop1ConstantForceMix field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getStop1ConstantForceMix();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>stop1ConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] stop1ConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.
 * <ul>
 *  <li> <i>Hint:</i> use with suspensionForce to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @param newValue is new value for the stop1ConstantForceMix field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setStop1ConstantForceMix(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>stop1ErrorCorrection</i>.
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
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setStop1ErrorCorrection(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>suspensionErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] suspensionErrorCorrection describes how quickly the system resolves intersection errors due to floating-point inaccuracies.
 * <ul>
 *  <li> <i>Hint:</i> use with stop1ConstantForceMix to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @return value of suspensionErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getSuspensionErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>suspensionErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] suspensionErrorCorrection describes how quickly the system resolves intersection errors due to floating-point inaccuracies.
 * <ul>
 *  <li> <i>Hint:</i> use with stop1ConstantForceMix to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @param newValue is new value for the suspensionErrorCorrection field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setSuspensionErrorCorrection(float newValue);

	/**
	 * Provide float value from inputOutput SFFloat field named <i>suspensionForce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] suspensionForce describes how quickly the system resolves intersection errors due to floating-point inaccuracies.
 * <ul>
 *  <li> <i>Hint:</i> use with stop1ConstantForceMix to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @return value of suspensionForce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DRigidJointNode, $additionalInheritanceBaseType=)
	public float getSuspensionForce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>suspensionForce</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] suspensionForce describes how quickly the system resolves intersection errors due to floating-point inaccuracies.
 * <ul>
 *  <li> <i>Hint:</i> use with stop1ConstantForceMix to improve softness and numerical stability. </li> 
 *  <li> <i>Hint:</i>  0 means no stop adjustment, 1 means springier stop response. </li> 
 * </ul>
	 * @param newValue is new value for the suspensionForce field.
	 * @return {@link DoubleAxisHingeJoint} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DoubleAxisHingeJoint setSuspensionForce(float newValue);

}
