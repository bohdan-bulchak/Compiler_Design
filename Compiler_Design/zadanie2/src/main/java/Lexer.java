import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;



public class Lexer {
    private int current;
    private int value;
    private Reader input;

    public Lexer(BufferedReader input) {
        this.input = input;
    }

    public Token nextToken() {
        int temp_current = current;
        consume();
        if (temp_current == current && current != ' ' && current != '(' && current != ')') {
            System.out.println("Nespravny format - opakovanie operacii");
            return Token.EOF;
        }
        return switch (current) {
            case ' ' ->
                    nextToken();
            case '+' ->
                    Token.PLUS;
            case '-' ->
                    Token.MINUS;
            case '*' ->
                    Token.MUL;
            case '/' ->
                    Token.DIV;
            case '(' ->
                    Token.LPAR;
            case ')' ->
                    Token.RPAR;
            case '\n' -> Token.EOF;
            default -> Token.NUMBER;
        };
    }

    private void consume() {
        try {
            current = input.read();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getValue() {
        if (current >= 48 && current <= 57) {
            char cur_temp = (char) current;
            return Integer.parseInt(String.valueOf(cur_temp));
        }
        else {
            System.out.println("Neplatny znak");
        }
        return 0;
    }

}
