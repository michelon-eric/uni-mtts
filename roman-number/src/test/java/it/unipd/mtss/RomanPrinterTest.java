////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RomanPrinterTest {
    @Test
    public void testPrint1_shouldContainAsciiI() {
        int number = 1;
        String result = RomanPrinter.print(number);
        assertNotNull(result);
        assertEquals(
            " ___  \n" +
            "|_ _| \n" +
            " | |  \n" +
            " | |  \n" +
            "|___| \n",
            result
        );
    }

    @Test
    public void testPrint1_shouldContainAsciiIV() {
        int number = 4;
        String result = RomanPrinter.print(number);
        assertNotNull(result);
        assertEquals(
            " ___  __     __ \n" +
                "|_ _| \\ \\   / / \n" +
                " | |   \\ \\ / /  \n" +
                " | |    \\ V /   \n" +
                "|___|    \\_/    \n",
            result
        );
    }

    @Test
    public void testPrint5_shouldContainAsciiV() {
        int number = 5;
        String result = RomanPrinter.print(number);
        assertNotNull(result);
        assertEquals(
            "__     __ \n" +
                "\\ \\   / / \n" +
                " \\ \\ / /  \n" +
                "  \\ V /   \n" +
                "   \\_/    \n",
            result
        );
    }

    @Test
    public void testPrint10_shouldContainAsciiX() {
        int number = 10;
        String result = RomanPrinter.print(number);
        assertNotNull(result);
        assertEquals(
            "__  __ \n" +
                "\\ \\/ / \n" +
                " \\  /  \n" +
                " /  \\  \n" +
                "/_/\\_\\ \n",
            result
        );
    }

    @Test
    public void testPrint6_shouldContainAsciiVI() {
        int number = 6;
        String result = RomanPrinter.print(number);
        assertNotNull(result);
    }
}
