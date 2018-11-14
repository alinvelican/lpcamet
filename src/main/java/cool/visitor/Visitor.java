package cool.visitor;

import cool.ast.*;
import cool.parser.CoolParser;
import cool.parser.CoolParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


public class Visitor extends AbstractParseTreeVisitor<NodeBase> implements CoolParserVisitor<NodeBase> {


    @Override
    public NodeBase visitProgram(CoolParser.ProgramContext ctx) {
        return new ProgramNode(ctx.classxx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitClassxx(CoolParser.ClassxxContext ctx) {
        return new ClassNode(ctx.TYPE(), ctx.featurexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitFunctie(CoolParser.FunctieContext ctx) {
        return new FunctieNode(Arrays.asList(ctx.ID(), ctx.TYPE()), ctx.formalxx().stream().map(x -> visit(x)).collect(Collectors.toList()),
                visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitAtribut(CoolParser.AtributContext ctx) {
        if (ctx.expresiexx() != null) {
            return new AtributeNode(Arrays.asList(ctx.ID(), ctx.TYPE()), Optional.of(visit(ctx.expresiexx())));

        }
        return new AtributeNode(Arrays.asList(ctx.ID(), ctx.TYPE()), Optional.empty());

    }


    @Override
    public NodeBase visitFormalxx(CoolParser.FormalxxContext ctx) {
        return new FormalNode(Arrays.asList(ctx.ID(), ctx.TYPE()));
    }

    @Override
    public NodeBase visitNew(CoolParser.NewContext ctx) {
        return new NewNode(ctx.TYPE());
    }

    @Override
    public NodeBase visitMinus(CoolParser.MinusContext ctx) {

        return new AritmeticNode(ctx.MINUS(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitString(CoolParser.StringContext ctx) {


        return new FinalNode(ctx.STRING());
    }

    @Override
    public NodeBase visitBool(CoolParser.BoolContext ctx) {
        return new FinalNode(ctx.BOOL());
    }

    @Override
    public NodeBase visitFunccall(CoolParser.FunccallContext ctx) {
        return new FuncCallNode(ctx.ID(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitIsvoid(CoolParser.IsvoidContext ctx) {
        return new FirstEvalNode(ctx.ISVOID(), visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitInm(CoolParser.InmContext ctx) {
        return new AritmeticNode(ctx.INM(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitBody(CoolParser.BodyContext ctx) {
        return new BodyNode(ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitImp(CoolParser.ImpContext ctx) {
        return new AritmeticNode(ctx.IMP(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitPlus(CoolParser.PlusContext ctx) {
        return new AritmeticNode(ctx.PLUS(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitWhileloop(CoolParser.WhileloopContext ctx) {
        return new IfWhileNode("while", ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));

    }

    @Override
    public NodeBase visitNot(CoolParser.NotContext ctx) {
        return new FirstEvalNode(ctx.NOT(), visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitIntt(CoolParser.InttContext ctx) {
        return new FinalNode(ctx.INT());
    }

    @Override
    public NodeBase visitCasee(CoolParser.CaseeContext ctx) {
        return new CaseNode(visit(ctx.expresiexx()), ctx.casebody().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitTil(CoolParser.TilContext ctx) {
        return new FirstEvalNode(ctx.TIL(), visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitParan(CoolParser.ParanContext ctx) {
        return new ParanNode(visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitIneg(CoolParser.InegContext ctx) {
        return new AritmeticNode(ctx.INEGALITATI(), ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitIfthenelse(CoolParser.IfthenelseContext ctx) {
        return new IfWhileNode("if", ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }

    @Override
    public NodeBase visitAtribuire(CoolParser.AtribuireContext ctx) {
        return new AtribuireNode(ctx.ID(), visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitLet(CoolParser.LetContext ctx) {

        return new LetNode(ctx.letbody().stream().map(x -> visit(x)).collect(Collectors.toList()), visit(ctx.expresiexx()));
    }

    @Override
    public NodeBase visitId(CoolParser.IdContext ctx) {
        return new FinalNode(ctx.ID());
    }

    @Override
    public NodeBase visitObjfunccall(CoolParser.ObjfunccallContext ctx) {
        Optional<TerminalNode> at = Optional.empty();
        var punct = ctx.ID();
        if (Objects.nonNull(ctx.AT())) {
            at = Optional.of(ctx.TYPE());
        }
        return new ObjFuncCall(visit(ctx.expresiexx(0)),
                at,
                punct,
                ctx.expresiexx().stream().map(x -> visit(x)).collect(Collectors.toList()));
    }


    @Override
    public NodeBase visitLetbody(CoolParser.LetbodyContext ctx) {
        Optional<NodeBase> exOp = Optional.empty();
        if (Objects.nonNull(ctx.expresiexx())) {
            exOp = Optional.of(visit(ctx.expresiexx()));
        }
        return new NodeBodyOf("local", ctx.ID(), ctx.TYPE(), exOp);
    }

    @Override
    public NodeBase visitCasebody(CoolParser.CasebodyContext ctx) {
        Optional<NodeBase> exOp = Optional.empty();
        if (Objects.nonNull(ctx.expresiexx())) {
            exOp = Optional.of(visit(ctx.expresiexx()));
        }
        return new NodeBodyOf("case branch", ctx.ID(), ctx.TYPE(), exOp);
    }

};