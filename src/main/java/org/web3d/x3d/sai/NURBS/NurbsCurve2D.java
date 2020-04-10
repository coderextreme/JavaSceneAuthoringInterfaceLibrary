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
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * NurbsCurve2D defines a trimming segment that is part of a trimming contour in the u-v domain of a surface.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNurbsControlCurveNode] NurbsCurve2D defines a trimming segment that is part of a trimming contour in the u-v domain of a surface. NurbsCurve2D and ContourPolyline2D nodes that together form a closed contour, defined in the u-v parametric space of a NURBS surface, may be used as children in a Contour2D node.
 * <ul>
 *  <li> <i> Warning:</i>  NurbsCurve2D is not a renderable geometry node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#NurbsCurve2D" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsCurve2D" target="blank">X3D Abstract Specification: NurbsCurve2D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsCurve2D" target="_blank">X3D Tooltips: NurbsCurve2D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface NurbsCurve2D extends X3DNurbsControlCurveNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether or not the curve is closed (i.e. matching end values).  * <br>

	 * @return value of closed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	public boolean getClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>closed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether or not the curve is closed (i.e. matching end values).  * <br>

	 * @param newValue is new value for the closed field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsCurve2D setClosed(boolean newValue);

	/**
	 * Provide array of 2-tuple double results from inputOutput MFVec2d field named <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  controlPoint defines a set of control points of dimension uDimension by vDimension, and defines a mesh where the points do not have uniform spacing.  * <br>

	 * @return value of controlPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getControlPoint();

	/**
	 * Accessor method to assign 2-tuple double array to inputOutput MFVec2d field named <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  controlPoint defines a set of control points of dimension uDimension by vDimension, and defines a mesh where the points do not have uniform spacing.  * <br>

	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsCurve2D setControlPoint(double[] newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>knot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of knot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	public double[] getKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>knot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the knot field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsCurve2D setKnot(double[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsCurve2D setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>order</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of order field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	public int getOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>order</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the order field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsCurve2D setOrder(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>tessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @return value of tessellation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	public int getTessellation();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>tessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @param newValue is new value for the tessellation field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsCurve2D setTessellation(int newValue);

	/**
	 * Provide array of double results within allowed range of (0,infinity) from inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsControlCurveNode, $additionalInheritanceBaseType=)
	public double[] getWeight();

	/**
	 * Accessor method to assign double array to inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsCurve2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsCurve2D setWeight(double[] newValue);

}
