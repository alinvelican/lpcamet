// Generated from C:/Users/alin/IdeaProjects/tema1.2/src/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link CoolParser#program}.
     *
     * @param ctx the parse tree
     */
    void enterProgram(CoolParser.ProgramContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#program}.
     *
     * @param ctx the parse tree
     */
    void exitProgram(CoolParser.ProgramContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterStat(CoolParser.StatContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitStat(CoolParser.StatContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#decclass}.
     *
     * @param ctx the parse tree
     */
    void enterDecclass(CoolParser.DecclassContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#decclass}.
     *
     * @param ctx the parse tree
     */
    void exitDecclass(CoolParser.DecclassContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#decvar}.
     *
     * @param ctx the parse tree
     */
    void enterDecvar(CoolParser.DecvarContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#decvar}.
     *
     * @param ctx the parse tree
     */
    void exitDecvar(CoolParser.DecvarContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#decfunctie}.
     *
     * @param ctx the parse tree
     */
    void enterDecfunctie(CoolParser.DecfunctieContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#decfunctie}.
     *
     * @param ctx the parse tree
     */
    void exitDecfunctie(CoolParser.DecfunctieContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#asigvar}.
     *
     * @param ctx the parse tree
     */
    void enterAsigvar(CoolParser.AsigvarContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#asigvar}.
     *
     * @param ctx the parse tree
     */
    void exitAsigvar(CoolParser.AsigvarContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#funccall}.
     *
     * @param ctx the parse tree
     */
    void enterFunccall(CoolParser.FunccallContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#funccall}.
     *
     * @param ctx the parse tree
     */
    void exitFunccall(CoolParser.FunccallContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#objectfunccall}.
     *
     * @param ctx the parse tree
     */
    void enterObjectfunccall(CoolParser.ObjectfunccallContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#objectfunccall}.
     *
     * @param ctx the parse tree
     */
    void exitObjectfunccall(CoolParser.ObjectfunccallContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#ifthenelse}.
     *
     * @param ctx the parse tree
     */
    void enterIfthenelse(CoolParser.IfthenelseContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#ifthenelse}.
     *
     * @param ctx the parse tree
     */
    void exitIfthenelse(CoolParser.IfthenelseContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#whileloop}.
     *
     * @param ctx the parse tree
     */
    void enterWhileloop(CoolParser.WhileloopContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#whileloop}.
     *
     * @param ctx the parse tree
     */
    void exitWhileloop(CoolParser.WhileloopContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#letstat}.
     *
     * @param ctx the parse tree
     */
    void enterLetstat(CoolParser.LetstatContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#letstat}.
     *
     * @param ctx the parse tree
     */
    void exitLetstat(CoolParser.LetstatContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#expresie}.
     *
     * @param ctx the parse tree
     */
    void enterExpresie(CoolParser.ExpresieContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#expresie}.
     *
     * @param ctx the parse tree
     */
    void exitExpresie(CoolParser.ExpresieContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#header}.
     *
     * @param ctx the parse tree
     */
    void enterHeader(CoolParser.HeaderContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#header}.
     *
     * @param ctx the parse tree
     */
    void exitHeader(CoolParser.HeaderContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#body}.
     *
     * @param ctx the parse tree
     */
    void enterBody(CoolParser.BodyContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#body}.
     *
     * @param ctx the parse tree
     */
    void exitBody(CoolParser.BodyContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#expresi}.
     *
     * @param ctx the parse tree
     */
    void enterExpresi(CoolParser.ExpresiContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#expresi}.
     *
     * @param ctx the parse tree
     */
    void exitExpresi(CoolParser.ExpresiContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#decvars}.
     *
     * @param ctx the parse tree
     */
    void enterDecvars(CoolParser.DecvarsContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#decvars}.
     *
     * @param ctx the parse tree
     */
    void exitDecvars(CoolParser.DecvarsContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#newobject}.
     *
     * @param ctx the parse tree
     */
    void enterNewobject(CoolParser.NewobjectContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#newobject}.
     *
     * @param ctx the parse tree
     */
    void exitNewobject(CoolParser.NewobjectContext ctx);

    /**
     * Enter a parse tree produced by {@link CoolParser#dispatch}.
     *
     * @param ctx the parse tree
     */
    void enterDispatch(CoolParser.DispatchContext ctx);

    /**
     * Exit a parse tree produced by {@link CoolParser#dispatch}.
     *
     * @param ctx the parse tree
     */
    void exitDispatch(CoolParser.DispatchContext ctx);
}