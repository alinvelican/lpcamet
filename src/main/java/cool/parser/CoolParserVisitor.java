// Generated from C:/Users/alin/IdeaProjects/tema1.2/src/cool/parser\CoolParser.g4 by ANTLR 4.7
package cool.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CoolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface CoolParserVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link CoolParser#program}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProgram(CoolParser.ProgramContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStat(CoolParser.StatContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#decclass}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecclass(CoolParser.DecclassContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#decvar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecvar(CoolParser.DecvarContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#decfunctie}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecfunctie(CoolParser.DecfunctieContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#asigvar}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAsigvar(CoolParser.AsigvarContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#funccall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFunccall(CoolParser.FunccallContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#objectfunccall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitObjectfunccall(CoolParser.ObjectfunccallContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#ifthenelse}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIfthenelse(CoolParser.IfthenelseContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#whileloop}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileloop(CoolParser.WhileloopContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#letstat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLetstat(CoolParser.LetstatContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#expresie}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpresie(CoolParser.ExpresieContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#header}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitHeader(CoolParser.HeaderContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#body}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBody(CoolParser.BodyContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#expresi}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpresi(CoolParser.ExpresiContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#decvars}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecvars(CoolParser.DecvarsContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#newobject}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNewobject(CoolParser.NewobjectContext ctx);

    /**
     * Visit a parse tree produced by {@link CoolParser#dispatch}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDispatch(CoolParser.DispatchContext ctx);
}