import java.util.*;

public class FindRepeatedSequences{

    public static Set<String> findRepeatedSequences(String s, int k) {

        HashSet<String> repeats = new HashSet<String>();
        HashSet<String> allSequences = new HashSet<String>();

        int leftWindow = 0;
        int rightWindow = k;

        while (rightWindow <= s.length()){
            if (!allSequences.add(s.substring(leftWindow,rightWindow))){
                repeats.add(s.substring(leftWindow,rightWindow));
                System.out.println("Found a repeat: " + s.substring(leftWindow,rightWindow));
            }

            leftWindow++;
            rightWindow++;

        }

        return repeats;
    }
}