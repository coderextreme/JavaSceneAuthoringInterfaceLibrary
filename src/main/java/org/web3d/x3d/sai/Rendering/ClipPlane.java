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

package org.web3d.x3d.sai.Rendering;

import org.web3d.x3d.sai.Core.X3DChildNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * ClipPlane specifies a single plane equation used to clip (i.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: (X3D version 3.2 or later) [X3DChildNode] ClipPlane specifies a single plane equation used to clip (i.e. cull or hide) displayed geometry. The plane field specifies a four-component plane equation that describes both inside and outside half space.
 * <ul>
 *  <li> <i>Hint:</i> ClipPlane nodes only affect peer and descendant nodes, thus a parent grouping node can limit its effect. </li> 
 *  <li> <i>Warning:</i>  requires X3D profile='Full' or else include &amp;lt;component name='Rendering' level='5'/&amp;gt; Examples: X3D Example Archives, Basic, CAD, Clip Plane Example <a href="https://www.web3d.org/x3d/content/examples/Basic/CAD/ClipPlaneExampleIndex.html" target="_blank">https://www.web3d.org/x3d/content/examples/Basic/CAD/ClipPlaneExampleIndex.html</a> </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#ClipPlane" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/rendering.html#ClipPlane" target="blank">X3D Abstract Specification: ClipPlane</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#ClipPlane" target="_blank">X3D Tooltips: ClipPlane</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface ClipPlane extends X3DChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

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
	 * @return {@link ClipPlane} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ClipPlane setEnabled(boolean newValue);

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
	 * @return {@link ClipPlane} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public ClipPlane setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results within allowed range of [-1,1] from inputOutput SFVec4f field named <i>plane</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] If (a,b,c,d) is the plane, with the first three components being a normalized vector describing the plane's normal direction (and thus the fourth component d being distance from the origin), a point (x,y,z) is visible to the user, with regards to the clipping plane, if a*x+b*y+c*z+d is greater than 0.
 * <ul>
 *  <li> <i>Warning:</i> (a, b, c) value of (0, 0, 0) is forbidden since the zero vector has ambiguous direction and is thus degenerate, not defining a plane. </li> 
 *  <li> <i>Hint:</i> negate all plane values to reverse which side of plane has visibility clipped. </li> 
 *  <li> <i>Hint:</i> plane-geometry equations <a href="http://en.wikipedia.org/wiki/Plane_(geometry)#Point-normal_form_and_general_form_of_the_equation_of_a_plane" target="_blank">http://en.wikipedia.org/wiki/Plane_(geometry)#Point-normal_form_and_general_form_of_the_equation_of_a_plane</a> </li> 
 *  <li> <i>Hint:</i>  plane-geometry distance to point <a href="http://en.wikipedia.org/wiki/Plane_(geometry)#Distance_from_a_point_to_a_plane" target="_blank">http://en.wikipedia.org/wiki/Plane_(geometry)#Distance_from_a_point_to_a_plane</a> </li> 
 * </ul>
	 * @return value of plane field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public float[] getPlane();

	/**
	 * Accessor method to assign 4-tuple float array to inputOutput SFVec4f field named <i>plane</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,1] If (a,b,c,d) is the plane, with the first three components being a normalized vector describing the plane's normal direction (and thus the fourth component d being distance from the origin), a point (x,y,z) is visible to the user, with regards to the clipping plane, if a*x+b*y+c*z+d is greater than 0.
 * <ul>
 *  <li> <i>Warning:</i> (a, b, c) value of (0, 0, 0) is forbidden since the zero vector has ambiguous direction and is thus degenerate, not defining a plane. </li> 
 *  <li> <i>Hint:</i> negate all plane values to reverse which side of plane has visibility clipped. </li> 
 *  <li> <i>Hint:</i> plane-geometry equations <a href="http://en.wikipedia.org/wiki/Plane_(geometry)#Point-normal_form_and_general_form_of_the_equation_of_a_plane" target="_blank">http://en.wikipedia.org/wiki/Plane_(geometry)#Point-normal_form_and_general_form_of_the_equation_of_a_plane</a> </li> 
 *  <li> <i>Hint:</i>  plane-geometry distance to point <a href="http://en.wikipedia.org/wiki/Plane_(geometry)#Distance_from_a_point_to_a_plane" target="_blank">http://en.wikipedia.org/wiki/Plane_(geometry)#Distance_from_a_point_to_a_plane</a> </li> 
 * </ul>
	 * @param newValue is new value for the plane field.
	 * @return {@link ClipPlane} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public ClipPlane setPlane(float[] newValue);

}
