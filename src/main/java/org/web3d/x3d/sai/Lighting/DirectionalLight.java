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

package org.web3d.x3d.sai.Lighting;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * DirectionalLight might not be scoped by parent Group or Transform at levels 1 or 2.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DLightNode] DirectionalLight defines parallel light rays that illuminate geometric shapes. Lighting illuminates all geometry except lines and points. By default, light scope only illuminates peer geometry and children nodes within the scene graph hierarchy. No source location is needed since rays are parallel from an infinitely distant source. DirectionalLight nodes do not attenuate with distance. Lights have no visible shape themselves and lighting effects continue through any intermediate geometry.
 * <ul>
 *  <li> <i>Hint:</i> animate direction to simulate time-of-day sunlight effects. </li> 
 *  <li> <i>Hint:</i>  the bound NavigationInfo controls whether headlight is enabled on/off. Interchange profile hint: light might not be scoped by parent Group or Transform. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#DirectionalLight" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/lighting.html#DirectionalLight" target="blank">X3D Abstract Specification: DirectionalLight</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#DirectionalLight" target="_blank">X3D Tooltips: DirectionalLight</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface DirectionalLight extends X3DLightNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Brightness of ambient (nondirectional background) emission from the light. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @return value of ambientIntensity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	@Override
	public float getAmbientIntensity();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>ambientIntensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Brightness of ambient (nondirectional background) emission from the light. Interchange profile hint: this field may be ignored, applying the default value regardless.  * <br>

	 * @param newValue is new value for the ambientIntensity field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DirectionalLight setAmbientIntensity(float newValue);

	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] color of light, applied to colors of objects.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	@Override
	public float[] getColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] color of light, applied to colors of objects.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the color field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DirectionalLight setColor(float[] newValue);

	/**
	 * Provide array of 3-tuple float results from inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation vector of light relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  animate direction to simulate time-of-day sunlight effects. </li> 
 * </ul>
	 * @return value of direction field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	public float[] getDirection();

	/**
	 * Accessor method to assign 3-tuple float array to inputOutput SFVec3f field named <i>direction</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Orientation vector of light relative to local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  animate direction to simulate time-of-day sunlight effects. </li> 
 * </ul>
	 * @param newValue is new value for the direction field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DirectionalLight setDirection(float[] newValue);

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>global</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Global lights illuminate all objects within their volume of lighting influence. Scoped lights only illuminate objects within the same transformation hierarchy.
 * <ul>
 *  <li> <i> Warning:</i>  DirectionalLight default global=false to limit scope and avoid inadvertently illuminating every object in a large scene. PointLight and SpotLight default global=true since their effects are each limited by maximum radius value. </li> 
 * </ul>
	 * @return value of global field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	public boolean getGlobal();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>global</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Global lights illuminate all objects within their volume of lighting influence. Scoped lights only illuminate objects within the same transformation hierarchy.
 * <ul>
 *  <li> <i> Warning:</i>  DirectionalLight default global=false to limit scope and avoid inadvertently illuminating every object in a large scene. PointLight and SpotLight default global=true since their effects are each limited by maximum radius value. </li> 
 * </ul>
	 * @param newValue is new value for the global field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public DirectionalLight setGlobal(boolean newValue);

	/**
	 * Provide float value within allowed range of [0,1] from inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Brightness of direct emission from the light.  * <br>

	 * @return value of intensity field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	@Override
	public float getIntensity();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>intensity</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [0,1] Brightness of direct emission from the light.  * <br>

	 * @param newValue is new value for the intensity field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DirectionalLight setIntensity(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
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
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DirectionalLight setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from inputOutput SFBool field named <i>on</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables this light source.  * <br>

	 * @return value of on field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DLightNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getOn();

	/**
	 * Accessor method to assign boolean value to inputOutput SFBool field named <i>on</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Enables/disables this light source.  * <br>

	 * @param newValue is new value for the on field.
	 * @return {@link DirectionalLight} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public DirectionalLight setOn(boolean newValue);

}
