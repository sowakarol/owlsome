var ECMAScriptListener = require('./ECMAScriptListener').ECMAScriptListener;
var antlr4 = require('antlr4/index');

function FooTranspiler() {
	ECMAScriptListener.call(this);
	this.output = "";
}

FooTranspiler.prototype = Object.create(ECMAScriptListener.prototype);
FooTranspiler.prototype.constructor = ECMAScriptListener;

FooTranspiler.prototype.enterSourceElement = function(ctx) {
	this.output += ctx.statement().getText();
};

FooTranspiler.prototype.enterWhiteSpaces = function(ctx) {

}

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
// 		// "ECMAScript, ${user}!" -> "ECMAScript, " + user + "!"
// 		return ctx.STRING().getText().replace(/\$\{([^\}]+)\}/g, '" + $1 + "');
// 	} else return "undefined";
// }

module.exports = FooTranspiler;