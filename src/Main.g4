parser grammar Main;

options { tokenVocab=Lexer; }

codeBlock
    : '{' tryStatement* '}'
    ;

identifier
    : IDENTIFIER
    ;

tryStatement
	:	'try' codeBlock catchBlock+
	|	'try' codeBlock catchBlock* finallyBlock
	|	'try' resourceSpecification codeBlock catchBlock+
	|   'try' resourceSpecification codeBlock catchBlock* finallyBlock
	;

catchBlock
    : 'catch' '(' catchClassTypes identifier ')' codeBlock
    ;

catchClassTypes
    : className ('|' className)*
    ;

finallyBlock
    : 'finally' codeBlock
    ;

resourceSpecification
    : '(' resource ')'
    ;

resource
    : ('var'|className) identifier '=' classInitialization
    | identifier
    ;

className
    : identifier
    | 'var'
    ;

classInitialization : 'new' className '(' ')';


