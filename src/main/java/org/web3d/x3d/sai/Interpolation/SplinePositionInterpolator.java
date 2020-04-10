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
 * SplinePositionInterpolator performs non-linear interpolation among paired lists of 3-tuple values and velocities to produce an SFVec3f value_changed output event.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DInterpolatorNode] SplinePositionInterpolator performs non-linear interpolation among paired lists of 3-tuple values and velocities to produce an SFVec3f value_changed output event.
 * <ul>
 *  <li> <i>Hint:</i> typical input connection is ROUTE someTimeSensorDEF.fraction_changed TO thisInterpolatorDEF.set_fraction </li> 
 *  <li> <i>Hint:</i> typical output connection is ROUTE thisInterpolatorDEF.value_changed TO someDestinationNodeDEF.set_someAttribute. </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Interpolation' level='4'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#SplinePositionInterpolator" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#SplinePositionInterpolator" target="blank">X3D Abstract Specification: SplinePositionInterpolator</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SplinePositionInterpolator" target="_blank">X3D Tooltips: SplinePositionInterpolator</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface SplinePositionInterpolator extends X3DInterpolatorNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether or not the curve is closed (i.e. matching end values), with continuous velocity vectors as the interpolator transitions from the last key to the first key.
 * <ul>
 *  <li> <i>Warning:</i> if velocity vectors at first and last keys are specified, the closed field is ignored. </li> 
 *  <li> <i>Warning:</i>  if keyValues at first and last key are not identical, the closed field is ignored. </li> 
 * </ul>
	 * @return value of closed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public boolean getClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether or not the curve is closed (i.e. matching end values), with continuous velocity vectors as the interpolator transitions from the last key to the first key.
 * <ul>
 *  <li> <i>Warning:</i> if velocity vectors at first and last keys are specified, the closed field is ignored. </li> 
 *  <li> <i>Warning:</i>  if keyValues at first and last key are not identical, the closed field is ignored. </li> 
 * </ul>
	 * @param newValue is new value for the closed field.
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator setClosed(boolean newValue);

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>key</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Definition parameters for nonlinear-interpolation function time intervals, listed in non-decreasing order and corresponding to keyValue, keyVelocity array values.
 * <ul>
 *  <li> <i>Warning:</i> number of keys must match number of keyValues! </li> 
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
	 * <i>Tooltip:</i> Definition parameters for nonlinear-interpolation function time intervals, listed in non-decreasing order and corresponding to keyValue, keyVelocity array values.
 * <ul>
 *  <li> <i>Warning:</i> number of keys must match number of keyValues! </li> 
 *  <li> <i>Warning:</i> values in key array shall be monotonically non-decreasing, meaning that each value is greater than or equal to the preceding value. </li> 
 *  <li> <i>Hint:</i>  typical interval for values in key array is within range of 0 to 1, but larger intervals can be defined with arbitrary bounds. </li> 
 * </ul>
	 * @param newValue is new value for the key field.
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator setKey(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyValues!. </li> 
 * </ul>
	 * @return value of keyValue field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public float[] getKeyValue();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>keyValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyValues!. </li> 
 * </ul>
	 * @param newValue is new value for the keyValue field.
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator setKeyValue(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput MFVec3f field named <i>keyVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyVelocity values!. </li> 
 * </ul>
	 * @return value of keyVelocity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public float[] getKeyVelocity();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput MFVec3f field named <i>keyVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for nonlinear interpolation, each corresponding to an input-fraction value in the key array.
 * <ul>
 *  <li> <i> Warning:</i>  number of keys must match number of keyVelocity values!. </li> 
 * </ul>
	 * @param newValue is new value for the keyVelocity field.
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator setKeyVelocity(float[] newValue);

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
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public SplinePositionInterpolator setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>normalizeVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> normalizeVelocity field specifies whether the velocity vectors are normalized to produce smooth speed transitions, or transformed into tangency vectors.
 * <ul>
 *  <li> <i> Hint:</i>  X3D 19.2.3 Non-linear interpolation <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation</a> </li> 
 * </ul>
	 * @return value of normalizeVelocity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public boolean getNormalizeVelocity();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>normalizeVelocity</i>.
	 * <br><br>
	 * <i>Tooltip:</i> normalizeVelocity field specifies whether the velocity vectors are normalized to produce smooth speed transitions, or transformed into tangency vectors.
 * <ul>
 *  <li> <i> Hint:</i>  X3D 19.2.3 Non-linear interpolation <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/interp.html#NonlinearInterpolation</a> </li> 
 * </ul>
	 * @param newValue is new value for the normalizeVelocity field.
	 * @return {@link SplinePositionInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SplinePositionInterpolator setNormalizeVelocity(boolean newValue);

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>value_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Nonlinearly interpolated output value computed by using current time fraction along with corresponding key, keyValue and keyVelocity values.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of value_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DInterpolatorNode, $additionalInheritanceBaseType=)
	public float[] getValue();
}
