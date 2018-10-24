package mymath;

public class Conversion {

    public static final char[] hexa = new char[]{
        '0', '1', '2', '3',
        '4', '5', '6', '7',
        '8', '9', 'A', 'B',
        'C', 'D', 'E', 'F'
    };
    public static final int base = 16;
    static int multiplier = 1;

    public static int HexaToDeci(String strHexa) {
        char[] chrHexa = strHexa.toCharArray();
        int intDeci = 0;
        for (int i = chrHexa.length; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                multiplier *= base;
            }
            for (int j = 0; j < hexa.length; j++) {
                if (chrHexa[chrHexa.length - i] == hexa[j]) {
                    intDeci += multiplier * j;
                }
            }
            multiplier = 1;
        }
        return intDeci;
    }
}
