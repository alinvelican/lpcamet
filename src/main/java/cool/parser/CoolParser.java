// Generated from C:/Users/alin/IdeaProjects/lpcamet/src/main/java/cool/parser\CoolParser.g4 by ANTLR 4.7
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
            ERROR = 1, CLASS = 2, INHERITS = 3, NOT = 4, TIL = 5, ISVOID = 6, NEW = 7, IF = 8, THEN = 9,
            ELSE = 10, FI = 11, BOOL = 12, WHILE = 13, LOOP = 14, POOL = 15, LET = 16, IN = 17, CASE = 18,
            ESAC = 19, OF = 20, REZULTA = 21, TYPE = 22, ID = 23, PV = 24, INT = 25, AS = 26, AD = 27,
            DP = 28, PS = 29, PD = 30, VIRGULA = 31, STRING = 32, PLUS = 33, MINUS = 34, INM = 35,
            IMP = 36, PUNCT = 37, AT = 38, ATRIBUIRE = 39, COMMENT = 40, INEGALITATI = 41, WS = 42,
            BLOCK_COMMENT = 43, NEWLINE = 44;
    public static final int
            RULE_program = 0, RULE_classxx = 1, RULE_featurexx = 2, RULE_formalxx = 3,
            RULE_expresiexx = 4, RULE_letbody = 5, RULE_casebody = 6;
    public static final String[] ruleNames = {
            "program", "classxx", "featurexx", "formalxx", "expresiexx", "letbody",
            "casebody"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00da\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\6\2\24\n\2" +
                    "\r\2\16\2\25\3\2\3\2\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\3\3\3\3\7\3$\n" +
                    "\3\f\3\16\3\'\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63" +
                    "\13\4\7\4\65\n\4\f\4\16\48\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\5\4F\n\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7" +
                    "\6T\n\6\f\6\16\6W\13\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6q\n\6\r\6\16" +
                    "\6r\3\6\3\6\3\6\3\6\3\6\3\6\7\6{\n\6\f\6\16\6~\13\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\6\6\u0087\n\6\r\6\16\6\u0088\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0\n\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\5\6\u00b4\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00bc\n\6\f\6\16\6\u00bf\13" +
                    "\6\7\6\u00c1\n\6\f\6\16\6\u00c4\13\6\3\6\7\6\u00c7\n\6\f\6\16\6\u00ca" +
                    "\13\6\3\7\3\7\3\7\3\7\3\7\5\7\u00d1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\2\3\n\t\2\4\6\b\n\f\16\2\2\2\u00f7\2\23\3\2\2\2\4\31\3\2\2\2\6G\3\2" +
                    "\2\2\bI\3\2\2\2\n\u009f\3\2\2\2\f\u00cb\3\2\2\2\16\u00d2\3\2\2\2\20\21" +
                    "\5\4\3\2\21\22\7\32\2\2\22\24\3\2\2\2\23\20\3\2\2\2\24\25\3\2\2\2\25\23" +
                    "\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\30\7\2\2\3\30\3\3\2\2\2\31\32" +
                    "\7\4\2\2\32\35\7\30\2\2\33\34\7\5\2\2\34\36\7\30\2\2\35\33\3\2\2\2\35" +
                    "\36\3\2\2\2\36\37\3\2\2\2\37%\7\34\2\2 !\5\6\4\2!\"\7\32\2\2\"$\3\2\2" +
                    "\2# \3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\35" +
                    "\2\2)\5\3\2\2\2*+\7\31\2\2+\66\7\37\2\2,\61\5\b\5\2-.\7!\2\2.\60\5\b\5" +
                    "\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63" +
                    "\61\3\2\2\2\64,\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3" +
                    "\2\2\28\66\3\2\2\29:\7 \2\2:;\7\36\2\2;<\7\30\2\2<=\7\34\2\2=>\5\n\6\2" +
                    ">?\7\35\2\2?H\3\2\2\2@A\7\31\2\2AB\7\36\2\2BE\7\30\2\2CD\7)\2\2DF\5\n" +
                    "\6\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2G*\3\2\2\2G@\3\2\2\2H\7\3\2\2\2IJ\7" +
                    "\31\2\2JK\7\36\2\2KL\7\30\2\2L\t\3\2\2\2MN\b\6\1\2NO\7\31\2\2OZ\7\37\2" +
                    "\2PU\5\n\6\2QR\7!\2\2RT\5\n\6\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2" +
                    "\2VY\3\2\2\2WU\3\2\2\2XP\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2" +
                    "\2\2\\Z\3\2\2\2]\u00a0\7 \2\2^_\7\n\2\2_`\5\n\6\2`a\7\13\2\2ab\5\n\6\2" +
                    "bc\7\f\2\2cd\5\n\6\2de\7\r\2\2e\u00a0\3\2\2\2fg\7\17\2\2gh\5\n\6\2hi\7" +
                    "\20\2\2ij\5\n\6\2jk\7\21\2\2k\u00a0\3\2\2\2lp\7\34\2\2mn\5\n\6\2no\7\32" +
                    "\2\2oq\3\2\2\2pm\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\35" +
                    "\2\2u\u00a0\3\2\2\2vw\7\22\2\2w|\5\f\7\2xy\7!\2\2y{\5\f\7\2zx\3\2\2\2" +
                    "{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\23\2" +
                    "\2\u0080\u0081\5\n\6\23\u0081\u00a0\3\2\2\2\u0082\u0083\7\24\2\2\u0083" +
                    "\u0084\5\n\6\2\u0084\u0086\7\26\2\2\u0085\u0087\5\16\b\2\u0086\u0085\3" +
                    "\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089" +
                    "\u008a\3\2\2\2\u008a\u008b\7\25\2\2\u008b\u00a0\3\2\2\2\u008c\u008d\7" +
                    "\t\2\2\u008d\u00a0\7\30\2\2\u008e\u008f\7\b\2\2\u008f\u00a0\5\n\6\20\u0090" +
                    "\u0091\7\31\2\2\u0091\u0092\7)\2\2\u0092\u00a0\5\n\6\13\u0093\u0094\7" +
                    "\7\2\2\u0094\u00a0\5\n\6\n\u0095\u0096\7\6\2\2\u0096\u00a0\5\n\6\b\u0097" +
                    "\u0098\7\37\2\2\u0098\u0099\5\n\6\2\u0099\u009a\7 \2\2\u009a\u00a0\3\2" +
                    "\2\2\u009b\u00a0\7\31\2\2\u009c\u00a0\7\33\2\2\u009d\u00a0\7\"\2\2\u009e" +
                    "\u00a0\7\16\2\2\u009fM\3\2\2\2\u009f^\3\2\2\2\u009ff\3\2\2\2\u009fl\3" +
                    "\2\2\2\u009fv\3\2\2\2\u009f\u0082\3\2\2\2\u009f\u008c\3\2\2\2\u009f\u008e" +
                    "\3\2\2\2\u009f\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0095\3\2\2\2\u009f" +
                    "\u0097\3\2\2\2\u009f\u009b\3\2\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2" +
                    "\2\2\u009f\u009e\3\2\2\2\u00a0\u00c8\3\2\2\2\u00a1\u00a2\f\17\2\2\u00a2" +
                    "\u00a3\7%\2\2\u00a3\u00c7\5\n\6\20\u00a4\u00a5\f\16\2\2\u00a5\u00a6\7" +
                    "&\2\2\u00a6\u00c7\5\n\6\17\u00a7\u00a8\f\r\2\2\u00a8\u00a9\7#\2\2\u00a9" +
                    "\u00c7\5\n\6\16\u00aa\u00ab\f\f\2\2\u00ab\u00ac\7$\2\2\u00ac\u00c7\5\n" +
                    "\6\r\u00ad\u00ae\f\t\2\2\u00ae\u00af\7+\2\2\u00af\u00c7\5\n\6\n\u00b0" +
                    "\u00b3\f\30\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b4\7\30\2\2\u00b3\u00b1\3" +
                    "\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\'\2\2\u00b6" +
                    "\u00b7\7\31\2\2\u00b7\u00c2\7\37\2\2\u00b8\u00bd\5\n\6\2\u00b9\u00ba\7" +
                    "!\2\2\u00ba\u00bc\5\n\6\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd" +
                    "\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2" +
                    "\2\2\u00c0\u00b8\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2" +
                    "\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7 " +
                    "\2\2\u00c6\u00a1\3\2\2\2\u00c6\u00a4\3\2\2\2\u00c6\u00a7\3\2\2\2\u00c6" +
                    "\u00aa\3\2\2\2\u00c6\u00ad\3\2\2\2\u00c6\u00b0\3\2\2\2\u00c7\u00ca\3\2" +
                    "\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\13\3\2\2\2\u00ca\u00c8" +
                    "\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\u00cd\7\36\2\2\u00cd\u00d0\7\30\2" +
                    "\2\u00ce\u00cf\7)\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1" +
                    "\3\2\2\2\u00d1\r\3\2\2\2\u00d2\u00d3\7\31\2\2\u00d3\u00d4\7\36\2\2\u00d4" +
                    "\u00d5\7\30\2\2\u00d5\u00d6\7\27\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7" +
                    "\32\2\2\u00d8\17\3\2\2\2\25\25\35%\61\66EGUZr|\u0088\u009f\u00b3\u00bd" +
                    "\u00c2\u00c6\u00c8\u00d0";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'#'", "'class'", "'inherits'", "'not'", "'~'", "'isvoid'", "'new'",
            "'if'", "'then'", "'else'", "'fi'", null, "'while'", "'loop'", "'pool'",
            "'let'", "'in'", "'case'", "'esac'", "'of'", "'=>'", null, null, "';'",
            null, "'{'", "'}'", "':'", "'('", "')'", "','", null, "'+'", "'-'", "'*'",
            "'/'", "'.'", "'@'", "'<-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "ERROR", "CLASS", "INHERITS", "NOT", "TIL", "ISVOID", "NEW", "IF",
            "THEN", "ELSE", "FI", "BOOL", "WHILE", "LOOP", "POOL", "LET", "IN", "CASE",
            "ESAC", "OF", "REZULTA", "TYPE", "ID", "PV", "INT", "AS", "AD", "DP",
            "PS", "PD", "VIRGULA", "STRING", "PLUS", "MINUS", "INM", "IMP", "PUNCT",
            "AT", "ATRIBUIRE", "COMMENT", "INEGALITATI", "WS", "BLOCK_COMMENT", "NEWLINE"
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
                setState(17);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(14);
                            classxx();
                            setState(15);
                            match(PV);
                        }
                    }
                    setState(19);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == CLASS);
                setState(21);
                match(EOF);
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

    public final ClassxxContext classxx() throws RecognitionException {
        ClassxxContext _localctx = new ClassxxContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_classxx);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(23);
                match(CLASS);
                setState(24);
                match(TYPE);
                setState(27);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == INHERITS) {
                    {
                        setState(25);
                        match(INHERITS);
                        setState(26);
                        match(TYPE);
                    }
                }

                setState(29);
                match(AS);
                setState(35);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == ID) {
                    {
                        {
                            setState(30);
                            featurexx();
                            setState(31);
                            match(PV);
                        }
                    }
                    setState(37);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(38);
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

    public final FeaturexxContext featurexx() throws RecognitionException {
        FeaturexxContext _localctx = new FeaturexxContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_featurexx);
        int _la;
        try {
            setState(69);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    _localctx = new FunctieContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(40);
                    match(ID);
                    setState(41);
                    match(PS);
                    setState(52);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == ID) {
                        {
                            {
                                setState(42);
                                formalxx();
                                setState(47);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == VIRGULA) {
                                    {
                                        {
                                            setState(43);
                                            match(VIRGULA);
                                            setState(44);
                                            formalxx();
                                        }
                                    }
                                    setState(49);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }
                        setState(54);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(55);
                    match(PD);
                    setState(56);
                    match(DP);
                    setState(57);
                    match(TYPE);
                    setState(58);
                    match(AS);
                    setState(59);
                    expresiexx(0);
                    setState(60);
                    match(AD);
                }
                break;
                case 2:
                    _localctx = new AtributContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(62);
                    match(ID);
                    setState(63);
                    match(DP);
                    setState(64);
                    match(TYPE);
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == ATRIBUIRE) {
                        {
                            setState(65);
                            match(ATRIBUIRE);
                            setState(66);
                            expresiexx(0);
                        }
                    }

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

    public final FormalxxContext formalxx() throws RecognitionException {
        FormalxxContext _localctx = new FormalxxContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_formalxx);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(71);
                match(ID);
                setState(72);
                match(DP);
                setState(73);
                match(TYPE);
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

    public final ExpresiexxContext expresiexx() throws RecognitionException {
        return expresiexx(0);
    }

    private ExpresiexxContext expresiexx(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExpresiexxContext _localctx = new ExpresiexxContext(_ctx, _parentState);
        ExpresiexxContext _prevctx = _localctx;
        int _startState = 8;
        enterRecursionRule(_localctx, 8, RULE_expresiexx, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                    case 1: {
                        _localctx = new FunccallContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(76);
                        match(ID);
                        setState(77);
                        match(PS);
                        setState(88);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0)) {
                            {
                                {
                                    setState(78);
                                    expresiexx(0);
                                    setState(83);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == VIRGULA) {
                                        {
                                            {
                                                setState(79);
                                                match(VIRGULA);
                                                setState(80);
                                                expresiexx(0);
                                            }
                                        }
                                        setState(85);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                }
                            }
                            setState(90);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(91);
                        match(PD);
                    }
                    break;
                    case 2: {
                        _localctx = new IfthenelseContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(92);
                        match(IF);
                        setState(93);
                        expresiexx(0);
                        setState(94);
                        match(THEN);
                        setState(95);
                        expresiexx(0);
                        setState(96);
                        match(ELSE);
                        setState(97);
                        expresiexx(0);
                        setState(98);
                        match(FI);
                    }
                    break;
                    case 3: {
                        _localctx = new WhileloopContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(100);
                        match(WHILE);
                        setState(101);
                        expresiexx(0);
                        setState(102);
                        match(LOOP);
                        setState(103);
                        expresiexx(0);
                        setState(104);
                        match(POOL);
                    }
                    break;
                    case 4: {
                        _localctx = new BodyContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(106);
                        match(AS);
                        setState(110);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(107);
                                    expresiexx(0);
                                    setState(108);
                                    match(PV);
                                }
                            }
                            setState(112);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0));
                        setState(114);
                        match(AD);
                    }
                    break;
                    case 5: {
                        _localctx = new LetContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(116);
                        match(LET);
                        setState(117);
                        letbody();
                        setState(122);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == VIRGULA) {
                            {
                                {
                                    setState(118);
                                    match(VIRGULA);
                                    setState(119);
                                    letbody();
                                }
                            }
                            setState(124);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(125);
                        match(IN);
                        setState(126);
                        expresiexx(17);
                    }
                    break;
                    case 6: {
                        _localctx = new CaseeContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(128);
                        match(CASE);
                        setState(129);
                        expresiexx(0);
                        setState(130);
                        match(OF);
                        setState(132);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do {
                            {
                                {
                                    setState(131);
                                    casebody();
                                }
                            }
                            setState(134);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == ID);
                        setState(136);
                        match(ESAC);
                    }
                    break;
                    case 7: {
                        _localctx = new NewContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(138);
                        match(NEW);
                        setState(139);
                        match(TYPE);
                    }
                    break;
                    case 8: {
                        _localctx = new IsvoidContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(140);
                        match(ISVOID);
                        setState(141);
                        expresiexx(14);
                    }
                    break;
                    case 9: {
                        _localctx = new AtribuireContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(142);
                        match(ID);
                        setState(143);
                        match(ATRIBUIRE);
                        setState(144);
                        expresiexx(9);
                    }
                    break;
                    case 10: {
                        _localctx = new TilContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(145);
                        match(TIL);
                        setState(146);
                        expresiexx(8);
                    }
                    break;
                    case 11: {
                        _localctx = new NotContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(147);
                        match(NOT);
                        setState(148);
                        expresiexx(6);
                    }
                    break;
                    case 12: {
                        _localctx = new ParanContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(149);
                        match(PS);
                        setState(150);
                        expresiexx(0);
                        setState(151);
                        match(PD);
                    }
                    break;
                    case 13: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(153);
                        match(ID);
                    }
                    break;
                    case 14: {
                        _localctx = new InttContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(154);
                        match(INT);
                    }
                    break;
                    case 15: {
                        _localctx = new StringContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(155);
                        match(STRING);
                    }
                    break;
                    case 16: {
                        _localctx = new BoolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(156);
                        match(BOOL);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(198);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(196);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                                case 1: {
                                    _localctx = new InmContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(159);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(160);
                                    match(INM);
                                    setState(161);
                                    expresiexx(14);
                                }
                                break;
                                case 2: {
                                    _localctx = new ImpContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(162);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(163);
                                    match(IMP);
                                    setState(164);
                                    expresiexx(13);
                                }
                                break;
                                case 3: {
                                    _localctx = new PlusContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(165);
                                    if (!(precpred(_ctx, 11)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                                    setState(166);
                                    match(PLUS);
                                    setState(167);
                                    expresiexx(12);
                                }
                                break;
                                case 4: {
                                    _localctx = new MinusContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(168);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(169);
                                    match(MINUS);
                                    setState(170);
                                    expresiexx(11);
                                }
                                break;
                                case 5: {
                                    _localctx = new InegContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(171);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(172);
                                    match(INEGALITATI);
                                    setState(173);
                                    expresiexx(8);
                                }
                                break;
                                case 6: {
                                    _localctx = new ObjfunccallContext(new ExpresiexxContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_expresiexx);
                                    setState(174);
                                    if (!(precpred(_ctx, 22)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                                    setState(177);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == AT) {
                                        {
                                            setState(175);
                                            match(AT);
                                            setState(176);
                                            match(TYPE);
                                        }
                                    }

                                    setState(179);
                                    match(PUNCT);
                                    setState(180);
                                    match(ID);
                                    setState(181);
                                    match(PS);
                                    setState(192);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TIL) | (1L << ISVOID) | (1L << NEW) | (1L << IF) | (1L << BOOL) | (1L << WHILE) | (1L << LET) | (1L << CASE) | (1L << ID) | (1L << INT) | (1L << AS) | (1L << PS) | (1L << STRING))) != 0)) {
                                        {
                                            {
                                                setState(182);
                                                expresiexx(0);
                                                setState(187);
                                                _errHandler.sync(this);
                                                _la = _input.LA(1);
                                                while (_la == VIRGULA) {
                                                    {
                                                        {
                                                            setState(183);
                                                            match(VIRGULA);
                                                            setState(184);
                                                            expresiexx(0);
                                                        }
                                                    }
                                                    setState(189);
                                                    _errHandler.sync(this);
                                                    _la = _input.LA(1);
                                                }
                                            }
                                        }
                                        setState(194);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(195);
                                    match(PD);
                                }
                                break;
                            }
                        }
                    }
                    setState(200);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 17, _ctx);
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

    public final LetbodyContext letbody() throws RecognitionException {
        LetbodyContext _localctx = new LetbodyContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_letbody);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(201);
                match(ID);
                setState(202);
                match(DP);
                setState(203);
                match(TYPE);
                setState(206);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == ATRIBUIRE) {
                    {
                        setState(204);
                        match(ATRIBUIRE);
                        setState(205);
                        expresiexx(0);
                    }
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

    public final CasebodyContext casebody() throws RecognitionException {
        CasebodyContext _localctx = new CasebodyContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_casebody);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(208);
                match(ID);
                setState(209);
                match(DP);
                setState(210);
                match(TYPE);
                setState(211);
                match(REZULTA);
                setState(212);
                expresiexx(0);
                setState(213);
                match(PV);
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
            case 4:
                return expresiexx_sempred((ExpresiexxContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expresiexx_sempred(ExpresiexxContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 13);
            case 1:
                return precpred(_ctx, 12);
            case 2:
                return precpred(_ctx, 11);
            case 3:
                return precpred(_ctx, 10);
            case 4:
                return precpred(_ctx, 7);
            case 5:
                return precpred(_ctx, 22);
        }
        return true;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode EOF() {
            return getToken(CoolParser.EOF, 0);
        }

        public List<ClassxxContext> classxx() {
            return getRuleContexts(ClassxxContext.class);
        }

        public ClassxxContext classxx(int i) {
            return getRuleContext(ClassxxContext.class, i);
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

    public static class ClassxxContext extends ParserRuleContext {
        public ClassxxContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode CLASS() {
            return getToken(CoolParser.CLASS, 0);
        }

        public List<TerminalNode> TYPE() {
            return getTokens(CoolParser.TYPE);
        }

        public TerminalNode TYPE(int i) {
            return getToken(CoolParser.TYPE, i);
        }

        public TerminalNode AS() {
            return getToken(CoolParser.AS, 0);
        }

        public TerminalNode AD() {
            return getToken(CoolParser.AD, 0);
        }

        public TerminalNode INHERITS() {
            return getToken(CoolParser.INHERITS, 0);
        }

        public List<FeaturexxContext> featurexx() {
            return getRuleContexts(FeaturexxContext.class);
        }

        public FeaturexxContext featurexx(int i) {
            return getRuleContext(FeaturexxContext.class, i);
        }

        public List<TerminalNode> PV() {
            return getTokens(CoolParser.PV);
        }

        public TerminalNode PV(int i) {
            return getToken(CoolParser.PV, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_classxx;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterClassxx(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitClassxx(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitClassxx(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FeaturexxContext extends ParserRuleContext {
        public FeaturexxContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FeaturexxContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_featurexx;
        }

        public void copyFrom(FeaturexxContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class AtributContext extends FeaturexxContext {
        public AtributContext(FeaturexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        public TerminalNode ATRIBUIRE() {
            return getToken(CoolParser.ATRIBUIRE, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterAtribut(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitAtribut(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitAtribut(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunctieContext extends FeaturexxContext {
        public FunctieContext(FeaturexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
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

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        public TerminalNode AS() {
            return getToken(CoolParser.AS, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        public TerminalNode AD() {
            return getToken(CoolParser.AD, 0);
        }

        public List<FormalxxContext> formalxx() {
            return getRuleContexts(FormalxxContext.class);
        }

        public FormalxxContext formalxx(int i) {
            return getRuleContext(FormalxxContext.class, i);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFunctie(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFunctie(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitFunctie(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FormalxxContext extends ParserRuleContext {
        public FormalxxContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_formalxx;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterFormalxx(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitFormalxx(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitFormalxx(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpresiexxContext extends ParserRuleContext {
        public ExpresiexxContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExpresiexxContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expresiexx;
        }

        public void copyFrom(ExpresiexxContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class NewContext extends ExpresiexxContext {
        public NewContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NEW() {
            return getToken(CoolParser.NEW, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterNew(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitNew(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitNew(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MinusContext extends ExpresiexxContext {
        public MinusContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode MINUS() {
            return getToken(CoolParser.MINUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterMinus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitMinus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitMinus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringContext extends ExpresiexxContext {
        public StringContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode STRING() {
            return getToken(CoolParser.STRING, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BoolContext extends ExpresiexxContext {
        public BoolContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode BOOL() {
            return getToken(CoolParser.BOOL, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FunccallContext extends ExpresiexxContext {
        public FunccallContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode PS() {
            return getToken(CoolParser.PS, 0);
        }

        public TerminalNode PD() {
            return getToken(CoolParser.PD, 0);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
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

    public static class IsvoidContext extends ExpresiexxContext {
        public IsvoidContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ISVOID() {
            return getToken(CoolParser.ISVOID, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterIsvoid(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitIsvoid(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitIsvoid(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InmContext extends ExpresiexxContext {
        public InmContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode INM() {
            return getToken(CoolParser.INM, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterInm(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitInm(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitInm(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BodyContext extends ExpresiexxContext {
        public BodyContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode AS() {
            return getToken(CoolParser.AS, 0);
        }

        public TerminalNode AD() {
            return getToken(CoolParser.AD, 0);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public List<TerminalNode> PV() {
            return getTokens(CoolParser.PV);
        }

        public TerminalNode PV(int i) {
            return getToken(CoolParser.PV, i);
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

    public static class ImpContext extends ExpresiexxContext {
        public ImpContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode IMP() {
            return getToken(CoolParser.IMP, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterImp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitImp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitImp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PlusContext extends ExpresiexxContext {
        public PlusContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode PLUS() {
            return getToken(CoolParser.PLUS, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterPlus(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitPlus(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitPlus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class WhileloopContext extends ExpresiexxContext {
        public WhileloopContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode WHILE() {
            return getToken(CoolParser.WHILE, 0);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode LOOP() {
            return getToken(CoolParser.LOOP, 0);
        }

        public TerminalNode POOL() {
            return getToken(CoolParser.POOL, 0);
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

    public static class NotContext extends ExpresiexxContext {
        public NotContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NOT() {
            return getToken(CoolParser.NOT, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterNot(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitNot(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitNot(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InttContext extends ExpresiexxContext {
        public InttContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode INT() {
            return getToken(CoolParser.INT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterIntt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitIntt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitIntt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CaseeContext extends ExpresiexxContext {
        public CaseeContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode CASE() {
            return getToken(CoolParser.CASE, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        public TerminalNode OF() {
            return getToken(CoolParser.OF, 0);
        }

        public TerminalNode ESAC() {
            return getToken(CoolParser.ESAC, 0);
        }

        public List<CasebodyContext> casebody() {
            return getRuleContexts(CasebodyContext.class);
        }

        public CasebodyContext casebody(int i) {
            return getRuleContext(CasebodyContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterCasee(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitCasee(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitCasee(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class TilContext extends ExpresiexxContext {
        public TilContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode TIL() {
            return getToken(CoolParser.TIL, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterTil(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitTil(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitTil(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParanContext extends ExpresiexxContext {
        public ParanContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode PS() {
            return getToken(CoolParser.PS, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        public TerminalNode PD() {
            return getToken(CoolParser.PD, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterParan(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitParan(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitParan(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class InegContext extends ExpresiexxContext {
        public InegContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode INEGALITATI() {
            return getToken(CoolParser.INEGALITATI, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterIneg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitIneg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitIneg(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IfthenelseContext extends ExpresiexxContext {
        public IfthenelseContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode IF() {
            return getToken(CoolParser.IF, 0);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode THEN() {
            return getToken(CoolParser.THEN, 0);
        }

        public TerminalNode ELSE() {
            return getToken(CoolParser.ELSE, 0);
        }

        public TerminalNode FI() {
            return getToken(CoolParser.FI, 0);
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

    public static class LetContext extends ExpresiexxContext {
        public LetContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode LET() {
            return getToken(CoolParser.LET, 0);
        }

        public List<LetbodyContext> letbody() {
            return getRuleContexts(LetbodyContext.class);
        }

        public LetbodyContext letbody(int i) {
            return getRuleContext(LetbodyContext.class, i);
        }

        public TerminalNode IN() {
            return getToken(CoolParser.IN, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterLet(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitLet(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitLet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AtribuireContext extends ExpresiexxContext {
        public AtribuireContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode ATRIBUIRE() {
            return getToken(CoolParser.ATRIBUIRE, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterAtribuire(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitAtribuire(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitAtribuire(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IdContext extends ExpresiexxContext {
        public IdContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterId(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitId(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor) return ((CoolParserVisitor<? extends T>) visitor).visitId(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ObjfunccallContext extends ExpresiexxContext {
        public ObjfunccallContext(ExpresiexxContext ctx) {
            copyFrom(ctx);
        }

        public List<ExpresiexxContext> expresiexx() {
            return getRuleContexts(ExpresiexxContext.class);
        }

        public ExpresiexxContext expresiexx(int i) {
            return getRuleContext(ExpresiexxContext.class, i);
        }

        public TerminalNode PUNCT() {
            return getToken(CoolParser.PUNCT, 0);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode PS() {
            return getToken(CoolParser.PS, 0);
        }

        public TerminalNode PD() {
            return getToken(CoolParser.PD, 0);
        }

        public TerminalNode AT() {
            return getToken(CoolParser.AT, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        public List<TerminalNode> VIRGULA() {
            return getTokens(CoolParser.VIRGULA);
        }

        public TerminalNode VIRGULA(int i) {
            return getToken(CoolParser.VIRGULA, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterObjfunccall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitObjfunccall(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitObjfunccall(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class LetbodyContext extends ParserRuleContext {
        public LetbodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        public TerminalNode ATRIBUIRE() {
            return getToken(CoolParser.ATRIBUIRE, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_letbody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterLetbody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitLetbody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitLetbody(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CasebodyContext extends ParserRuleContext {
        public CasebodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(CoolParser.ID, 0);
        }

        public TerminalNode DP() {
            return getToken(CoolParser.DP, 0);
        }

        public TerminalNode TYPE() {
            return getToken(CoolParser.TYPE, 0);
        }

        public TerminalNode REZULTA() {
            return getToken(CoolParser.REZULTA, 0);
        }

        public ExpresiexxContext expresiexx() {
            return getRuleContext(ExpresiexxContext.class, 0);
        }

        public TerminalNode PV() {
            return getToken(CoolParser.PV, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_casebody;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).enterCasebody(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof CoolParserListener) ((CoolParserListener) listener).exitCasebody(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof CoolParserVisitor)
                return ((CoolParserVisitor<? extends T>) visitor).visitCasebody(this);
            else return visitor.visitChildren(this);
        }
    }
}