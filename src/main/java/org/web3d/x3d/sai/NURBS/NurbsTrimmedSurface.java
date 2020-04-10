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

package org.web3d.x3d.sai.NURBS;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.NURBS.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.NURBS.*;
import org.web3d.x3d.sai.NURBS.*;
import java.util.Arrays;

/**
 * NurbsTrimmedSurface generates texture coordinates from a Non-Uniform Rational B-Spline (NURBS) surface.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  [X3DNurbsSurfaceGeometryNode] NurbsTrimmedSurface generates texture coordinates from a Non-Uniform Rational B-Spline (NURBS) surface.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#NurbsTrimmedSurface" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsTrimmedSurface" target="blank">X3D Abstract Specification: NurbsTrimmedSurface</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsTrimmedSurface" target="_blank">X3D Tooltips: NurbsTrimmedSurface</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface NurbsTrimmedSurface extends X3DNurbsSurfaceGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @return value of controlPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DCoordinateNode getControlPoint(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setControlPoint(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
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
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setSolid(boolean newValue);

	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTextureCoordinateNode|NurbsTextureCoordinate, from inputOutput SFNode field <i>texCoord</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode|NurbsTextureCoordinate] Single contained NurbsTextureCoordinate, TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @return value of texCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getTexCoord(); // acceptable node types #1: X3DTextureCoordinateNode|NurbsTextureCoordinate

	/**
	 * Accessor method to assign X3DNode instance (using a properly typed node) to inputOutput SFNode field <i>texCoord</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTextureCoordinateNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.NURBS.NurbsTextureCoordinateObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTextureCoordinateNode|NurbsTextureCoordinate; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode|NurbsTextureCoordinate] Single contained NurbsTextureCoordinate, TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @param newValue is new value for the texCoord field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setTexCoord(X3DNode newValue); // acceptable node types #2: X3DTextureCoordinateNode|NurbsTextureCoordinate

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) from inputOutput MFNode field <i>trimmingContour</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [Contour2D] A set of Contour2D nodes are used as trimming loops.
 * <ul>
 *  <li> <i> Hint:</i>  if no trimming contours are defined, NurbsTrimmedSurface has same semantics as NurbsPatchSurface node. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Contour2D.
	 * @see org.web3d.x3d.jsail.NURBS.Contour2DObject
	 * @return value of trimmingContour field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	public X3DNode[] getTrimmingContour(); // acceptable node types #1: Contour2D

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>trimmingContour</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [Contour2D] A set of Contour2D nodes are used as trimming loops.
 * <ul>
 *  <li> <i> Hint:</i>  if no trimming contours are defined, NurbsTrimmedSurface has same semantics as NurbsPatchSurface node. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Contour2D.
	 * @param newValue is new value for the trimmingContour field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTrimmedSurface setTrimmingContour(X3DNode[] newValue); // acceptable node types #2: Contour2D

	/**
	 * Add array of child trimmingContour nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to Contour2D.
	 * @param newValue is new value array to be appended the trimmingContour field.
	 */
	public void addTrimmingContour(X3DNode[] newValue); // acceptable node types #3: Contour2D
	/**
	 * Set single child trimmingContour node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the trimmingContour field
	 */
	public void setTrimmingContour(X3DNode newValue); // acceptable node types #5: Contour2D
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>uClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @return value of uClosed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getUClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>uClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @param newValue is new value for the uClosed field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setUClosed(boolean newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @return value of uDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @param newValue is new value for the uDimension field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setUDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of uKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getUKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setUKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of uOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the uOrder field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setUOrder(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>uTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @return value of uTessellation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUTessellation();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>uTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @param newValue is new value for the uTessellation field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setUTessellation(int newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>vClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @return value of vClosed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>vClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @param newValue is new value for the vClosed field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setVClosed(boolean newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @return value of vDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @param newValue is new value for the vDimension field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setVDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of vKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getVKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setVKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of vOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the vOrder field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setVOrder(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>vTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @return value of vTessellation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVTessellation();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>vTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @param newValue is new value for the vTessellation field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setVTessellation(int newValue);

	/**
	 * Provide array of double results within allowed range of (0,infinity) from inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getWeight();

	/**
	 * Accessor method to assign double array to inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsTrimmedSurface} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTrimmedSurface setWeight(double[] newValue);

}
