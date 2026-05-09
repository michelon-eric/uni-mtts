////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() {
        int number = 1;
        String result = IntegerToRoman.convert(number);
        assertEquals("I", result);
    }

    @Test
    public void testConvert2() {
        int number = 2;
        String result = IntegerToRoman.convert(number);
        assertEquals("II", result);
    }

    @Test
    public void testConvert3() {
        int number = 3;
        String result = IntegerToRoman.convert(number);
        assertEquals("III", result);
    }

    @Test
    public void testConvert4() {
        int number = 4;
        String result = IntegerToRoman.convert(number);
        assertEquals("IV", result);
    }

    @Test
    public void testConvert5() {
        int number = 5;
        String result = IntegerToRoman.convert(number);
        assertEquals("V", result);
    }

    @Test
    public void testConvert6() {
        int number = 6;
        String result = IntegerToRoman.convert(number);
        assertEquals("VI", result);
    }

    @Test
    public void testConvert7() {
        int number = 7;
        String result = IntegerToRoman.convert(number);
        assertEquals("VII", result);
    }

    @Test
    public void testConvert8() {
        int number = 8;
        String result = IntegerToRoman.convert(number);
        assertEquals("VIII", result);
    }

    @Test
    public void testConvert9() {
        int number = 9;
        String result = IntegerToRoman.convert(number);
        assertEquals("IX", result);
    }

    @Test
    public void testConvert10() {
        int number = 10;
        String result = IntegerToRoman.convert(number);
        assertEquals("X", result);
    }

    @Test
    public void testConvert15() {
        int number = 15;
        String result = IntegerToRoman.convert(number);
        assertEquals("XV", result);
    }

    @Test
    public void testConvert19() {
        int number = 19;
        String result = IntegerToRoman.convert(number);
        assertEquals("XIX", result);
    }

    @Test
    public void testConvert20() {
        int number = 20;
        String result = IntegerToRoman.convert(number);
        assertEquals("XX", result);
    }

    @Test
    public void testConvert40_shouldReturnXL() {
        int number = 40;
        String result = IntegerToRoman.convert(number);
        assertEquals("XL", result);
    }

    @Test
    public void testConvert41_shouldReturnXLI() {
        int number = 41;
        String result = IntegerToRoman.convert(number);
        assertEquals("XLI", result);
    }

    @Test
    public void testConvert49_shouldReturnXLIX() {
        int number = 49;
        String result = IntegerToRoman.convert(number);
        assertEquals("XLIX", result);
    }

    @Test
    public void testConvert50_shouldReturnL() {
        int number = 50;
        String result = IntegerToRoman.convert(number);
        assertEquals("L", result);
    }

    @Test
    public void testConvert90_shouldReturnXC() {
        int number = 90;
        String result = IntegerToRoman.convert(number);
        assertEquals("XC", result);
    }

    @Test
    public void testConvert91_shouldReturnXCI() {
        int number = 91;
        String result = IntegerToRoman.convert(number);
        assertEquals("XCI", result);
    }

    @Test
    public void testConvert99_shouldReturnXCIX() {
        int number = 99;
        String result = IntegerToRoman.convert(number);
        assertEquals("XCIX", result);
    }

    @Test
    public void testConvert100_shouldReturnC() {
        int number = 100;
        String result = IntegerToRoman.convert(number);
        assertEquals("C", result);
    }

    @Test
    public void testConvert400_shouldReturnCD() {
        int number = 400;
        String result = IntegerToRoman.convert(number);
        assertEquals("CD", result);
    }

    @Test
    public void testConvert401_shouldReturnCDI() {
        int number = 401;
        String result = IntegerToRoman.convert(number);
        assertEquals("CDI", result);
    }

    @Test
    public void testConvert499_shouldReturnCDXCIX() {
        int number = 499;
        String result = IntegerToRoman.convert(number);
        assertEquals("CDXCIX", result);
    }

    @Test
    public void testConvert500_shouldReturnD() {
        int number = 500;
        String result = IntegerToRoman.convert(number);
        assertEquals("D", result);
    }

    @Test
    public void testConvert900_shouldReturnCM() {
        int number = 900;
        String result = IntegerToRoman.convert(number);
        assertEquals("CM", result);
    }

    @Test
    public void testConvert901_shouldReturnCMI() {
        int number = 901;
        String result = IntegerToRoman.convert(number);
        assertEquals("CMI", result);
    }

    @Test
    public void testConvert999_shouldReturnCMXCIX() {
        int number = 999;
        String result = IntegerToRoman.convert(number);
        assertEquals("CMXCIX", result);
    }

    @Test
    public void testConvert1000_shouldReturnM() {
        int number = 1000;
        String result = IntegerToRoman.convert(number);
        assertEquals("M", result);
    }

    @Test
    public void testConvert0_shouldReturnNull() {
        int number = 0;
        String result = IntegerToRoman.convert(number);
        assertNull(result);
    }

    @Test
    public void testConvertNegative_shouldReturnNull() {
        int number = -1;
        String result = IntegerToRoman.convert(number);
        assertNull(result);
    }

    @Test
    public void testConvertGreaterThan1000_shouldReturnNull() {
        int number = 1001;
        String result = IntegerToRoman.convert(number);
        assertNull(result);
    }
}