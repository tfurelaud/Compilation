package ubordeaux.deptinfo.compilation.project.main;

import beaver.Symbol;
import beaver.Scanner;

%%

%class ScannerExp
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
    return new Symbol(Terminals.EOF);
%eofval}
%unicode
%line
%column
%{
    // Petit helpers pour simplifier la création de token.
    // On retient la position de chaque token pour la gestion d'erreur
    // voir beaver-rt/src/main/java/beaver/Symbol.java
    private Symbol newToken(short id)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), null);
    }

    private Symbol newToken(short id, Object value)
    {
        return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
    }

%}

Integer = [0-9]+
Identifier = [a-zA-Z0-9]+
Commentaire = \/\*(.*\n*)*\*\/
SimpleCommentaire = \/\/.*\n
String = [\"]~[\"]
Hexadecimal = 0[xX][0-9a-fA-F]+

%%
"+"    {System.out.print(yytext());return newToken(Terminals.TOKEN_PLUS);}
"-"    {System.out.print(yytext());return newToken(Terminals.TOKEN_MINUS);}
"*" {System.out.print(yytext());return newToken(Terminals.TOKEN_TIMES);}
"/" {System.out.print(yytext());return newToken(Terminals.TOKEN_DIV);}
";"    {System.out.println(yytext());return newToken(Terminals.TOKEN_SEMIC);}
":"    {System.out.print(yytext());return newToken(Terminals.TOKEN_COLON);}
".." {System.out.print(yytext());return newToken(Terminals.TOKEN_DOTDOT);}
"^"    {System.out.print(yytext());return newToken(Terminals.TOKEN_CIRC);}
","    {System.out.print(yytext());return newToken(Terminals.TOKEN_COMMA);}
"("    {System.out.print(yytext());return newToken(Terminals.TOKEN_LPAR);}
")"    {System.out.print(yytext());return newToken(Terminals.TOKEN_RPAR);}
"=" {System.out.print(yytext());return newToken(Terminals.TOKEN_AFF);}
"==" {System.out.print(yytext());return newToken(Terminals.TOKEN_EQ);}
"<=" {System.out.print(yytext());return newToken(Terminals.TOKEN_LE);}
"<"  {System.out.print(yytext());return newToken(Terminals.TOKEN_LT);}
">"  {System.out.print(yytext());return newToken(Terminals.TOKEN_GT);}
">=" {System.out.print(yytext());return newToken(Terminals.TOKEN_GE);}
"!=" {System.out.print(yytext());return newToken(Terminals.TOKEN_NE);}
"!"  {System.out.print(yytext());return newToken(Terminals.TOKEN_NOT);}
"{"  {System.out.print(yytext());return newToken(Terminals.TOKEN_LBRACE);}
"}"  {System.out.print(yytext());return newToken(Terminals.TOKEN_RBRACE);}
"["  {System.out.print(yytext());return newToken(Terminals.TOKEN_LBRACKET);}
"]"  {System.out.print(yytext());return newToken(Terminals.TOKEN_RBRACKET);}
"||" {System.out.print(yytext());return newToken(Terminals.TOKEN_OR);}
"&&" {System.out.print(yytext());return newToken(Terminals.TOKEN_AND);}
"if" {System.out.print(yytext());return newToken(Terminals.TOKEN_IF);}
"else" {System.out.print(yytext());return newToken(Terminals.TOKEN_ELSE);}
"while" {System.out.print(yytext());return newToken(Terminals.TOKEN_WHILE);}
"do" {System.out.println(yytext());return newToken(Terminals.TOKEN_DO);}
"then" {System.out.print(yytext());return newToken(Terminals.TOKEN_THEN);}
"switch" {System.out.print(yytext());return newToken(Terminals.TOKEN_SWITCH);}
"case" {System.out.print(yytext());return newToken(Terminals.TOKEN_CASE);}
"default" {System.out.print(yytext());return newToken(Terminals.TOKEN_DEFAULT);}
"type" {System.out.print(yytext() + " ");return newToken(Terminals.TOKEN_TYPE);}
"string" {System.out.print(yytext());return newToken(Terminals.TOKEN_STRING);}
"integer" {System.out.print(yytext());return newToken(Terminals.TOKEN_INTEGER);}
"boolean" {System.out.print(yytext());return newToken(Terminals.TOKEN_BOOLEAN);}
"array" {System.out.print(yytext());return newToken(Terminals.TOKEN_ARRAY);}
"of" {System.out.print(yytext());return newToken(Terminals.TOKEN_OF);}
"struct" {System.out.print(yytext());return newToken(Terminals.TOKEN_STRUCT);}
"var" {System.out.print(yytext() + " ");return newToken(Terminals.TOKEN_VAR);}
"procedure" {System.out.print(yytext());return newToken(Terminals.TOKEN_PROCEDURE);}
"function" {System.out.print(yytext());return newToken(Terminals.TOKEN_FUNCTION);}
"begin" {System.out.println(yytext());return newToken(Terminals.TOKEN_BEGIN);}
"end" {System.out.println(yytext());return newToken(Terminals.TOKEN_END);}
"new" {System.out.print(yytext());return newToken(Terminals.TOKEN_NEW);}
"dispose" {System.out.print(yytext());return newToken(Terminals.TOKEN_DISPOSE);}
"print" {System.out.print(yytext());return newToken(Terminals.TOKEN_PRINTLN);}
"println" {System.out.print(yytext());return newToken(Terminals.TOKEN_PRINTLN);}
"readln" {System.out.print(yytext());return newToken(Terminals.TOKEN_READLN);}
"return" {System.out.print(yytext());return newToken(Terminals.TOKEN_RETURN);}
"true" {System.out.print(yytext());return newToken(Terminals.TOKEN_TRUE);}
"false" {System.out.print(yytext());return newToken(Terminals.TOKEN_FALSE);}
"null" {System.out.print(yytext());return newToken(Terminals.TOKEN_NULL);}

{Hexadecimal}  { System.out.print(yytext());return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt(yytext().replace("0x",""),16)); } 
{Integer}    {System.out.print(yytext());return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt(yytext()));    }
{Identifier}    {System.out.print(yytext());return newToken(Terminals.TOKEN_IDENTIFIER, yytext());}
{String}    {System.out.print(yytext());return newToken(Terminals.TOKEN_LIT_STRING, yytext());}
{SimpleCommentaire}   {}
{Commentaire}    {}


[\s] {}

[^]    {throw new Scanner.Exception("caractère inattendu '" + yytext() + "'");    }