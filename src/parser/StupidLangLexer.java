// Generated from java-escape by ANTLR 4.11.1
package parser;

    import main.rules.Symbol;
    import main.rules.SymbolTable;
    import main.rules.Variable;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class StupidLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, VIRGULA=7, AP=8, FP=9, 
		SC=10, OP=11, ATTR=12, VALOR=13, ID=14, NUMBER=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "VIRGULA", "AP", "FP", 
			"SC", "OP", "ATTR", "VALOR", "ID", "NUMBER", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio:'", "'fim;'", "'leia'", "'escreva'", "'numero'", "'texto'", 
			"','", "'('", "')'", "';'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "VIRGULA", "AP", "FP", "SC", 
			"OP", "ATTR", "VALOR", "ID", "NUMBER", "WHITESPACE"
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


	    private int _tipo;
	    private String _varName;
	    private String _varValue;
	    private Symbol symbol;
	    private SymbolTable symbolTable = new SymbolTable();


	public StupidLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StupidLang.g4"; }

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
		"\u0004\u0000\u0010n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fW\b\f\n\f\f\f"+
		"Z\t\f\u0001\r\u0001\r\u0001\u000e\u0004\u000e_\b\u000e\u000b\u000e\f\u000e"+
		"`\u0001\u000e\u0001\u000e\u0004\u000ee\b\u000e\u000b\u000e\f\u000ef\u0003"+
		"\u000ei\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0003\u0000*+--//\u0001"+
		"\u0000az\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  q\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005.\u0001\u0000\u0000"+
		"\u0000\u00073\u0001\u0000\u0000\u0000\t;\u0001\u0000\u0000\u0000\u000b"+
		"B\u0001\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000"+
		"\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013N\u0001\u0000\u0000\u0000"+
		"\u0015P\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019T"+
		"\u0001\u0000\u0000\u0000\u001b[\u0001\u0000\u0000\u0000\u001d^\u0001\u0000"+
		"\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!\"\u0005i\u0000\u0000\"#\u0005"+
		"n\u0000\u0000#$\u0005i\u0000\u0000$%\u0005c\u0000\u0000%&\u0005i\u0000"+
		"\u0000&\'\u0005o\u0000\u0000\'(\u0005:\u0000\u0000(\u0002\u0001\u0000"+
		"\u0000\u0000)*\u0005f\u0000\u0000*+\u0005i\u0000\u0000+,\u0005m\u0000"+
		"\u0000,-\u0005;\u0000\u0000-\u0004\u0001\u0000\u0000\u0000./\u0005l\u0000"+
		"\u0000/0\u0005e\u0000\u000001\u0005i\u0000\u000012\u0005a\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000034\u0005e\u0000\u000045\u0005s\u0000\u0000"+
		"56\u0005c\u0000\u000067\u0005r\u0000\u000078\u0005e\u0000\u000089\u0005"+
		"v\u0000\u00009:\u0005a\u0000\u0000:\b\u0001\u0000\u0000\u0000;<\u0005"+
		"n\u0000\u0000<=\u0005u\u0000\u0000=>\u0005m\u0000\u0000>?\u0005e\u0000"+
		"\u0000?@\u0005r\u0000\u0000@A\u0005o\u0000\u0000A\n\u0001\u0000\u0000"+
		"\u0000BC\u0005t\u0000\u0000CD\u0005e\u0000\u0000DE\u0005x\u0000\u0000"+
		"EF\u0005t\u0000\u0000FG\u0005o\u0000\u0000G\f\u0001\u0000\u0000\u0000"+
		"HI\u0005,\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005(\u0000\u0000"+
		"K\u0010\u0001\u0000\u0000\u0000LM\u0005)\u0000\u0000M\u0012\u0001\u0000"+
		"\u0000\u0000NO\u0005;\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0007"+
		"\u0000\u0000\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005=\u0000\u0000"+
		"S\u0018\u0001\u0000\u0000\u0000TX\u0007\u0001\u0000\u0000UW\u0007\u0002"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\u001a\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[\\\u0003\u0019\f\u0000\\\u001c\u0001"+
		"\u0000\u0000\u0000]_\u0007\u0003\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ah\u0001\u0000\u0000\u0000bd\u0005.\u0000\u0000ce\u0007\u0003\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hb\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u001e\u0001\u0000\u0000"+
		"\u0000jk\u0007\u0004\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0006\u000f"+
		"\u0000\u0000m \u0001\u0000\u0000\u0000\u0006\u0000VX`fh\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}