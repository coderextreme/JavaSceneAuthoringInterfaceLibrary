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

import org.web3d.x3d.sai.Core.X3DChildNode;
import org.web3d.x3d.sai.Grouping.X3DBoundedObject;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import java.util.Arrays;

/**
 * CollisionCollection holds a collection of objects that can be managed as a single entity for resolution of inter-object collisions.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DChildNode] CollisionCollection holds a collection of objects that can be managed as a single entity for resolution of inter-object collisions.
 * <ul>
 *  <li> <i> Hint:</i>  contains an array of CollisionSpace, CollidableShape or CollidableOffset nodes (containerField='collidables'). </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#CollisionCollection" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rigid_physics.html#CollisionCollection" target="blank">X3D Abstract Specification: CollisionCollection</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#CollisionCollection" target="_blank">X3D Tooltips: CollisionCollection</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface CollisionCollection extends X3DChildNode, X3DBoundedObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String enumeration results (baseType appliedParametersChoices) ['"BOUNCE"' | '"USER_FRICTION"' | '"FRICTION_COEFFICIENT-2"' | '"ERROR_REDUCTION"' | '"CONSTANT_FORCE"' | '"SPEED-1"' | '"SPEED-2"' | '"SLIP-1"' | '"SLIP-2"'] from inputOutput MFString field named <i>appliedParameters</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default global parameters for collision outputs of rigid body physics system. Contact node can override parent CollisionCollection node. Selectable values for array: "BOUNCE" "USER_FRICTION" "FRICTION_COEFFICIENT-2" "ERROR_REDUCTION" "CONSTANT_FORCE" "SPEED-1" "SPEED-2" "SLIP-1" "SLIP-2".
 * <ul>
 *  <li> <i> Hint:</i>  BOUNCE: bounce value is used; USER_FRICTION: apply user-supplied value; FRICTION_COEFFICIENT-2: apply frictionCoefficients values; ERROR_REDUCTION: apply softnessErrorCorrection value; CONSTANT_FORCE: apply softnessConstantForceMix value; SPEED-1: apply first component of surfaceSpeed array; SPEED-2: apply second component of surfaceSpeed array; SLIP-1: apply first component of slipFactors array; SLIP-2: apply second component of slipFactors array. </li> 
 * </ul>
	 * @return value of appliedParameters field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public String[] getAppliedParameters();

	/**
	 * Accessor method to assign String enumeration array (""BOUNCE"" | ""USER_FRICTION"" | ""FRICTION_COEFFICIENT-2"" | ""ERROR_REDUCTION"" | ""CONSTANT_FORCE"" | ""SPEED-1"" | ""SPEED-2"" | ""SLIP-1"" | ""SLIP-2"") to inputOutput MFString field named <i>appliedParameters</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Default global parameters for collision outputs of rigid body physics system. Contact node can override parent CollisionCollection node. Selectable values for array: "BOUNCE" "USER_FRICTION" "FRICTION_COEFFICIENT-2" "ERROR_REDUCTION" "CONSTANT_FORCE" "SPEED-1" "SPEED-2" "SLIP-1" "SLIP-2".
 * <ul>
 *  <li> <i> Hint:</i>  BOUNCE: bounce value is used; USER_FRICTION: apply user-supplied value; FRICTION_COEFFICIENT-2: apply frictionCoefficients values; ERROR_REDUCTION: apply softnessErrorCorrection value; CONSTANT_FORCE: apply softnessConstantForceMix value; SPEED-1: apply first component of surfaceSpeed array; SPEED-2: apply second component of surfaceSpeed array; SLIP-1: apply first component of slipFactors array; SLIP-2: apply second component of slipFactors array. </li> 
 * </ul>
	 * @param newValue is new value for the appliedParameters field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setAppliedParameters(String[] newValue);

	/**
	 * Provide array of 3-tuple float results from initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * @return value of bboxCenter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxCenter();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxCenter</i>.
	 * @param newValue is new value for the bboxCenter field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollection setBboxCenter(float[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of [0,infinity), or default value [-1 -1 -1], from initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * @return value of bboxSize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public float[] getBboxSize();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly SFVec3f field named <i>bboxSize</i>.
	 * @param newValue is new value for the bboxSize field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollection setBboxSize(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] bounce indicates bounciness (0 = no bounce at all, 1 = maximum bounce).  * <br>

	 * @return value of bounce field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getBounce();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>bounce</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] bounce indicates bounciness (0 = no bounce at all, 1 = maximum bounce).  * <br>

	 * @param newValue is new value for the bounce field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setBounce(float newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode, from inputOutput MFNode field <i>collidables</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionSpace|CollidableShape|CollidableOffset] CollisionCollection node holds a collection of objects in the collidables field that can be managed as a single entity for resolution of inter-object collisions with other groups of collidable objects. A group consists of both collidable objects as well as spaces that may be collided against each other.  * <br>

	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode
	 * @see org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode
	 * @return value of collidables field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public X3DNode[] getCollidables(); // acceptable node types #1: X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>collidables</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollisionSpaceNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.RigidBodyPhysics.X3DNBodyCollidableNode);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [CollisionSpace|CollidableShape|CollidableOffset] CollisionCollection node holds a collection of objects in the collidables field that can be managed as a single entity for resolution of inter-object collisions with other groups of collidable objects. A group consists of both collidable objects as well as spaces that may be collided against each other.  * <br>

	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @param newValue is new value for the collidables field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setCollidables(X3DNode[] newValue); // acceptable node types #2: X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode

	/**
	 * Add array of child collidables nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode.
	 * @param newValue is new value array to be appended the collidables field.
	 */
	public void addCollidables(X3DNode[] newValue); // acceptable node types #3: X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode
	/**
	 * Set single child collidables node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the collidables field
	 */
	public void setCollidables(X3DNode newValue); // acceptable node types #5: X3DNBodyCollisionSpaceNode|X3DNBodyCollidableNode
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setEnabled(boolean newValue);

	/**
	 * Provide array of 2-tuple float results within allowed range of [0,infinity) from inputOutput SFVec2f field named <i>frictionCoefficients</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  frictionCoefficients used for computing surface drag.  * <br>

	 * @return value of frictionCoefficients field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getFrictionCoefficients();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>frictionCoefficients</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  frictionCoefficients used for computing surface drag.  * <br>

	 * @param newValue is new value for the frictionCoefficients field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setFrictionCoefficients(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
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
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollection setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minBounceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) minBounceSpeed m/s needed to bounce.  * <br>

	 * @return value of minBounceSpeed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getMinBounceSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minBounceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) minBounceSpeed m/s needed to bounce.  * <br>

	 * @param newValue is new value for the minBounceSpeed field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setMinBounceSpeed(float newValue);

	/**
	 * Provide array of 2-tuple float results from inputOutput SFVec2f field named <i>slipFactors</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  slipFactors used for computing surface drag.  * <br>

	 * @return value of slipFactors field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getSlipFactors();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>slipFactors</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  slipFactors used for computing surface drag.  * <br>

	 * @param newValue is new value for the slipFactors field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setSlipFactors(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>softnessConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.  * <br>

	 * @return value of softnessConstantForceMix field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getSoftnessConstantForceMix();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>softnessConstantForceMix</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessConstantForceMix value applies a constant force value to make colliding surfaces appear to be somewhat soft.  * <br>

	 * @param newValue is new value for the softnessConstantForceMix field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setSoftnessConstantForceMix(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>softnessErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessErrorCorrection indicates fraction of collision error fixed in a set of evaluations (0 = no error correction, 1 = all errors corrected in single step).  * <br>

	 * @return value of softnessErrorCorrection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float getSoftnessErrorCorrection();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>softnessErrorCorrection</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] softnessErrorCorrection indicates fraction of collision error fixed in a set of evaluations (0 = no error correction, 1 = all errors corrected in single step).  * <br>

	 * @param newValue is new value for the softnessErrorCorrection field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setSoftnessErrorCorrection(float newValue);

	/**
	 * Provide array of 2-tuple float results from inputOutput SFVec2f field named <i>surfaceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  surfaceSpeed defines speed vectors for computing surface drag, if contact surfaces move independently of bodies.  * <br>

	 * @return value of surfaceSpeed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	public float[] getSurfaceSpeed();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput SFVec2f field named <i>surfaceSpeed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  surfaceSpeed defines speed vectors for computing surface drag, if contact surfaces move independently of bodies.  * <br>

	 * @param newValue is new value for the surfaceSpeed field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public CollisionCollection setSurfaceSpeed(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>visible</i>.
	 * @return value of visible field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=X3DBoundedObject)
	@Override
	public boolean getVisible();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>visible</i>.
	 * @param newValue is new value for the visible field.
	 * @return {@link CollisionCollection} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public CollisionCollection setVisible(boolean newValue);

}
