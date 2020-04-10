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

package org.web3d.x3d.sai.ParticleSystems;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * WindPhysicsModel applies a wind effect to the particles.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  (X3D version 3.2 or later) [X3DParticlePhysicsModelNode] WindPhysicsModel applies a wind effect to the particles. The wind includes a random variation factor to model gustiness.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#WindPhysicsModel" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html#WindPhysicsModel" target="blank">X3D Abstract Specification: WindPhysicsModel</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#WindPhysicsModel" target="_blank">X3D Tooltips: WindPhysicsModel</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface WindPhysicsModel extends X3DParticlePhysicsModelNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction in which wind is travelling in the form of a normalized, unit vector.  * <br>

	 * @return value of direction field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
	public float[] getDirection();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction in which wind is travelling in the form of a normalized, unit vector.  * <br>

	 * @param newValue is new value for the direction field.
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public WindPhysicsModel setDirection(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public WindPhysicsModel setEnabled(boolean newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>gustiness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) gustiness specifies how much wind speed varies from the average speed.
 * <ul>
 *  <li> <i> Hint:</i>  wind speed variation is calculated once per frame and applied equally to all particles. </li> 
 * </ul>
	 * @return value of gustiness field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
	public float getGustiness();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>gustiness</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) gustiness specifies how much wind speed varies from the average speed.
 * <ul>
 *  <li> <i> Hint:</i>  wind speed variation is calculated once per frame and applied equally to all particles. </li> 
 * </ul>
	 * @param newValue is new value for the gustiness field.
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public WindPhysicsModel setGustiness(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
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
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public WindPhysicsModel setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Initial linear speed (default is m/s) imparted to all particles along their direction of movement.  * <br>

	 * @return value of speed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
	public float getSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Initial linear speed (default is m/s) imparted to all particles along their direction of movement.  * <br>

	 * @param newValue is new value for the speed field.
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public WindPhysicsModel setSpeed(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>turbulence</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] turbulence field specifies how much the wind acts directly in line with the direction, and how much variation is applied in directions other than the wind direction.
 * <ul>
 *  <li> <i> Hint:</i>  this is determined per-particle to model how each is effected by turbulence. </li> 
 * </ul>
	 * @return value of turbulence field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticlePhysicsModelNode, $additionalInheritanceBaseType=)
	public float getTurbulence();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>turbulence</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] turbulence field specifies how much the wind acts directly in line with the direction, and how much variation is applied in directions other than the wind direction.
 * <ul>
 *  <li> <i> Hint:</i>  this is determined per-particle to model how each is effected by turbulence. </li> 
 * </ul>
	 * @param newValue is new value for the turbulence field.
	 * @return {@link WindPhysicsModel} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public WindPhysicsModel setTurbulence(float newValue);

}
