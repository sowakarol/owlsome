var ECMAScriptListener = require('./ECMAScriptListener').ECMAScriptListener;
var antlr4 = require('antlr4/index');

function FooTranspiler() {
	ECMAScriptListener.call(this);
	this.output = "";
	this.ending = "";
	this.functionCounter = [];
	this.maxFunc = 0;
	this.varCounter = 0;

}


FooTranspiler.prototype = Object.create(ECMAScriptListener.prototype);
FooTranspiler.prototype.constructor = ECMAScriptListener;

FooTranspiler.prototype.enterProgram = function (ctx) {
	this.output = `
var http = require('http');
var express = require('express');
const owlGet = require('./http-wrappers').owlGet;
var app = express();
(async () => {
`;
}

FooTranspiler.prototype.exitProgram = function (ctx) {
	this.output += `})()`;
}

FooTranspiler.prototype.enterOwlGetStatement = function (ctx) {
	let arg = ctx.StringLiteral() != null ? ctx.StringLiteral().getText() : ctx.Identifier().getText();

	this.output += `	
	await owlGet(${arg})
	`;
}

FooTranspiler.prototype.exitOwlGetStatement = function (ctx) {
	this.output += ``;
}

FooTranspiler.prototype.enterOwlGetEndpointStatement = function (ctx) {
	let endpoint = ctx.owlGetEndpointStatementArg1().getText();
	let arg = ctx.owlGetEndpointStatementArg2().getText();

	this.output += `
	app.get(${endpoint}, function (req, res) {
		res.send(${arg});
	});
	`
}

FooTranspiler.prototype.enterOwlPostStatement = function (ctx) {
	let arg = ctx.StringLiteral() != null ? ctx.StringLiteral().getText() : ctx.Identifier().getText();

	let options = {
		...JSON.parse(ctx.objectLiteral().getText()),
		url: arg,
		method: "post"
	};

	this.output += `
	async function owl${this.maxFunc}() { 
		return await http.request( ${JSON.stringify(options)} , (res) => { 
	`;
	this.functionCounter.push(this.maxFunc++);

}


FooTranspiler.prototype.exitOwlPostStatement = function (ctx) {
	this.output += `
}).on("error", (err) => {
	console.log("Error: " + err.message);
});
}
owl${this.functionCounter.pop()}()
`;
}

FooTranspiler.prototype.enterOwlJsonCheckStatement = function (ctx) {
	let obj = ctx.objectLiteral() != null ? ctx.objectLiteral().getText() : ctx.Identifier().getText();
	let options = ctx.StringLiteral().getText();
	this.output += `
	let owl_var${this.varCounter} = ${options}.split('.');
	let owl_var${this.varCounter + 2} = owl_var${this.varCounter}.reduce((accumulator, currentValue) => {
	  if (accumulator[currentValue] === undefined) accumulator[currentValue] = {};
	  return accumulator[currentValue];
	}, ${obj});
	console.log(${obj});
	`;
	this.varCounter += 3;
}

FooTranspiler.prototype.enterSourceElement = function (ctx) {
	if (ctx.functionDeclaration() != null) {
		this.output += ctx.functionDeclaration().getText();
	}
};

FooTranspiler.prototype.enterJsstatement = function (ctx) {
	this.output += ctx.getText();
}


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