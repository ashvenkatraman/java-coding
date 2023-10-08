import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class SlidingWindowPattern {

    public static void main(String[] args){

        /*
        DNA subsequence problem:
        Statement
        Given a string, s, that represents a DNA subsequence, and a number k, return all the contiguous subsequences (substrings) of length k that occur more than once in the string. The order of the returned subsequences does not matter. If no repeated substring is found, the function should return an empty set.
        The DNA sequence is composed of a series of nucleotides abbreviated as A, C, G, and T. For example, ACGAATTCCG is a DNA sequence. When studying DNA, it is useful to identify repeated sequences in it.

        Solution summary
            To recap, the solution to this problem can be divided into the following six main parts:
            Iterate over all k-length substrings.
            Compute the hash value for the contents of the window.
            Add this hash value to the set that keeps track of the hashes of all substrings of the given length.
            Move the window one step forward and compute the hash of the new window using the rolling hash method.
            If the hash value of a window has already been seen, the sequence in this window is repeated, so we add it to the output array.
            Once all substrings have been evaluated, return the output array.
        Time complexity
            The time complexity of this solution is O(n), where n is the length of the input string.
            Explanation:
            Time taken to populate the numbers array: O(n).
            Time taken to traverse all the k-length substrings: O(n−k+1).
            Time taken to calculate the hash value of a k-length substring: O(1).
            So, the dominating time complexity becomes O(n).
        Space complexity
            The space complexity of this solution is O(n).
            Explanation:
            Space occupied by the mapping hash map: O(1).
            Space occupied by the numbers array: O(n).
            Space occupied by the hashSet set: O(n−k+1).
            So, the dominating space complexity becomes O(n).
         */
        /* Code to find repeated sequences in a string (i.e. DNA sequencing)

        List<String> inputsString = Arrays.asList("ACGT", "AGACCTAGAC", "AAAAACCCCCAAAAACCCCCC",
                "GGGGGGGGGGGGGGGGGGGGGGGGG", "TTTTTCCCCCCCTTTTTTCCCCCCCTTTTTTT", "TTTTTGGGTTTTCCA",
                "AAAAAACCCCCCCAAAAAAAACCCCCCCTG", "ATATATATATATATAT");
        List<Integer> inputsK = Arrays.asList(3, 3, 8, 12, 10, 14, 10, 6);

        for (int i = 0; i < inputsK.size(); i++) {
            System.out.println((i + 1) + ".\tInput sequence: " + inputsString.get(i) +
                    "\n\tk: " + inputsK.get(i) + "\n");
            FindRepeatedSequences.findRepeatedSequences(inputsString.get(i), inputsK.get(i));
            System.out.println("----");
        }
        */

        /* Code to find maximums in a sliding window */
        int windowSizes [] = {3, 3, 3, 3, 2, 4, 3, 2, 3, 18};
        int [][] numLists = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
                {1, 5, 8, 10, 10, 10, 12, 14, 15, 19, 19, 19, 17, 14, 13, 12, 12, 12, 14, 18, 22, 26, 26, 26, 28, 29, 30},
                {10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67},
                {4, 5, 6, 1, 2, 3},
                {9, 5, 3, 1, 6, 3},
                {2, 4, 6, 8, 10, 12, 14, 16},
                {-1, -1, -2, -4, -6, -7},
                {4, 4, 4, 4, 4, 4}
        };

        for (int i = 0; i < numLists.length; i++) {
            System.out.println(i + 1 + ".\tInput array:\t" + Arrays.toString(numLists[i]));
            System.out.println("\tWindow size:\t" + windowSizes[i]);
            System.out.println("\n\tMaximum in each sliding window:\t" + Arrays.toString(SlidingWindowMaximum.findMaxSlidingWindow(numLists[i], windowSizes[i])));
            Stream.generate(() -> "-").limit(100).forEach(System.out::print);
            System.out.println();
        }

    }
}
