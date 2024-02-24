package _24_02_2024;

public class IntegerPalindrome {

    // check if the integer is palindrome or not
    public static void main(String[] args) {
        var clz = new IntegerPalindrome();
        System.out.println(clz.isPalindrome(1001));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverseNumber = 0;
        int originalNumber = x;

        while(x >= 10) {
            int currentValue = x%10;
            x = x/10;
            reverseNumber = reverseNumber*10 + currentValue;
        }

        if (x > 0) reverseNumber = reverseNumber*10 + x;

        return originalNumber-reverseNumber == 0;
    }

}
