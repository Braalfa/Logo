import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.Pair;

public class StrictErrorStrategySpanish extends DefaultErrorStrategy {


    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            if (e instanceof NoViableAltException) {
                this.reportNoViableAlternative(recognizer, (NoViableAltException)e);
            } else if (e instanceof InputMismatchException) {
                this.reportInputMismatch(recognizer, (InputMismatchException)e);
            } else if (e instanceof FailedPredicateException) {
                this.reportFailedPredicate(recognizer, (FailedPredicateException)e);
            } else {
                System.err.println("error de reconocimiento de tipo desconocido: " + e.getClass().getName());
                recognizer.notifyErrorListeners(e.getOffendingToken(), e.getMessage(), e);
            }

        }
    }

    @Override
    protected void reportNoViableAlternative(Parser recognizer, NoViableAltException e) {
        TokenStream tokens = recognizer.getInputStream();
        String input;
        if (tokens != null) {
            if (e.getStartToken().getType() == -1) {
                input = "<FIN DE ARCHIVO>";
            } else {
                input = tokens.getText(e.getStartToken(), e.getOffendingToken());
            }
        } else {
            input = "<entrada desconocida>";
        }

        String msg = "no hay alternativas viables para la entrada : " + e.getOffendingToken().getText();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportInputMismatch(Parser recognizer, InputMismatchException e) {
        String msg = "entrada incompatible " + this.getTokenErrorDisplay(e.getOffendingToken());
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportFailedPredicate(Parser recognizer, FailedPredicateException e) {
        String ruleName = recognizer.getRuleNames()[recognizer.getContext().getRuleIndex()];
        String msg = "regla " + ruleName + " " + e.getMessage();
        recognizer.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    protected void reportUnwantedToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            String tokenName = this.getTokenErrorDisplay(t);
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "entrada desconocida " + tokenName;
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (!this.inErrorRecoveryMode(recognizer)) {
            this.beginErrorCondition(recognizer);
            Token t = recognizer.getCurrentToken();
            IntervalSet expecting = this.getExpectedTokens(recognizer);
            String msg = "falta " + expecting.toString(recognizer.getVocabulary()) + " en " + this.getTokenErrorDisplay(t);
            recognizer.notifyErrorListeners(t, msg, (RecognitionException)null);
        }
    }

    @Override
    protected Token getMissingSymbol(Parser recognizer) {
        Token currentSymbol = recognizer.getCurrentToken();
        IntervalSet expecting = this.getExpectedTokens(recognizer);
        int expectedTokenType = 0;
        if (!expecting.isNil()) {
            expectedTokenType = expecting.getMinElement();
        }

        String tokenText;
        if (expectedTokenType == -1) {
            tokenText = "<falta Fin de Archivo>";
        } else {
            tokenText = "<falta " + recognizer.getVocabulary().getDisplayName(expectedTokenType) + ">";
        }

        Token current = currentSymbol;
        Token lookback = recognizer.getInputStream().LT(-1);
        if (currentSymbol.getType() == -1 && lookback != null) {
            current = lookback;
        }

        return recognizer.getTokenFactory().create(new Pair(current.getTokenSource(), current.getTokenSource().getInputStream()), expectedTokenType, tokenText, 0, -1, -1, current.getLine(), current.getCharPositionInLine());
    }

    @Override
    protected String getTokenErrorDisplay(Token t) {
        if (t == null) {
            return "<no hay token>";
        } else {
            String s = this.getSymbolText(t);
            if (s == null) {
                if (this.getSymbolType(t) == -1) {
                    s = "<Fin de Archivo>";
                } else {
                    s = "<" + this.getSymbolType(t) + ">";
                }
            }

            return this.escapeWSAndQuote(s);
        }
    }

    /** Instead of recovering from exception e, rethrow it wrapped
     * in a generic RuntimeException so it is not caught by the
     * rule function catches. Exception e is the "cause" of the
     * RuntimeException.
     */
    @Override
    public void recover(Parser recognizer, RecognitionException e) {
        this.reportError(recognizer,e);
        throw new RuntimeException(e);
    }
    /** Make sure we don't attempt to recover inline; if the parser
     * successfully recovers, it won't throw an exception.
     */
    @Override
    public Token recoverInline(Parser recognizer)
            throws RecognitionException
    {
        throw new InputMismatchException(recognizer);
    }


    /** Make sure we don't attempt to recover from problems in subrules. */
    @Override
    public void sync(Parser recognizer){
    }

}

