grammar Mecoregrammar;

mecoresig : vardef* probconds;

vardef      : 'var' values '->' varid ';';
values      :  valueid? (',' valueid)*;  

probconds   : probcond? (',' probcond)*;
probcond    : cond '[' PROB ']';
cond        : '(' concl '|' prem ')' | '(' concl ')'; 


concl       : form;
prem        : form;

form        : implication (COIMPLIC implication)*;
implication : disjunction (IMPLIC disjunction)*;
disjunction : conjunction (OR conjunction)*;
conjunction : negation (AND negation)*;
negation    : NOT parentform | parentform;
parentform  : atom | '(' form ')';
atom        : varid | varid '=' valueid;  


varid : UPPERC | LOWERC;
valueid : LOWERC;


COIMPLIC : '<=>';
IMPLIC   : '=>';
OR       : '+' | ';' | 'or';
AND      : '*' | ',' | 'and';
NOT      : '!' | 'not';


UPPERC : ('A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
LOWERC : ('a'..'z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

PROB : ('0'..'9')+ ('.' ('0'..'9')+)?;

WS           :   [ \t\n\r]+ -> skip ;
LINE_COMMENT :   ('//' | '#') .*? '\n' -> skip ;
COMMENT      :   '/*' .*? '*/' -> skip ;

