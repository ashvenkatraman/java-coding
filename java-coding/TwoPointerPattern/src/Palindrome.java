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

    public static boolean isAlmostAPalindrome(String s){

        int first = 0;
        int last = s.length() - 1;
        String stringWithoutElement;

        while (first <= last){
            if (s.charAt(first) == s.charAt(last)){
                first++;
                last--;
            }
            else{
                if (last-first >= 1) {
                    stringWithoutElement = s.substring(first+1, last+1);
                    System.out.println("Checking back half: " + stringWithoutElement);
                    if (isPalindrome(stringWithoutElement))
                        return true;

                    stringWithoutElement = s.substring(last, last-1);
                    System.out.println("Checking front half: " + stringWithoutElement);
                    if (isPalindrome(stringWithoutElement))
                        return true;
                }

                return false;
            }
        }
        return true;
    }
}