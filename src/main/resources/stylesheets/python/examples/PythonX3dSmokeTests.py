###############################################
#
# Now available: developmental python x3d.py package on PyPi for import.
#   This approach greatly simplifies Python X3D deployment and use.
#   https://pypi.org/project/x3d
#
# Alpha release July 2019:
#   https://twitter.com/Web3DConsortium/status/1154449868846297088
#
# Developer options for loading x3d package:
#
#    from x3d import *  # preferred approach, terser source that avoids x3d.* class prefixes
#
# or
#    import x3d         # traditional way to subclass x3d package, all classes require x3d.* prefix
#                       # but python source is very verbose, for example x3d.Material x3d.Shape etc.
#                       # X3dToPython.xslt stylesheet insertPackagePrefix=true supports this option.

print ('===================')
print ('Importing local development copy of X3D package:')
print ('  from x3d import *')

from x3d import *

print ('===================')

###############################################

print ('PythonX3dSmokeTests:')
print ()

test = SFBool()
test = SFBool(True)
test = SFBool(False)
test = SFBool(value=True)
test = SFBool(value=False)
test = SFBool('True')
test = SFBool('False')
test = SFBool('true')
test = SFBool('false')
#test.value = 'invalid'
test.value = True
print ('SFBool test       =', test)
print ('SFBool test.value =', test.value)
print ('SFBool     isValidSFBool(test)=' + str(isValidSFBool(test)), flush=True)
print ('SFBool assertValidSFBool(test)'); assertValidSFBool(test)

test = MFBool()
test = MFBool(True)
test = MFBool([False])
test = MFBool([True,False,'True','False','true','false']) # ,None is not valid
#test.value = 'invalid'
#test.value = [False,True,]
# test = MFBool( True,False ) # TODO
test.append(True)
test.append(SFBool(False))
test.append([True,False])
#test.append(MFBool(value=[True,False])) # TODO make MF objects iterable
print ('MFBool test       =', test)
print ('MFBool test.value =', test.value)
print ('MFBool     isValidMFBool(test)=' + str(isValidMFBool(test)), flush=True)
print ('MFBool assertValidMFBool(test)'); assertValidMFBool(test)
print ('MFBool bool(test)=' + str(bool(test)) + ', len(test)=' + str(len(test)));

test = SFBool(MFBool([True])) # downcast legal singleton
print ('MFBool test downcast legal singleton: SFBool(MFBool([True]))=' + str(test) + ', type=' + str(type(test)))
test = MFBool(SFBool(False)) # upcast legal SF value
print ('MFBool test   upcast legal SF value:  MFBool(SFBool(False))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFInt32()
test = SFInt32(-1)
#test.value = 'invalid'
test.value = 1
print ('SFInt32 test       =', test)
print ('SFInt32 test.value =', test.value)
print ('SFInt32     isValidSFInt32(test)=' + str(isValidSFInt32(test)), flush=True)
print ('SFInt32 assertValidSFInt32(test)'); assertValidSFInt32(test)

test = MFInt32()
test = MFInt32(1)
test = MFInt32([0,1,2])
# test = MFInt32( 1,2,3,4 ) # TODO
#test.value = 'invalid'
test.value = [0,1,2,3,4,5]
print ('MFInt32 test       =', test)
print ('MFInt32 test.value =', test.value)
print ('MFInt32     isValidMFInt32(test)=' + str(isValidMFInt32(test)), flush=True)
print ('MFInt32 assertValidMFInt32(test)'); assertValidMFInt32(test)
print ('MFInt32 bool(test)=' + str(bool(test)) + ', len(test)=' + str(len(test)));

test = SFInt32(MFInt32([1])) # downcast legal singleton
print ('SFInt32 test downcast legal singleton: SFInt32(MFInt32(1))=' + str(test) + ', type=' + str(type(test)))
test = MFInt32(SFInt32(2)) # upcast legal SF value
print ('MFInt32 test   upcast legal SF value:  MFInt32(SFInt32(2))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFFloat()
test = SFFloat(-1)
test.value = 1
print ('SFFloat test       =', test)
print ('SFFloat test.value =', test.value)
print ('SFFloat     isValidSFFloat(test)=' + str(isValidSFFloat(test)), flush=True)
print ('SFFloat assertValidSFFloat(test)'); assertValidSFFloat(test)

test = MFFloat()
test = MFFloat([0,1,2])
# test = MFFloat( 1,2,3,4 ) # TODO
print ('MFFloat test       =', test)
print ('MFFloat test.value =', test.value)
print ('MFFloat     isValidMFFloat(test)=' + str(isValidMFFloat(test)), flush=True)
print ('MFFloat assertValidMFFloat(test)'); assertValidMFFloat(test)

test = SFFloat(MFFloat([1])) # downcast legal singleton
print ('SFFloat test downcast legal singleton: SFFloat(MFFloat(1))=' + str(test) + ', type=' + str(type(test)))
test = MFFloat(SFFloat(2)) # upcast legal SF value
print ('MFFloat test   upcast legal SF value:  MFFloat(SFFloat(2))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFDouble()
test = SFDouble(-1)
test.value = 1
print ('SFDouble test       =', test)
print ('SFDouble test.value =', test.value)
print ('SFDouble     isValidSFDouble(test)=' + str(isValidSFDouble(test)), flush=True)
print ('SFDouble assertValidSFDouble(test)'); assertValidSFDouble(test)

test = MFDouble()
test = MFDouble([0,1,2])
# test = MFDouble( 1,2,3,4 ) # TODO
print ('MFDouble test       =', test)
print ('MFDouble test.value =', test.value)
print ('MFDouble     isValidMFDouble(test)=' + str(isValidMFDouble(test)), flush=True)
print ('MFDouble assertValidMFDouble(test)'); assertValidMFDouble(test)

test = SFDouble(MFDouble([1])) # downcast legal singleton
print ('SFDouble test downcast legal singleton: SFDouble(MFDouble(1))=' + str(test) + ', type=' + str(type(test)))
test = MFDouble(SFDouble(2)) # upcast legal SF value
print ('MFDouble test   upcast legal SF value:  MFDouble(SFDouble(2))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFString()
test = SFString('test constructor')
test.value = 'test setter'
print ('SFString test       =', test)
print ('SFString test.value =', test.value)
print ('SFString     isValidSFString(test)=' + str(isValidSFString(test)), flush=True)
print ('SFString assertValidSFString(test)'); assertValidSFString(test)

test = MFString()
# test = MFString( 'hello', 'test' ) # TODO
test = MFString(['test', 'constructor']) # comma necessary or python catenates strings
test.value = ['test', 'setter']
print ('MFString test       =', test)
print ('MFString test.value =', test.value)
print ('MFString     isValidMFString(test)=' + str(isValidMFString(test)), flush=True)
print ('MFString assertValidMFString(test)'); assertValidMFString(test)

test = SFString(MFString(["one"])) # downcast legal singleton
print ('SFString test downcast legal singleton: SFString(MFString("one"))=' + str(test) + ', type=' + str(type(test)))
test = MFString(SFString("two")) # upcast legal SF value
print ('MFString test   upcast legal SF value:  MFString(SFString("two"))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFVec2f()
test = SFVec2f((-1, -2)) # commas required
test.value = (1, 2)      # commas required
print ('SFVec2f test       =', test)
print ('SFVec2f test.value =', test.value)
print ('SFVec2f     isValidSFVec2f(test)=' + str(isValidSFVec2f(test)), flush=True)
print ('SFVec2f assertValidSFVec2f(test)'); assertValidSFVec2f(test)

test = MFVec2f()
test = MFVec2f([(-1,-2),(-3,-4)]) # commas required
test.value =   [(0,1),(2,3)]  # commas required
# test = MFVec2f( 1,2,3,4 ) # TODO
print ('MFVec2f test       =', test)
print ('MFVec2f test.value =', test.value)
print ('MFVec2f     isValidMFVec2f(test)=' + str(isValidMFVec2f(test)), flush=True)
print ('MFVec2f assertValidMFVec2f(test)'); assertValidMFVec2f(test)

test = SFVec2f(MFVec2f([(11,12)])) # downcast legal singleton
print ('SFVec2f test downcast legal singleton: SFVec2f(MFVec2f([(11,12)]))=' + str(test) + ', type=' + str(type(test)))

## TODO
#test = MFVec2f(SFVec2f((21,22))) # upcast legal SF value
#print ('MFVec2f test   upcast legal SF value:  MFVec2f(SFVec2f((21,22)))=' + str(test) + ', type=' + str(type(test)))

print ('- - - - - - - - - -')

test = SFVec2d()
test = SFVec2d((-1, -2)) # commas required
test.value = (1, 2)      # commas required
print ('SFVec2d test       =', test)
print ('SFVec2d test.value =', test.value)
print ('SFVec2d     isValidSFVec2d(test)=' + str(isValidSFVec2d(test)), flush=True)
print ('SFVec2d assertValidSFVec2d(test)'); assertValidSFVec2d(test)

test = MFVec2d()
test = MFVec2d([(-1,-2),(-3,-4)]) # commas required
test.value =   [(0,1),(2,3)]  # commas required
# test = MFVec2d( 1,2,3,4 ) # TODO
print ('MFVec2d test       =', test)
print ('MFVec2d test.value =', test.value)
print ('MFVec2d     isValidMFVec2d(test)=' + str(isValidMFVec2d(test)), flush=True)
print ('MFVec2d assertValidMFVec2d(test)'); assertValidMFVec2d(test)

print ('- - - - - - - - - -')

test = SFVec3f()
test = SFVec3f((-1, -2, -3)) # commas required
test.value = (1, 2, 3)       # commas required
print ('SFVec3f test       =', test)
print ('SFVec3f test.value =', test.value)
print ('SFVec3f     isValidSFVec3f(test)=' + str(isValidSFVec3f(test)), flush=True)
print ('SFVec3f assertValidSFVec3f(test)'); assertValidSFVec3f(test)

test = MFVec3f()
test = MFVec3f([(-1,-2,-3),(-4,-5,-6)]) # commas required
test.value =   [(0,1,2),(3,4,5)]  # commas required
# test = MFVec3f( 1,2,3,4,5,6 ) # TODO
print ('MFVec3f test       =', test)
print ('MFVec3f test.value =', test.value)
print ('MFVec3f     isValidMFVec3f(test)=' + str(isValidMFVec3f(test)), flush=True)
print ('MFVec3f assertValidMFVec3f(test)'); assertValidMFVec3f(test)

print ('- - - - - - - - - -')

test = SFVec3d()
test = SFVec3d((-1, -2, -3)) # commas required
test.value = (1, 2, 3)       # commas required
print ('SFVec3d test       =', test)
print ('SFVec3d test.value =', test.value)
print ('SFVec3d     isValidSFVec3d(test)=' + str(isValidSFVec3d(test)), flush=True)
print ('SFVec3d assertValidSFVec3d(test)'); assertValidSFVec3d(test)

test = MFVec3d()
test = MFVec3d([(-1,-2,-3),(-4,-5,-6)]) # commas required
test.value =   [(0,1,2),(3,4,5)]  # commas required
# test = MFVec3d( 1,2,3,4,5,6 ) # TODO
print ('MFVec3d test       =', test)
print ('MFVec3d test.value =', test.value)
print ('MFVec3d     isValidMFVec3d(test)=' + str(isValidMFVec3d(test)), flush=True)
print ('MFVec3d assertValidMFVec3d(test)'); assertValidMFVec3d(test)

print ('- - - - - - - - - -')

test = SFVec4f()
test = SFVec4f((-1,-2,-3,-4)) # commas required
test.value = (1, 2, 3, 4)     # commas required
print ('SFVec4f test       =', test)
print ('SFVec4f test.value =', test.value)
print ('SFVec4f     isValidSFVec4f(test)=' + str(isValidSFVec4f(test)), flush=True)
print ('SFVec4f assertValidSFVec4f(test)'); assertValidSFVec4f(test)

test = MFVec4f()
test = MFVec4f([(-1,-2,-3,-4),(-5,-6,-7,-8)]) # commas required
test.value =   [(0,1,2,3),(4,5,6,7)]  # commas required
# test = MFVec4f( 1,2,3,4,5,6,7,8 ) # TODO
print ('MFVec4f test       =', test)
print ('MFVec4f test.value =', test.value)
print ('MFVec4f     isValidMFVec4f(test)=' + str(isValidMFVec4f(test)), flush=True)
print ('MFVec4f assertValidMFVec4f(test)'); assertValidMFVec4f(test)

print ('- - - - - - - - - -')

test = SFVec4d()
test = SFVec4d((-1,-2,-3,-4)) # commas required
test.value = (1, 2, 3, 4)     # commas required
print ('SFVec4d test       =', test)
print ('SFVec4d test.value =', test.value)
print ('SFVec4d     isValidSFVec4d(test)=' + str(isValidSFVec4d(test)), flush=True)
print ('SFVec4d assertValidSFVec4d(test)'); assertValidSFVec4d(test)

test = MFVec4d()
test = MFVec4d([(-1,-2,-3,-4),(-5,-6,-7,-8)]) # commas required
test.value =   [(0,1,2,3),(4,5,6,7)]  # commas required
# test = MFVec4d( 1,2,3,4,5,6,7,8 ) # TODO
print ('MFVec4d test       =', test)
print ('MFVec4d test.value =', test.value)
print ('MFVec4d     isValidMFVec4d(test)=' + str(isValidMFVec4d(test)), flush=True)
print ('MFVec4d assertValidMFVec4d(test)'); assertValidMFVec4d(test)

print ('- - - - - - - - - -')

test = SFColor()
#test.value = (0, .5, 1, 5) # 4 elements, illegal tupleSize
#test.value = (0, .5, 5)    # illegal value 5
test = SFColor((0, .5, 1)) # commas required
test.value = (0, .5, 1)    # commas required
print ('SFColor test       =', test)
print ('SFColor test.value =', test.value)
print ('SFColor     isValidSFColor(test)=' + str(isValidSFColor(test)), flush=True)
print ('SFColor assertValidSFColor(test)'); assertValidSFColor(test)

print ('- - - - - - - - - -')

test = MFColor()
test = MFColor([(0, .5, 1),(1, .5, 0)]) # commas required
test.value =   [(0, .5, 1),(1, .5, 0)]  # commas required
# test.value = (0, .5, 1, 5)    # illegal value 5
# test = MFColor([0, .5, 1, 1, .5, 0]) # TODO
print ('MFColor test       =', test)
print ('MFColor test.value =', test.value)
print ('MFColor     isValidMFColor(test)=' + str(isValidMFColor(test)), flush=True)
print ('MFColor assertValidMFColor(test)'); assertValidMFColor(test)

print ('- - - - - - - - - -')

test = SFColorRGBA()
test = SFColorRGBA((0, .5, 1, 0.75)) # commas required
test.value = (0, .5, 1, 0.75)    # commas required
print ('SFColorRGBA test       =', test)
print ('SFColorRGBA test.value =', test.value)
print ('SFColorRGBA     isValidSFColorRGBA(test)=' + str(isValidSFColorRGBA(test)), flush=True)
print ('SFColorRGBA assertValidSFColorRGBA(test)'); assertValidSFColorRGBA(test)

test = MFColorRGBA()
test = MFColorRGBA([(0, .5, 1, 0.75),(1, .5, 0, 0.75)]) # commas required
test.value =   [(0, .5, 1, 0.75),(1, .5, 0, 0.75)]  # commas required
# test = MFColorRGBA( 0, .5, 1, 0.75, 1, .5, 0, 0.75 ) # TODO
print ('MFColorRGBA test       =', test)
print ('MFColorRGBA test.value =', test.value)
print ('MFColorRGBA     isValidMFColorRGBA(test)=' + str(isValidMFColorRGBA(test)), flush=True)
print ('MFColorRGBA assertValidMFColorRGBA(test)'); assertValidMFColorRGBA(test)

print ('- - - - - - - - - -')

test = SFRotation()
test = SFRotation((0, .5, 1, 0.75)) # commas required
test.value = (0, .5, 1, 0.75)    # commas required
print ('SFRotation test       =', test)
print ('SFRotation test.value =', test.value)
print ('SFRotation     isValidSFRotation(test)=' + str(isValidSFRotation(test)), flush=True)
print ('SFRotation assertValidSFRotation(test)'); assertValidSFRotation(test)

test = MFRotation()
test = MFRotation([(0, .5, 1, 0.75),(1, .5, 0, 0.75)]) # commas required
test.value =   [(0, .5, 1, 0.75),(1, .5, 0, 0.75)]  # commas required
# test = MFRotation( 0, .5, 1, 0.75, 1, .5, 0, 0.75 ) # TODO
print ('MFRotation test       =', test)
print ('MFRotation test.value =', test.value)
print ('MFRotation     isValidMFRotation(test)=' + str(isValidMFRotation(test)), flush=True)
print ('MFRotation assertValidMFRotation(test)'); assertValidMFRotation(test)

print ('- - - - - - - - - -')

test = SFNode()
test = SFNode(WorldInfo(DEF='A'))
print ('SFNode() test       =', test)
print ('SFNode() test.value =', test.value)
print ('SFNode     isValidSFNode(test)=' + str(isValidSFNode(test)), flush=True)
print ('SFNode assertValidSFNode(test)'); assertValidSFNode(test)
            
test = MFNode([Group(DEF='B'),WorldInfo(DEF='C')])
print ('MFNode()     test            =',     test)
print ('MFNode() str(test.value)     =', str(test.value), 'TODO get result to match by adding MFNode.__repl__; questionable use case')
print ('MFNode     isValidMFNode(test)=' + str(isValidMFNode(test)), flush=True)
print ('MFNode assertValidMFNode(test)'); assertValidMFNode(test)

print ('- - - - - - - - - -')

# caution: some output-flush trickiness might intersperse exception messages in console output
print()
print ('Range function tests:',flush=True)

if not(isPositive(-1)) and not(isPositive(0)) and isPositive(1):
    print('isPositive()    tests passed')
else:
    print('*** isPositive() tests failed')

if not(isNonNegative(-1)) and isNonNegative(0) and isNonNegative(1) and isNonNegative((0, 0, 0)):
    print('isNonNegative() tests passed')
else:
    print('*** isNonNegative() tests failed')

if not(isZeroToOne(-1)) and isZeroToOne(0) and isZeroToOne(1) and not(isZeroToOne(2)):
    print('isZeroToOne()   tests passed')
else:
    print('*** isZeroToOne() tests failed')

if not(isBoundingBox((-1, -2, -3))) and isBoundingBox((-1, -1, -1)) and isBoundingBox((0, 0, 0)): # and isBoundingBox((10, 10, 10)) and not(isBoundingBox((1, 1, -1))):
    print('isBoundingBox() tests passed')
else:
    print('*** isBoundingBox() tests failed')

print ('isPositive   (None)=', isPositive(None));
print ('isNonNegative(None)=', isNonNegative(None));
print ('isZeroToOne  (None)=', isZeroToOne(None));
print ('isBoundingBox(None)=', isBoundingBox(None));

# - - - - - - -

# caution: some output-flush trickiness might intersperse exception messages in console output
print()
print ('Assertion tests:',flush=True)

# these are tested to  pass:
print('test AssertionError assertBoundingBox:       Group(bboxSize=(+3, +2, +1)) expected to pass'); Group(bboxSize=(+3, +2, +1))
print('test AssertionError assertZeroToOne:         SpotLight(ambientIntensity=0.5) expected to pass'); SpotLight(ambientIntensity=0.5)
print('test AssertionError assertNonNegative:       SpotLight(radius=1) expected to pass'); SpotLight(radius=1)
print('test AssertionError assertPositive:          unit(conversionFactor=1) expected to pass'); unit(conversionFactor=1)
print('test AssertionError assertGreaterThanEquals: component(level=1) expected to pass'); component(level=1)
print('test AssertionError assertLessThanEquals:    component(level=5) expected to pass'); component(level=5)
print('test AssertionError assertGreaterThan:       Arc2D(startAngle=-6.28) expected to pass'); Arc2D(startAngle=-6.28)
print('test AssertionError assertLessThan:          Arc2D(startAngle=+6.28) expected to pass'); Arc2D(startAngle=+6.28)

# - - - - - - -

# these have been tested to fail:
print ()
print ('(Assertion tests expected to fail are commented out and require individual confirmation checks)',flush=True)
#print('test AssertionError assertBoundingBox:       Group(bboxSize=(-3, -2, -1)) expected to fail...'); Group(bboxSize=(-3, -2, -1))
#print('test AssertionError assertZeroToOne:         SpotLight(ambientIntensity=-0.1) expected to fail...'); SpotLight(ambientIntensity=-0.1)
#print('test AssertionError assertNonNegative:       SpotLight(radius=-0.1) expected to fail...'); SpotLight(radius=-0.1)
#print('test AssertionError assertPositive:          unit(conversionFactor=0) expected to fail...'); unit(conversionFactor=0)
#print('test AssertionError assertGreaterThanEquals: component(level=0) expected to fail...'); component(level=0)
#print('test AssertionError assertLessThanEquals:    component(level=6) expected to fail...'); component(level=6)
#print('test AssertionError assertGreaterThan:       Arc2D(startAngle=-6.2832) expected to fail...'); Arc2D(startAngle=-6.2832)
#print('test AssertionError assertLessThan:          Arc2D(startAngle=+6.2832) expected to fail...'); Arc2D(startAngle=+6.2832)

print()
print('test X3DField type mismatch:  isValidSFVec3f(SFColor()) expected to return False, actual return: ' + str(    isValidSFVec3f(SFColor())))
# print('test AssertionError X3DField type mismatch:  assertValidSFVec3f(SFColor()) expected to fail...'); assertValidSFVec3f(SFColor());

# - - - - - - -

print ()
print ('Node and field tests:')

materialInstance = Material()
materialInstance = Material(diffuseColor=(0.5,0.5,0.5), transparency=0.2, DEF='Grey')
print('materialInstance.NAME=', materialInstance.NAME)

print('field accessor test, including default value emissiveColor:')
print('materialInstance=' + materialInstance.NAME +
    '(DEF=\'' + str(materialInstance.DEF) + '\'' +
    ',diffuseColor='  + str(materialInstance.diffuseColor) +
    ',emissiveColor=' + str(materialInstance.emissiveColor) + # exposes default value
    ',transparency='  + str(materialInstance.transparency) + ')')
print('must use str() function when concatenating:')
print('    materialInstance  =',       materialInstance)
print('str(materialInstance) = ' + str(materialInstance) + ' (should match)', flush=True)

print('assertValidSFNode (materialInstance) =' + str(assertValidSFNode (materialInstance)))
print('isX3DNode         (materialInstance) =' + str(isX3DNode     (materialInstance)))
print('isX3DStatement    (materialInstance) =' + str(isX3DStatement(materialInstance)))

# print('type(materialInstance) =',type(materialInstance))
            
# import inspect
# from inspect import signature
# print(inspect.getmembers(str))
            
print("WorldInfo(USE='useful',class_='classic')=",WorldInfo(USE='useful',class_='classic'))
print("    Group() =",    Group() )
print("str(Group())=",str(Group()) + ' (should match)', flush=True)

routeInstance = ROUTE(fromField='Here',toField='There')
print('    routeInstance =',     routeInstance)
print('str(routeInstance)=', str(routeInstance) + ' (should match)', flush=True)

print('    ROUTE()  =',      ROUTE())
print('str(ROUTE()) =',  str(ROUTE()) + ' (should match)', flush=True) # must use str() function when concatenating in print statement

print('isX3DNode     (routeInstance)=' + str(isX3DNode     (routeInstance)))
print('isX3DNode     (ROUTE())      =' + str(isX3DNode     (ROUTE())) + ' (should match)', flush=True)
print('isX3DStatement(routeInstance)=' + str(isX3DStatement(routeInstance)))
print('isX3DStatement(ROUTE())      =' + str(isX3DStatement(ROUTE())) + ' (should match)', flush=True)
            
nestedNodesTest = Shape(
    appearance=Appearance(
        material=Material(diffuseColor=(0.3,0.4,0.5,), transparency=0.2, DEF='Grey')),
    geometry=Sphere(radius=2),
    metadata=MetadataString(value=['checking']))

## test cases:
##      material=Material(diffuseColor=(0.3,0.4,0.5,.6), transparency=0.2, DEF='Grey')), # illegal diffuseColor
##  metadata=MetadataString(value='checking')) # assertValidMFString should fail when not a list

print ('    nestedNodesTest =',     nestedNodesTest)
print ('str(nestedNodesTest)=', str(nestedNodesTest) + ' (should match)', flush=True)

groupTest = Group(bboxSize=(1,2,3))
#groupTest = Group(bboxSize=[1,2,3]) # fails because it is a list, rather than tuple

groupTest = Group(
   bboxSize=(1,2,3),                        # simple fields and
   children=[WorldInfo(),Group(),Shape()])  # MFNode child list
print ('    groupTest  =',     groupTest)
print ('str(groupTest) =', str(groupTest) + ' (should match)', flush=True)

# Group(WorldInfo(),bboxSize=[1,2,3]) # possible? maybe not needed

headTest = head()
headTest = head(children=[component(),unit(),meta(name='1',content='2'),meta()])
#headtest.children=[component(),unit(),meta(name='1',content='2'),meta()] # TODO fails
print ('     headTest  =',     headTest )
print (' str(headTest) =', str(headTest) + ' (should match)', flush=True)

sceneTest = Scene() # children=[WorldInfo(),Group()]
sceneTest = Scene(children=[WorldInfo(),Group()])
#sceneTest.children=[WorldInfo(),Group(),Shape()]
print ('    sceneTest  =',     sceneTest)
print ('str(sceneTest) =', str(sceneTest) + ' (should match)', flush=True)

modelTest = X3D(
                head=head(
                    children=[
                          component(name='Grouping',level=2),
                          meta(name='description', content='name-value pair'),
                          meta(name='info',   content='diagnostic test 1'),
                          meta(name='hint',   content='diagnostic test 2'),
                          meta(name='warning',content='diagnostic test 3'),
                          meta(name='error',  content='diagnostic test 4')]
                ),
                Scene=Scene(children=[WorldInfo(title='modelTest sample scene'),Group()]))
              # Scene=None)

print ()
print ('metaDiagnostics utility function:')
print ( metaDiagnostics(modelTest))

print ()
print ('    modelTest     =',     modelTest)
print ('str(modelTest)    =', str(modelTest) + ' (should match)', flush=True)
print ('    modelTest.toXML() =')
print (     modelTest.toXML())

print ('Current work:')
print ('DONE value range checks for simple types')
print ('TEST save toXML() .x3d recursive serializer')
print ('TODO save toClassicVRML() .x3dv')
print ('TODO check node types when building scene graph')
print ('TODO add and invoke validation methods that walk model tree')
            
# TODO requires *arg and node-type-checking support
# Appearance(         Material(diffuseColor=(0.5,0.5,0.5), transparency=0.2, DEF='Grey'))

print ()
print ('PythonX3dSmokeTests execution complete.')