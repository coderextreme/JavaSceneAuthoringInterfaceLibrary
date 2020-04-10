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

package org.web3d.x3d.sai.Interpolation;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * PositionInterpolator2D generates a series of SFVec2f values.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DInterpolatorNode] PositionInterpolator2D generates a series of SFVec2f values. Authors can ROUTE value_changed output events to a SFVec2f attribute.
 * <ul>
 *  <li> <i>Hint:</i> typical input connection is ROUTE someTimeSensorDEF.fraction_changed TO thisInterpolatorDEF.set_fraction. </li> 
 *  <li> <i>Hint:</i> typical output connection is ROUTE thisInterpolatorDEF.value_changed TO someDestinationNodeDEF.set_someAttribute. </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Interpolation' level='3'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PositionInterpolator2D" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#PositionInterpolator2D" target="blank">X3D Abstract Specification: PositionInterpolator2D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PositionInterpolator2D" target="_blank">X3D Tooltips: PositionInterpolator2D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface PositionInterpolator2D extends X3DInterpolatorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>key</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Definition values for linear-interpolation function input intervals, listed in non-decreasing order and corresponding to a value in the keyValue array.
 * <ul>
 *  <li> <i>Hint:</i> number of keyValues must be an integer multiple of the number of keys! </li> 
 *  <li> <i>Hint:</i> keyValue/key integer multiple defines how many coordinates are sent in value_changed outputOnlys. </li> 
 *  <li> <i>Warning:</i> values in key array shall be monotonically non-decreasing, meaning that each value is greater than or equal to the preceding value. </li> 
 *  <li> <i>Hint:</i>  typical interval for values in key array is within range of 0 to 1, but larger intervals can be defined with arbitrary bounds. </li> 
 * </ul>
	 * @return value of key field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getKey();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>key</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Definition values for linear-interpolation function input intervals, listed in non-decreasing order and corresponding to a value in the keyValue array.
 * <ul>
 *  <li> <i>Hint:</i> number of keyValues must be an integer multiple of the number of keys! </li> 
 *  <li> <i>Hint:</i> keyValue/key integer multiple defines how many coordinates are sent in value_changed outputOnlys. </li> 
 *  <li> <i>Warning:</i> values in key array shall be monotonically non-decreasing, meaning that each value is greater than or equal to the preceding value. </li> 
 *  <li> <i>Hint:</i>  typical interval for values in key array is within range of 0 to 1, but larger intervals can be defined with arbitrary bounds. </li> 
 * </ul>
	 * @param newValue is new value for the key field.
	 * @return {@link PositionInterpolator2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PositionInterpolator2D setKey(float[] newValue);

	/**
	 * Provide array of 2-tuple float results from inputOutput MFVec2f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i>Hint:</i> identical adjacent entries in keyValue array have the effect of defining constant-value step functions. <a href="https://en.wikipedia.org/wiki/Step_function" target="_blank">https://en.wikipedia.org/wiki/Step_function</a> </li> 
 *  <li> <i>Hint:</i> number of keyValues must be an integer multiple of the number of keys! </li> 
 *  <li> <i>Hint:</i>  keyValue/key integer multiple defines how many coordinates are sent in value_changed outputOnlys. </li> 
 * </ul>
	 * @return value of keyValue field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public float[] getKeyValue();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput MFVec2f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i>Hint:</i> identical adjacent entries in keyValue array have the effect of defining constant-value step functions. <a href="https://en.wikipedia.org/wiki/Step_function" target="_blank">https://en.wikipedia.org/wiki/Step_function</a> </li> 
 *  <li> <i>Hint:</i> number of keyValues must be an integer multiple of the number of keys! </li> 
 *  <li> <i>Hint:</i>  keyValue/key integer multiple defines how many coordinates are sent in value_changed outputOnlys. </li> 
 * </ul>
	 * @param newValue is new value for the keyValue field.
	 * @return {@link PositionInterpolator2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PositionInterpolator2D setKeyValue(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PositionInterpolator2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PositionInterpolator2D setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 2-tuple float results from outputOnly SFVec2f field named <i>value_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Linearly interpolated output value determined by current key time and corresponding keyValue pair.
 * <ul>
 *  <li> <i>Hint:</i> X3D players might not send unchanging intermediate values, thus avoiding excessive superfluous events that have no effect. </li> 
 *  <li> <i>Hint:</i> keyValue/key integer multiple defines how many coordinates are sent in value_changed outputOnlys. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of value_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public float[] getValue();
}
