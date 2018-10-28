parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

program:   (stat PV)+ ;

stat:   decclass
    |   decvar
    |   decfunctie
    |   asigvar
    |   expresie
    |   funccall
    |   objectfunccall
    |   ifthenelse
    |   whileloop
    |   letstat
    ;
decclass:   CLASS ID (INHERITS ID)? body;
decvar: ID DP ID (ATRIBUIRE (expresie|STRING))*;
decfunctie: header body;
asigvar : ID ATRIBUIRE (ID ATRIBUIRE)* expresie;
funccall : ID PS expresi PD;
objectfunccall : ID PUNCT funccall;
ifthenelse :IF expresie THEN stat ELSE stat FI;
whileloop : WHILE expresie LOOP stat POOL;
letstat : LET decvars IN (expresie|body);
expresie:  expresie (ARITMETIC| INEGALITATI) expresie
        | FIRSTEVAL expresie
        | INT
        | BOOL
        | newobject
        | dispatch
        | ID
        | '(' expresie ')'
         ;
header: ID PS (decvars)*  PD DP ID;
body: AS (stat| (stat PV)*) AD ;
expresi : expresie ( VIRGULA expresie)*;
decvars:   decvar (VIRGULA decvar)*;
newobject : NEW ID;
dispatch : (ID|newobject) AT ID (PUNCT funccall)+;