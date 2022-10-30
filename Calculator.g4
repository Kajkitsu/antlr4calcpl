grammar Calculator;

expr: op=('*'|'/') expr expr # MulDiv
    | op=('+'|'-') expr expr # AddSub
    | INT                    # Int
    ;

INT: [0-9]+ ;
DOT: '.';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
WS : [ \t\r\n]+ -> skip ;
