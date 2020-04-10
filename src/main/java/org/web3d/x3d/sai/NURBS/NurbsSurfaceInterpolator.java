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

import org.web3d.x3d.sai.Core.X3DChildNode;

import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * NurbsSurfaceInterpolator describes a 3D NURBS curve and outputs interpolated position and normal values.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DChildNode] NurbsSurfaceInterpolator describes a 3D NURBS curve and outputs interpolated position and normal values.
 * <ul>
 *  <li> <i> Hint:</i>  the SFNode controlPoint field can contain a single Coordinate or CoordinateDouble node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#NurbsSurfaceInterpolator" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsSurfaceInterpolator" target="blank">X3D Abstract Specification: NurbsSurfaceInterpolator</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsSurfaceInterpolator" target="_blank">X3D Tooltips: NurbsSurfaceInterpolator</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface NurbsSurfaceInterpolator extends X3DChildNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @return value of controlPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getControlPoint(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>controlPoint</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setControlPoint(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

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
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSurfaceInterpolator setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>normal_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Computationaly interpolated output value determined by current key time and corresponding keyValue pair.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of normal_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public float[] getNormal();
	/**
	 * Provide array of 3-tuple float results from outputOnly SFVec3f field named <i>position_changed</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Computationaly interpolated output value determined by current key time and corresponding keyValue pair.
 * <ul>
 *  <li> <i> Warning:</i>  it is an error to define this transient outputOnly field in an X3D file, instead only use it a source for ROUTE events. </li> 
 * </ul>
	 * @return value of position_changed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public float[] getPosition();
	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @return value of uDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getUDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @param newValue is new value for the uDimension field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setUDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of uKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double[] getUKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setUKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of uOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getUOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the uOrder field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setUOrder(int newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @return value of vDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getVDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @param newValue is new value for the vDimension field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setVDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of vKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double[] getVKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setVKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of vOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public int getVOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the vOrder field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setVOrder(int newValue);

	/**
	 * Provide array of double results from inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to knots.
 * <ul>
 *  <li> <i> Hint:</i>  number of weights must match number of knots!. </li> 
 * </ul>
	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DChildNode, $additionalInheritanceBaseType=)
	public double[] getWeight();

	/**
	 * Accessor method to assign double array to inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Output values for linear interpolation, each corresponding to knots.
 * <ul>
 *  <li> <i> Hint:</i>  number of weights must match number of knots!. </li> 
 * </ul>
	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsSurfaceInterpolator} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSurfaceInterpolator setWeight(double[] newValue);

}
