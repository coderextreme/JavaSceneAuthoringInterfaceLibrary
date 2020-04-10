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

package org.web3d.x3d.sai.EnvironmentalEffects;

import org.web3d.x3d.sai.Core.X3DBindableNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * Fog simulates atmospheric effects by blending distant objects with fog color.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DBindableNode,X3DFogObject] Fog simulates atmospheric effects by blending distant objects with fog color.
 * <ul>
 *  <li> <i>Hint:</i> Background, Fog, GeoViewpoint, NavigationInfo, OrthoViewpoint, TextureBackground and Viewpoint are bindable nodes, meaning that no more than one of each node type can be active at a given time. </li> 
 *  <li> <i>Warning:</i>  results are undefined if a bindable node (Background, Fog, NavigationInfo, OrthoViewpoint, TextureBackground, Viewpoint) is a contained descendant node of either LOD or Switch. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Fog" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/enveffects.html#Fog" target="blank">X3D Abstract Specification: Fog</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Fog" target="_blank">X3D Tooltips: Fog</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Fog extends X3DBindableNode, X3DFogObject
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide double value in seconds from outputOnly SFTime field named <i>bindTime</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Event sent reporting timestamp when node becomes active/inactive.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of bindTime field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
	@Override
	public double getBindTime();
	/**
	 * Provide array of 3-tuple float results using RGB values [0..1] using RGB values [0..1] from inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] Fog color.
 * <ul>
 *  <li> <i>Hint:</i> match Background color to make objects fade away. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @return value of color field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
	@Override
	public float[] getColor();

	/**
	 * Accessor method to assign 3-tuple float array using RGB values [0..1] to inputOutput SFColor field named <i>color</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] Fog color.
 * <ul>
 *  <li> <i>Hint:</i> match Background color to make objects fade away. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Color <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Color</a> </li> 
 * </ul>
	 * @param newValue is new value for the color field.
	 * @return {@link Fog} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Fog setColor(float[] newValue);

	/**
	 * Provide String enumeration value (baseType fogTypeChoices) ["LINEAR" | "EXPONENTIAL"] from inputOutput SFString field named <i>fogType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies algorithm for rate of increasing Fog, either LINEAR or EXPONENTIAL.
 * <ul>
 *  <li> <i>Hint:</i> EXPONENTIAL is more natural but also more computationally expensive. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @return value of fogType field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
	@Override
	public String getFogType();

	/**
	 * Accessor method to assign String enumeration value ("LINEAR" | "EXPONENTIAL") to inputOutput SFString field named <i>fogType</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Specifies algorithm for rate of increasing Fog, either LINEAR or EXPONENTIAL.
 * <ul>
 *  <li> <i>Hint:</i> EXPONENTIAL is more natural but also more computationally expensive. </li> 
 *  <li> <i>Warning:</i>  do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 * </ul>
	 * @param newValue is new value for the fogType field.
	 * @return {@link Fog} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Fog setFogType(String newValue);

	/**
	 * Provide boolean value from outputOnly SFBool field named <i>isBound</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output event true gets sent when node becomes bound and activated, otherwise output event false gets sent when node becomes unbound and deactivated.
 * <ul>
 *  <li> <i>Hint:</i> paired node operations can be established by connecting set_bind and isBound fields of corresponding bindable nodes. </li> 
 *  <li> <i>Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of isBound field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
	@Override
	public boolean getIsBound();
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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
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
	 * @return {@link Fog} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Fog setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide float value within allowed range of [0,infinity) from inputOutput SFFloat field named <i>visibilityRange</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Distance in meters where objects are totally obscured by the fog, using local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  visibilityRange 0 disables Fog. </li> 
 * </ul>
	 * @return value of visibilityRange field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DBindableNode, $additionalInheritanceBaseType=X3DFogObject)
	@Override
	public float getVisibilityRange();

	/**
	 * Accessor method to assign float value to inputOutput SFFloat field named <i>visibilityRange</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Distance in meters where objects are totally obscured by the fog, using local coordinate system.
 * <ul>
 *  <li> <i> Hint:</i>  visibilityRange 0 disables Fog. </li> 
 * </ul>
	 * @param newValue is new value for the visibilityRange field.
	 * @return {@link Fog} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Fog setVisibilityRange(float newValue);

}
