import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class SyntaxErrorListener extends BaseErrorListener {

    private String errorMessage;
    private boolean errorDetected;
    public SyntaxErrorListener() {
        super();
        errorMessage="";
        errorDetected=false;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        errorDetected=true;
        errorMessage += "linea " + line + ":" + charPositionInLine + ": " + msg + "\n\n";

    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isErrorDetected() {
        return errorDetected;
    }
}