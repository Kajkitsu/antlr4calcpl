grammar Calculator;

expr: op=('*'|'/') expr expr # MulDiv
    | op=('+'|'-') expr expr # AddSub
    | INT                    # Int
    ;

INT: [0-9]+ ;
MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;
WS : [ \t\r\n]+ -> skip ;
