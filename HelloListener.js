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


// Enter a parse tree produced by HelloParser#expressionStatement.
HelloListener.prototype.enterExpressionStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#expressionStatement.
HelloListener.prototype.exitExpressionStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ifStatement.
HelloListener.prototype.enterIfStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ifStatement.
HelloListener.prototype.exitIfStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#DoStatement.
HelloListener.prototype.enterDoStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#DoStatement.
HelloListener.prototype.exitDoStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#WhileStatement.
HelloListener.prototype.enterWhileStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#WhileStatement.
HelloListener.prototype.exitWhileStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ForStatement.
HelloListener.prototype.enterForStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ForStatement.
HelloListener.prototype.exitForStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ForVarStatement.
HelloListener.prototype.enterForVarStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ForVarStatement.
HelloListener.prototype.exitForVarStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ForInStatement.
HelloListener.prototype.enterForInStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ForInStatement.
HelloListener.prototype.exitForInStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ForVarInStatement.
HelloListener.prototype.enterForVarInStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ForVarInStatement.
HelloListener.prototype.exitForVarInStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#continueStatement.
HelloListener.prototype.enterContinueStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#continueStatement.
HelloListener.prototype.exitContinueStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#breakStatement.
HelloListener.prototype.enterBreakStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#breakStatement.
HelloListener.prototype.exitBreakStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#returnStatement.
HelloListener.prototype.enterReturnStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#returnStatement.
HelloListener.prototype.exitReturnStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#withStatement.
HelloListener.prototype.enterWithStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#withStatement.
HelloListener.prototype.exitWithStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#switchStatement.
HelloListener.prototype.enterSwitchStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#switchStatement.
HelloListener.prototype.exitSwitchStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#caseBlock.
HelloListener.prototype.enterCaseBlock = function(ctx) {
};

// Exit a parse tree produced by HelloParser#caseBlock.
HelloListener.prototype.exitCaseBlock = function(ctx) {
};


// Enter a parse tree produced by HelloParser#caseClauses.
HelloListener.prototype.enterCaseClauses = function(ctx) {
};

// Exit a parse tree produced by HelloParser#caseClauses.
HelloListener.prototype.exitCaseClauses = function(ctx) {
};


// Enter a parse tree produced by HelloParser#caseClause.
HelloListener.prototype.enterCaseClause = function(ctx) {
};

// Exit a parse tree produced by HelloParser#caseClause.
HelloListener.prototype.exitCaseClause = function(ctx) {
};


// Enter a parse tree produced by HelloParser#defaultClause.
HelloListener.prototype.enterDefaultClause = function(ctx) {
};

// Exit a parse tree produced by HelloParser#defaultClause.
HelloListener.prototype.exitDefaultClause = function(ctx) {
};


// Enter a parse tree produced by HelloParser#labelledStatement.
HelloListener.prototype.enterLabelledStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#labelledStatement.
HelloListener.prototype.exitLabelledStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#throwStatement.
HelloListener.prototype.enterThrowStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#throwStatement.
HelloListener.prototype.exitThrowStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#tryStatement.
HelloListener.prototype.enterTryStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#tryStatement.
HelloListener.prototype.exitTryStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#catchProduction.
HelloListener.prototype.enterCatchProduction = function(ctx) {
};

// Exit a parse tree produced by HelloParser#catchProduction.
HelloListener.prototype.exitCatchProduction = function(ctx) {
};


// Enter a parse tree produced by HelloParser#finallyProduction.
HelloListener.prototype.enterFinallyProduction = function(ctx) {
};

// Exit a parse tree produced by HelloParser#finallyProduction.
HelloListener.prototype.exitFinallyProduction = function(ctx) {
};


// Enter a parse tree produced by HelloParser#debuggerStatement.
HelloListener.prototype.enterDebuggerStatement = function(ctx) {
};

// Exit a parse tree produced by HelloParser#debuggerStatement.
HelloListener.prototype.exitDebuggerStatement = function(ctx) {
};


// Enter a parse tree produced by HelloParser#functionDeclaration.
HelloListener.prototype.enterFunctionDeclaration = function(ctx) {
};

// Exit a parse tree produced by HelloParser#functionDeclaration.
HelloListener.prototype.exitFunctionDeclaration = function(ctx) {
};


// Enter a parse tree produced by HelloParser#formalParameterList.
HelloListener.prototype.enterFormalParameterList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#formalParameterList.
HelloListener.prototype.exitFormalParameterList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#functionBody.
HelloListener.prototype.enterFunctionBody = function(ctx) {
};

// Exit a parse tree produced by HelloParser#functionBody.
HelloListener.prototype.exitFunctionBody = function(ctx) {
};


// Enter a parse tree produced by HelloParser#arrayLiteral.
HelloListener.prototype.enterArrayLiteral = function(ctx) {
};

// Exit a parse tree produced by HelloParser#arrayLiteral.
HelloListener.prototype.exitArrayLiteral = function(ctx) {
};


// Enter a parse tree produced by HelloParser#elementList.
HelloListener.prototype.enterElementList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#elementList.
HelloListener.prototype.exitElementList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#elision.
HelloListener.prototype.enterElision = function(ctx) {
};

// Exit a parse tree produced by HelloParser#elision.
HelloListener.prototype.exitElision = function(ctx) {
};


// Enter a parse tree produced by HelloParser#objectLiteral.
HelloListener.prototype.enterObjectLiteral = function(ctx) {
};

// Exit a parse tree produced by HelloParser#objectLiteral.
HelloListener.prototype.exitObjectLiteral = function(ctx) {
};


// Enter a parse tree produced by HelloParser#propertyNameAndValueList.
HelloListener.prototype.enterPropertyNameAndValueList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#propertyNameAndValueList.
HelloListener.prototype.exitPropertyNameAndValueList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PropertyExpressionAssignment.
HelloListener.prototype.enterPropertyExpressionAssignment = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PropertyExpressionAssignment.
HelloListener.prototype.exitPropertyExpressionAssignment = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PropertyGetter.
HelloListener.prototype.enterPropertyGetter = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PropertyGetter.
HelloListener.prototype.exitPropertyGetter = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PropertySetter.
HelloListener.prototype.enterPropertySetter = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PropertySetter.
HelloListener.prototype.exitPropertySetter = function(ctx) {
};


// Enter a parse tree produced by HelloParser#propertyName.
HelloListener.prototype.enterPropertyName = function(ctx) {
};

// Exit a parse tree produced by HelloParser#propertyName.
HelloListener.prototype.exitPropertyName = function(ctx) {
};


// Enter a parse tree produced by HelloParser#propertySetParameterList.
HelloListener.prototype.enterPropertySetParameterList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#propertySetParameterList.
HelloListener.prototype.exitPropertySetParameterList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#arguments.
HelloListener.prototype.enterArguments = function(ctx) {
};

// Exit a parse tree produced by HelloParser#arguments.
HelloListener.prototype.exitArguments = function(ctx) {
};


// Enter a parse tree produced by HelloParser#argumentList.
HelloListener.prototype.enterArgumentList = function(ctx) {
};

// Exit a parse tree produced by HelloParser#argumentList.
HelloListener.prototype.exitArgumentList = function(ctx) {
};


// Enter a parse tree produced by HelloParser#expressionSequence.
HelloListener.prototype.enterExpressionSequence = function(ctx) {
};

// Exit a parse tree produced by HelloParser#expressionSequence.
HelloListener.prototype.exitExpressionSequence = function(ctx) {
};


// Enter a parse tree produced by HelloParser#TernaryExpression.
HelloListener.prototype.enterTernaryExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#TernaryExpression.
HelloListener.prototype.exitTernaryExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#LogicalAndExpression.
HelloListener.prototype.enterLogicalAndExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#LogicalAndExpression.
HelloListener.prototype.exitLogicalAndExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PreIncrementExpression.
HelloListener.prototype.enterPreIncrementExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PreIncrementExpression.
HelloListener.prototype.exitPreIncrementExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ObjectLiteralExpression.
HelloListener.prototype.enterObjectLiteralExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ObjectLiteralExpression.
HelloListener.prototype.exitObjectLiteralExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#InExpression.
HelloListener.prototype.enterInExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#InExpression.
HelloListener.prototype.exitInExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#LogicalOrExpression.
HelloListener.prototype.enterLogicalOrExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#LogicalOrExpression.
HelloListener.prototype.exitLogicalOrExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#NotExpression.
HelloListener.prototype.enterNotExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#NotExpression.
HelloListener.prototype.exitNotExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PreDecreaseExpression.
HelloListener.prototype.enterPreDecreaseExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PreDecreaseExpression.
HelloListener.prototype.exitPreDecreaseExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ArgumentsExpression.
HelloListener.prototype.enterArgumentsExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ArgumentsExpression.
HelloListener.prototype.exitArgumentsExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ThisExpression.
HelloListener.prototype.enterThisExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ThisExpression.
HelloListener.prototype.exitThisExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#FunctionExpression.
HelloListener.prototype.enterFunctionExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#FunctionExpression.
HelloListener.prototype.exitFunctionExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#UnaryMinusExpression.
HelloListener.prototype.enterUnaryMinusExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#UnaryMinusExpression.
HelloListener.prototype.exitUnaryMinusExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PostDecreaseExpression.
HelloListener.prototype.enterPostDecreaseExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PostDecreaseExpression.
HelloListener.prototype.exitPostDecreaseExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#AssignmentExpression.
HelloListener.prototype.enterAssignmentExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#AssignmentExpression.
HelloListener.prototype.exitAssignmentExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#TypeofExpression.
HelloListener.prototype.enterTypeofExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#TypeofExpression.
HelloListener.prototype.exitTypeofExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#InstanceofExpression.
HelloListener.prototype.enterInstanceofExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#InstanceofExpression.
HelloListener.prototype.exitInstanceofExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#UnaryPlusExpression.
HelloListener.prototype.enterUnaryPlusExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#UnaryPlusExpression.
HelloListener.prototype.exitUnaryPlusExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#DeleteExpression.
HelloListener.prototype.enterDeleteExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#DeleteExpression.
HelloListener.prototype.exitDeleteExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#EqualityExpression.
HelloListener.prototype.enterEqualityExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#EqualityExpression.
HelloListener.prototype.exitEqualityExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#BitXOrExpression.
HelloListener.prototype.enterBitXOrExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#BitXOrExpression.
HelloListener.prototype.exitBitXOrExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#MultiplicativeExpression.
HelloListener.prototype.enterMultiplicativeExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#MultiplicativeExpression.
HelloListener.prototype.exitMultiplicativeExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#BitShiftExpression.
HelloListener.prototype.enterBitShiftExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#BitShiftExpression.
HelloListener.prototype.exitBitShiftExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ParenthesizedExpression.
HelloListener.prototype.enterParenthesizedExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ParenthesizedExpression.
HelloListener.prototype.exitParenthesizedExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#AdditiveExpression.
HelloListener.prototype.enterAdditiveExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#AdditiveExpression.
HelloListener.prototype.exitAdditiveExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#RelationalExpression.
HelloListener.prototype.enterRelationalExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#RelationalExpression.
HelloListener.prototype.exitRelationalExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#PostIncrementExpression.
HelloListener.prototype.enterPostIncrementExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#PostIncrementExpression.
HelloListener.prototype.exitPostIncrementExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#BitNotExpression.
HelloListener.prototype.enterBitNotExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#BitNotExpression.
HelloListener.prototype.exitBitNotExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#NewExpression.
HelloListener.prototype.enterNewExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#NewExpression.
HelloListener.prototype.exitNewExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#LiteralExpression.
HelloListener.prototype.enterLiteralExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#LiteralExpression.
HelloListener.prototype.exitLiteralExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#ArrayLiteralExpression.
HelloListener.prototype.enterArrayLiteralExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#ArrayLiteralExpression.
HelloListener.prototype.exitArrayLiteralExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#MemberDotExpression.
HelloListener.prototype.enterMemberDotExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#MemberDotExpression.
HelloListener.prototype.exitMemberDotExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#MemberIndexExpression.
HelloListener.prototype.enterMemberIndexExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#MemberIndexExpression.
HelloListener.prototype.exitMemberIndexExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#IdentifierExpression.
HelloListener.prototype.enterIdentifierExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#IdentifierExpression.
HelloListener.prototype.exitIdentifierExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#BitAndExpression.
HelloListener.prototype.enterBitAndExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#BitAndExpression.
HelloListener.prototype.exitBitAndExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#BitOrExpression.
HelloListener.prototype.enterBitOrExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#BitOrExpression.
HelloListener.prototype.exitBitOrExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#AssignmentOperatorExpression.
HelloListener.prototype.enterAssignmentOperatorExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#AssignmentOperatorExpression.
HelloListener.prototype.exitAssignmentOperatorExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#VoidExpression.
HelloListener.prototype.enterVoidExpression = function(ctx) {
};

// Exit a parse tree produced by HelloParser#VoidExpression.
HelloListener.prototype.exitVoidExpression = function(ctx) {
};


// Enter a parse tree produced by HelloParser#assignmentOperator.
HelloListener.prototype.enterAssignmentOperator = function(ctx) {
};

// Exit a parse tree produced by HelloParser#assignmentOperator.
HelloListener.prototype.exitAssignmentOperator = function(ctx) {
};


// Enter a parse tree produced by HelloParser#literal.
HelloListener.prototype.enterLiteral = function(ctx) {
};

// Exit a parse tree produced by HelloParser#literal.
HelloListener.prototype.exitLiteral = function(ctx) {
};


// Enter a parse tree produced by HelloParser#numericLiteral.
HelloListener.prototype.enterNumericLiteral = function(ctx) {
};

// Exit a parse tree produced by HelloParser#numericLiteral.
HelloListener.prototype.exitNumericLiteral = function(ctx) {
};


// Enter a parse tree produced by HelloParser#identifierName.
HelloListener.prototype.enterIdentifierName = function(ctx) {
};

// Exit a parse tree produced by HelloParser#identifierName.
HelloListener.prototype.exitIdentifierName = function(ctx) {
};


// Enter a parse tree produced by HelloParser#reservedWord.
HelloListener.prototype.enterReservedWord = function(ctx) {
};

// Exit a parse tree produced by HelloParser#reservedWord.
HelloListener.prototype.exitReservedWord = function(ctx) {
};


// Enter a parse tree produced by HelloParser#keyword.
HelloListener.prototype.enterKeyword = function(ctx) {
};

// Exit a parse tree produced by HelloParser#keyword.
HelloListener.prototype.exitKeyword = function(ctx) {
};


// Enter a parse tree produced by HelloParser#futureReservedWord.
HelloListener.prototype.enterFutureReservedWord = function(ctx) {
};

// Exit a parse tree produced by HelloParser#futureReservedWord.
HelloListener.prototype.exitFutureReservedWord = function(ctx) {
};


// Enter a parse tree produced by HelloParser#getter.
HelloListener.prototype.enterGetter = function(ctx) {
};

// Exit a parse tree produced by HelloParser#getter.
HelloListener.prototype.exitGetter = function(ctx) {
};


// Enter a parse tree produced by HelloParser#setter.
HelloListener.prototype.enterSetter = function(ctx) {
};

// Exit a parse tree produced by HelloParser#setter.
HelloListener.prototype.exitSetter = function(ctx) {
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