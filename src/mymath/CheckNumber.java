package mymath;

public class CheckNumber {

    public static int[] prime = new int[]{
        2, 3, 5, 7, 11, 13, 17
    };

    public static String getFirstDigit(int tab) {
        return String.valueOf(tab + 1);
    }

    public static String getSecondToSeventhDigit(int tab) {
        String strNum = frms.Home.database.getItemNumber(tab);
        int intNum = Conversion.HexaToDeci(strNum) + 1;
        if (intNum == 1) {//AUTO_INCREMENT = 1
            frms.Home.database.setAutoIncrementDefault(tab);
        }
        return String.format("%06x", intNum).toUpperCase();
    }

    public static String getSevenDigits(int tab) {
        return getFirstDigit(tab) + getSecondToSeventhDigit(tab);
    }

    public static String getEightDigit(int tab) {
        char[] chrSevenDigits = getSevenDigits(tab).toCharArray();
        int sum = 0;
        for (int i = 0; i < chrSevenDigits.length; i++) {
            for (int j = 0; j < Conversion.hexa.length; j++) {
                if (chrSevenDigits[i] == Conversion.hexa[j]) {
                    sum += j * prime[i];
                }
            }
        }
        return String.format("%x", sum % 16).toUpperCase();
    }

    public static String CheckNumber(int tab) {
        return getSevenDigits(tab) + getEightDigit(tab);
    }
}