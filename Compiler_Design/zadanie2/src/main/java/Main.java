import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    //private static Reader input; (9/(3*(1+2))) (2+3) * (3 - 5)

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            Lexer lexer = new Lexer(reader);

            int result = new Parser(lexer).expr();

            System.out.printf("\nResult %d\n", result);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
