package com.example.controller;

import com.example.bean.CalculationRequest;
import com.example.bean.CalculationResult;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.HostAccess;
import org.graalvm.polyglot.PolyglotAccess;
import org.graalvm.polyglot.Value;

@Controller("/calculator")
public class ExcelFormulaCalculatorController {
    @Post("/sum")
    public CalculationResult calculate(@Body CalculationRequest request) {
        try (Context context = Context.create("js")) {
            context.eval("js", "var formula = require('formula.js');");
            CalculationResult result = new CalculationResult();
            try {
                Value evalResult = context.eval("js", "formula.parse('" + request.getFormula() + "')");
                double calculatedValue = evalResult.execute().asDouble();

                result.setSuccess(true);
                result.setResult(calculatedValue);
            } catch (Exception e) {
                result.setSuccess(false);
                result.setError("Failed to evaluate formula: " + e.getMessage());
            }

            return result;
        }
    }
}
