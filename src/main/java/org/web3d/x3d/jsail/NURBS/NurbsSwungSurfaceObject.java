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
import org.web3d.x3d.sai.NURBS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.NURBS.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.NURBS.*;
import org.web3d.x3d.sai.NURBS.*; // interfaces for this component
import org.web3d.x3d.sai.Grouping.*;
import org.web3d.x3d.sai.Shape.*;
import org.web3d.x3d.sai.Networking.*;
import org.web3d.x3d.sai.NURBS.*;
import org.web3d.x3d.jsail.*; // again making sure #4

import org.web3d.x3d.jsail.NURBS.*;

/**
 * NurbsSwungSurface contains a profileCurve and a trajectoryCurve [X3DNurbsControlCurveNode].
 * 
 * <br><br>
 * <i>X3D node tooltip</i>:  [X3DNurbsControlCurveNode] NurbsSwungSurface contains a profileCurve and a trajectoryCurve [X3DNurbsControlCurveNode].  * <br>
 * <br>

 * <br>
 * <i>Package hint:</i>  This org.web3d.x3d.jsail concrete class is used for implementing a standalone X3D object as a <a href="https://en.wikipedia.org/wiki/Plain_old_Java_object" target="_blank">Plain Old Java Object (POJO)</a>.
 * If you are writing Java code for use inside an X3D Script node, compile separate code using only the <i>org.web3d.x3d.sai</i> package instead.
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/nurbs.html#NurbsSwungSurface" target="blank">X3D Abstract Specification: NurbsSwungSurface</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#NurbsSwungSurface" target="_blank">X3D Tooltips: NurbsSwungSurface</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class NurbsSwungSurfaceObject extends org.web3d.x3d.jsail.X3DConcreteNode implements org.web3d.x3d.sai.NURBS.NurbsSwungSurface
{
	/** required by internal interface, empty list provided since no children array present in this class */
    private ArrayList<String> commentsList; 

	// Member value declarations are encapsulated and private, using preferred Java types for concretes library

 /* @name=ccw, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=ccw, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean ccw; // SFBool

 /* @name=IS, @type=SFNode, $javaType=ISObject, $javaReferenceType=ISObject, $javaPrimitiveType=ISObject, $normalizedMemberObjectName=IS, $isX3dStatement=true, @acceptableNodeTypes=IS */ 
	private ISObject IS; // SFNode acceptable node types: IS

 /* @name=metadata, @type=SFNode, $javaType=X3DMetadataObject, $javaReferenceType=X3DMetadataObject, $javaPrimitiveType=X3DMetadataObject, $normalizedMemberObjectName=metadata, $isX3dStatement=false, @acceptableNodeTypes=X3DMetadataObject */ 
	private X3DMetadataObject metadata; // SFNode acceptable node types: X3DMetadataObject or ProtoInstanceObject
	private ProtoInstanceObject metadataProtoInstance; // allowed alternative for metadata field

 /* @name=profileCurve, @type=SFNode, $javaType=X3DNurbsControlCurveNode, $javaReferenceType=X3DNurbsControlCurveNode, $javaPrimitiveType=X3DNurbsControlCurveNode, $normalizedMemberObjectName=profileCurve, $isX3dStatement=false, @acceptableNodeTypes=X3DNurbsControlCurveNode */ 
	private X3DNurbsControlCurveNode profileCurve; // SFNode acceptable node types: X3DNurbsControlCurveNode or ProtoInstanceObject
	private ProtoInstanceObject profileCurveProtoInstance; // allowed alternative for profileCurve field

 /* @name=solid, @type=SFBool, $javaType=boolean, $javaReferenceType=boolean, $javaPrimitiveType=boolean, $normalizedMemberObjectName=solid, $isX3dStatement=false, @acceptableNodeTypes= */ 
	private boolean solid; // SFBool

 /* @name=trajectoryCurve, @type=SFNode, $javaType=X3DNurbsControlCurveNode, $javaReferenceType=X3DNurbsControlCurveNode, $javaPrimitiveType=X3DNurbsControlCurveNode, $normalizedMemberObjectName=trajectoryCurve, $isX3dStatement=false, @acceptableNodeTypes=X3DNurbsControlCurveNode */ 
	private X3DNurbsControlCurveNode trajectoryCurve; // SFNode acceptable node types: X3DNurbsControlCurveNode or ProtoInstanceObject
	private ProtoInstanceObject trajectoryCurveProtoInstance; // allowed alternative for trajectoryCurve field

	// String constants for default field values match X3D Schema definitions

	/** String constant <i>NAME</i> provides name of this element: <i>NurbsSwungSurface</i>. */
	@SuppressWarnings("FieldNameHidesFieldInSuperclass")
	public static final String NAME = "NurbsSwungSurface";

	/** Provides name of this element: <i>NurbsSwungSurface</i>
	 * @return name of this element
	 */
	@Override
	public final String getElementName()
	{
		return NAME;
	}

	/** String constant <i>COMPONENT</i> defines X3D component for the <i>NurbsSwungSurface</i> element: <i>NURBS</i> */
	public static final String COMPONENT = "NURBS";

	/** Defines X3D component for the <i>NurbsSwungSurface</i> element: <i>NURBS</i>
	 * @return X3D component for this element
	 */
	@Override
	public final String getComponent()
	{
		return COMPONENT;
	}

	/** Integer constant <i>LEVEL</i> provides default X3D <i>NURBS</i> component level for this element: <i>3</i> */
	public static final int LEVEL = 3;

	/** Provides default X3D component level for this element: <i>3</i>
	 * @return default X3D component level for this element
	 */
	@Override
	public final int getComponentLevel()
	{
		return LEVEL;
	}

    // DEFAULT_VALUE declarations

	/** SFBool field named <i>ccw</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean CCW_DEFAULT_VALUE = true;

	/** SFNode field named <i>IS</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final ISObject IS_DEFAULT_VALUE = null;

	/** SFNode field named <i>metadata</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DMetadataObject METADATA_DEFAULT_VALUE = null;

	/** SFNode field named <i>profileCurve</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNurbsControlCurveNode PROFILECURVE_DEFAULT_VALUE = null;

	/** SFBool field named <i>solid</i> has default value <i>true</i> (Java syntax) or <i>true</i> (XML syntax). */
	public static final boolean SOLID_DEFAULT_VALUE = true;

	/** SFNode field named <i>trajectoryCurve</i> has default value <i>null</i> (Java syntax) or <i>NULL</i> (XML syntax). */
	public static final X3DNurbsControlCurveNode TRAJECTORYCURVE_DEFAULT_VALUE = null;

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
			case "ccw":
				result = "SFBool";
				break;
			case "IS":
				result = "SFNode";
				break;
			case "metadata":
				result = "SFNode";
				break;
			case "profileCurve":
				result = "SFNode";
				break;
			case "solid":
				result = "SFBool";
				break;
			case "trajectoryCurve":
				result = "SFNode";
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
			case "ccw":
				result = "initializeOnly";
				break;
			case "IS":
				result = "inputOutput";
				break;
			case "metadata":
				result = "inputOutput";
				break;
			case "profileCurve":
				result = "inputOutput";
				break;
			case "solid":
				result = "initializeOnly";
				break;
			case "trajectoryCurve":
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

	/** fromField ROUTE name for SFNode field named <i>IS</i>. */
	public static final String fromField_IS = "IS";

	/** fromField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String fromField_METADATA = "metadata";

	/** toField ROUTE name for SFNode field named <i>metadata</i>. */
	public static final String toField_METADATA = "metadata";

	/** fromField ROUTE name for SFNode field named <i>profileCurve</i>. */
	public static final String fromField_PROFILECURVE = "profileCurve";

	/** toField ROUTE name for SFNode field named <i>profileCurve</i>. */
	public static final String toField_PROFILECURVE = "profileCurve";

	/** fromField ROUTE name for SFNode field named <i>trajectoryCurve</i>. */
	public static final String fromField_TRAJECTORYCURVE = "trajectoryCurve";

	/** toField ROUTE name for SFNode field named <i>trajectoryCurve</i>. */
	public static final String toField_TRAJECTORYCURVE = "trajectoryCurve";

	/** Constructor for NurbsSwungSurfaceObject to initialize member variables with default values. */
	public NurbsSwungSurfaceObject()
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

		ccw = CCW_DEFAULT_VALUE;
		IS = null; // clear out any prior node
		metadata = null;              // clear out any prior node
		metadataProtoInstance = null; // clear out any prior node
		profileCurve = null;              // clear out any prior node
		profileCurveProtoInstance = null; // clear out any prior node
		solid = SOLID_DEFAULT_VALUE;
		trajectoryCurve = null;              // clear out any prior node
		trajectoryCurveProtoInstance = null; // clear out any prior node

		commentsList = new ArrayList<>(); // instantiate, initialize
	}

	// ==== Accessor methods: strongly typed get/set methods for compile-time strictness

	/**
	 * Provide boolean value from initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex coordinates orientation, according to Right-Hand Rule (RHR).
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @return value of ccw field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public boolean getCcw()
	{
		return ccw;
	}

	/**
	 * Accessor method to assign boolean value to initializeOnly SFBool field named <i>ccw</i>.
	 * <br><br>
	 * <i>Tooltip:</i> ccw = counterclockwise: ordering of vertex coordinates orientation, according to Right-Hand Rule (RHR).
 * <ul>
 *  <li> <i> Hint:</i>  ccw false can reverse solid (backface culling) and normal-vector orientation. Note that consistency of left-handed or right-handed point sequences is important throughout. </li> 
 * </ul>
	 * @param newValue is new value for the ccw field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setCcw(boolean newValue)
	{
		// set-newValue-validity-checks #0
		ccw = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool ccw field, similar to {@link #setCcw(boolean)}.
	 * @param newValue is new value for the ccw field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setCcw(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setCcw(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide ISObject instance (using a properly typed node) from inputOutput SFNode field <i>IS</i>.
	 * @return value of IS field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=true, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
	public ISObject getIS()
	{
		return IS;
	}

	/**
	 * Accessor method to assign ISObject instance (using a properly typed node) to inputOutput SFNode field <i>IS</i>.
	 * @param newValue is new value for the IS field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setIS(ISObject newValue)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsSwungSurfaceObject clearIS()
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setMetadata(X3DMetadataObject newValue)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsSwungSurfaceObject clearMetadata()
	{
		((X3DConcreteElement) metadata).clearParentObject(); // remove references to facilitate Java memory management
		metadata = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>metadata</i>.
	 * @see #setMetadata(X3DMetadataObject)
	 * @param newValue is new value for the metadata field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setMetadata(ProtoInstanceObject newValue)
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
	 * Provide X3DNurbsControlCurveNode instance (using a properly typed node) from inputOutput SFNode field <i>profileCurve</i>.
	 * @see #getProfileCurveProtoInstance()
	 * @return value of profileCurve field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNurbsControlCurveNode getProfileCurve()
	{
		return profileCurve;
	}

	/**
	 * Accessor method to assign X3DNurbsControlCurveNode instance (using a properly typed node) to inputOutput SFNode field <i>profileCurve</i>.
	 * @see #setProfileCurve(ProtoInstanceObject)
	 * @param newValue is new value for the profileCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setProfileCurve(X3DNurbsControlCurveNode newValue)
	{
		// set-newValue-validity-checks #0
		profileCurve = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) profileCurve).setParentObject(this); // parentTest15
		}
		if (profileCurveProtoInstance != null)
		{
			profileCurveProtoInstance.setParentObject(null); // housekeeping, clear prior object
			profileCurveProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of profileCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsSwungSurfaceObject clearProfileCurve()
	{
		((X3DConcreteElement) profileCurve).clearParentObject(); // remove references to facilitate Java memory management
		profileCurve = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>profileCurve</i>.
	 * @see #setProfileCurve(X3DNurbsControlCurveNode)
	 * @param newValue is new value for the profileCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setProfileCurve(ProtoInstanceObject newValue)
	{
		if (profileCurveProtoInstance != null)
		{
			((X3DConcreteElement) profileCurveProtoInstance).setParentObject(null); // parentTest15.5
	    }
		profileCurveProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) profileCurveProtoInstance).setParentObject(this); // parentTest15.6
            profileCurveProtoInstance.setContainerField("profileCurve");
	    }
		if (profileCurve != null)
		{
			((X3DConcreteElement) profileCurve).setParentObject(null); // housekeeping, clear prior object
			profileCurve = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getProfileCurveProtoInstance()
		{
			return profileCurveProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>profileCurve</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getProfileCurve()
	 * @see #getProfileCurveProtoInstance()
	 */
	public boolean hasProfileCurve()
	{
		return (profileCurve != null) || (profileCurveProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setSolid(boolean newValue)
	{
		// set-newValue-validity-checks #0
		solid = newValue;
		return this;
	}

	/**
	 * Assign typed object value to SFBool solid field, similar to {@link #setSolid(boolean)}.
	 * @param newValue is new value for the solid field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setSolid(SFBoolObject newValue)
	{
			// set-newValue-validity-checks #1 gets handled by set-primitive method
			setSolid(newValue.getPrimitiveValue());
			return this;
	}
	/**
	 * Provide X3DNurbsControlCurveNode instance (using a properly typed node) from inputOutput SFNode field <i>trajectoryCurve</i>.
	 * @see #getTrajectoryCurveProtoInstance()
	 * @return value of trajectoryCurve field
	 */
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
	@Override
	public X3DNurbsControlCurveNode getTrajectoryCurve()
	{
		return trajectoryCurve;
	}

	/**
	 * Accessor method to assign X3DNurbsControlCurveNode instance (using a properly typed node) to inputOutput SFNode field <i>trajectoryCurve</i>.
	 * @see #setTrajectoryCurve(ProtoInstanceObject)
	 * @param newValue is new value for the trajectoryCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public NurbsSwungSurfaceObject setTrajectoryCurve(X3DNurbsControlCurveNode newValue)
	{
		// set-newValue-validity-checks #0
		trajectoryCurve = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) trajectoryCurve).setParentObject(this); // parentTest15
		}
		if (trajectoryCurveProtoInstance != null)
		{
			trajectoryCurveProtoInstance.setParentObject(null); // housekeeping, clear prior object
			trajectoryCurveProtoInstance = null;
		}
		return this;
	}

	/**
	 * Utility method to clear SFNode value of trajectoryCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).	 */
	public NurbsSwungSurfaceObject clearTrajectoryCurve()
	{
		((X3DConcreteElement) trajectoryCurve).clearParentObject(); // remove references to facilitate Java memory management
		trajectoryCurve = null; // reset SFNode field
		return this;
	}
	/**
	 * Assign ProtoInstance (using a properly typed node) to inputOutput SFNode field <i>trajectoryCurve</i>.
	 * @see #setTrajectoryCurve(X3DNurbsControlCurveNode)
	 * @param newValue is new value for the trajectoryCurve field.
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setTrajectoryCurve(ProtoInstanceObject newValue)
	{
		if (trajectoryCurveProtoInstance != null)
		{
			((X3DConcreteElement) trajectoryCurveProtoInstance).setParentObject(null); // parentTest15.5
	    }
		trajectoryCurveProtoInstance = newValue;
		if (newValue != null)
		{
			((X3DConcreteElement) trajectoryCurveProtoInstance).setParentObject(this); // parentTest15.6
            trajectoryCurveProtoInstance.setContainerField("trajectoryCurve");
	    }
		if (trajectoryCurve != null)
		{
			((X3DConcreteElement) trajectoryCurve).setParentObject(null); // housekeeping, clear prior object
			trajectoryCurve = null;
		}
	    return this;
	}

		/** Private utility method to access SFNode ProtoInstance field **/
		private ProtoInstanceObject getTrajectoryCurveProtoInstance()
		{
			return trajectoryCurveProtoInstance;
		}

	/**
	 * Indicate whether an object is available for inputOutput SFNode field <i>trajectoryCurve</i>.
	 * @return whether a properly typed node or ProtoInstance or CommentsBlock is available.
	 * @see #getTrajectoryCurve()
	 * @see #getTrajectoryCurveProtoInstance()
	 */
	public boolean hasTrajectoryCurve()
	{
		return (trajectoryCurve != null) || (trajectoryCurveProtoInstance != null);
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsSwungSurfaceObject setDEF(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to NurbsSwungSurface DEF
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsSwungSurface DEF newValue='" + newValue + "'" + 
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setDEF(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsSwungSurfaceObject setUSE(String newValue)
	{
		// set-newValue-validity-checks #0
		if (newValue == null)
			newValue = new String();
		// Check that newValue parameter meets naming requirements before assigning to NurbsSwungSurface USE
		if (!newValue.isEmpty() && !org.web3d.x3d.jsail.fields.SFStringObject.isNMTOKEN(newValue))
		{
			throw new org.web3d.x3d.sai.InvalidFieldValueException("NurbsSwungSurface USE newValue='" + newValue + "'" + 
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setUSE(SFStringObject newValue)
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
// ($isInterface=false, $isException=false, $isServiceInterface=false, $isX3dStatement=false, $isClassX3dStatement=false, preceding-sibling::Inheritance=, $baseType=X3DParametricGeometryNode, $additionalInheritanceBaseType=)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	@Override
	public final NurbsSwungSurfaceObject setCssClass(String newValue)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setCssClass(SFStringObject newValue)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public NurbsSwungSurfaceObject setUSE(NurbsSwungSurfaceObject DEFnode)
	{
		if (DEFnode.getDEF().isEmpty())
		{
			String errorNotice = "setUSE(DEFnode) invoked on NurbsSwungSurfaceObject" +
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
	public NurbsSwungSurfaceObject (String DEFlabel)
	{
		initialize();
		setDEF(DEFlabel); // apply checks
	}

	/**
	 * Add comment as String to contained commentsList.
	 * @param newComment initial value
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive setAttribute method invocations).
	 */
	@Override
	public NurbsSwungSurfaceObject addComments (String newComment)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public NurbsSwungSurfaceObject addComments (String[] newComments)
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
	 * @return {@link NurbsSwungSurfaceObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
setAttribute method invocations).
	 */
	@Override
	public NurbsSwungSurfaceObject addComments (CommentsBlock newCommentsBlock)
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (profileCurve != null) || (profileCurveProtoInstance != null) || (trajectoryCurve != null) || (trajectoryCurveProtoInstance != null) || !commentsList.isEmpty();

		if (isUSE())
			hasChild = false; // USE nodes only include attributes for USE and non-default containerField
		StringBuilder indent = new StringBuilder();
		int  indentIncrement = ConfigurationProperties.getIndentIncrement();
		char indentCharacter = ConfigurationProperties.getIndentCharacter();
		for (int i = 0; i < indentLevel; i++)
			indent.append(indentCharacter); // level of indentation for this level

		StringBuilder stringX3D = new StringBuilder();

		stringX3D.append(indent).append("<NurbsSwungSurface"); // start opening tag
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

			if (((getCcw() != CCW_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" ccw='").append(SFBoolObject.toString(getCcw())).append("'");
			}
			if ((!getCssClass().equals(CLASS_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* isSingleValueType */ && !isUSE())
			{
				stringX3D.append(" class='").append(new SFStringObject(getCssClass()).toStringX3D()).append("'");
			}
			if (((getSolid() != SOLID_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes()) /* simple type */ && !isUSE())
			{
				stringX3D.append(" solid='").append(SFBoolObject.toString(getSolid())).append("'");
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
			if      (profileCurve != null)
			{
				stringX3D.append(((X3DConcreteElement)profileCurve).toStringX3D(indentLevel + indentIncrement));
			}
			else if (profileCurveProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)profileCurveProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			if      (trajectoryCurve != null)
			{
				stringX3D.append(((X3DConcreteElement)trajectoryCurve).toStringX3D(indentLevel + indentIncrement));
			}
			else if (trajectoryCurveProtoInstance != null)
			{
					 stringX3D.append(((X3DConcreteElement)trajectoryCurveProtoInstance).toStringX3D(indentLevel + indentIncrement));
			}
			stringX3D.append(indent).append("</NurbsSwungSurface>").append("\n"); // finish closing tag
		}
		else
		{
			stringX3D.append("/>").append("\n"); // otherwise finish singleton tag
		}
		return stringX3D.toString();
	}
// ($name=NurbsSwungSurface, isX3dStatement=false, isClassX3dStatement=false, $hasChild=true, $hasAttributes=true
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
		boolean      hasChild = (IS != null) || (IS != null) || (metadata != null) || (metadataProtoInstance != null) || (profileCurve != null) || (profileCurveProtoInstance != null) || (trajectoryCurve != null) || (trajectoryCurveProtoInstance != null) || !commentsList.isEmpty();
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
			stringClassicVRML.append("NurbsSwungSurface").append(" { "); // define node name, node content follows

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
						if (element.getNodeField().equals("ccw"))
						{
							stringClassicVRML.append(indentCharacter).append("ccw").append(" IS ").append(element.getProtoField()).append("\n").append(indent).append(indentCharacter); // found matching connect
						}
					}
				}
				else 
				if ((getCcw() != CCW_DEFAULT_VALUE) || !ConfigurationProperties.getStripDefaultAttributes())
				{
					stringClassicVRML.append("ccw ").append(SFBoolObject.toString(getCcw())).append("\n").append(indent).append(indentCharacter);
				}
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
			if (profileCurve != null)
			{
				stringClassicVRML.append(indentCharacter).append("profileCurve").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) profileCurve).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (profileCurveProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("profileCurve").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) profileCurveProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode ProtoInstance
			}
			if (trajectoryCurve != null)
			{
				stringClassicVRML.append(indentCharacter).append("trajectoryCurve").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) trajectoryCurve).toStringClassicVRML(indentLevel + indentIncrement));
				stringClassicVRML.append(indent); // end SFNode
			}
			else if (trajectoryCurveProtoInstance != null)
			{
				stringClassicVRML.append(indentCharacter).append("trajectoryCurve").append(" "); // containerField for SFNode
				stringClassicVRML.append(((X3DConcreteElement) trajectoryCurveProtoInstance).toStringClassicVRML(indentLevel + indentIncrement));
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
		if (profileCurve != null)
		{
			referenceElement = ((X3DConcreteElement) profileCurve).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (profileCurveProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) profileCurveProtoInstance).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (trajectoryCurve != null)
		{
			referenceElement = ((X3DConcreteElement) trajectoryCurve).findElementByNameValue(nameValue, elementName);
			if (referenceElement != null)
				return referenceElement;
		}
		if (trajectoryCurveProtoInstance != null)
		{
			referenceElement = ((X3DConcreteElement) trajectoryCurveProtoInstance).findElementByNameValue(nameValue, elementName);
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
		if (profileCurve != null)
		{
			referenceNode = ((X3DConcreteElement) profileCurve).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (profileCurveProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) profileCurveProtoInstance).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (trajectoryCurve != null)
		{
			referenceNode = ((X3DConcreteElement) trajectoryCurve).findNodeByDEF(DEFvalue);
			if (referenceNode != null)
				return referenceNode;
		}
		if (trajectoryCurveProtoInstance != null)
		{
			referenceNode = ((X3DConcreteElement) trajectoryCurveProtoInstance).findNodeByDEF(DEFvalue);
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

		setCcw(getCcw()); // exercise field checks, simple types
        
		setSolid(getSolid()); // exercise field checks, simple types
        
		if (!isUSE()) // be careful! setting DEF via setDEF() method will reset USE value
			setDEF(getDEF()); // exercise field checks, simple types
        
		if (isUSE()) // be careful! setting USE via setUSE() method resets all attributes to default values and wipes out all children
			setUSE(getUSE()); // exercise field checks, simple types
        
		setCssClass(getCssClass()); // exercise field checks, simple types
        
		if (IS != null)
		{
			setIS(getIS());
			((X3DConcreteElement) IS).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) IS).getValidationResult());
		}
		if (isUSE() && hasIS()) // test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained SFNode IS";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained comments";
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
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained SFNode metadata";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (profileCurve != null)
		{
			setProfileCurve(getProfileCurve());
			((X3DConcreteElement) profileCurve).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) profileCurve).getValidationResult());
		}
		if (profileCurveProtoInstance != null)
		{
			setProfileCurve(getProfileCurveProtoInstance());
			((X3DConcreteElement) profileCurveProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) profileCurveProtoInstance).getValidationResult());
		}
		if ((profileCurve != null) && (profileCurveProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both profileCurve and profileCurveProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasProfileCurve()) // test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained SFNode profileCurve";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained comments";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error		
		}

		if (trajectoryCurve != null)
		{
			setTrajectoryCurve(getTrajectoryCurve());
			((X3DConcreteElement) trajectoryCurve).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) trajectoryCurve).getValidationResult());
		}
		if (trajectoryCurveProtoInstance != null)
		{
			setTrajectoryCurve(getTrajectoryCurveProtoInstance());
			((X3DConcreteElement) trajectoryCurveProtoInstance).validate(); // exercise field checks, SFNode
			validationResult.append(((X3DConcreteElement) trajectoryCurveProtoInstance).getValidationResult());
		}
		if ((trajectoryCurve != null) && (trajectoryCurveProtoInstance != null))
		{
			String errorNotice = "Internal X3DJSAIL error: incorrect handling of contained SFNode field, both trajectoryCurve and trajectoryCurveProtoInstance are set simultaneously";
			validationResult.append(errorNotice);
			throw new InvalidProtoException(errorNotice); // report error
		}
		if (isUSE() && hasTrajectoryCurve()) // test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained SFNode trajectoryCurve";
			validationResult.append(errorNotice);
			throw new InvalidFieldValueException(errorNotice); // report error
		}
		
		if (isUSE() && !commentsList.isEmpty())// test USE restrictions
		{
			String errorNotice = "NurbsSwungSurface USE='" + getUSE() + "' is not allowed to have contained comments";
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
					"' for parent X3D model containing 'NurbsSwungSurface' node, add head statement <component name='NURBS' level='3'/>\n" +
					"or Java source-code assignment: " +
					" findAncestorX3DObject().getHead().addComponent(\"NURBS\").setLevel(3);";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldException(errorNotice); // report error
			}
		}
		return validationResult.toString();
	}
}