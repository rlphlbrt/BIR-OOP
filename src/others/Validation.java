package others;

public class Validation {

    /**
     * Natural number <br> A natural number is a number such that a number
     * greater than zero.
     *
     * @param text
     * @return true if it is a natural number.
     */
    public static boolean isN(String text) { //N = {x|x > 0}
        boolean number = true;
        //System.out.println(text);
        //System.out.println(isInt(text));
        if (isInt(text)) {
            if (Int(text) <= 0) {
                number = false;
            }
        } else {
            number = false;
        }
        return number;
    }

    public static boolean isInt(String text) {
        boolean integer = true;
        try {
            Integer.parseInt(text);
        } catch (Exception e) {
            integer = false;
        }
        return integer;
    }

    public static int Int(String text) {
        return Integer.parseInt(text);
    }

    public static boolean isInRange(int min, int num, int max) {
        boolean range = false;
        if (min <= num && num <= max) {
            range = true;
        }
        return range;
    }
}