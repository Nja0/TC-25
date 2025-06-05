grammar MiLenguaje;

programa
    : (s)* EOF
    ;

s : IF c THEN  s (ELSE s)?
  | a
  ;

c : e RELOP e 
  | TRUE
  | FALSE
  ;

e : e SUM t
  | t
  ;

t : f
  | t MUL f
  ;

f : ID
  | INTEGER
  | PA e PC
  ;

a : ID ASSING e ;

PA   : '(' ;
PC   : ')' ;
CA   : '[' ;
CC   : ']' ;
LA   : '{' ;
LC   : '}' ;

PYC  : ';' ;
COMA : ',' ;

ASSING : ':=' ;
RELOP : 'relop' ;

IGUAL : '=' ;

MAYOR  : '>' ;
MAYOR_IGUAL: '>=' ;
MENOR  : '<' ;
MENOR_IGUAL: '<=' ;
EQL  : '==' ;
DISTINTO  : '!=' ;

SUM  : '+' ;
RES  : '-' ;
MUL  : '*' ;
DIV  : '/' ;
MOD  : '%' ;

TRUE : 'true' ;
FALSE : 'false' ;

OR   : '||' ;
AND  : '&&' ;
NOT  : '!'  ;

FOR   : 'for' ;
WHILE : 'while' ;

IF    : 'if' ;
ELSE  : 'else' ;

THEN : 'then' ;

INT     : 'int' ;
CHAR    : 'char' ;
DOUBLE  : 'double' ;
VOID    : 'void' ;

RETURN : 'return' ;

ID : (LETRA | '_') (LETRA | DIGITO | '_')* ;
INTEGER : DIGITO+ ;
DECIMAL : INTEGER '.' INTEGER ;
CHARACTER : '\'' (~['\r\n] | '\\' .) '\'' ;

COMENTARIO_LINEA : '//' ~[\r\n]* -> skip ;
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip ;

WS : [ \r\n\t] -> skip ;

OTRO : . ;

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;