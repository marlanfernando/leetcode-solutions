package _24_02_2024;

public class Atoi {


    public static void main(String[] args) {
        Atoi atoi = new Atoi();
        System.out.println(atoi.myAtoi("-2147483648"));
    }

    // convert a given numbers as string to a integer,
    // if the converted value is less than the Integer.MIN_VALUE return the MIN_VALUE
    // do the same if its max
    public int myAtoi(String s) {

        long returnValue = 0L;
        boolean isNegative = false;
        boolean isBeforeDigits = true;
        char[] charValue = s.toCharArray();

        for (char currentValue : charValue) {

            if (isBeforeDigits && currentValue == ' ') continue;
            if (isBeforeDigits && currentValue == '-') {
                isBeforeDigits = false;
                isNegative = true;
                continue;
            } else if (isBeforeDigits && currentValue == '+') {
                isBeforeDigits = false;
                continue;
            }

            try {
                returnValue = (returnValue * 10) + Integer.parseInt(String.valueOf(currentValue));

                if (isNegative && -1*returnValue < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                } else if (!isNegative && returnValue > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }

                isBeforeDigits = false;

            } catch (Exception e) {
                break;
            }

        }

        return isNegative ? (int)returnValue*-1 : (int)returnValue;
    }
}
