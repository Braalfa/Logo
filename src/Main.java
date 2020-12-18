import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        String texto= "diferencia 1 1-1-1";
        ANTLRInputStream input = new ANTLRInputStream(texto);
        // create a lexer that feeds off of input CharStream
        logoLexer lexer = new logoLexer(input);
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        logoParser parser = new logoParser(tokens);
        ParseTree tree = parser.tokenNumerico();
        // begin parsing at init rule
        System.out.println(tree.toStringTree());
        // print LISP-style tree
        logoBaseVisitor extractor = new logoBaseVisitor();
        List<Dato> datos=extractor.visit(tree);
        for(Dato dato: datos){
            System.out.println(dato.toString());
        }
    }
}