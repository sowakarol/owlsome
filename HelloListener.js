// Generated from .\Hello.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');

// This class defines a complete listener for a parse tree produced by HelloParser.
function HelloListener() {
	antlr4.tree.ParseTreeListener.call(this);
	return this;
}

HelloListener.prototype = Object.create(antlr4.tree.ParseTreeListener.prototype);
HelloListener.prototype.constructor = HelloListener;

// Enter a parse tree produced by HelloParser#program.
HelloListener.prototype.enterProgram = function(ctx) {
};

// Exit a parse tree produced by HelloParser#program.
HelloListener.prototype.exitProgram = function(ctx) {
};


// Enter a parse tree produced by HelloParser#sourceElements.
HelloListener.prototype.enterSourceElements = function(ctx) {
};

// Exit a parse tree produced by HelloParser#sourceElements.
HelloListener.prototype.exitSourceElements = function(ctx) {
};


// Enter a parse tree produced by HelloParser#sourceElement.
HelloListener.prototype.enterSourceElement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#sourceElement.
HelloListener.prototype.exitSourceElement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#jsstatement.
HelloListener.prototype.enterJsstatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#jsstatement.
HelloListener.prototype.exitJsstatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#statement.
HelloListener.prototype.enterStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#statement.
HelloListener.prototype.exitStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#block.
HelloListener.prototype.enterBlock = function(ctx) {
};

// Exit a parse tree produced by HelloParser#block.
HelloListener.prototype.exitBlock = function(ctx) {
};


// Enter a parse tree produced by HelloParser#statementList.
HelloListener.prototype.enterStatementList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#statementList.
HelloListener.prototype.exitStatementList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#variableStatement.
HelloListener.prototype.enterVariableStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#variableStatement.
HelloListener.prototype.exitVariableStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#variableDeclarationList.
HelloListener.prototype.enterVariableDeclarationList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#variableDeclarationList.
HelloListener.prototype.exitVariableDeclarationList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#variableDeclaration.
HelloListener.prototype.enterVariableDeclaration = function(ctx) {
};

// Exit a parse tree produced by HelloParser#variableDeclaration.
HelloListener.prototype.exitVariableDeclaration = function(ctx) {
};


// Enter a parse tree produced by HelloParser#initialiser.
HelloListener.prototype.enterInitialiser = function(ctx) {
};

// Exit a parse tree produced by HelloParser#initialiser.
HelloListener.prototype.exitInitialiser = function(ctx) {
};


// Enter a parse tree produced by HelloParser#emptyStatement.
HelloListener.prototype.enterEmptyStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#emptyStatement.
HelloListener.prototype.exitEmptyStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#eos.
HelloListener.prototype.enterEos = function(ctx) {
};

// Exit a parse tree produced by HelloParser#eos.
HelloListener.prototype.exitEos = function(ctx) {
};


// Enter a parse tree produced by HelloParser#eof.
HelloListener.prototype.enterEof = function(ctx) {
};

// Exit a parse tree produced by HelloParser#eof.
HelloListener.prototype.exitEof = function(ctx) {
};



exports.HelloListener = HelloListener;