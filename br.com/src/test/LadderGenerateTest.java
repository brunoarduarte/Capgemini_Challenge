package test;

import main.LadderGenerate;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LadderGenerateTest {

    private static final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUp(){
        System.setOut( new PrintStream(outputContent));
    }

    @AfterAll
    public static void cleanUp() {
        System.setOut(null);
    }

    @Test
    @DisplayName("Testa o comportamento do método create da classe LadderGenerate")
    public void testLadderGenerateWorks() {
        LadderGenerate ladder = new LadderGenerate();
        ladder.create(6);

        StringBuilder strB = new StringBuilder();
        strB.append("     *");
        strB.append(System.getProperty("line.separator"));
        strB.append("    **");
        strB.append(System.getProperty("line.separator"));
        strB.append("   ***");
        strB.append(System.getProperty("line.separator"));
        strB.append("  ****");
        strB.append(System.getProperty("line.separator"));
        strB.append(" *****");
        strB.append(System.getProperty("line.separator"));
        strB.append("******");
        strB.append(System.getProperty("line.separator"));

        Assertions.assertEquals(strB.toString(), outputContent.toString());
    }
}