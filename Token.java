package com.craftinginterpreters.lox;

class Token{
    final TokenType type;
    final String lemme;
    final Object literal;
    final int line;
    

    Token(TokenType type, String lemme, Object literal, int line){
        this.type = type;
        this.lemme = lemme;
        this.literal = literal;
        this.line = line;

    }

    public String toString(){
        return type + " " + lemme + " " + literal;
    }
}
