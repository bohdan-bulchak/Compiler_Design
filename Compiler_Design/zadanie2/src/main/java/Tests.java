import java.io.BufferedReader;
import java.io.StringReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    void Test_0() {
        assertEquals(30, parser_0.expr());          // "(-5) * (-6)" = 30 ?
    }
    @Test
    void Test_1() {
        assertEquals(14, parser_1.expr());          // "2+3*4" = 14 ?
    }

    @Test
    void Test_2() {
        assertEquals(0, parser_2.expr());           // "2-8/4" = 0 ?
    }

    @Test
    void Test_3() {
        assertEquals(25, parser_3.expr());           // "5*(9-4)" = 25 ?
    }

    @Test
    void Test_4() {
        assertEquals(35, parser_4.expr());           // "(9/3) + (4*8)" = 35 ?
    }

    @Test
    void Test_5() {
        System.out.println("test5:");
        assertEquals(4, parser_5.expr());           // "2 + s2" = 4 ?
    }

    @Test
    void Test_6() {
        System.out.println("test6:");
        assertEquals(7, parser_6.expr());           // "(5 + 2" = 7 ?
    }

    @Test
    void Test_7() {
        System.out.println("test7:");
        assertEquals(4, parser_7.expr());           // "2 ++ 2" = 4 ?
    }

    @Test
    void Test_8() {
        assertEquals(15, parser_8.expr());           // "5 * (9 / (1 + 2)) " = 15 ?
    }

    @Test
    void Test_9() {
        assertEquals(5, parser_9.expr());           // "((((5+3) * 5) + (2 + 3)) / 9) " = 5 ?
    }

    BufferedReader reader_0 = new BufferedReader(new StringReader("(-5) * (-6)"));
    Lexer lexer_0 = new Lexer(reader_0);
    Parser parser_0 =  new Parser(lexer_0);

    BufferedReader reader_1 = new BufferedReader(new StringReader("2+3*4"));
    Lexer lexer_1 = new Lexer(reader_1);
    Parser parser_1 =  new Parser(lexer_1);


    BufferedReader reader_2 = new BufferedReader(new StringReader("2-8/4"));
    Lexer lexer_2 = new Lexer(reader_2);
    Parser parser_2 =  new Parser(lexer_2);

    BufferedReader reader_3 = new BufferedReader(new StringReader("5*(9-4)"));
    Lexer lexer_3 = new Lexer(reader_3);
    Parser parser_3 =  new Parser(lexer_3);

    BufferedReader reader_4 = new BufferedReader(new StringReader("(9/3) + (4*8)"));
    Lexer lexer_4 = new Lexer(reader_4);
    Parser parser_4 =  new Parser(lexer_4);

    BufferedReader reader_5 = new BufferedReader(new StringReader("2 + s2"));
    Lexer lexer_5 = new Lexer(reader_5);
    Parser parser_5 =  new Parser(lexer_5);

    BufferedReader reader_6 = new BufferedReader(new StringReader("(5 + 2"));
    Lexer lexer_6 = new Lexer(reader_6);
    Parser parser_6 =  new Parser(lexer_6);

    BufferedReader reader_7 = new BufferedReader(new StringReader("2 ++ 2"));
    Lexer lexer_7 = new Lexer(reader_7);
    Parser parser_7 =  new Parser(lexer_7);

    BufferedReader reader_8 = new BufferedReader(new StringReader("5 * (9 / (1 + 2))"));
    Lexer lexer_8 = new Lexer(reader_8);
    Parser parser_8 =  new Parser(lexer_8);

    BufferedReader reader_9 = new BufferedReader(new StringReader("(((5+3) * 5) + (2 + 3) / 9)"));
    Lexer lexer_9 = new Lexer(reader_9);
    Parser parser_9 =  new Parser(lexer_9);

}
