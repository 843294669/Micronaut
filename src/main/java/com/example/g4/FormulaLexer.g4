lexer grammar FormulaLexer;

// Whitespace
WHITESPACE              : [ \t\n\r\p{White_Space}] -> skip ;

// Separators
LPAREN                  : '('                              ;
RPAREN                  : ')'                              ;

//
COMMA                   : ','                              ;
QUESTION                : '?'                              ;
COLON                   : ':'                              ;
ASSIGN                  : '='                              ;

ASSIGN_PLUS             : '+='                             ;
ASSIGN_MINUS            : '-='                             ;
ASSIGN_MUL              : '*='                             ;
ASSIGN_DIV              : '/='                             ;
ASSIGN_MOD              : '%='                             ;
ASSIGN_BIT_SHL          : '<<='                            ;
ASSIGN_BIT_SHR          : '>>='                            ;
ASSIGN_BIT_USHR         : '>>>='                           ;
ASSIGN_BIT_AND          : '&='                             ;
ASSIGN_BIT_XOR          : '^='                             ;
ASSIGN_NOT              : '|='                             ;

// Equals and Compares
IDENTICALLY_EQUAL       : '==='                            ;
IDENTICALLY_EQUAL_NOT   : '!=='                            ;
EQ                      : '=='                             ;
NE                      : '!='                             ;
GT                      : '>'                              ;
LT                      : '<'                              ;
GE                      : '>='                             ;
LE                      : '<='                             ;

// Condition
AND                     : '&&'                             ;
OR                      : '||'                             ;
NOT                     : '!'                              ;

// Unary and Binary Operators
PLUS                    : '+'                              ;
DOUBLE_PLUS             : '++'                             ;
MINUS                   : '-'                              ;
DOUBLE_MINUS            : '--'                             ;
MUL                     : '*'                              ;
DIV                     : '/'                              ;
MOD                     : '%'                              ;

// Bitwise Operators
BIT_AND                 : '&'                              ;
BIT_OR                  : '|'                              ;
BIT_NOT                 : '~'                              ;
BIT_XOR                 : '^'                              ;
BIT_SHL                 : '<<'                             ;
BIT_SHR                 : '>>'                             ;
BIT_USHR                : '>>>'                            ;

// Id
IDENTIFIER              : [a-zA-Z_$][a-zA-Z0-9_$]*         ;

// Number
INTEGER                 : INT [lLfFdD]?                    ;
INTEGER_HEX             : '0x' HEX+ [lL]?                  ;
FLOATING_POINT          : INT ('.' FRAC)? EXP? [fFdD]?     ;
fragment INT            : '0' | [1-9] [0-9]*               ;
fragment FRAC           : [0-9]+                           ;
fragment EXP            : [Ee] [+\-]? INT                  ;

// String
STRING_DOUBLE           : '"'  (ESC|OTHERS)*? '"'          ;
STRING_SINGLE           : '\'' (ESC|OTHERS)*? '\''         ;
fragment OTHERS         : ~('\\' | '\r' | '\n')            ;
fragment ESC            : '\\' ([btnfr"'\\]|UNICODE)       ;
fragment UNICODE        : 'u' HEX HEX HEX HEX              ;
fragment HEX            : [0-9a-fA-F]                      ;
