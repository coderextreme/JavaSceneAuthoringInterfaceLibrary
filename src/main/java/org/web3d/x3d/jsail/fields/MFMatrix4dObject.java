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
import java.util.Arrays;
import org.web3d.x3d.sai.*;


/**
 * This utility class provides a concrete implementation corresponding to MFMatrix4d X3D field type.
 * 
 * <br><br>

 * <br>
 * <i>Package hint:</i>  This specification class is defined by the X3D Java Language Binding Specification for the Scene Authoring Interface (SAI).
 * MFMatrix4d specifies zero or more 4x4 matrices of double-precision floating point numbers, organized in row-major fashion. Warning: comma characters can only appear between singleton 16-tuple values.
 * <br><br>
 * Related field object: {@link SFMatrix4dObject}
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MFMatrix4d">X3D Tooltips: type MFMatrix4d</a>
 * 
 * @author Don Brutzman and Roy Walmsley
 * @see <a href="https://www.web3d.org/documents/specifications/19777-2/V3.3/Part2/abstracts.html#X3DFieldTypes" target="_blank">SAI Java Specification: B.4.11 X3DFieldTypes</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-2/V3.3/Part02/dataRef.html#SAIFieldType" target="blank">SAI Abstract Specification: 5.2.15 SAIFieldType</a>
 * @see <a href="https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html#SFMatrix4dAndMFMatrix4d" target="blank">X3D Abstract Specification: SFMatrix4dAndMFMatrix4d</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html" target="_blank">X3D Tooltips</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#field"      target="_blank">X3D Tooltips: field</a>
 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#fieldValue" target="_blank">X3D Tooltips: fieldValue</a>
 * @see <a href="https://www.web3d.org/x3d/content/examples/X3dSceneAuthoringHints.html" target="_blank">X3D Scene Authoring Hints</a>
    */
public class MFMatrix4dObject extends X3DConcreteField implements org.web3d.x3d.sai.MFMatrix4d
{
	/** String constant <i>NAME</i> provides name of this element: <i>MFMatrix4d</i> */
	public static final String NAME = "MFMatrix4d";

	/** Default value for this field type is an empty array.
	 * @see <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html" target="_blank">Java Tutorials: Primitive Data Types</a>
     */
	public static final double[] DEFAULT_VALUE = new double[0]; // initialize as empty array

	/** Default string value for this field type is "". */
	public static final String DEFAULT_VALUE_STRING = "";

	/** Whether or not this field type is an array (<i>true</i>) 
      * @return true if array type */
	public static final boolean isArray()
    {
        return true;
    }

	/** Default tuple size for this field type is <i>16</i> (i.e. number of component values making up a single-field SF object). */
	public static final int TUPLE_SIZE = 16;

	/** Default regular expression (regex) pattern for this field type is <i>\s*((([+-]?((0|[1-9][0-9]*)(\.[0-9]*)?|\.[0-9]+)([Ee][+-]?[0-9]+)?)\s+){15}([+-]?((0|[1-9][0-9]*)(\.[0-9]*)?|\.[0-9]+)([Ee][+-]?[0-9]+)?)\s*,?\s*)*</i>
	 * @see #PATTERN
	 * @see #matches
	 * @see #matches(String)
	 * @see #validate
	 * @see <a href="https://www.web3d.org/specifications/X3dRegularExpressions.html#MFMatrix4d" target="_blank">X3D Regular Expressions: MFMatrix4d</a>
	 */
	public static final String REGEX = "\\s*((([+-]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s+){15}([+-]?((0|[1-9][0-9]*)(\\.[0-9]*)?|\\.[0-9]+)([Ee][+-]?[0-9]+)?)\\s*,?\\s*)*";

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

	// Member value declaration is encapsulated and private, using preferred Java types for concretes library
	private double[] MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy

	/**
	 * Constructor for MFMatrix4dObject performs value initialization.
	 */
	public MFMatrix4dObject ()
	{
		initialize();
	}

	/**
	 * Initialization for MFMatrix4dObject applies default initial value.
	 * Static initializer also provided to verify that the regex pattern compiles and matches that default value.
	 * @see <a href="https://stackoverflow.com/questions/2704857/how-to-check-if-a-given-regex-is-valid">Stack Overflow: How to check if a given Regex is valid?</a>
	 * @see #DEFAULT_VALUE
	 */
	@Override
	public final void initialize()
	{
		MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
	}
	// static initializer
	static {
		try {
            // verify pattern is compiling OK, report exception if not
			java.util.regex.Pattern.compile(REGEX);
				
			// verify DEFAULT_VALUE matches pattern OK, report if not
			if ((new MFMatrix4dObject(DEFAULT_VALUE)).matches() == false)
			{
				System.out.println("MFMatrix4dObject.initialize() problem: failed to match DEFAULT_VALUE=" + java.util.Arrays.toString(DEFAULT_VALUE));
			}
        }
		catch (java.util.regex.PatternSyntaxException exception)
		{
			System.out.println("Exception in MFMatrix4d initialization testing, regex pattern compilation failure.");
			System.out.println("REGEX=\"" + REGEX + "\"");
			System.out.println(exception.getDescription());
        }
	}

	/**
	 * Determine whether two objects contain equal values.
	 * @param comparisonMFMatrix4dObject field type to compare
	 * @return true if equivalent, false otherwise
	 */
	public boolean equals(MFMatrix4dObject comparisonMFMatrix4dObject)
	{
        return (getPrimitiveValue() == comparisonMFMatrix4dObject.getPrimitiveValue());
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
        MFMatrix4dObject tempHold = new MFMatrix4dObject(getPrimitiveValue());
        if  (!this.equals(tempHold))
             return "MFMatrix4dObject validate() error: failed get/set round-trip test";
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
			String errorNotice = "*** Regular expression (regex) failure, new MFMatrix4dObject PATTERN mismatch (\"" + toString() + "\")";
                return errorNotice;
            }
		}
        catch (java.lang.StackOverflowError soe) // regex processing required too much memory for String version of this attribute
        {
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for MFMatrix4d array";
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
            String validationMessage = "java.lang.StackOverflow warning: regular expression (regex) unable to evaluate large corresponding String value for MFMatrix4d array";
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
	 * Utility accessor for MFMatrix4dObject using String value (which must pass parsing validation checks).
	 * <br ><br >
	 * <i>Warning:</i> this method is not 
	 * <i><a href="https://en.wikipedia.org/wiki/Type_safety" target="_blank">type safe</a></i>
	 * at compile time!  Best practice for X3DJSAIL programmers is to use strongly typed methods instead, in order to avoid potential for run-time errors.
	 * @see X3DLoaderDOM#toX3dObjectTree(org.w3c.dom.Node)
	 * @param newValue is new value to assign, if empty then assign DEFAULT_VALUE
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive
method invocations on the same node object).
	 */
	public MFMatrix4dObject setValueByString (String newValue) throws InvalidFieldValueException
	{
		if (newValue == null)
			newValue = new String(); // Principle of Least Astonishment (POLA) #1
			// https://en.wikipedia.org/wiki/Principle_of_least_astonishment

		if (!MFMatrix4dObject.matches(newValue)) // regex test
		{
			String errorNotice = "*** Regular expression (regex) failure, new MFMatrix4dObject(" + newValue + ")";
			validationResult.append(errorNotice).append("\n");
		}
		if (newValue.trim().isEmpty())
		{
			MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		try
		{
			String[] newValues = newValue.replace(","," ").trim().split("\\s+");
			if ((newValues.length % 16) != 0) // tupleSize modulus check
			{
				String errorNotice = "illegal number of values (" + newValues.length + ")" +
					" in initialization string, must be multiple of 16 when declaring new MFMatrix4dObject(" + newValue + ")";
				validationResult.append(errorNotice).append("\n");
				throw new InvalidFieldValueException(errorNotice);
			}
			MFMatrix4d = new double[newValues.length];  // reset array size to match
			for (int i = 0; i < newValues.length;i++)
			{
				MFMatrix4d[i] = Double.parseDouble(newValues[i]); // insert in array
			}
		}
		catch (NumberFormatException e)
		{
			String errorNotice = "new MFMatrix4dObject(" + newValue + ") " + e.getMessage();
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException (errorNotice);
		}
		return this;
	}

	/**
	 * Constructor to copy an MFMatrix4dObject value as initial value for this new field object.
	 * @param newValue The newValue to apply
	 */
	public MFMatrix4dObject(MFMatrix4dObject newValue)
	{
		if (newValue == null)
		{
			MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return;
		}
		MFMatrix4d = newValue.getPrimitiveValue();
	}

	/**
	 * Constructor for MFMatrix4dObject using a corresponding Java primitive double[] array as new initial value.
	 * @param newValue is new value to assign
	 * <i>Warning:</i> newValue array length must correspond to tuple size for base type MFMatrix4d tuple size of <i>16</i>.
	 * setContainerFieldOverride(containerFieldName); // apply checksConcreteField#getTupleSize(String)
	 */
	public MFMatrix4dObject (double[] newValue)
	{
		if      (newValue == null)
			     newValue = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
		else if (newValue.length % 16 != 0) // 16-tuple check
		{
			String errorNotice = "Illegal MFMatrix4d newValue array length=" + newValue.length +
				", must be multiple of 16 or else be empty (newValue=" + toString(newValue) + ")";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		
		MFMatrix4d = newValue;
	}

	/**
	 * Utility constructor for MFMatrix4dObject to assign a single SFMatrix4dObject as new initial value.
	 * @param newValue is new value to assign
	 */
	public MFMatrix4dObject (SFMatrix4dObject newValue)
	{
		setValue(newValue);
	}

	/**
	 * Utility method for MFMatrix4dObject to assign a single SFMatrix4dObject as new initial value.
	 * @param newValue is new value to assign
	 * @return {@link SFColorObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MFMatrix4dObject setValue(SFMatrix4dObject newValue)
	{
		setValue(newValue.getPrimitiveValue());
        return this;
	}

	/**
	 * Static utility method to provide String representation of a correctly typed input value.
	 * @param value The value to convert to a String
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type">X3D Tooltips: type</a>
	 * @see SFDoubleObject#stripTrailingZeroes(double)
	 * @return String version of the provided value, with trailing zeroes and decimal points omitted.
	 */
	public static String toString (double[] value)
	{
		StringBuilder result = new StringBuilder();
		for (int i=0; i < value.length; i++)
		{
			if  (ConfigurationProperties.isStripTrailingZeroes())
				 result.append(org.web3d.x3d.jsail.fields.SFDoubleObject.stripTrailingZeroes(value[i])).append(" ");
			else result.append(value[i]).append(" ");
		}
		return result.toString().trim();
	}

	/**
	 * Provides current value of the field as a Java primitive type.
	 * @return current value
	 */
	public double[] getPrimitiveValue()
	{
		return MFMatrix4d;
	}
	/**
	 * Provides current value as a String.
	 * @see <a href="https://www.web3d.org/x3d/tooltips/X3dTooltips.html#MFMatrix4d">X3D Tooltips: type MFMatrix4d</a>
	 * @see org.web3d.x3d.jsail.fields.SFDoubleObject#stripTrailingZeroes(double)
	 * @return String version of the provided value, with trailing zeroes and decimal points omitted.
	 */
	@Override
	public String toString()
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < MFMatrix4d.length; i++)
		{
			if  (ConfigurationProperties.isStripTrailingZeroes())
				 result.append(org.web3d.x3d.jsail.fields.SFDoubleObject.stripTrailingZeroes(MFMatrix4d[i]));
			else result.append(MFMatrix4d[i]);
			if (i < MFMatrix4d.length - 1)
				result.append(" ");
		}
		return result.toString();
	}
	/**
	 * Apply an array of primitive values to this field.
	 * @param newValue The newValue to apply
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MFMatrix4dObject setValue(double[] newValue)
	{
		if (newValue == null)
		{
			MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
        if ((newValue.length % 16) != 0) // modulo, must be a multiple of SFMatrix4 size
		{
			String errorNotice = "Illegal array newValue=" + newValue + " must base have length 16 for setValue() on MFMatrix4d";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		MFMatrix4d = newValue;
		return this;
	}
	@Override
	public void setIdentity()
	{
		MFMatrix4d = org.web3d.x3d.jsail.fields.SFMatrix4dObject.DEFAULT_VALUE;
	}

	@Override
	public void set(int row, int column)
	{
		// TODO
	}

	@Override
	public float get(int row, int column) // TODO SAI interface problem, needs to be double
	{
		if ((row < 0) || (row > 4) || (column < 0) || (column > 4))
		{
			String errorNotice = "Illegal MFMatrix4d[row=" + row + ",column=" + column + "] access, " +
				"all values must be in numeric range [0..4]";
			validationResult.append(errorNotice).append("\n");
			throw new InvalidFieldValueException(errorNotice);
		}
		return (float)MFMatrix4d[3*row + column]; // TODO typing
	}

	@Override
	public void setTransform(SFVec3d translation,
		SFRotation rotation,
		SFVec3d scale,
		SFRotation scaleOrientation,
		SFVec3d center)
	{
		// TODO
	}

	@Override
	public void getTransform(SFVec3d translation,
		SFRotation rotation,
		SFVec3d scale)
	{
		// TODO
	}

	@Override
	public Matrix4 inverse()
	{
		return null; // TODO
	}

	@Override
	public Matrix4 transpose()
	{
		return null; // TODO
	}

	@Override
	public Matrix4 multiplyLeft (Matrix4 matrix3x3)
	{
		return null; // TODO
	}

	@Override
	public Matrix4 multiplyRight(Matrix4 matrix3x3)
	{
		return null; // TODO
	}
	@Override
	public Matrix4 multiplyRowVector(SFVec3d vector3d) // TODO SFVec4d ?
	{
		return null; // TODO
	}

	@Override
	public Matrix4 multiplyColVector(SFVec3d vector3d) // TODO SFVec4d ?
	{
		return null; // TODO
	}

	/**
	 * Provide double array for this field type.
	 * @return Array of doubles in this field array.
	 */
	public double[] toDoubleArray()
	{
		return MFMatrix4d;
	}

	/**
	 * Apply an MFMatrix4dObject value to this field.
	 * @param newValue The newValue to apply
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MFMatrix4dObject setValue(MFMatrix4dObject newValue)
	{
		if (newValue == null)
		{
			MFMatrix4d = java.util.Arrays.copyOf(DEFAULT_VALUE, DEFAULT_VALUE.length); // must be separate copy
			return this;
		}
		MFMatrix4d = newValue.getPrimitiveValue();
		return this;
	}								

	/**
	 * Multiply scaleFactor times all values in this field type.
	 * @param scaleFactor scalar value for vector multiplication
	 * @return {@link MFMatrix4dObject} - namely <i>this</i> same object to allow sequential method pipelining (i.e. consecutive method invocations on the same object).
	 */
	public MFMatrix4dObject multiply(double scaleFactor)
	{
		for (int i = 0; i < MFMatrix4d.length; i++)
		{
			MFMatrix4d[i] *= scaleFactor;
		}
		return this;
	}

	/**
	 * Determine whether current value matches DEFAULT_VALUE
	 * @see #DEFAULT_VALUE
	 * @return whether current value matches DEFAULT_VALUE
	 */
    public boolean isDefaultValue()
    {
        return java.util.Arrays.equals(MFMatrix4d, DEFAULT_VALUE);
    }
}
