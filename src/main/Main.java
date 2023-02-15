package main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import main.parser.StupidLangLexer;
import main.parser.StupidLangParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        StupidLangLexer lexer;

        StupidLangParser parser;

        lexer = new StupidLangLexer(CharStreams.fromFileName("tom.stupid"));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        parser = new StupidLangParser(tokenStream);

        parser.programa();
    }
}