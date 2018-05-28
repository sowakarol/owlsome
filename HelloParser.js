// Generated from .\Hello.g4 by ANTLR 4.7.1
// jshint ignore: start
var antlr4 = require('antlr4/index');
var HelloListener = require('./HelloListener').HelloListener;
var grammarFileName = "Hello.g4";

var serializedATN = ["\u0003\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964",
    "\u0003\u000e[\u0004\u0002\t\u0002\u0004\u0003\t\u0003\u0004\u0004\t",
    "\u0004\u0004\u0005\t\u0005\u0004\u0006\t\u0006\u0004\u0007\t\u0007\u0004",
    "\b\t\b\u0004\t\t\t\u0004\n\t\n\u0004\u000b\t\u000b\u0004\f\t\f\u0004",
    "\r\t\r\u0004\u000e\t\u000e\u0004\u000f\t\u000f\u0003\u0002\u0005\u0002",
    " \n\u0002\u0003\u0002\u0003\u0002\u0003\u0003\u0006\u0003%\n\u0003\r",
    "\u0003\u000e\u0003&\u0003\u0004\u0003\u0004\u0003\u0005\u0003\u0005",
    "\u0005\u0005-\n\u0005\u0003\u0006\u0003\u0006\u0003\u0006\u0005\u0006",
    "2\n\u0006\u0003\u0007\u0003\u0007\u0005\u00076\n\u0007\u0003\u0007\u0003",
    "\u0007\u0003\b\u0006\b;\n\b\r\b\u000e\b<\u0003\t\u0003\t\u0003\t\u0003",
    "\t\u0003\n\u0003\n\u0003\n\u0007\nF\n\n\f\n\u000e\nI\u000b\n\u0003\u000b",
    "\u0003\u000b\u0005\u000bM\n\u000b\u0003\f\u0003\f\u0003\r\u0003\r\u0003",
    "\u000e\u0003\u000e\u0003\u000e\u0003\u000e\u0005\u000eW\n\u000e\u0003",
    "\u000f\u0003\u000f\u0003\u000f\u0002\u0002\u0010\u0002\u0004\u0006\b",
    "\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0002\u0002\u0002",
    "X\u0002\u001f\u0003\u0002\u0002\u0002\u0004$\u0003\u0002\u0002\u0002",
    "\u0006(\u0003\u0002\u0002\u0002\b,\u0003\u0002\u0002\u0002\n1\u0003",
    "\u0002\u0002\u0002\f3\u0003\u0002\u0002\u0002\u000e:\u0003\u0002\u0002",
    "\u0002\u0010>\u0003\u0002\u0002\u0002\u0012B\u0003\u0002\u0002\u0002",
    "\u0014J\u0003\u0002\u0002\u0002\u0016N\u0003\u0002\u0002\u0002\u0018",
    "P\u0003\u0002\u0002\u0002\u001aV\u0003\u0002\u0002\u0002\u001cX\u0003",
    "\u0002\u0002\u0002\u001e \u0005\u0004\u0003\u0002\u001f\u001e\u0003",
    "\u0002\u0002\u0002\u001f \u0003\u0002\u0002\u0002 !\u0003\u0002\u0002",
    "\u0002!\"\u0007\u0002\u0002\u0003\"\u0003\u0003\u0002\u0002\u0002#%",
    "\u0005\u0006\u0004\u0002$#\u0003\u0002\u0002\u0002%&\u0003\u0002\u0002",
    "\u0002&$\u0003\u0002\u0002\u0002&\'\u0003\u0002\u0002\u0002\'\u0005",
    "\u0003\u0002\u0002\u0002()\u0005\b\u0005\u0002)\u0007\u0003\u0002\u0002",
    "\u0002*-\u0005\n\u0006\u0002+-\u0007\u0003\u0002\u0002,*\u0003\u0002",
    "\u0002\u0002,+\u0003\u0002\u0002\u0002-\t\u0003\u0002\u0002\u0002.2",
    "\u0005\f\u0007\u0002/2\u0005\u0010\t\u000202\u0005\u0018\r\u00021.\u0003",
    "\u0002\u0002\u00021/\u0003\u0002\u0002\u000210\u0003\u0002\u0002\u0002",
    "2\u000b\u0003\u0002\u0002\u000235\u0007\u0004\u0002\u000246\u0005\u000e",
    "\b\u000254\u0003\u0002\u0002\u000256\u0003\u0002\u0002\u000267\u0003",
    "\u0002\u0002\u000278\u0007\u0005\u0002\u00028\r\u0003\u0002\u0002\u0002",
    "9;\u0005\n\u0006\u0002:9\u0003\u0002\u0002\u0002;<\u0003\u0002\u0002",
    "\u0002<:\u0003\u0002\u0002\u0002<=\u0003\u0002\u0002\u0002=\u000f\u0003",
    "\u0002\u0002\u0002>?\u0007\r\u0002\u0002?@\u0005\u0012\n\u0002@A\u0005",
    "\u001a\u000e\u0002A\u0011\u0003\u0002\u0002\u0002BG\u0005\u0014\u000b",
    "\u0002CD\u0007\u0006\u0002\u0002DF\u0005\u0014\u000b\u0002EC\u0003\u0002",
    "\u0002\u0002FI\u0003\u0002\u0002\u0002GE\u0003\u0002\u0002\u0002GH\u0003",
    "\u0002\u0002\u0002H\u0013\u0003\u0002\u0002\u0002IG\u0003\u0002\u0002",
    "\u0002JL\u0007\b\u0002\u0002KM\u0005\u0016\f\u0002LK\u0003\u0002\u0002",
    "\u0002LM\u0003\u0002\u0002\u0002M\u0015\u0003\u0002\u0002\u0002NO\u0007",
    "\u0007\u0002\u0002O\u0017\u0003\u0002\u0002\u0002PQ\u0007\u000e\u0002",
    "\u0002Q\u0019\u0003\u0002\u0002\u0002RW\u0007\u000e\u0002\u0002SW\u0007",
    "\u0002\u0002\u0003TW\u0006\u000e\u0002\u0002UW\u0006\u000e\u0003\u0002",
    "VR\u0003\u0002\u0002\u0002VS\u0003\u0002\u0002\u0002VT\u0003\u0002\u0002",
    "\u0002VU\u0003\u0002\u0002\u0002W\u001b\u0003\u0002\u0002\u0002XY\u0007",
    "\u0002\u0002\u0003Y\u001d\u0003\u0002\u0002\u0002\u000b\u001f&,15<G",
    "LV"].join("");


var atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

var decisionsToDFA = atn.decisionToState.map( function(ds, index) { return new antlr4.dfa.DFA(ds, index); });

var sharedContextCache = new antlr4.PredictionContextCache();

var literalNames = [ null, "'function'", "'{'", "'}'", "','", "'= 5'", null, 
                     null, null, null, null, "'var'", "';'" ];

var symbolicNames = [ null, null, null, null, null, null, "Identifier", 
                      "WhiteSpaces", "MultiLineComment", "SingleLineComment", 
                      "LineTerminator", "Var", "SemiColon" ];

var ruleNames =  [ "program", "sourceElements", "sourceElement", "jsstatement", 
                   "statement", "block", "statementList", "variableStatement", 
                   "variableDeclarationList", "variableDeclaration", "initialiser", 
                   "emptyStatement", "eos", "eof" ];

function HelloParser (input) {
	antlr4.Parser.call(this, input);
    this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
    this.ruleNames = ruleNames;
    this.literalNames = literalNames;
    this.symbolicNames = symbolicNames;
    return this;
}

HelloParser.prototype = Object.create(antlr4.Parser.prototype);
HelloParser.prototype.constructor = HelloParser;

Object.defineProperty(HelloParser.prototype, "atn", {
	get : function() {
		return atn;
	}
});

HelloParser.EOF = antlr4.Token.EOF;
HelloParser.T__0 = 1;
HelloParser.T__1 = 2;
HelloParser.T__2 = 3;
HelloParser.T__3 = 4;
HelloParser.T__4 = 5;
HelloParser.Identifier = 6;
HelloParser.WhiteSpaces = 7;
HelloParser.MultiLineComment = 8;
HelloParser.SingleLineComment = 9;
HelloParser.LineTerminator = 10;
HelloParser.Var = 11;
HelloParser.SemiColon = 12;

HelloParser.RULE_program = 0;
HelloParser.RULE_sourceElements = 1;
HelloParser.RULE_sourceElement = 2;
HelloParser.RULE_jsstatement = 3;
HelloParser.RULE_statement = 4;
HelloParser.RULE_block = 5;
HelloParser.RULE_statementList = 6;
HelloParser.RULE_variableStatement = 7;
HelloParser.RULE_variableDeclarationList = 8;
HelloParser.RULE_variableDeclaration = 9;
HelloParser.RULE_initialiser = 10;
HelloParser.RULE_emptyStatement = 11;
HelloParser.RULE_eos = 12;
HelloParser.RULE_eof = 13;

function ProgramContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_program;
    return this;
}

ProgramContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
ProgramContext.prototype.constructor = ProgramContext;

ProgramContext.prototype.EOF = function() {
    return this.getToken(HelloParser.EOF, 0);
};

ProgramContext.prototype.sourceElements = function() {
    return this.getTypedRuleContext(SourceElementsContext,0);
};

ProgramContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterProgram(this);
	}
};

ProgramContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitProgram(this);
	}
};




HelloParser.ProgramContext = ProgramContext;

HelloParser.prototype.program = function() {

    var localctx = new ProgramContext(this, this._ctx, this.state);
    this.enterRule(localctx, 0, HelloParser.RULE_program);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 29;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << HelloParser.T__0) | (1 << HelloParser.T__1) | (1 << HelloParser.Var) | (1 << HelloParser.SemiColon))) !== 0)) {
            this.state = 28;
            this.sourceElements();
        }

        this.state = 31;
        this.match(HelloParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SourceElementsContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_sourceElements;
    return this;
}

SourceElementsContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SourceElementsContext.prototype.constructor = SourceElementsContext;

SourceElementsContext.prototype.sourceElement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(SourceElementContext);
    } else {
        return this.getTypedRuleContext(SourceElementContext,i);
    }
};

SourceElementsContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterSourceElements(this);
	}
};

SourceElementsContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitSourceElements(this);
	}
};




HelloParser.SourceElementsContext = SourceElementsContext;

HelloParser.prototype.sourceElements = function() {

    var localctx = new SourceElementsContext(this, this._ctx, this.state);
    this.enterRule(localctx, 2, HelloParser.RULE_sourceElements);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 34; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 33;
            this.sourceElement();
            this.state = 36; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << HelloParser.T__0) | (1 << HelloParser.T__1) | (1 << HelloParser.Var) | (1 << HelloParser.SemiColon))) !== 0));
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function SourceElementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_sourceElement;
    return this;
}

SourceElementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
SourceElementContext.prototype.constructor = SourceElementContext;

SourceElementContext.prototype.jsstatement = function() {
    return this.getTypedRuleContext(JsstatementContext,0);
};

SourceElementContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterSourceElement(this);
	}
};

SourceElementContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitSourceElement(this);
	}
};




HelloParser.SourceElementContext = SourceElementContext;

HelloParser.prototype.sourceElement = function() {

    var localctx = new SourceElementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 4, HelloParser.RULE_sourceElement);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 38;
        this.jsstatement();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function JsstatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_jsstatement;
    return this;
}

JsstatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
JsstatementContext.prototype.constructor = JsstatementContext;

JsstatementContext.prototype.statement = function() {
    return this.getTypedRuleContext(StatementContext,0);
};

JsstatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterJsstatement(this);
	}
};

JsstatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitJsstatement(this);
	}
};




HelloParser.JsstatementContext = JsstatementContext;

HelloParser.prototype.jsstatement = function() {

    var localctx = new JsstatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 6, HelloParser.RULE_jsstatement);
    try {
        this.state = 42;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case HelloParser.T__1:
        case HelloParser.Var:
        case HelloParser.SemiColon:
            this.enterOuterAlt(localctx, 1);
            this.state = 40;
            this.statement();
            break;
        case HelloParser.T__0:
            this.enterOuterAlt(localctx, 2);
            this.state = 41;
            this.match(HelloParser.T__0);
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_statement;
    return this;
}

StatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatementContext.prototype.constructor = StatementContext;

StatementContext.prototype.block = function() {
    return this.getTypedRuleContext(BlockContext,0);
};

StatementContext.prototype.variableStatement = function() {
    return this.getTypedRuleContext(VariableStatementContext,0);
};

StatementContext.prototype.emptyStatement = function() {
    return this.getTypedRuleContext(EmptyStatementContext,0);
};

StatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterStatement(this);
	}
};

StatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitStatement(this);
	}
};




HelloParser.StatementContext = StatementContext;

HelloParser.prototype.statement = function() {

    var localctx = new StatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 8, HelloParser.RULE_statement);
    try {
        this.state = 47;
        this._errHandler.sync(this);
        switch(this._input.LA(1)) {
        case HelloParser.T__1:
            this.enterOuterAlt(localctx, 1);
            this.state = 44;
            this.block();
            break;
        case HelloParser.Var:
            this.enterOuterAlt(localctx, 2);
            this.state = 45;
            this.variableStatement();
            break;
        case HelloParser.SemiColon:
            this.enterOuterAlt(localctx, 3);
            this.state = 46;
            this.emptyStatement();
            break;
        default:
            throw new antlr4.error.NoViableAltException(this);
        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function BlockContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_block;
    return this;
}

BlockContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
BlockContext.prototype.constructor = BlockContext;

BlockContext.prototype.statementList = function() {
    return this.getTypedRuleContext(StatementListContext,0);
};

BlockContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterBlock(this);
	}
};

BlockContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitBlock(this);
	}
};




HelloParser.BlockContext = BlockContext;

HelloParser.prototype.block = function() {

    var localctx = new BlockContext(this, this._ctx, this.state);
    this.enterRule(localctx, 10, HelloParser.RULE_block);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 49;
        this.match(HelloParser.T__1);
        this.state = 51;
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        if((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << HelloParser.T__1) | (1 << HelloParser.Var) | (1 << HelloParser.SemiColon))) !== 0)) {
            this.state = 50;
            this.statementList();
        }

        this.state = 53;
        this.match(HelloParser.T__2);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function StatementListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_statementList;
    return this;
}

StatementListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
StatementListContext.prototype.constructor = StatementListContext;

StatementListContext.prototype.statement = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(StatementContext);
    } else {
        return this.getTypedRuleContext(StatementContext,i);
    }
};

StatementListContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterStatementList(this);
	}
};

StatementListContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitStatementList(this);
	}
};




HelloParser.StatementListContext = StatementListContext;

HelloParser.prototype.statementList = function() {

    var localctx = new StatementListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 12, HelloParser.RULE_statementList);
    var _la = 0; // Token type
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 56; 
        this._errHandler.sync(this);
        _la = this._input.LA(1);
        do {
            this.state = 55;
            this.statement();
            this.state = 58; 
            this._errHandler.sync(this);
            _la = this._input.LA(1);
        } while((((_la) & ~0x1f) == 0 && ((1 << _la) & ((1 << HelloParser.T__1) | (1 << HelloParser.Var) | (1 << HelloParser.SemiColon))) !== 0));
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function VariableStatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_variableStatement;
    return this;
}

VariableStatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VariableStatementContext.prototype.constructor = VariableStatementContext;

VariableStatementContext.prototype.Var = function() {
    return this.getToken(HelloParser.Var, 0);
};

VariableStatementContext.prototype.variableDeclarationList = function() {
    return this.getTypedRuleContext(VariableDeclarationListContext,0);
};

VariableStatementContext.prototype.eos = function() {
    return this.getTypedRuleContext(EosContext,0);
};

VariableStatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterVariableStatement(this);
	}
};

VariableStatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitVariableStatement(this);
	}
};




HelloParser.VariableStatementContext = VariableStatementContext;

HelloParser.prototype.variableStatement = function() {

    var localctx = new VariableStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 14, HelloParser.RULE_variableStatement);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 60;
        this.match(HelloParser.Var);
        this.state = 61;
        this.variableDeclarationList();
        this.state = 62;
        this.eos();
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function VariableDeclarationListContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_variableDeclarationList;
    return this;
}

VariableDeclarationListContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VariableDeclarationListContext.prototype.constructor = VariableDeclarationListContext;

VariableDeclarationListContext.prototype.variableDeclaration = function(i) {
    if(i===undefined) {
        i = null;
    }
    if(i===null) {
        return this.getTypedRuleContexts(VariableDeclarationContext);
    } else {
        return this.getTypedRuleContext(VariableDeclarationContext,i);
    }
};

VariableDeclarationListContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterVariableDeclarationList(this);
	}
};

VariableDeclarationListContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitVariableDeclarationList(this);
	}
};




HelloParser.VariableDeclarationListContext = VariableDeclarationListContext;

HelloParser.prototype.variableDeclarationList = function() {

    var localctx = new VariableDeclarationListContext(this, this._ctx, this.state);
    this.enterRule(localctx, 16, HelloParser.RULE_variableDeclarationList);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 64;
        this.variableDeclaration();
        this.state = 69;
        this._errHandler.sync(this);
        var _alt = this._interp.adaptivePredict(this._input,6,this._ctx)
        while(_alt!=2 && _alt!=antlr4.atn.ATN.INVALID_ALT_NUMBER) {
            if(_alt===1) {
                this.state = 65;
                this.match(HelloParser.T__3);
                this.state = 66;
                this.variableDeclaration(); 
            }
            this.state = 71;
            this._errHandler.sync(this);
            _alt = this._interp.adaptivePredict(this._input,6,this._ctx);
        }

    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function VariableDeclarationContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_variableDeclaration;
    return this;
}

VariableDeclarationContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
VariableDeclarationContext.prototype.constructor = VariableDeclarationContext;

VariableDeclarationContext.prototype.Identifier = function() {
    return this.getToken(HelloParser.Identifier, 0);
};

VariableDeclarationContext.prototype.initialiser = function() {
    return this.getTypedRuleContext(InitialiserContext,0);
};

VariableDeclarationContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterVariableDeclaration(this);
	}
};

VariableDeclarationContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitVariableDeclaration(this);
	}
};




HelloParser.VariableDeclarationContext = VariableDeclarationContext;

HelloParser.prototype.variableDeclaration = function() {

    var localctx = new VariableDeclarationContext(this, this._ctx, this.state);
    this.enterRule(localctx, 18, HelloParser.RULE_variableDeclaration);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 72;
        this.match(HelloParser.Identifier);
        this.state = 74;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,7,this._ctx);
        if(la_===1) {
            this.state = 73;
            this.initialiser();

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function InitialiserContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_initialiser;
    return this;
}

InitialiserContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
InitialiserContext.prototype.constructor = InitialiserContext;


InitialiserContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterInitialiser(this);
	}
};

InitialiserContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitInitialiser(this);
	}
};




HelloParser.InitialiserContext = InitialiserContext;

HelloParser.prototype.initialiser = function() {

    var localctx = new InitialiserContext(this, this._ctx, this.state);
    this.enterRule(localctx, 20, HelloParser.RULE_initialiser);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 76;
        this.match(HelloParser.T__4);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function EmptyStatementContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_emptyStatement;
    return this;
}

EmptyStatementContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EmptyStatementContext.prototype.constructor = EmptyStatementContext;

EmptyStatementContext.prototype.SemiColon = function() {
    return this.getToken(HelloParser.SemiColon, 0);
};

EmptyStatementContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterEmptyStatement(this);
	}
};

EmptyStatementContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitEmptyStatement(this);
	}
};




HelloParser.EmptyStatementContext = EmptyStatementContext;

HelloParser.prototype.emptyStatement = function() {

    var localctx = new EmptyStatementContext(this, this._ctx, this.state);
    this.enterRule(localctx, 22, HelloParser.RULE_emptyStatement);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 78;
        this.match(HelloParser.SemiColon);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function EosContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_eos;
    return this;
}

EosContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EosContext.prototype.constructor = EosContext;

EosContext.prototype.SemiColon = function() {
    return this.getToken(HelloParser.SemiColon, 0);
};

EosContext.prototype.EOF = function() {
    return this.getToken(HelloParser.EOF, 0);
};

EosContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterEos(this);
	}
};

EosContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitEos(this);
	}
};




HelloParser.EosContext = EosContext;

HelloParser.prototype.eos = function() {

    var localctx = new EosContext(this, this._ctx, this.state);
    this.enterRule(localctx, 24, HelloParser.RULE_eos);
    try {
        this.state = 84;
        this._errHandler.sync(this);
        var la_ = this._interp.adaptivePredict(this._input,8,this._ctx);
        switch(la_) {
        case 1:
            this.enterOuterAlt(localctx, 1);
            this.state = 80;
            this.match(HelloParser.SemiColon);
            break;

        case 2:
            this.enterOuterAlt(localctx, 2);
            this.state = 81;
            this.match(HelloParser.EOF);
            break;

        case 3:
            this.enterOuterAlt(localctx, 3);
            this.state = 82;
            if (!( this.lineTerminatorAhead())) {
                throw new antlr4.error.FailedPredicateException(this, "this.lineTerminatorAhead()");
            }
            break;

        case 4:
            this.enterOuterAlt(localctx, 4);
            this.state = 83;
            if (!( this._input.LT(1).type == ECMAScriptParser.CloseBrace)) {
                throw new antlr4.error.FailedPredicateException(this, "this._input.LT(1).type == ECMAScriptParser.CloseBrace");
            }
            break;

        }
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};

function EofContext(parser, parent, invokingState) {
	if(parent===undefined) {
	    parent = null;
	}
	if(invokingState===undefined || invokingState===null) {
		invokingState = -1;
	}
	antlr4.ParserRuleContext.call(this, parent, invokingState);
    this.parser = parser;
    this.ruleIndex = HelloParser.RULE_eof;
    return this;
}

EofContext.prototype = Object.create(antlr4.ParserRuleContext.prototype);
EofContext.prototype.constructor = EofContext;

EofContext.prototype.EOF = function() {
    return this.getToken(HelloParser.EOF, 0);
};

EofContext.prototype.enterRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.enterEof(this);
	}
};

EofContext.prototype.exitRule = function(listener) {
    if(listener instanceof HelloListener ) {
        listener.exitEof(this);
	}
};




HelloParser.EofContext = EofContext;

HelloParser.prototype.eof = function() {

    var localctx = new EofContext(this, this._ctx, this.state);
    this.enterRule(localctx, 26, HelloParser.RULE_eof);
    try {
        this.enterOuterAlt(localctx, 1);
        this.state = 86;
        this.match(HelloParser.EOF);
    } catch (re) {
    	if(re instanceof antlr4.error.RecognitionException) {
	        localctx.exception = re;
	        this._errHandler.reportError(this, re);
	        this._errHandler.recover(this, re);
	    } else {
	    	throw re;
	    }
    } finally {
        this.exitRule();
    }
    return localctx;
};


HelloParser.prototype.sempred = function(localctx, ruleIndex, predIndex) {
	switch(ruleIndex) {
	case 12:
			return this.eos_sempred(localctx, predIndex);
    default:
        throw "No predicate with index:" + ruleIndex;
   }
};

HelloParser.prototype.eos_sempred = function(localctx, predIndex) {
	switch(predIndex) {
		case 0:
			return this.lineTerminatorAhead();
		case 1:
			return this._input.LT(1).type == ECMAScriptParser.CloseBrace;
		default:
			throw "No predicate with index:" + predIndex;
	}
};


exports.HelloParser = HelloParser;
