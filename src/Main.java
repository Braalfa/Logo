import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input
        String texto = "suma 1 1";
        ANTLRInputStream input = new ANTLRInputStream(texto);
        //Se crea el error listener
        SyntaxErrorListener errorListener = new SyntaxErrorListener();

        // create a lexer that feeds off of input CharStream
        logoLexer lexer = new logoLexer(input);

        //Agregar error listener al lexer
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener); // add ours

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create a parser that feeds off the tokens buffer
        logoParser parser = new logoParser(tokens);

        parser.removeErrorListeners(); // remove ConsoleErrorListener
        //Se agrega el error listener
        parser.addErrorListener(errorListener); // add ours
        parser.setErrorHandler(new DefaultErrorStrategySpanish());

        ParseTree tree = parser.tokenNumerico();
        // begin parsing at init rule

        //Checking for syntax errors
        if(!errorListener.isErrorDetected()){
            System.out.println(tree.toStringTree());
            // print LISP-style tree
            logoBaseVisitor extractor = new logoBaseVisitor();
            List<Dato> datos=extractor.visit(tree);
            for(Dato dato: datos){
                System.out.println(dato.toString());
            }
        }else {
            System.out.println(errorListener.getErrorMessage());
        }
    }
}