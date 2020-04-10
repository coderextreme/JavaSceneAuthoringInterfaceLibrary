<?xml version="1.0" encoding="UTF-8"?>
<!--
    title       : X3duomToX3dPythonPackage.xslt
    created     : 6 July 2019
    creator     : Don Brutzman, Loren Peitso and John Carlson
    description : Stylesheet to process X3dUnifiedObjectModel-#.#.xml and convert it to X3D Ontology
    reference   : AllX3dElementsAttributesTextTemplate.xslt
    reference   : https://www.w3.org/TR/xslt
    identifier  : https://www.web3d.org/x3d/stylesheets/X3duomToX3dPythonPackage.xslt
    license     : license.html
-->

<!-- TODO authors can edit this example to customize all transformation rules -->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
                xmlns:xs ="http://www.w3.org/2001/XMLSchema"
	            xmlns:fn ="http://www.w3.org/2005/xpath-functions">
	<!--  extension-element-prefixes="xs" -->
	<xsl:param name="X3dPackageSubdirectory"><xsl:text></xsl:text></xsl:param>
        
    <xsl:output method="text"/> <!-- output methods:  xml html text -->
    
    <xsl:variable name="indent"><xsl:text>    </xsl:text></xsl:variable>
    
    <!-- See X3DJSAIL for original tooltip usage code -->
    <xsl:variable name="x3d.tooltips.path">
		<xsl:text>../tooltips/x3d-3.3.profile.xml</xsl:text>
	</xsl:variable>
	<xsl:variable name="x3d.tooltips.document" select="doc($x3d.tooltips.path)"/>

<!-- TODO
     - is it possible to output metaDiagnostics even if __init__() exception thrown on loading?
     - use escaping to handle inclusion of both ' and " in a single string
-->
    <!-- ======================================================= -->
    
    <xsl:template match="/"> <!-- process root of input document -->
    
        <xsl:result-document href="{$X3dPackageSubdirectory}/__init__.py" method="text" omit-xml-declaration="yes" encoding="UTF-8" indent="no">
        
            <xsl:text># __init__.py needed for properly configuring pypi distribution of x3d.py package

# According to _Learning Python_ by Mark Lutz, fifth edition:
# - Empty __init.py__ no longer required as of Python 3.3.  p. 761
# - Using __init.py__ is performance advantage for loading, even when empty.  p. 761
# - Using __all__ list to define exported values for import * is allowed but not required.  p. 735 and 771-772.

# 6.4.1. Importing * From a Package
# https://docs.python.org/3/tutorial/modules.html#importing-from-a-package

# indicates that
#     from packagename import *
# "then imports whatever names are defined in the package" and
# "Although certain modules are designed to export only names that follow certain patterns when you use import *,
#     it is still considered bad practice in production code."

# TODO testing continues to fix x3d.py package's class visibility satisfactorily for end users

__all__ = [</xsl:text>
            <xsl:text>
    # Field types
    </xsl:text>
            <xsl:for-each select="//FieldTypes/FieldType">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@type"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Simple Type Enumerations
    </xsl:text>
            <xsl:for-each select="//SimpleTypeEnumerations/SimpleType">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Abstract Object Types
    </xsl:text>
            <xsl:for-each select="//AbstractObjectTypes/AbstractObjectType">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Abstract Node Types
    </xsl:text>
            <xsl:for-each select="//AbstractNodeTypes/AbstractNodeType">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Concrete Nodes
    </xsl:text>
            <xsl:for-each select="//ConcreteNodes/ConcreteNode">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Statements
    </xsl:text>
            <xsl:for-each select="//Statements/Statement">
                <xsl:text>'</xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>

            <xsl:text>
    # Utility functions
    </xsl:text>
            <xsl:for-each select="//FieldTypes/FieldType">
                <xsl:text>'isValid</xsl:text>
                <xsl:value-of select="@type"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
                <xsl:text>'assertValid</xsl:text>
                <xsl:value-of select="@type"/>
                <xsl:text>'</xsl:text>
                <xsl:text>, </xsl:text>
            </xsl:for-each>
            <xsl:text>
    'fixBoolean', 'isPositive', 'assertPositive', 'isNonNegative', 'assertNonNegative', 'isZeroToOne', 'assertZeroToOne', 'isLessThanEquals', 'assertLessThanEquals', 'isLessThan', 'assertLessThan', 'isGreaterThanEquals', 'assertGreaterThanEquals', 'isGreaterThan', 'assertGreaterThan', 'isBoundingBox', 'assertBoundingBox',
    'metaDiagnostics'</xsl:text>

            <xsl:text>
    ]
</xsl:text>
            
        </xsl:result-document>
    
        <xsl:result-document href="{$X3dPackageSubdirectory}/x3d.py" method="text" omit-xml-declaration="yes" encoding="UTF-8" indent="no">
        
	 <xsl:text disable-output-escaping="yes"><![CDATA[]]></xsl:text>

        <!-- process elements -->
        
        <xsl:text>###############################################

# X3D Package for Python x3d.py

# generator:  X3duomToX3dPythonPackage.xslt
# X3DUOM:     X3dUnifiedObjectModel-</xsl:text><xsl:value-of select="X3dUnifiedObjectModel/@version"/><xsl:text>.xml
# Python X3D: https://www.web3d.org/x3d/stylesheets/python/python.html
"""
The x3d.py Python X3D Package supports programmers with Python interfaces and objects for standards-based X3D programming, all as open source.

This work is part of the X3D Python Scene Access Interface Library (X3DPSAIL).
"""

_DEBUG = True       # options True False

###############################################

# Utility Functions
</xsl:text>
        <xsl:call-template name="UtilityFunctions"/>
        <xsl:text>###############################################

# Field Validation Functions
</xsl:text>
        <!-- TODO should Python convention be "__NAME__" ? -->
        <xsl:call-template name="FieldValidationFunctions"/>
        <xsl:text>###############################################

class _X3DField(object):
    """
    All X3D fields implement _X3DField abstract type.
    """
    value = None
    NAME = '_X3DField'
    SPECIFICATION_URL = 'https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html'
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html#FieldTypesTable'
    @property # getter - - - - - - - - - -
    def value(self):
        """ Provide value of this field type. """
        return self.__value
    def __repl__(self):
        # if _DEBUG: print('* debug: type(self.value)=' + str(type(self.value)),flush=True)
        if isinstance(self.value, (SFString, str)):
            return "'" + self.value + "'"
        if  isinstance(self.value, tuple) and 'SF' in str(type(self)): # avoid X3DTypeError if value is not iterable
            result = '('
            for each in self.value:
                result += str(each) + ', '
                # if _DEBUG: print('* _X3DField debug: str(each)=' + str(each),flush=True)
            return result.rstrip(', ') + ')'
        if  isinstance(self.value, list) and 'MF' in str(type(self)): # avoid X3DTypeError if value is not iterable
            # isinstance(self.value, MFNode): not working, what got passed in was not an MFNode object apparently
            result = '['
            for each in self.value:
                result += str(each) + ', '
                # if _DEBUG: print('* _X3DField debug: str(each)=' + str(each),flush=True)
            return result.rstrip(', ') + ']'
        return str(self.value)
    def __str__(self):
        return self.__repl__()

def isX3DField(value):
    """
    Determine whether object is an instance of _X3DField.
    """
    return isinstance(value, _X3DField)

# Access Types

class AccessType(_X3DField):
    """
    accessType determines whether a field corresponds to event input, event output, or persistent state information. Events are strictly typed values with a corresponding timestamp. ROUTE connections must match accessType between source field and target field.

    initializeOnly: can be initialized, but cannot send or receive events. This is usually the case for fields that are considered too computationally expensive to change at run time.
    inputOutput: can be initialized, and can also send or receive events during run-time operations.
    inputOnly: cannot be initialized or included in a scene file, but can receive input event values via a ROUTE during run-time operations.
    outputOnly: cannot be initialized or included in a scene file, but can send output event values via a ROUTE during run-time operations.
    """
    SPECIFICATION_URL = 'https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/concepts.html#FieldSemantics'
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html#accessType'
    # string constants listing each allowed accessType
    initializeOnly = 'initializeOnly'
    inputOutput = 'inputOutput'
    inputOnly = 'inputOnly'
    outputOnly = 'outputOnly'


# Field Types

class FieldType(_X3DField):
    """
    The X3D Architecture specification of field types classify the possible values for a field.
    Each field in each node (i.e. each XML attribute) has a strictly defined data type.
    Multiple data types are provided for boolean, integer, floating-point and string values.
    X3D is a strongly typed language, meaning that all data must strictly conform to these data types in order for a scene to be correct.
    """
    SPECIFICATION_URL = 'https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/fieldsDef.html'
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html#type'
    # string constants listing each allowed type
</xsl:text>
        <xsl:for-each select="//FieldTypes/FieldType">
            <xsl:text>    </xsl:text>
            <xsl:value-of select="@type"/>
            <xsl:text> = '</xsl:text>
            <xsl:value-of select="@type"/>
            <xsl:text>'
</xsl:text>
        </xsl:for-each>

        <xsl:text>
</xsl:text>
        <!-- TODO mappings for X3D types to xsd types; further decorate XML Schema and X3DUOM to account for them -->
        
        <xsl:apply-templates select="//FieldTypes/*"/>
        <xsl:text>###############################################

# Abstract Node Types

# Note that these package-internal class names are preceded by an underscore _ character for hidden scope, since X3D authors are not expected to use them.
</xsl:text>
        <!-- order matters for class generation, since Python superclass must precede subclass -->
        <xsl:apply-templates select="//AbstractNodeTypes/AbstractNodeType[    @name = 'X3DNode']" /><!-- must go first -->
            <xsl:text>
def isX3DNode(value):
    """
    Whether or not value is a concrete node (Shape WorldInfo etc.) meaning any _X3DNode object.
    """
    return isinstance(value, _X3DNode)

</xsl:text>
        <xsl:apply-templates select="//AbstractNodeTypes/AbstractNodeType[not(@name = 'X3DNode')]">
            <xsl:sort select="not((@name = 'X3DNode') or (@name = 'X3DBindableNode') or (@name = 'X3DChildNode') or (@name = 'X3DFollowerNode') or 
                                  (@name = 'X3DGeometricPropertyNode') or (@name = 'X3DVolumeRenderStyleNode') or (@name = 'X3DPointingDeviceSensorNode') or 
                                  (@name = 'X3DSensorNode') or (@name = 'X3DTextureNode') or (@name = 'X3DAppearanceChildNode') or 
                                  (@name = 'X3DParametricGeometryNode') or (@name = 'X3DGeometryNode') or
                                  (@name = 'X3DTimeDependentNode') or (@name = 'X3DChildNode'))"/>
            <xsl:sort select="(@name = 'X3DBindableNode')"/>
            <xsl:sort select="(@name = 'X3DFollowerNode')"/>
            <xsl:sort select="(@name = 'X3DGeometricPropertyNode')"/>
            <xsl:sort select="(@name = 'X3DVolumeRenderStyleNode')"/>
            <xsl:sort select="(@name = 'X3DPointingDeviceSensorNode')"/>
            <xsl:sort select="(@name = 'X3DSensorNode')"/>
            <xsl:sort select="(@name = 'X3DTextureNode')"/>
            <xsl:sort select="(@name = 'X3DAppearanceChildNode')"/>
            <xsl:sort select="(@name = 'X3DParametricGeometryNode')"/>
            <xsl:sort select="(@name = 'X3DGeometryNode')"/>
            <xsl:sort select="(@name = 'X3DTimeDependentNode')"/>
            <xsl:sort select="(@name = 'X3DChildNode')"/>
        </xsl:apply-templates>
        <xsl:text>###############################################

# Abstract Object Types

# Note that these package-internal class names are preceded by an underscore _ character since X3D authors are not expected to use them

</xsl:text>
        <xsl:apply-templates select="//AbstractObjectTypes/*"/>

        <xsl:text>###############################################

# Statements

class _X3DStatement(object):
    """
    All X3D statements implement _X3DStatement abstract type.
    """
    NAME = '_X3DStatement'
    SPECIFICATION_URL = 'https://www.web3d.org/documents/specifications/19775-1/V3.3/Part01/components/core.html#AbstractX3DStructure'
    def __repl__(self):
        result = self.NAME + '('
        # if _DEBUG: print(self.NAME + ' self.FIELD_DECLARATIONS: ' + str(self.FIELD_DECLARATIONS))
        for each in self.FIELD_DECLARATIONS:
            # if _DEBUG: print(self.NAME + ' for each in self.FIELD_DECLARATIONS: each=' + str(each))
            name = each[0]
            default = each[1]
            type_ = each[2]
            accessType = each[3]
            value = getattr(self, name)
            # if _DEBUG: print('gettattr(self, ' + str(name) + ') value="' + str(value)[:100] + '" for FIELD_DECLARATIONS ' + str(each) + ')',flush=True)
            if value != default:
                if  isinstance(value, list): # avoid X3DTypeError if value is not iterable
                    result += str(name) + '=['
                    for next in value:
                        result += str(next) + ', '
                        # if _DEBUG: print('* _X3DStatement debug: str(next)=' + str(next),flush=True)
                    result = result.rstrip(', ')
                    result += '],'
                elif isinstance(value, str) and "'" in value:
                    result += str(name) + '=' + '"' + str(value)[:100] + '"' + ','
                elif isinstance(value, str) and value != default:
                    result += str(name) + '=' + "'" + str(value)[:100] + "'" + ','
                elif value != default:
                    result += str(name) + '='       + str(value)[:100]       + ','
                # elif _DEBUG:
                #   result += str(name) + '=' + "'" + str(value)[:100] + "'" + ','
        return result.strip().rstrip(',').rstrip(', ') + ')'
    def __str__(self):
        return self.__repl__().strip() # _X3DStatement

def isX3DStatement(value):
    """
    Whether or not value is an _X3DStatement object.
    """
    return isinstance(value, _X3DStatement)

class Comment(_X3DStatement):
    """
    X3D statement containing zero or more comment strings.
    """
    NAME = 'Comment'
    SPECIFICATION_URL = ''
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html'
    DEFAULT_VALUE = list()
    REGEX_XML = r'(\s|\S)*' # (includes lower-case true, false)
    def __init__(self, value=None):
        self.value = value
    @property # getter - - - - - - - - - -
    def value(self):
        """ Provide list of comment strings. """
        return self.__value
    @value.setter
    def value(self, value=None):
        """ The value setter only allows correctly typed values. """
        if  value is None:
            value = self.DEFAULT_VALUE
        assertValidMFString(value)
        self.__value = value

def isComment(value):
    """
    Whether or not value is an _X3DComment object.
    """
    return isinstance(value, _X3DComment)

</xsl:text>
        <xsl:apply-templates select="//Statements/*"/>
        <xsl:text>###############################################

# Concrete Nodes

def isX3DNode(value):
    return isinstance(value, _X3DNode)

</xsl:text>
        <xsl:apply-templates select="//ConcreteNodes/*"/>
        <xsl:text>###############################################

# Exceptions
</xsl:text>
        <xsl:call-template name="Exceptions"/>
        <xsl:text>###############################################

# Python x3d Package Loading Complete

print("x3d.py package loaded, have fun with X3D Graphics!")

###############################################
</xsl:text>
            
        </xsl:result-document>
    </xsl:template>

    <!-- ===================================================== -->

    <xsl:template name="UtilityFunctions">
        <xsl:text>
def metaDiagnostics(self, headElement=None):
    """
    Utility function to return any meta info, hint, warning, error, TODO values in this model.
    """
    if  headElement is None:
        headElement = self
    if  isinstance(headElement, X3D):
        headElement = headElement.head
    # print('type(headElement)=' + str(type(headElement)),flush=True) # diagnostic
    if  isinstance(headElement, head):
        result = "meta "
        for each in headElement.children:
            if isinstance(each, meta) and each.name in ('info', 'hint', 'warning', 'error', 'TODO'):
                result += each.name.strip() + ': ' + each.content.strip()
                if  result.endswith('.') or result.endswith(','):
                    result += ' '
                else:
                    result += ', '
        if  result.strip() != "meta":
            return result.rstrip(', ').strip()
    return ''

</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->

    <xsl:template name="Exceptions">
        <xsl:text>
class X3DError(Exception):
    """ Base class for all exceptions raised by this module.
        Reference: X3D Scene Access Interface (SAI), 5.3 Error types
        https://www.web3d.org/documents/specifications/19775-2/V3.3/Part02/dataRef.html
    """

class X3DTypeError(X3DError):
    """ Type error for simple fields (SFBool, SFInt32, SFVec3f etc.) or contained nodes (SFNode, MFNode) according to content model."""

class X3DValueError(X3DError):
    """ Value error for a given X3D type."""

</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->
    
    <!-- functions to check valid values each X3D field type -->
    <xsl:template name="FieldValidationFunctions">
        <xsl:text disable-output-escaping="yes"><![CDATA[
# Type-specific functions to check for valid values, throw exception if illegal value is found

def fixBoolean(value, default=None):
    """
    Utility function to convert boolean to corresponding Python value.
    """
    # if _DEBUG: print('fixBoolean(value=' + str(value) + ', default=' + str(default) + ')',flush=True)
    if  value is None:
        return default
    if isinstance(value, list) and len(value) == 1:
        # if _DEBUG: print('fixBoolean downcasting by resetting singleton list value=' + str(value) + ' as value=' + str(value[0]),flush=True)
        value = value[0]
    elif isinstance(value, SFBool):
        return value.value # dereference
    elif isinstance(value, MFBool) and len(value) == 1:
        return value.value[0] # dereference
    if value in ('true', 'True'):
        return True
    if value in ('false', 'False'):
        return False
    if isinstance(value, bool):
        return value
    if isinstance(value, list):
        index = 0
        result = value
        for each in value:
#           print('each=' + str(each),flush=True) # debug
            if  each in ('true', 'True'):
                result[index] = True
            elif each in ('false', 'False'):
                result[index] = False
            while isinstance(each, list) and len(each) == 1:
                # if _DEBUG: print('fixBoolean downcasting by extracting singleton list value[' + str(index) + ']=' + str(each) + ' as each[0]=' + str(each[0]),flush=True)
                result[index] = each[0]
            if not isinstance(result[index], bool):
                # print(flush=True)
                raise X3DTypeError('fixBoolean(value=' + str(value) + ') MFBool value[' + str(index) + ']=' + str(each) + ', result[' + str(index) + ']=' + result[index] + ' with type=' + str(type(value)) + ' is not a valid Python bool expression')
            index += 1
        # if _DEBUG: print('...fixBoolean result=' + str(result),flush=True)
        return result
    # print(flush=True)
    raise X3DTypeError('fixBoolean(value=' + str(value) + ') with type=' + str(type(value)) + ') is not a valid Python bool')

def isPositive(value):
    """
    Utility function to confirm positive value(s) greater than or equal to zero.
    """
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element <= 0:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        for each in value:
            if each <= 0:
                return False
        return True
    if isinstance(value, (int, float)):
        return value > 0

def assertPositive(fieldName, value):
    """
    Utility function to raise X3DTypeError if not isPositive(value).
    """
    # if _DEBUG: print('* debug: assertPositive(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isPositive(value), fieldName + '=' + str(value) + ' fails assertPositive requirements: value(s) greater than or equal to zero'

def isNonNegative(value):
    """
    Utility function to confirm nonnegative value(s) greater than or equal to zero.
    """
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element < 0:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        # if _DEBUG: print('isNonNegative: ', value,flush=True);
        for each in value:
            if each < 0:
                return False
        return True
    if isinstance(value, (int, float)):
        return value >= 0

def assertNonNegative(fieldName, value):
    """
    Utility function to raise X3DTypeError if not isNonNegative(value).
    """
    # if _DEBUG: print('* debug: assertNonNegative(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isNonNegative(value), fieldName + '=' + str(value) + ' fails assertNonNegative requirements: value(s) greater than or equal to zero'

def isZeroToOne(value):
    """
    Utility function to confirm value(s) in range [0..1]
    """
    # if True or _DEBUG: print('* debug: isZeroToOne(' + str(value) + ')',flush=True);
    if isinstance(value, (list, tuple)):
        for each in value:
            if isinstance(each, (list, tuple)):
                for another in each:
                    if not 0 <= another <= 1:
                        return False
            elif not 0 <= each <= 1:
                return False
        return True
    if isinstance(value, (int, float)):
        return 0 <= value <= 1

def assertZeroToOne(fieldName, value):
    """
    Utility function to raise X3DTypeError if not isZeroToOne(value)
    """
    # if _DEBUG: print('* debug: assertZeroToOne(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isZeroToOne(value), fieldName + '=' + str(value) + ' fails assertZeroToOne requirements: value(s) in range [0..1]'

def isLessThanEquals(value, maximum):
    """
    Utility function to confirm value(s) less than or equal to maximum.
    """
    # if True or _DEBUG: print('* debug: isLessThanEquals(' + str(value) + ')',flush=True);
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element > maximum:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        for each in value:
            if each > maximum:
                return False
        return True
    if isinstance(value, (int, float)):
        return value <= maximum

def assertLessThanEquals(fieldName, value, maximum):
    """
    Utility function to raise X3DTypeError if not isLessThanEquals(value)
    """
    # if _DEBUG: print('* debug: assertLessThanEquals(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isLessThanEquals(value, maximum), fieldName + '=' + str(value) + ' fails assertLessThanEquals maximum=' + str(maximum)

def isLessThan(value, maximum):
    """
    Utility function to confirm value(s) less than maximum.
    """
    # if True or _DEBUG: print('* debug: isLessThan(' + str(value) + ')',flush=True);
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element >= maximum:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        for each in value:
            if each >= maximum:
                return False
        return True
    if isinstance(value, (int, float)):
        return value < maximum

def assertLessThan(fieldName, value, maximum):
    """
    Utility function to raise X3DTypeError if not isLessThan(value)
    """
    # if _DEBUG: print('* debug: assertLessThan(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isLessThan(value, maximum), fieldName + '=' + str(value) + ' fails assertLessThan maximum=' + str(maximum)

######
def isGreaterThanEquals(value, minimum):
    """
    Utility function to confirm value(s) less than or equal to minimum.
    """
    # if True or _DEBUG: print('* debug: isGreaterThanEquals(' + str(value) + ')',flush=True);
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element < minimum:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        for each in value:
            if each < minimum:
                return False
        return True
    if isinstance(value, (int, float)):
        return value >= minimum

def assertGreaterThanEquals(fieldName, value, minimum):
    """
    Utility function to raise X3DTypeError if not isGreaterThanEquals(value)
    """
    # if _DEBUG: print('* debug: assertGreaterThanEquals(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isGreaterThanEquals(value, minimum), fieldName + '=' + str(value) + ' fails assertGreaterThanEquals minimum=' + str(minimum)

def isGreaterThan(value, minimum):
    """
    Utility function to confirm value(s) less than minimum.
    """
    # if True or _DEBUG: print('* debug: isGreaterThan(' + str(value) + ')',flush=True);
    if isinstance(value, list) and any(isinstance(x, tuple) for x in value):
        for each in value:
            for element in each:
                if element <= minimum:
                    return False
        return True
    if isinstance(value, (list, tuple)):
        for each in value:
            if each <= minimum:
                return False
        return True
    if isinstance(value, (int, float)):
        return value > minimum

def assertGreaterThan(fieldName, value, minimum):
    """
    Utility function to raise X3DTypeError if not isGreaterThan(value)
    """
    # if _DEBUG: print('* debug: assertGreaterThan(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isGreaterThan(value, minimum), fieldName + '=' + str(value) + ' fails assertGreaterThan minimum=' + str(minimum)

def isBoundingBox(value):
    """
    Utility function to confirm legal X3D bounding box value of (-1 -1 -1) or nonnegative triple.
    """
    if value is None:
        return None
    # if True or _DEBUG: print('* debug: isBoundingBox(' + str(value) + ')', 'isinstance(value, tuple)=' + str(isinstance(value, tuple)), 'len(value)=' + str(len(value)),flush=True);
    if isinstance(value, (list, tuple)):
        if len(value) != 3:
            return False
        if value[0] == -1 and value[1] == -1 and value[2] == -1:
            return True
        return isNonNegative(value) # legal bounding box tuple

def assertBoundingBox(fieldName, value):
    """
    Utility function to raise X3DTypeError if not isBoundingBox(value)
    """
    # if True or _DEBUG: print('* debug: assertBoundingBox(' + str(fieldName) + ', ' + str(value) + ')', flush=True);
    assert isBoundingBox(value), fieldName + '=' + str(value) + ' fails assertBoundingBox requirements: must be (-1, -1, -1) or non-negative 3-tuple'
]]></xsl:text>
        <xsl:for-each select="//FieldTypes/FieldType">
            <xsl:variable name="fieldTypeName" select="@type"/>
            <xsl:variable name="pythonBaseType">
                <xsl:call-template name="pythonBaseType">
                    <xsl:with-param name="x3dFieldType" select="$fieldTypeName"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:variable name="tupleSize" select="@tupleSize"/>
            <xsl:variable name="isTuple"         select="(number($tupleSize) > 1)"/>
            <xsl:variable name="isList"          select="starts-with($fieldTypeName,'MF') or ($fieldTypeName = 'SFImage')"/>
            <xsl:variable name="hasEmptyDefault" select="(string-length(@defaultValue) = 0)"/>

            <xsl:text>
def isValid</xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>(value):
    """
    Utility function to determine type validity of a </xsl:text><xsl:value-of select="$fieldTypeName"/><xsl:text> value.
    """</xsl:text>
            <xsl:text>
    if isinstance(value, _X3DField):
        if not isinstance(value, SF</xsl:text>
            <xsl:value-of select="substring($fieldTypeName,3)"/>
            <xsl:text>) and not isinstance(value, MF</xsl:text>
            <xsl:value-of select="substring($fieldTypeName,3)"/>
            <xsl:text>):
            # if _DEBUG: print('</xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text> type mismatch diagnostic: value=' + str(value)[:100] + ' has type=' + str(type(value)) + ', isinstance(value, </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>)=' + str(isinstance(value, </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>)),flush=True)
            return False # type mismatch!</xsl:text>
            <xsl:text>
    if isinstance(value, </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>):
        value = value.value # dereference value from base type
        return True</xsl:text>
            <!-- SF/MF promotion/demotion -->
            <xsl:choose>
                <xsl:when test="starts-with($fieldTypeName, 'SF')">
                    <xsl:text>
    if isinstance(value, MF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>) and len(value) == 1:
        value = value.value[0] # dereference value from this MF type
        return True</xsl:text>
                </xsl:when>
                <xsl:when test="starts-with($fieldTypeName, 'MF')">
                    <xsl:text>
    if isinstance(value, SF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>):
        value = [value.value] # dereference value from this SF type, convert to list #1
        return True</xsl:text>
                </xsl:when>
            </xsl:choose>
            
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>
    for each in value:
        if not isinstance(each, (_X3DNode, _X3DStatement)):
            return False</xsl:text>
                </xsl:when>
                <xsl:otherwise>
        <xsl:text>
    if not isinstance(value, </xsl:text>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>_X3DNode) and not isinstance(value, _X3DStatement</xsl:text>
                </xsl:when>
                <xsl:when test="$isList">
                    <xsl:text>list</xsl:text>
                </xsl:when>
                <xsl:when test="$isTuple">
                    <xsl:text>tuple</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(value, int</xsl:text>
                    </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:text>):
        return False</xsl:text>
            
            <xsl:choose>
                <xsl:when test="($isTuple and not($isList)) or ($isList and not($isTuple))">
                    <xsl:if test="($tupleSize > 1)">
                        <xsl:text>
    tupleCount = 0</xsl:text>
                    </xsl:if>
                    <xsl:text>
    for each in value:</xsl:text>
                    <xsl:if test="($tupleSize > 1)">
                        <xsl:text>
        tupleCount += 1</xsl:text>
                    </xsl:if>
                    <xsl:text>
        while isinstance(each, list) and len(each) == 1:
            each = each[0] # dereference
        if isinstance(each, SF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>):
            each = each.value # dereference
        if not isinstance(each, </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(each, int</xsl:text>
                    </xsl:if>
                    <xsl:text>):
            return False</xsl:text>
                    <!-- SF range checks -->
                    <xsl:choose>
                        <xsl:when test="starts-with($fieldTypeName, 'SFColor')">
                            <xsl:text disable-output-escaping="yes"><![CDATA[
        if (each < 0) or (each > 1):
            return False]]></xsl:text>
                        </xsl:when>
                    </xsl:choose>
                    <!-- tupleSize checks -->
                    <xsl:if test="($tupleSize > 1)">
                        <xsl:text>
    if tupleCount != </xsl:text>
                        <xsl:value-of select="$tupleSize"/>
                        <xsl:text>:
        return False</xsl:text>
                    </xsl:if>
                </xsl:when>
                <xsl:when test="$isTuple and $isList">
                    <xsl:text>
    _index = 0
    for each in value:
        _index += 1
        if len(each) % </xsl:text>
                        <xsl:value-of select="$fieldTypeName"/>
                        <xsl:text>.TUPLE_SIZE != 0:
            # if _DEBUG:
            print('* isValid</xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
                <xsl:text> tuple ' + str(each) + ' has length ' + str(len(each)) + ' which is not a multiple of </xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
                <xsl:text>.TUPLE_SIZE=' + str(</xsl:text>
                        <xsl:value-of select="$fieldTypeName"/>
                        <xsl:text>.TUPLE_SIZE) + ' for value=' + str(value),flush=True)
            return False
        for element in each:
            if not isinstance(element, </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(element, int</xsl:text>
                    </xsl:if>
                    <xsl:text>):
                return False</xsl:text>
                    <!-- MF range checks -->
                    <xsl:choose>
                        <xsl:when test="starts-with($fieldTypeName, 'MFColor')">
                            <xsl:text disable-output-escaping="yes"><![CDATA[
            if (element < 0) or (element > 1):
                return False]]></xsl:text>
                        </xsl:when>
                    </xsl:choose>
                </xsl:when>
            </xsl:choose>
            <xsl:if test="contains($fieldTypeName, 'Color')">
                <xsl:text>
    if not isZeroToOne(value):
        return False</xsl:text>
            </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:if test="($fieldTypeName = 'SFImage')">
                <xsl:text disable-output-escaping="yes"><![CDATA[
    if (len(value) > 0): # SFImage list length checks
        if (0 < len(value) < 3): 
            return False # SFImage list must start with width, height and number of components (0..4)
        else:
            width  = value[0]
            height = value[1]
            numberComponents = value[2]
            if  len(value) != (width * height) + 3: # assumes each value in array has all component values in single integer
                print('SFImage array length of ' + str(len(value)) + ' does not equal (width=' + str(width)+ ' * height=' + str(height)+ ') + 3) = ' + str(width * height * numberComponents + 3),flush=True)
                return False # SFImage has invalid list length]]></xsl:text>
            </xsl:if>
            <xsl:text>
    return True

def assertValid</xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>(value):
    """
    Utility function to assert type validity of a </xsl:text><xsl:value-of select="$fieldTypeName"/><xsl:text> value, otherwise raise X3DTypeError with diagnostic message.
    """</xsl:text>
            <!-- provide special error message if SF type provided for MF field 
            <xsl:if test="starts-with($fieldTypeName, 'MF')">
                <xsl:variable name="sfTypeName" select="concat('S',substring($fieldTypeName,2,string-length($fieldTypeName)))"/>
                <xsl:text>
    if isinstance(value, list) and assertValid</xsl:text>
                <xsl:value-of select="$sfTypeName"/>
                <xsl:text>(value):
        # print(flush=True)
        raise X3DTypeError(str(value)[:100] + ' has X3D type </xsl:text>
                <xsl:value-of select="$sfTypeName"/>
                <xsl:text> rather than </xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
                <xsl:text>, must be a Python list')</xsl:text>
            </xsl:if>
            -->
            <!-- isinstance(value, bool): # equivalent to ((value == True) or (value == False)): -->

            <xsl:text>
    # if _DEBUG: print('* debug value.__class__=' + str(value.__class__) + ', issubclass(value.__class__, _X3DField)=' + str(issubclass(value.__class__, _X3DField)) + ', super(value.__class__)=' + str(super(value.__class__)),flush=True)
    if isinstance(value, _X3DField) and not isinstance(value, SF</xsl:text>
            <xsl:value-of select="substring($fieldTypeName,3)"/>
            <xsl:text>) and not isinstance(value, MF</xsl:text>
            <xsl:value-of select="substring($fieldTypeName,3)"/>
            <xsl:text>):
        # print(flush=True)
        raise X3DTypeError(str(value)[:100] + ' has type ' + str(type(value)) + ' and is not a </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>')</xsl:text>
            <xsl:text>
    if isinstance(value, </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>):
        value = value.value # dereference value from this base type</xsl:text>
            <!-- SF/MF promotion/demotion -->
            <xsl:choose>
                <xsl:when test="starts-with($fieldTypeName, 'SF')">
                    <xsl:text>
    if isinstance(value, MF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>) and len(value) == 1:
        value = value.value[0] # dereference value from this MF type</xsl:text>
                </xsl:when>
                <xsl:when test="starts-with($fieldTypeName, 'MF')">
                    <xsl:text>
    if isinstance(value, SF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>) or not(isinstance(value, list)):
        value = [value.value] # dereference value from this SF type, convert to list #2</xsl:text>
                </xsl:when>
            </xsl:choose>
            
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>
    for each in value:
        if not isinstance(each, _X3DNode) and not isinstance(each, _X3DStatement):
            # print(flush=True)
            raise X3DTypeError(str(value)[:100] + ' element ' + str(each) + ', type=' + str(type(each)) + ' is not a valid _X3DNode or _X3DStatement for MFNode')</xsl:text>
                </xsl:when>
                <xsl:otherwise>
            <xsl:text>
    if not isinstance(value, </xsl:text>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>_X3DNode) and not isinstance(value, _X3DStatement</xsl:text>
                </xsl:when>
                <xsl:when test="$isList">
                    <xsl:text>list</xsl:text>
                </xsl:when>
                <xsl:when test="$isTuple">
                    <xsl:text>tuple</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(value, int</xsl:text>
                    </xsl:if>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:text>):
        # print(flush=True)
        raise X3DTypeError(str(value)[:100] + ', type=' + str(type(value)) + ' is not a valid </xsl:text>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>_X3DNode or _X3DStatement</xsl:text>
                </xsl:when>
                <xsl:when test="$isList">
                    <xsl:text>Python list</xsl:text>
                    <xsl:if test="($fieldTypeName = 'MFNode')">
                        <xsl:text> of X3D objects</xsl:text>
                    </xsl:if>
                </xsl:when>
                <xsl:when test="$isTuple">
                    <xsl:text>Python tuple</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:text> value</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'SFBool')">
                    <xsl:text> (True or False)</xsl:text>
                </xsl:when>
            </xsl:choose>
            <xsl:text> for </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>')</xsl:text>
            
            <xsl:choose>
                <xsl:when test="($isTuple and not($isList)) or ($isList and not($isTuple))">
                    <xsl:text>
    # perform duplicative tests prior to isValid call in order to provide better assertion diagnostics #1</xsl:text>
                    <xsl:if test="($tupleSize > 1)">
                        <xsl:text>
    tupleCount = 0</xsl:text>
                    </xsl:if>
                    <xsl:text>
    for each in value:</xsl:text>
                    <xsl:if test="($tupleSize > 1)">
                        <xsl:text>
        tupleCount += 1</xsl:text>
                    </xsl:if>
                    <xsl:text>
        while isinstance(each, list) and len(each) == 1:
            each = each[0] # dereference
        if isinstance(each, SF</xsl:text>
                    <xsl:value-of select="substring($fieldTypeName,3)"/>
                    <xsl:text>):
            each = each.value # dereference
        if not isinstance(each, </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(each, int</xsl:text>
                    </xsl:if>
                    <xsl:text>):
            # print(flush=True)
            raise X3DTypeError('</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text> list has contained value=' + str(each) + ' with type=' + str(type(each)) + ' which is not a valid </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:text>')</xsl:text>
                    <!-- SF range checks -->
                    <xsl:choose>
                        <xsl:when test="starts-with($fieldTypeName, 'SFColor')">
                            <xsl:text disable-output-escaping="yes"><![CDATA[
        if (each < 0) or (each > 1):
            # print(flush=True)
            raise X3DTypeError(']]></xsl:text>
                            <xsl:value-of select="$fieldTypeName"/>
                            <xsl:text>' + str(value)[:100] + ' has value ' + str(each) + ' with type=' + str(type(value)) + ' is  out of range [0..1] and is not a valid </xsl:text>
                            <xsl:value-of select="$fieldTypeName"/>
                            <xsl:text>')</xsl:text>
                        </xsl:when>
                    </xsl:choose>
                    <xsl:if test="($tupleSize > 1)">
                        <!-- tupleSize checks -->
                        <xsl:text>
    if tupleCount != </xsl:text>
                        <xsl:value-of select="$tupleSize"/>
                        <xsl:text>:
        # print(flush=True)
        raise X3DTypeError('</xsl:text>
                        <xsl:value-of select="$fieldTypeName"/>
                        <xsl:text> ' + str(value)[:100] + ', type=' + str(type(value)) + '</xsl:text>
                        <xsl:text> has ' + str(tupleCount) + ' elements instead of </xsl:text>
                        <xsl:value-of select="$tupleSize"/>
                        <xsl:text>')</xsl:text>
                    </xsl:if>
                </xsl:when>
                <xsl:when test="$isTuple and $isList">
                    <xsl:text>
    # perform duplicative tests prior to isValid call in order to provide better assertion diagnostics #2
    if isinstance(value, list):
        _index = 0
        for each in value:
            if len(each) % </xsl:text>
                            <xsl:value-of select="$fieldTypeName"/>
                            <xsl:text>.TUPLE_SIZE != 0:
                # print(flush=True)
                raise X3DValueError('</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text> tuple ' + str(each) + ' has length ' + str(len(each)) + ' which is not a multiple of </xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text>.TUPLE_SIZE=' + str(</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text>.TUPLE_SIZE) + ' for value=' + str(value)[:100])
                return False
#            if not isinstance(each, (tuple, SF</xsl:text><!-- SF corresponding to this MF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <xsl:text>)):
#                # print(flush=True)
#                raise X3DTypeError('</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text> element #' + str(_index) + ' with value ' + str(each) + ', type=' + str(type(each)) + ' is not a valid tuple')
            _index += 1
            if isinstance(each, tuple):
                for element in each:
                    if not isinstance(element, </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:if test="($pythonBaseType = 'float')">
                        <xsl:text>) and not isinstance(element, int</xsl:text>
                    </xsl:if>
                    <xsl:text>):
                        # print(flush=True)
                        raise X3DTypeError('</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text> element #' + str(_index) + ' tuple ' + str(each) + ' has value=' + str(element) + ', type=' + str(type(element)) + ' that is not a valid </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:text>')</xsl:text>
                    <!-- MF range checks -->
                    <xsl:choose>
                        <xsl:when test="starts-with($fieldTypeName, 'MFColor')">
                            <xsl:text disable-output-escaping="yes"><![CDATA[
                    if (element < 0) or (element > 1):
                        # print(flush=True)
                        raise X3DTypeError(']]></xsl:text>
                            <xsl:value-of select="$fieldTypeName"/>
                            <xsl:text>' + str(value)[:100] + ' has value ' + str(element) + ' with type=' + str(type(value)) + ' out of range [0..1] and is not a valid </xsl:text>
                            <xsl:value-of select="$fieldTypeName"/>
                            <xsl:text>')</xsl:text>
                        </xsl:when>
                    </xsl:choose>
                </xsl:when>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="contains($fieldTypeName, 'Color')">
                    <xsl:text>
</xsl:text>
                    <xsl:text>    assertZeroToOne('</xsl:text>
                    <xsl:value-of select="$fieldTypeName"/>
                    <xsl:text>', value)</xsl:text>
                </xsl:when>
            </xsl:choose>

                </xsl:otherwise>
            </xsl:choose>

            <xsl:text>
    if not isValid</xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>(value):
        # print(flush=True)</xsl:text>
            <xsl:if test="($fieldTypeName = 'SFImage')">
                <xsl:text disable-output-escaping="yes"><![CDATA[
        diagnostic = ''
        if (len(value) > 0): # SFImage list length checks
            if (0 < len(value) < 3): 
                diagnostic = 'SFImage list must start with width, height and number of components (0..4)'
            else:
                width  = value[0]
                height = value[1]
                numberComponents = value[2]
                diagnostic = ' array length of ' + str(len(value)) + ' does not equal (width=' + str(width)+ ' * height=' + str(height)+ ') + 3) = ' + str(width * height + 3)]]></xsl:text>
            </xsl:if>
            <xsl:text>
        raise X3DTypeError(str(value)[:100] + ', type=' + str(type(value)) + ' is not a valid </xsl:text>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'MFNode')">
                    <xsl:text>_X3DNode or _X3DStatement</xsl:text>
                </xsl:when>
                <xsl:when test="$isList">
                    <xsl:text>Python list</xsl:text>
                    <xsl:if test="($fieldTypeName = 'MFNode')">
                        <xsl:text> of X3D objects</xsl:text>
                    </xsl:if>
                </xsl:when>
                <xsl:when test="$isTuple">
                    <xsl:text>Python tuple</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:text>Python </xsl:text>
                    <xsl:value-of select="$pythonBaseType"/>
                    <xsl:text> value</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'SFBool')">
                    <xsl:text> (True or False)</xsl:text>
                </xsl:when>
            </xsl:choose>
            <xsl:text> for </xsl:text>
            <xsl:value-of select="$fieldTypeName"/>
            <xsl:text>'</xsl:text>
            <xsl:if test="($fieldTypeName = 'SFImage')">
                <xsl:text> + diagnostic</xsl:text>
            </xsl:if>
            <xsl:text>)
    return True
</xsl:text>

        </xsl:for-each>
        <xsl:text>&#10;</xsl:text>
        
        <xsl:text>

def assertValidFieldInitializationValue (name, type, value, parent=''):
    """
    Utility function to assert type validity of a field initialization value, otherwise raise X3DTypeError with diagnostic message.
    """
    # if _DEBUG: print('* assertValidFieldInitializationValue name=' + str(name) + ', type=' + str(type) + ', value=' + str(value)[:100] + ', parent=' + parent,flush=True)
    # note that ExternProtoDeclare field definitions do not have any value
    if name is None:
        print('* assertValidFieldInitializationValue improper invocation: name=' + str(name) + ', type=' + str(type) + ', value=' + str(value)[:100] + ', parent=' + parent + ', ignored',flush=True)
        return # ignore
    if value is None or (not(type == bool) and not value):
        return # ignore
    elif (type == 'SFString'):
        assertValidSFString(value)
    elif (type == 'MFString'):
        assertValidMFString(value)
    elif (type == 'SFBool') or (type == bool)  or isinstance(value, bool):
        assertValidSFBool(value)
    elif (type == 'MFBool'):
        assertValidMFBool(value)
    elif (type == 'SFInt32') or (type == int)   or isinstance(value, int):
        assertValidSFInt32(value)
    elif (type == 'MFInt32'):
        assertValidMFInt32(value)
    elif (type == 'SFFloat') or (type == float) or isinstance(value, float):
        assertValidSFFloat(value)
    elif (type == 'MFFloat'):
        assertValidMFFloat(value)
    elif (type == 'SFDouble'):
        assertValidSFDouble(value)
    elif (type == 'MFDouble'):
        assertValidMFDouble(value)
    elif (type == 'SFTime'):
        assertValidSFTime(value)
    elif (type == 'MFTime'):
        assertValidMFTime(value)
    elif (type == 'SFColor'):
        assertValidSFColor(value)
    elif (type == 'MFColorRGBA'):
        assertValidMFColorRGBA(value)
    elif (type == 'SFRotation'):
        assertValidSFRotation(value)
    elif (type == 'MFRotation'):
        assertValidMFRotation(value)
    elif (type == 'SFImage'):
        assertValidSFImage(value)
    elif (type == 'MFImage'):
        assertValidMFImage(value)
    elif (type == 'SFNode'):
        assertValidSFNode(value)
    elif (type == 'MFNode'):
        assertValidMFNode(value)
    elif (type == 'SFVec2f'):
        assertValidSFVec2f(value)
    elif (type == 'MFVec2f'):
        assertValidMFVec2f(value)
    elif (type == 'SFVec3f'):
        assertValidSFVec3f(value)
    elif (type == 'MFVec3f'):
        assertValidMFVec3f(value)
    elif (type == 'SFVec4f'):
        assertValidSFVec4f(value)
    elif (type == 'MFVec4f'):
        assertValidMFVec4f(value)
    elif (type == 'SFVec2d'):
        assertValidSFVec2d(value)
    elif (type == 'MFVec2d'):
        assertValidMFVec2d(value)
    elif (type == 'SFVec3d'):
        assertValidSFVec3d(value)
    elif (type == 'MFVec3d'):
        assertValidMFVec3d(value)
    elif (type == 'SFVec4d'):
        assertValidSFVec4d(value)
    elif (type == 'MFVec4d'):
        assertValidMFVec4d(value)
    elif (type == 'SFMatrix3d'):
        assertValidSFMatrix3f(value)
    elif (type == 'MFMatrix3f'):
        assertValidMFMatrix3f(value)
    elif (type == 'SFMatrix4f'):
        assertValidSFMatrix4f(value)
    elif (type == 'MFMatrix4f'):
        assertValidMFMatrix4f(value)
    elif (type == 'SFMatrix3d'):
        assertValidSFMatrix3d(value)
    elif (type == 'MFMatrix3d'):
        assertValidMFMatrix3d(value)
    elif (type == 'SFMatrix4d'):
        assertValidSFMatrix4d(value)
    elif (type == 'MFMatrix4d'):
        assertValidMFMatrix4d(value)
    elif (type == str)   or isinstance(value, str):
        assertValidSFString(value)
    elif (str(parent) == 'fieldValue'):
        return True # TODO check further if possibleW
    elif (type == list) or isinstance(value, list):
        try:
            if isinstance(value[0], tuple):
                print ('*** assertValidFieldInitializationValue TODO validate list type: name=' + str(name) + ', passed type=' + str(type) + ', type(value)=' + str(type(value)) + ', value=' + str(value)[:100] + ', parent=' + parent,flush=True)
                return True # TODO check further
            initialListItemType = type(value[0])
            # https://stackoverflow.com/questions/522563/accessing-the-index-in-for-loops/28072982#28072982
            # https://stackoverflow.com/questions/1952464/in-python-how-do-i-determine-if-an-object-is-iterable
            for index, each in enumerate(value):
                assertValidFieldInitializationValue(name + '[' + str(index) + ']', initialListItemType, value[index], parent)
        except TypeError:
            return True # TODO check further if possible
    elif (type == tuple) or isinstance(value, tuple):
        print ('*** assertValidFieldInitializationValue TODO validate tuple type: name=' + str(name) + ', passed type=' + str(type) + ', type(value)=' + str(type(value)) + ', value=' + str(value)[:100] + ', parent=' + parent,flush=True)
        return True # TODO check further if possible
#       initialListItemType = type(value[0])
#       for index, each in enumerate(value):
#           assertValidFieldInitializationValue(name + '[' + str(index) + '], type(value[index])', value[index], parent)
    else:
        print ('*** assertValidFieldInitializationValue unknown type: name=' + str(name) + ', passed type=' + str(type) + ', type(value)=' + str(type(value)) + ', value=' + str(value)[:100] + ', parent=' + parent,flush=True)</xsl:text>
        <xsl:text>&#10;</xsl:text>
        <!-- TODO raise X3DTypeError once type checks are thorough and working -->

    </xsl:template>

    <!-- ===================================================== -->
    
    <!-- create python definitions for each X3D field type -->
    <xsl:template match="FieldType">
        
        <xsl:variable name="fieldTypeName" select="@type"/>
        <xsl:variable name="pythonBaseType">
            <xsl:call-template name="pythonBaseType">
                <xsl:with-param name="x3dFieldType" select="$fieldTypeName"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:variable name="tupleSize" select="@tupleSize"/>
        <xsl:variable name="isTuple"         select="(number($tupleSize) > 1)"/>
        <xsl:variable name="isList"          select="starts-with($fieldTypeName,'MF') or ($fieldTypeName = 'SFImage')"/>
        <xsl:variable name="hasEmptyDefault" select="(string-length(@defaultValue) = 0)"/>
        <xsl:variable name="annotation">
            <xsl:choose>
                <xsl:when test="($fieldTypeName = 'SFBool')">
                    <xsl:text>SFBool is a logical type with possible values (True|False).</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="substring-before(InterfaceDefinition/@appinfo,'.')"/>
                    <xsl:text>.</xsl:text>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>

        <xsl:text>class </xsl:text>
        <xsl:value-of select="$fieldTypeName"/>
        <xsl:text>(_X3DField)</xsl:text>
        <xsl:text>:</xsl:text>
        
        <!-- Python docstring -->
        <xsl:if test="(string-length(normalize-space($annotation)) > 0)">
            <xsl:text>
    """
    </xsl:text>
            <xsl:value-of select="$annotation"/>
            <xsl:text>
    """</xsl:text>
        </xsl:if>

        <xsl:text>
    NAME = '</xsl:text>
        <xsl:value-of select="$fieldTypeName"/>
        <xsl:text>'</xsl:text>
        
        <!-- TODO is there a suggested name or form for documentation url? -->
        <xsl:text>
    SPECIFICATION_URL = '</xsl:text>
        <xsl:value-of select="InterfaceDefinition/@SPECIFICATION_URL"/>
        <xsl:text>'
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html#</xsl:text>
        <xsl:value-of select="$fieldTypeName"/>
        <xsl:text>'</xsl:text>
    
        <xsl:text>
    DEFAULT_VALUE = </xsl:text>
        <xsl:variable name="defaultValue">
            <xsl:call-template name="pythonValue">
                <xsl:with-param name="x3dValue" select="@defaultValue"/>
                <xsl:with-param name="x3dType" select="$fieldTypeName"/>
            </xsl:call-template>
        </xsl:variable>
        <xsl:value-of select="$defaultValue"/>

        <!-- few special declarations or functions are needed, since they are essentially built into python already for each of the sequence types -->
        <xsl:choose>
            <xsl:when test="($fieldTypeName = 'SFNode')">
                <xsl:text>
    FIELD_DECLARATIONS = [('value', 'None', FieldType.SFNode, AccessType.inputOutput, 'SFNode')]</xsl:text>
            </xsl:when>
            <xsl:when test="($fieldTypeName = 'MFNode')">
                <xsl:text>
    FIELD_DECLARATIONS = [('value', None, FieldType.MFNode, AccessType.inputOutput, 'MFNode')]</xsl:text>
            </xsl:when>
            <xsl:otherwise>
            </xsl:otherwise>
        </xsl:choose>
        
        <xsl:text>
    ARRAY_TYPE = </xsl:text>
        <xsl:call-template name="pythonValue">
            <xsl:with-param name="x3dValue" select="@isArray"/>
            <xsl:with-param name="x3dType">
                <xsl:text>SFBool</xsl:text>
            </xsl:with-param>
        </xsl:call-template>
        <xsl:text>
    TUPLE_SIZE = </xsl:text>
        <xsl:call-template name="pythonValue">
            <xsl:with-param name="x3dValue" select="@tupleSize"/>
            <xsl:with-param name="x3dType">
                <xsl:text>SFBool</xsl:text>
            </xsl:with-param>
        </xsl:call-template>
        
        <!-- TODO modify regex for True False -->
        <xsl:text>
    REGEX_XML = r'</xsl:text> <!-- "raw" python string, unescaped -->
        <xsl:value-of select="@regex"/>
        <xsl:text>'</xsl:text>
        <xsl:text> # (includes lower-case true, false)</xsl:text>
        
        <xsl:text>
    def __init__(self, value=None):</xsl:text>
        <xsl:text>
        self.value = value</xsl:text>
        <!-- directly set value -->
        <!-- goal: use setter to set value so that any utility conversions and validation checks occur -->
        <!-- python property pattern: first entry is a getter -->
        <xsl:text>
    @property # getter - - - - - - - - - -
    def value(self):
        """ Provide typed value of this field instance. """
        return self.__value
    @value.setter
    def value(self, value=None):</xsl:text>
        <xsl:text>
        """ The value setter only allows correctly typed values. """</xsl:text>
        <!-- utility conversions -->
        <xsl:if test="($fieldTypeName = 'SFBool') or ($fieldTypeName = 'MFBool')">
                <xsl:text>
        value = fixBoolean(value, default=self.DEFAULT_VALUE)</xsl:text>
        </xsl:if>
        <xsl:text>
        if  value is None:
            value = self.DEFAULT_VALUE</xsl:text>
        <!-- tuple-ize list https://stackoverflow.com/questions/48745275/convert-list-of-string-to-list-of-tuples -->
        <!-- https://docs.python.org/3/tutorial/controlflow.html?highlight=break%20continue#break-and-continue-statements-and-else-clauses-on-loops -->
        <xsl:choose>
            <xsl:when test="contains($fieldTypeName, 'Vec2f')">
                <xsl:text>
        elif isinstance(value, list):
            for each in value: # check that elements are not tuples
                if isinstance(each, tuple):
                    break
            else: # no tuples found, create 2-tuples
                value = [(x, y) for x, y, in value]</xsl:text>
            </xsl:when>
            <xsl:when test="contains($fieldTypeName, 'Vec3f') or ends-with($fieldTypeName, 'Color')">
                <xsl:text>
        elif isinstance(value, list):
            for each in value: # check that elements are not tuples
                if isinstance(each, tuple):
                    break
            else: # no tuples found, create 3-tuples
                value = [(x, y, z) for x, y, z in value]</xsl:text>
            </xsl:when>
            <xsl:when test="contains($fieldTypeName, 'Vec4f') or ends-with($fieldTypeName, 'ColorRGBA') or ends-with($fieldTypeName, 'Rotation')">
                <xsl:text>
        elif isinstance(value, list):
            for each in value: # check that elements are not tuples
                if isinstance(each, tuple):
                    break
            else: # no tuples found, create 4-tuples
                value = [(x, y, z, w) for x, y, z, w in value]</xsl:text>
            </xsl:when>
        </xsl:choose>
        <!-- add type-aware valid-value checks -->
        <xsl:choose>
            <xsl:when test="starts-with($fieldTypeName, 'SF')">
                <!-- downcast singleton to SF type -->
                <xsl:text>
        elif isinstance(value, MF</xsl:text><!-- MF corresponding to this SF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <xsl:text>) and isinstance(value.value, list) and len(value.value) == 1:
            print("downcasting by dereferencing simple-list value=" + str(value)[:100] + ", type=" + str(type(value)) + " as " + str(value.value[0]))
            value = </xsl:text>
                <xsl:text>value.value[0] # dereference
        elif isinstance(value, list) and len(value) == 1:
            value = </xsl:text>
                <xsl:text>value[0] # dereference</xsl:text>
            </xsl:when>
            <xsl:when test="starts-with($fieldTypeName, 'MF')">
                <xsl:text>
        elif not isinstance(value, list) and isValidSF</xsl:text><!-- SF corresponding to this MF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <!-- upcast to MF type -->
                <xsl:text>(value):
            value = </xsl:text>
                <xsl:text>[value]</xsl:text>
            </xsl:when>
        </xsl:choose>

                <xsl:text>
        assertValid</xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
        <xsl:text>(value)</xsl:text><!-- throws exception if not -->
        <!-- ready to save -->
        <xsl:text>
        self.__value = value</xsl:text>
        
        <xsl:choose>
            <!-- string output support -->
            <xsl:when test="($fieldTypeName = 'MFNode')">
                <!-- string-getter utility method, since regular repl function not available for list of nodes -->
                <xsl:text>
    def __repl__(self):
        result = '['
        for each in self.__value:
            result += str(each) + ', '
        return result.rstrip(', ') + ']'</xsl:text>
            </xsl:when>
        </xsl:choose>
        <xsl:choose>
            <xsl:when test="starts-with($fieldTypeName, 'SF')">
                <xsl:text>
    def __bool__(self):
        return len(self.__value) > 0</xsl:text>
            </xsl:when>
            <xsl:when test="starts-with($fieldTypeName, 'MF')">
                <xsl:text>
    def append(self, value=None):
        """ Add to existing value list, first ensuring that a correctly typed value is applied. """
        if  not value is None:
            if isValidSF</xsl:text><!-- SF corresponding to this MF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <xsl:text>(value):
                if isinstance(value, SF</xsl:text><!-- SF corresponding to this MF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <xsl:text>):
                    value = value.value # dereference
                self.__value.append(value)
            elif isValid</xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
                <xsl:text>(value):
                for each in value:
                    while isinstance(each, list) and len(each) == 1:
                        each = each[0] # dereference
                    if isinstance(each, SF</xsl:text><!-- SF corresponding to this MF type -->
                <xsl:value-of select="substring($fieldTypeName,3)"/>
                <xsl:text>):
                        each = each.value # dereference
                    self.__value.append(each)
            else:
                assertValid</xsl:text>
                <xsl:value-of select="$fieldTypeName"/>
                <xsl:text>(value) # report type failure
    def __bool__(self):
        return len(self.__value) > 0
    def __len__(self):
        return len(self.__value)</xsl:text>
            </xsl:when>
        </xsl:choose>
        
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->
    
    <!-- create python definitions for each X3D field type, prefixed with _ underscore since intended for internal use only -->
    <xsl:template match="AbstractNodeType | AbstractObjectType">

        <xsl:variable name="annotation">
            <xsl:value-of select="InterfaceDefinition/@appinfo"/>
        </xsl:variable>
        <xsl:variable name="baseType" select="InterfaceDefinition/Inheritance/@baseType"/>
        
        <xsl:text>class _</xsl:text>
        <xsl:value-of select="@name"/>
        <xsl:text>(</xsl:text>
        <xsl:choose>
            <xsl:when test="(@name = 'X3DNode')">
                <xsl:text>object</xsl:text>
            </xsl:when>
            <xsl:when test="(string-length($baseType) > 0)">
                <xsl:text>_</xsl:text>
                <xsl:value-of select="$baseType"/>
            </xsl:when>
            <xsl:otherwise>
                <xsl:text>_X3DNode</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        <xsl:text>)</xsl:text>
        <xsl:text>:</xsl:text>
        
        <!-- Python docstring -->
        <xsl:if test="(string-length(normalize-space($annotation)) > 0)">
            <xsl:text>
    """
    </xsl:text>
            <xsl:value-of select="$annotation"/>
            <xsl:text>
    """</xsl:text>
        </xsl:if>

        <xsl:text>
    NAME = '_</xsl:text>
        <xsl:value-of select="@name"/>
        <xsl:text>'</xsl:text>
        
        <!-- TODO is there a suggested name or form for documentation url? -->
        <xsl:text>
    SPECIFICATION_URL = '</xsl:text>
        <xsl:value-of select="InterfaceDefinition/@SPECIFICATION_URL"/>
        <xsl:text>'</xsl:text>
        
        <xsl:choose>
            <xsl:when test="(@name = 'X3DNode')">
            <xsl:text>
    def __init__(self, DEF="", USE="", class_="", metadata=None, IS=None):
        self.DEF = DEF
        self.USE = USE
        self.class_ = class_
        self.IS = IS
        self.metadata = metadata
        # if _DEBUG: print('... in </xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text> __init__(' + str(DEF) + ',' + str(USE) + ',' + str(class_) + ',' + str(metadata) + ',' + str(IS) + ')',flush=True)
    @property # getter - - - - - - - - - -
    def DEF(self):
        """ Unique ID name for this node, referenceable by other nodes. """
        return self.__DEF
    @DEF.setter
    def DEF(self, DEF=None):
        if  DEF is None:
            DEF = SFString.DEFAULT_VALUE
        assertValidSFString(DEF)
        self.__DEF = str(DEF)
        if self.__DEF:
            self.__USE = None # DEF and USE are mutually exclusive
    @property # getter - - - - - - - - - -
    def USE(self):
        """ Reuse an already DEF-ed node ID, excluding all child nodes and all other attributes. """
        return self.__USE
    @USE.setter
    def USE(self, USE=None):
        if  USE is None:
            USE = SFString.DEFAULT_VALUE
        assertValidSFString(USE)
        self.__USE = str(USE)
        if self.__USE:
            self.__DEF = None # DEF and USE are mutually exclusive
    @property # getter - - - - - - - - - -
    def class_(self):
        """ Space-separated list of classes, reserved for use by CSS cascading stylesheets. """
        return self.__class_
    @class_.setter
    def class_(self, class_=None):
        if  class_ is None:
            class_ = SFString.DEFAULT_VALUE
        assertValidSFString(class_)
        self.__class_ = class_
    @property # getter - - - - - - - - - -
    def IS(self):
        """ The IS statement connects node fields defined inside a ProtoBody declaration back to corresponding ProtoInterface fields. """
        return self.__IS
    @IS.setter
    def IS(self, IS=None):
        if  IS is None:
            IS = SFNode.DEFAULT_VALUE
        assertValidSFNode(IS)
        if not isinstance(IS, object):
            # print(flush=True)
            raise X3DTypeError(str(IS) + ' does not have a valid node type object')
        self.__IS = IS
    @property # getter - - - - - - - - - -
    def metadata(self):
        """ The metadata field can contain a single MetadataBoolean, MetadataInteger, MetadataFloat, MetadataDouble, MetadataString or MetadataSet node. """
        return self.__metadata
    @metadata.setter
    def metadata(self, metadata=None):
        if  metadata is None:
            metadata = SFNode.DEFAULT_VALUE
        assertValidSFNode(metadata)
        if not isinstance(metadata, object):
            # print(flush=True)
            raise X3DTypeError(str(metadata) + ' does not have a valid node type object')
        self.__metadata = metadata
    def __repl__(self):
        result = self.NAME + '('
        # TODO put DEF first, matching canonical form
        for each in self.FIELD_DECLARATIONS:
            # if _DEBUG: print(self.NAME + ' for each in self.FIELD_DECLARATIONS: each=' + str(each))
            name = each[0]
            default = each[1]
            type_ = each[2]
            accessType = each[3]
            value = getattr(self, name)
            # if _DEBUG: print('gettattr(self, ' + str(name) + ') value="' + str(value)[:100] + '" for FIELD_DECLARATIONS ' + str(each) + ')',flush=True)
            if value != default:
                # consider whether indentation is useful; probably not
                # print("\n\t")
                if  isinstance(value, list): # avoid X3DTypeError if value is not iterable
                    result += str(name) + '=['
                    for next in value:
                        # if _DEBUG: print('* X3DNode debug: str(next)=' + str(next),flush=True)
                        result += str(next) + ', '
                    result = result.rstrip(', ')
                    result += '],'
                elif isinstance(value, str) and "'" in value:
                    result += str(name) + '=' + '"' + str(value)[:100] + '"' + ','
                elif isinstance(value, str) and value != default:
                    result += str(name) + '=' + "'" + str(value)[:100] + "'" + ','
                elif value != default:
                    result += str(name) + '='       + str(value)[:100]       + ','
                # elif _DEBUG:
                #   result += str(name) + '=' + "'" + str(value)[:100] + "'" + ','
        return result.strip().rstrip(',').rstrip(', ') + ')'
    def __str__(self):
        return self.__repl__().strip() # </xsl:text>
                <xsl:value-of select="@name"/>
            </xsl:when>
<!-- __str__ not needed if __repl__ is satisfactory
    def __str__(self):
        result = self.NAME + ' '
        for each in self.FIELD_DECLARATIONS:
            name= each[0]
            default = each[1]
            value= getattr(self, name)
            if value != default:
                if   isinstance(value, str) and "'" in value:
                    result += str(name) + '=' + '"' + str(value)[:100] + '"' + ' '
                elif isinstance(value, str):
                    result += str(name) + '=' + "'" + str(value)[:100] + "'" + ' '
                else:
                    result += str(name) + '='       + str(value)[:100]       + ' '
        return result.strip()
-->
            <xsl:when test="(local-name() = 'AbstractNodeType') or (@name = 'X3DMetadataObject')">
                <!-- discussion to avoid use of super(), especially when explicit superclass is known - but self can become problematic.
                     see Mark Lutz, Learning Python, 5th edition, pp. 1076-1086 -->
                <xsl:text>
    def __init__(self, DEF, USE, class_, IS, metadata):
        # if _DEBUG: print('... in </xsl:text>
                <xsl:value-of select="local-name()"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="@name"/>
                <xsl:text> __init__ calling super.__init__(' + str(DEF) + ',' + str(USE) + ',' + str(class_) + ',' + str(metadata) + ',' + str(IS) + ')',flush=True)
        super().__init__(DEF, USE, class_, IS, metadata) # fields for _X3DNode only</xsl:text>
            </xsl:when>
        </xsl:choose>

        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->
    
    <xsl:template match="*"> <!-- rule to process each ConcreteNode and Statement element -->
    
        <xsl:variable name="annotation">
            <xsl:value-of select="InterfaceDefinition/@appinfo"/>
        </xsl:variable>
        
        <!-- common initial processing for each element -->
        <xsl:variable name="elementName" select="@name"/>
        <xsl:text>class </xsl:text>
        <xsl:value-of select="$elementName"/>
        <xsl:variable name="baseType" select="InterfaceDefinition/Inheritance/@baseType"/>
        <xsl:choose>
            <xsl:when test="($elementName = 'X3D')">
                <xsl:text>(</xsl:text>
                <xsl:text>_X3DNode</xsl:text> <!-- necessary for string output, TODO verify -->
            </xsl:when>
            <xsl:when test="(local-name() = 'Statement')">
                <xsl:text>(</xsl:text>
                <xsl:text>_X3DStatement</xsl:text>
            </xsl:when>
            <xsl:when test="(string-length($baseType) > 0)">
                <xsl:text>(_</xsl:text>
                <xsl:value-of select="$baseType"/>
            </xsl:when>
            <xsl:otherwise>
                <!-- TODO perhaps not needed -->
            </xsl:otherwise>
        </xsl:choose>
        <!-- Python multiple inheritance https://docs.python.org/3/tutorial/classes.html#multiple-inheritance -->
        <!-- TODO fix nodes with problematic hierarchy -->
        <xsl:choose>
            <xsl:when test="starts-with($elementName, 'Metadata') or contains($elementName, 'Layout') or contains($elementName, 'Shader')">
                <xsl:text>)</xsl:text>
                <xsl:text>:</xsl:text>
                <xsl:text> # </xsl:text>
                <xsl:for-each select=".//AdditionalInheritance">
                    <xsl:text>, _</xsl:text>
                    <xsl:value-of select="@baseType"/>
                </xsl:for-each>
                <xsl:text> # TODO fix additional inheritance method resolution order (MRO)</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <xsl:for-each select=".//AdditionalInheritance">
                    <xsl:text>, _</xsl:text>
                    <xsl:value-of select="@baseType"/>
                </xsl:for-each>
                <xsl:text>)</xsl:text>
                <xsl:text>:</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        
        <!-- Python docstring -->
            <xsl:text>
    """
    </xsl:text>
    
        <xsl:variable name="tooltipText"><!-- /attribute[@name = $fieldName] -->
            <xsl:value-of select="$x3d.tooltips.document//element[@name = $elementName]/@tooltip" disable-output-escaping="yes"/>
        </xsl:variable>
        <xsl:variable name="fieldTooltip">
            <xsl:if test="(string-length(normalize-space($tooltipText)) > 0)"><!-- doc-available($x3d.tooltips.path) -->
                <xsl:value-of select="replace(replace($tooltipText,'&#8734;','infinity'),'&#960;','pi')" disable-output-escaping="yes"/>
                <!-- consistent javadoc punctuation -->
                <xsl:if test="not(ends-with(normalize-space($tooltipText),'.')) and not(contains($tooltipText,'http')) and not(contains($tooltipText,'mailto')) and not(contains($tooltipText,'ftp'))">
                    <xsl:text>.</xsl:text>
                </xsl:if>
            </xsl:if>
        </xsl:variable>

        <xsl:choose>
            <xsl:when test="(string-length(normalize-space($annotation)) > 0)">
                <xsl:value-of select="$annotation"/>
            </xsl:when>
            <xsl:when test="(string-length(normalize-space($fieldTooltip)) > 0)">
                <xsl:value-of select="substring-before($fieldTooltip,'.')"/>
                <xsl:text>.</xsl:text>
                <xsl:message>
                    <xsl:text>*** Warning: annotation not found in X3DUOM, used tooltip as docstring for </xsl:text>
                    <xsl:value-of select="$elementName"/>
                </xsl:message>
            </xsl:when>
            <xsl:otherwise>
                <xsl:text>X3D element</xsl:text>
                <xsl:message>
                    <xsl:text>*** Warning: no annotation or tooltip found for </xsl:text>
                    <xsl:value-of select="$elementName"/>
                </xsl:message>
            </xsl:otherwise>
        </xsl:choose>
            <xsl:text>
    """</xsl:text>

        <xsl:text>
    NAME = '</xsl:text>
        <xsl:value-of select="$elementName"/>
        <xsl:text>'</xsl:text>
        
        <!-- TODO is there a suggested name or form for documentation url? -->
        <xsl:text>
    SPECIFICATION_URL = '</xsl:text>
        <xsl:value-of select="InterfaceDefinition/@SPECIFICATION_URL"/>
        <xsl:text>'
    TOOLTIP_URL = 'https://www.web3d.org/x3d/tooltips/X3dTooltips.html#</xsl:text>
        <xsl:value-of select="$elementName"/>
        <xsl:text>'</xsl:text>
        
        <!-- Special constants -->
        <xsl:choose>
            <xsl:when test="($elementName = 'X3D')">
                <!-- special constant declarations -->
                <xsl:text disable-output-escaping="yes"><![CDATA[
    XML_HEADER = '<?xml version="1.0" encoding="UTF-8"?>'
    XML_DOCTYPE_X3D_3_0 = '<!DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.0//EN" "http://www.web3d.org/specifications/x3d-3.0.dtd">'
    XML_DOCTYPE_X3D_3_1 = '<!DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.1//EN" "http://www.web3d.org/specifications/x3d-3.1.dtd">'
    XML_DOCTYPE_X3D_3_2 = '<!DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.2//EN" "http://www.web3d.org/specifications/x3d-3.2.dtd">'
    XML_DOCTYPE_X3D_3_3 = '<!DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 3.3//EN" "http://www.web3d.org/specifications/x3d-3.3.dtd">'
    XML_DOCTYPE_X3D_4_0 = '<!DOCTYPE X3D PUBLIC "ISO//Web3D//DTD X3D 4.0//EN" "http://www.web3d.org/specifications/x3d-4.0.dtd">'
    X3D_XML_SCHEMA_ATTRIBUTES_3_0 = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.0.xsd'"
    X3D_XML_SCHEMA_ATTRIBUTES_3_1 = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.1.xsd'"
    X3D_XML_SCHEMA_ATTRIBUTES_3_2 = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.2.xsd'"
    X3D_XML_SCHEMA_ATTRIBUTES_3_3 = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-3.3.xsd'"
    X3D_XML_SCHEMA_ATTRIBUTES_4_0 = "xmlns:xsd='http://www.w3.org/2001/XMLSchema-instance' xsd:noNamespaceSchemaLocation='http://www.web3d.org/specifications/x3d-4.0.xsd'"]]></xsl:text>
            </xsl:when>
        </xsl:choose>
    
        <xsl:variable name="allFields"    select="InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')]"/>
        <!-- TODO sometimes need to avoid DEF, USE, IS, metadata, class_
        <xsl:variable name="localFields"  select="InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')]
                                                        [not(@name = 'DEF') and not(@name = 'USE') and not(@name = 'IS') and not(@name = 'metadata') and not(@name = 'class_')]"/>
        -->
        <!--
        <xsl:variable name="simpleFields" select="InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')][not(contains(@type,'Node'))]"/>
        <xsl:variable name="nodeFields"   select="InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')][   (contains(@type,'Node'))]"/>
        -->
        <!-- special case, treat component/unit/meta as children (same as Scene) but select fails mysteriously
        <xsl:variable name="allFields">
            <xsl:choose>
                <xsl:when test="($elementName = 'head')">
                    <xsl:value-of select="//Statement[@name='Scene']/InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')]"/>
                </xsl:when>
            <xsl:choose>
                    <xsl:value-of select="InterfaceDefinition/field[(@accessType = 'initializeOnly') or (@accessType = 'inputOutput')]"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable> -->
        <!-- debug
        <xsl:message>
            <xsl:text>*** $elementName=</xsl:text>
            <xsl:value-of select="$elementName"/>
            <xsl:text>, count($allFields)=</xsl:text>
            <xsl:value-of select="count($allFields)"/>
            <xsl:text>, count($localFields)=</xsl:text>
            <xsl:value-of select="count($localFields)"/>
        </xsl:message> -->
        
        <!-- FIELD_DECLARATIONS -->
        <xsl:choose>
            <xsl:when test="($elementName = 'head')">
                <!-- brute-force copied from class Scene  :( -->
                <!-- beware: original was tuple of tuples, which failed intermittently/bitterly. list of tuples is better. -->
                <xsl:text>
    FIELD_DECLARATIONS = [('children', None, FieldType.MFNode, AccessType.inputOutput, 'head')]
    def __init__(self, children=None):
        self.children = children
    @property # getter - - - - - - - - - -
    def children(self):
        """ The head statement has children consisting of component, unit and meta statements. """
        return self.__children
    @children.setter
    def children(self, children=None):
        if  children is None:
            children = MFNode.DEFAULT_VALUE
        assertValidMFNode(children)
        self.__children = children</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                
        <!-- field default values -->
        <xsl:for-each select="$allFields">
                <xsl:sort select="(@name = 'metadata')"/>
                <xsl:sort select="(@name = 'IS')"/>
                <xsl:sort select="(@name = 'class')"/>
                <xsl:sort select="(@name = 'USE')"/>
                <xsl:sort select="(@name = 'DEF')"/>
                <xsl:sort select="(@type='MFNode')"/>
                <xsl:sort select="(@type='SFNode') and not(@name = 'IS') and not(@name = 'metadata')"/>
                <xsl:sort select="not(contains(@type,'Node')) and not(@name = 'DEF') and not(@name = 'USE') and not(@name = 'class')"/>

            <xsl:variable name="fieldName">
                <xsl:call-template name="fieldName">
                    <xsl:with-param name="name" select="@name"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:variable name="defaultValue">
                <xsl:call-template name="pythonValue">
                    <xsl:with-param name="x3dValue" select="@default"/>
                    <xsl:with-param name="x3dType" select="@type"/>
                </xsl:call-template>
            </xsl:variable>
            
            <xsl:if test="(position() = 1)">
                <xsl:text>
    FIELD_DECLARATIONS = [ # name, defaultValue, type, accessType, inheritedFrom</xsl:text>
            </xsl:if>
            <!-- avoid duplicate fields problem in X3DUOM, e.g. ParticleSet geometry (TODO fix X3DUOM) -->
            <xsl:choose>
                <xsl:when test="not(preceding-sibling::*[@name = $fieldName])">
                    <xsl:text>
                          </xsl:text>
                    <xsl:text>('</xsl:text>
                    <xsl:value-of select="$fieldName"/>
                    <xsl:text>', </xsl:text>
                    <xsl:value-of select="$defaultValue"/>
                    <xsl:text>, FieldType.</xsl:text>
                    <xsl:value-of select="@type"/>
                    <xsl:text>, AccessType.</xsl:text>
                    <xsl:value-of select="@accessType"/>
                    <xsl:text>, '</xsl:text>
                    <xsl:choose>
                        <xsl:when test="(string-length(@inheritedFrom) > 0)">
                            <xsl:value-of select="@inheritedFrom"/>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:value-of select="$elementName"/><!-- this object -->
                        </xsl:otherwise>
                    </xsl:choose>
                    <xsl:text>'</xsl:text>
                    <xsl:text>)</xsl:text>
                    <xsl:choose>
                        <xsl:when test="not(position() = last())">
                            <xsl:text>,</xsl:text><!-- pylint requires consistently indenting each value -->
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:text>]</xsl:text>
                        </xsl:otherwise>
                    </xsl:choose>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:message>
                        <xsl:text>*** Warning, duplicate field encountered in X3DUOM: </xsl:text>
                        <xsl:value-of select="$elementName"/>
                        <xsl:text> </xsl:text>
                        <xsl:value-of select="$fieldName"/>
                    </xsl:message>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:for-each>
        
        <xsl:text>
    def __init__(self</xsl:text>
        <!-- , XML=None -->
        <!-- field declarations as parameters -->
        <xsl:if test="$allFields">
            <xsl:text>,</xsl:text>
            <xsl:for-each select="$allFields">
                <!-- all fields get initial values so that any-order invocation of __init__.py is supported -->
                <xsl:sort select="(@name = 'metadata')"/>
                <xsl:sort select="(@name = 'IS')"/>
                <xsl:sort select="(@name = 'class')"/>
                <xsl:sort select="(@name = 'USE')"/>
                <xsl:sort select="(@name = 'DEF')"/>
                <xsl:sort select="(@type='MFNode')"/>
                <xsl:sort select="(@type='SFNode') and not(@name = 'IS') and not(@name = 'metadata')"/>
                <xsl:sort select="not(contains(@type,'Node')) and not(@name = 'DEF') and not(@name = 'USE') and not(@name = 'class')"/>
                
                <xsl:variable name="fieldName">
                    <xsl:call-template name="fieldName">
                        <xsl:with-param name="name" select="@name"/>
                    </xsl:call-template>
                </xsl:variable>
                <xsl:variable name="defaultValue">
                    <xsl:call-template name="pythonValue">
                        <xsl:with-param name="x3dValue" select="@default"/>
                        <xsl:with-param name="x3dType" select="@type"/>
                    </xsl:call-template>
                </xsl:variable>
                <!-- avoid duplicate fields problem in X3DUOM, e.g. ParticleSet geometry (TODO fix X3DUOM) -->
                <xsl:if test="not(preceding-sibling::*[@name = $fieldName])">
                    <xsl:text>
                 </xsl:text><!-- indent each field to avoid pylint warning -->
                    <xsl:value-of select="$fieldName"/>
                    <xsl:text>=</xsl:text>
                    <!-- doesn't avoid pylint (dangerous-default-value) warning
                    <xsl:choose>
                        <xsl:when test="($defaultValue = 'list()')">
                            <xsl:value-of select="@type"/>
                            <xsl:text>.DEFAULT_VALUE</xsl:text>
                        </xsl:when>
                        <xsl:otherwise>
                            <xsl:value-of select="$defaultValue"/>
                        </xsl:otherwise>
                    </xsl:choose> -->
                    <xsl:value-of select="$defaultValue"/>
                    <xsl:if test="(position() != last())">
                        <xsl:text>,</xsl:text>
                    </xsl:if>
                </xsl:if>
            </xsl:for-each>
            <xsl:text>):</xsl:text>
        </xsl:if>
        <xsl:if test="(local-name() = 'ConcreteNode')">
            <xsl:text>
        # if _DEBUG: print('... in </xsl:text>
                <xsl:value-of select="local-name()"/>
                <xsl:text> </xsl:text>
                <xsl:value-of select="@name"/>
                <!-- discussion to avoid use of super(), especially when explicit superclass is known - but self can become problematic.
                     see Mark Lutz, Learning Python, 5th edition, pp. 1076-1086 -->
                <xsl:text> __init__ calling super.__init__(' + str(DEF) + ',' + str(USE) + ',' + str(class_) + ',' + str(metadata) + ',' + str(IS) + ')',flush=True)
        super().__init__(DEF, USE, class_, IS, metadata) # fields for _X3DNode only</xsl:text>
        </xsl:if>
        
        <!-- field initializations -->
        <xsl:for-each select="$allFields">
                <xsl:sort select="(@name = 'metadata')"/>
                <xsl:sort select="(@name = 'IS')"/>
                <xsl:sort select="(@name = 'class')"/>
                <xsl:sort select="(@name = 'USE')"/>
                <xsl:sort select="(@name = 'DEF')"/>
                <xsl:sort select="(@type='MFNode')"/>
                <xsl:sort select="(@type='SFNode') and not(@name = 'IS') and not(@name = 'metadata')"/>
                <xsl:sort select="not(contains(@type,'Node')) and not(@name = 'DEF') and not(@name = 'USE') and not(@name = 'class')"/>

            <xsl:variable name="fieldName">
                <xsl:call-template name="fieldName">
                    <xsl:with-param name="name" select="@name"/>
                </xsl:call-template>
            </xsl:variable>
            
            <!-- do not redeclare fields included in X3DNode -->
            <xsl:if test="not($fieldName = 'DEF')      and not($fieldName = 'USE') and not($fieldName = 'class_') and
                          not($fieldName = 'metadata') and not($fieldName = 'IS')">
                <xsl:text>
        self.</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text> = </xsl:text>
                <xsl:value-of select="$fieldName"/>
            </xsl:if>
        </xsl:for-each>
        
        <!-- property of each field in this element -->
        <xsl:for-each select="$allFields">
                <xsl:sort select="(@name = 'metadata')"/>
                <xsl:sort select="(@name = 'IS')"/>
                <xsl:sort select="(@name = 'class')"/>
                <xsl:sort select="(@name = 'USE')"/>
                <xsl:sort select="(@name = 'DEF')"/>
                <xsl:sort select="(@type='MFNode')"/>
                <xsl:sort select="(@type='SFNode') and not(@name = 'IS') and not(@name = 'metadata')"/>
                <xsl:sort select="not(contains(@type,'Node')) and not(@name = 'DEF') and not(@name = 'USE') and not(@name = 'class')"/>

            <xsl:variable name="fieldName">
                <xsl:call-template name="fieldName">
                    <xsl:with-param name="name" select="@name"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:variable name="defaultValue">
                <xsl:call-template name="pythonValue">
                    <xsl:with-param name="x3dValue" select="@default"/>
                    <xsl:with-param name="x3dType" select="@type"/>
                </xsl:call-template>
            </xsl:variable>
            <xsl:variable name="acceptableNodeType">
                <xsl:choose>
                    <xsl:when test="(string-length(@acceptableNodeType) > 0) and not(contains(@acceptableNodeType,','))">
                        <xsl:value-of select="@acceptableNodeType"/>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:text>object</xsl:text><!-- TODO more including X3DNode -->
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:variable>
            <!-- debug
            <xsl:variable name="inheritanceName"           select="../Inheritance/@baseType"/>
            <xsl:variable name="additionalInheritanceName" select="../AdditionalInheritance/@baseType"/>
            <xsl:variable name="upperFieldName"            select="concat(upper-case(substring(@name,1,1)),substring(@name,2))"/>
            <xsl:variable name="isNodeType"                select="(@type = 'SFNode') or (@type = 'MFNode')"/>
            <xsl:message>
                <xsl:value-of select="$elementName"/>
                <xsl:text> fieldName=</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>, upperFieldName=</xsl:text>
                <xsl:value-of select="$upperFieldName"/>
                <xsl:text>, inheritanceName=</xsl:text>
                <xsl:value-of select="$inheritanceName"/>
                <xsl:text>, isNodeType=</xsl:text>
                <xsl:value-of select="$isNodeType"/>
                <xsl:if test="(string-length($additionalInheritanceName) > 0)">
                    <xsl:text>, additionalInheritanceName=</xsl:text>
                    <xsl:value-of select="$additionalInheritanceName"/>
                </xsl:if>
            </xsl:message> -->
            
            <!-- do not redeclare fields included in X3DNode -->
            <xsl:if test="not($fieldName = 'DEF')      and not($fieldName = 'USE') and not($fieldName = 'class_') and
                          not($fieldName = 'metadata') and not($fieldName = 'IS')">
                <xsl:text>
    @property # getter - - - - - - - - - -
    def </xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>(self):</xsl:text>
                <!-- TODO insert docstring """ tooltip """ -->
                <xsl:variable name="tooltipText">
                    <xsl:value-of select="$x3d.tooltips.document//element[@name = $elementName]/attribute[@name = $fieldName]/@tooltip" disable-output-escaping="yes"/>
                </xsl:variable>
                <xsl:variable name="fieldTooltip">
                    <xsl:if test="(string-length(normalize-space($tooltipText)) > 0)"><!-- doc-available($x3d.tooltips.path) -->
                        <xsl:value-of select="replace(replace($tooltipText,'&#8734;','infinity'),'&#960;','pi')" disable-output-escaping="yes"/>
                        <!-- consistent javadoc punctuation -->
                        <xsl:if test="not(ends-with(normalize-space($tooltipText),'.')) and not(contains($tooltipText,'http')) and not(contains($tooltipText,'mailto')) and not(contains($tooltipText,'ftp'))">
                            <xsl:text>.</xsl:text>
                        </xsl:if>
                    </xsl:if>
                </xsl:variable>
                <xsl:if test="(string-length(normalize-space($fieldTooltip)) > 0)">
                    <xsl:text>
        """</xsl:text>
                    <xsl:value-of select="normalize-space(substring-before(substring-after($fieldTooltip,']'),'.'))"/>
                    <xsl:text>.</xsl:text>
                    <xsl:text>"""</xsl:text>
                </xsl:if>

                <xsl:text>
        return self.__</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <!-- setter -->
                <xsl:text>
    @</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>.setter</xsl:text>
                <xsl:text>
    def </xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>(self, </xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>=None):
        if  </xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text> is None:
            </xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text> = </xsl:text>
                <xsl:value-of select="@type"/>
                <xsl:text>.DEFAULT_VALUE</xsl:text>
                 
                <xsl:variable name="parentElementName" select="../../@name"/><!-- if present -->
                <xsl:choose>
                    <!-- first is MFNode list for field/fieldValue -->
                    <xsl:when test="($fieldName = 'field') or ($fieldName = 'fieldValue')">
                        <xsl:text>
        # TODO type-aware checks for </xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <!-- trace 
                        <xsl:text> parentElementName=</xsl:text><xsl:value-of select="$parentElementName"/> -->
                        <xsl:text>
        if </xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>: # walk each child node, if any
            for each in </xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>:
                assertValidFieldInitializationValue(each.name, </xsl:text>
                        <xsl:choose>
                            <xsl:when test="($fieldName = 'fieldValue')">
                                <xsl:text>type(each.value), each.value, parent='fieldValue'</xsl:text><!-- fieldValue and ExternProtoDeclare/field have no local type information -->
                            </xsl:when>
                            <xsl:when test="($parentElementName = 'ExternProtoDeclare')">
                                <xsl:text>type(each.value), each.value, parent='ExternProtoDeclare/field'</xsl:text><!-- fieldValue and ExternProtoDeclare/field have no local type information -->
                            </xsl:when>
                            <xsl:when test="($fieldName = 'field')">
                                <xsl:text>each.type, each.value, parent='</xsl:text>
                                <xsl:value-of select="$parentElementName"/>
                                <xsl:text>'</xsl:text>
                            </xsl:when>
                        </xsl:choose>
                        <xsl:text>)</xsl:text>
                    </xsl:when>
                    
                    <!-- next two are value attribute within 'fieldValue' or field within ExternProtoDeclare, which have no local definition of type -->
                    <xsl:when test="(($elementName = 'fieldValue') and ($fieldName = 'value'))">
                    <xsl:text>
        assertValidFieldInitializationValue(self.name,type(value),value,parent='fieldValue')</xsl:text>
                    </xsl:when>
                    <xsl:when test="(($elementName = 'field')      and ($fieldName = 'value') and ($parentElementName = 'ExternProtoDeclare'))">
                    <xsl:text>
        assertValidFieldInitializationValue(self.name,type(value),value,parent='ExternProtoDeclare/field')</xsl:text>
                    </xsl:when>
                    <!-- next is value attribute within 'field' -->
                    <xsl:when test="($elementName = 'field') and ($fieldName = 'value')">
                    <xsl:text>
        assertValidFieldInitializationValue(self.name,self.type,value,parent='field/@value')</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                <xsl:text>
        assertValid</xsl:text>
                <xsl:value-of select="@type"/>
                <xsl:text>(</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text>)</xsl:text>
                <xsl:call-template name="valueRestrictionCheck">
                    <xsl:with-param name="fieldName" select="$fieldName"/>
                    <xsl:with-param name="indent"><xsl:text>    </xsl:text></xsl:with-param>
                    <xsl:with-param name="type"        ><xsl:value-of select="@type"/></xsl:with-param>
                    <xsl:with-param name="minInclusive"><xsl:value-of select="@minInclusive"/></xsl:with-param>
                    <xsl:with-param name="maxInclusive"><xsl:value-of select="@maxInclusive"/></xsl:with-param>
                    <xsl:with-param name="minExclusive"><xsl:value-of select="@minExclusive"/></xsl:with-param>
                    <xsl:with-param name="maxExclusive"><xsl:value-of select="@maxExclusive"/></xsl:with-param>
                </xsl:call-template>
                <xsl:choose>
                    <xsl:when test="(@type = 'SFNode') and (string-length($acceptableNodeType) > 0)">
                        <xsl:text>
        if not isinstance(</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>, </xsl:text>
                        <xsl:value-of select="$acceptableNodeType"/>
                        <xsl:text>):
            # print(flush=True)
            raise X3DTypeError(str(</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>) + ' does not have a valid node type </xsl:text>
                        <xsl:value-of select="$acceptableNodeType"/>
                        <xsl:text>')</xsl:text>
                    </xsl:when>
                    <xsl:when test="(@type = 'MFNode')">
                        <!-- TODO -->
                    </xsl:when>
                </xsl:choose>
                    </xsl:otherwise>
                </xsl:choose>
                <xsl:text>
        self.__</xsl:text>
                <xsl:value-of select="$fieldName"/>
                <xsl:text> = </xsl:text>
                <xsl:value-of select="$fieldName"/>
            </xsl:if>
        
        </xsl:for-each>
            </xsl:otherwise>
        </xsl:choose>
        
        <!-- Additional Functions -->
        
        <!-- hasChild() function -->
        <xsl:text>
    # hasChild() function - - - - - - - - - -
    def hasChild(self):
        ''' Whether or not this node has a child node, statement or comment '''</xsl:text>
        <xsl:choose>
                <!-- TODO hasComment
            <xsl:when test="($elementName = 'X3D')">
                <xsl:text>
        return bool(self.head) or bool(self.Scene)</xsl:text>
            </xsl:when> -->
            <xsl:when test="($elementName = 'head')">
                <!-- TODO hasComment -->
                <xsl:text>
        return bool(self.children)</xsl:text>
            </xsl:when>
            <xsl:when test="(count($allFields[contains(@type,'Node')]) > 0)">
                <!-- TODO hasComment -->
                <xsl:for-each select="$allFields[contains(@type,'Node')]">
                    <xsl:sort select="(@type = 'SFNode')"/>
                    <xsl:sort select="(@type = 'MFNode')"/>
                    
                    <xsl:variable name="fieldName">
                        <xsl:call-template name="fieldName">
                            <xsl:with-param name="name" select="@name"/>
                        </xsl:call-template>
                    </xsl:variable>

                    <xsl:if test="(position() = 1)">
                        <xsl:text>
        return </xsl:text>
                    </xsl:if>
                    <!-- avoid duplicate fields problem in X3DUOM, e.g. ParticleSet geometry (TODO fix X3DUOM) -->
                    <xsl:if test="not(preceding-sibling::*[@name = $fieldName])">
                        <xsl:text>bool(self.</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>)</xsl:text>
                        <xsl:choose>
                            <xsl:when test="not(position() = last())">
                                <xsl:text> or </xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <!-- last -->
                            </xsl:otherwise>
                        </xsl:choose>
                    </xsl:if>
                </xsl:for-each>
            </xsl:when>
            <xsl:otherwise>
                <!-- TODO hasComment -->
                <xsl:text>
        return False</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        
        <!-- toXML() function -->
        <xsl:text>
    # output function - - - - - - - - - -
    def toXML(self, indentLevel=0):
        """ Provide Canonical X3D output serialization using XML encoding. """
        indent = '  ' * indentLevel
        result = ''</xsl:text>
        <xsl:choose>
            <xsl:when test="($elementName = 'X3D')">
        <xsl:text>
        # if _DEBUG: result += indent + '# invoked class function </xsl:text>
            <xsl:value-of select="$elementName"/>
            <xsl:text disable-output-escaping="yes"><![CDATA[.toXML(indentLevel=' + str(indentLevel) + '), indent="' + indent + '"' + '\n'
        result += indent + self.XML_HEADER + '\n'
        if self.version == '3.0':
            result += indent + self.XML_DOCTYPE_X3D_3_0 + '\n'
        elif self.version == '3.1':
            result += indent + self.XML_DOCTYPE_X3D_3_1 + '\n'
        elif self.version == '3.2':
            result += indent + self.XML_DOCTYPE_X3D_3_2 + '\n'
        elif self.version == '3.3':
            result += indent + self.XML_DOCTYPE_X3D_3_3 + '\n'
        elif self.version == '4.0':
            result += indent + self.XML_DOCTYPE_X3D_4_0 + '\n'
        elif self.version == '4.1':
            result += indent + self.XML_DOCTYPE_X3D_4_1 + '\n'
        result += indent + "<X3D profile='" + self.profile +"' version='" + self.version +"' "
        if self.version == '3.0':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_3_0
        elif self.version == '3.1':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_3_1
        elif self.version == '3.2':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_3_2
        elif self.version == '3.3':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_3_3
        elif self.version == '4.0':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_4_0
        elif self.version == '4.1':
            result += self.X3D_XML_SCHEMA_ATTRIBUTES_4_1
        result += '>' + '\n' # finish open tag
        if self.head.hasChild():
            result += str(self.head.toXML(indentLevel=indentLevel+1))
        if self.Scene.hasChild():
            result += str(self.Scene.toXML(indentLevel=indentLevel+1))
        result += '</X3D>' + '\n'
#       print('XML serialization complete.',flush=True)
        return result]]></xsl:text>
            </xsl:when>
            <xsl:otherwise> <!-- non-X3D toXML() -->
                <xsl:text>
        result = indent ### confirm
        # if _DEBUG: result += indent + '# invoked class function </xsl:text>
                <xsl:value-of select="$elementName"/>
                <xsl:text disable-output-escaping="yes"><![CDATA[.toXML(self=' + str(self) + ', indentLevel=' + str(indentLevel) + '), indent="' + indent + '"'
        # print(result)
        result += '<]]></xsl:text>
                <!-- opening tag is unclosed since followed by attributes -->
                <xsl:value-of select="$elementName"/>
                <xsl:text>'</xsl:text>
                <!-- opening tag is unclosed since followed by attributes -->
                <!-- output simple-type fields as XML attributes -->
                <xsl:for-each select="$allFields[not(contains(@type,'Node'))]">
                    <xsl:sort select="@name[not(.='DEF') and not(.='USE')]" order="ascending"/>
                    <xsl:sort select="(@name = 'USE')"/>
                    <xsl:sort select="(@name = 'DEF')"/>
                    
                    <xsl:variable name="fieldName">
                        <xsl:call-template name="fieldName">
                            <xsl:with-param name="name" select="@name"/>
                        </xsl:call-template>
                    </xsl:variable>
                    <xsl:variable name="defaultValue">
                        <xsl:call-template name="pythonValue">
                            <xsl:with-param name="x3dValue" select="@default"/>
                            <xsl:with-param name="x3dType" select="@type"/>
                        </xsl:call-template>
                    </xsl:variable>
                    <!-- avoid duplicate fields problem in X3DUOM, e.g. ParticleSet geometry (TODO fix X3DUOM) -->
                    <xsl:if test="not(preceding-sibling::*[@name = $fieldName])">
                        <xsl:text>
        if self.</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:if test="not(@type = 'SFString') or (string-length(@default) > 0)">
                            <xsl:text> != </xsl:text>
                            <xsl:value-of select="$defaultValue"/>
                        </xsl:if>
                        <xsl:text>:
            result += " </xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>='" + </xsl:text>
                        <xsl:choose>
                            <xsl:when test="not(@type='SFString') and not(@type='MFString')">
                                <xsl:text>str(</xsl:text>
                                <xsl:text>self.</xsl:text>
                                <xsl:value-of select="$fieldName"/>
                                <xsl:text>)</xsl:text>
                            </xsl:when>
                            <xsl:otherwise>
                                <xsl:text>self.</xsl:text>
                                <xsl:value-of select="$fieldName"/>
                            </xsl:otherwise>
                        </xsl:choose>
                        
                        <xsl:text> + "'"</xsl:text>
                    </xsl:if>
                </xsl:for-each>
                <xsl:text>
        if not self.hasChild():</xsl:text>
                <!-- singleton tag -->
                <xsl:text disable-output-escaping="yes"><![CDATA[
            result += '/>' + '\n'
        else:
            result += '>' + '\n']]></xsl:text>
                <!-- output child SFNode/MFNode fields as child XML elements -->
                <xsl:choose>
                    <xsl:when test="($elementName = 'head')">
                        <!-- head is a special case, component/unit/meta are forcibly collected under MFNode 'children' -->
                        <xsl:text>
            ## result += indent + '  ' + 'TODO iterate over each child element' + '\n'
            if self.children: # walk each child node, if any
                ## print('* </xsl:text>
                        <xsl:value-of select="$elementName"/>
                        <xsl:text> found self.children, now invoking toXML(' + str(indentLevel+1) + ')',flush=True)
                for each in self.children:
                    result += each.toXML(indentLevel=indentLevel+1)</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:for-each select="$allFields[contains(@type,'Node')]">
                            <xsl:sort select="(@type='MFNode')"/>
                            <xsl:sort select="(@type='SFNode')"/>
                            <xsl:sort select="@name" order="ascending"/>

                            <xsl:variable name="fieldName">
                                <xsl:call-template name="fieldName">
                                    <xsl:with-param name="name" select="@name"/>
                                </xsl:call-template>
                            </xsl:variable>
                            <xsl:variable name="defaultValue">
                                <xsl:call-template name="pythonValue">
                                    <xsl:with-param name="x3dValue" select="@default"/>
                                    <xsl:with-param name="x3dType" select="@type"/>
                                </xsl:call-template>
                            </xsl:variable>
                            <!-- avoid duplicate fields problem in X3DUOM, e.g. ParticleSet geometry (TODO fix X3DUOM) -->
                            <xsl:if test="not(preceding-sibling::*[@name = $fieldName])">
                                <xsl:text>
            ## result += indent + '  ' + 'TODO iterate over each child element' + '\n'
            if self.</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>: # walk each child node, if any
                for each in self.</xsl:text>
                        <xsl:value-of select="$fieldName"/>
                        <xsl:text>:
                    result += each.toXML(indentLevel=indentLevel+1)</xsl:text>
                            </xsl:if>
                        </xsl:for-each>
                    </xsl:otherwise>
                </xsl:choose>
<!-- '\n']]></xsl:text>
                <xsl:text disable-output-escaping="yes"><![CDATA[
        result += indent +
-->
                <xsl:text disable-output-escaping="yes"><![CDATA[
            result += indent + '</]]></xsl:text><!-- closing tag -->
                <xsl:value-of select="$elementName"/>
                <xsl:text disable-output-escaping="yes"><![CDATA[>' + '\n'
#       print('XML serialization complete.',flush=True)
        return result]]></xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        
        <xsl:text>&#10;</xsl:text>
        <xsl:text>&#10;</xsl:text>
    </xsl:template>

    <!-- ===================================================== -->
    
    <xsl:template match="@*"> <!-- rule to process each attribute -->
    
        <xsl:variable name="attributeNameNormalizedPython">
            <!-- some X3D field names collide with Python reserved words, append _ character -->
            <!-- "single_trailing_underscore_: used by convention to avoid conflicts with Python keyword" -->
            <!-- PEP 8 - Style Guide for Python Code, Descriptive: Naming Styles -->
            <!-- https://www.python.org/dev/peps/pep-0008/#descriptive-naming-styles -->
            <xsl:choose>
                <xsl:when test="(local-name() = 'global')">
                    <xsl:value-of select="local-name()"/>
                    <xsl:text>_</xsl:text>
                </xsl:when>
                <xsl:otherwise>
                    <xsl:value-of select="local-name()"/>
                </xsl:otherwise>
            </xsl:choose>
        </xsl:variable>
        
        <!-- common processing for each attribute -->
        <xsl:text> </xsl:text>
        <xsl:value-of select="$attributeNameNormalizedPython"/>
        <xsl:text>='</xsl:text>
        <xsl:value-of select="."/>
        <xsl:text>'</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->
    
    <xsl:template match="comment()"> <!-- rule to process each comment -->
    
        <!-- TODO indent -->
        <xsl:text>&#10;</xsl:text>
        <xsl:text disable-output-escaping="yes"># </xsl:text>
        <xsl:value-of select="."/>
        <xsl:text>&#10;</xsl:text>
        
    </xsl:template>

    <!-- ===================================================== -->

    <xsl:template name="pythonBaseType">
        <xsl:param name="x3dFieldType"></xsl:param>
        
        <xsl:choose>
            <xsl:when test="contains($x3dFieldType,'Bool')">
                <!-- SFBool MFBool -->
                <xsl:text>bool</xsl:text>
            </xsl:when>
            <xsl:when test="contains($x3dFieldType,'Int32') or contains($x3dFieldType,'Image')">
                <!-- SFInt32 MFInt32, SFImage MFImage -->
                <xsl:text>int</xsl:text>
            </xsl:when>
            <xsl:when test="contains($x3dFieldType,'String')">
                <!-- SFString MFString -->
                <xsl:text>str</xsl:text>
            </xsl:when>
            <xsl:when test="($x3dFieldType = 'SFNode')">
                <xsl:text>object</xsl:text>
            </xsl:when>
            <xsl:when test="($x3dFieldType = 'MFNode')">
                <!-- MFNode -->
                <xsl:text>list</xsl:text>
            </xsl:when>
            <xsl:when test="contains($x3dFieldType,'Float') or contains($x3dFieldType,'Double')   or contains($x3dFieldType,'Time') or
                            contains($x3dFieldType,'Color') or contains($x3dFieldType,'Rotation') or contains($x3dFieldType,'Vec')  or contains($x3dFieldType,'Matrix')">
                <!-- SF/MF Float, Double, Color, ColorRGBA, Rotation, Vec, Matrix -->
                <xsl:text>float</xsl:text>
            </xsl:when>
            <!-- SFNode, MFNode not accounted for here -->
            <xsl:otherwise>
                <xsl:text>pythonBaseTypeUnknown</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
        
    </xsl:template>

    <!-- ===================================================== -->

    <xsl:template name="pythonValue">
        <xsl:param name="x3dValue"/>
        <xsl:param name="x3dType">SFString</xsl:param><!-- default if x3dType is unknown -->
        <xsl:variable name="isTuple"         select="contains($x3dType,'Vec') or contains($x3dType,'Rotation') or contains($x3dType,'Color') or contains($x3dType,'Matrix')"/>
        <xsl:variable name="isList"          select="starts-with($x3dType,'MF') or ($x3dType = 'SFImage')"/>
        <xsl:variable name="isString"        select="($x3dType = 'SFString') or ($x3dType ='xs:string') or ($x3dType ='xs:NMTOKEN')"/>
        <xsl:variable name="tupleSize">
            <xsl:call-template name="tupleSize">
                <xsl:with-param name="x3dType" select="@type"/>
            </xsl:call-template>
        </xsl:variable>
        
        <!-- prepend delimiter if appropriate -->
        <xsl:choose>
            <xsl:when test="$isTuple and $isList and (string-length($x3dValue) > 0)">
                <xsl:text>[(</xsl:text>
            </xsl:when>
            <xsl:when test="$isList and (string-length($x3dValue) > 0)">
                <xsl:text>[</xsl:text>
            </xsl:when>
            <xsl:when test="$isTuple and not($isList)">
                <xsl:text>(</xsl:text>
            </xsl:when>
            <xsl:when test='$isString and contains($x3dValue,"&apos;")'>
                <xsl:text>"</xsl:text>
            </xsl:when>
            <xsl:when test="$isString">
                <xsl:text>'</xsl:text>
            </xsl:when>
        </xsl:choose>
        <!-- convert value from .x3d XML syntax to Python -->
        <xsl:choose>
            <xsl:when test="($x3dValue = 'true') and ($x3dType = 'SFBool')">
                <xsl:text>True</xsl:text>
            </xsl:when>
            <xsl:when test="($x3dValue = 'false') and ($x3dType = 'SFBool')">
                <xsl:text>False</xsl:text>
            </xsl:when>
            <xsl:when test="($x3dValue = 'NULL') and ($x3dType = 'SFNode')">
                <xsl:text>None</xsl:text>
            </xsl:when>
            <xsl:when test="$isList and (string-length($x3dValue) = 0)">
                <xsl:text>list()</xsl:text>
            </xsl:when>
            <xsl:when test="(string-length($x3dValue) > 0) and $isString">
                <xsl:value-of select="$x3dValue"/>
            </xsl:when>
            <!-- TODO MFString commas between list entries -->
            <xsl:when test="(string-length($x3dValue) > 0)">
                <!-- TODO recursive function for tupleSize parentheses splits -->
                <xsl:value-of select="replace($x3dValue,' ',', ')"/><!-- pylint wants space after each comma separating values -->
            </xsl:when>
            <xsl:when test="$isString">
                <xsl:text></xsl:text>
            </xsl:when>
             <xsl:when test="not($isList) and not($isTuple)">
                <xsl:text>None</xsl:text>
            </xsl:when>
        </xsl:choose>
        <!-- append delimiter if appropriate -->
        <xsl:choose>
            <xsl:when test="$isTuple and $isList and (string-length($x3dValue) > 0)">
                <xsl:text>)]</xsl:text>
            </xsl:when>
            <xsl:when test="$isList and (string-length($x3dValue) > 0)">
                <xsl:text>]</xsl:text>
            </xsl:when>
            <xsl:when test="$isTuple and not($isList)">
                <xsl:text>)</xsl:text>
            </xsl:when>
            <xsl:when test='$isString and contains($x3dValue,"&apos;")'>
                <xsl:text>"</xsl:text>
            </xsl:when>
            <xsl:when test="$isString">
                <xsl:text>'</xsl:text>
            </xsl:when>
        </xsl:choose>
    </xsl:template>

    <!-- ===================================================== -->

    <xsl:template name="fieldName">
        <xsl:param name="name"></xsl:param>
        
        <!-- python reserved keywords -->
        <!-- https://docs.python.org/3/reference/lexical_analysis.html#keywords -->
            
        <!-- some X3D field names collide with Python reserved words, append _ character -->
        <!-- "single_trailing_underscore_: used by convention to avoid conflicts with Python keyword" -->
        <!-- PEP 8 - Style Guide for Python Code, Descriptive: Naming Styles -->
        <!-- https://www.python.org/dev/peps/pep-0008/#descriptive-naming-styles -->
    
        <xsl:choose>
            <xsl:when test="($name='class') or ($name='global')">
                <xsl:value-of select="$name"/>
                <xsl:text>_</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <xsl:value-of select="translate(@name,'-','')"/>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>
    
    <xsl:template name="valueRestrictionCheck">
        <xsl:param name="fieldName"></xsl:param>
        <xsl:param name="type"></xsl:param>
        <xsl:param name="minInclusive"></xsl:param>
        <xsl:param name="maxInclusive"></xsl:param>
        <xsl:param name="minExclusive"></xsl:param>
        <xsl:param name="maxExclusive"></xsl:param>
        <xsl:param name="indent"></xsl:param>
        
        <xsl:variable name="assertionPrefix">
            <xsl:text>
</xsl:text>
            <xsl:value-of select="$indent"/>
            <xsl:text>    </xsl:text>
        </xsl:variable>
        <xsl:variable name="assertionSuffix">
            <xsl:text>('</xsl:text>
            <xsl:value-of select="$fieldName"/>
            <xsl:text>', </xsl:text>
            <xsl:value-of select="$fieldName"/>
        </xsl:variable>
        
        <xsl:choose>
            <xsl:when test="($fieldName = 'bboxSize')">
                <xsl:value-of select="$assertionPrefix"/>
                <xsl:text>assertBoundingBox</xsl:text>
                <xsl:value-of select="$assertionSuffix"/>
                <xsl:text>)</xsl:text>
            </xsl:when>
            <xsl:when test="contains($type, 'Color') or ((number($minInclusive) = 0) and (number($maxInclusive) = 1))">
                <xsl:value-of select="$assertionPrefix"/>
                <xsl:text>assertZeroToOne</xsl:text>
                <xsl:value-of select="$assertionSuffix"/>
                <xsl:text>)</xsl:text>
            </xsl:when>
            <xsl:when test="(number($minInclusive) = 0) and (string-length($maxInclusive) = 0) and (string-length($maxExclusive) = 0)">
                <xsl:value-of select="$assertionPrefix"/>
                <xsl:text>assertNonNegative</xsl:text>
                <xsl:value-of select="$assertionSuffix"/>
                <xsl:text>)</xsl:text>
            </xsl:when>
            <xsl:when test="(number($minExclusive) = 0) and (string-length($maxInclusive) = 0) and (string-length($maxExclusive) = 0)">
                <xsl:value-of select="$assertionPrefix"/>
                <xsl:text>assertPositive</xsl:text>
                <xsl:value-of select="$assertionSuffix"/>
                <xsl:text>)</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <xsl:choose>
                    <xsl:when test="(string-length($minInclusive) > 0)">
                        <xsl:value-of select="$assertionPrefix"/>
                        <xsl:text>assertGreaterThanEquals</xsl:text>
                        <xsl:value-of select="$assertionSuffix"/>
                        <xsl:text>, </xsl:text>
                        <xsl:value-of select="$minInclusive"/>
                        <xsl:text>)</xsl:text>
                    </xsl:when>
                    <xsl:when test="(string-length($minExclusive) > 0)">
                        <xsl:value-of select="$assertionPrefix"/>
                        <xsl:text>assertGreaterThan</xsl:text>
                        <xsl:value-of select="$assertionSuffix"/>
                        <xsl:text>, </xsl:text>
                        <xsl:value-of select="$minExclusive"/>
                        <xsl:text>)</xsl:text>
                    </xsl:when>
                </xsl:choose>
                <xsl:choose>
                    <xsl:when test="(string-length($maxInclusive) > 0)">
                        <xsl:value-of select="$assertionPrefix"/>
                        <xsl:text>assertLessThanEquals</xsl:text>
                        <xsl:value-of select="$assertionSuffix"/>
                        <xsl:text>, </xsl:text>
                        <xsl:value-of select="$maxInclusive"/>
                        <xsl:text>)</xsl:text>
                    </xsl:when>
                    <xsl:when test="(string-length($maxExclusive) > 0)">
                        <xsl:value-of select="$assertionPrefix"/>
                        <xsl:text>assertLessThan</xsl:text>
                        <xsl:value-of select="$assertionSuffix"/>
                        <xsl:text>, </xsl:text>
                        <xsl:value-of select="$maxExclusive"/>
                        <xsl:text>)</xsl:text>
                    </xsl:when>
                    <xsl:otherwise>
                        <xsl:text></xsl:text><!-- empty string -->
                    </xsl:otherwise>
                </xsl:choose>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <!-- ===================================================== -->
    
    <xsl:template name="tupleSize">
		<xsl:param name="x3dType"/>
		
		<xsl:choose>
			<xsl:when test="contains($x3dType,'FBool')   or contains($x3dType,'FInt32')   or contains($x3dType,'FFloat') or 
                            contains($x3dType,'FDouble') or contains($x3dType,'FString')  or contains($x3dType,'FTime') or 
                            contains($x3dType,'FNode')   or 
                            contains($x3dType,'token')   or starts-with($x3dType,'xs:ID') or contains($x3dType,'NMTOKEN')">
				<xsl:text>1</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FImage')">
				<!-- irregular tuple size, ignore -->
				<xsl:text>1</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FVec2')">
				<xsl:text>2</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FVec3') or ends-with($x3dType,'FColor') or (@baseType='bboxSizeType')">
				<xsl:text>3</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FVec4') or contains($x3dType,'Rotation') or ends-with($x3dType,'FColorRGBA')">
				<xsl:text>4</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FMatrix3')">
				<xsl:text>9</xsl:text>
			</xsl:when>
			<xsl:when test="contains($x3dType,'FMatrix4')">
				<xsl:text>16</xsl:text>
			</xsl:when>
			<xsl:otherwise>
				<!-- report problem -->
				<xsl:message>
					<xsl:text>*** tupleSize not computed for type=</xsl:text>
					<xsl:value-of select="$x3dType"/>
				</xsl:message>
				<xsl:text>0</xsl:text>
			</xsl:otherwise>
		</xsl:choose>
    </xsl:template>

    <!-- ===================================================== -->

</xsl:stylesheet>
