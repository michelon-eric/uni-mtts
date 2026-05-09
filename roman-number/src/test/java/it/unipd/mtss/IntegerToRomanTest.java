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
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvert2() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvert3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvert4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvert5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvert6() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvert7() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvert8() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvert9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvert10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void testConvert15() {
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test
    public void testConvert19() {
        assertEquals("XIX", IntegerToRoman.convert(19));
    }

    @Test
    public void testConvert20() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }
    
    @Test
    public void testConvert0_shouldReturnNull() {
        assertNull(IntegerToRoman.convert(0));
    }

    @Test
    public void testConvertNegative_shouldReturnNull() {
        assertNull(IntegerToRoman.convert(-1));
    }

    @Test
    public void testConvert40_shouldReturnXL() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvert41_shouldReturnXLI() {
        assertEquals("XLI", IntegerToRoman.convert(41));
    }

    @Test
    public void testConvert49_shouldReturnXLIX() {
        assertEquals("XLIX", IntegerToRoman.convert(49));
    }

    @Test
    public void testConvert50_shouldReturnL() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvert90_shouldReturnXC() {
        assertEquals("XC", IntegerToRoman.convert(90));
    }

    @Test
    public void testConvert91_shouldReturnXCI() {
        assertEquals("XCI", IntegerToRoman.convert(91));
    }

    @Test
    public void testConvert99_shouldReturnXCIX() {
        assertEquals("XCIX", IntegerToRoman.convert(99));
    }

    @Test
    public void testConvert100_shouldReturnC() {
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test
    public void testConvert400_shouldReturnCD() {
        assertEquals("CD", IntegerToRoman.convert(400));
    }

    @Test
    public void testConvert401_shouldReturnCDI() {
        assertEquals("CDI", IntegerToRoman.convert(401));
    }

    @Test
    public void testConvert499_shouldReturnCDXCIX() {
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
    }

    @Test
    public void testConvert500_shouldReturnD() {
        assertEquals("D", IntegerToRoman.convert(500));
    }

    @Test
    public void testConvertGreaterThan500_shouldReturnNull() {
        assertNull(IntegerToRoman.convert(501));
    }
}