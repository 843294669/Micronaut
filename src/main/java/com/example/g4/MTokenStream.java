package com.example.g4;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;

public class MTokenStream extends CommonTokenStream {
    public MTokenStream(TokenSource tokenSource) {
        super(tokenSource);
    }

    public FormulaParser buildFormulaParser() {
        return new FormulaParser(this);
    }
}
