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

package org.web3d.x3d.jsail.fields;
import org.web3d.x3d.jsail.*;
import org.web3d.x3d.jsail.Core.*;
import org.web3d.x3d.sai.InvalidFieldValueException;

/**
 * This utility class provides a concrete implementation corresponding to SFVec3f X3D field type.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This specification class is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * SFVec3f is a 3-tuple triplet of SFFloat values. Hint: SFVec3f can be used to specify a 3D coordinate or a 3D scale value. Warning: comma characters in attribute values do not pass strict XML validation.
 * <br><br>
 * Related field object: {@link MFVec3fObject}
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFVec3f">X3D Tooltips: type SFVec3f</a>
 * 
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DFieldTypes" target="_blank">SAI Java Specification: B.4.11 X3DFieldTypes</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-2/V3.3/Part02/dataRef.html#SAIFieldType" target="blank">SAI Abstract Specification: 5.2.15 SAIFieldType</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html#SFVec3fAndMFVec3f" target="blank">X3D Abstract Specification: SFVec3fAndMFVec3f</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#field"      target="_blank">X3D Tooltips: field</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#fieldValue" target="_blank">X3D Tooltips: fieldValue</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class SFVec3fObject extends X3DConcreteField implements org.web3d.x3d.sai.SFVec3f
{
	/** String constant <i>NAME</i> provides name of this element: <i>SFVec3f</i> */
	public static final String NAME = "SFVec3f";

	/** Default value for this field type contains values of <i>0 0 0</i>.
	 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html" target="_blank">Java Tutorials: Primitive Data Types</a>
     */
	public static final float[] DEFAULT_VALUE = {0.0f, 0.0f, 0.0f}; // X3DUOM default value: 0.0 0.0 0.0

	/** Default string value for this field type is "0.0 0.0 0.0". */
	public static final String DEFAULT_VALUE_STRING = "0.0 0.0 0.0";

	/** Whether or not this field type is an array (<i>false</i>) 
      * @return true if array type */
	public static final boolean isArray()
    {
        return false;
    }

	/** Default tuple size for this field type is <i>3</i> (i.e. number of component values making up a single-field SF object). */
	public static final int TUPLE_SIZE = 3;

	/** Default regular expression (regex) pattern for this field type is <i>\s*(([+-]?((0|[1-9][0-9]*)(\.[0-9]*)?|\.[0-9]+)([Ee][+-]?[0-9]+)?)\s+){2}([+-]?((0|[1-9][0-9]*)(\.[0-9]*)?|\.[0-9]+)([Ee][+-]?[0-9]+)?)\s*</i>
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html#SFVec3f" target="_blank">X3D Regular Expressions: SFVec3f</a>
	 */
	public static final String REGEX = "\\s*(([+-]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s+){2}([+-]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s*";

	/** Precompiled regular expression (regex) pattern for this field type using default <em>REGEX</em> value.
	 * @see REGEX
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 */
	public static final java.util.regex.Pattern PATTERN = java.util.regex.Pattern.compile(REGEX);
                    
    /** Flag to minimize excessive regex warnings for this field type, helpful if memory limitations are present. */
    private static boolean priorRegexStackOverflowFound = false;

	/** Special SimpleType bboxSizeType contains default value of <i>-1 -1 -1</i>.
	 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html" target="_blank">Java Tutorials: Primitive Data Types</a>
     */
	public static final float[] DEFAULT_VALUE_BBOXSIZETYPE = {-1,-1,-1}; // X3DUOM default value: -1 -1 -1
                        
	/** Default string value for this special SimpleType is <i>"-1 -1 -1"</i>. */
	public static final String DEFAULT_VALUE_BBOXSIZETYPE_STRING = "-1 -1 -1";

	/** Special SimpleType bboxSizeType regular expression (regex) pattern for this field type is <i>\\s*((([+]?(((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s+){2}([+]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s*)|((\\-1(\\.(0)*)?([Ee][+-]?[0]+)?\\s+){2}\\-1(\\.(0)*)?([Ee][+-]?[0]+)?)\\s*)?</i>";
	 * @see #PATTERN_BBOXSIZETYPE
	 * @see #matchesBboxSizeType
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html#bboxSizeType" target="_blank">X3D Regular Expressions: bboxSizeType</a>
	 */
	public static final String REGEX_BBOXSIZETYPE = "\\s*((([+]?(((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s+){2}([+]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s*)|((\\-1(\\.(0)*)?([Ee][+-]?[0]+)?\\s+){2}\\-1(\\.(0)*)?([Ee][+-]?[0]+)?)\\s*)?";

	/** Special SimpleType bboxSizeType regular expression (regex) pattern for this field type.
	 * @see REGEX_BBOXSIZETYPE
	 * @see #matchesBboxSizeType
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 */
	public static final java.util.regex.Pattern PATTERN_BBOXSIZETYPE = java.util.regex.Pattern.compile(REGEX_BBOXSIZETYPE);

	/** Special SimpleType regular expression (regex) bboxSizeType PATTERN_BBOXSIZETYPE match of current object's toString() value.
	 * @see #REGEX_BBOXSIZETYPE
	 * @see #PATTERN_BBOXSIZETYPE
	 * @see #matchesBboxSizeType(String)
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN_BBOXSIZETYPE matches, false otherwise
	 */
	public final boolean matchesBboxSizeType()
	{
        try
        {
            java.util.regex.Matcher m = PATTERN_BBOXSIZETYPE.matcher(toString());
            return m.matches();
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            if (!priorRegexStackOverflowFound)
            {
                priorRegexStackOverflowFound = true;
                String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for bboxSizeType";
                validationResult.append(validationMessage).append("\n");
                System.out.println ("*** " + validationMessage);
		    }
            return false;
		}
	}
	/** Special SimpleType regular expression (regex) bboxSizeType PATTERN_BBOXSIZETYPE match of current object's toString() value.
     * @param value String value to check
	 * @see #REGEX_BBOXSIZETYPE
	 * @see #PATTERN_BBOXSIZETYPE
	 * @see #matchesBboxSizeType
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN_BBOXSIZETYPE matches, false otherwise
	 */
	public static final boolean matchesBboxSizeType(String value)
	{
        try
        {
            java.util.regex.Matcher m = PATTERN_BBOXSIZETYPE.matcher(value);
            return m.matches();
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for bboxSizeType";
                validationResult.append(validationMessage).append("\n");
                System.out.println ("*** " + validationMessage);
                return false;
		}
	}

	// Member value declaration is encapsulated and private, using preferred Java types for concretes library
	private float[] SFVec3f = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy

	/**
	 * Constructor for SFVec3fObject performs value initialization.
	 */
	public SFVec3fObject ()
	{
		initialize();
	}

	/**
	 * Initialization for SFVec3fObject applies default initial value.
	 * Static initializer also provided to verify that the regex pattern compiles and matches that default value.
	 * @see <a href="https://stackoverflow.com/questions/2704857/how-to-check-if-a-given-regex-is-valid">Stack Overflow: How to check if a given Regex is valid?</a>
	 * @see #DEFAULT_VALUE
	 */
	@Override
	public final void initialize()
	{
		SFVec3f = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
	}
	// static initializer
	static {
		try {
            // verify pattern is compiling OK, report exception if not
			java.util.regex.Pattern.compile(REGEX);
				
			// verify DEFAULT_VALUE matches pattern OK, report if not
			if ((new SFVec3fObject(DEFAULT_VALUE)).matches() == false)
			{
				System.out.println("SFVec3fObject.initialize() problem: failed to match DEFAULT_VALUE=" + java.util.Arrays.toString(DEFAULT_VALUE));
			}
        }
		catch (java.util.regex.PatternSyntaxException exception)
		{
			System.out.println("Exception in SFVec3f initialization testing, regex pattern compilation failure.");
			System.out.println("REGEX=\"" + REGEX + "\"");
			System.out.println(exception.getDescription());
        }
	}

	/**
	 * Determine whether two objects contain equal values.
	 * @param comparisonSFVec3fObject field type to compare
	 * @return true if equivalent, false otherwise
	 */
	public boolean equals(SFVec3fObject comparisonSFVec3fObject)
	{
        return (getPrimitiveValue() == comparisonSFVec3fObject.getPrimitiveValue());
	}
	/**
	 * Validate current value via get/set comparison tests
	 * @return empty string if get/set testing passes, warning otherwise
	 * @see #validate
	 * @see #validateRegex()
	 */
	public final String validate()
	{
        // validation via get/set checks and comparison
        SFVec3fObject tempHold = new SFVec3fObject(getPrimitiveValue());
        if  (!this.equals(tempHold))
             return "SFVec3fObject validate() error: failed get/set round-trip test";
        else return "";
        
    }
	/**
	 * Validate current value via regular expression (regex) check of current object's toString() value, reporting errors only if found.
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see #validate()
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return empty string if PATTERN matches, warning otherwise
	 */
	public final String validateRegex()
	{
        try
        {
            java.util.regex.Matcher m = PATTERN.matcher(toString());
            if (!m.matches())
            {
			String errorNotice = "*** Regular expression (regex) failure, new SFVec3fObject PATTERN mismatch (\"" + toString() + "\")";
                return errorNotice;
            }
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for SFVec3f";
            validationResult.append(validationMessage).append("\n");
            System.out.println ("*** " + validationMessage);
            return validationMessage;
		}
        return "";
	}
	/**
	 * Test PATTERN match via regular expression (regex) check of current object's toString() value.
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN matches, false otherwise
	 */
	public final boolean matches()
	{
        try
        {
            java.util.regex.Matcher m = PATTERN.matcher(toString());
            return m.matches();
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for SFVec3f";
            validationResult.append(validationMessage).append("\n");
            System.out.println ("*** " + validationMessage);
            return false;
		}
	}
	/**
	 * Test PATTERN match with regular expression (regex) of provided value.
	 * @param value String to check against regex pattern for successful match
	 * @see #REGEX
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html">java.util.regex.Pattern</a>
	 * @return true if PATTERN matches, false otherwise
	 */
	public static final boolean matches(String value)
	{
		java.util.regex.Matcher m = PATTERN.matcher(value);
		return m.matches();
	}

	/**
	 * Utility accessor for SFVec3fObject using String value (which must pass parsing validation checks).
	 * <br ><br >
	 * <i>Warning:</i> this method is not 
	 * <i><a href="https://en.wikipedia.org/wiki/Type_safety" target="_blank">type safe</a></i>
	 * at compile time!  Best practice for X3DJSAIL programmers is to use strongly typed methods instead, in order to avoid potential for run-time errors.
	 * @see X3DLoaderDOM#toX3dObjectTree(org.w3c.dom.Node)
	 * @param newValue is new value to assign, if empty then assign DEFAULT_VALUE
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public SFVec3fObject setValueByString (String newValue) throws InvalidFieldValueException
	{
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #1
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment

		if (!SFVec3fObject.matches(newValue)) // regex test
		{
			String errorNotice = "*** Regular expression (regex) failure, new SFVec3fObject(" + newValue + ")";
			validationResult.append(errorNotice).append("\n");
		}
		if (newValue.trim().isEmpty())
		{
			SFVec3f = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		try
		{
			String[] newValues = newValue.replace(","," ").trim().split("\\s+");
			if (newValues.length != 3)
			{
				String errorNotice = "illegal number of values in initialization string, new SFVec3fObject(" + newValue + ")";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldValueException(errorNotice);
			}
			SFVec3f[0] = Float.parseFloat(newValues[0]);
			SFVec3f[1] = Float.parseFloat(newValues[1]);
			SFVec3f[2] = Float.parseFloat(newValues[2]);
		}
		catch (NumberFormatException e)
		{
			String errorNotice = "new SFVec3fObject(" + newValue + ") " + e.getMessage();
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException (errorNotice);
		}
		return this;
	}

	/**
	 * Constructor to copy an SFVec3fObject value as initial value for this new field object.
	 * @param newValue The newValue to apply
	 */
	public SFVec3fObject(SFVec3fObject newValue)
	{
		if (newValue == null)
		{
			SFVec3f = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return;
		}
		SFVec3f = newValue.getPrimitiveValue();
	}

	/**
	 * Constructor for SFVec3fObject using a corresponding Java primitive float[] array as new initial value.
	 * @param newValue is new value to assign
	 * <i>Warning:</i> newValue array length must correspond to tuple size for base type SFVec3f tuple size of <i>3</i>.
	 * setContainerFieldOverride(containerFieldName); // apply checksConcreteField#getTupleSize(String)
	 */
	public SFVec3fObject (float[] newValue)
	{
		if      (newValue == null)
			     newValue = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
		else if (newValue.length != 3)
		{
			String errorNotice = "Illegal SFVec3f newValue array length=" + newValue.length +
				", must equal 3 or else be empty (newValue=" + toString(newValue) + ")";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		
		SFVec3f = newValue;
	}

	/**
	 * Utility constructor for SFVec3fObject using individual primitive values.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type">X3D Tooltips: type</a>
	 */
	public SFVec3fObject (float x, float y, float z)
	{
		SFVec3f[0] = x;
		SFVec3f[1] = y;
		SFVec3f[2] = z;
	}
	/**
	 * Utility method to normalize this vector value to unit length, ignore if zero length.
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject normalize()
	{
		float length = (float) Math.sqrt(
			SFVec3f[0]*SFVec3f[0] +
			SFVec3f[1]*SFVec3f[1] +
			SFVec3f[2]*SFVec3f[2]);
		
		if (length > 0.0f)
		{
			SFVec3f[0] = SFVec3f[0] / length;
			SFVec3f[1] = SFVec3f[1] / length;
			SFVec3f[2] = SFVec3f[2] / length;
		}
		return this;
	}

	/**
	 * Utility constructor for SFVec3fObject using double values.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type">X3D Tooltips: type</a>
	 */
	public SFVec3fObject (double x, double y, double z)
	{
		setValue((float) x, (float) y, (float) z);
	}

	/**
	 * Utility constructor for SFVec3fObject using an alternatively typed Java double[] array as new initial value.
	 * @param newValue is new value to assign
	 */
	public SFVec3fObject(double[] newValue)
	{
		setValue(newValue); // type conversion, doubles to floats
	}

	/**
	 * Static utility method to provide String representation of a correctly typed input value.
	 * @param value The value to convert to a String
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type">X3D Tooltips: type</a>
	 * @see SFFloatObject#stripTrailingZeroes(float)
	 * @return String version of the provided value, with trailing zeroes and decimal points omitted.
	 */
	public static String toString (float[] value)
	{
		StringBuilder result = new StringBuilder();
		for (int i=0; i < value.length; i++)
		{
			if  (ConfigurationProperties.isStripTrailingZeroes())
				 result.append(org.web3d.x3d.jsail.fields.SFFloatObject.stripTrailingZeroes(value[i])).append(" ");
			else result.append(value[i]).append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Get the current value of this SFVec3fObject by copying it into the valueDestination array, leaving the current object unchanged.
	 * @param valueDestination The array to be filled in with current field values.
	 */
	@Override
	public void getValue(float[] valueDestination)
	{
		valueDestination = SFVec3f;
	}

	/**
	 * Provides current value of the field as a Java primitive type.
	 * @return current value
	 */
	public float[] getPrimitiveValue()
	{
		return SFVec3f;
	}
	/**
	 * Provides current value as a String.
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#SFVec3f">X3D Tooltips: type SFVec3f</a>
	 * @see org.web3d.x3d.jsail.fields.SFFloatObject#stripTrailingZeroes(float)
	 * @return String version of the provided value, with trailing zeroes and decimal points omitted.
	 */
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < SFVec3f.length; i++)
		{
			if  (ConfigurationProperties.isStripTrailingZeroes())
				 result.append(org.web3d.x3d.jsail.fields.SFFloatObject.stripTrailingZeroes(SFVec3f[i]));
			else result.append(SFVec3f[i]);
			if (i < SFVec3f.length - 1)
				result.append(" ");
		}
		return result.toString();
	}
	/**
	 * Assign a new value to this field.
	 * <i>Warning:</i> newValue array length must correspond to tuple size for base type SFVec3f tuple size of <i>3</i>.
	 * @see X3DConcreteField#getTupleSize(String)
	 * @param newValue The replacement value to assign.
	 */
	@Override
	public void setValue(float[] newValue)
	{
		if (newValue == null) return; // newValueNullReturnSelf2

		if      (newValue == null)
			     newValue = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
		else if (newValue.length != 3)
		{
			String errorNotice = "Illegal SFVec3f newValue array length=" + newValue.length +
				", must equal 3 or else be empty (newValue=" + toString(newValue) + ")";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		SFVec3f = newValue;
	}

	/**
	 * Assign a new array value to this field, pipelined.
	 * This is an alternate utility method since primary method returns void and cannot be overridden.
	 * <i>Warning:</i> newValue array length must correspond to tuple size for base type SFVec3f tuple size of <i>3</i>.
	 * @see X3DConcreteField#getTupleSize(String)
	 * @param newValue The replacement value to assign.
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject setValueArray (float[] newValue)
	{
        setValue(newValue); // perform checks
        return this;
    }

	/**
	 * Constructor for SFVec3fObject using a corresponding Java primitive double[] array as new initial value.
	 * @param newValue is new value to assign
	 * <i>Warning:</i> newValue array length must correspond to tuple size for base type SFVec3f tuple size of <i>3</i>.
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject setValue (double[] newValue)
	{
        // https://stackoverflow.com/questions/7513434/convert-a-double-array-to-a-float-array
		float[] newFloatArray = new float[newValue.length];
		for (int i = 0; i < newValue.length; i++)
		{
			newFloatArray[i] = (float) newValue[i];
		}
		setValue(newFloatArray); // perform checks
		return this;
	}

	/**
	 * Assign a new value to this field.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject setValue(float x, float y, float z)
	{
		SFVec3f[0] = x;
		SFVec3f[1] = y;
		SFVec3f[2] = z;
		return this;
	}
	/**
	 * Assign a new value to this field.
	 * @param x first component
	 * @param y second component
	 * @param z third component
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject setValue(double x, double y, double z)
	{
		
		setValue((float) x, (float) y, (float) z);
		return this;
	}

	/**
	 * Provide float array for this field type.
	 *
	 * @return Array of floats in this field array.
	 */
	public float[] toFloatArray()
	{
		return SFVec3f;
	}

	/**
	 * Apply an SFVec3fObject value to this field.
	 * @param newValue The newValue to apply
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject setValue(SFVec3fObject newValue)
	{
		if (newValue == null)
		{
			SFVec3f = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		SFVec3f = newValue.getPrimitiveValue();
		return this;
	}								

	/**
	 * Multiply scaleFactor times all values in this field type.
	 * @param scaleFactor scalar value for vector multiplication
	 * @return {@link SFVec3fObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public SFVec3fObject multiply(float scaleFactor)
	{
		SFVec3f[0] *= scaleFactor;
		SFVec3f[1] *= scaleFactor;
		SFVec3f[2] *= scaleFactor;
		
		return this;
	}

	/**
	 * Determine whether current value matches DEFAULT_VALUE
	 * @see #DEFAULT_VALUE
	 * @return whether current value matches DEFAULT_VALUE
	 */
    public boolean isDefaultValue()
    {
        return java.util.Arrays.equals(SFVec3f, DEFAULT_VALUE);
    }
}
