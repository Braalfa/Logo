import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
public class Main {
    public static void main(String[] args) throws Exception {
// create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream("//sdsadsa \n haz uno 4");
// create a lexer that feeds off of input CharStream
        logoLexer lexer = new logoLexer(input);
// create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
// create a parser that feeds off the tokens buffer
        logoParser parser = new logoParser(tokens);
        ParseTree tree = parser.programa(); // begin parsing at init rule
        System.out.println(tree.toStringTree()); // print LISP-style tree
        logoBaseListener extractor = new logoBaseListener();

        ParseTreeWalker.DEFAULT.walk(extractor, tree); // initiate walk of tree with listener in use of default walker

    }
}