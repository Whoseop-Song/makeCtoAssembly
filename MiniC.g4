grammar MiniC;

program	: decl+			;
decl		: var_decl		
		| fun_decl		;
var_decl	:  type_spec IDENT ';'
		| type_spec IDENT '=' LITERAL ';'	
		| type_spec IDENT '[' LITERAL ']' ';'	;
type_spec	: VOID				
		| INT				;
fun_decl	: type_spec IDENT '(' params ')' compound_stmt ;
params		: param (',' param)*		
		| VOID				
		|				;
param		: type_spec IDENT		
		| type_spec IDENT '[' ']'	;
stmt		: expr_stmt			
		| compound_stmt			
		| if_stmt			
		| while_stmt
		| for_stmt
		| switch_stmt
		| case_stmt			
		| return_stmt			;
switch_stmt: SWITCH '(' expr ')' stmt		;
case_stmt: CASE expr ':' (expr_stmt)*;
while_stmt	: WHILE '(' expr ')' stmt	;
for_stmt	: FOR '(' expr ';' expr ';' expr ')' stmt	;
compound_stmt: '{' local_decl* stmt* '}'	;
local_decl	: type_spec IDENT ';'
		| type_spec IDENT '=' LITERAL ';'	
		| type_spec IDENT '[' LITERAL ']' ';'	;
if_stmt		: IF '(' expr ')' stmt		
		| IF '(' expr ')' stmt ELSE stmt 		;
return_stmt	: RETURN ';'			
		| RETURN expr ';'				;

expr_stmt	: expr ';'
			| BREAK ';'
			| CONTINUE ';'			;

//expr	:  LITERAL				
//	| '(' expr ')'				 
//	| IDENT				 
//	| IDENT '[' expr ']'			 
//	| IDENT '(' args ')'			
//	| '-' expr				 
//	| '+' expr				 
//	| '--' expr				 
//	| '++' expr				 
//	| expr '*' expr				 
//	| expr '/' expr				 
//	| expr '%' expr				 
//	| expr '+' expr				 
//	| expr '-' expr				 
//	| expr EQ expr				
//	| expr NE expr				 
//	| expr LE expr				 
//	| expr '<' expr				 
//	| expr GE expr				 
//	| expr '>' expr				 
//	| '!' expr					 
//	| expr AND expr				 
//	| expr OR expr				
//	| IDENT '=' expr			
//	| IDENT '[' expr ']' '=' expr		;

		
expr	: IDENT '=' expr
 		| IDENT '[' expr ']' '=' expr 
		| orexpr expr1
 		| orexpr ;
expr1	: OR orexpr expr1 
		| ;

orexpr  : andexpr orexpr1
		| andexpr ;
orexpr1 : AND andexpr orexpr1 
		| ;

andexpr : eqexpr andexpr1				
		| eqexpr;
andexpr1: EQ eqexpr andexpr1				
		| NE eqexpr andexpr1
		|	;
				 
eqexpr	: cpexpr eqexpr1				 
		| cpexpr	;
eqexpr1 : LE cpexpr eqexpr1				 
		| '<' cpexpr eqexpr1				 
		| GE cpexpr eqexpr1				 
		| '>' cpexpr eqexpr1
		|	;

cpexpr  : arithexpr cpexpr1
	    | arithexpr;
cpexpr1 : '+' arithexpr cpexpr1
		| '-' arithexpr cpexpr1
		| ;
		
arithexpr : geoexpr arithexpr1
		|	geoexpr;
arithexpr1 : '*' geoexpr arithexpr1
		|	'/' geoexpr arithexpr1
		|	'%' geoexpr arithexpr1
		|	;
		
geoexpr : '-' oneexpr				 
		| '+' oneexpr				 
		| '--' oneexpr				 
		| '++' oneexpr
		| oneexpr;
		
oneexpr  : LITERAL				
	| '(' expr ')'				 
	| IDENT				 
	| IDENT '[' expr ']'			 
	| IDENT '(' args ')' ;
	    
args	: expr (',' expr)*			 
	|					 ;

VOID: 'void';
INT: 'int';

WHILE: 'while';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
FOR: 'for';
SWITCH : 'switch';
CASE : 'case';
OR: 'or';
AND: 'and';
BREAK: 'break';
CONTINUE: 'continue';
LE: '<=';
GE: '>=';
EQ: '==';
NE: '!=';
IDENT  : [a-zA-Z_]
        (   [a-zA-Z_]
        |  [0-9]
        )*;


LITERAL:   DecimalConstant     |   OctalConstant     |   HexadecimalConstant     ;


DecimalConstant
    :   '0'
	|   [1-9] [0-9]*
    ;

OctalConstant
    :   '0'[0-7]*
    ;

HexadecimalConstant
    :   '0' [xX] [0-9a-fA-F] +
    ;

WS  :   (   ' '
        |   '\t'
        |   '\r'
        |   '\n'
        )+
	-> channel(HIDDEN)	 
    ;
