lexer grammar Lexer;

LEFT_OVAL_BRACKET:             '(';
RIGHT_OVAL_BRACKET:             ')';
LEFT_CURLY_BRACKET:             '{';
RIGHT_CURLY_BRACKET:             '}';
DOT:                '.';
BIT_OR:              '|';
SEMICOLON:               ';';
ASSIGN:             '=';

VAR:                'var';
NEW:                'new';

TRY:                'try';
CATCH:              'catch';
FINALLY:            'finally';

WS:                 [ \t\r\n\u000C]+ -> channel(HIDDEN);

IDENTIFIER: Letter LetterOrDigit*;

fragment LetterOrDigit
    : Letter
    | [0-9]
    ;

fragment Letter
    : [a-zA-Z$_];