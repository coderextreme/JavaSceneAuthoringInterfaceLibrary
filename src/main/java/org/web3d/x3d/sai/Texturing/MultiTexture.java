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

package org.web3d.x3d.sai.Texturing;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Texturing.*;
import java.util.Arrays;

/**
 * MultiTexture applies several individual textures to a single geometry node, enabling a variety of visual effects that include light mapping and environment mapping.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DTextureNode] MultiTexture applies several individual textures to a single geometry node, enabling a variety of visual effects that include light mapping and environment mapping. MultiTexture can contain zero or more ImageTexture, MovieTexture and PixelTexture nodes. Texture maps have a 2D coordinate system (s, t) horizontal and vertical, with (s, t) texture-coordinate values in range [0.0, 1.0] for opposite corners of the image.
 * <ul>
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding texture. </li> 
 *  <li> <i>Hint:</i> Texture mapping <a href="https://en.wikipedia.org/wiki/Texture_mapping" target="_blank">https://en.wikipedia.org/wiki/Texture_mapping</a> </li> 
 *  <li> <i>Warning:</i> the number of textures to be blended may have a significant impact on performance, depending on available graphics hardware capabilities. </li> 
 *  <li> <i>Hint:</i> multitexturing is accomplished using MultiTexture, MultiTextureCoordinate and MultiTextureTransform nodes. </li> 
 *  <li> <i>Hint:</i> X3D Texturing component Figure 18.2 Lightmap example, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-Lightmapexample" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-Lightmapexample</a> </li> 
 *  <li> <i>Hint:</i> X3D Texturing component Table 18.2: Comparison of single texture and multitexture attributes, <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-SingleAndMultitextureAttrs" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-SingleAndMultitextureAttrs</a> </li> 
 *  <li> <i>Hint:</i> MultiTexture does not need to be included in LoadSensor watchList since any child ImageTexture and MovieTexture nodes of interest can be handled separately. </li> 
 *  <li> <i>Warning:</i>  MultiTexture may not contain another MultiTexture node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#MultiTexture" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#MultiTexture" target="blank">X3D Abstract Specification: MultiTexture</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MultiTexture" target="_blank">X3D Tooltips: MultiTexture</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface MultiTexture extends X3DTextureNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>alpha</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] The alpha field defines the alpha (1-transparency) base value for mode operations.  * <br>

	 * @return value of alpha field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public float getAlpha();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>alpha</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] The alpha field defines the alpha (1-transparency) base value for mode operations.  * <br>

	 * @param newValue is new value for the alpha field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setAlpha(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] The color field defines the RGB base values for mode operations.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public float[] getColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] The color field defines the RGB base values for mode operations.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the color field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setColor(float[] newValue);

	/**
	 * Provide array of String enumeration results (baseType multiTextureFunctionValues) ['"COMPLEMENT"' | '"ALPHAREPLICATE"' | '""' | '"etc."'] from inputOutput MFString field named <i>function</i>.
	 * <br><br>
	 * <i>Tooltip:</i> function operators COMPLEMENT or ALPHAREPLICATE can be applied after the mode blending operation. Empty string value "" indicates that no function operation is applied for that stage.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of function values as textures, otherwise the default of no function operation is applied for each remaining stage. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.5 Values for the function field <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForFunctionField" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForFunctionField</a> for further details. </li> 
 * </ul>
	 * @return value of function field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public String[] getFunction();

	/**
	 * Accessor method to assign String enumeration array (""COMPLEMENT"" | ""ALPHAREPLICATE"" | """") to inputOutput MFString field named <i>function</i>.
	 * <br><br>
	 * <i>Tooltip:</i> function operators COMPLEMENT or ALPHAREPLICATE can be applied after the mode blending operation. Empty string value "" indicates that no function operation is applied for that stage.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of function values as textures, otherwise the default of no function operation is applied for each remaining stage. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.5 Values for the function field <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForFunctionField" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForFunctionField</a> for further details. </li> 
 * </ul>
	 * @param newValue is new value for the function field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setFunction(String[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
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
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public MultiTexture setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of String enumeration results (baseType multiTextureModeValues) ['"ADD"' | '"ADDSIGNED"' | '"ADDSIGNED2X"' | '"ADDSMOOTH"' | '"BLENDCURRENTALPHA"' | '"BLENDDIFFUSEALPHA"' | '"BLENDFACTORALPHA"' | '"BLENDTEXTUREALPHA"' | '"DOTPRODUCT3"' | '"MODULATE"' | '"MODULATE2X"' | '"MODULATE4X"' | '"MODULATEALPHA_ADDCOLOR"' | '"MODULATEINVALPHA_ADDCOLOR"' | '"MODULATEINVCOLOR_ADDALPHA"' | '"OFF"' | '"REPLACE"' | '"SELECTARG1"' | '"SELECTARG2"' | '"SUBTRACT"' | '"etc."'] from inputOutput MFString field named <i>mode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> mode field indicates the type of blending operation, both for color and for alpha channel.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of mode values as textures, otherwise the default value MODULATE is added for each remaining stage. </li> 
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.3 Multitexture modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-MultitextureModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-MultitextureModes</a> for further details. </li> 
 * </ul>
	 * @return value of mode field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public String[] getMode();

	/**
	 * Accessor method to assign String enumeration array (""ADD"" | ""ADDSIGNED"" | ""ADDSIGNED2X"" | ""ADDSMOOTH"" | ""BLENDCURRENTALPHA"" | ""BLENDDIFFUSEALPHA"" | ""BLENDFACTORALPHA"" | ""BLENDTEXTUREALPHA"" | ""DOTPRODUCT3"" | ""MODULATE"" | ""MODULATE2X"" | ""MODULATE4X"" | ""MODULATEALPHA_ADDCOLOR"" | ""MODULATEINVALPHA_ADDCOLOR"" | ""MODULATEINVCOLOR_ADDALPHA"" | ""OFF"" | ""REPLACE"" | ""SELECTARG1"" | ""SELECTARG2"" | ""SUBTRACT"") to inputOutput MFString field named <i>mode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> mode field indicates the type of blending operation, both for color and for alpha channel.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of mode values as textures, otherwise the default value MODULATE is added for each remaining stage. </li> 
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.3 Multitexture modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-MultitextureModes" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-MultitextureModes</a> for further details. </li> 
 * </ul>
	 * @param newValue is new value for the mode field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setMode(String[] newValue);

	/**
	 * Provide array of String enumeration results (baseType multiTextureSourceValues) ['"DIFFUSE"' | '"FACTOR"' | '"SPECULAR"' | '""' | '"etc."'] from inputOutput MFString field named <i>source</i>.
	 * <br><br>
	 * <i>Tooltip:</i> source field determines whether each image source is treated as DIFFUSE, SPECULAR or a multiplicative FACTOR. Empty string value "" indicates that no source modifier is applied for that stage.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of source values as textures, otherwise the default of no source interpretation is applied for each remaining stage. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.4 Values for the source field <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForSourceField" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForSourceField</a> for further details. </li> 
 * </ul>
	 * @return value of source field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public String[] getSource();

	/**
	 * Accessor method to assign String enumeration array (""DIFFUSE"" | ""FACTOR"" | ""SPECULAR"" | """") to inputOutput MFString field named <i>source</i>.
	 * <br><br>
	 * <i>Tooltip:</i> source field determines whether each image source is treated as DIFFUSE, SPECULAR or a multiplicative FACTOR. Empty string value "" indicates that no source modifier is applied for that stage.
 * <ul>
 *  <li> <i>Hint:</i> include the same number of source values as textures, otherwise the default of no source interpretation is applied for each remaining stage. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.4 Values for the source field <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForSourceField" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-ValuesForSourceField</a> for further details. </li> 
 * </ul>
	 * @param newValue is new value for the source field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setSource(String[] newValue);

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Contained texture nodes (ImageTexture, MovieTexture, PixelTexture) that map image(s) to surface geometry, defining each of the different texture channels.
 * <ul>
 *  <li> <i>Warning:</i> MultiTexture may not contain another MultiTexture node. </li> 
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureNode.
	 * @see org.web3d.x3d.sai.Texturing.X3DTextureNode
	 * @return value of texture field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureNode, $additionalInheritanceBaseType=)
	public X3DNode[] getTexture(); // acceptable node types #1: X3DTextureNode

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>texture</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [X3DTextureNode] Contained texture nodes (ImageTexture, MovieTexture, PixelTexture) that map image(s) to surface geometry, defining each of the different texture channels.
 * <ul>
 *  <li> <i>Warning:</i> MultiTexture may not contain another MultiTexture node. </li> 
 *  <li> <i>Hint:</i> if texture node is NULL or unspecified, corresponding Shape geometry for this Appearance is not textured. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Images <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images</a> </li> 
 *  <li> <i>Hint:</i> X3D Architecture 18 Texturing component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 33 Texturing3D component <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texture3D.html</a> </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureNode.
	 * @param newValue is new value for the texture field.
	 * @return {@link MultiTexture} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MultiTexture setTexture(X3DNode[] newValue); // acceptable node types #2: X3DTextureNode

	/**
	 * Add array of child texture nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to X3DTextureNode.
	 * @param newValue is new value array to be appended the texture field.
	 */
	public void addTexture(X3DNode[] newValue); // acceptable node types #3: X3DTextureNode
	/**
	 * Set single child texture node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the texture field
	 */
	public void setTexture(X3DNode newValue); // acceptable node types #5: X3DTextureNode
}
