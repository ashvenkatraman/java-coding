public class Palindrome {

    public static boolean isPalindrome(String s) {

        // Replace this placeholder return statement with your code
        int first = 0;
        int last = s.length()-1;

        while (first <= last){
            if (s.charAt(first) != s.charAt(last)){
                return false;
            }
            first += 1;
            last -= 1;
        }

        return true;
    }
}
