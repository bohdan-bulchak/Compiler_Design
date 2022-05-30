public class Parser {

    private Token symbol;
    private final Lexer lexer;
    
    public Parser(Lexer lexer) {
        this.lexer = lexer;
        consume();
    }


    public int expr() {
        int value = mul();
        while (symbol == Token.PLUS) {
            consume();
            switch (symbol) {
                case NUMBER -> value += mul();
                case LPAR -> {
                    consume();
                    value += expr();
                }
            }
        }
        while (symbol == Token.MINUS) {
            consume();
            switch (symbol) {
                case NUMBER -> value -= mul();
                case LPAR -> {
                    consume();
                    value -= expr();
                }
            }
        }
        return value;

    }

    private int mul() {
        int value = term();
        while (symbol == Token.MUL) {
            consume();
            switch (symbol) {
                case NUMBER -> value *= term();
                case LPAR -> {
                    consume();
                    value *= expr();
                }
            }
        }
        while (symbol == Token.DIV) {
            consume();
            switch (symbol) {
                case NUMBER -> value /= term();
                case LPAR -> {
                    consume();
                    value /= expr();
                }
            }
        }

        return value;
    }

    private int term() {
        int value;
        if (symbol == Token.MINUS) {
            value = -statement();
        }
        else {
            value = statement();
        }
        return value;
    }

    public int statement() {
        int value = 0;
        switch (symbol) {
            case NUMBER -> {
                value = lexer.getValue();
                consume();
            }
            case LPAR -> {
                consume();
                value = expr();
                if (symbol != Token.RPAR) {
                    System.out.println("Nespravny format - chyba zatvorka");
                    return 0;
                }
                consume();

            }
            case EOF -> {
                return 0;
            }
            default -> {
                return value;
            }
        }
        return value;
    }

    private void consume() {
        symbol = lexer.nextToken();
    }

}
