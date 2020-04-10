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

package org.web3d.x3d.sai.Shape;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * PointProperties allows precise fine-grained control over the rendering style of PointSet node points inside the same Shape.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 4.0 draft) [X3DAppearanceChildNode] PointProperties allows precise fine-grained control over the rendering style of PointSet node points inside the same Shape.
 * <ul>
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Hint:</i> When an X3DTextureNode is defined in the same Appearance instance as PointProperties node, the points of a PointSet shall be displayed as point sprites using the given texture(s). </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Shape' level='5'/&amp;gt; </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#PointProperties" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html" target="blank">X3D Abstract Specification: PointProperties</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#PointProperties" target="_blank">X3D Tooltips: PointProperties</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface PointProperties extends X3DAppearanceChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide String enumeration value using RGB values [0..1] from inputOutput SFString field named <i>colorMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> colorMode has blending effect on the rendering of point sprites, applying supplied color (Color node or Material emissiveColor) and texture color.
 * <ul>
 *  <li> <i>Hint:</i> POINT_COLOR shall display the RGB channels of the color instance defined in X3DMaterialNode or X3DColorNode, and the A channel of the texture if any. If no color is associated to the point, the default RGB color (0, 0, 0) shall be used. </li> 
 *  <li> <i>Hint:</i> TEXTURE_COLOR shall display the original texture with its RGBA channels and regardless to the X3DMaterialNode or X3DColorNode which might be associated to the point set. </li> 
 *  <li> <i>Hint:</i>  TEXTURE_AND_POINT_COLOR shall display the RGBA channels of a texture added to the RGB channels of the color defined in X3DMaterialNode or X3DColorNode node, and the A channel of the texture if any. If no color is associated to the point, the result shall be exactly the same as TEXTURE_COLOR. </li> 
 * </ul>
	 * @return value of colorMode field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public String getColorMode();

	/**
	 * Accessor method to assign String enumeration value ("POINT_COLOR" | "TEXTURE_COLOR" | "TEXTURE_AND_POINT_COLOR") to inputOutput SFString field named <i>colorMode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> colorMode has blending effect on the rendering of point sprites, applying supplied color (Color node or Material emissiveColor) and texture color.
 * <ul>
 *  <li> <i>Hint:</i> POINT_COLOR shall display the RGB channels of the color instance defined in X3DMaterialNode or X3DColorNode, and the A channel of the texture if any. If no color is associated to the point, the default RGB color (0, 0, 0) shall be used. </li> 
 *  <li> <i>Hint:</i> TEXTURE_COLOR shall display the original texture with its RGBA channels and regardless to the X3DMaterialNode or X3DColorNode which might be associated to the point set. </li> 
 *  <li> <i>Hint:</i>  TEXTURE_AND_POINT_COLOR shall display the RGBA channels of a texture added to the RGB channels of the color defined in X3DMaterialNode or X3DColorNode node, and the A channel of the texture if any. If no color is associated to the point, the result shall be exactly the same as TEXTURE_COLOR. </li> 
 * </ul>
	 * @param newValue is new value for the colorMode field.
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointProperties setColorMode(String newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
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
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public PointProperties setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>pointSizeAttenuation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeAttenuation array values [a, b, c] are set to default values if undefined. Together these parameters define attenuation factor 1/(a + b×r + c×r^2) where r is the distance from observer position (current viewpoint) to each point.
 * <ul>
 *  <li> <i> Hint:</i>  nominal point size is multiplied by attenuation factor and then clipped to aminimum value of pointSizeMinValue × minimum renderable point size, then clipped to maximum size of pointSizeMaxValue × minimum renderable point size. </li> 
 * </ul>
	 * @return value of pointSizeAttenuation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public float[] getPointSizeAttenuation();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>pointSizeAttenuation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeAttenuation array values [a, b, c] are set to default values if undefined. Together these parameters define attenuation factor 1/(a + b×r + c×r^2) where r is the distance from observer position (current viewpoint) to each point.
 * <ul>
 *  <li> <i> Hint:</i>  nominal point size is multiplied by attenuation factor and then clipped to aminimum value of pointSizeMinValue × minimum renderable point size, then clipped to maximum size of pointSizeMaxValue × minimum renderable point size. </li> 
 * </ul>
	 * @param newValue is new value for the pointSizeAttenuation field.
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointProperties setPointSizeAttenuation(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>pointSizeMaxValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeMaxValue is maximum allowed scaling factor on nominal browser point scaling.
 * <ul>
 *  <li> <i> Warning:</i>  maintain pointSizeMinValue &amp;lt;= pointSizeMaxValue. </li> 
 * </ul>
	 * @return value of pointSizeMaxValue field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public float getPointSizeMaxValue();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>pointSizeMaxValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeMaxValue is maximum allowed scaling factor on nominal browser point scaling.
 * <ul>
 *  <li> <i> Warning:</i>  maintain pointSizeMinValue &amp;lt;= pointSizeMaxValue. </li> 
 * </ul>
	 * @param newValue is new value for the pointSizeMaxValue field.
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointProperties setPointSizeMaxValue(float newValue);

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>pointSizeMinValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeMinValue is minimum allowed scaling factor on nominal browser point scaling.
 * <ul>
 *  <li> <i> Warning:</i>  maintain pointSizeMinValue &amp;lt;= pointSizeMaxValue. </li> 
 * </ul>
	 * @return value of pointSizeMinValue field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public float getPointSizeMinValue();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>pointSizeMinValue</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) pointSizeMinValue is minimum allowed scaling factor on nominal browser point scaling.
 * <ul>
 *  <li> <i> Warning:</i>  maintain pointSizeMinValue &amp;lt;= pointSizeMaxValue. </li> 
 * </ul>
	 * @param newValue is new value for the pointSizeMinValue field.
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointProperties setPointSizeMinValue(float newValue);

	/**
	 * Provide float value within allowed range of [1,infinity) from inputOutput SFFloat field named <i>pointSizeScaleFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,+infinity) Nominal rendered point size is a browser-dependent minimum renderable point size, which is then multiplied by an additional pointSizeScaleFactor (which is greater than or equal to 1).
 * <ul>
 *  <li> <i> Hint:</i>  additional sizing modifications are determined by pointSizeMinValue, pointSizeMaxValue, and pointSizeAttenuation array. </li> 
 * </ul>
	 * @return value of pointSizeScaleFactor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DAppearanceChildNode, $additionalInheritanceBaseType=)
	public float getPointSizeScaleFactor();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>pointSizeScaleFactor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [1,+infinity) Nominal rendered point size is a browser-dependent minimum renderable point size, which is then multiplied by an additional pointSizeScaleFactor (which is greater than or equal to 1).
 * <ul>
 *  <li> <i> Hint:</i>  additional sizing modifications are determined by pointSizeMinValue, pointSizeMaxValue, and pointSizeAttenuation array. </li> 
 * </ul>
	 * @param newValue is new value for the pointSizeScaleFactor field.
	 * @return {@link PointProperties} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public PointProperties setPointSizeScaleFactor(float newValue);

}
