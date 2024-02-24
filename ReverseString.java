public class ReverseString {

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverse(10));
    }

    /**
     * As name implies reverse a string
     * @param x
     * @return
     */
    public int reverse(int x) {

        long reverse = 0;
        boolean isNegative = x < 0;

        if (isNegative) {
            x = -1*x;
        }

        while(x>=10) {
            int val = x%10;

            if (reverse == 0) {
                reverse = val;
            } else {
                reverse = (reverse*10) + val;
            }
            x = x/10;
        }
        reverse = (reverse*10) + x;

        if (reverse < Integer.MAX_VALUE && reverse > Integer.MIN_VALUE )  {
            return isNegative ? -1*(int)reverse : (int)reverse;
        }
        return 0;

    }
}
