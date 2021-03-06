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
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * VolumeEmitter emits particles from a random position confined within the given closed geometry volume.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DParticleEmitterNode] VolumeEmitter emits particles from a random position confined within the given closed geometry volume.
 * <ul>
 *  <li> <i> Hint:</i>  otherwise, a VolumeEmitter node acts like a PolylineEmitter node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#VolumeEmitter" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/particle_systems.html#VolumeEmitter" target="blank">X3D Abstract Specification: VolumeEmitter</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#VolumeEmitter" target="_blank">X3D Tooltips: VolumeEmitter</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Volume" target="_blank">X3D Scene Authoring Hints: Volume</a>
    */
public interface VolumeEmitter extends X3DParticleEmitterNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Coordinates for the geometry used as the emitting volume.  * <br>

	 * @return value of coord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getCoord(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>coord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Coordinates for the geometry used as the emitting volume.  * <br>

	 * @param newValue is new value for the coord field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public VolumeEmitter setCoord(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide array of int results within allowed range of [-1,infinity) from initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices are applied to contained Coordinate values in order to define randomly generated initial geometry of the particles.
 * <ul>
 *  <li> <i> Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @return value of coordIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	public int[] getCoordIndex();

	/**
	 * Accessor method to assign int array to initializeOnly MFInt32 field named <i>coordIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,+infinity) coordIndex indices are applied to contained Coordinate values in order to define randomly generated initial geometry of the particles.
 * <ul>
 *  <li> <i> Warning:</i>  coordIndex is required in order to connect contained coordinate point values. </li> 
 * </ul>
	 * @param newValue is new value for the coordIndex field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public VolumeEmitter setCoordIndex(int[] newValue);

	/**
	 * Provide array of 3-tuple float results within allowed range of [-1,1] from inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial direction from which particles emanate.  * <br>

	 * @return value of direction field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	public float[] getDirection();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Initial direction from which particles emanate.  * <br>

	 * @param newValue is new value for the direction field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public VolumeEmitter setDirection(float[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>internal</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  TODO, X3D specification is undefined.  * <br>

	 * @return value of internal field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	public boolean getInternal();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>internal</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  TODO, X3D specification is undefined.  * <br>

	 * @param newValue is new value for the internal field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public VolumeEmitter setInternal(boolean newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Basic mass of each particle, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> mass is needed if gravity or other force-related calculations are performed on a per-particle basis. </li> 
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @return value of mass field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	@Override
	public float getMass();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>mass</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Basic mass of each particle, defined in mass base units (default is kilograms).
 * <ul>
 *  <li> <i>Hint:</i> mass is needed if gravity or other force-related calculations are performed on a per-particle basis. </li> 
 *  <li> <i>Hint:</i> <a href="https://en.wikipedia.org/wiki/Kilogram" target="_blank">https://en.wikipedia.org/wiki/Kilogram</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 4.3.6 Standard units and coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#Standardunitscoordinates</a> </li> 
 * </ul>
	 * @param newValue is new value for the mass field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumeEmitter setMass(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
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
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumeEmitter setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Initial linear speed (default is m/s) imparted to all particles along their direction of movement.  * <br>

	 * @return value of speed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	@Override
	public float getSpeed();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>speed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,+infinity) Initial linear speed (default is m/s) imparted to all particles along their direction of movement.  * <br>

	 * @param newValue is new value for the speed field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumeEmitter setSpeed(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>surfaceArea</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Particle surface area in area base units (default is meters squared). Surface area is used for calculations such as wind effects per particle.
 * <ul>
 *  <li> <i>Hint:</i> surfaceArea value represents average frontal area presented to the wind. </li> 
 *  <li> <i>Hint:</i>  assumes spherical model for each particle (i.e., surface area is the same regardless of direction). </li> 
 * </ul>
	 * @return value of surfaceArea field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	@Override
	public float getSurfaceArea();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>surfaceArea</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Particle surface area in area base units (default is meters squared). Surface area is used for calculations such as wind effects per particle.
 * <ul>
 *  <li> <i>Hint:</i> surfaceArea value represents average frontal area presented to the wind. </li> 
 *  <li> <i>Hint:</i>  assumes spherical model for each particle (i.e., surface area is the same regardless of direction). </li> 
 * </ul>
	 * @param newValue is new value for the surfaceArea field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumeEmitter setSurfaceArea(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>variation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Multiplier for the randomness used to control the range of possible output values. The bigger the value, the more random the output and the bigger the range of possible initial values possible.
 * <ul>
 *  <li> <i> Hint:</i>  variation of zero does not allow any randomness. </li> 
 * </ul>
	 * @return value of variation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParticleEmitterNode, $additionalInheritanceBaseType=)
	@Override
	public float getVariation();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>variation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) Multiplier for the randomness used to control the range of possible output values. The bigger the value, the more random the output and the bigger the range of possible initial values possible.
 * <ul>
 *  <li> <i> Hint:</i>  variation of zero does not allow any randomness. </li> 
 * </ul>
	 * @param newValue is new value for the variation field.
	 * @return {@link VolumeEmitter} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public VolumeEmitter setVariation(float newValue);

}
