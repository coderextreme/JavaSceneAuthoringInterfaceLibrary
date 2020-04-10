X3D = function() {
	this.toFileX3D = function() {};
	this.toFileJSON = function() {};
}
head = function() {}
meta = function() {}
Scene = function() {}
Script = function() {}
var X3D0 =  new X3D({profile:"Immersive",version:"3.3"},
      new head({},
        new meta({content:"test.x3d",name:"title"}),
        new meta({content:"Example test creates an X3D model",name:"description"}),
        new meta({content:"6 September 2016",name:"created"}),
        new meta({content:"12 January 2020",name:"modified"}),
        new meta({content:"John Carlson",name:"creator"}),
        new meta({content:"../license.html",name:"license"})),
      new Scene({},
        new Script({url:["examples/HelloWorldProgramOutput.js","HelloWorldProgramOutput.js"]})))      ;
X3D0.toFileX3D("examples/test.new.x3d");
X3D0.toFileJSON("examples/test.new.json");
