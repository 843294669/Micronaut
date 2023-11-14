package com.example.controller;

import com.example.bean.CalculationRequest;
import com.example.bean.CalculationResult;
import com.example.formula.FormulaParserErrorListener;
import com.example.formula.MFormulaParserVisitor;
import com.example.g4.FormulaLexer;
import com.example.g4.FormulaParser;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

import java.io.File;

/**
 * 1 formula.js必须使用GraalVM运行
 * 2 使用Micronaut框架构建服务
 * 3 服务要有至少两个操作数参数A1和A2以及一个公式参数
 * 4 公式参数可以输入形如A1+A2，IF(A1=0，A2， "0")这样的Excel公式
 * 5 POST到服务后出计算结果
 * 6 输入和输出用请用JSON格式
 */
@Controller("/calculator")
public class ExcelFormulaCalculatorController {
    @Post
    public CalculationResult calculate(@Body CalculationRequest request) {
        CalculationResult result = new CalculationResult();
        try (Context context = Context.create("js")) {
            try {
                Source source = Source.newBuilder("js", new File("src/main/resources/asserts/js/formula.min.js")).build();
                context.eval(source);
                Value evalResult = context.eval("js", parseFormula(request));
                result.setSuccess(true);
                result.setResult(evalResult.asDouble());
            } catch (Exception e) {
                result.setSuccess(false);
                result.setError("Failed to evaluate formula: " + e.getMessage());
            }
            return result;
        }
    }

    private String parseFormula(CalculationRequest request) {
        FormulaLexer formulaLexer = new FormulaLexer(CharStreams.fromString(request.getFormula()));
        TokenStream tokenStream = new CommonTokenStream(formulaLexer);
        FormulaParser parser = new FormulaParser(tokenStream);
        parser.addErrorListener(FormulaParserErrorListener.instance);
        FormulaParser.FormulaContext context = parser.formula();
        MFormulaParserVisitor parserVisitor = new MFormulaParserVisitor(request.getCellMap());
        return parserVisitor.accept(context);
    }
}
