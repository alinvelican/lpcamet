// Generated from C:/Users/alin/IdeaProjects/tema1.2/src/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
    public static final int
            ERROR = 1, CLASS = 2, INHERITS = 3, FIRSTEVAL = 4, NEW = 5, IF = 6, THEN = 7, ELSE = 8,
            FI = 9, BOOL = 10, WHILE = 11, LOOP = 12, POOL = 13, LET = 14, IN = 15, ID = 16, PV = 17,
            INT = 18, AS = 19, AD = 20, DP = 21, ATRIBUIRE = 22, PS = 23, PD = 24, VIRGULA = 25, STRING = 26,
            ARITMETIC = 27, PUNCT = 28, AT = 29, INEGALITATI = 30, WS = 31, NEWLINE = 32;
    public static final int
            RULE_program = 0, RULE_stat = 1, RULE_decclass = 2, RULE_decvar = 3, RULE_decfunctie = 4,
            RULE_asigvar = 5, RULE_funccall = 6, RULE_objectfunccall = 7, RULE_ifthenelse = 8,
            RULE_whileloop = 9, RULE_letstat = 10, RULE_expresie = 11, RULE_header = 12,
            RULE_body = 13, RULE_expresi = 14, RULE_decvars = 15, RULE_newobject = 16,
            RULE_dispatch = 17;
    public static final String[] ruleNames = {
            "program", "stat", "decclass", "decvar", "decfunctie", "asigvar", "funccall",
            "objectfunccall", "ifthenelse", "whileloop", "letstat", "expresie", "header",
            "body", "expresi", "decvars", "newobject", "dispatch"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00ca\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\3\2\3\2\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\3\3\5\38\n\3\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5\3\5" +
                    "\3\5\3\5\5\5H\n\5\7\5J\n\5\f\5\16\5M\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7" +
                    "\7\7V\n\7\f\7\16\7Y\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3" +
                    "\f\3\f\3\f\5\fy\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5" +
                    "\r\u0087\n\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r\3\16\3\16\3" +
                    "\16\7\16\u0094\n\16\f\16\16\16\u0097\13\16\3\16\3\16\3\16\3\16\3\17\3" +
                    "\17\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16\17\u00a5\13\17\5\17\u00a7\n" +
                    "\17\3\17\3\17\3\20\3\20\3\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13\20\3" +
                    "\21\3\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21\3\22\3\22\3\22\3" +
                    "\23\3\23\5\23\u00c0\n\23\3\23\3\23\3\23\3\23\6\23\u00c6\n\23\r\23\16\23" +
                    "\u00c7\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4" +
                    "\2\35\35  \2\u00d4\2)\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bA\3\2\2\2\nN\3" +
                    "\2\2\2\fQ\3\2\2\2\16\\\3\2\2\2\20a\3\2\2\2\22e\3\2\2\2\24m\3\2\2\2\26" +
                    "s\3\2\2\2\30\u0086\3\2\2\2\32\u0090\3\2\2\2\34\u009c\3\2\2\2\36\u00aa" +
                    "\3\2\2\2 \u00b2\3\2\2\2\"\u00ba\3\2\2\2$\u00bf\3\2\2\2&\'\5\4\3\2\'(\7" +
                    "\23\2\2(*\3\2\2\2)&\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-" +
                    "8\5\6\4\2.8\5\b\5\2/8\5\n\6\2\608\5\f\7\2\618\5\30\r\2\628\5\16\b\2\63" +
                    "8\5\20\t\2\648\5\22\n\2\658\5\24\13\2\668\5\26\f\2\67-\3\2\2\2\67.\3\2" +
                    "\2\2\67/\3\2\2\2\67\60\3\2\2\2\67\61\3\2\2\2\67\62\3\2\2\2\67\63\3\2\2" +
                    "\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\28\5\3\2\2\29:\7\4\2\2:=\7" +
                    "\22\2\2;<\7\5\2\2<>\7\22\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\34\17\2" +
                    "@\7\3\2\2\2AB\7\22\2\2BC\7\27\2\2CK\7\22\2\2DG\7\30\2\2EH\5\30\r\2FH\7" +
                    "\34\2\2GE\3\2\2\2GF\3\2\2\2HJ\3\2\2\2ID\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL" +
                    "\3\2\2\2L\t\3\2\2\2MK\3\2\2\2NO\5\32\16\2OP\5\34\17\2P\13\3\2\2\2QR\7" +
                    "\22\2\2RW\7\30\2\2ST\7\22\2\2TV\7\30\2\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2" +
                    "WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\5\30\r\2[\r\3\2\2\2\\]\7\22\2\2]^\7\31" +
                    "\2\2^_\5\36\20\2_`\7\32\2\2`\17\3\2\2\2ab\7\22\2\2bc\7\36\2\2cd\5\16\b" +
                    "\2d\21\3\2\2\2ef\7\b\2\2fg\5\30\r\2gh\7\t\2\2hi\5\4\3\2ij\7\n\2\2jk\5" +
                    "\4\3\2kl\7\13\2\2l\23\3\2\2\2mn\7\r\2\2no\5\30\r\2op\7\16\2\2pq\5\4\3" +
                    "\2qr\7\17\2\2r\25\3\2\2\2st\7\20\2\2tu\5 \21\2ux\7\21\2\2vy\5\30\r\2w" +
                    "y\5\34\17\2xv\3\2\2\2xw\3\2\2\2y\27\3\2\2\2z{\b\r\1\2{|\7\6\2\2|\u0087" +
                    "\5\30\r\t}\u0087\7\24\2\2~\u0087\7\f\2\2\177\u0087\5\"\22\2\u0080\u0087" +
                    "\5$\23\2\u0081\u0087\7\22\2\2\u0082\u0083\7\31\2\2\u0083\u0084\5\30\r" +
                    "\2\u0084\u0085\7\32\2\2\u0085\u0087\3\2\2\2\u0086z\3\2\2\2\u0086}\3\2" +
                    "\2\2\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0081" +
                    "\3\2\2\2\u0086\u0082\3\2\2\2\u0087\u008d\3\2\2\2\u0088\u0089\f\n\2\2\u0089" +
                    "\u008a\t\2\2\2\u008a\u008c\5\30\r\13\u008b\u0088\3\2\2\2\u008c\u008f\3" +
                    "\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\31\3\2\2\2\u008f" +
                    "\u008d\3\2\2\2\u0090\u0091\7\22\2\2\u0091\u0095\7\31\2\2\u0092\u0094\5" +
                    " \21\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095" +
                    "\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\32" +
                    "\2\2\u0099\u009a\7\27\2\2\u009a\u009b\7\22\2\2\u009b\33\3\2\2\2\u009c" +
                    "\u00a6\7\25\2\2\u009d\u00a7\5\4\3\2\u009e\u009f\5\4\3\2\u009f\u00a0\7" +
                    "\23\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3" +
                    "\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2" +
                    "\2\2\u00a6\u009d\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8" +
                    "\u00a9\7\26\2\2\u00a9\35\3\2\2\2\u00aa\u00af\5\30\r\2\u00ab\u00ac\7\33" +
                    "\2\2\u00ac\u00ae\5\30\r\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af" +
                    "\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\37\3\2\2\2\u00b1\u00af\3\2\2" +
                    "\2\u00b2\u00b7\5\b\5\2\u00b3\u00b4\7\33\2\2\u00b4\u00b6\5\b\5\2\u00b5" +
                    "\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2" +
                    "\2\2\u00b8!\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc" +
                    "\7\22\2\2\u00bc#\3\2\2\2\u00bd\u00c0\7\22\2\2\u00be\u00c0\5\"\22\2\u00bf" +
                    "\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\37" +
                    "\2\2\u00c2\u00c5\7\22\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c6\5\16\b\2\u00c5" +
                    "\u00c3\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2" +
                    "\2\2\u00c8%\3\2\2\2\22+\67=GKWx\u0086\u008d\u0095\u00a3\u00a6\u00af\u00b7" +
                    "\u00bf\u00c7";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, null, "'class'", "'inherits'", null, "'new'", "'if'", "'then'",
            "'else'", "'fi'", null, "'while'", "'loop'", "'pool'", "'let'", "'in'",
            null, "';'", null, "'{'", "'}'", "':'", "'<-'", "'('", "')'", "','", null,
            null, "'.'", "'@'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ERROR", "CLASS", "INHERITS", "FIRSTEVAL", "NEW", "IF", "THEN",
            "ELSE", "FI", "BOOL", "WHILE", "LOOP", "POOL", "LET", "IN", "ID", "PV",
            "INT", "AS", "AD", "DP", "ATRIBUIRE", "PS", "PD", "VIRGULA", "STRING",
            "ARITMETIC", "PUNCT", "AT", "INEGALITATI", "WS", "NEWLINE"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public CoolParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String getGrammarFileName() {
        return "CoolParser.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(39);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(36);
                            stat();
                            setState(37);
                            match(PV);
                        }
                    }
                    setState(41);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FIRSTEVAL) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << PS))) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatContext stat() throws RecognitionException {
        StatContext _localctx = new StatContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_stat);
        try {
            setState(53);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(43);
                    decclass();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(44);
                    decvar();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(45);
                    decfunctie();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(46);
                    asigvar();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(47);
                    expresie(0);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(48);
                    funccall();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(49);
                    objectfunccall();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(50);
                    ifthenelse();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(51);
                    whileloop();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(52);
                    letstat();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DecclassContext decclass() throws RecognitionException {
        DecclassContext _localctx = new DecclassContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_decclass);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(55);
                match(CLASS);
                setState(56);
                match(ID);
                setState(59);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INHERITS) {
                    {
                        setState(57);
                        match(INHERITS);
                        setState(58);
                        match(ID);
                    }
                }

                setState(61);
                body();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DecvarContext decvar() throws RecognitionException {
        DecvarContext _localctx = new DecvarContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_decvar);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(63);
                match(ID);
                setState(64);
                match(DP);
                setState(65);
                match(ID);
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ATRIBUIRE) {
                    {
                        {
                            setState(66);
                            match(ATRIBUIRE);
                            setState(69);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case FIRSTEVAL:
                                case NEW:
                                case BOOL:
                                case ID:
                                case INT:
                                case PS: {
                                    setState(67);
                                    expresie(0);
                                }
                                break;
                                case STRING: {
                                    setState(68);
                                    match(STRING);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }
                    setState(75);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DecfunctieContext decfunctie() throws RecognitionException {
        DecfunctieContext _localctx = new DecfunctieContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_decfunctie);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(76);
                header();
                setState(77);
                body();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AsigvarContext asigvar() throws RecognitionException {
        AsigvarContext _localctx = new AsigvarContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_asigvar);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(79);
                match(ID);
                setState(80);
                match(ATRIBUIRE);
                setState(85);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(81);
                                match(ID);
                                setState(82);
                                match(ATRIBUIRE);
                            }
                        }
                    }
                    setState(87);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
                setState(88);
                expresie(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FunccallContext funccall() throws RecognitionException {
        FunccallContext _localctx = new FunccallContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_funccall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(90);
                match(ID);
                setState(91);
                match(PS);
                setState(92);
                expresi();
                setState(93);
                match(PD);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ObjectfunccallContext objectfunccall() throws RecognitionException {
        ObjectfunccallContext _localctx = new ObjectfunccallContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_objectfunccall);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(95);
                match(ID);
                setState(96);
                match(PUNCT);
                setState(97);
                funccall();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final IfthenelseContext ifthenelse() throws RecognitionException {
        IfthenelseContext _localctx = new IfthenelseContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_ifthenelse);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                match(IF);
                setState(100);
                expresie(0);
                setState(101);
                match(THEN);
                setState(102);
                stat();
                setState(103);
                match(ELSE);
                setState(104);
                stat();
                setState(105);
                match(FI);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final WhileloopContext whileloop() throws RecognitionException {
        WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_whileloop);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                match(WHILE);
                setState(108);
                expresie(0);
                setState(109);
                match(LOOP);
                setState(110);
                stat();
                setState(111);
                match(POOL);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LetstatContext letstat() throws RecognitionException {
        LetstatContext _localctx = new LetstatContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_letstat);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(113);
                match(LET);
                setState(114);
                decvars();
                setState(115);
                match(IN);
                setState(118);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case FIRSTEVAL:
                    case NEW:
                    case BOOL:
                    case ID:
                    case INT:
                    case PS: {
                        setState(116);
                        expresie(0);
                    }
                    break;
                    case AS: {
                        setState(117);
                        body();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpresieContext expresie() throws RecognitionException {
        return expresie(0);
    }

    private ExpresieContext expresie(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpresieContext _localctx = new ExpresieContext(_ctx, _parentState);
        ExpresieContext _prevctx = _localctx;
        int _startState = 22;
        enterRecursionRule(_localctx, 22, RULE_expresie, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(132);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                    case 1: {
                        setState(121);
                        match(FIRSTEVAL);
                        setState(122);
                        expresie(7);
                    }
                    break;
                    case 2: {
                        setState(123);
                        match(INT);
                    }
                    break;
                    case 3: {
                        setState(124);
                        match(BOOL);
                    }
                    break;
                    case 4: {
                        setState(125);
                        newobject();
                    }
                    break;
                    case 5: {
                        setState(126);
                        dispatch();
                    }
                    break;
                    case 6: {
                        setState(127);
                        match(ID);
                    }
                    break;
                    case 7: {
                        setState(128);
                        match(PS);
                        setState(129);
                        expresie(0);
                        setState(130);
                        match(PD);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(139);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ExpresieContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expresie);
                                setState(134);
                                if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                setState(135);
                                _la = _input.LA(1);
                                if (!(_la == ARITMETIC || _la == INEGALITATI)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(136);
                                expresie(9);
                            }
                        }
                    }
                    setState(141);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_header);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                match(ID);
                setState(143);
                match(PS);
                setState(147);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(144);
                            decvars();
                        }
                    }
                    setState(149);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(150);
                match(PD);
                setState(151);
                match(DP);
                setState(152);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final BodyContext body() throws RecognitionException {
        BodyContext _localctx = new BodyContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_body);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(154);
                match(AS);
                setState(164);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        setState(155);
                        stat();
                    }
                    break;
                    case 2: {
                        setState(161);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << FIRSTEVAL) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << ID) | (1L << INT) | (1L << PS))) != 0)) {
                            {
                                {
                                    setState(156);
                                    stat();
                                    setState(157);
                                    match(PV);
                                }
                            }
                            setState(163);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                }
                setState(166);
                match(AD);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExpresiContext expresi() throws RecognitionException {
        ExpresiContext _localctx = new ExpresiContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_expresi);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(168);
                expresie(0);
                setState(173);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VIRGULA) {
                    {
                        {
                            setState(169);
                            match(VIRGULA);
                            setState(170);
                            expresie(0);
                        }
                    }
                    setState(175);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DecvarsContext decvars() throws RecognitionException {
        DecvarsContext _localctx = new DecvarsContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_decvars);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(176);
                decvar();
                setState(181);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == VIRGULA) {
                    {
                        {
                            setState(177);
                            match(VIRGULA);
                            setState(178);
                            decvar();
                        }
                    }
                    setState(183);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final NewobjectContext newobject() throws RecognitionException {
        NewobjectContext _localctx = new NewobjectContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_newobject);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(184);
                match(NEW);
                setState(185);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final DispatchContext dispatch() throws RecognitionException {
        DispatchContext _localctx = new DispatchContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_dispatch);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(189);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ID: {
                        setState(187);
                        match(ID);
                    }
                    break;
                    case NEW: {
                        setState(188);
                        newobject();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(191);
                match(AT);
                setState(192);
                match(ID);
                setState(195);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            {
                                setState(193);
                                match(PUNCT);
                                setState(194);
                                funccall();
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(197);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 15, _ctx);
                } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 11:
                return expresie_sempred((ExpresieContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expresie_sempred(ExpresieContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 8);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public List<TerminalNode> PV() {
            return getTokens(CoolParser.PV);
        }

        public TerminalNode PV(int i) {
            return getToken(CoolParser.PV, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitProgram(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitProgram(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatContext extends ParserRuleContext {
        public StatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public DecclassContext decclass() {
            return getRuleContext(DecclassContext.class, 0);
        }

        public DecvarContext decvar() {
            return getRuleContext(DecvarContext.class, 0);
        }

        public DecfunctieContext decfunctie() {
            return getRuleContext(DecfunctieContext.class, 0);
        }

        public AsigvarContext asigvar() {
            return getRuleContext(AsigvarContext.class, 0);
        }

        public ExpresieContext expresie() {
            return getRuleContext(ExpresieContext.class, 0);
        }

        public FunccallContext funccall() {
            return getRuleContext(FunccallContext.class, 0);
        }

        public ObjectfunccallContext objectfunccall() {
            return getRuleContext(ObjectfunccallContext.class, 0);
        }

        public IfthenelseContext ifthenelse() {
            return getRuleContext(IfthenelseContext.class, 0);
        }

        public WhileloopContext whileloop() {
            return getRuleContext(WhileloopContext.class, 0);
        }

        public LetstatContext letstat() {
            return getRuleContext(LetstatContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_stat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterStat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitStat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitStat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecclassContext extends ParserRuleContext {
        public DecclassContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLASS() {
            return getToken(CoolParser.CLASS, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(CoolParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CoolParser.ID, i);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        public TerminalNode INHERITS() {
            return getToken(CoolParser.INHERITS, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decclass;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDecclass(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDecclass(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitDecclass(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecvarContext extends ParserRuleContext {
        public DecvarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(CoolParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CoolParser.ID, i);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public List<TerminalNode> ATRIBUIRE() {
            return getTokens(CoolParser.ATRIBUIRE);
        }

        public TerminalNode ATRIBUIRE(int i) {
            return getToken(CoolParser.ATRIBUIRE, i);
        }

        public List<ExpresieContext> expresie() {
            return getRuleContexts(ExpresieContext.class);
        }

        public ExpresieContext expresie(int i) {
            return getRuleContext(ExpresieContext.class, i);
        }

        public List<TerminalNode> STRING() {
            return getTokens(CoolParser.STRING);
        }

        public TerminalNode STRING(int i) {
            return getToken(CoolParser.STRING, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decvar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDecvar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDecvar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitDecvar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecfunctieContext extends ParserRuleContext {
        public DecfunctieContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public HeaderContext header() {
            return getRuleContext(HeaderContext.class, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decfunctie;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDecfunctie(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDecfunctie(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitDecfunctie(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AsigvarContext extends ParserRuleContext {
        public AsigvarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(CoolParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CoolParser.ID, i);
        }

        public List<TerminalNode> ATRIBUIRE() {
            return getTokens(CoolParser.ATRIBUIRE);
        }

        public TerminalNode ATRIBUIRE(int i) {
            return getToken(CoolParser.ATRIBUIRE, i);
        }

        public ExpresieContext expresie() {
            return getRuleContext(ExpresieContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_asigvar;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterAsigvar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitAsigvar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitAsigvar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunccallContext extends ParserRuleContext {
        public FunccallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode PS() {
            return getToken(CoolParser.PS, 0);
        }

        public ExpresiContext expresi() {
            return getRuleContext(ExpresiContext.class, 0);
        }

        public TerminalNode PD() {
            return getToken(CoolParser.PD, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funccall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFunccall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFunccall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitFunccall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjectfunccallContext extends ParserRuleContext {
        public ObjectfunccallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode PUNCT() {
            return getToken(CoolParser.PUNCT, 0);
        }

        public FunccallContext funccall() {
            return getRuleContext(FunccallContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_objectfunccall;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterObjectfunccall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitObjectfunccall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitObjectfunccall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfthenelseContext extends ParserRuleContext {
        public IfthenelseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode IF() {
            return getToken(CoolParser.IF, 0);
        }

        public ExpresieContext expresie() {
            return getRuleContext(ExpresieContext.class, 0);
        }

        public TerminalNode THEN() {
            return getToken(CoolParser.THEN, 0);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public TerminalNode ELSE() {
            return getToken(CoolParser.ELSE, 0);
        }

        public TerminalNode FI() {
            return getToken(CoolParser.FI, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifthenelse;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterIfthenelse(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitIfthenelse(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitIfthenelse(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileloopContext extends ParserRuleContext {
        public WhileloopContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode WHILE() {
            return getToken(CoolParser.WHILE, 0);
        }

        public ExpresieContext expresie() {
            return getRuleContext(ExpresieContext.class, 0);
        }

        public TerminalNode LOOP() {
            return getToken(CoolParser.LOOP, 0);
        }

        public StatContext stat() {
            return getRuleContext(StatContext.class, 0);
        }

        public TerminalNode POOL() {
            return getToken(CoolParser.POOL, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileloop;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterWhileloop(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitWhileloop(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitWhileloop(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LetstatContext extends ParserRuleContext {
        public LetstatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode LET() {
            return getToken(CoolParser.LET, 0);
        }

        public DecvarsContext decvars() {
            return getRuleContext(DecvarsContext.class, 0);
        }

        public TerminalNode IN() {
            return getToken(CoolParser.IN, 0);
        }

        public ExpresieContext expresie() {
            return getRuleContext(ExpresieContext.class, 0);
        }

        public BodyContext body() {
            return getRuleContext(BodyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_letstat;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterLetstat(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitLetstat(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitLetstat(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpresieContext extends ParserRuleContext {
        public ExpresieContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode FIRSTEVAL() {
            return getToken(CoolParser.FIRSTEVAL, 0);
        }

        public List<ExpresieContext> expresie() {
            return getRuleContexts(ExpresieContext.class);
        }

        public ExpresieContext expresie(int i) {
            return getRuleContext(ExpresieContext.class, i);
        }

        public TerminalNode INT() {
            return getToken(CoolParser.INT, 0);
        }

        public TerminalNode BOOL() {
            return getToken(CoolParser.BOOL, 0);
        }

        public NewobjectContext newobject() {
            return getRuleContext(NewobjectContext.class, 0);
        }

        public DispatchContext dispatch() {
            return getRuleContext(DispatchContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode ARITMETIC() {
            return getToken(CoolParser.ARITMETIC, 0);
        }

        public TerminalNode INEGALITATI() {
            return getToken(CoolParser.INEGALITATI, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expresie;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterExpresie(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitExpresie(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitExpresie(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class HeaderContext extends ParserRuleContext {
        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(CoolParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CoolParser.ID, i);
        }

        public TerminalNode PS() {
            return getToken(CoolParser.PS, 0);
        }

        public TerminalNode PD() {
            return getToken(CoolParser.PD, 0);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public List<DecvarsContext> decvars() {
            return getRuleContexts(DecvarsContext.class);
        }

        public DecvarsContext decvars(int i) {
            return getRuleContext(DecvarsContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_header;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BodyContext extends ParserRuleContext {
        public BodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AS() {
            return getToken(CoolParser.AS, 0);
        }

        public TerminalNode AD() {
            return getToken(CoolParser.AD, 0);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        public List<TerminalNode> PV() {
            return getTokens(CoolParser.PV);
        }

        public TerminalNode PV(int i) {
            return getToken(CoolParser.PV, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterBody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitBody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitBody(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpresiContext extends ParserRuleContext {
        public ExpresiContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExpresieContext> expresie() {
            return getRuleContexts(ExpresieContext.class);
        }

        public ExpresieContext expresie(int i) {
            return getRuleContext(ExpresieContext.class, i);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expresi;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterExpresi(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitExpresi(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitExpresi(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DecvarsContext extends ParserRuleContext {
        public DecvarsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<DecvarContext> decvar() {
            return getRuleContexts(DecvarContext.class);
        }

        public DecvarContext decvar(int i) {
            return getRuleContext(DecvarContext.class, i);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_decvars;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDecvars(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDecvars(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitDecvars(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NewobjectContext extends ParserRuleContext {
        public NewobjectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NEW() {
            return getToken(CoolParser.NEW, 0);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_newobject;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterNewobject(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitNewobject(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitNewobject(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DispatchContext extends ParserRuleContext {
        public DispatchContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode AT() {
            return getToken(CoolParser.AT, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(CoolParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(CoolParser.ID, i);
        }

        public NewobjectContext newobject() {
            return getRuleContext(NewobjectContext.class, 0);
        }

        public List<TerminalNode> PUNCT() {
            return getTokens(CoolParser.PUNCT);
        }

        public TerminalNode PUNCT(int i) {
            return getToken(CoolParser.PUNCT, i);
        }

        public List<FunccallContext> funccall() {
            return getRuleContexts(FunccallContext.class);
        }

        public FunccallContext funccall(int i) {
            return getRuleContext(FunccallContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dispatch;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterDispatch(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitDispatch(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitDispatch(this);
            else return visitor.visitChildren(this);
        }
    }
}