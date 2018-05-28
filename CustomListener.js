var HelloListener = require('./HelloListener').HelloListener;
var antlr4 = require('antlr4/index');

function FooTranspiler() {
	HelloListener.call(this);
	this.output = "";
}

FooTranspiler.prototype = Object.create(HelloListener.prototype);
FooTranspiler.prototype.constructor = HelloListener;

FooTranspiler.prototype.enterJsstatement = function(ctx) {
    var hello = ctx.statement().getText();
    this.output += hello;
};

FooTranspiler.prototype.enterOwlGetStatement = function(ctx) {
    // var hello = "await";
    // this.output += hello;
};


// FooTranspiler.prototype.enterInvocationStmt = function(ctx) {
// 	var functionName = ctx.name.text;
// 	this.output += functionName + "(";
// 	var expressions = ctx.expr();
	
// 	for (var i = 0; i < expressions.length; i++) {
// 		if (i > 0) {
// 			this.output += ", ";
// 		}
		
// 		this.output += this.resolveExpr(expressions[i]);
// 	}
	
// 	this.output += ");";
// };

// FooTranspiler.prototype.resolveExpr = function(ctx) {
// 	if (ctx.INT() != null) {
// 		return ctx.INT().getText();
// 	} else if (ctx.ID() != null) {
// 		return ctx.ID().getText();
// 	} else if (ctx.STRING() != null) {
// 		// Replace any occurrence of ${expr}
// 		// with " + expr + "
// 		// i.e.
// 		// "Hello, ${user}!" -> "Hello, " + user + "!"
// 		return ctx.STRING().getText().replace(/\$\{([^\}]+)\}/g, '" + $1 + "');
// 	} else return "undefined";
// }

module.exports = FooTranspiler;