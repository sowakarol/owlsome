grammar Hello;

program
 : sourceElements? EOF
 ;


sourceElements
 : sourceElement+
 ;


sourceElement
 : jsstatement
 ;
//  | owlStatement


jsstatement
 : statement
 | 'function'
;
/// Statement :
///     Block
///     VariableStatement
///     EmptyStatement
///     ExpressionStatement
///     IfStatement
///     IterationStatement
///     ContinueStatement
///     BreakStatement
///     ReturnStatement
///     WithStatement
///     LabelledStatement
///     SwitchStatement
///     ThrowStatement
///     TryStatement
///     DebuggerStatement
statement
 : block
 | variableStatement
 | emptyStatement
 ;

/// Block :
///     { StatementList? }
block
 : '{' statementList? '}'
 ;

/// StatementList :
///     Statement
///     StatementList Statement
statementList
 : statement+
 ;

/// VariableStatement :
///     var VariableDeclarationList ;
variableStatement
 : Var variableDeclarationList eos
 ;

/// VariableDeclarationList :
///     VariableDeclaration
///     VariableDeclarationList , VariableDeclaration
variableDeclarationList
 : variableDeclaration ( ',' variableDeclaration )*
 ;

/// VariableDeclaration :
///     Identifier Initialiser?
variableDeclaration
 : Identifier initialiser?
 ;

Identifier
 : IdentifierStart IdentifierPart*
 ;

fragment IdentifierStart
 : [a-z]
 | [$_]
 ;

fragment IdentifierPart
 : IdentifierStart
 | [0-9]
 ;

/// Initialiser :
///     = AssignmentExpression
//initialiser
// : '=' singleExpression
// ;
initialiser
 : '= 5'
 ;

/// EmptyStatement :
///     ;
emptyStatement
 : SemiColon
 ;


WhiteSpaces
 : [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN)
 ;

/// 7.4 Comments
MultiLineComment
 : '/*' .*? '*/' -> channel(HIDDEN)
 ;

SingleLineComment
 : '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN)
 ;

LineTerminator
 : [\r\n\u2028\u2029] -> channel(HIDDEN)
 ;



eos
 : SemiColon
 | EOF
 | {this.lineTerminatorAhead()}?
 | {this._input.LT(1).type == ECMAScriptParser.CloseBrace}?
 ;

eof
 : EOF
 ;


//keywords
Var        : 'var';




SemiColon                  : ';';

