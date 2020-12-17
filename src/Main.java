import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream("suma 1 2 3 5 4 8 9");
// create a lexer that feeds off of input CharStream
        logoLexer lexer = new logoLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        logoParser parser = new logoParser(tokens);
        ParseTree tree = parser.suma(); // begin parsing at init rule
        System.out.println(tree.toStringTree()); // print LISP-style tree
        logoBaseVisitor extractor = new logoBaseVisitor();
        System.out.println(extractor.visit(tree).get(0).getDatoAsInteger());
    }
}