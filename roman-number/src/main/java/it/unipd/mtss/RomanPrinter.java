////////////////////////////////////////////////////////////////////
// Eric Michelon 2147986
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {
    /*
        ASCII Art ottenuta tramite il sito
        https://www.asciiart.eu/text-to-ascii-art
     */
    private static final String[] I = {
        " ___ ",
        "|_ _|",
        " | | ",
        " | | ",
        "|___|"
    };
    private static final String[] V = {
        "__     __",
        "\\ \\   / /",
        " \\ \\ / / ",
        "  \\ V /  ",
        "   \\_/   ",
    };
    private static final String[] X = {
        "__  __",
        "\\ \\/ /",
        " \\  / ",
        " /  \\ ",
        "/_/\\_\\"
    };

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder result = new StringBuilder();
        String[] rows = new String[5];

        for (int i = 0; i < 5; i++) {
            rows[i] = "";
        }

        for (char c : romanNumber.toCharArray()) {
            String[] letter = getLetter(c);
            for (int i = 0; i < 5; i++) {
                rows[i] += letter[i] + " ";
            }
        }

        for (String row : rows) {
            result.append(row).append("\n");
        }

        return result.toString();
    }

    private static String[] getLetter(char c) {
        return switch (c) {
            case 'I' -> I;
            case 'V' -> V;
            case 'X' -> X;
            default -> new String[]{ "", "", "", "", "", "" };
        };
    }
}
