parser grammar FormulaParser;

options {
    tokenVocab = FormulaLexer;
}

formula     :  expression
            ;

expression
            :  functionCall
            |  cellName
            |  INTEGER
            |  INTEGER_HEX
            |  FLOATING_POINT
            |  STRING_DOUBLE
            |  STRING_SINGLE
            |  LPAREN expression RPAREN
            |  expression DOUBLE_PLUS
            |  expression DOUBLE_MINUS
            |  NOT expression
            |  BIT_NOT expression
            |  PLUS expression
            |  MINUS expression
            |  DOUBLE_PLUS expression
            |  DOUBLE_MINUS expression
            |  expression MUL expression
            |  expression DIV expression
            |  expression MOD expression
            |  expression PLUS expression
            |  expression MINUS expression
            |  expression BIT_SHL expression
            |  expression BIT_SHR expression
            |  expression BIT_USHR expression
            |  expression LT expression
            |  expression LE expression
            |  expression GT expression
            |  expression GE expression
            |  expression EQ expression
            |  expression NE expression
            |  expression IDENTICALLY_EQUAL expression
            |  expression IDENTICALLY_EQUAL_NOT expression
            |  expression BIT_AND expression
            |  expression BIT_XOR expression
            |  expression BIT_OR expression
            |  expression AND expression
            |  expression OR expression
            |  expression QUESTION expression COLON expression
            |  expression IDENTICALLY_EQUAL_NOT expression
            ;

cellName    :  IDENTIFIER
            ;

functionCall
            :  functionName LPAREN parameters RPAREN
            ;

functionName
            :  IDENTIFIER
            ;

parameters
            :  parameter*
            ;

parameter
            :  expression (COMMA expression)*
            ;



