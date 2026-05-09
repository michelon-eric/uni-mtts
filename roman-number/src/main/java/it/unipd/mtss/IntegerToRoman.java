////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    if (number < 1 || number > 3) {
      return null;
    }

    return "I".repeat(number);
  }
}
