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

package org.web3d.x3d.sai.HAnim;

import org.web3d.x3d.sai.Core.X3DChildNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * An HAnimMotion node supports discrete frame-by-frame playback for H-Anim motion data animation.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  (X3D version 4.0 draft) [X3DChildNode] An HAnimMotion node supports discrete frame-by-frame playback for H-Anim motion data animation. Design characteristics include integration with HAnim figure data and HAnimJoint nodes, animation control, and playback of raw motion data.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#HAnimMotion" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/" target="blank">X3D Abstract Specification: HAnimMotion</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#HAnimMotion" target="_blank">X3D Tooltips: HAnimMotion</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface HAnimMotion extends X3DChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of String results from inputOutput MFString field named <i>channels</i>.
	 * <br><br>
	 * <i>Tooltip:</i> list of number of channels for transformation, followed by transformation type of each channel of data. Each value is space or comma separated.
 * <ul>
 *  <li> <i> Hint:</i>  channels are enabled by default, unless otherwise indicated by channelsEnabled field. </li> 
 * </ul>
	 * @return value of channels field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public String[] getChannels();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>channels</i>.
	 * <br><br>
	 * <i>Tooltip:</i> list of number of channels for transformation, followed by transformation type of each channel of data. Each value is space or comma separated.
 * <ul>
 *  <li> <i> Hint:</i>  channels are enabled by default, unless otherwise indicated by channelsEnabled field. </li> 
 * </ul>
	 * @param newValue is new value for the channels field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setChannels(String[] newValue);

	/**
	 * Provide array of boolean results from inputOutput MFBool field named <i>channelsEnabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  boolean values for each channels indicating whether enabled.  * <br>

	 * @return value of channelsEnabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public boolean[] getChannelsEnabled();

	/**
	 * Accessor method to assign boolean array to inputOutput MFBool field named <i>channelsEnabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  boolean values for each channels indicating whether enabled.  * <br>

	 * @param newValue is new value for the channelsEnabled field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setChannelsEnabled(boolean[] newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>cycleTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> cycleTime sends a time event at initial starting time and at beginning of each new cycle.
 * <ul>
 *  <li> <i>Hint:</i> this event is useful for synchronization with other time-based animation objects. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of cycleTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double getCycleTime();
	/**
	 * Provide String value from inputOutput SFString field named <i>description</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Author-provided text tooltip that tells users the expected action of this node.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @return value of description field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public String getDescription();

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>description</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Author-provided text tooltip that tells users the expected action of this node.
 * <ul>
 *  <li> <i> Hint:</i>  many XML tools substitute XML character references for special characters automatically if needed within an attribute value (such as &amp;#38; for &amp; ampersand character, or &amp;#34; for " quotation-mark character). </li> 
 * </ul>
	 * @param newValue is new value for the description field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setDescription(String newValue);

	/**
	 * Provide double value in seconds within allowed range of [0,infinity) from outputOnly SFTime field named <i>elapsedTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) elapsedTime is computed elapsed time since the Motion object was activated and running, counting all traversed frames (as if frameIndex equaled 1) and multiplied by frameDuration, cumulative in seconds.
 * <ul>
 *  <li> <i>Warning:</i> it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 *  <li> <i>Hint:</i>  elapsedTime is a nonnegative SFTime duration interval, not an absolute clock time. </li> 
 * </ul>
	 * @return value of elapsedTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double getElapsedTime();
	/**
	 * Provide boolean value from inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @return value of enabled field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public boolean getEnabled();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>enabled</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables node operation.  * <br>

	 * @param newValue is new value for the enabled field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setEnabled(boolean newValue);

	/**
	 * Provide int value within allowed range of [-1,infinity) from inputOutput SFInt32 field named <i>endFrame</i>.
	 * @return value of endFrame field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getEndFrame();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>endFrame</i>.
	 * @param newValue is new value for the endFrame field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setEndFrame(int newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from outputOnly SFInt32 field named <i>frameCount</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameCount indicates the number of frames present in the animation, equaling the number of sets of channel data present in the values array.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of frameCount field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getFrameCount();
	/**
	 * Provide double value in seconds within allowed range of (0,infinity) from inputOutput SFTime field named <i>frameDuration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) frameDuration specifies the duration of each frame in seconds.  * <br>

	 * @return value of frameDuration field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double getFrameDuration();

	/**
	 * Accessor method to assign double value in seconds to inputOutput SFTime field named <i>frameDuration</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  (0,+infinity) frameDuration specifies the duration of each frame in seconds.  * <br>

	 * @param newValue is new value for the frameDuration field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setFrameDuration(double newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>frameIncrement</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-infinity,+infinity) frameIncrement field controls whether playback direction is forwards or backwards, and also whether frames are skipped (e.g. subsampled replay). For a single animation step, the next frameIndex value equals (frameIndex + frameIncrement) modulo frameCount.
 * <ul>
 *  <li> <i> Hint:</i>  note that setting frameIncrement to 0 prevents automatic advancement of frameIndex and pauses animation of HAnimMotion node. </li> 
 * </ul>
	 * @return value of frameIncrement field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getFrameIncrement();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>frameIncrement</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-infinity,+infinity) frameIncrement field controls whether playback direction is forwards or backwards, and also whether frames are skipped (e.g. subsampled replay). For a single animation step, the next frameIndex value equals (frameIndex + frameIncrement) modulo frameCount.
 * <ul>
 *  <li> <i> Hint:</i>  note that setting frameIncrement to 0 prevents automatic advancement of frameIndex and pauses animation of HAnimMotion node. </li> 
 * </ul>
	 * @param newValue is new value for the frameIncrement field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setFrameIncrement(int newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>frameIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameIndex indicates index of current frame. Note that frameIndex can be modified whether the Motion node is enabled or not, and becomes effective when the next animation cycle occurs. Thus the frameIndex value indicates the frame currently (or next) being processed.
 * <ul>
 *  <li> <i> Hint:</i>  frameIndex starts at 0 and is no greater than (frameCount - 1). Values less than 0 are reset as 0. Values greater or equal to frameCount are stored as (frameCount - 1). Thus the value of frameIndex shall be greater than or equal to zero, and less than frameCount. </li> 
 * </ul>
	 * @return value of frameIndex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getFrameIndex();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>frameIndex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) frameIndex indicates index of current frame. Note that frameIndex can be modified whether the Motion node is enabled or not, and becomes effective when the next animation cycle occurs. Thus the frameIndex value indicates the frame currently (or next) being processed.
 * <ul>
 *  <li> <i> Hint:</i>  frameIndex starts at 0 and is no greater than (frameCount - 1). Values less than 0 are reset as 0. Values greater or equal to frameCount are stored as (frameCount - 1). Thus the value of frameIndex shall be greater than or equal to zero, and less than frameCount. </li> 
 * </ul>
	 * @param newValue is new value for the frameIndex field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setFrameIndex(int newValue);

	/**
	 * Provide array of String results from inputOutput MFString field named <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> joints field lists names of joints that raw motion data is to be applied to. The number and order of the names in the joints field shall match the number and order of the channels field information, and the number and order of the sets of values in the values field for each frame of the animation.
 * <ul>
 *  <li> <i>Hint:</i> values are space or comma separated. </li> 
 *  <li> <i>Hint:</i>  The joint name IGNORED shall be used for channel of motion data that is not used for any joint. </li> 
 * </ul>
	 * @return value of joints field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public String[] getJoints();

	/**
	 * Accessor method to assign String array to inputOutput MFString field named <i>joints</i>.
	 * <br><br>
	 * <i>Tooltip:</i> joints field lists names of joints that raw motion data is to be applied to. The number and order of the names in the joints field shall match the number and order of the channels field information, and the number and order of the sets of values in the values field for each frame of the animation.
 * <ul>
 *  <li> <i>Hint:</i> values are space or comma separated. </li> 
 *  <li> <i>Hint:</i>  The joint name IGNORED shall be used for channel of motion data that is not used for any joint. </li> 
 * </ul>
	 * @param newValue is new value for the joints field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setJoints(String[] newValue);

	/**
	 * Provide int value within allowed range of [-1,4] from inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @return value of loa field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getLoa();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>loa</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [-1,4] Level Of Articulation 0..4 indicates complexity and detail of joints for given humanoid skeletal hierarchy.
 * <ul>
 *  <li> <i>Hint:</i> loa value of -1 indicates that no LOA conformance is provided. </li> 
 *  <li> <i>Hint:</i>  Humanoid Animation (HAnim) Specification, Part 1 Architecture, 4.8.4 Levels of articulation, <a href="https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation" target="_blank">https://www.web3d.org/documents/specifications/19774-1/V2.0/HAnim/concepts.html#LevelsOfArticulation</a> </li> 
 * </ul>
	 * @param newValue is new value for the loa field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setLoa(int newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @return value of loop field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public boolean getLoop();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>loop</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Repeat indefinitely when loop=true, repeat only once when loop=false.  * <br>

	 * @param newValue is new value for the loop field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setLoop(boolean newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public HAnimMotion setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value within allowed range of [0,infinity) from inputOutput SFInt32 field named <i>startFrame</i>.
	 * @return value of startFrame field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getStartFrame();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>startFrame</i>.
	 * @param newValue is new value for the startFrame field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setStartFrame(int newValue);

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>values</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  values field contains all transformation values, ordered first by frame, then by joint, and then by transformation Sets of floats in the values array matching the order listed in joints and channels fields.  * <br>

	 * @return value of values field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public float[] getValues();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>values</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  values field contains all transformation values, ordered first by frame, then by joint, and then by transformation Sets of floats in the values array matching the order listed in joints and channels fields.  * <br>

	 * @param newValue is new value for the values field.
	 * @return {@link HAnimMotion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public HAnimMotion setValues(float[] newValue);

}
