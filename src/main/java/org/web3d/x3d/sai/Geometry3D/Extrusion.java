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
 * Extrusion is a geometry node that sequentially stretches a 2D cross section along a 3D-spine path in the local coordinate system, creating an outer hull.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DGeometryNode] Extrusion is a geometry node that sequentially stretches a 2D cross section along a 3D-spine path in the local coordinate system, creating an outer hull. Scaling and rotating the crossSection 2D outline at each control point can modify the outer hull of the Extrusion to produce a wide variety of interesting shapes.
 * <ul>
 *  <li> <i>Warning:</i> take care to avoid defining parameter combinations that create self-intersecting, impossible or inverted geometry. </li> 
 *  <li> <i>Hint:</i> Extrusion <a href="https://en.wikipedia.org/wiki/Extrusion" target="_blank">https://en.wikipedia.org/wiki/Extrusion</a> </li> 
 *  <li> <i>Hint:</i>  insert a Shape node before adding geometry or Appearance. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Extrusion" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/geometry3D.html#Extrusion" target="blank">X3D Abstract Specification: Extrusion</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Extrusion" target="_blank">X3D Tooltips: Extrusion</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Extrusion extends X3DGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>beginCap</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether beginning cap is drawn (similar to Cylinder top cap).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @return value of beginCap field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getBeginCap();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>beginCap</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether beginning cap is drawn (similar to Cylinder top cap).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @param newValue is new value for the beginCap field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setBeginCap(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex-coordinates orientation.
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @return value of ccw field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getCcw();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex-coordinates orientation.
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @param newValue is new value for the ccw field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setCcw(boolean newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>convex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether all polygons in a shape are convex (true), or possibly concave (false). A convex polygon is planar, does not intersect itself, and has all interior angles &amp;lt; 180 degrees.
 * <ul>
 *  <li> <i> Warning:</i>  concave or inverted geometry may be invisible when using default value convex=true. </li> 
 * </ul>
	 * @return value of convex field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getConvex();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>convex</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether all polygons in a shape are convex (true), or possibly concave (false). A convex polygon is planar, does not intersect itself, and has all interior angles &amp;lt; 180 degrees.
 * <ul>
 *  <li> <i> Warning:</i>  concave or inverted geometry may be invisible when using default value convex=true. </li> 
 * </ul>
	 * @param newValue is new value for the convex field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setConvex(boolean newValue);

	/**
	 * Provide float value unit axis, angle (in radians) within allowed range of [0,infinity) from initializeOnly SFFloat field named <i>creaseAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) creaseAngle defines angle (in radians) where adjacent polygons are drawn with sharp edges or smooth shading. If angle between normals of two adjacent polygons is less than creaseAngle, smooth shading is rendered across the shared line segment.
 * <ul>
 *  <li> <i>Hint:</i> creaseAngle=0 means render all edges sharply, creaseAngle=3.14159 means render all edges smoothly. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @return value of creaseAngle field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float getCreaseAngle();

	/**
	 * Accessor method to assign float value unit axis, angle (in radians) to initializeOnly SFFloat field named <i>creaseAngle</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [0,+infinity) creaseAngle defines angle (in radians) where adjacent polygons are drawn with sharp edges or smooth shading. If angle between normals of two adjacent polygons is less than creaseAngle, smooth shading is rendered across the shared line segment.
 * <ul>
 *  <li> <i>Hint:</i> creaseAngle=0 means render all edges sharply, creaseAngle=3.14159 means render all edges smoothly. </li> 
 *  <li> <i>Hint:</i>  <a href="https://en.wikipedia.org/wiki/Radian" target="_blank">https://en.wikipedia.org/wiki/Radian</a> </li> 
 * </ul>
	 * @param newValue is new value for the creaseAngle field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setCreaseAngle(float newValue);

	/**
	 * Provide array of 2-tuple float results from initializeOnly MFVec2f field named <i>crossSection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The crossSection array defines a silhouette outline of the outer Extrusion surface. crossSection is an ordered set of 2D points that draw a piecewise-linear curve which is extruded to form a series of connected vertices.
 * <ul>
 *  <li> <i>Hint:</i> the crossSection array can be open or closed (closed means that endpoints are coincident). </li> 
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Warning:</i> match clockwise/counterclockwise, otherwise self-intersecting, impossible or inverted geometry can result! </li> 
 *  <li> <i>Warning:</i>  avoid self-intersecting polygon line segments, otherwise defined geometry is irregular and rendering results are undefined. , particularly for end caps. </li> 
 * </ul>
	 * @return value of crossSection field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getCrossSection();

	/**
	 * Accessor method to assign 2-tuple float array to initializeOnly MFVec2f field named <i>crossSection</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The crossSection array defines a silhouette outline of the outer Extrusion surface. crossSection is an ordered set of 2D points that draw a piecewise-linear curve which is extruded to form a series of connected vertices.
 * <ul>
 *  <li> <i>Hint:</i> the crossSection array can be open or closed (closed means that endpoints are coincident). </li> 
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Warning:</i> match clockwise/counterclockwise, otherwise self-intersecting, impossible or inverted geometry can result! </li> 
 *  <li> <i>Warning:</i>  avoid self-intersecting polygon line segments, otherwise defined geometry is irregular and rendering results are undefined. , particularly for end caps. </li> 
 * </ul>
	 * @param newValue is new value for the crossSection field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setCrossSection(float[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>endCap</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether end cap is drawn (similar to Cylinder bottom cap).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @return value of endCap field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public boolean getEndCap();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>endCap</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Whether end cap is drawn (similar to Cylinder bottom cap).
 * <ul>
 *  <li> <i> Warning:</i>  cannot be changed after initial creation. </li> 
 * </ul>
	 * @param newValue is new value for the endCap field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setEndCap(boolean newValue);

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
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Extrusion setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 4-tuple float results unit axis, angle (in radians) from inputOutput MFRotation field named <i>orientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The orientation array is a list of axis-angle 4-tuple values applied at each spine-aligned cross-section plane.
 * <ul>
 *  <li> <i>Hint:</i> if the orientation array contains a single 4-tuple value, it is applied at all spine-aligned crossSection planes. </li> 
 *  <li> <i>Hint:</i>  number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 * </ul>
	 * @return value of orientation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getOrientation();

	/**
	 * Accessor method to assign 4-tuple float array unit axis, angle (in radians) to inputOutput MFRotation field named <i>orientation</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The orientation array is a list of axis-angle 4-tuple values applied at each spine-aligned cross-section plane.
 * <ul>
 *  <li> <i>Hint:</i> if the orientation array contains a single 4-tuple value, it is applied at all spine-aligned crossSection planes. </li> 
 *  <li> <i>Hint:</i>  number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 * </ul>
	 * @param newValue is new value for the orientation field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setOrientation(float[] newValue);

	/**
	 * Provide array of 2-tuple float results from inputOutput MFVec2f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) scale is a list of 2D-scale parameters applied at each spine-aligned cross-section plane.
 * <ul>
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Hint:</i> if the scale array contains one value, it is applied at all spine-aligned crossSection planes. </li> 
 *  <li> <i>Warning:</i>  zero or negative scale values not allowed. </li> 
 * </ul>
	 * @return value of scale field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getScale();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput MFVec2f field named <i>scale</i>.
	 * <br><br>
	 * <i>Tooltip:</i> (0,+infinity) scale is a list of 2D-scale parameters applied at each spine-aligned cross-section plane.
 * <ul>
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Hint:</i> if the scale array contains one value, it is applied at all spine-aligned crossSection planes. </li> 
 *  <li> <i>Warning:</i>  zero or negative scale values not allowed. </li> 
 * </ul>
	 * @param newValue is new value for the scale field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setScale(float[] newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i>  if in doubt, use solid='false' for maximum visibility. </li> 
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
 *  <li> <i>Hint:</i>  if in doubt, use solid='false' for maximum visibility. </li> 
 * </ul>
	 * @param newValue is new value for the solid field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setSolid(boolean newValue);

	/**
	 * Provide array of 3-tuple float results from initializeOnly MFVec3f field named <i>spine</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The spine array defines a center-line sequence of 3D points that define a piecewise-linear curve forming a series of connected vertices. The spine is set of points along which a 2D crossSection is extruded, scaled and oriented.
 * <ul>
 *  <li> <i>Hint:</i> the spine array can be open or closed (closed means that endpoints are coincident). </li> 
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Warning:</i>  take care if creating loops or spirals, otherwise self-intersecting, impossible or inverted geometry can result!. </li> 
 * </ul>
	 * @return value of spine field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DGeometryNode, $additionalInheritanceBaseType=)
	public float[] getSpine();

	/**
	 * Accessor method to assign 3-tuple float array to initializeOnly MFVec3f field named <i>spine</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The spine array defines a center-line sequence of 3D points that define a piecewise-linear curve forming a series of connected vertices. The spine is set of points along which a 2D crossSection is extruded, scaled and oriented.
 * <ul>
 *  <li> <i>Hint:</i> the spine array can be open or closed (closed means that endpoints are coincident). </li> 
 *  <li> <i>Hint:</i> number of values must all match for 3-tuple spine points, 2-tuple scale values, and 4-tuple orientation values. </li> 
 *  <li> <i>Warning:</i>  take care if creating loops or spirals, otherwise self-intersecting, impossible or inverted geometry can result!. </li> 
 * </ul>
	 * @param newValue is new value for the spine field.
	 * @return {@link Extrusion} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Extrusion setSpine(float[] newValue);

}