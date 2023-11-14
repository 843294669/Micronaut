package com.example.formula;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.g4.FormulaParser;
import com.example.g4.FormulaParserVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;


public class MFormulaParserVisitor extends AbstractParseTreeVisitor<String> implements FormulaParserVisitor<String> {

    protected Map<String, String> cellMap;

    public MFormulaParserVisitor(Map<String, String> cellMap) {
        this.cellMap = cellMap;
    }

    @Override
    public String visitFormula(FormulaParser.FormulaContext ctx) {
        return "(" + accept(ctx.getChild(0)) + ")";
    }

    @Override
    public String visitExpression(FormulaParser.ExpressionContext ctx) {
        return accept(ctx.children);
    }

    @Override
    public String visitCellName(FormulaParser.CellNameContext ctx) {
        // 单元格名称为单元格的值
        String cellValue = cellMap.get(ctx.IDENTIFIER().getText().toUpperCase());
        if (cellValue == null) {
            return "null";
        }
        try {
            return new BigDecimal(cellValue).toString();
        } catch (Throwable e) {
            return escapeString(cellValue);
        }
    }

    @Override
    public String visitFunctionCall(FormulaParser.FunctionCallContext ctx) {
        return accept(ctx.children);
    }

    @Override
    public String visitFunctionName(FormulaParser.FunctionNameContext ctx) {
        // 替换函数名称
        return "formulajs." + ctx.IDENTIFIER().getText().toUpperCase();
    }

    @Override
    public String visitParameters(FormulaParser.ParametersContext ctx) {
        return accept(ctx.children);
    }

    @Override
    public String visitParameter(FormulaParser.ParameterContext ctx) {
        return accept(ctx.children);
    }

    @Override
    public String visitTerminal(TerminalNode node) {
        return node.getText();
    }

    public String accept(ParseTree node) {
        if (node != null) {
            return node.accept(this);
        }
        return "null";
    }

    protected String accept(List<? extends ParseTree> nodes) {
        if (nodes == null || nodes.size() == 0) {
            return "null";
        }
        if (nodes.size() == 1) {
            return accept(nodes.get(0));
        }
        StringBuilder buffer = new StringBuilder();
        for (ParseTree node : nodes) {
            buffer.append(accept(node));
        }
        return buffer.toString();
    }

    protected String escapeString(String content) {
        SerializeWriter writer = new SerializeWriter(SerializerFeature.UseSingleQuotes);
        writer.writeString(content);
        return writer.toString();
    }

}
