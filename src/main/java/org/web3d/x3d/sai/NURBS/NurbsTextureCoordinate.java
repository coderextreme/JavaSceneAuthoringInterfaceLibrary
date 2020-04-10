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

import org.web3d.x3d.sai.Core.X3DNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * NurbsTextureCoordinate describes a 3D NURBS surface in the parametric domain of its surface host, specifying mapping of texture onto the surface.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNode] NurbsTextureCoordinate describes a 3D NURBS surface in the parametric domain of its surface host, specifying mapping of texture onto the surface.
 * <ul>
 *  <li> <i> Hint:</i>  the SFNode controlPoint field can contain a single Coordinate or CoordinateDouble node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#NurbsTextureCoordinate" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsTextureCoordinate" target="blank">X3D Abstract Specification: NurbsTextureCoordinate</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsTextureCoordinate" target="_blank">X3D Tooltips: NurbsTextureCoordinate</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Images" target="_blank">X3D Scene Authoring Hints: Images</a>
    */
public interface NurbsTextureCoordinate extends X3DNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of 2-tuple float results from inputOutput MFVec2f field named <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  controlPoint defines a set of control points of dimension uDimension by vDimension, and defines a mesh where the points do not have uniform spacing.  * <br>

	 * @return value of controlPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getControlPoint();

	/**
	 * Accessor method to assign 2-tuple float array to inputOutput MFVec2f field named <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  controlPoint defines a set of control points of dimension uDimension by vDimension, and defines a mesh where the points do not have uniform spacing.  * <br>

	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setControlPoint(float[] newValue);

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
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsTextureCoordinate setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @return value of uDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public int getUDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @param newValue is new value for the uDimension field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setUDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of uKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public double[] getUKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setUKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of uOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public int getUOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the uOrder field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setUOrder(int newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @return value of vDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public int getVDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @param newValue is new value for the vDimension field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setVDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of vKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public double[] getVKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setVKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of vOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public int getVOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the vOrder field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setVOrder(int newValue);

	/**
	 * Provide array of float results within allowed range of (0,infinity) from inputOutput MFFloat field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to knots.
 * <ul>
 *  <li> <i> Hint:</i>  number of weights must match number of knots!. </li> 
 * </ul>
	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public float[] getWeight();

	/**
	 * Accessor method to assign float array to inputOutput MFFloat field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to knots.
 * <ul>
 *  <li> <i> Hint:</i>  number of weights must match number of knots!. </li> 
 * </ul>
	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsTextureCoordinate} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsTextureCoordinate setWeight(float[] newValue);

}
