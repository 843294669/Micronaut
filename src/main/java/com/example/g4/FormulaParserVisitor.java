// Generated from D:/Projects/demo-formula/src/main/java/org/jack/demo/formula/component/g4\FormulaParser.g4 by ANTLR 4.7
package com.example.g4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FormulaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FormulaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FormulaParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(FormulaParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FormulaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#cellName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellName(FormulaParser.CellNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FormulaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(FormulaParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FormulaParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FormulaParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FormulaParser.ParameterContext ctx);
}
