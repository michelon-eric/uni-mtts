////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
  public static String convert(int number) {
    if (number < 1 || number > 6) {
      return null;
    }

    if (number == 5) {
      return "V";
    }
    if (number == 4) {
      return "IV";
    }

    if (number > 4) {
      return "V" + "I".repeat(number - 5);
    }

    return "I".repeat(number);
  }
}
