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
 * TwoSidedMaterial specifies surface rendering properties for associated geometry nodes, for outer (front) and inner (back) sides of polygons.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DMaterialNode] TwoSidedMaterial specifies surface rendering properties for associated geometry nodes, for outer (front) and inner (back) sides of polygons. Material attributes are used by the X3D lighting equations during rendering.
 * <ul>
 *  <li> <i>Warning:</i> requires X3D profile='Full' or else include &amp;lt;component name='Shape' level='4'/&amp;gt; </li> 
 *  <li> <i>Hint:</i> insert Shape and Appearance nodes before adding material. </li> 
 *  <li> <i>Hint:</i> DEF/USE copies of a single node can provide a similar "look + feel" style for related shapes in a scene. </li> 
 *  <li> <i>Hint:</i> X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 *  <li> <i>Warning:</i> corresponding geometry within the parent Shape must have solid='false' for two-sided rendering, otherwise no reverse-side back geometry is displayed. </li> 
 *  <li> <i>Hint:</i> X3D Architecture 12.2.3 Two-sided materials <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#TwoSidedMaterials" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#TwoSidedMaterials</a> </li> 
 *  <li> <i>Hint:</i>  X3D Architecture 17.2.2 Lighting model <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#Lightingmodel</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TwoSidedMaterial" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/shape.html#Material" target="blank">X3D Abstract Specification: TwoSidedMaterial</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TwoSidedMaterial" target="_blank">X3D Tooltips: TwoSidedMaterial</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface TwoSidedMaterial extends X3DMaterialNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of ambientIntensity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getAmbientIntensity();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the ambientIntensity field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setAmbientIntensity(float newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backAmbientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backAmbientIntensity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getBackAmbientIntensity();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backAmbientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how much ambient omnidirectional light is reflected from all light sources. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backAmbientIntensity field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackAmbientIntensity(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backDiffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @return value of backDiffuseColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getBackDiffuseColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backDiffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @param newValue is new value for the backDiffuseColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackDiffuseColor(float[] newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backEmissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @return value of backEmissiveColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getBackEmissiveColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backEmissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @param newValue is new value for the backEmissiveColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackEmissiveColor(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backShininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backShininess field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getBackShininess();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backShininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backShininess field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackShininess(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>backSpecularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of backSpecularColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getBackSpecularColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>backSpecularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the backSpecularColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackSpecularColor(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>backTransparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @return value of backTransparency field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getBackTransparency();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>backTransparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @param newValue is new value for the backTransparency field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setBackTransparency(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>diffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @return value of diffuseColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getDiffuseColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>diffuseColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much direct, angle-dependent light is reflected from all light sources.
 * <ul>
 *  <li> <i> Hint:</i>  only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 * </ul>
	 * @param newValue is new value for the diffuseColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setDiffuseColor(float[] newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>emissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @return value of emissiveColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getEmissiveColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>emissiveColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] how much glowing light is emitted from this object.
 * <ul>
 *  <li> <i>Hint:</i> emissiveColors glow even when all lights are off. </li> 
 *  <li> <i>Hint:</i> reset diffuseColor from default (.8 .8 .8) to (0 0 0) to avoid washout. </li> 
 *  <li> <i>Hint:</i> only emissiveColor affects IndexedLineSet, LineSet and PointSet. </li> 
 *  <li> <i>Warning:</i>  bright emissiveColor values can wash out other colors and some textures. </li> 
 * </ul>
	 * @param newValue is new value for the emissiveColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setEmissiveColor(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TwoSidedMaterial setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>separateBackColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separateBackColor determines whether separate Material values are used for back faces.
 * <ul>
 *  <li> <i> Warning:</i>  backface Material values are ignored unless you set separateBackColor='true'. </li> 
 * </ul>
	 * @return value of separateBackColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public boolean getSeparateBackColor();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>separateBackColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i> separateBackColor determines whether separate Material values are used for back faces.
 * <ul>
 *  <li> <i> Warning:</i>  backface Material values are ignored unless you set separateBackColor='true'. </li> 
 * </ul>
	 * @param newValue is new value for the separateBackColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setSeparateBackColor(boolean newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>shininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of shininess field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getShininess();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>shininess</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Lower shininess values provide soft specular glows, while higher values result in sharper, smaller highlights. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the shininess field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setShininess(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>specularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of specularColor field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float[] getSpecularColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>specularColor</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] specular highlights are brightness reflections (example: shiny spots on an apple). Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the specularColor field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setSpecularColor(float[] newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @return value of transparency field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DMaterialNode, $additionalInheritanceBaseType=)
	public float getTransparency();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>transparency</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] how "clear" an object is: 1.0 is completely transparent, 0.0 is completely opaque. Interchange profile hint: transparency &amp;lt; .5 opaque, transparency &amp;gt; .5 transparent.  * <br>

	 * @param newValue is new value for the transparency field.
	 * @return {@link TwoSidedMaterial} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TwoSidedMaterial setTransparency(float newValue);

}
