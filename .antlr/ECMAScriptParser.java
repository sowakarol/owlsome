// Generated from c:\Users\karl\Documents\antlr4\owlsome\ECMAScript.g4 by ANTLR 4.7.1
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
		RULE_owlStatement = 4, RULE_owlGetStatement = 5, RULE_owlPostStatement = 6, 
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
		"program", "sourceElements", "element", "sourceElement", "owlStatement", 
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
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			sourceElement();
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
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

	public static class OwlStatementContext extends ParserRuleContext {
		public OwlGetStatementContext owlGetStatement() {
			return getRuleContext(OwlGetStatementContext.class,0);
		}
		public OwlPostStatementContext owlPostStatement() {
			return getRuleContext(OwlPostStatementContext.class,0);
		}
		public OwlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owlStatement; }
	}

	public final OwlStatementContext owlStatement() throws RecognitionException {
		OwlStatementContext _localctx = new OwlStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_owlStatement);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OwlGet:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				owlGetStatement();
				}
				break;
			case OwlPost:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(136);
			match(OwlGet);
			setState(137);
			match(T__0);
			setState(138);
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
			setState(140);
			match(OwlPost);
			setState(141);
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
		public OwlStatementContext owlStatement() {
			return getRuleContext(OwlStatementContext.class,0);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				variableStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				emptyStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				iterationStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				continueStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				withStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				labelledStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				switchStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				throwStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(156);
				tryStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(157);
				owlStatement();
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
			setState(160);
			match(OpenBrace);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(161);
				statementList();
				}
			}

			setState(164);
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
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				statement();
				}
				}
				setState(169); 
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
			setState(171);
			match(Var);
			setState(172);
			variableDeclarationList();
			setState(173);
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
			setState(175);
			variableDeclaration();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(176);
					match(Comma);
					setState(177);
					variableDeclaration();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(183);
			match(Identifier);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(184);
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
			setState(187);
			match(Assign);
			setState(188);
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
			setState(190);
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
			setState(192);
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
			setState(194);
			match(If);
			setState(195);
			match(OpenParen);
			setState(196);
			expressionSequence();
			setState(197);
			match(CloseParen);
			setState(198);
			statement();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(199);
				match(Else);
				setState(200);
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
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DoStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(Do);
				setState(204);
				statement();
				setState(205);
				match(While);
				setState(206);
				match(OpenParen);
				setState(207);
				expressionSequence();
				setState(208);
				match(CloseParen);
				setState(209);
				eos();
				}
				break;
			case 2:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(While);
				setState(212);
				match(OpenParen);
				setState(213);
				expressionSequence();
				setState(214);
				match(CloseParen);
				setState(215);
				statement();
				}
				break;
			case 3:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(For);
				setState(218);
				match(OpenParen);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(219);
					expressionSequence();
					}
				}

				setState(222);
				match(SemiColon);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(223);
					expressionSequence();
					}
				}

				setState(226);
				match(SemiColon);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(227);
					expressionSequence();
					}
				}

				setState(230);
				match(CloseParen);
				setState(231);
				statement();
				}
				break;
			case 4:
				_localctx = new ForVarStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(For);
				setState(233);
				match(OpenParen);
				setState(234);
				match(Var);
				setState(235);
				variableDeclarationList();
				setState(236);
				match(SemiColon);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(237);
					expressionSequence();
					}
				}

				setState(240);
				match(SemiColon);
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(241);
					expressionSequence();
					}
				}

				setState(244);
				match(CloseParen);
				setState(245);
				statement();
				}
				break;
			case 5:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				match(For);
				setState(248);
				match(OpenParen);
				setState(249);
				singleExpression(0);
				setState(250);
				match(In);
				setState(251);
				expressionSequence();
				setState(252);
				match(CloseParen);
				setState(253);
				statement();
				}
				break;
			case 6:
				_localctx = new ForVarInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(For);
				setState(256);
				match(OpenParen);
				setState(257);
				match(Var);
				setState(258);
				variableDeclaration();
				setState(259);
				match(In);
				setState(260);
				expressionSequence();
				setState(261);
				match(CloseParen);
				setState(262);
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
			setState(266);
			match(Continue);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(267);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(268);
				match(Identifier);
				}
				break;
			}
			setState(271);
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
			setState(273);
			match(Break);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(274);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(275);
				match(Identifier);
				}
				break;
			}
			setState(278);
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
			setState(280);
			match(Return);
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(281);
				if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
				setState(282);
				expressionSequence();
				}
				break;
			}
			setState(285);
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
			setState(287);
			match(With);
			setState(288);
			match(OpenParen);
			setState(289);
			expressionSequence();
			setState(290);
			match(CloseParen);
			setState(291);
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
			setState(293);
			match(Switch);
			setState(294);
			match(OpenParen);
			setState(295);
			expressionSequence();
			setState(296);
			match(CloseParen);
			setState(297);
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
			setState(299);
			match(OpenBrace);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(300);
				caseClauses();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(303);
				defaultClause();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(304);
					caseClauses();
					}
				}

				}
			}

			setState(309);
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
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				caseClause();
				}
				}
				setState(314); 
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
			setState(316);
			match(Case);
			setState(317);
			expressionSequence();
			setState(318);
			match(Colon);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(319);
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
			setState(322);
			match(Default);
			setState(323);
			match(Colon);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(324);
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
			setState(327);
			match(Identifier);
			setState(328);
			match(Colon);
			setState(329);
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
			setState(331);
			match(Throw);
			setState(332);
			if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
			setState(333);
			expressionSequence();
			setState(334);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(Try);
				setState(337);
				block();
				setState(338);
				catchProduction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(Try);
				setState(341);
				block();
				setState(342);
				finallyProduction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(Try);
				setState(345);
				block();
				setState(346);
				catchProduction();
				setState(347);
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
			setState(351);
			match(Catch);
			setState(352);
			match(OpenParen);
			setState(353);
			match(Identifier);
			setState(354);
			match(CloseParen);
			setState(355);
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
			setState(357);
			match(Finally);
			setState(358);
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
			setState(360);
			match(Function);
			setState(361);
			match(Identifier);
			setState(362);
			match(OpenParen);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(363);
				formalParameterList();
				}
			}

			setState(366);
			match(CloseParen);
			setState(367);
			match(OpenBrace);
			setState(368);
			functionBody();
			setState(369);
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
			setState(371);
			match(Identifier);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(372);
				match(Comma);
				setState(373);
				match(Identifier);
				}
				}
				setState(378);
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
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Break) | (1L << Do) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Var - 64)) | (1L << (Return - 64)) | (1L << (Void - 64)) | (1L << (Continue - 64)) | (1L << (For - 64)) | (1L << (Switch - 64)) | (1L << (While - 64)) | (1L << (Function - 64)) | (1L << (This - 64)) | (1L << (With - 64)) | (1L << (If - 64)) | (1L << (Throw - 64)) | (1L << (Delete - 64)) | (1L << (Try - 64)) | (1L << (OwlGet - 64)) | (1L << (OwlPost - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(379);
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
			setState(382);
			match(OpenBracket);
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(383);
				elementList();
				}
				break;
			}
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(386);
				match(Comma);
				}
				break;
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(389);
				elision();
				}
			}

			setState(392);
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
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(394);
				elision();
				}
			}

			setState(397);
			singleExpression(0);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					match(Comma);
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(399);
						elision();
						}
					}

					setState(402);
					singleExpression(0);
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(409); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(408);
				match(Comma);
				}
				}
				setState(411); 
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(OpenBrace);
				setState(414);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				match(OpenBrace);
				setState(416);
				propertyNameAndValueList();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(417);
					match(Comma);
					}
				}

				setState(420);
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
			setState(424);
			propertyAssignment();
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(425);
					match(Comma);
					setState(426);
					propertyAssignment();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new PropertyExpressionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				propertyName();
				setState(433);
				match(Colon);
				setState(434);
				singleExpression(0);
				}
				break;
			case 2:
				_localctx = new PropertyGetterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				getter();
				setState(437);
				match(OpenParen);
				setState(438);
				match(CloseParen);
				setState(439);
				match(OpenBrace);
				setState(440);
				functionBody();
				setState(441);
				match(CloseBrace);
				}
				break;
			case 3:
				_localctx = new PropertySetterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				setter();
				setState(444);
				match(OpenParen);
				setState(445);
				propertySetParameterList();
				setState(446);
				match(CloseParen);
				setState(447);
				match(OpenBrace);
				setState(448);
				functionBody();
				setState(449);
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
			setState(456);
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
				setState(453);
				identifierName();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
			case OctalIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(455);
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
			setState(458);
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
			setState(460);
			match(OpenParen);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RegularExpressionLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << Plus) | (1L << Minus) | (1L << BitNot) | (1L << Not) | (1L << NullLiteral) | (1L << BooleanLiteral) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OctalIntegerLiteral) | (1L << Typeof) | (1L << New))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Void - 68)) | (1L << (Function - 68)) | (1L << (This - 68)) | (1L << (Delete - 68)) | (1L << (Identifier - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
				{
				setState(461);
				argumentList();
				}
			}

			setState(464);
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
			setState(466);
			singleExpression(0);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(467);
				match(Comma);
				setState(468);
				singleExpression(0);
				}
				}
				setState(473);
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
			setState(474);
			singleExpression(0);
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(475);
					match(Comma);
					setState(476);
					singleExpression(0);
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Function:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(483);
				match(Function);
				setState(485);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(484);
					match(Identifier);
					}
				}

				setState(487);
				match(OpenParen);
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(488);
					formalParameterList();
					}
				}

				setState(491);
				match(CloseParen);
				setState(492);
				match(OpenBrace);
				setState(493);
				functionBody();
				setState(494);
				match(CloseBrace);
				}
				break;
			case New:
				{
				_localctx = new NewExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(New);
				setState(497);
				singleExpression(0);
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(498);
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
				setState(501);
				match(Delete);
				setState(502);
				singleExpression(30);
				}
				break;
			case Void:
				{
				_localctx = new VoidExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(503);
				match(Void);
				setState(504);
				singleExpression(29);
				}
				break;
			case Typeof:
				{
				_localctx = new TypeofExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(505);
				match(Typeof);
				setState(506);
				singleExpression(28);
				}
				break;
			case PlusPlus:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(507);
				match(PlusPlus);
				setState(508);
				singleExpression(27);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509);
				match(MinusMinus);
				setState(510);
				singleExpression(26);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(511);
				match(Plus);
				setState(512);
				singleExpression(25);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(513);
				match(Minus);
				setState(514);
				singleExpression(24);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(515);
				match(BitNot);
				setState(516);
				singleExpression(23);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(517);
				match(Not);
				setState(518);
				singleExpression(22);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				match(This);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
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
				setState(521);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(522);
				arrayLiteral();
				}
				break;
			case OpenBrace:
				{
				_localctx = new ObjectLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(523);
				objectLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(524);
				match(OpenParen);
				setState(525);
				expressionSequence();
				setState(526);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(595);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(530);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(531);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(532);
						singleExpression(22);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(533);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(534);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(535);
						singleExpression(21);
						}
						break;
					case 3:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(536);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(537);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RightShiftArithmetic) | (1L << LeftShiftArithmetic) | (1L << RightShiftLogical))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(538);
						singleExpression(20);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(539);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(540);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThan) | (1L << MoreThan) | (1L << LessThanEquals) | (1L << GreaterThanEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(541);
						singleExpression(19);
						}
						break;
					case 5:
						{
						_localctx = new InstanceofExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(542);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(543);
						match(Instanceof);
						setState(544);
						singleExpression(18);
						}
						break;
					case 6:
						{
						_localctx = new InExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(545);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(546);
						match(In);
						setState(547);
						singleExpression(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(548);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(549);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Equals) | (1L << NotEquals) | (1L << IdentityEquals) | (1L << IdentityNotEquals))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(550);
						singleExpression(16);
						}
						break;
					case 8:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(551);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(552);
						match(BitAnd);
						setState(553);
						singleExpression(15);
						}
						break;
					case 9:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(554);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(555);
						match(BitXOr);
						setState(556);
						singleExpression(14);
						}
						break;
					case 10:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(557);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(558);
						match(BitOr);
						setState(559);
						singleExpression(13);
						}
						break;
					case 11:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(560);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(561);
						match(And);
						setState(562);
						singleExpression(12);
						}
						break;
					case 12:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(563);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(564);
						match(Or);
						setState(565);
						singleExpression(11);
						}
						break;
					case 13:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(566);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(567);
						match(QuestionMark);
						setState(568);
						singleExpression(0);
						setState(569);
						match(Colon);
						setState(570);
						singleExpression(10);
						}
						break;
					case 14:
						{
						_localctx = new MemberIndexExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(572);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(573);
						match(OpenBracket);
						setState(574);
						expressionSequence();
						setState(575);
						match(CloseBracket);
						}
						break;
					case 15:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(577);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(578);
						match(Dot);
						setState(579);
						identifierName();
						}
						break;
					case 16:
						{
						_localctx = new ArgumentsExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(580);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(581);
						arguments();
						}
						break;
					case 17:
						{
						_localctx = new PostIncrementExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(582);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(583);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(584);
						match(PlusPlus);
						}
						break;
					case 18:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(585);
						if (!(precpred(_ctx, 31))) throw new FailedPredicateException(this, "precpred(_ctx, 31)");
						setState(586);
						if (!(!this.here(ECMAScriptParser.LineTerminator))) throw new FailedPredicateException(this, "!this.here(ECMAScriptParser.LineTerminator)");
						setState(587);
						match(MinusMinus);
						}
						break;
					case 19:
						{
						_localctx = new AssignmentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(588);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(589);
						match(Assign);
						setState(590);
						expressionSequence();
						}
						break;
					case 20:
						{
						_localctx = new AssignmentOperatorExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(591);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(592);
						assignmentOperator();
						setState(593);
						expressionSequence();
						}
						break;
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
			setState(600);
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
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RegularExpressionLiteral:
			case NullLiteral:
			case BooleanLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
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
				setState(603);
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
			setState(606);
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
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
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
				setState(609);
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
			setState(615);
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
				setState(612);
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
				setState(613);
				futureReservedWord();
				}
				break;
			case NullLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
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
			setState(617);
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
			setState(619);
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
			setState(621);
			if (!(this._input.LT(1).text.startsWith("get"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"get\")");
			setState(622);
			match(Identifier);
			setState(623);
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
			setState(625);
			if (!(this._input.LT(1).text.startsWith("set"))) throw new FailedPredicateException(this, "this._input.LT(1).text.startsWith(\"set\")");
			setState(626);
			match(Identifier);
			setState(627);
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
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				if (!(this.lineTerminatorAhead())) throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
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
			setState(635);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3k\u0280\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\5\2x\n\2"+
		"\3\2\3\2\3\3\6\3}\n\3\r\3\16\3~\3\4\3\4\3\5\3\5\5\5\u0085\n\5\3\6\3\6"+
		"\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\n\3\n\5\n\u00a5\n\n\3"+
		"\n\3\n\3\13\6\13\u00aa\n\13\r\13\16\13\u00ab\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\16\3\16\5\16\u00bc\n\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00df\n\23\3\23\3\23\5\23\u00e3\n\23\3\23\3"+
		"\23\5\23\u00e7\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f1"+
		"\n\23\3\23\3\23\5\23\u00f5\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u010b"+
		"\n\23\3\24\3\24\3\24\5\24\u0110\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u0117"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u011e\n\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u0130\n\31"+
		"\3\31\3\31\5\31\u0134\n\31\5\31\u0136\n\31\3\31\3\31\3\32\6\32\u013b\n"+
		"\32\r\32\16\32\u013c\3\33\3\33\3\33\3\33\5\33\u0143\n\33\3\34\3\34\3\34"+
		"\5\34\u0148\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0160\n\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\5\"\u016f\n\"\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\7#\u0179\n#\f#\16#\u017c\13#\3$\5$\u017f\n$\3%\3%\5"+
		"%\u0183\n%\3%\5%\u0186\n%\3%\5%\u0189\n%\3%\3%\3&\5&\u018e\n&\3&\3&\3"+
		"&\5&\u0193\n&\3&\7&\u0196\n&\f&\16&\u0199\13&\3\'\6\'\u019c\n\'\r\'\16"+
		"\'\u019d\3(\3(\3(\3(\3(\5(\u01a5\n(\3(\3(\5(\u01a9\n(\3)\3)\3)\7)\u01ae"+
		"\n)\f)\16)\u01b1\13)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\5*\u01c6\n*\3+\3+\3+\5+\u01cb\n+\3,\3,\3-\3-\5-\u01d1\n-\3-\3"+
		"-\3.\3.\3.\7.\u01d8\n.\f.\16.\u01db\13.\3/\3/\3/\7/\u01e0\n/\f/\16/\u01e3"+
		"\13/\3\60\3\60\3\60\5\60\u01e8\n\60\3\60\3\60\5\60\u01ec\n\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01f6\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0213\n\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0256\n\60\f\60\16\60\u0259\13\60"+
		"\3\61\3\61\3\62\3\62\5\62\u025f\n\62\3\63\3\63\3\64\3\64\5\64\u0265\n"+
		"\64\3\65\3\65\3\65\5\65\u026a\n\65\3\66\3\66\3\67\3\67\38\38\38\38\39"+
		"\39\39\39\3:\3:\3:\3:\5:\u027c\n:\3;\3;\3;\2\3^<\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rt\2\16\3\2fg\3\2\30\32\3\2\24\25\3\2\33\35\3\2\36!\3\2\"%\3\2+\65\5\2"+
		"\4\4\66\67gg\3\28:\3\2\66\67\3\2;S\3\2Ve\2\u02b3\2w\3\2\2\2\4|\3\2\2\2"+
		"\6\u0080\3\2\2\2\b\u0084\3\2\2\2\n\u0088\3\2\2\2\f\u008a\3\2\2\2\16\u008e"+
		"\3\2\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00a9\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00b1\3\2\2\2\32\u00b9\3\2\2\2\34\u00bd\3\2\2\2\36\u00c0\3\2"+
		"\2\2 \u00c2\3\2\2\2\"\u00c4\3\2\2\2$\u010a\3\2\2\2&\u010c\3\2\2\2(\u0113"+
		"\3\2\2\2*\u011a\3\2\2\2,\u0121\3\2\2\2.\u0127\3\2\2\2\60\u012d\3\2\2\2"+
		"\62\u013a\3\2\2\2\64\u013e\3\2\2\2\66\u0144\3\2\2\28\u0149\3\2\2\2:\u014d"+
		"\3\2\2\2<\u015f\3\2\2\2>\u0161\3\2\2\2@\u0167\3\2\2\2B\u016a\3\2\2\2D"+
		"\u0175\3\2\2\2F\u017e\3\2\2\2H\u0180\3\2\2\2J\u018d\3\2\2\2L\u019b\3\2"+
		"\2\2N\u01a8\3\2\2\2P\u01aa\3\2\2\2R\u01c5\3\2\2\2T\u01ca\3\2\2\2V\u01cc"+
		"\3\2\2\2X\u01ce\3\2\2\2Z\u01d4\3\2\2\2\\\u01dc\3\2\2\2^\u0212\3\2\2\2"+
		"`\u025a\3\2\2\2b\u025e\3\2\2\2d\u0260\3\2\2\2f\u0264\3\2\2\2h\u0269\3"+
		"\2\2\2j\u026b\3\2\2\2l\u026d\3\2\2\2n\u026f\3\2\2\2p\u0273\3\2\2\2r\u027b"+
		"\3\2\2\2t\u027d\3\2\2\2vx\5\4\3\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\2"+
		"\2\3z\3\3\2\2\2{}\5\6\4\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\5\3\2\2\2\u0080\u0081\5\b\5\2\u0081\7\3\2\2\2\u0082\u0085\5\20\t\2\u0083"+
		"\u0085\5B\"\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\t\3\2\2\2"+
		"\u0086\u0089\5\f\7\2\u0087\u0089\5\16\b\2\u0088\u0086\3\2\2\2\u0088\u0087"+
		"\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\7T\2\2\u008b\u008c\7\3\2\2\u008c"+
		"\u008d\t\2\2\2\u008d\r\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\t\2\2\2"+
		"\u0090\17\3\2\2\2\u0091\u00a1\5\22\n\2\u0092\u00a1\5\26\f\2\u0093\u00a1"+
		"\5\36\20\2\u0094\u00a1\5 \21\2\u0095\u00a1\5\"\22\2\u0096\u00a1\5$\23"+
		"\2\u0097\u00a1\5&\24\2\u0098\u00a1\5(\25\2\u0099\u00a1\5*\26\2\u009a\u00a1"+
		"\5,\27\2\u009b\u00a1\58\35\2\u009c\u00a1\5.\30\2\u009d\u00a1\5:\36\2\u009e"+
		"\u00a1\5<\37\2\u009f\u00a1\5\n\6\2\u00a0\u0091\3\2\2\2\u00a0\u0092\3\2"+
		"\2\2\u00a0\u0093\3\2\2\2\u00a0\u0094\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0"+
		"\u0096\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u0099\3\2"+
		"\2\2\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\21\3\2\2"+
		"\2\u00a2\u00a4\7\n\2\2\u00a3\u00a5\5\24\13\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7\23\3\2\2"+
		"\2\u00a8\u00aa\5\20\t\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7B\2\2"+
		"\u00ae\u00af\5\30\r\2\u00af\u00b0\5r:\2\u00b0\27\3\2\2\2\u00b1\u00b6\5"+
		"\32\16\2\u00b2\u00b3\7\r\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b2\3\2\2\2"+
		"\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\31"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7f\2\2\u00ba\u00bc\5\34\17\2"+
		"\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00be"+
		"\7\16\2\2\u00be\u00bf\5^\60\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\37\3\2\2\2\u00c2\u00c3\5\\/\2\u00c3!\3\2\2\2\u00c4\u00c5\7O\2\2\u00c5"+
		"\u00c6\7\b\2\2\u00c6\u00c7\5\\/\2\u00c7\u00c8\7\t\2\2\u00c8\u00cb\5\20"+
		"\t\2\u00c9\u00ca\7@\2\2\u00ca\u00cc\5\20\t\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\u00cf\5\20\t\2"+
		"\u00cf\u00d0\7J\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\5\\/\2\u00d2\u00d3"+
		"\7\t\2\2\u00d3\u00d4\5r:\2\u00d4\u010b\3\2\2\2\u00d5\u00d6\7J\2\2\u00d6"+
		"\u00d7\7\b\2\2\u00d7\u00d8\5\\/\2\u00d8\u00d9\7\t\2\2\u00d9\u00da\5\20"+
		"\t\2\u00da\u010b\3\2\2\2\u00db\u00dc\7H\2\2\u00dc\u00de\7\b\2\2\u00dd"+
		"\u00df\5\\/\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\7\f\2\2\u00e1\u00e3\5\\/\2\u00e2\u00e1\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\7\f\2\2\u00e5\u00e7\5\\"+
		"/\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\t\2\2\u00e9\u010b\5\20\t\2\u00ea\u00eb\7H\2\2\u00eb\u00ec\7\b"+
		"\2\2\u00ec\u00ed\7B\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00f0\7\f\2\2\u00ef"+
		"\u00f1\5\\/\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\7\f\2\2\u00f3\u00f5\5\\/\2\u00f4\u00f3\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\5\20"+
		"\t\2\u00f8\u010b\3\2\2\2\u00f9\u00fa\7H\2\2\u00fa\u00fb\7\b\2\2\u00fb"+
		"\u00fc\5^\60\2\u00fc\u00fd\7R\2\2\u00fd\u00fe\5\\/\2\u00fe\u00ff\7\t\2"+
		"\2\u00ff\u0100\5\20\t\2\u0100\u010b\3\2\2\2\u0101\u0102\7H\2\2\u0102\u0103"+
		"\7\b\2\2\u0103\u0104\7B\2\2\u0104\u0105\5\32\16\2\u0105\u0106\7R\2\2\u0106"+
		"\u0107\5\\/\2\u0107\u0108\7\t\2\2\u0108\u0109\5\20\t\2\u0109\u010b\3\2"+
		"\2\2\u010a\u00cd\3\2\2\2\u010a\u00d5\3\2\2\2\u010a\u00db\3\2\2\2\u010a"+
		"\u00ea\3\2\2\2\u010a\u00f9\3\2\2\2\u010a\u0101\3\2\2\2\u010b%\3\2\2\2"+
		"\u010c\u010f\7G\2\2\u010d\u010e\6\24\2\2\u010e\u0110\7f\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\5r:\2\u0112"+
		"\'\3\2\2\2\u0113\u0116\7;\2\2\u0114\u0115\6\25\3\2\u0115\u0117\7f\2\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\5r:\2\u0119)\3\2\2\2\u011a\u011d\7E\2\2\u011b\u011c\6\26\4\2\u011c\u011e"+
		"\5\\/\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\5r:\2\u0120+\3\2\2\2\u0121\u0122\7M\2\2\u0122\u0123\7\b\2\2\u0123"+
		"\u0124\5\\/\2\u0124\u0125\7\t\2\2\u0125\u0126\5\20\t\2\u0126-\3\2\2\2"+
		"\u0127\u0128\7I\2\2\u0128\u0129\7\b\2\2\u0129\u012a\5\\/\2\u012a\u012b"+
		"\7\t\2\2\u012b\u012c\5\60\31\2\u012c/\3\2\2\2\u012d\u012f\7\n\2\2\u012e"+
		"\u0130\5\62\32\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0135\3"+
		"\2\2\2\u0131\u0133\5\66\34\2\u0132\u0134\5\62\32\2\u0133\u0132\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\13\2\2\u0138\61\3\2\2\2\u0139"+
		"\u013b\5\64\33\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\63\3\2\2\2\u013e\u013f\7?\2\2\u013f\u0140"+
		"\5\\/\2\u0140\u0142\7\20\2\2\u0141\u0143\5\24\13\2\u0142\u0141\3\2\2\2"+
		"\u0142\u0143\3\2\2\2\u0143\65\3\2\2\2\u0144\u0145\7N\2\2\u0145\u0147\7"+
		"\20\2\2\u0146\u0148\5\24\13\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2"+
		"\u0148\67\3\2\2\2\u0149\u014a\7f\2\2\u014a\u014b\7\20\2\2\u014b\u014c"+
		"\5\20\t\2\u014c9\3\2\2\2\u014d\u014e\7P\2\2\u014e\u014f\6\36\5\2\u014f"+
		"\u0150\5\\/\2\u0150\u0151\5r:\2\u0151;\3\2\2\2\u0152\u0153\7S\2\2\u0153"+
		"\u0154\5\22\n\2\u0154\u0155\5> \2\u0155\u0160\3\2\2\2\u0156\u0157\7S\2"+
		"\2\u0157\u0158\5\22\n\2\u0158\u0159\5@!\2\u0159\u0160\3\2\2\2\u015a\u015b"+
		"\7S\2\2\u015b\u015c\5\22\n\2\u015c\u015d\5> \2\u015d\u015e\5@!\2\u015e"+
		"\u0160\3\2\2\2\u015f\u0152\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u015a\3\2"+
		"\2\2\u0160=\3\2\2\2\u0161\u0162\7C\2\2\u0162\u0163\7\b\2\2\u0163\u0164"+
		"\7f\2\2\u0164\u0165\7\t\2\2\u0165\u0166\5\22\n\2\u0166?\3\2\2\2\u0167"+
		"\u0168\7D\2\2\u0168\u0169\5\22\n\2\u0169A\3\2\2\2\u016a\u016b\7K\2\2\u016b"+
		"\u016c\7f\2\2\u016c\u016e\7\b\2\2\u016d\u016f\5D#\2\u016e\u016d\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\7\t\2\2\u0171\u0172"+
		"\7\n\2\2\u0172\u0173\5F$\2\u0173\u0174\7\13\2\2\u0174C\3\2\2\2\u0175\u017a"+
		"\7f\2\2\u0176\u0177\7\r\2\2\u0177\u0179\7f\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017bE\3\2\2\2"+
		"\u017c\u017a\3\2\2\2\u017d\u017f\5\4\3\2\u017e\u017d\3\2\2\2\u017e\u017f"+
		"\3\2\2\2\u017fG\3\2\2\2\u0180\u0182\7\6\2\2\u0181\u0183\5J&\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7\r\2\2\u0185"+
		"\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\5L"+
		"\'\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\7\7\2\2\u018bI\3\2\2\2\u018c\u018e\5L\'\2\u018d\u018c\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0197\5^\60\2\u0190\u0192\7\r"+
		"\2\2\u0191\u0193\5L\'\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0196\5^\60\2\u0195\u0190\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198K\3\2\2\2\u0199\u0197"+
		"\3\2\2\2\u019a\u019c\7\r\2\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eM\3\2\2\2\u019f\u01a0\7\n\2\2"+
		"\u01a0\u01a9\7\13\2\2\u01a1\u01a2\7\n\2\2\u01a2\u01a4\5P)\2\u01a3\u01a5"+
		"\7\r\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6"+
		"\u01a7\7\13\2\2\u01a7\u01a9\3\2\2\2\u01a8\u019f\3\2\2\2\u01a8\u01a1\3"+
		"\2\2\2\u01a9O\3\2\2\2\u01aa\u01af\5R*\2\u01ab\u01ac\7\r\2\2\u01ac\u01ae"+
		"\5R*\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0Q\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\5T+\2\u01b3"+
		"\u01b4\7\20\2\2\u01b4\u01b5\5^\60\2\u01b5\u01c6\3\2\2\2\u01b6\u01b7\5"+
		"n8\2\u01b7\u01b8\7\b\2\2\u01b8\u01b9\7\t\2\2\u01b9\u01ba\7\n\2\2\u01ba"+
		"\u01bb\5F$\2\u01bb\u01bc\7\13\2\2\u01bc\u01c6\3\2\2\2\u01bd\u01be\5p9"+
		"\2\u01be\u01bf\7\b\2\2\u01bf\u01c0\5V,\2\u01c0\u01c1\7\t\2\2\u01c1\u01c2"+
		"\7\n\2\2\u01c2\u01c3\5F$\2\u01c3\u01c4\7\13\2\2\u01c4\u01c6\3\2\2\2\u01c5"+
		"\u01b2\3\2\2\2\u01c5\u01b6\3\2\2\2\u01c5\u01bd\3\2\2\2\u01c6S\3\2\2\2"+
		"\u01c7\u01cb\5f\64\2\u01c8\u01cb\7g\2\2\u01c9\u01cb\5d\63\2\u01ca\u01c7"+
		"\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01c9\3\2\2\2\u01cbU\3\2\2\2\u01cc"+
		"\u01cd\7f\2\2\u01cdW\3\2\2\2\u01ce\u01d0\7\b\2\2\u01cf\u01d1\5Z.\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7\t"+
		"\2\2\u01d3Y\3\2\2\2\u01d4\u01d9\5^\60\2\u01d5\u01d6\7\r\2\2\u01d6\u01d8"+
		"\5^\60\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da[\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01e1\5^\60\2"+
		"\u01dd\u01de\7\r\2\2\u01de\u01e0\5^\60\2\u01df\u01dd\3\2\2\2\u01e0\u01e3"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2]\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\b\60\1\2\u01e5\u01e7\7K\2\2\u01e6\u01e8\7f"+
		"\2\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\7\b\2\2\u01ea\u01ec\5D#\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7\t\2\2\u01ee\u01ef\7\n\2\2\u01ef\u01f0"+
		"\5F$\2\u01f0\u01f1\7\13\2\2\u01f1\u0213\3\2\2\2\u01f2\u01f3\7A\2\2\u01f3"+
		"\u01f5\5^\60\2\u01f4\u01f6\5X-\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2"+
		"\2\u01f6\u0213\3\2\2\2\u01f7\u01f8\7Q\2\2\u01f8\u0213\5^\60 \u01f9\u01fa"+
		"\7F\2\2\u01fa\u0213\5^\60\37\u01fb\u01fc\7>\2\2\u01fc\u0213\5^\60\36\u01fd"+
		"\u01fe\7\22\2\2\u01fe\u0213\5^\60\35\u01ff\u0200\7\23\2\2\u0200\u0213"+
		"\5^\60\34\u0201\u0202\7\24\2\2\u0202\u0213\5^\60\33\u0203\u0204\7\25\2"+
		"\2\u0204\u0213\5^\60\32\u0205\u0206\7\26\2\2\u0206\u0213\5^\60\31\u0207"+
		"\u0208\7\27\2\2\u0208\u0213\5^\60\30\u0209\u0213\7L\2\2\u020a\u0213\7"+
		"f\2\2\u020b\u0213\5b\62\2\u020c\u0213\5H%\2\u020d\u0213\5N(\2\u020e\u020f"+
		"\7\b\2\2\u020f\u0210\5\\/\2\u0210\u0211\7\t\2\2\u0211\u0213\3\2\2\2\u0212"+
		"\u01e4\3\2\2\2\u0212\u01f2\3\2\2\2\u0212\u01f7\3\2\2\2\u0212\u01f9\3\2"+
		"\2\2\u0212\u01fb\3\2\2\2\u0212\u01fd\3\2\2\2\u0212\u01ff\3\2\2\2\u0212"+
		"\u0201\3\2\2\2\u0212\u0203\3\2\2\2\u0212\u0205\3\2\2\2\u0212\u0207\3\2"+
		"\2\2\u0212\u0209\3\2\2\2\u0212\u020a\3\2\2\2\u0212\u020b\3\2\2\2\u0212"+
		"\u020c\3\2\2\2\u0212\u020d\3\2\2\2\u0212\u020e\3\2\2\2\u0213\u0257\3\2"+
		"\2\2\u0214\u0215\f\27\2\2\u0215\u0216\t\3\2\2\u0216\u0256\5^\60\30\u0217"+
		"\u0218\f\26\2\2\u0218\u0219\t\4\2\2\u0219\u0256\5^\60\27\u021a\u021b\f"+
		"\25\2\2\u021b\u021c\t\5\2\2\u021c\u0256\5^\60\26\u021d\u021e\f\24\2\2"+
		"\u021e\u021f\t\6\2\2\u021f\u0256\5^\60\25\u0220\u0221\f\23\2\2\u0221\u0222"+
		"\7=\2\2\u0222\u0256\5^\60\24\u0223\u0224\f\22\2\2\u0224\u0225\7R\2\2\u0225"+
		"\u0256\5^\60\23\u0226\u0227\f\21\2\2\u0227\u0228\t\7\2\2\u0228\u0256\5"+
		"^\60\22\u0229\u022a\f\20\2\2\u022a\u022b\7&\2\2\u022b\u0256\5^\60\21\u022c"+
		"\u022d\f\17\2\2\u022d\u022e\7\'\2\2\u022e\u0256\5^\60\20\u022f\u0230\f"+
		"\16\2\2\u0230\u0231\7(\2\2\u0231\u0256\5^\60\17\u0232\u0233\f\r\2\2\u0233"+
		"\u0234\7)\2\2\u0234\u0256\5^\60\16\u0235\u0236\f\f\2\2\u0236\u0237\7*"+
		"\2\2\u0237\u0256\5^\60\r\u0238\u0239\f\13\2\2\u0239\u023a\7\17\2\2\u023a"+
		"\u023b\5^\60\2\u023b\u023c\7\20\2\2\u023c\u023d\5^\60\f\u023d\u0256\3"+
		"\2\2\2\u023e\u023f\f&\2\2\u023f\u0240\7\6\2\2\u0240\u0241\5\\/\2\u0241"+
		"\u0242\7\7\2\2\u0242\u0256\3\2\2\2\u0243\u0244\f%\2\2\u0244\u0245\7\21"+
		"\2\2\u0245\u0256\5f\64\2\u0246\u0247\f$\2\2\u0247\u0256\5X-\2\u0248\u0249"+
		"\f\"\2\2\u0249\u024a\6\60\27\2\u024a\u0256\7\22\2\2\u024b\u024c\f!\2\2"+
		"\u024c\u024d\6\60\31\2\u024d\u0256\7\23\2\2\u024e\u024f\f\n\2\2\u024f"+
		"\u0250\7\16\2\2\u0250\u0256\5\\/\2\u0251\u0252\f\t\2\2\u0252\u0253\5`"+
		"\61\2\u0253\u0254\5\\/\2\u0254\u0256\3\2\2\2\u0255\u0214\3\2\2\2\u0255"+
		"\u0217\3\2\2\2\u0255\u021a\3\2\2\2\u0255\u021d\3\2\2\2\u0255\u0220\3\2"+
		"\2\2\u0255\u0223\3\2\2\2\u0255\u0226\3\2\2\2\u0255\u0229\3\2\2\2\u0255"+
		"\u022c\3\2\2\2\u0255\u022f\3\2\2\2\u0255\u0232\3\2\2\2\u0255\u0235\3\2"+
		"\2\2\u0255\u0238\3\2\2\2\u0255\u023e\3\2\2\2\u0255\u0243\3\2\2\2\u0255"+
		"\u0246\3\2\2\2\u0255\u0248\3\2\2\2\u0255\u024b\3\2\2\2\u0255\u024e\3\2"+
		"\2\2\u0255\u0251\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258_\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\t\b\2\2"+
		"\u025ba\3\2\2\2\u025c\u025f\t\t\2\2\u025d\u025f\5d\63\2\u025e\u025c\3"+
		"\2\2\2\u025e\u025d\3\2\2\2\u025fc\3\2\2\2\u0260\u0261\t\n\2\2\u0261e\3"+
		"\2\2\2\u0262\u0265\7f\2\2\u0263\u0265\5h\65\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0263\3\2\2\2\u0265g\3\2\2\2\u0266\u026a\5j\66\2\u0267\u026a\5l\67\2"+
		"\u0268\u026a\t\13\2\2\u0269\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u0268"+
		"\3\2\2\2\u026ai\3\2\2\2\u026b\u026c\t\f\2\2\u026ck\3\2\2\2\u026d\u026e"+
		"\t\r\2\2\u026em\3\2\2\2\u026f\u0270\68\34\2\u0270\u0271\7f\2\2\u0271\u0272"+
		"\5T+\2\u0272o\3\2\2\2\u0273\u0274\69\35\2\u0274\u0275\7f\2\2\u0275\u0276"+
		"\5T+\2\u0276q\3\2\2\2\u0277\u027c\7\f\2\2\u0278\u027c\7\2\2\3\u0279\u027c"+
		"\6:\36\2\u027a\u027c\6:\37\2\u027b\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027a\3\2\2\2\u027cs\3\2\2\2\u027d\u027e\7\2\2\3"+
		"\u027eu\3\2\2\28w~\u0084\u0088\u00a0\u00a4\u00ab\u00b6\u00bb\u00cb\u00de"+
		"\u00e2\u00e6\u00f0\u00f4\u010a\u010f\u0116\u011d\u012f\u0133\u0135\u013c"+
		"\u0142\u0147\u015f\u016e\u017a\u017e\u0182\u0185\u0188\u018d\u0192\u0197"+
		"\u019d\u01a4\u01a8\u01af\u01c5\u01ca\u01d0\u01d9\u01e1\u01e7\u01eb\u01f5"+
		"\u0212\u0255\u0257\u025e\u0264\u0269\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}