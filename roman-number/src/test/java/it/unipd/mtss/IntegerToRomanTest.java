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
  public void testConvert0() {
    assertNull(IntegerToRoman.convert(0));
  }

  @Test
  public void testConvertNegative() {
    assertNull(IntegerToRoman.convert(-1));
  }

  @Test
  public void testConvertGreaterThan5() {
    assertNull(IntegerToRoman.convert(7));
  }
}