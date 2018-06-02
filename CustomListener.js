var ECMAScriptListener = require('./ECMAScriptListener').ECMAScriptListener;
var antlr4 = require('antlr4/index');

function FooTranspiler() {
	ECMAScriptListener.call(this);
	this.output = "";
	this.ending = "";
	this.counter = 0;
}


//TODO
/*
	add nested owlget/post methods    owlget :) url owlget2 :) url2 &   &
*/

FooTranspiler.prototype = Object.create(ECMAScriptListener.prototype);
FooTranspiler.prototype.constructor = ECMAScriptListener;

FooTranspiler.prototype.enterProgram = function (ctx) {
	this.output = `
	var http = require('http');
	`;
}


FooTranspiler.prototype.enterSourceElement = function (ctx) {
	if (ctx.statement() != null) {
		if (ctx.statement().owlStatement() != null) {
			if (ctx.statement().owlStatement().owlGetStatement() != null) {
				let owlGet = ctx.statement().owlStatement().owlGetStatement();
				let arg = owlGet.StringLiteral() != null ? owlGet.StringLiteral().getText() : owlGet.Identifier().getText();

				this.output += `
				async owl${this.counter}() { 
					return await http.get( ${arg} , (res) => { 
						
				`;
				// if(owlGet.jsstatement()){
				// 	console.log(owlGet.jsstatement());
				// }

				this.counter++;
			}
			if (ctx.statement().owlStatement().owlPostStatement() != null) {
				let owlPost = ctx.statement().owlStatement().owlPostStatement();
				let arg = owlPost.StringLiteral() != null ? owlPost.StringLiteral().getText() : owlPost.Identifier().getText();

				let options = {
					...JSON.parse(owlPost.objectLiteral().getText()),
					url: arg,
					method: "post"
				};

				this.output += `
				async owl${this.counter}() { 
					return await http.request( ${JSON.stringify(options)} , (res) => { 
						
				`;

				this.counter++;
			}
			if(ctx.statement().owlStatement().owlJsonCheckStatement()){
				let owlJsonCheck = ctx.statement().owlStatement().owlJsonCheckStatement();
				let obj = owlJsonCheck.objectLiteral() != null ? owlJsonCheck.objectLiteral().getText() : owlJsonCheck.Identifier().getText();
				let options = owlJsonCheck.StringLiteral().getText();
				this.output += `
				let owl${this.counter}, owls${this.counter + 1} = ${options}.split('.');

				for (let i = 0, iLen = owls${this.counter + 1}.length - 1; i < iLen; i++) {
					owl${this.counter} = owls${this.counter + 1}[i];
			
					let candidate = ${obj}[owl${this.counter}];
					if (candidate !== undefined) {
						${obj} = candidate;
					} else {
						${obj} = {};
					}
				}
				`;
				this.counter += 2;

				// console.log(obj);
			}
		} else {
			// this.output += ctx.statement().getText();
		}
	}

	if (ctx.functionDeclaration() != null) {
		this.output += ctx.functionDeclaration().getText();
	}

};

FooTranspiler.prototype.exitSourceElement = function (ctx) {
	if (ctx.statement() != null) {
		if (ctx.statement().owlStatement() != null) {
			if (ctx.statement().owlStatement().owlGetStatement() != null) {
				this.output += `
					}).on("error", (err) => {
						console.log("Error: " + err.message);
					});
				}`;
			}

			if (ctx.statement().owlStatement().owlPostStatement() != null) {
				this.output += `
					}).on("error", (err) => {
						console.log("Error: " + err.message);
					});
				}`;
			}
		}

	}
};

FooTranspiler.prototype.enterJsstatement = function (ctx){
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