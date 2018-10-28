lexer grammar CoolLexer;

tokens { ERROR } 



@members{    
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}

CLASS : 'class';

INHERITS : 'inherits';
FIRSTEVAL : 'not' | '~' | 'isvoid';
NEW : 'new';
IF:'if';
THEN :'then';
ELSE:'else';
FI:'fi';
BOOL : 'false' | 'true';
WHILE : 'while';
LOOP :'loop';
POOL:'pool';
LET : 'let';
IN : 'in';
fragment LETTER: [a-zA-Z];
ID : (LETTER | '_')(LETTER | '_' | DIGIT)*;
PV:';';
fragment DIGIT : [0-9];
INT : DIGIT+;
AS : '{';
AD:'}';
DP : ':';
ATRIBUIRE : '<-';
PS : '(';
PD : ')';
VIRGULA: ',';
STRING : '"' ('\\"' | .)*? '"';

ARITMETIC : ('+'|'*'|'-'|'/');
PUNCT : '.';
AT: '@';





INEGALITATI : '<='|'>='|'<'|'>'|'=';
WS
    :   [ \n\f\r\t]+ -> skip
    ;


        // match integers
NEWLINE:'\r'? '\n' -> skip;  // return newlines to parser (is end-statement signal)
