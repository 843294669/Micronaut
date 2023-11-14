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
import org.graalvm.polyglot.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Controller("/calculator")
public class ExcelFormulaCalculatorController {
    @Post("/sum")
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
