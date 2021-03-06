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
import java.util.Arrays;

/**
 * Contour2D groups a set of curve segments into a composite contour.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>: [X3DNode] Contour2D groups a set of curve segments into a composite contour. The children segments form a closed loop, with first point of first child repeated as last point of last child, and last point of each segment repeated as the first point of the next consecutive segment. The children segments are type NurbsCurve2D or ContourPolyline2D, enumerated in the consecutive order of contour topology.
 * <ul>
 *  <li> <i>Warning:</i> Contour2D is not a renderable geometry node. </li> 
 *  <li> <i>Hint:</i>  Contour2D is used as the trimmingContour field of the NurbsTrimmedSurface node. </li> 
 * </ul>
 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/concretes.html#Contour2D" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#Contour2D" target="blank">X3D Abstract Specification: Contour2D</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#Contour2D" target="_blank">X3D Tooltips: Contour2D</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface Contour2D extends X3DNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide array of X3DNode results (using an array consisting of properly typed nodes or ProtoInstanceObjects) with acceptable node types limited to NurbsCurve2D|ContourPolyline2D, from inputOutput MFNode field <i>children</i>.
	 * <br><br>
	 * <i>Tooltip:</i> [NurbsCurve2D|ContourPolyline2D] The children form a closed loop with first point of first child repeated as last point of last child, and the last point of a segment repeated as first point of the consecutive one.
 * <ul>
 *  <li> <i> Hint:</i>  children nodes are listed in consecutive order according to topology of the contour. </li> 
 * </ul>
	 * <br><br>
	 * <i>Warning:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to NurbsCurve2D|ContourPolyline2D.
	 * @see org.web3d.x3d.jsail.NURBS.NurbsCurve2DObject
	 * @see org.web3d.x3d.jsail.NURBS.ContourPolyline2DObject
	 * @return value of children field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNode, $additionalInheritanceBaseType=)
	public X3DNode[] getChildren(); // acceptable node types #1: NurbsCurve2D|ContourPolyline2D

	/**
	 * Accessor method to assign X3DNode array (using an array consisting of properly typed nodes or ProtoInstanceObjects) to inputOutput MFNode field <i>children</i>.

		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(newValue instanceof org.web3d.x3d.jsail.Core.CommentsBlock) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ROUTEObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Networking.IMPORTObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Networking.EXPORTObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ProtoDeclareObject) ||
				(newValue instanceof org.web3d.x3d.jsail.Core.ExternProtoDeclareObject) ||
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.NURBS.NurbsCurve2DObject) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.NURBS.ContourPolyline2DObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes NurbsCurve2D|ContourPolyline2D; newValue=" + newValue);
		}

	 * <br><br>
	 * <i>Tooltip:</i> [NurbsCurve2D|ContourPolyline2D] The children form a closed loop with first point of first child repeated as last point of last child, and the last point of a segment repeated as first point of the consecutive one.
 * <ul>
 *  <li> <i> Hint:</i>  children nodes are listed in consecutive order according to topology of the contour. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to NurbsCurve2D|ContourPolyline2D.
	 * @param newValue is new value for the children field.
	 * @return {@link Contour2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public Contour2D setChildren(X3DNode[] newValue); // acceptable node types #2: NurbsCurve2D|ContourPolyline2D

	/**
	 * Add array of children nodes to array of existing nodes (if any).
	 * <br><br>
	 * <i>Note:</i> according to X3D Unified Object Model (X3DUOM), acceptable node types are limited to NurbsCurve2D|ContourPolyline2D.
	 * @param newValue is new value array to be appended the children field.
	 */
	public void addChildren(X3DNode[] newValue); // acceptable node types #3: NurbsCurve2D|ContourPolyline2D
	/**
	 * Set single children node, replacing prior array of existing nodes (if any).
	 * @param newValue is new node for the children field
	 */
	public void setChildren(X3DNode newValue); // acceptable node types #5: NurbsCurve2D|ContourPolyline2D
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
	 * @return {@link Contour2D} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public Contour2D setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

}
