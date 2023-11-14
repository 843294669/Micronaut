package com.example.formula;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class FormulaParserErrorListener extends BaseErrorListener {

  public static final FormulaParserErrorListener instance = new FormulaParserErrorListener();

  protected FormulaParserErrorListener() {

  }

  @Override
  public void syntaxError(Recognizer<?, ?> recognizer,
                          Object offendingSymbol,
                          int line,
                          int charPositionInLine,
                          String msg,
                          RecognitionException e) {
    throw new RuntimeException(e);
  }

}
