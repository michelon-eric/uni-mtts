////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
	private static final int[] VALUES = {
		10, 9, 5, 4, 1
	};

	private static final String[] SYMBOLS = {
		"X", "IX", "V", "IV", "I"
	};

	public static String convert(int number) {
		if (number < 1 || number > 10) {
			return null;
		}

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < VALUES.length; i++) {
			while (number >= VALUES[i]) {
				result.append(SYMBOLS[i]);
				number -= VALUES[i];
			}
		}

		return result.toString();
	}
}
