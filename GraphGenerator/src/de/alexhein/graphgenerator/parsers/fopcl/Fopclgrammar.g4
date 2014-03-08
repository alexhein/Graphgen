grammar Fopclgrammar;

fopclsig : sortdef* preddef* probcond*;

sortdef : sort_id '=' '{' consts '}';
consts : const_id? (',' const_id)*;


preddef :  pred_id '(' sorts ')' | pred_id ;
sorts : sort_id? (',' sort_id)*;

probcond : '<' '(' cond ')' '[' PROB ']' constrs '>';


constrs : ( ',' constr )*;
constr : neqconstr | eqconstr;

neqconstr : 
	  (var_id nequ const_id)
	| (const_id nequ var_id)
	| (var_id nequ '(' consts ')')
	| ('(' consts ')' nequ var_id) 
        | (var_id nequ var_id);

eqconstr : 
	  (var_id equ const_id)
	| (const_id equ var_id)
	| (var_id equ '(' consts ')')
	| ('(' consts ')' equ var_id)
	| (var_id equ var_id);

cond : concl | (concl '|' prem);

concl : form;
prem : form;

form        : implication (coimplic implication)*;
implication : disjunction (implic disjunction)*;
disjunction : conjunction (or conjunction)*;
conjunction : negation (and negation)*;
negation    : not parentform | parentform;
parentform  : atom | '(' form ')';

atom        : pred_id | pred_id  '(' args ')';
args        : (var_id | const_id)? (',' (var_id | const_id))*;


var_id : UPPERC;
const_id : LOWERC;
pred_id : UPPERC | LOWERC;
sort_id : UPPERC;

nequ     : '!=';
coimplic : '<=>';
implic   : '=>';
or       : '+' | ';' | 'or';
and      : '*' | ',' | 'and';
not      : '!' | 'not';
equ      : '=';



UPPERC : ('A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
LOWERC : ('a'..'z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;

PROB : ('0'..'9')+ ('.' ('0'..'9')+)?;

WS           :   [ \t\n\r]+ -> skip ;
LINE_COMMENT :   ('//' | '#') .*? '\n' -> skip ;
COMMENT      :   '/*' .*? '*/' -> skip ;






