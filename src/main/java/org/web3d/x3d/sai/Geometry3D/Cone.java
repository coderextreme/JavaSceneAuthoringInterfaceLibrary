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

package org.web3d.x3d.sai.Geometry3D;

import org.web3d.x3d.sai.Rendering.X3DGeometryNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * Cone is a geometry node.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometryNode] Cone is a geometry node.
 * <ul>
 *  <li> <i>Hint:</i> cone <a href="https://en.wikipedia.org/wiki/Cone" target="_blank">https://en.wikipedia.org/wiki/Cone</a> </li> 
 *  <li> <i>Hint:</i>  insert a Shape node before adding geometry or Appearance. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Cone" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry3D.html#Cone" target="blank">X3D Abstract Specification: Cone</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Cone" target="_blank">X3D Tooltips: Cone</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Cone extends X3DGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>bottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to draw bottom (other inside faces are not drawn).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @return value of bottom field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getBottom();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>bottom</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to draw bottom (other inside faces are not drawn).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @param newValue is new value for the bottom field.
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Cone setBottom(boolean newValue);

	/**
	 * Provide float value within allowed range of (0,infinity) from initializeOnly SFFloat field named <i>bottomRadius</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Size in meters.
 * <ul>
 *  <li> <i> Warning:</i>  simple-geometry dimensions are initializeOnly and cannot be changed after initial creation, for size animation use an ancestor Transform scale instead. </li> 
 * </ul>
	 * @return value of bottomRadius field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float getBottomRadius();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>bottomRadius</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Size in meters.
 * <ul>
 *  <li> <i> Warning:</i>  simple-geometry dimensions are initializeOnly and cannot be changed after initial creation, for size animation use an ancestor Transform scale instead. </li> 
 * </ul>
	 * @param newValue is new value for the bottomRadius field.
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Cone setBottomRadius(float newValue);

	/**
	 * Provide float value within allowed range of (0,infinity) from initializeOnly SFFloat field named <i>height</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Size in meters.
 * <ul>
 *  <li> <i> Warning:</i>  simple-geometry dimensions are initializeOnly and cannot be changed after initial creation, for size animation use an ancestor Transform scale instead. </li> 
 * </ul>
	 * @return value of height field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float getHeight();

	/**
	 * Accessor method to assign float value to initializeOnly SFFloat field named <i>height</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) Size in meters.
 * <ul>
 *  <li> <i> Warning:</i>  simple-geometry dimensions are initializeOnly and cannot be changed after initial creation, for size animation use an ancestor Transform scale instead. </li> 
 * </ul>
	 * @param newValue is new value for the height field.
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Cone setHeight(float newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Cone setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>side</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to draw sides (other inside faces are not drawn).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @return value of side field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getSide();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>side</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether to draw sides (other inside faces are not drawn).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @param newValue is new value for the side field.
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Cone setSide(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i> if in doubt, use solid='false' for maximum visibility. </li> 
 *  <li> <i>Warning:</i>  solid false not supported in VRML97. </li> 
 * </ul>
	 * @return value of solid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getSolid();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i> if in doubt, use solid='false' for maximum visibility. </li> 
 *  <li> <i>Warning:</i>  solid false not supported in VRML97. </li> 
 * </ul>
	 * @param newValue is new value for the solid field.
	 * @return {@link Cone} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Cone setSolid(boolean newValue);

}
