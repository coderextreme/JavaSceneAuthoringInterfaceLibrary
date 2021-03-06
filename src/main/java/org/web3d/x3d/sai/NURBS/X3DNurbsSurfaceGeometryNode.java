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
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.sai.Core.*;

/**
 * Abstract geometry type for all types of NURBS surfaces.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This interface is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DNurbsSurfaceGeometryNode" target="_blank">SAI Java Specification: TODO</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#X3DNurbsSurfaceGeometryNode" target="blank">X3D Abstract Specification: TODO</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public interface X3DNurbsSurfaceGeometryNode extends X3DParametricGeometryNode
{
	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>controlPoint</i>.
	 * @return value of controlPoint field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public X3DCoordinateNode getControlPoint(); // acceptable node types #1: X3DCoordinateNode

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>controlPoint</i>.
	 * @param newValue is new value for the controlPoint field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setControlPoint(X3DCoordinateNode newValue); // acceptable node types #2: X3DCoordinateNode

	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata(); // acceptable node types #1: X3DMetadataObject

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public X3DNurbsSurfaceGeometryNode setMetadata(X3DMetadataObject newValue); // acceptable node types #2: X3DMetadataObject

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>solid</i>.
	 * @return value of solid field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getSolid();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * @param newValue is new value for the solid field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setSolid(boolean newValue);

	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTextureCoordinateNode|NurbsTextureCoordinate, from inputOutput SFNode field <i>texCoord</i>.
	 * @return value of texCoord field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
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

	 * @param newValue is new value for the texCoord field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setTexCoord(X3DNode newValue); // acceptable node types #2: X3DTextureCoordinateNode|NurbsTextureCoordinate

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>uClosed</i>.
	 * @return value of uClosed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getUClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>uClosed</i>.
	 * @param newValue is new value for the uClosed field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setUClosed(boolean newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>uDimension</i>.
	 * @return value of uDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getUDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uDimension</i>.
	 * @param newValue is new value for the uDimension field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setUDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>uKnot</i>.
	 * @return value of uKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public double[] getUKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>uKnot</i>.
	 * @param newValue is new value for the uKnot field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setUKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>uOrder</i>.
	 * @return value of uOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getUOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uOrder</i>.
	 * @param newValue is new value for the uOrder field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setUOrder(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>uTessellation</i>.
	 * @return value of uTessellation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getUTessellation();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>uTessellation</i>.
	 * @param newValue is new value for the uTessellation field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setUTessellation(int newValue);

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>vClosed</i>.
	 * @return value of vClosed field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public boolean getVClosed();

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>vClosed</i>.
	 * @param newValue is new value for the vClosed field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setVClosed(boolean newValue);

	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>vDimension</i>.
	 * @return value of vDimension field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getVDimension();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vDimension</i>.
	 * @param newValue is new value for the vDimension field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setVDimension(int newValue);

	/**
	 * Provide array of double results from initializeOnly MFDouble field named <i>vKnot</i>.
	 * @return value of vKnot field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public double[] getVKnot();

	/**
	 * Accessor method to assign double array to initializeOnly MFDouble field named <i>vKnot</i>.
	 * @param newValue is new value for the vKnot field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setVKnot(double[] newValue);

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>vOrder</i>.
	 * @return value of vOrder field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getVOrder();

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vOrder</i>.
	 * @param newValue is new value for the vOrder field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setVOrder(int newValue);

	/**
	 * Provide int value from inputOutput SFInt32 field named <i>vTessellation</i>.
	 * @return value of vTessellation field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public int getVTessellation();

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>vTessellation</i>.
	 * @param newValue is new value for the vTessellation field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setVTessellation(int newValue);

	/**
	 * Provide array of double results within allowed range of (0,infinity) from inputOutput MFDouble field named <i>weight</i>.
	 * @return value of weight field
	 */
// ($isInterface=true, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=, $additionalInheritanceBaseType=)
	public double[] getWeight();

	/**
	 * Accessor method to assign double array to inputOutput MFDouble field named <i>weight</i>.
	 * @param newValue is new value for the weight field.
	 * @return {@link X3DNurbsSurfaceGeometryNode} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public X3DNurbsSurfaceGeometryNode setWeight(double[] newValue);

}
