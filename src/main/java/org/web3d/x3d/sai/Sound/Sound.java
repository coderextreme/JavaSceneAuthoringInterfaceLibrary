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

package org.web3d.x3d.sai.Sound;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Sound.*;

/**
 * The Sound node controls the 3D spatialization of sound playback by a child AudioClip or MovieTexture node.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DSoundNode] The Sound node controls the 3D spatialization of sound playback by a child AudioClip or MovieTexture node. Sound intensity includes stereo support, varying according to user location and view direction in the scene.
 * <ul>
 *  <li> <i>Hint:</i> if the audio source is stereo or multi-channel, channel separation is retained during playback. </li> 
 *  <li> <i>Warning:</i> while providing sounds on the ground plane, ensure that the audible auralization ellipse is sufficiently elevated to match avatar height. </li> 
 *  <li> <i>Hint:</i> X3D Sound component Figure 16.2 Sound Node Geometry, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#f-Soundnodegeometry" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#f-Soundnodegeometry</a> </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints:Audio <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Sound" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/sound.html#Sound" target="blank">X3D Abstract Specification: Sound</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Sound" target="_blank">X3D Tooltips: Sound</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Audio" target="_blank">X3D Scene Authoring Hints: Audio</a>
    */
public interface Sound extends X3DSoundNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction of sound axis, relative to local coordinate system.  * <br>

	 * @return value of direction field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float[] getDirection();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  direction of sound axis, relative to local coordinate system.  * <br>

	 * @param newValue is new value for the direction field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setDirection(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Factor [0,1] adjusting loudness (decibels) of emitted sound.  * <br>

	 * @return value of intensity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getIntensity();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Factor [0,1] adjusting loudness (decibels) of emitted sound.  * <br>

	 * @param newValue is new value for the intensity field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setIntensity(float newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>location</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of sound ellipsoid center, relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  improve audibility by setting location='0 1.6 0' so that center height of sound ellipsoid matches typical NavigationInfo avatarSize height. </li> 
 * </ul>
	 * @return value of location field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float[] getLocation();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>location</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Position of sound ellipsoid center, relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  improve audibility by setting location='0 1.6 0' so that center height of sound ellipsoid matches typical NavigationInfo avatarSize height. </li> 
 * </ul>
	 * @param newValue is new value for the location field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setLocation(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>maxBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @return value of maxBack field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getMaxBack();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @param newValue is new value for the maxBack field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setMaxBack(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>maxFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @return value of maxFront field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getMaxFront();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>maxFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Outer (zero loudness)ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @param newValue is new value for the maxFront field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setMaxFront(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Sound setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @return value of minBack field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getMinBack();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minBack</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along back direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minBack &amp;lt;= maxBack. </li> 
 * </ul>
	 * @param newValue is new value for the minBack field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setMinBack(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>minFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @return value of minFront field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getMinFront();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>minFront</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Inner (full loudness) ellipsoid distance along front direction.
 * <ul>
 *  <li> <i> Warning:</i>  ensure minFront &amp;lt;= maxFront. </li> 
 * </ul>
	 * @param newValue is new value for the minFront field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setMinFront(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>priority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Player hint [0,1] if needed to choose which sounds to play.  * <br>

	 * @return value of priority field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public float getPriority();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>priority</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Player hint [0,1] if needed to choose which sounds to play.  * <br>

	 * @param newValue is new value for the priority field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setPriority(float newValue);

	/**
	 * Provide X3DSoundSourceNode instance (using a properly typed node) from inputOutput SFNode field <i>source</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DSoundSourceNode] sound source for the Sound node, either an AudioClip node or a MovieTexture node.
 * <ul>
 *  <li> <i> Warning:</i>  if source field is not specified, the Sound node does not emit audio. </li> 
 * </ul>
	 * @return value of source field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public X3DSoundSourceNode getSource(); // acceptable node types #1: X3DSoundSourceNode

	/**
	 * Accessor method to assign X3DSoundSourceNode instance (using a properly typed node) to inputOutput SFNode field <i>source</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DSoundSourceNode] sound source for the Sound node, either an AudioClip node or a MovieTexture node.
 * <ul>
 *  <li> <i> Warning:</i>  if source field is not specified, the Sound node does not emit audio. </li> 
 * </ul>
	 * @param newValue is new value for the source field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setSource(X3DSoundSourceNode newValue); // acceptable node types #2: X3DSoundSourceNode

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>spatialize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to spatialize sound playback relative to viewer.
 * <ul>
 *  <li> <i> Hint:</i>  only effective between minimum and maximum ellipsoids. </li> 
 * </ul>
	 * @return value of spatialize field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DSoundNode, $additionalInheritanceBaseType=)
	public boolean getSpatialize();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>spatialize</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to spatialize sound playback relative to viewer.
 * <ul>
 *  <li> <i> Hint:</i>  only effective between minimum and maximum ellipsoids. </li> 
 * </ul>
	 * @param newValue is new value for the spatialize field.
	 * @return {@link Sound} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Sound setSpatialize(boolean newValue);

}
