// Generated from c:\Users\karl\Documents\antlr4\ECMAScript.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ECMAScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RegularExpressionLiteral=2, LineTerminator=3, OpenBracket=4, CloseBracket=5, 
		OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, SemiColon=10, Comma=11, 
		Assign=12, QuestionMark=13, Colon=14, Dot=15, PlusPlus=16, MinusMinus=17, 
		Plus=18, Minus=19, BitNot=20, Not=21, Multiply=22, Divide=23, Modulus=24, 
		RightShiftArithmetic=25, LeftShiftArithmetic=26, RightShiftLogical=27, 
		LessThan=28, MoreThan=29, LessThanEquals=30, GreaterThanEquals=31, Equals=32, 
		NotEquals=33, IdentityEquals=34, IdentityNotEquals=35, BitAnd=36, BitXOr=37, 
		BitOr=38, And=39, Or=40, MultiplyAssign=41, DivideAssign=42, ModulusAssign=43, 
		PlusAssign=44, MinusAssign=45, LeftShiftArithmeticAssign=46, RightShiftArithmeticAssign=47, 
		RightShiftLogicalAssign=48, BitAndAssign=49, BitXorAssign=50, BitOrAssign=51, 
		NullLiteral=52, BooleanLiteral=53, DecimalLiteral=54, HexIntegerLiteral=55, 
		OctalIntegerLiteral=56, Break=57, Do=58, Instanceof=59, Typeof=60, Case=61, 
		Else=62, New=63, Var=64, Catch=65, Finally=66, Return=67, Void=68, Continue=69, 
		For=70, Switch=71, While=72, Function=73, This=74, With=75, Default=76, 
		If=77, Throw=78, Delete=79, In=80, Try=81, OwlGet=82, OwlPost=83, Class=84, 
		Enum=85, Extends=86, Super=87, Const=88, Export=89, Import=90, Implements=91, 
		Let=92, Private=93, Public=94, Interface=95, Package=96, Protected=97, 
		Static=98, Yield=99, Identifier=100, StringLiteral=101, WhiteSpaces=102, 
		MultiLineComment=103, SingleLineComment=104, UnexpectedCharacter=105;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_element = 2, RULE_sourceElement = 3, 
		RULE_owlElement = 4, RULE_owlGetStatement = 5, RULE_owlPostStatement = 6, 
		RULE_statement = 7, RULE_block = 8, RULE_statementList = 9, RULE_variableStatement = 10, 
		RULE_variableDeclarationList = 11, RULE_variableDeclaration = 12, RULE_initialiser = 13, 
		RULE_emptyStatement = 14, RULE_expressionStatement = 15, RULE_ifStatement = 16, 
		RULE_iterationStatement = 17, RULE_continueStatement = 18, RULE_breakStatement = 19, 
		RULE_returnStatement = 20, RULE_withStatement = 21, RULE_switchStatement = 22, 
		RULE_caseBlock = 23, RULE_caseClauses = 24, RULE_caseClause = 25, RULE_defaultClause = 26, 
		RULE_labelledStatement = 27, RULE_throwStatement = 28, RULE_tryStatement = 29, 
		RULE_catchProduction = 30, RULE_finallyProduction = 31, RULE_functionDeclaration = 32, 
		RULE_formalParameterList = 33, RULE_functionBody = 34, RULE_arrayLiteral = 35, 
		RULE_elementList = 36, RULE_elision = 37, RULE_objectLiteral = 38, RULE_propertyNameAndValueList = 39, 
		RULE_propertyAssignment = 40, RULE_propertyName = 41, RULE_propertySetParameterList = 42, 
		RULE_arguments = 43, RULE_argumentList = 44, RULE_expressionSequence = 45, 
		RULE_singleExpression = 46, RULE_assignmentOperator = 47, RULE_literal = 48, 
		RULE_numericLiteral = 49, RULE_identifierName = 50, RULE_reservedWord = 51, 
		RULE_keyword = 52, RULE_futureReservedWord = 53, RULE_getter = 54, RULE_setter = 55, 
		RULE_eos = 56, RULE_eof = 57;
	public static final String[] ruleNames = {
		"program", "sourceElements", "element", "sourceElement", "owlElement", 
		"owlGetStatement", "owlPostStatement", "statement", "block", "statementList", 
		"variableStatement", "variableDeclarationList", "variableDeclaration", 
		"initialiser", "emptyStatement", "expressionStatement", "ifStatement", 
		"iterationStatement", "continueStatement", "breakStatement", "returnStatement", 
		"withStatement", "switchStatement", "caseBlock", "caseClauses", "caseClause", 
		"defaultClause", "labelledStatement", "throwStatement", "tryStatement", 
		"catchProduction", "finallyProduction", "functionDeclaration", "formalParameterList", 
		"functionBody", "arrayLiteral", "elementList", "elision", "objectLiteral", 
		"propertyNameAndValueList", "propertyAssignment", "propertyName", "propertySetParameterList", 
		"arguments", "argumentList", "expressionSequence", "singleExpression", 
		"assignmentOperator", "literal", "numericLiteral", "identifierName", "reservedWord", 
		"keyword", "futureReservedWord", "getter", "setter", "eos", "eof"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':)'", null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", 
		"','", "'='", "'?'", "':'", "'.'", "'++'", "'--'", "'+'", "'-'", "'~'", 
		"'!'", "'*'", "'/'", "'%'", "'>>'", "'<<'", "'>>>'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", 
		"'||'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", 
		"'&='", "'^='", "'|='", "'null'", null, null, null, null, "'break'", "'do'", 
		"'instanceof '", "'typeof '", "'case'", "'else'", "'new '", "'var '", 
		"'catch'", "'finally'", "'return '", "'void'", "'continue'", "'for'", 
		"'switch'", "'while'", "'function'", "'this'", "'with '", "'default '", 
		"'if'", "'throw '", "'delete '", "' in '", "'try'", "'owl_get'", "'owl_post'", 
		"'class '", "'enum '", "'extends '", "'super'", "'const '", "'export '", 
		"'import '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "RegularExpressionLiteral", "LineTerminator", "OpenBracket", 
		"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
		"SemiColon", "Comma", "Assign", "QuestionMark", "Colon", "Dot", "PlusPlus", 
		"MinusMinus", "Plus", "Minus", "BitNot", "Not", "Multiply", "Divide", 
		"Modulus", "RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", 
		"LessThan", "MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals", 
		"NotEquals", "IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", 
		"BitOr", "And", "Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", 
		"PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
		"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
		"NullLiteral", "BooleanLiteral", "DecimalLiteral", "HexIntegerLiteral", 
		"OctalIntegerLiteral", "Break", "Do", "Instanceof", "Typeof", "Case", 
		"Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
		"For", "Switch", "While", "Function", "This", "With", "Default", "If", 
		"Throw", "Delete", "In", "Try", "OwlGet", "OwlPost", "Class", "Enum", 
		"Extends", "Super", "Const", "Export", "Import", "Implements", "Let", 
		"Private", "Public", "Interface", "Package", "Protected", "Static", "Yield", 
		"Identifier", "StringLiteral", "WhiteSpaces", "MultiLineComment", "SingleLineComment", 
		"UnexpectedCharacter"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ECMAScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	/**
	 * Returns true if, on the current index of the parser's token stream,
	 * a token of the given type exists on the HIDDEN channel.
	 * @param type {Number} The type of the token on the HIDDEN channel to check.
	 * @returns {Boolean}
	 */
	ECMAScriptParser.prototype.here = function(type) {
	    var possibleIndexEosToken = antlr4.Parser.prototype.getCurrentToken.call(this).tokenIndex - 1;
	    var ahead = this._input.get(possibleIndexEosToken);
	    return (ahead.channel == antlr4.Lexer.HIDDEN) && (ahead.type == type);
	};

	/**
	 * Returns true if, on the current index of the parser's
	 * token stream, a token exists on the HIDDEN channel which
	 * either is a line terminator, or is a multi line comment that
	 * contains a line terminator.
	 * @returns {Boolean}
	 */
	ECMAScriptParser.prototype.lineTerminatorAhead = function() {
	    var possibleIndexEosToken = antlr4.Parser.prototype.getCurrentToken.call(this).tokenIndex - 1;
	    var ahead = this._input.get(possibleIndexEosToken);

	    if (ahead.channel != antlr4.Lexer.HIDDEN)
	        return false;

	    var text = ahead.text;
	    var type = ahead.type;

	    return (type == ECMAScriptParser.MultiLineComment && text.indexOf("\r") !== -1 || text.indexOf("\n") !== -1) ||
	            (type == ECMAScriptParser.LineTerminator);
	};

	public ECMAScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(116);
				sourceElements();
				}
			}

			setState(119);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementsContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				element();
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public SourceElementContext sourceElement() {
			return getRuleContext(SourceElementContext.class,0);
		}
		public OwlElementContext owlElement() {
			return getRuleContext(OwlElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case OpenBracket:
			case OpenParen:
			case OpenBrace:
			case SemiColon:
			case PlusPlus:
			case MinusMinus:
			case Plus:
			case Minus:
			case BitNot:
			case Not:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case Break:
			case Do:
			case Typeof:
			case New:
			case Var:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Function:
			case This:
			case With:
			case If:
			case Throw:
			case Delete:
			case Try:
			case Identifier:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				sourceElement();
				}
				break;
			case OwlGet:
			case OwlPost:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				owlElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sourceElement);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				functionDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwlElementContext extends ParserRuleContext {
		public OwlGetStatementContext owlGetStatement() {
			return getRuleContext(OwlGetStatementContext.class,0);
		}
		public OwlPostStatementContext owlPostStatement() {
			return getRuleContext(OwlPostStatementContext.class,0);
		}
		public OwlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owlElement; }
	}

	public final OwlElementContext owlElement() throws RecognitionException {
		OwlElementContext _localctx = new OwlElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_owlElement);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OwlGet:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				owlGetStatement();
				}
				break;
			case OwlPost:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				owlPostStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwlGetStatementContext extends ParserRuleContext {
		public TerminalNode OwlGet() { return getToken(ECMAScriptParser.OwlGet, 0); }
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public OwlGetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owlGetStatement; }
	}

	public final OwlGetStatementContext owlGetStatement() throws RecognitionException {
		OwlGetStatementContext _localctx = new OwlGetStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_owlGetStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(OwlGet);
			setState(139);
			match(T__0);
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==StringLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwlPostStatementContext extends ParserRuleContext {
		public TerminalNode OwlPost() { return getToken(ECMAScriptParser.OwlPost, 0); }
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public OwlPostStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owlPostStatement; }
	}

	public final OwlPostStatementContext owlPostStatement() throws RecognitionException {
		OwlPostStatementContext _localctx = new OwlPostStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_owlPostStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(OwlPost);
			setState(143);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==StringLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public LabelledStatementContext labelledStatement() {
			return getRuleContext(LabelledStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(152);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(154);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(155);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(156);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(158);
				tryStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(OpenBrace);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(162);
				statementList();
				}
			}

			setState(165);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(167);
				statement();
				}
				}
				setState(170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableStatementContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Var);
			setState(173);
			variableDeclarationList();
			setState(174);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			variableDeclaration();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(Comma);
					setState(178);
					variableDeclaration();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(Identifier);
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(185);
				initialiser();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Assign);
			setState(189);
			singleExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(SemiColon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			expressionSequence();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(If);
			setState(196);
			match(OpenParen);
			setState(197);
			expressionSequence();
			setState(198);
			match(CloseParen);
			setState(199);
			statement();
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(200);
				match(Else);
				setState(201);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoStatementContext extends IterationStatementContext {
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public DoStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForVarStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForVarInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForVarInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatementContext extends IterationStatementContext {
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public ForStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForInStatementContext extends IterationStatementContext {
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForInStatementContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterationStatement);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(Do);
				setState(205);
				statement();
				setState(206);
				match(While);
				setState(207);
				match(OpenParen);
				setState(208);
				expressionSequence();
				setState(209);
				match(CloseParen);
				setState(210);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(While);
				setState(213);
				match(OpenParen);
				setState(214);
				expressionSequence();
				setState(215);
				match(CloseParen);
				setState(216);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				match(For);
				setState(219);
				match(OpenParen);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(220);
					expressionSequence();
					}
				}

				setState(223);
				match(SemiColon);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(224);
					expressionSequence();
					}
				}

				setState(227);
				match(SemiColon);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(228);
					expressionSequence();
					}
				}

				setState(231);
				match(CloseParen);
				setState(232);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(For);
				setState(234);
				match(OpenParen);
				setState(235);
				match(Var);
				setState(236);
				variableDeclarationList();
				setState(237);
				match(SemiColon);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(238);
					expressionSequence();
					}
				}

				setState(241);
				match(SemiColon);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(242);
					expressionSequence();
					}
				}

				setState(245);
				match(CloseParen);
				setState(246);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				match(For);
				setState(249);
				match(OpenParen);
				setState(250);
				singleExpression(0);
				setState(251);
				match(In);
				setState(252);
				expressionSequence();
				setState(253);
				match(CloseParen);
				setState(254);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(For);
				setState(257);
				match(OpenParen);
				setState(258);
				match(Var);
				setState(259);
				variableDeclaration();
				setState(260);
				match(In);
				setState(261);
				expressionSequence();
				setState(262);
				match(CloseParen);
				setState(263);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Continue);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(268);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(269);
				match(Identifier);
				}
				break;
			}
			setState(272);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Break);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(275);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(276);
				match(Identifier);
				}
				break;
			}
			setState(279);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Return);
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(282);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(283);
				expressionSequence();
				}
				break;
			}
			setState(286);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(With);
			setState(289);
			match(OpenParen);
			setState(290);
			expressionSequence();
			setState(291);
			match(CloseParen);
			setState(292);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Switch);
			setState(295);
			match(OpenParen);
			setState(296);
			expressionSequence();
			setState(297);
			match(CloseParen);
			setState(298);
			caseBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseBlockContext extends ParserRuleContext {
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(OpenBrace);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(301);
				caseClauses();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(304);
				defaultClause();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(305);
					caseClauses();
					}
				}

				}
			}

			setState(310);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				caseClause();
				}
				}
				setState(315); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Case);
			setState(318);
			expressionSequence();
			setState(319);
			match(Colon);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(320);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defaultClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(Default);
			setState(324);
			match(Colon);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(325);
				statementList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelledStatement; }
	}

	public final LabelledStatementContext labelledStatement() throws RecognitionException {
		LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_labelledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(Identifier);
			setState(329);
			match(Colon);
			setState(330);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(Throw);
			setState(333);
			if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
			setState(334);
			expressionSequence();
			setState(335);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext catchProduction() {
			return getRuleContext(CatchProductionContext.class,0);
		}
		public FinallyProductionContext finallyProduction() {
			return getRuleContext(FinallyProductionContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_tryStatement);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(Try);
				setState(338);
				block();
				setState(339);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(Try);
				setState(342);
				block();
				setState(343);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(Try);
				setState(346);
				block();
				setState(347);
				catchProduction();
				setState(348);
				finallyProduction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchProductionContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchProduction; }
	}

	public final CatchProductionContext catchProduction() throws RecognitionException {
		CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_catchProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(Catch);
			setState(353);
			match(OpenParen);
			setState(354);
			match(Identifier);
			setState(355);
			match(CloseParen);
			setState(356);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyProductionContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyProduction; }
	}

	public final FinallyProductionContext finallyProduction() throws RecognitionException {
		FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_finallyProduction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(Finally);
			setState(359);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Function);
			setState(362);
			match(Identifier);
			setState(363);
			match(OpenParen);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(364);
				formalParameterList();
				}
			}

			setState(367);
			match(CloseParen);
			setState(368);
			match(OpenBrace);
			setState(369);
			functionBody();
			setState(370);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ECMAScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ECMAScriptParser.Identifier, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Identifier);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(373);
				match(Comma);
				setState(374);
				match(Identifier);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(380);
				sourceElements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ElisionContext elision() {
			return getRuleContext(ElisionContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(OpenBracket);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(384);
				elementList();
				}
				break;
			}
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(387);
				match(Comma);
				}
				break;
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(390);
				elision();
				}
			}

			setState(393);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<ElisionContext> elision() {
			return getRuleContexts(ElisionContext.class);
		}
		public ElisionContext elision(int i) {
			return getRuleContext(ElisionContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(395);
				elision();
				}
			}

			setState(398);
			singleExpression(0);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					match(Comma);
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(400);
						elision();
						}
					}

					setState(403);
					singleExpression(0);
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElisionContext extends ParserRuleContext {
		public ElisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elision; }
	}

	public final ElisionContext elision() throws RecognitionException {
		ElisionContext _localctx = new ElisionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_elision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				match(Comma);
				}
				}
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Comma );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectLiteralContext extends ParserRuleContext {
		public PropertyNameAndValueListContext propertyNameAndValueList() {
			return getRuleContext(PropertyNameAndValueListContext.class,0);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_objectLiteral);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				match(OpenBrace);
				setState(415);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(OpenBrace);
				setState(417);
				propertyNameAndValueList();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(418);
					match(Comma);
					}
				}

				setState(421);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameAndValueListContext extends ParserRuleContext {
		public List<PropertyAssignmentContext> propertyAssignment() {
			return getRuleContexts(PropertyAssignmentContext.class);
		}
		public PropertyAssignmentContext propertyAssignment(int i) {
			return getRuleContext(PropertyAssignmentContext.class,i);
		}
		public PropertyNameAndValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyNameAndValueList; }
	}

	public final PropertyNameAndValueListContext propertyNameAndValueList() throws RecognitionException {
		PropertyNameAndValueListContext _localctx = new PropertyNameAndValueListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propertyNameAndValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			propertyAssignment();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					match(Comma);
					setState(427);
					propertyAssignment();
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyAssignmentContext extends ParserRuleContext {
		public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAssignment; }
	 
		public PropertyAssignmentContext() { }
		public void copyFrom(PropertyAssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertySetterContext extends PropertyAssignmentContext {
		public SetterContext setter() {
			return getRuleContext(SetterContext.class,0);
		}
		public PropertySetParameterListContext propertySetParameterList() {
			return getRuleContext(PropertySetParameterListContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertySetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyGetterContext extends PropertyAssignmentContext {
		public GetterContext getter() {
			return getRuleContext(GetterContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public PropertyGetterContext(PropertyAssignmentContext ctx) { copyFrom(ctx); }
	}

	public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
		PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propertyAssignment);
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				propertyName();
				setState(434);
				match(Colon);
				setState(435);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				getter();
				setState(438);
				match(OpenParen);
				setState(439);
				match(CloseParen);
				setState(440);
				match(OpenBrace);
				setState(441);
				functionBody();
				setState(442);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				setter();
				setState(445);
				match(OpenParen);
				setState(446);
				propertySetParameterList();
				setState(447);
				match(CloseParen);
				setState(448);
				match(OpenBrace);
				setState(449);
				functionBody();
				setState(450);
				match(CloseBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_propertyName);
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertySetParameterListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertySetParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertySetParameterList; }
	}

	public final PropertySetParameterListContext propertySetParameterList() throws RecognitionException {
		PropertySetParameterListContext _localctx = new PropertySetParameterListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_propertySetParameterList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(OpenParen);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
				{
				setState(462);
				argumentList();
				}
			}

			setState(465);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			singleExpression(0);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(468);
				match(Comma);
				setState(469);
				singleExpression(0);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expressionSequence);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			singleExpression(0);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(476);
					match(Comma);
					setState(477);
					singleExpression(0);
					}
					} 
				}
				setState(482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public ObjectLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public InExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArgumentsExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionExpressionContext extends SingleExpressionContext {
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeofExpressionContext extends SingleExpressionContext {
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TypeofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class InstanceofExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public InstanceofExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DeleteExpressionContext extends SingleExpressionContext {
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public DeleteExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public MultiplicativeExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends SingleExpressionContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ParenthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public AdditiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostIncrementExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewExpressionContext extends SingleExpressionContext {
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public NewExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberIndexExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public MemberIndexExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VoidExpressionContext extends SingleExpressionContext {
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VoidExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(484);
				match(Function);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(485);
					match(Identifier);
					}
				}

				setState(488);
				match(OpenParen);
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(489);
					formalParameterList();
					}
				}

				setState(492);
				match(CloseParen);
				setState(493);
				match(OpenBrace);
				setState(494);
				functionBody();
				setState(495);
				match(CloseBrace);
				}
				break;
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(497);
				match(New);
				setState(498);
				singleExpression(0);
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(499);
					arguments();
					}
					break;
				}
				}
				break;
			case Delete:
				{
				_localctx = new DeleteExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(502);
				match(Delete);
				setState(503);
				singleExpression(30);
				}
				break;
			case Void:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(504);
				match(Void);
				setState(505);
				singleExpression(29);
				}
				break;
			case Typeof:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				match(Typeof);
				setState(507);
				singleExpression(28);
				}
				break;
			case PlusPlus:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(508);
				match(PlusPlus);
				setState(509);
				singleExpression(27);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				match(MinusMinus);
				setState(511);
				singleExpression(26);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(512);
				match(Plus);
				setState(513);
				singleExpression(25);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(514);
				match(Minus);
				setState(515);
				singleExpression(24);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(516);
				match(BitNot);
				setState(517);
				singleExpression(23);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(518);
				match(Not);
				setState(519);
				singleExpression(22);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				match(This);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(521);
				match(Identifier);
				}
				break;
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
				objectLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(525);
				match(OpenParen);
				setState(526);
				expressionSequence();
				setState(527);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(596);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(531);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(532);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(533);
						singleExpression(22);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(534);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(535);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(536);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(537);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(538);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(539);
						singleExpression(20);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(540);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(541);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(542);
						singleExpression(19);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(543);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(544);
						match(Instanceof);
						setState(545);
						singleExpression(18);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(546);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(547);
						match(In);
						setState(548);
						singleExpression(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(549);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(550);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(551);
						singleExpression(16);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(552);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(553);
						match(BitAnd);
						setState(554);
						singleExpression(15);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(555);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(556);
						match(BitXOr);
						setState(557);
						singleExpression(14);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(558);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(559);
						match(BitOr);
						setState(560);
						singleExpression(13);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(561);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(562);
						match(And);
						setState(563);
						singleExpression(12);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(564);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(565);
						match(Or);
						setState(566);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(567);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(568);
						match(QuestionMark);
						setState(569);
						singleExpression(0);
						setState(570);
						match(Colon);
						setState(571);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(573);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(574);
						match(OpenBracket);
						setState(575);
						expressionSequence();
						setState(576);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(578);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(579);
						match(Dot);
						setState(580);
						identifierName();
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(581);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(582);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(583);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(584);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(585);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(586);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(587);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(588);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(589);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(590);
						match(Assign);
						setState(591);
						expressionSequence();
						}
						break;
					case 20:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(592);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(593);
						assignmentOperator();
						setState(594);
						expressionSequence();
						}
						break;
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MultiplyAssign) | (1L << DivideAssign) | (1L << ModulusAssign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << RightShiftLogicalAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ECMAScriptParser.StringLiteral, 0); }
		public TerminalNode RegularExpressionLiteral() { return getToken(ECMAScriptParser.RegularExpressionLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << NullLiteral) | (1L << BooleanLiteral))) != 0) || _la==StringLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				numericLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(ECMAScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(ECMAScriptParser.HexIntegerLiteral, 0); }
		public TerminalNode OctalIntegerLiteral() { return getToken(ECMAScriptParser.OctalIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_identifierName);
		try {
			setState(611);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(Identifier);
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				reservedWord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FutureReservedWordContext futureReservedWord() {
			return getRuleContext(FutureReservedWordContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ECMAScriptParser.NullLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ECMAScriptParser.BooleanLiteral, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_reservedWord);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
			case Do:
			case Instanceof:
			case Typeof:
			case Case:
			case Else:
			case New:
			case Var:
			case Catch:
			case Finally:
			case Return:
			case Void:
			case Continue:
			case For:
			case Switch:
			case While:
			case Function:
			case This:
			case With:
			case Default:
			case If:
			case Throw:
			case Delete:
			case In:
			case Try:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				keyword();
				}
				break;
			case Class:
			case Enum:
			case Extends:
			case Super:
			case Const:
			case Export:
			case Import:
			case Implements:
			case Let:
			case Private:
			case Public:
			case Interface:
			case Package:
			case Protected:
			case Static:
			case Yield:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				_la = _input.LA(1);
				if ( !(_la==NullLiteral || _la==BooleanLiteral) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ECMAScriptParser.Break, 0); }
		public TerminalNode Do() { return getToken(ECMAScriptParser.Do, 0); }
		public TerminalNode Instanceof() { return getToken(ECMAScriptParser.Instanceof, 0); }
		public TerminalNode Typeof() { return getToken(ECMAScriptParser.Typeof, 0); }
		public TerminalNode Case() { return getToken(ECMAScriptParser.Case, 0); }
		public TerminalNode Else() { return getToken(ECMAScriptParser.Else, 0); }
		public TerminalNode New() { return getToken(ECMAScriptParser.New, 0); }
		public TerminalNode Var() { return getToken(ECMAScriptParser.Var, 0); }
		public TerminalNode Catch() { return getToken(ECMAScriptParser.Catch, 0); }
		public TerminalNode Finally() { return getToken(ECMAScriptParser.Finally, 0); }
		public TerminalNode Return() { return getToken(ECMAScriptParser.Return, 0); }
		public TerminalNode Void() { return getToken(ECMAScriptParser.Void, 0); }
		public TerminalNode Continue() { return getToken(ECMAScriptParser.Continue, 0); }
		public TerminalNode For() { return getToken(ECMAScriptParser.For, 0); }
		public TerminalNode Switch() { return getToken(ECMAScriptParser.Switch, 0); }
		public TerminalNode While() { return getToken(ECMAScriptParser.While, 0); }
		public TerminalNode Function() { return getToken(ECMAScriptParser.Function, 0); }
		public TerminalNode This() { return getToken(ECMAScriptParser.This, 0); }
		public TerminalNode With() { return getToken(ECMAScriptParser.With, 0); }
		public TerminalNode Default() { return getToken(ECMAScriptParser.Default, 0); }
		public TerminalNode If() { return getToken(ECMAScriptParser.If, 0); }
		public TerminalNode Throw() { return getToken(ECMAScriptParser.Throw, 0); }
		public TerminalNode Delete() { return getToken(ECMAScriptParser.Delete, 0); }
		public TerminalNode In() { return getToken(ECMAScriptParser.In, 0); }
		public TerminalNode Try() { return getToken(ECMAScriptParser.Try, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (Break - 57)) | (1L << (Do - 57)) | (1L << (Instanceof - 57)) | (1L << (Typeof - 57)) | (1L << (Case - 57)) | (1L << (Else - 57)) | (1L << (New - 57)) | (1L << (Var - 57)) | (1L << (Catch - 57)) | (1L << (Finally - 57)) | (1L << (Return - 57)) | (1L << (Void - 57)) | (1L << (Continue - 57)) | (1L << (For - 57)) | (1L << (Switch - 57)) | (1L << (While - 57)) | (1L << (Function - 57)) | (1L << (This - 57)) | (1L << (With - 57)) | (1L << (Default - 57)) | (1L << (If - 57)) | (1L << (Throw - 57)) | (1L << (Delete - 57)) | (1L << (In - 57)) | (1L << (Try - 57)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FutureReservedWordContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(ECMAScriptParser.Class, 0); }
		public TerminalNode Enum() { return getToken(ECMAScriptParser.Enum, 0); }
		public TerminalNode Extends() { return getToken(ECMAScriptParser.Extends, 0); }
		public TerminalNode Super() { return getToken(ECMAScriptParser.Super, 0); }
		public TerminalNode Const() { return getToken(ECMAScriptParser.Const, 0); }
		public TerminalNode Export() { return getToken(ECMAScriptParser.Export, 0); }
		public TerminalNode Import() { return getToken(ECMAScriptParser.Import, 0); }
		public TerminalNode Implements() { return getToken(ECMAScriptParser.Implements, 0); }
		public TerminalNode Let() { return getToken(ECMAScriptParser.Let, 0); }
		public TerminalNode Private() { return getToken(ECMAScriptParser.Private, 0); }
		public TerminalNode Public() { return getToken(ECMAScriptParser.Public, 0); }
		public TerminalNode Interface() { return getToken(ECMAScriptParser.Interface, 0); }
		public TerminalNode Package() { return getToken(ECMAScriptParser.Package, 0); }
		public TerminalNode Protected() { return getToken(ECMAScriptParser.Protected, 0); }
		public TerminalNode Static() { return getToken(ECMAScriptParser.Static, 0); }
		public TerminalNode Yield() { return getToken(ECMAScriptParser.Yield, 0); }
		public FutureReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_futureReservedWord; }
	}

	public final FutureReservedWordContext futureReservedWord() throws RecognitionException {
		FutureReservedWordContext _localctx = new FutureReservedWordContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_futureReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (Class - 84)) | (1L << (Enum - 84)) | (1L << (Extends - 84)) | (1L << (Super - 84)) | (1L << (Const - 84)) | (1L << (Export - 84)) | (1L << (Import - 84)) | (1L << (Implements - 84)) | (1L << (Let - 84)) | (1L << (Private - 84)) | (1L << (Public - 84)) | (1L << (Interface - 84)) | (1L << (Package - 84)) | (1L << (Protected - 84)) | (1L << (Static - 84)) | (1L << (Yield - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getter; }
	}

	public final GetterContext getter() throws RecognitionException {
		GetterContext _localctx = new GetterContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_getter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			if (!(this._input.LT(1).text.startsWith("get"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"get\")");
			setState(623);
			match(Identifier);
			setState(624);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ECMAScriptParser.Identifier, 0); }
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setter; }
	}

	public final SetterContext setter() throws RecognitionException {
		SetterContext _localctx = new SetterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_setter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			if (!(this._input.LT(1).text.startsWith("set"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"set\")");
			setState(627);
			match(Identifier);
			setState(628);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ECMAScriptParser.SemiColon, 0); }
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_eos);
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(632);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(633);
				if (!(this._input.LT(1).type == ECMAScriptParser.CloseBrace)) throw new FailedPredicateException(this, "this._input.LT(1).type == ECMAScriptParser.CloseBrace");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ECMAScriptParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return continueStatement_sempred((ContinueStatementContext)_localctx, predIndex);
		case 19:
			return breakStatement_sempred((BreakStatementContext)_localctx, predIndex);
		case 20:
			return returnStatement_sempred((ReturnStatementContext)_localctx, predIndex);
		case 28:
			return throwStatement_sempred((ThrowStatementContext)_localctx, predIndex);
		case 46:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		case 54:
			return getter_sempred((GetterContext)_localctx, predIndex);
		case 55:
			return setter_sempred((SetterContext)_localctx, predIndex);
		case 56:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !this.here(ECMAScriptParser.LineTerminator);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 21);
		case 5:
			return precpred(_ctx, 20);
		case 6:
			return precpred(_ctx, 19);
		case 7:
			return precpred(_ctx, 18);
		case 8:
			return precpred(_ctx, 17);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 14);
		case 12:
			return precpred(_ctx, 13);
		case 13:
			return precpred(_ctx, 12);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 10);
		case 16:
			return precpred(_ctx, 9);
		case 17:
			return precpred(_ctx, 36);
		case 18:
			return precpred(_ctx, 35);
		case 19:
			return precpred(_ctx, 34);
		case 20:
			return precpred(_ctx, 32);
		case 21:
			return !this.here(ECMAScriptParser.LineTerminator);
		case 22:
			return precpred(_ctx, 31);
		case 23:
			return !this.here(ECMAScriptParser.LineTerminator);
		case 24:
			return precpred(_ctx, 8);
		case 25:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean getter_sempred(GetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return this._input.LT(1).text.startsWith("get");
		}
		return true;
	}
	private boolean setter_sempred(SetterContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return this._input.LT(1).text.startsWith("set");
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return this.lineTerminatorAhead();
		case 29:
			return this._input.LT(1).type == ECMAScriptParser.CloseBrace;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u0281\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\5\2x\n\2"+
		"\3\2\3\2\3\3\6\3}\n\3\r\3\16\3~\3\4\3\4\5\4\u0083\n\4\3\5\3\5\5\5\u0087"+
		"\n\5\3\6\3\6\5\6\u008b\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a2\n\t\3\n\3\n\5\n\u00a6"+
		"\n\n\3\n\3\n\3\13\6\13\u00ab\n\13\r\13\16\13\u00ac\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\7\r\u00b6\n\r\f\r\16\r\u00b9\13\r\3\16\3\16\5\16\u00bd\n\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u00cd\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e0\n\23\3\23\3\23\5\23\u00e4\n"+
		"\23\3\23\3\23\5\23\u00e8\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00f2\n\23\3\23\3\23\5\23\u00f6\n\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u010c\n\23\3\24\3\24\3\24\5\24\u0111\n\24\3\24\3\24\3\25\3\25"+
		"\3\25\5\25\u0118\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u011f\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\5\31\u0131\n\31\3\31\3\31\5\31\u0135\n\31\5\31\u0137\n\31\3\31\3\31"+
		"\3\32\6\32\u013c\n\32\r\32\16\32\u013d\3\33\3\33\3\33\3\33\5\33\u0144"+
		"\n\33\3\34\3\34\3\34\5\34\u0149\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0161\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u0170"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u017a\n#\f#\16#\u017d\13#\3$\5$\u0180"+
		"\n$\3%\3%\5%\u0184\n%\3%\5%\u0187\n%\3%\5%\u018a\n%\3%\3%\3&\5&\u018f"+
		"\n&\3&\3&\3&\5&\u0194\n&\3&\7&\u0197\n&\f&\16&\u019a\13&\3\'\6\'\u019d"+
		"\n\'\r\'\16\'\u019e\3(\3(\3(\3(\3(\5(\u01a6\n(\3(\3(\5(\u01aa\n(\3)\3"+
		")\3)\7)\u01af\n)\f)\16)\u01b2\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u01c7\n*\3+\3+\3+\5+\u01cc\n+\3,\3,\3-\3-\5-"+
		"\u01d2\n-\3-\3-\3.\3.\3.\7.\u01d9\n.\f.\16.\u01dc\13.\3/\3/\3/\7/\u01e1"+
		"\n/\f/\16/\u01e4\13/\3\60\3\60\3\60\5\60\u01e9\n\60\3\60\3\60\5\60\u01ed"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01f7\n\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0214\n\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0257\n\60\f\60\16"+
		"\60\u025a\13\60\3\61\3\61\3\62\3\62\5\62\u0260\n\62\3\63\3\63\3\64\3\64"+
		"\5\64\u0266\n\64\3\65\3\65\3\65\5\65\u026b\n\65\3\66\3\66\3\67\3\67\3"+
		"8\38\38\38\39\39\39\39\3:\3:\3:\3:\5:\u027d\n:\3;\3;\3;\2\3^<\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprt\2\16\3\2fg\3\2\30\32\3\2\24\25\3\2\33\35\3\2\36!\3\2\""+
		"%\3\2+\65\5\2\4\4\66\67gg\3\28:\3\2\66\67\3\2;S\3\2Ve\2\u02b4\2w\3\2\2"+
		"\2\4|\3\2\2\2\6\u0082\3\2\2\2\b\u0086\3\2\2\2\n\u008a\3\2\2\2\f\u008c"+
		"\3\2\2\2\16\u0090\3\2\2\2\20\u00a1\3\2\2\2\22\u00a3\3\2\2\2\24\u00aa\3"+
		"\2\2\2\26\u00ae\3\2\2\2\30\u00b2\3\2\2\2\32\u00ba\3\2\2\2\34\u00be\3\2"+
		"\2\2\36\u00c1\3\2\2\2 \u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u010b\3\2\2\2&\u010d"+
		"\3\2\2\2(\u0114\3\2\2\2*\u011b\3\2\2\2,\u0122\3\2\2\2.\u0128\3\2\2\2\60"+
		"\u012e\3\2\2\2\62\u013b\3\2\2\2\64\u013f\3\2\2\2\66\u0145\3\2\2\28\u014a"+
		"\3\2\2\2:\u014e\3\2\2\2<\u0160\3\2\2\2>\u0162\3\2\2\2@\u0168\3\2\2\2B"+
		"\u016b\3\2\2\2D\u0176\3\2\2\2F\u017f\3\2\2\2H\u0181\3\2\2\2J\u018e\3\2"+
		"\2\2L\u019c\3\2\2\2N\u01a9\3\2\2\2P\u01ab\3\2\2\2R\u01c6\3\2\2\2T\u01cb"+
		"\3\2\2\2V\u01cd\3\2\2\2X\u01cf\3\2\2\2Z\u01d5\3\2\2\2\\\u01dd\3\2\2\2"+
		"^\u0213\3\2\2\2`\u025b\3\2\2\2b\u025f\3\2\2\2d\u0261\3\2\2\2f\u0265\3"+
		"\2\2\2h\u026a\3\2\2\2j\u026c\3\2\2\2l\u026e\3\2\2\2n\u0270\3\2\2\2p\u0274"+
		"\3\2\2\2r\u027c\3\2\2\2t\u027e\3\2\2\2vx\5\4\3\2wv\3\2\2\2wx\3\2\2\2x"+
		"y\3\2\2\2yz\7\2\2\3z\3\3\2\2\2{}\5\6\4\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\5\3\2\2\2\u0080\u0083\5\b\5\2\u0081\u0083\5\n\6\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\7\3\2\2\2\u0084\u0087\5\20\t"+
		"\2\u0085\u0087\5B\"\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\t"+
		"\3\2\2\2\u0088\u008b\5\f\7\2\u0089\u008b\5\16\b\2\u008a\u0088\3\2\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d\7T\2\2\u008d\u008e\7"+
		"\3\2\2\u008e\u008f\t\2\2\2\u008f\r\3\2\2\2\u0090\u0091\7U\2\2\u0091\u0092"+
		"\t\2\2\2\u0092\17\3\2\2\2\u0093\u00a2\5\22\n\2\u0094\u00a2\5\26\f\2\u0095"+
		"\u00a2\5\36\20\2\u0096\u00a2\5 \21\2\u0097\u00a2\5\"\22\2\u0098\u00a2"+
		"\5$\23\2\u0099\u00a2\5&\24\2\u009a\u00a2\5(\25\2\u009b\u00a2\5*\26\2\u009c"+
		"\u00a2\5,\27\2\u009d\u00a2\58\35\2\u009e\u00a2\5.\30\2\u009f\u00a2\5:"+
		"\36\2\u00a0\u00a2\5<\37\2\u00a1\u0093\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1"+
		"\u0095\3\2\2\2\u00a1\u0096\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u0098\3\2"+
		"\2\2\u00a1\u0099\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1"+
		"\u009c\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a2\21\3\2\2\2\u00a3\u00a5\7\n\2\2\u00a4\u00a6"+
		"\5\24\13\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2"+
		"\u00a7\u00a8\7\13\2\2\u00a8\23\3\2\2\2\u00a9\u00ab\5\20\t\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\25\3\2\2\2\u00ae\u00af\7B\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\5r:\2"+
		"\u00b1\27\3\2\2\2\u00b2\u00b7\5\32\16\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6"+
		"\5\32\16\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2"+
		"\u00b7\u00b8\3\2\2\2\u00b8\31\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bc"+
		"\7f\2\2\u00bb\u00bd\5\34\17\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2"+
		"\u00bd\33\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c0\5^\60\2\u00c0\35\3"+
		"\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\37\3\2\2\2\u00c3\u00c4\5\\/\2\u00c4!"+
		"\3\2\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5\\/\2\u00c8"+
		"\u00c9\7\t\2\2\u00c9\u00cc\5\20\t\2\u00ca\u00cb\7@\2\2\u00cb\u00cd\5\20"+
		"\t\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd#\3\2\2\2\u00ce\u00cf"+
		"\7<\2\2\u00cf\u00d0\5\20\t\2\u00d0\u00d1\7J\2\2\u00d1\u00d2\7\b\2\2\u00d2"+
		"\u00d3\5\\/\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\5r:\2\u00d5\u010c\3\2\2"+
		"\2\u00d6\u00d7\7J\2\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\5\\/\2\u00d9\u00da"+
		"\7\t\2\2\u00da\u00db\5\20\t\2\u00db\u010c\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd"+
		"\u00df\7\b\2\2\u00de\u00e0\5\\/\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\f\2\2\u00e2\u00e4\5\\/\2\u00e3"+
		"\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\f"+
		"\2\2\u00e6\u00e8\5\\/\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\7\t\2\2\u00ea\u010c\5\20\t\2\u00eb\u00ec\7"+
		"H\2\2\u00ec\u00ed\7\b\2\2\u00ed\u00ee\7B\2\2\u00ee\u00ef\5\30\r\2\u00ef"+
		"\u00f1\7\f\2\2\u00f0\u00f2\5\\/\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\7\f\2\2\u00f4\u00f6\5\\/\2\u00f5"+
		"\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\t"+
		"\2\2\u00f8\u00f9\5\20\t\2\u00f9\u010c\3\2\2\2\u00fa\u00fb\7H\2\2\u00fb"+
		"\u00fc\7\b\2\2\u00fc\u00fd\5^\60\2\u00fd\u00fe\7R\2\2\u00fe\u00ff\5\\"+
		"/\2\u00ff\u0100\7\t\2\2\u0100\u0101\5\20\t\2\u0101\u010c\3\2\2\2\u0102"+
		"\u0103\7H\2\2\u0103\u0104\7\b\2\2\u0104\u0105\7B\2\2\u0105\u0106\5\32"+
		"\16\2\u0106\u0107\7R\2\2\u0107\u0108\5\\/\2\u0108\u0109\7\t\2\2\u0109"+
		"\u010a\5\20\t\2\u010a\u010c\3\2\2\2\u010b\u00ce\3\2\2\2\u010b\u00d6\3"+
		"\2\2\2\u010b\u00dc\3\2\2\2\u010b\u00eb\3\2\2\2\u010b\u00fa\3\2\2\2\u010b"+
		"\u0102\3\2\2\2\u010c%\3\2\2\2\u010d\u0110\7G\2\2\u010e\u010f\6\24\2\2"+
		"\u010f\u0111\7f\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\5r:\2\u0113\'\3\2\2\2\u0114\u0117\7;\2\2\u0115\u0116"+
		"\6\25\3\2\u0116\u0118\7f\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\5r:\2\u011a)\3\2\2\2\u011b\u011e\7E\2\2\u011c"+
		"\u011d\6\26\4\2\u011d\u011f\5\\/\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5r:\2\u0121+\3\2\2\2\u0122\u0123"+
		"\7M\2\2\u0123\u0124\7\b\2\2\u0124\u0125\5\\/\2\u0125\u0126\7\t\2\2\u0126"+
		"\u0127\5\20\t\2\u0127-\3\2\2\2\u0128\u0129\7I\2\2\u0129\u012a\7\b\2\2"+
		"\u012a\u012b\5\\/\2\u012b\u012c\7\t\2\2\u012c\u012d\5\60\31\2\u012d/\3"+
		"\2\2\2\u012e\u0130\7\n\2\2\u012f\u0131\5\62\32\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0136\3\2\2\2\u0132\u0134\5\66\34\2\u0133\u0135\5"+
		"\62\32\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\13"+
		"\2\2\u0139\61\3\2\2\2\u013a\u013c\5\64\33\2\u013b\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\63\3\2\2"+
		"\2\u013f\u0140\7?\2\2\u0140\u0141\5\\/\2\u0141\u0143\7\20\2\2\u0142\u0144"+
		"\5\24\13\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\65\3\2\2\2\u0145"+
		"\u0146\7N\2\2\u0146\u0148\7\20\2\2\u0147\u0149\5\24\13\2\u0148\u0147\3"+
		"\2\2\2\u0148\u0149\3\2\2\2\u0149\67\3\2\2\2\u014a\u014b\7f\2\2\u014b\u014c"+
		"\7\20\2\2\u014c\u014d\5\20\t\2\u014d9\3\2\2\2\u014e\u014f\7P\2\2\u014f"+
		"\u0150\6\36\5\2\u0150\u0151\5\\/\2\u0151\u0152\5r:\2\u0152;\3\2\2\2\u0153"+
		"\u0154\7S\2\2\u0154\u0155\5\22\n\2\u0155\u0156\5> \2\u0156\u0161\3\2\2"+
		"\2\u0157\u0158\7S\2\2\u0158\u0159\5\22\n\2\u0159\u015a\5@!\2\u015a\u0161"+
		"\3\2\2\2\u015b\u015c\7S\2\2\u015c\u015d\5\22\n\2\u015d\u015e\5> \2\u015e"+
		"\u015f\5@!\2\u015f\u0161\3\2\2\2\u0160\u0153\3\2\2\2\u0160\u0157\3\2\2"+
		"\2\u0160\u015b\3\2\2\2\u0161=\3\2\2\2\u0162\u0163\7C\2\2\u0163\u0164\7"+
		"\b\2\2\u0164\u0165\7f\2\2\u0165\u0166\7\t\2\2\u0166\u0167\5\22\n\2\u0167"+
		"?\3\2\2\2\u0168\u0169\7D\2\2\u0169\u016a\5\22\n\2\u016aA\3\2\2\2\u016b"+
		"\u016c\7K\2\2\u016c\u016d\7f\2\2\u016d\u016f\7\b\2\2\u016e\u0170\5D#\2"+
		"\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172"+
		"\7\t\2\2\u0172\u0173\7\n\2\2\u0173\u0174\5F$\2\u0174\u0175\7\13\2\2\u0175"+
		"C\3\2\2\2\u0176\u017b\7f\2\2\u0177\u0178\7\r\2\2\u0178\u017a\7f\2\2\u0179"+
		"\u0177\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017cE\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\5\4\3\2\u017f\u017e"+
		"\3\2\2\2\u017f\u0180\3\2\2\2\u0180G\3\2\2\2\u0181\u0183\7\6\2\2\u0182"+
		"\u0184\5J&\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2"+
		"\2\u0185\u0187\7\r\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0189"+
		"\3\2\2\2\u0188\u018a\5L\'\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\7\2\2\u018cI\3\2\2\2\u018d\u018f\5L\'\2\u018e"+
		"\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0198\5^"+
		"\60\2\u0191\u0193\7\r\2\2\u0192\u0194\5L\'\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0197\5^\60\2\u0196\u0191\3\2"+
		"\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"K\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019d\7\r\2\2\u019c\u019b\3\2\2\2"+
		"\u019d\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fM\3"+
		"\2\2\2\u01a0\u01a1\7\n\2\2\u01a1\u01aa\7\13\2\2\u01a2\u01a3\7\n\2\2\u01a3"+
		"\u01a5\5P)\2\u01a4\u01a6\7\r\2\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\7\13\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a0\3\2\2\2\u01a9\u01a2\3\2\2\2\u01aaO\3\2\2\2\u01ab\u01b0\5R*\2\u01ac"+
		"\u01ad\7\r\2\2\u01ad\u01af\5R*\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2"+
		"\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1Q\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b3\u01b4\5T+\2\u01b4\u01b5\7\20\2\2\u01b5\u01b6\5^\60\2\u01b6"+
		"\u01c7\3\2\2\2\u01b7\u01b8\5n8\2\u01b8\u01b9\7\b\2\2\u01b9\u01ba\7\t\2"+
		"\2\u01ba\u01bb\7\n\2\2\u01bb\u01bc\5F$\2\u01bc\u01bd\7\13\2\2\u01bd\u01c7"+
		"\3\2\2\2\u01be\u01bf\5p9\2\u01bf\u01c0\7\b\2\2\u01c0\u01c1\5V,\2\u01c1"+
		"\u01c2\7\t\2\2\u01c2\u01c3\7\n\2\2\u01c3\u01c4\5F$\2\u01c4\u01c5\7\13"+
		"\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01b3\3\2\2\2\u01c6\u01b7\3\2\2\2\u01c6"+
		"\u01be\3\2\2\2\u01c7S\3\2\2\2\u01c8\u01cc\5f\64\2\u01c9\u01cc\7g\2\2\u01ca"+
		"\u01cc\5d\63\2\u01cb\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2"+
		"\2\2\u01ccU\3\2\2\2\u01cd\u01ce\7f\2\2\u01ceW\3\2\2\2\u01cf\u01d1\7\b"+
		"\2\2\u01d0\u01d2\5Z.\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d4\7\t\2\2\u01d4Y\3\2\2\2\u01d5\u01da\5^\60\2\u01d6"+
		"\u01d7\7\r\2\2\u01d7\u01d9\5^\60\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2"+
		"\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db[\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dd\u01e2\5^\60\2\u01de\u01df\7\r\2\2\u01df\u01e1\5^\60\2\u01e0"+
		"\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3]\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\b\60\1\2\u01e6\u01e8"+
		"\7K\2\2\u01e7\u01e9\7f\2\2\u01e8\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01ec\7\b\2\2\u01eb\u01ed\5D#\2\u01ec\u01eb\3\2\2"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\t\2\2\u01ef\u01f0"+
		"\7\n\2\2\u01f0\u01f1\5F$\2\u01f1\u01f2\7\13\2\2\u01f2\u0214\3\2\2\2\u01f3"+
		"\u01f4\7A\2\2\u01f4\u01f6\5^\60\2\u01f5\u01f7\5X-\2\u01f6\u01f5\3\2\2"+
		"\2\u01f6\u01f7\3\2\2\2\u01f7\u0214\3\2\2\2\u01f8\u01f9\7Q\2\2\u01f9\u0214"+
		"\5^\60 \u01fa\u01fb\7F\2\2\u01fb\u0214\5^\60\37\u01fc\u01fd\7>\2\2\u01fd"+
		"\u0214\5^\60\36\u01fe\u01ff\7\22\2\2\u01ff\u0214\5^\60\35\u0200\u0201"+
		"\7\23\2\2\u0201\u0214\5^\60\34\u0202\u0203\7\24\2\2\u0203\u0214\5^\60"+
		"\33\u0204\u0205\7\25\2\2\u0205\u0214\5^\60\32\u0206\u0207\7\26\2\2\u0207"+
		"\u0214\5^\60\31\u0208\u0209\7\27\2\2\u0209\u0214\5^\60\30\u020a\u0214"+
		"\7L\2\2\u020b\u0214\7f\2\2\u020c\u0214\5b\62\2\u020d\u0214\5H%\2\u020e"+
		"\u0214\5N(\2\u020f\u0210\7\b\2\2\u0210\u0211\5\\/\2\u0211\u0212\7\t\2"+
		"\2\u0212\u0214\3\2\2\2\u0213\u01e5\3\2\2\2\u0213\u01f3\3\2\2\2\u0213\u01f8"+
		"\3\2\2\2\u0213\u01fa\3\2\2\2\u0213\u01fc\3\2\2\2\u0213\u01fe\3\2\2\2\u0213"+
		"\u0200\3\2\2\2\u0213\u0202\3\2\2\2\u0213\u0204\3\2\2\2\u0213\u0206\3\2"+
		"\2\2\u0213\u0208\3\2\2\2\u0213\u020a\3\2\2\2\u0213\u020b\3\2\2\2\u0213"+
		"\u020c\3\2\2\2\u0213\u020d\3\2\2\2\u0213\u020e\3\2\2\2\u0213\u020f\3\2"+
		"\2\2\u0214\u0258\3\2\2\2\u0215\u0216\f\27\2\2\u0216\u0217\t\3\2\2\u0217"+
		"\u0257\5^\60\30\u0218\u0219\f\26\2\2\u0219\u021a\t\4\2\2\u021a\u0257\5"+
		"^\60\27\u021b\u021c\f\25\2\2\u021c\u021d\t\5\2\2\u021d\u0257\5^\60\26"+
		"\u021e\u021f\f\24\2\2\u021f\u0220\t\6\2\2\u0220\u0257\5^\60\25\u0221\u0222"+
		"\f\23\2\2\u0222\u0223\7=\2\2\u0223\u0257\5^\60\24\u0224\u0225\f\22\2\2"+
		"\u0225\u0226\7R\2\2\u0226\u0257\5^\60\23\u0227\u0228\f\21\2\2\u0228\u0229"+
		"\t\7\2\2\u0229\u0257\5^\60\22\u022a\u022b\f\20\2\2\u022b\u022c\7&\2\2"+
		"\u022c\u0257\5^\60\21\u022d\u022e\f\17\2\2\u022e\u022f\7\'\2\2\u022f\u0257"+
		"\5^\60\20\u0230\u0231\f\16\2\2\u0231\u0232\7(\2\2\u0232\u0257\5^\60\17"+
		"\u0233\u0234\f\r\2\2\u0234\u0235\7)\2\2\u0235\u0257\5^\60\16\u0236\u0237"+
		"\f\f\2\2\u0237\u0238\7*\2\2\u0238\u0257\5^\60\r\u0239\u023a\f\13\2\2\u023a"+
		"\u023b\7\17\2\2\u023b\u023c\5^\60\2\u023c\u023d\7\20\2\2\u023d\u023e\5"+
		"^\60\f\u023e\u0257\3\2\2\2\u023f\u0240\f&\2\2\u0240\u0241\7\6\2\2\u0241"+
		"\u0242\5\\/\2\u0242\u0243\7\7\2\2\u0243\u0257\3\2\2\2\u0244\u0245\f%\2"+
		"\2\u0245\u0246\7\21\2\2\u0246\u0257\5f\64\2\u0247\u0248\f$\2\2\u0248\u0257"+
		"\5X-\2\u0249\u024a\f\"\2\2\u024a\u024b\6\60\27\2\u024b\u0257\7\22\2\2"+
		"\u024c\u024d\f!\2\2\u024d\u024e\6\60\31\2\u024e\u0257\7\23\2\2\u024f\u0250"+
		"\f\n\2\2\u0250\u0251\7\16\2\2\u0251\u0257\5\\/\2\u0252\u0253\f\t\2\2\u0253"+
		"\u0254\5`\61\2\u0254\u0255\5\\/\2\u0255\u0257\3\2\2\2\u0256\u0215\3\2"+
		"\2\2\u0256\u0218\3\2\2\2\u0256\u021b\3\2\2\2\u0256\u021e\3\2\2\2\u0256"+
		"\u0221\3\2\2\2\u0256\u0224\3\2\2\2\u0256\u0227\3\2\2\2\u0256\u022a\3\2"+
		"\2\2\u0256\u022d\3\2\2\2\u0256\u0230\3\2\2\2\u0256\u0233\3\2\2\2\u0256"+
		"\u0236\3\2\2\2\u0256\u0239\3\2\2\2\u0256\u023f\3\2\2\2\u0256\u0244\3\2"+
		"\2\2\u0256\u0247\3\2\2\2\u0256\u0249\3\2\2\2\u0256\u024c\3\2\2\2\u0256"+
		"\u024f\3\2\2\2\u0256\u0252\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259_\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c"+
		"\t\b\2\2\u025ca\3\2\2\2\u025d\u0260\t\t\2\2\u025e\u0260\5d\63\2\u025f"+
		"\u025d\3\2\2\2\u025f\u025e\3\2\2\2\u0260c\3\2\2\2\u0261\u0262\t\n\2\2"+
		"\u0262e\3\2\2\2\u0263\u0266\7f\2\2\u0264\u0266\5h\65\2\u0265\u0263\3\2"+
		"\2\2\u0265\u0264\3\2\2\2\u0266g\3\2\2\2\u0267\u026b\5j\66\2\u0268\u026b"+
		"\5l\67\2\u0269\u026b\t\13\2\2\u026a\u0267\3\2\2\2\u026a\u0268\3\2\2\2"+
		"\u026a\u0269\3\2\2\2\u026bi\3\2\2\2\u026c\u026d\t\f\2\2\u026dk\3\2\2\2"+
		"\u026e\u026f\t\r\2\2\u026fm\3\2\2\2\u0270\u0271\68\34\2\u0271\u0272\7"+
		"f\2\2\u0272\u0273\5T+\2\u0273o\3\2\2\2\u0274\u0275\69\35\2\u0275\u0276"+
		"\7f\2\2\u0276\u0277\5T+\2\u0277q\3\2\2\2\u0278\u027d\7\f\2\2\u0279\u027d"+
		"\7\2\2\3\u027a\u027d\6:\36\2\u027b\u027d\6:\37\2\u027c\u0278\3\2\2\2\u027c"+
		"\u0279\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027b\3\2\2\2\u027ds\3\2\2\2"+
		"\u027e\u027f\7\2\2\3\u027fu\3\2\2\29w~\u0082\u0086\u008a\u00a1\u00a5\u00ac"+
		"\u00b7\u00bc\u00cc\u00df\u00e3\u00e7\u00f1\u00f5\u010b\u0110\u0117\u011e"+
		"\u0130\u0134\u0136\u013d\u0143\u0148\u0160\u016f\u017b\u017f\u0183\u0186"+
		"\u0189\u018e\u0193\u0198\u019e\u01a5\u01a9\u01b0\u01c6\u01cb\u01d1\u01da"+
		"\u01e2\u01e8\u01ec\u01f6\u0213\u0256\u0258\u025f\u0265\u026a\u027c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}