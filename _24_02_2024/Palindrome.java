package _24_02_2024;

public class Palindrome {

    public static void main(String[] args) {

        var pal = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

        var objct = new Palindrome();

        System.out.println(objct.longestPalindrome(pal));
    }

    /**
     * get the longest palindrome
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        var currentValue = s.substring(0,1);

        currentValue = lp(s, currentValue);
        return currentValue;
    }

    public String lp(String s, String currentValue) {

        if (s.length() <= currentValue.length()) return currentValue;

        if(isPalindrome(s)) {
            currentValue = s;
            return currentValue;
        }

        currentValue = lp(s.substring(0, s.length()-1), currentValue);
        currentValue = lp(s.substring(1), currentValue);

        return currentValue;
    }


    boolean isPalindrome(String s) {

        char[] first = s.substring(0,s.length()/2).toCharArray();
        char[] second;
        if(s.length()%2 == 0) {
            second = s.substring(s.length() / 2).toCharArray();

            for(int i = 0; i < first.length; i++) {
                if(first[i] == second[(second.length-1) - i]) continue;
                return false;
            }

        } else {

            second = s.substring((s.length() / 2) + 1).toCharArray();

            for(int i = 0; i < first.length; i++) {
                if(first[i] == second[(second.length-1) - i]) continue;
                return false;
            }

        }
        return true;
    }
}
