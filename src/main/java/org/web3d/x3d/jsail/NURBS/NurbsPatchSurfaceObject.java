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

package org.web3d.x3d.jsail.NURBS;
import java.util.*;
import org.web3d.x3d.sai.*;  // making sure #2
import org.web3d.x3d.jsail.fields.*; // making sure #4
import org.web3d.x3d.sai.NURBS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Rendering.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Rendering.*;
import org.web3d.x3d.sai.NURBS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.NURBS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.Core.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.Core.*;

/**
 * NurbsPatchSurface defines a contiguous 3D Non-Uniform Rational B-Spline (NURBS) surface.
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  [X3DNurbsSurfaceGeometryNode] NurbsPatchSurface defines a contiguous 3D Non-Uniform Rational B-Spline (NURBS) surface.  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsPatchSurface" target="blank">X3D Abstract Specification: NurbsPatchSurface</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsPatchSurface" target="_blank">X3D Tooltips: NurbsPatchSurface</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class NurbsPatchSurfaceObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.NURBS.NurbsPatchSurface
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=controlPoint, @type=SFNode, $javaType=X3DCoordinateNode, $javaReferenceType=X3DCoordinateNode, $javaPrimitiveType=X3DCoordinateNode, $normalizedMemberObjectName=controlPoint, $isX3dStatement=false, @acceptableNodeTypes=X3DCoordinateNode */ 
	private X3DCoordinateNode controlPoint; // SFNode acceptable node types: X3DCoordinateNode or ProtoInstanceObject
	private ProtoInstanceObject controlPointProtoInstance; // allowed alternative for controlPoint field

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=solid, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=solid, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean solid; // SFBool

 /* @name=texCoord, @type=SFNode, $javaType=X3DNode, $javaReferenceType=X3DNode, $javaPrimitiveType=X3DNode, $normalizedMemberObjectName=texCoord, $isX3dStatement=false, @acceptableNodeTypes=X3DTextureCoordinateNode|NurbsTextureCoordinate */ 
	private X3DNode texCoord; // SFNode acceptable node types: X3DTextureCoordinateNode|NurbsTextureCoordinate or ProtoInstanceObject
	private ProtoInstanceObject texCoordProtoInstance; // allowed alternative for texCoord field

 /* @name=uClosed, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=uClosed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean uClosed; // SFBool

 /* @name=uDimension, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=uDimension, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int uDimension; // SFInt32

 /* @name=uKnot, @type=MFDouble, $javaType=ArrayList<Double>, $javaReferenceType=Double, $javaPrimitiveType=ArrayList<Double>, $normalizedMemberObjectName=uKnot, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Double> uKnot = new ArrayList<>(); // MFDouble

 /* @name=uOrder, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=uOrder, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int uOrder; // SFInt32

 /* @name=uTessellation, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=uTessellation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int uTessellation; // SFInt32

 /* @name=vClosed, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=vClosed, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean vClosed; // SFBool

 /* @name=vDimension, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=vDimension, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int vDimension; // SFInt32

 /* @name=vKnot, @type=MFDouble, $javaType=ArrayList<Double>, $javaReferenceType=Double, $javaPrimitiveType=ArrayList<Double>, $normalizedMemberObjectName=vKnot, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Double> vKnot = new ArrayList<>(); // MFDouble

 /* @name=vOrder, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=vOrder, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int vOrder; // SFInt32

 /* @name=vTessellation, @type=SFInt32, $javaType=int, $javaReferenceType=int, $javaPrimitiveType=int, $normalizedMemberObjectName=vTessellation, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private int vTessellation; // SFInt32

 /* @name=weight, @type=MFDouble, $javaType=ArrayList<Double>, $javaReferenceType=Double, $javaPrimitiveType=ArrayList<Double>, $normalizedMemberObjectName=weight, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private ArrayList<Double> weight = new ArrayList<>(); // MFDouble

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>NurbsPatchSurface</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "NurbsPatchSurface";

	/** Provides name of this element: <i>NurbsPatchSurface</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>NurbsPatchSurface</i> element: <i>NURBS</i> */
	public static final String COMPONENT = "NURBS";

	/** Defines X3D component for the <i>NurbsPatchSurface</i> element: <i>NURBS</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>NURBS</i> component level for this element: <i>1</i> */
	public static final int LEVEL = 1;

	/** Provides default X3D component level for this element: <i>1</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFNode field named <i>controlPoint</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DCoordinateNode CONTROLPOINT_DEFAULT_VALUE = null;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFBool field named <i>solid</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean SOLID_DEFAULT_VALUE = true;

	/** SFNode field named <i>texCoord</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNode TEXCOORD_DEFAULT_VALUE = null;

	/** SFBool field named <i>uClosed</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean UCLOSED_DEFAULT_VALUE = false;

	/** SFInt32 field named <i>uDimension</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int UDIMENSION_DEFAULT_VALUE = 0;

	/** MFDouble field named <i>uKnot</i> has default value equal to an empty list. */
	public static final ArrayList<Double> UKNOT_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFInt32 field named <i>uOrder</i> has default value <i>3</i> (Java syntax) or <i>3</i> (XML syntax). */
	public static final int UORDER_DEFAULT_VALUE = 3;

	/** SFInt32 field named <i>uTessellation</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int UTESSELLATION_DEFAULT_VALUE = 0;

	/** SFBool field named <i>vClosed</i> has default value <i>false</i> (Java syntax) or <i>false</i> (XML syntax). */
	public static final boolean VCLOSED_DEFAULT_VALUE = false;

	/** SFInt32 field named <i>vDimension</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int VDIMENSION_DEFAULT_VALUE = 0;

	/** MFDouble field named <i>vKnot</i> has default value equal to an empty list. */
	public static final ArrayList<Double> VKNOT_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** SFInt32 field named <i>vOrder</i> has default value <i>3</i> (Java syntax) or <i>3</i> (XML syntax). */
	public static final int VORDER_DEFAULT_VALUE = 3;

	/** SFInt32 field named <i>vTessellation</i> has default value <i>0</i> (Java syntax) or <i>0</i> (XML syntax). */
	public static final int VTESSELLATION_DEFAULT_VALUE = 0;

	/** MFDouble field named <i>weight</i> has default value equal to an empty list. */
	public static final ArrayList<Double> WEIGHT_DEFAULT_VALUE = new ArrayList<>(Arrays.asList());

	/** Indicate type corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_TYPE
	 * @return X3D type (SFvec3f etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE if not recognized
	 */
	@Override		
	public String getFieldType(String fieldName)
	{
		String result;

		switch (fieldName)
		{
			// String constants for exact field type values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing type-matching checks
											
			case "containerField":
				result = "SFString";
				break;
			case "controlPoint":
				result = "SFNode";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "solid":
				result = "SFBool";
				break;
			case "texCoord":
				result = "SFNode";
				break;
			case "uClosed":
				result = "SFBool";
				break;
			case "uDimension":
				result = "SFInt32";
				break;
			case "uKnot":
				result = "MFDouble";
				break;
			case "uOrder":
				result = "SFInt32";
				break;
			case "uTessellation":
				result = "SFInt32";
				break;
			case "vClosed":
				result = "SFBool";
				break;
			case "vDimension":
				result = "SFInt32";
				break;
			case "vKnot":
				result = "MFDouble";
				break;
			case "vOrder":
				result = "SFInt32";
				break;
			case "vTessellation":
				result = "SFInt32";
				break;
			case "weight":
				result = "MFDouble";
				break;
			case "DEF":
				result = "SFString";
				break;
			case "USE":
				result = "SFString";
				break;
			case "class":
				result = "SFString";
				break;
			default:
			{
				// if fieldName has a prefix "set_" prepended (or a suffix "_changed" appended) then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getFieldType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getFieldType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_TYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** Indicate accessType corresponding to given fieldName.
	 * @param fieldName name of field in this X3D node
	 * @see ConfigurationProperties#ERROR_UNKNOWN_FIELD_ACCESSTYPE
	 * @return X3D accessType (inputOnly etc.), otherwise ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE if not recognized
	 */
	@Override
	public String getAccessType(String fieldName)
	{
		String result; // set by following checks
		switch (fieldName)
		{
			// String constants for field accessType values matching X3D Schema definitions,
			// thus avoiding spelling errors and allowing accessType-matching checks
			case "controlPoint":
				result = "inputOutput";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "solid":
				result = "initializeOnly";
				break;
			case "texCoord":
				result = "inputOutput";
				break;
			case "uClosed":
				result = "initializeOnly";
				break;
			case "uDimension":
				result = "initializeOnly";
				break;
			case "uKnot":
				result = "initializeOnly";
				break;
			case "uOrder":
				result = "initializeOnly";
				break;
			case "uTessellation":
				result = "inputOutput";
				break;
			case "vClosed":
				result = "initializeOnly";
				break;
			case "vDimension":
				result = "initializeOnly";
				break;
			case "vKnot":
				result = "initializeOnly";
				break;
			case "vOrder":
				result = "initializeOnly";
				break;
			case "vTessellation":
				result = "inputOutput";
				break;
			case "weight":
				result = "inputOutput";
				break;
			case "DEF":
				result = "inputOutput";
				break;
			case "USE":
				result = "inputOutput";
				break;
			case "class":
				result = "inputOutput";
				break;
			default:
			{
				// if user has added a prefix "set_" or suffix "_changed" then try again by stripping it and recursing once
				if      (fieldName.trim().startsWith("set_"))
						 result = getAccessType(fieldName.trim().substring(4)); // after "set_"
				else if (fieldName.trim().endsWith("_changed"))
						 result = getAccessType(fieldName.trim().substring(0, fieldName.length() - 8)); // before "_changed"
				else     result = ConfigurationProperties.ERROR_UNKNOWN_FIELD_ACCESSTYPE; // unique return value avoids mistaken matches
			}
		}
		return result;
	}

	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
	 */
	public static final String containerField_DEFAULT_VALUE = "geometry"; // type xs:NMTOKEN
	/** containerField describes typical field relationship of a node to its parent.
	 * Usage is not ordinarily needed when using this API, default value is provided for informational purposes.
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#containerField">X3D Scene Authoring Hints: containerField</a>
	 * @see <a href="https://www.web3d.org/specifications/X3DUOM.html">X3D Unified Object Model (X3DUOM)</a>
     * @return default containerField value            
	 */
    @Override
    public final String getContainerFieldDefault()
    {
        return containerField_DEFAULT_VALUE;
    }

	// String constants for field names usable in ROUTE statements

	/** fromField ROUTE name for SFNode field named <i>controlPoint</i>. */
	public static final String fromField_CONTROLPOINT = "controlPoint";

	/** toField ROUTE name for SFNode field named <i>controlPoint</i>. */
	public static final String toField_CONTROLPOINT = "controlPoint";

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFNode field named <i>texCoord</i>. */
	public static final String fromField_TEXCOORD = "texCoord";

	/** toField ROUTE name for SFNode field named <i>texCoord</i>. */
	public static final String toField_TEXCOORD = "texCoord";

	/** fromField ROUTE name for SFInt32 field named <i>uTessellation</i>. */
	public static final String fromField_UTESSELLATION = "uTessellation";

	/** toField ROUTE name for SFInt32 field named <i>uTessellation</i>. */
	public static final String toField_UTESSELLATION = "uTessellation";

	/** fromField ROUTE name for SFInt32 field named <i>vTessellation</i>. */
	public static final String fromField_VTESSELLATION = "vTessellation";

	/** toField ROUTE name for SFInt32 field named <i>vTessellation</i>. */
	public static final String toField_VTESSELLATION = "vTessellation";

	/** fromField ROUTE name for MFDouble field named <i>weight</i>. */
	public static final String fromField_WEIGHT = "weight";

	/** toField ROUTE name for MFDouble field named <i>weight</i>. */
	public static final String toField_WEIGHT = "weight";

	/** Constructor for NurbsPatchSurfaceObject to initialize member variables with default values. */
	public NurbsPatchSurfaceObject()
	{
		super(); // constructor invocation and corresponding initialize()
		initialize();
	}

	/** Initialize all member variables to default values. */
	@Override
	public final void initialize()
	{
		super.initialize();

        setContainerFieldOverride(""); // ensuring default value used
		containerField_ALTERNATE_VALUES = new String[] { "geometry" }; // type xs:NMTOKEN

		controlPoint = null;              // clear out any prior node
		controlPointProtoInstance = null; // clear out any prior node
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		solid = SOLID_DEFAULT_VALUE;
		texCoord = null;              // clear out any prior node
		texCoordProtoInstance = null; // clear out any prior node
		uClosed = UCLOSED_DEFAULT_VALUE;
		uDimension = UDIMENSION_DEFAULT_VALUE;
		uKnot = new ArrayList<>();
		uOrder = UORDER_DEFAULT_VALUE;
		uTessellation = UTESSELLATION_DEFAULT_VALUE;
		vClosed = VCLOSED_DEFAULT_VALUE;
		vDimension = VDIMENSION_DEFAULT_VALUE;
		vKnot = new ArrayList<>();
		vOrder = VORDER_DEFAULT_VALUE;
		vTessellation = VTESSELLATION_DEFAULT_VALUE;
		weight = new ArrayList<>();

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide X3DCoordinateNode instance (using a properly typed node) from inputOutput SFNode field <i>controlPoint</i>.
	 * @see #getControlPointProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @return value of controlPoint field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DCoordinateNode getControlPoint()
	{
		return controlPoint;
	}

	/**
	 * Accessor method to assign X3DCoordinateNode instance (using a properly typed node) to inputOutput SFNode field <i>controlPoint</i>.
	 * @see #setControlPoint(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DCoordinateNode] Single contained Coordinate or CoordinateDouble node that specifies control points for NURBS geometry definitions.  * <br>

	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setControlPoint(X3DCoordinateNode newValue)
	{
		// set-newValue-validity-checks #0
		controlPoint = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) controlPoint).setParentObject(this); // parentTest15
		}
		if (controlPointProtoInstance != null)
		{
			controlPointProtoInstance.setParentObject(null); // housekeeping, clear prior object
			controlPointProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of controlPoint field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsPatchSurfaceObject clearControlPoint()
	{
		((X3DConcreteElement) controlPoint).clearParentObject(); // remove references to facilitate Java memory management
		controlPoint = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>controlPoint</i>.
	 * @see #setControlPoint(X3DCoordinateNode)
	 * @param newValue is new value for the controlPoint field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setControlPoint(ProtoInstanceObject newValue)
	{
		if (controlPointProtoInstance != null)
		{
			((X3DConcreteElement) controlPointProtoInstance).setParentObject(null); // parentTest15.5
	    }
		controlPointProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) controlPointProtoInstance).setParentObject(this); // parentTest15.6
            controlPointProtoInstance.setContainerField("controlPoint");
	    }
		if (controlPoint != null)
		{
			((X3DConcreteElement) controlPoint).setParentObject(null); // housekeeping, clear prior object
			controlPoint = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getControlPointProtoInstance()
		{
			return controlPointProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>controlPoint</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getControlPoint()
	 * @see #getControlPointProtoInstance()
	 */
	public boolean hasControlPoint()
	{
		return (controlPoint != null) || (controlPointProtoInstance != null);
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setIS(ISObject newValue)
	{
		// set-newValue-validity-checks #0
		IS = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) IS).setParentObject(this); // parentTest15
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of IS field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsPatchSurfaceObject clearIS()
	{
		((X3DConcreteElement) IS).clearParentObject(); // remove references to facilitate Java memory management
		IS = null; // reset SFNode field
		return this;
	}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>IS</i>.
	 * @return whether a concrete statement or CommentsBlock is available.
	 * @see #getIS()
	 */
	public boolean hasIS()
	{
		return (IS != null);
	}
	/**
	 * Provide X3DMetadataObject instance (using a properly typed node) from inputOutput SFNode field <i>metadata</i>.
	 * @see #getMetadataProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @return value of metadata field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DMetadataObject getMetadata()
	{
		return metadata;
	}

	/**
	 * Accessor method to assign X3DMetadataObject instance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i> [X3DMetadataObject] Information about this node can be contained in a MetadataBoolean, MetadataDouble, MetadataFloat, MetadataInteger, MetadataString or MetadataSet node.
 * <ul>
 *  <li> <i> Hint:</i>  X3D Architecture 7.2.4 Metadata <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata" target="_blank">https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#Metadata</a> </li> 
 * </ul>
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 * @param newValue is new value for the metadata field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setMetadata(X3DMetadataObject newValue)
	{
		// set-newValue-validity-checks #0
		metadata = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadata).setParentObject(this); // parentTest15
		}
		if (metadataProtoInstance != null)
		{
			metadataProtoInstance.setParentObject(null); // housekeeping, clear prior object
			metadataProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of metadata field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsPatchSurfaceObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setMetadata(ProtoInstanceObject newValue)
	{
		if (metadataProtoInstance != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(null); // parentTest15.5
	    }
		metadataProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) metadataProtoInstance).setParentObject(this); // parentTest15.6
            metadataProtoInstance.setContainerField("metadata");
	    }
		if (metadata != null)
		{
			((X3DConcreteElement) metadata).setParentObject(null); // housekeeping, clear prior object
			metadata = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getMetadataProtoInstance()
		{
			return metadataProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>metadata</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getMetadata()
	 * @see #getMetadataProtoInstance()
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#Metadata" target="_blank">X3D Scene Authoring Hints: Metadata Nodes</a>
	 */
	public boolean hasMetadata()
	{
		return (metadata != null) || (metadataProtoInstance != null);
	}
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getSolid()
	{
		return solid;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>solid</i>.
	 * <br><br>
	 * <i>Tooltip:</i> Setting solid true means draw only one side of polygons (backface culling on), setting solid false means draw both sides of polygons (backface culling off).
 * <ul>
 *  <li> <i>Warning:</i> default value true can completely hide geometry if viewed from wrong side! </li> 
 *  <li> <i>Hint:</i>  if in doubt, use solid='false' for maximum visibility. </li> 
 * </ul>
	 * @param newValue is new value for the solid field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setSolid(boolean newValue)
	{
		// set-newValue-validity-checks #0
		solid = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool solid field, similar to {@link #setSolid(boolean)}.
	 * @param newValue is new value for the solid field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setSolid(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSolid(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide X3DNode instance (using a properly typed node) with acceptable node types limited to X3DTextureCoordinateNode|NurbsTextureCoordinate, from inputOutput SFNode field <i>texCoord</i>.
	 * @see #getTexCoordProtoInstance()
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode|NurbsTextureCoordinate] Single contained NurbsTextureCoordinate, TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @return value of texCoord field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNode getTexCoord()
	{
		return texCoord;
	}

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

	 * @see #setTexCoord(ProtoInstanceObject)
	 * <br><br>
	 * <i>Tooltip:</i>  [X3DTextureCoordinateNode|NurbsTextureCoordinate] Single contained NurbsTextureCoordinate, TextureCoordinate, TextureCoordinateGenerator or MultiTextureCoordinate node that specifies coordinates for texture mapping onto corresponding geometry.  * <br>

	 * @param newValue is new value for the texCoord field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setTexCoord(X3DNode newValue)
	{
		// set-newValue-validity-checks #0
		texCoord = newValue;
		// newValueInstanceAcceptableNodeTypesTest checks are needed for methods that override/subset X3DNode interfaces #1
		boolean isNodeTypeAllowed =
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.sai.Texturing.X3DTextureCoordinateNode) || 
				(((X3DConcreteNode)newValue) instanceof org.web3d.x3d.jsail.NURBS.NurbsTextureCoordinateObject);
		if  (!isNodeTypeAllowed)
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("X3DNode newValue is not instanceof " +
				"acceptableNodeTypes X3DTextureCoordinateNode|NurbsTextureCoordinate; newValue=" + newValue);
		}

		if (newValue != null)
		{
			((X3DConcreteElement) texCoord).setParentObject(this); // parentTest15
		}
		if (texCoordProtoInstance != null)
		{
			texCoordProtoInstance.setParentObject(null); // housekeeping, clear prior object
			texCoordProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of texCoord field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsPatchSurfaceObject clearTexCoord()
	{
		((X3DConcreteElement) texCoord).clearParentObject(); // remove references to facilitate Java memory management
		texCoord = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>texCoord</i>.
	 * @see #setTexCoord(X3DNode)
	 * @param newValue is new value for the texCoord field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setTexCoord(ProtoInstanceObject newValue)
	{
		if (texCoordProtoInstance != null)
		{
			((X3DConcreteElement) texCoordProtoInstance).setParentObject(null); // parentTest15.5
	    }
		texCoordProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) texCoordProtoInstance).setParentObject(this); // parentTest15.6
            texCoordProtoInstance.setContainerField("texCoord");
	    }
		if (texCoord != null)
		{
			((X3DConcreteElement) texCoord).setParentObject(null); // housekeeping, clear prior object
			texCoord = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTexCoordProtoInstance()
		{
			return texCoordProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>texCoord</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTexCoord()
	 * @see #getTexCoordProtoInstance()
	 */
	public boolean hasTexCoord()
	{
		return (texCoord != null) || (texCoordProtoInstance != null);
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>uClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @return value of uClosed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getUClosed()
	{
		return uClosed;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>uClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @param newValue is new value for the uClosed field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setUClosed(boolean newValue)
	{
		// set-newValue-validity-checks #0
		uClosed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool uClosed field, similar to {@link #setUClosed(boolean)}.
	 * @param newValue is new value for the uClosed field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUClosed(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUClosed(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @return value of uDimension field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUDimension()
	{
		return uDimension;
	}

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in u dimension.  * <br>

	 * @param newValue is new value for the uDimension field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setUDimension(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface uDimension newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		uDimension = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 uDimension field, similar to {@link #setUDimension(int)}.
	 * @param newValue is new value for the uDimension field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUDimension(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUDimension(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of Double results from initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of uKnot field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getUKnot()
	{
		final double[] valuesArray = new double[uKnot.size()];
		int i = 0;
		for (Double arrayElement : uKnot) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFDouble uKnot field, similar to {@link #getUKnot()}.
	 * @return value of uKnot field
	 */
	public ArrayList<Double> getUKnotList()
	{
		return uKnot;
	}
	/**
	 * Utility method to get String value of MFDouble uKnot field, similar to {@link #getUKnot()}.
	 * @return value of uKnot field
	 */
	public String getUKnotString()
    {
        StringBuilder result = new StringBuilder();
		for (Double arrayElement : uKnot) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Double array to initializeOnly MFDouble field named <i>uKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setUKnot(double[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearUKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearUKnot(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			uKnot.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFDouble uKnot field, similar to {@link #setUKnot(double[])}.
	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUKnot(MFDoubleObject newValue)
	{
		if (newValue == null)		{
			clearUKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUKnot(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFDouble uKnot field, similar to {@link #setUKnot(double[])}.
	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUKnot(ArrayList<Double> newValue)
	{
		if (newValue == null)		{
			clearUKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearUKnot(); // reset
        else
        {
            double[] newArray = new double[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setUKnot(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFDouble value of uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public NurbsPatchSurfaceObject clearUKnot()
	{
		uKnot.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFDouble uKnot field, similar to {@link #setUKnot(double[])}.
	 * @param newValue is new value for the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUKnot(int[] newValue)
	{
		if (newValue == null)		{
			clearUKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		double[] holdArray = new double[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (double)newValue[i];
		}
		setUKnot(holdArray);
		return this;
	}

	/**
	 * Add singleton double value to MFDouble uKnot field.
	 * @param newValue is new value to add to the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addUKnot(double newValue)
	{
		uKnot.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFDoubleObject value to MFDouble uKnot field.
	 * @param newValue is new value to add to the uKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addUKnot(SFDoubleObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		uKnot.add(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of uOrder field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUOrder()
	{
		return uOrder;
	}

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>uOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the uOrder field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setUOrder(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 2) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface uOrder newValue=" + newValue + " has component value less than restriction minInclusive=2");
        }
		uOrder = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 uOrder field, similar to {@link #setUOrder(int)}.
	 * @param newValue is new value for the uOrder field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUOrder(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUOrder(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>uTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @return value of uTessellation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getUTessellation()
	{
		return uTessellation;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>uTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @param newValue is new value for the uTessellation field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setUTessellation(int newValue)
	{
		// set-newValue-validity-checks #0
		uTessellation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 uTessellation field, similar to {@link #setUTessellation(int)}.
	 * @param newValue is new value for the uTessellation field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUTessellation(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUTessellation(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>vClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @return value of vClosed field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getVClosed()
	{
		return vClosed;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>vClosed</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Whether opposite surface sides are closed (seamless) across u dimension.  * <br>

	 * @param newValue is new value for the vClosed field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setVClosed(boolean newValue)
	{
		// set-newValue-validity-checks #0
		vClosed = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool vClosed field, similar to {@link #setVClosed(boolean)}.
	 * @param newValue is new value for the vClosed field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVClosed(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVClosed(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value within allowed range of [0,infinity) from initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @return value of vDimension field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVDimension()
	{
		return vDimension;
	}

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vDimension</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Number of control points in v dimension.  * <br>

	 * @param newValue is new value for the vDimension field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setVDimension(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 0) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface vDimension newValue=" + newValue + " has component value less than restriction minInclusive=0");
        }
		vDimension = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 vDimension field, similar to {@link #setVDimension(int)}.
	 * @param newValue is new value for the vDimension field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVDimension(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVDimension(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of Double results from initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @return value of vKnot field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getVKnot()
	{
		final double[] valuesArray = new double[vKnot.size()];
		int i = 0;
		for (Double arrayElement : vKnot) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFDouble vKnot field, similar to {@link #getVKnot()}.
	 * @return value of vKnot field
	 */
	public ArrayList<Double> getVKnotList()
	{
		return vKnot;
	}
	/**
	 * Utility method to get String value of MFDouble vKnot field, similar to {@link #getVKnot()}.
	 * @return value of vKnot field
	 */
	public String getVKnotString()
    {
        StringBuilder result = new StringBuilder();
		for (Double arrayElement : vKnot) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Double array to initializeOnly MFDouble field named <i>vKnot</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  knot vector, where size = number of control points + order of curve.  * <br>

	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setVKnot(double[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearVKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearVKnot(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			vKnot.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFDouble vKnot field, similar to {@link #setVKnot(double[])}.
	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVKnot(MFDoubleObject newValue)
	{
		if (newValue == null)		{
			clearVKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVKnot(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFDouble vKnot field, similar to {@link #setVKnot(double[])}.
	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVKnot(ArrayList<Double> newValue)
	{
		if (newValue == null)		{
			clearVKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearVKnot(); // reset
        else
        {
            double[] newArray = new double[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setVKnot(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFDouble value of vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public NurbsPatchSurfaceObject clearVKnot()
	{
		vKnot.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFDouble vKnot field, similar to {@link #setVKnot(double[])}.
	 * @param newValue is new value for the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVKnot(int[] newValue)
	{
		if (newValue == null)		{
			clearVKnot(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		double[] holdArray = new double[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (double)newValue[i];
		}
		setVKnot(holdArray);
		return this;
	}

	/**
	 * Add singleton double value to MFDouble vKnot field.
	 * @param newValue is new value to add to the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addVKnot(double newValue)
	{
		vKnot.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFDoubleObject value to MFDouble vKnot field.
	 * @param newValue is new value to add to the vKnot field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addVKnot(SFDoubleObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		vKnot.add(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Provide int value within allowed range of [2,infinity) from initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @return value of vOrder field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVOrder()
	{
		return vOrder;
	}

	/**
	 * Accessor method to assign int value to initializeOnly SFInt32 field named <i>vOrder</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  define order of surface by polynomials of degree = order-1.  * <br>

	 * @param newValue is new value for the vOrder field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setVOrder(int newValue)
	{
		// set-newValue-validity-checks #0
        // Check that newValue parameter has legal value(s) before assigning to scene graph
        if (newValue < 2) {
            throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface vOrder newValue=" + newValue + " has component value less than restriction minInclusive=2");
        }
		vOrder = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 vOrder field, similar to {@link #setVOrder(int)}.
	 * @param newValue is new value for the vOrder field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVOrder(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVOrder(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide int value from inputOutput SFInt32 field named <i>vTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @return value of vTessellation field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public int getVTessellation()
	{
		return vTessellation;
	}

	/**
	 * Accessor method to assign int value to inputOutput SFInt32 field named <i>vTessellation</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  hint for surface tesselation.  * <br>

	 * @param newValue is new value for the vTessellation field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setVTessellation(int newValue)
	{
		// set-newValue-validity-checks #0
		vTessellation = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFInt32 vTessellation field, similar to {@link #setVTessellation(int)}.
	 * @param newValue is new value for the vTessellation field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setVTessellation(SFInt32Object newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setVTessellation(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide array of Double results within allowed range of (0,infinity) from inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @return value of weight field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public double[] getWeight()
	{
		final double[] valuesArray = new double[weight.size()];
		int i = 0;
		for (Double arrayElement : weight) {
			valuesArray[i++] = arrayElement;
		}
		return valuesArray;
	}
	/**
	 * Utility method to get ArrayList value of MFDouble weight field, similar to {@link #getWeight()}.
	 * @return value of weight field
	 */
	public ArrayList<Double> getWeightList()
	{
		return weight;
	}
	/**
	 * Utility method to get String value of MFDouble weight field, similar to {@link #getWeight()}.
	 * @return value of weight field
	 */
	public String getWeightString()
    {
        StringBuilder result = new StringBuilder();
		for (Double arrayElement : weight) {
			result.append(arrayElement.toString());
			result.append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Accessor method to assign Double array to inputOutput MFDouble field named <i>weight</i>.
	 * <br><br>
	 * <i>Tooltip:</i>  Vector assigning relative weight value to each control point.  * <br>

	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsPatchSurfaceObject setWeight(double[] newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)		{
			clearWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		clearWeight(); // reset
		for (int i = 0; i < newValue.length; i++)
		{
			weight.add(newValue[i]);
		}

		return this;
	}

	/**
	 * Assign typed object value to MFDouble weight field, similar to {@link #setWeight(double[])}.
	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setWeight(MFDoubleObject newValue)
	{
		if (newValue == null)		{
			clearWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setWeight(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Assign ArrayList value of MFDouble weight field, similar to {@link #setWeight(double[])}.
	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setWeight(ArrayList<Double> newValue)
	{
		if (newValue == null)		{
			clearWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #4
        if (newValue.isEmpty())
            clearWeight(); // reset
        else
        {
            double[] newArray = new double[newValue.size()];
            for (int i = 0; i < newValue.size(); i++)
                newArray[i] = newValue.get(i);
            setWeight(newArray);
        }
		return this;
	}
	/**
	 * Utility method to clear MFDouble value of weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	public NurbsPatchSurfaceObject clearWeight()
	{
		weight.clear(); // reset MF field
		return this;
	}
	/**
	 * Assign floating-point array value of MFDouble weight field, similar to {@link #setWeight(double[])}.
	 * @param newValue is new value for the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setWeight(int[] newValue)
	{
		if (newValue == null)		{
			clearWeight(); // newValueNullSetDEFAULT_VALUE
			return this;
		}
		// set-newValue-validity-checks #5
		double[] holdArray = new double[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			holdArray[i] = (double)newValue[i];
		}
		setWeight(holdArray);
		return this;
	}

	/**
	 * Add singleton double value to MFDouble weight field.
	 * @param newValue is new value to add to the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addWeight(double newValue)
	{
		weight.add(newValue); // add simple type if tupleSize = 1
		return this;
	}
	/**
	 * Add singleton SFDoubleObject value to MFDouble weight field.
	 * @param newValue is new value to add to the weight field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject addWeight(SFDoubleObject newValue)
	{
		if (newValue == null)
		{
			return this; // nothing to do
		}
		weight.add(newValue.getPrimitiveValue());
		return this;
	}

	/**
	 * Provide String value from inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * @return value of DEF field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public String getDEF()
	{
		// override abstract method in X3DConcreteNode
		return super.getDEF();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>DEF</i>.
	 * <br><br>
	 * <i>Tooltip:</i> DEF defines a unique ID name for this node, referenceable by other nodes.
 * <ul>
 *  <li> <i>Hint:</i> descriptive DEF names improve clarity and help document a model. </li> 
 *  <li> <i>Hint:</i> well-defined names can simplify design and debugging through improved author understanding. </li> 
 *  <li> <i>Hint:</i>  X3D Scene Authoring Hints, Naming Conventions <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions" target="_blank">https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html#NamingConventions</a> </li> 
 * </ul>
	 * <br><br>
	 *  Note that setting the DEF value clears the USE value.
	 * @param newValue is new value for the DEF field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsPatchSurfaceObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to NurbsPatchSurface DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface DEF newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteUSE(""); // ensure that no previous USE value remains
		setConcreteDEF(newValue); // private superclass methods
		return this;
	}

	/**
	 * Assign typed object value to SFString DEF field, similar to {@link #setDEF(String)}.
	 * @param newValue is new value for the DEF field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setDEF(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setDEF(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * @return value of USE field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public String getUSE()
	{
		// override abstract method in X3DConcreteNode
		return super.getUSE();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>USE</i>.
	 * <br><br>
	 * <i>Tooltip:</i> USE means reuse an already DEF-ed node ID, excluding all child nodes and all other attributes (except for containerField, which can have a different value).
 * <ul>
 *  <li> <i>Hint:</i> USE references to previously defined DEF geometry (instead of duplicating nodes) can improve performance. </li> 
 *  <li> <i>Warning:</i> do NOT include any child nodes, a DEF attribute, or any other attribute values (except for containerField) when defining a USE attribute. </li> 
 *  <li> <i>Warning:</i>  each USE value must match a corresponding DEF value that is defined earlier in the scene. </li> 
 * </ul>
	 * <br><br>
	 * <i>Note:</i> each <code>USE</code> node is still an independent object, with the <code>USE</code> value matching the <code>DEF</code> value in the preceding object. 
	 * <br><br>
	 * <i>Warning:</i> invoking the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.<br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param newValue is new value for the USE field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsPatchSurfaceObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to NurbsPatchSurface USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsPatchSurface USE newValue='" + newValue + "'" + 
				" has illegal name value, cannot be empty and must be defined with valid NMTOKEN name string" + 
				" (with legal characters and no embedded whitespace).");
		}
		setConcreteDEF(""); // ensure that no previous DEF value remains
		setConcreteUSE(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString USE field, similar to {@link #setUSE(String)}.
	 * @param newValue is new value for the USE field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUSE(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setUSE(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide String value from inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @return value of class field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DNurbsSurfaceGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public String getCssClass()
	{
		// override abstract method in X3DConcreteNode
		return super.getCssClass();
	}

	/**
	 * Accessor method to assign String value to inputOutput SFString field named <i>class</i>.
	 * <br><br>
	 * <i>Tooltip:</i> The class attribute is a space-separated list of classes, reserved for use by CSS cascading stylesheets.
 * <ul>
 *  <li> <i>Warning:</i> currently the class attribute is only supported in XML encoding of X3D scenes. </li> 
 *  <li> <i>Hint:</i>  W3C Cascading Style Sheets <a href="https://www.w3.org/Style/CSS" target="_blank">https://www.w3.org/Style/CSS</a> </li> 
 * </ul>
	 * @param newValue is new value for the class field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsPatchSurfaceObject setCssClass(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #5
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment
		setConcreteCssClass(newValue); // private superclass method
		return this;
	}

	/**
	 * Assign typed object value to SFString cssClass field, similar to {@link #setCssClass(String)}.
	 * @param newValue is new value for the class field.
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setCssClass(SFStringObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCssClass(newValue.getPrimitiveValue());
			return this;
	}

	// Additional utility methods for this class ==============================

	/**
	 * Assign a USE reference to another DEF node of same node type, similar to {@link #setUSE(String)}.
	 * <br ><br >
	 * <i>Warning:</i> note that the <code>setUSE()</code> method on this node resets all other fields to their default values (except for containerField) and also releases all child nodes.
	 * <br><br>
	 * <i>Warning:</i> no other operations can be performed to modify a USE node other than setting an alternate containerField value.
	 * @param DEFnode must have a DEF value defined
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsPatchSurfaceObject setUSE(NurbsPatchSurfaceObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on NurbsPatchSurfaceObject" +
				" that has no DEF name defined, thus a copy cannot be referenced as a USE node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		setUSE(DEFnode.getDEF());
		return this;
	}
	/**
	 * Utility constructor that assigns DEF label after initializing member variables with default values.
	 * @param DEFlabel unique DEF name for this X3D node
	 */
	public NurbsPatchSurfaceObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public NurbsPatchSurfaceObject addComments (String newComment)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(\"" + newComment + "\")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.add(newComment);
		return this;
	}
	/**
	 * Add comments as String[] array to contained commentsList.
	 * @param newComments array of comments
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public NurbsPatchSurfaceObject addComments (String[] newComments)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(" + Arrays.toString(newComments) + ")" + "\n" +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(Arrays.asList(newComments));
		return this;
	}
	/**
	 * Add CommentsBlock to contained commentsList.
	 * @param newCommentsBlock block of comments to add
	 * @return {@link NurbsPatchSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public NurbsPatchSurfaceObject addComments (CommentsBlock newCommentsBlock)
	{
		if (isUSE())
		{
			String errorNotice = "addComments(CommentsBlock) " +
					"cannot be applied to a USE node (USE='" + getUSE() + "') which only contains a reference to a DEF node";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
								
		commentsList.addAll(newCommentsBlock.toStringList());
		return this;
	}
		
	/**
	 * Recursive method to provide X3D string serialization of this model subgraph, utilizing XML encoding and conforming to X3D Canonical Form.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_X3D
	 * @see X3DObject#FILE_EXTENSION_XML
	 * @see X3DObject#toStringXML()
	 * @see X3DObject#toFileXML(String)
	 * @see X3DObject#toFileX3D(String)
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-1/V3.3/Part01/X3D_XML.html">X3D XML Encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-3/V3.3/Part03/concepts.html#X3DCanonicalForm" target="blank">X3D Compressed Binary Encoding: X3D Canonical Form</a>
	 * @see <a href="https://www.web3d.org/x3d/tools/canonical/doc/x3dTools.htm">X3D Canonicalization (C14N) Tool</a>
	 * @return X3D string
	 */
	@Override
	public String toStringX3D(int indentLevel)
	{
		boolean hasAttributes = true; // TODO check for non-default attribute values
		boolean      hasChild = (IS != null) || (controlPoint != null) || (controlPointProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (texCoord != null) || (texCoordProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<NurbsPatchSurface"); // start opening tag
		if (hasAttributes)
		{
			if (!getDEF().equals(DEF_DEFAULT_VALUE) && !isUSE())
			{
				stringX3D.append(" DEF='").append(SFStringObject.toString(getDEF())).append("'");
			}
			
			if (!getUSE().equals(USE_DEFAULT_VALUE))
			{
				stringX3D.append(" USE='").append(SFStringObject.toString(getUSE())).append("'");
			}
			
            // containerField is critical for ProtoInstance relationship to parent node
            if (!getContainerFieldOverride().isEmpty() && !getContainerFieldOverride().equals(this.getContainerFieldDefault())) // output if not default ProtoInstance containerField
            {
                    stringX3D.append(" containerField='").append(getContainerFieldOverride()).append("'");
            }

            // test attributes

			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getSolid() != SOLID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" solid='").append(SFBoolObject.toString(getSolid())).append("'");
			}
			if (((getUClosed() != UCLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" uClosed='").append(SFBoolObject.toString(getUClosed())).append("'");
			}
			if (((getUDimension() != UDIMENSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" uDimension='").append(SFInt32Object.toString(getUDimension())).append("'");
			}
			if (((getUKnot().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" uKnot='").append(MFDoubleObject.toString(getUKnot())).append("'");
			}
			if (((getUOrder() != UORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" uOrder='").append(SFInt32Object.toString(getUOrder())).append("'");
			}
			if (((getUTessellation() != UTESSELLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" uTessellation='").append(SFInt32Object.toString(getUTessellation())).append("'");
			}
			if (((getVClosed() != VCLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" vClosed='").append(SFBoolObject.toString(getVClosed())).append("'");
			}
			if (((getVDimension() != VDIMENSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" vDimension='").append(SFInt32Object.toString(getVDimension())).append("'");
			}
			if (((getVKnot().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" vKnot='").append(MFDoubleObject.toString(getVKnot())).append("'");
			}
			if (((getVOrder() != VORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" vOrder='").append(SFInt32Object.toString(getVOrder())).append("'");
			}
			if (((getVTessellation() != VTESSELLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" vTessellation='").append(SFInt32Object.toString(getVTessellation())).append("'");
			}
			if (((getWeight().length > 0) || !ConfigurationProperties.getStripDefaultAttributes()) /* ArrayList */ && !isUSE())
			{
				stringX3D.append(" weight='").append(MFDoubleObject.toString(getWeight())).append("'");
			}
		}
		if ((hasChild) && !isUSE()) // has contained node(s), comment(s), IS/connect and/or source code
		{
			stringX3D.append(">").append("\n"); // finish opening tag

			// recursively iterate over child elements
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringX3D.append(commentsBlock.toStringX3D(indentLevel + indentIncrement));
			}
			if      (metadata != null)
			{
				stringX3D.append(((X3DConcreteElement)metadata).toStringX3D(indentLevel + indentIncrement));
			}
			else if (metadataProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)metadataProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (IS != null)
			{
				stringX3D.append(((X3DConcreteElement)IS).toStringX3D(indentLevel + indentIncrement));
			}
			if      (controlPoint != null)
			{
				stringX3D.append(((X3DConcreteElement)controlPoint).toStringX3D(indentLevel + indentIncrement));
			}
			else if (controlPointProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)controlPointProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (texCoord != null)
			{
				stringX3D.append(((X3DConcreteElement)texCoord).toStringX3D(indentLevel + indentIncrement));
			}
			else if (texCoordProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)texCoordProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</NurbsPatchSurface>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=NurbsPatchSurface, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
	/**
	 * Recursive method to provide ClassicVRML string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_CLASSICVRML
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/X3D_ClassicVRML.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/19776-2/V3.3/Part02/grammar.html">Extensible 3D (X3D) encodings Part 2: Classic VRML encoding, Annex A: Grammar</a>
	 * @return ClassicVRML string
	 */
	@Override
	public String toStringClassicVRML(int indentLevel)
	{
		StringBuilder stringClassicVRML = new StringBuilder();
		boolean hasAttributes = true; // TODO further refinement
		boolean      hasChild = (IS != null) || (controlPoint != null) || (controlPointProtoInstance != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (texCoord != null) || (texCoordProtoInstance != null) || !commentsList.isEmpty();
		if (isUSE())
		{
			hasAttributes = false;
			hasChild      = false; // USE nodes include no other fields
		}
		StringBuilder  indent = new StringBuilder();
		char  indentCharacter = ConfigurationProperties.getIndentCharacter();
		int   indentIncrement = ConfigurationProperties.getIndentIncrement();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		if (!getDEF().equals(DEF_DEFAULT_VALUE))
		{
			stringClassicVRML.append("DEF ").append(SFStringObject.toString(getDEF())).append(" ");
		}
		if (!getUSE().equals(USE_DEFAULT_VALUE))
		{
			 stringClassicVRML.append("USE ").append(SFStringObject.toString(getUSE())).append("\n");
		}
		else // only have further output if not a USE node
		{
			stringClassicVRML.append("NurbsPatchSurface").append(" { "); // define node name, node content follows

			if (hasAttributes || hasChild)
			{
				stringClassicVRML.append("\n").append(indent).append(indentCharacter); // fields for this node follow
			}
			if (hasAttributes)
			{
				boolean hasISconnect = (getIS() != null) && !getIS().getConnectList().isEmpty();
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("class"))
						{
							stringClassicVRML.append(indentCharacter).append("class").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if (!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("# class ").append("\"").append(SFStringObject.toString(getCssClass())).append("\"").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("solid"))
						{
							stringClassicVRML.append(indentCharacter).append("solid").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getSolid() != SOLID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("solid ").append(SFBoolObject.toString(getSolid())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("uClosed"))
						{
							stringClassicVRML.append(indentCharacter).append("uClosed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getUClosed() != UCLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("uClosed ").append(SFBoolObject.toString(getUClosed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("uDimension"))
						{
							stringClassicVRML.append(indentCharacter).append("uDimension").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getUDimension() != UDIMENSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("uDimension ").append(SFInt32Object.toString(getUDimension())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("uKnot"))
						{
							stringClassicVRML.append(indentCharacter).append("uKnot").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getUKnot().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("uKnot ").append("[ ").append(MFDoubleObject.toString(getUKnot())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("uOrder"))
						{
							stringClassicVRML.append(indentCharacter).append("uOrder").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getUOrder() != UORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("uOrder ").append(SFInt32Object.toString(getUOrder())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("uTessellation"))
						{
							stringClassicVRML.append(indentCharacter).append("uTessellation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getUTessellation() != UTESSELLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("uTessellation ").append(SFInt32Object.toString(getUTessellation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("vClosed"))
						{
							stringClassicVRML.append(indentCharacter).append("vClosed").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVClosed() != VCLOSED_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("vClosed ").append(SFBoolObject.toString(getVClosed())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("vDimension"))
						{
							stringClassicVRML.append(indentCharacter).append("vDimension").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVDimension() != VDIMENSION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("vDimension ").append(SFInt32Object.toString(getVDimension())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("vKnot"))
						{
							stringClassicVRML.append(indentCharacter).append("vKnot").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVKnot().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("vKnot ").append("[ ").append(MFDoubleObject.toString(getVKnot())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("vOrder"))
						{
							stringClassicVRML.append(indentCharacter).append("vOrder").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVOrder() != VORDER_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("vOrder ").append(SFInt32Object.toString(getVOrder())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("vTessellation"))
						{
							stringClassicVRML.append(indentCharacter).append("vTessellation").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getVTessellation() != VTESSELLATION_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("vTessellation ").append(SFInt32Object.toString(getVTessellation())).append("\n").append(indent).append(indentCharacter);
				}
				if (hasISconnect)
				{
					for (connectObject element : getIS().getConnectList())
					{
						if (element.getNodeField().equals("weight"))
						{
							stringClassicVRML.append(indentCharacter).append("weight").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getWeight().length > 0) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("weight ").append("[ ").append(MFDoubleObject.toString(getWeight())).append(" ]").append("\n").append(indent).append(indentCharacter);
				}
			}
		}
		if (hasChild) // has contained node(s), comment(s), IS/connect and/or source code
		{
			// recursively iterate over child elements
			if (metadata != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadata).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (metadataProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("metadata").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) metadataProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (IS != null)
			{
				stringClassicVRML.append(((X3DConcreteElement) IS).toStringClassicVRML(indentLevel)); // end X3D statement
			}
			if (controlPoint != null)
			{
				stringClassicVRML.append(indentCharacter).append("controlPoint").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) controlPoint).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (controlPointProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("controlPoint").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) controlPointProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (texCoord != null)
			{
				stringClassicVRML.append(indentCharacter).append("texCoord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) texCoord).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (texCoordProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("texCoord").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) texCoordProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (!commentsList.isEmpty())
			{
				CommentsBlock commentsBlock = new CommentsBlock(commentsList);
				stringClassicVRML.append(commentsBlock.toStringClassicVRML(indentLevel));
				stringClassicVRML.append(indent); // end SFNode
			}
		}
		if (hasAttributes || hasChild)
		{
			stringClassicVRML.append("}").append("\n"); // finish node content
		}
		return stringClassicVRML.toString();
	}

	/**
	 * Recursive method to provide VRML97 string serialization.
	 * @param indentLevel number of levels of indentation for this element
	 * @see X3DObject#FILE_EXTENSION_VRML97
	 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dResources.html#VRML">X3D Resources: Virtual Reality Modeling Language (VRML) 97</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772/V2.0/index.html">Virtual Reality Modeling Language (VRML) 97 specification</a>
	 * @see <a href="https://www.web3d.org/documents/specifications/14772-1/V2.1/index.html">VRML 97 v2.1 Amendment</a>
	 * @return VRML97 string
	 */
	@Override
	public String toStringVRML97(int indentLevel)
	{
		return toStringClassicVRML(indentLevel);
	}

	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue)
	{
		return findElementByNameValue(nameValue, ""); // empty string is wildcard, any element match is allowed
	}
								
	/**
	 * Recursive method to provide object reference to node or statement by name attribute, if found as part of this element or in a contained element.
	 * Elements with name fields include meta, Metadata* nodes, field/fieldValue, ProtoDeclare/ExternProtoDeclare/ProtoInstance, CAD and HAnim nodes.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same name, this method does not handle that case.
	 * @see #findNodeByDEF(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @return object reference to found element, null otherwise
	 */
	@Override
	public X3DConcreteElement findElementByNameValue(String nameValue, String elementName)
	{
		if ((nameValue == null) || nameValue.isEmpty())
		{
			String errorNotice = "findElementByNameValue(\"\", " + elementName + ") cannot use empty string to find a name attribute";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		// no name field available for this element
		X3DConcreteElement referenceElement;
		if (controlPoint != null)
		{
			referenceElement = ((X3DConcreteElement) controlPoint).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (controlPointProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) controlPointProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (IS != null)
		{
			referenceElement = ((X3DConcreteElement) IS).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadata != null)
		{
			referenceElement = ((X3DConcreteElement) metadata).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (metadataProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) metadataProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (texCoord != null)
		{
			referenceElement = ((X3DConcreteElement) texCoord).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (texCoordProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) texCoordProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node or statement with given name attribute is found, meaning both objects are attached to same scene graph.
	 * @param nameValue is value of the name field being searched for in this element and child elements(if any)
	 * @param elementName identifies the element of interest (meta MetadataString ProtoDeclare CADassembly ProtoInstance HAnimHumanoid etc.)
	 * @see #findElementByNameValue(String, String)
	 * @return whether node is found
	 */
	public boolean hasElementByNameValue(String nameValue, String elementName)
	{
		return (findElementByNameValue(nameValue, elementName) != null);
	}

	/**
	 * Recursive method to provide object reference to node by DEF, if found as this node or in a contained node.
	 * <br ><br >
	 * <i>Warning:</i> first start with findAncestorSceneObject() to check entire scene graph, or findAncestorX3DObject() to check entire model document.
	 * <br ><br >
	 * <i>Warning:</i> more than one element may be found that has the same DEF, this method does not handle that case.
	 * @see #findElementByNameValue(String)
	 * @see X3DConcreteElement#hasAncestorSceneObject()
	 * @see org.web3d.x3d.jsail.X3DConcreteElement#findAncestorX3DObject()
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @return object reference to found node, null otherwise
	 */
	@Override
	public X3DConcreteNode findNodeByDEF(String DEFvalue)
	{
		if ((DEFvalue == null) || DEFvalue.isEmpty())
		{
			String errorNotice = "findNodeByDEF(\"\") cannot use empty string to find a name";
			validationResult.append(errorNotice).append("\n");
			throw new org.web3d.x3d.sai.InvalidFieldValueException(errorNotice);
		}
		if (getDEF().equals(DEFvalue))
			return this;
		X3DConcreteNode referenceNode;
		if (controlPoint != null)
		{
			referenceNode = ((X3DConcreteElement) controlPoint).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (controlPointProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) controlPointProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (IS != null)
		{
			referenceNode = ((X3DConcreteElement) IS).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadata != null)
		{
			referenceNode = ((X3DConcreteElement) metadata).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (metadataProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) metadataProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (texCoord != null)
		{
			referenceNode = ((X3DConcreteElement) texCoord).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (texCoordProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) texCoordProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		return null; // not found
	}
	/**
	 * Recursive method to determine whether node with DEFvalue is found, meaning both objects are attached to same scene graph.
	 * @param DEFvalue is value of the name field being searched for in this element and child elements(if any)
	 * @see #findNodeByDEF(String)
	 * @return whether node is found
	 */
	public boolean hasNodeByDEF(String DEFvalue)
	{
		return (findNodeByDEF(DEFvalue) != null);
	}

		
	/**
	 * Recursive method to validate this element plus all contained nodes and statements, 
	 * using both datatype-specification value checks and regular expression (regex) checking of corresponding string values.
	 * @return validation results (if any)
	 */
	@Override
	public String validate()
	{
		validationResult = new StringBuilder(); // prepare for updated results

		setSolid(getSolid()); // exercise field checks, simple types
        
		setUClosed(getUClosed()); // exercise field checks, simple types
        
		setUDimension(getUDimension()); // exercise field checks, simple types
        
		setUKnot(getUKnot()); // exercise field checks, simple types
        
		setUOrder(getUOrder()); // exercise field checks, simple types
        
		setUTessellation(getUTessellation()); // exercise field checks, simple types
        
		setVClosed(getVClosed()); // exercise field checks, simple types
        
		setVDimension(getVDimension()); // exercise field checks, simple types
        
		setVKnot(getVKnot()); // exercise field checks, simple types
        
		setVOrder(getVOrder()); // exercise field checks, simple types
        
		setVTessellation(getVTessellation()); // exercise field checks, simple types
        
		setWeight(getWeight()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (controlPoint != null)
		{
			setControlPoint(getControlPoint());
			((X3DConcreteElement) controlPoint).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) controlPoint).getValidationResult());
		}
		if (controlPointProtoInstance != null)
		{
			setControlPoint(getControlPointProtoInstance());
			((X3DConcreteElement) controlPointProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) controlPointProtoInstance).getValidationResult());
		}
		if ((controlPoint != null) && (controlPointProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both controlPoint and controlPointProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasControlPoint()) // test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained SFNode controlPoint";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (metadata != null)
		{
			setMetadata(getMetadata());
			((X3DConcreteElement) metadata).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadata).getValidationResult());
		}
		if (metadataProtoInstance != null)
		{
			setMetadata(getMetadataProtoInstance());
			((X3DConcreteElement) metadataProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) metadataProtoInstance).getValidationResult());
		}
		if ((metadata != null) && (metadataProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both metadata and metadataProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasMetadata()) // test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (texCoord != null)
		{
			setTexCoord(getTexCoord());
			((X3DConcreteElement) texCoord).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) texCoord).getValidationResult());
		}
		if (texCoordProtoInstance != null)
		{
			setTexCoord(getTexCoordProtoInstance());
			((X3DConcreteElement) texCoordProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) texCoordProtoInstance).getValidationResult());
		}
		if ((texCoord != null) && (texCoordProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both texCoord and texCoordProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTexCoord()) // test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained SFNode texCoord";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsPatchSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (getIS() != null)
		{
			if (getIS().getConnectList().isEmpty())
			{
				String errorNotice = "IS statement present, but contains no connect statements";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidProtoException(errorNotice); // report error
			}				
			// TODO also check that this node has ancestor ProtoBody, and that a field with same name also exists, so that IS is legal
		}
		if (!getContainerFieldOverride().isEmpty() &&
			!Arrays.asList(containerField_ALTERNATE_VALUES).contains(getContainerFieldOverride()))
		{
			String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
				": illegal value encountered, containerField='" + getContainerFieldOverride() +
				"' but allowed values are containerField_ALTERNATE_VALUES='" + 
				new MFStringObject(containerField_ALTERNATE_VALUES).toStringX3D() + "'.";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldException(errorNotice); // report error
		}

		// profile validation test, if connected to full scene
		if (findAncestorX3DObject() != null)
		{
			String     modelProfile = findAncestorX3DObject().getProfile();

			// check whether model has a satisfactory profile for this node
			boolean hasSatisfactorySupport = findAncestorX3DObject().supportsX3dComponent (COMPONENT, LEVEL);
                        
			if (!hasSatisfactorySupport)
			{
				String errorNotice = ConfigurationProperties.ERROR_ILLEGAL_VALUE + 
					" insufficient X3D profile='" + modelProfile +
					"' for parent X3D model containing 'NurbsPatchSurface' node, add head statement <component name='NURBS' level='1'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"NURBS\").setLevel(1);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}
