// Generated from c:\Users\karl\Documents\antlr4\Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Identifier=6, WhiteSpaces=7, MultiLineComment=8, 
		SingleLineComment=9, LineTerminator=10, Var=11, SemiColon=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "Identifier", "IdentifierStart", 
		"IdentifierPart", "WhiteSpaces", "MultiLineComment", "SingleLineComment", 
		"LineTerminator", "Var", "SemiColon"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'function'", "'{'", "'}'", "','", "'= 5'", null, null, null, null, 
		null, "'var'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "Identifier", "WhiteSpaces", "MultiLineComment", 
		"SingleLineComment", "LineTerminator", "Var", "SemiColon"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7\65\n\7\f\7"+
		"\16\78\13\7\3\b\5\b;\n\b\3\t\3\t\5\t?\n\t\3\n\6\nB\n\n\r\n\16\nC\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\7\fZ\n\f\f\f\16\f]\13\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3M\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21"+
		"\2\23\t\25\n\27\13\31\f\33\r\35\16\3\2\6\5\2&&aac|\3\2\62;\6\2\13\13\r"+
		"\16\"\"\u00a2\u00a2\5\2\f\f\17\17\u202a\u202b\2l\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2"+
		"\2\2\5(\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\62\3\2\2\2\17:\3\2"+
		"\2\2\21>\3\2\2\2\23A\3\2\2\2\25G\3\2\2\2\27U\3\2\2\2\31`\3\2\2\2\33d\3"+
		"\2\2\2\35h\3\2\2\2\37 \7h\2\2 !\7w\2\2!\"\7p\2\2\"#\7e\2\2#$\7v\2\2$%"+
		"\7k\2\2%&\7q\2\2&\'\7p\2\2\'\4\3\2\2\2()\7}\2\2)\6\3\2\2\2*+\7\177\2\2"+
		"+\b\3\2\2\2,-\7.\2\2-\n\3\2\2\2./\7?\2\2/\60\7\"\2\2\60\61\7\67\2\2\61"+
		"\f\3\2\2\2\62\66\5\17\b\2\63\65\5\21\t\2\64\63\3\2\2\2\658\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\67\16\3\2\2\28\66\3\2\2\29;\t\2\2\2:9\3\2\2"+
		"\2;\20\3\2\2\2<?\5\17\b\2=?\t\3\2\2><\3\2\2\2>=\3\2\2\2?\22\3\2\2\2@B"+
		"\t\4\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\b\n\2\2F"+
		"\24\3\2\2\2GH\7\61\2\2HI\7,\2\2IM\3\2\2\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2"+
		"\2MN\3\2\2\2MK\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7,\2\2QR\7\61\2\2RS\3\2\2"+
		"\2ST\b\13\2\2T\26\3\2\2\2UV\7\61\2\2VW\7\61\2\2W[\3\2\2\2XZ\n\5\2\2YX"+
		"\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\b\f\2\2"+
		"_\30\3\2\2\2`a\t\5\2\2ab\3\2\2\2bc\b\r\2\2c\32\3\2\2\2de\7x\2\2ef\7c\2"+
		"\2fg\7t\2\2g\34\3\2\2\2hi\7=\2\2i\36\3\2\2\2\t\2\66:>CM[\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}