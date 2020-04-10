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

/**
 * TextureCoordinateGenerator computes 2D (s,t) texture-coordinate points, used by vertex-based geometry nodes (such as IndexedFaceSet or ElevationGrid) to map textures to vertices (and patches to NURBS surfaces).
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DTextureCoordinateNode] TextureCoordinateGenerator computes 2D (s,t) texture-coordinate points, used by vertex-based geometry nodes (such as IndexedFaceSet or ElevationGrid) to map textures to vertices (and patches to NURBS surfaces).
 * <ul>
 *  <li> <i>Hint:</i> add Shape and then polgyonal/planar geometry before adding TextureCoordinateGenerator. </li> 
 *  <li> <i>Hint:</i> Texture mapping <a href="https://en.wikipedia.org/wiki/Texture_mapping" target="_blank">https://en.wikipedia.org/wiki/Texture_mapping</a> </li> 
 *  <li> <i>Hint:</i>  X3D Texturing component Figure 18.1, Texture map coordinate system <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-TextureMapCoordSystem" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#f-TextureMapCoordSystem</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#TextureCoordinateGenerator" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#TextureCoordinateGenerator" target="blank">X3D Abstract Specification: TextureCoordinateGenerator</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#TextureCoordinateGenerator" target="_blank">X3D Tooltips: TextureCoordinateGenerator</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface TextureCoordinateGenerator extends X3DTextureCoordinateNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureCoordinateNode, $additionalInheritanceBaseType=)
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
	 * @return {@link TextureCoordinateGenerator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public TextureCoordinateGenerator setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide String enumeration value (baseType textureCoordinateGeneratorModeChoices) ["SPHERE" | "CAMERASPACENORMAL" | "CAMERASPACEPOSITION" | "CAMERASPACEREFLECTIONVECTOR" | "SPHERE-LOCAL" | "COORD" | "COORD-EYE" | "NOISE" | "NOISE-EYE" | "SPHERE-REFLECT" | "SPHERE-REFLECT-LOCAL"] from inputOutput SFString field named <i>mode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> parameter field defines the algorithm used to compute texture coordinates.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.6 Texture coordinate generation modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-Texturecoordgeneration" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-Texturecoordgeneration</a> for further details. </li> 
 * </ul>
	 * @return value of mode field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureCoordinateNode, $additionalInheritanceBaseType=)
	public String getMode();

	/**
	 * Accessor method to assign String enumeration value ("SPHERE" | "CAMERASPACENORMAL" | "CAMERASPACEPOSITION" | "CAMERASPACEREFLECTIONVECTOR" | "SPHERE-LOCAL" | "COORD" | "COORD-EYE" | "NOISE" | "NOISE-EYE" | "SPHERE-REFLECT" | "SPHERE-REFLECT-LOCAL") to inputOutput SFString field named <i>mode</i>.
	 * <br><br>
	 * <i>Tooltip:</i> parameter field defines the algorithm used to compute texture coordinates.
 * <ul>
 *  <li> <i>Warning:</i> do not wrap extra quotation marks around these SFString enumeration values, since "quotation" "marks" are only used for MFString values. </li> 
 *  <li> <i>Hint:</i>  X3D Architecture Table 18.6 Texture coordinate generation modes <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-Texturecoordgeneration" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/texturing.html#t-Texturecoordgeneration</a> for further details. </li> 
 * </ul>
	 * @param newValue is new value for the mode field.
	 * @return {@link TextureCoordinateGenerator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureCoordinateGenerator setMode(String newValue);

	/**
	 * Provide array of float results from inputOutput MFFloat field named <i>parameter</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  parameter array contains scale and translation (x y z) values for Perlin NOISE mode, parameter[0] contains index of refraction for SPHERE-REFLECT mode, parameter[0] contains index of refraction and parameter[1 to 3] contains the eye point in local coordinates for SPHERE-REFLECT-LOCAL mode.  * <br>

	 * @return value of parameter field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DTextureCoordinateNode, $additionalInheritanceBaseType=)
	public float[] getParameter();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>parameter</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  parameter array contains scale and translation (x y z) values for Perlin NOISE mode, parameter[0] contains index of refraction for SPHERE-REFLECT mode, parameter[0] contains index of refraction and parameter[1 to 3] contains the eye point in local coordinates for SPHERE-REFLECT-LOCAL mode.  * <br>

	 * @param newValue is new value for the parameter field.
	 * @return {@link TextureCoordinateGenerator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public TextureCoordinateGenerator setParameter(float[] newValue);

}
