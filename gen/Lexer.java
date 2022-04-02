// Generated from C:/Users/a2sh2/IdeaProjects/Yapis_test/src\Lexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LEFT_OVAL_BRACKET=1, RIGHT_OVAL_BRACKET=2, LEFT_CURLY_BRACKET=3, RIGHT_CURLY_BRACKET=4, 
		DOT=5, BIT_OR=6, SEMICOLON=7, ASSIGN=8, VAR=9, NEW=10, TRY=11, CATCH=12, 
		FINALLY=13, IDENTIFIER=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT_OVAL_BRACKET", "RIGHT_OVAL_BRACKET", "LEFT_CURLY_BRACKET", "RIGHT_CURLY_BRACKET", 
			"DOT", "BIT_OR", "SEMICOLON", "ASSIGN", "VAR", "NEW", "TRY", "CATCH", 
			"FINALLY", "IDENTIFIER", "LetterOrDigit", "Letter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'.'", "'|'", "';'", "'='", "'var'", 
			"'new'", "'try'", "'catch'", "'finally'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_OVAL_BRACKET", "RIGHT_OVAL_BRACKET", "LEFT_CURLY_BRACKET", 
			"RIGHT_CURLY_BRACKET", "DOT", "BIT_OR", "SEMICOLON", "ASSIGN", "VAR", 
			"NEW", "TRY", "CATCH", "FINALLY", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20Z\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17P\n\17\f\17\16\17S\13\17"+
		"\3\20\3\20\5\20W\n\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2\3\2\4\3\2\62;\6\2&&C\\aa"+
		"c|\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'"+
		"\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3\2\2\2\23"+
		"\63\3\2\2\2\25\67\3\2\2\2\27;\3\2\2\2\31?\3\2\2\2\33E\3\2\2\2\35M\3\2"+
		"\2\2\37V\3\2\2\2!X\3\2\2\2#$\7*\2\2$\4\3\2\2\2%&\7+\2\2&\6\3\2\2\2\'("+
		"\7}\2\2(\b\3\2\2\2)*\7\177\2\2*\n\3\2\2\2+,\7\60\2\2,\f\3\2\2\2-.\7~\2"+
		"\2.\16\3\2\2\2/\60\7=\2\2\60\20\3\2\2\2\61\62\7?\2\2\62\22\3\2\2\2\63"+
		"\64\7x\2\2\64\65\7c\2\2\65\66\7t\2\2\66\24\3\2\2\2\678\7p\2\289\7g\2\2"+
		"9:\7y\2\2:\26\3\2\2\2;<\7v\2\2<=\7t\2\2=>\7{\2\2>\30\3\2\2\2?@\7e\2\2"+
		"@A\7c\2\2AB\7v\2\2BC\7e\2\2CD\7j\2\2D\32\3\2\2\2EF\7h\2\2FG\7k\2\2GH\7"+
		"p\2\2HI\7c\2\2IJ\7n\2\2JK\7n\2\2KL\7{\2\2L\34\3\2\2\2MQ\5!\21\2NP\5\37"+
		"\20\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\36\3\2\2\2SQ\3\2\2\2TW"+
		"\5!\21\2UW\t\2\2\2VT\3\2\2\2VU\3\2\2\2W \3\2\2\2XY\t\3\2\2Y\"\3\2\2\2"+
		"\5\2QV\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}