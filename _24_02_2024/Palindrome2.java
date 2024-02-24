package _24_02_2024;

public class Palindrome2 {

    public static void main(String[] args) {

        var pal = "ban";

        var objct = new Palindrome2();

        System.out.println(objct.longestPalindrome(pal));
    }

    /**
     * get the longest palindrome, but in this method will check the
     * distance to left and right from given index and if match only continue (hope you get what i mean)
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
