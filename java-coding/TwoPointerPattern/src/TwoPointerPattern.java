import java.util.*;
import java.io.*;

public class TwoPointerPattern {


    public static void main(String[] args){

        // This project is for my own education trying to re-learn java
        // Full credit for all of these examples should go to:
        // "Grokking the Coding Interview for Java", located on educative.io

        /*
            Write a function that takes a string, s, as an input and determines whether or not it is a palindrome.
            Note: A palindrome is a word, phrase, or sequence of characters that reads the same backward as forward.

            Solution summary
                Initialize two pointers and move them from opposite ends.
                The first pointer starts at the beginning of the string and moves toward the middle, while the second pointer starts at the end and moves toward the middle.
                Compare the elements at each position to detect a nonmatching pair.
                If both pointers reach the middle of the string without encountering a nonmatching pair, the string is a palindrome.
            Time complexity
                The time complexity isO(n), where n is the number of characters in the string. However, our algorithm will only run (n/2) times, since two pointers are traversing toward each other.
            Space complexity
                The space complexity is O(1), since we use constant space to store two indexes.
         */

        /* Code to test isPalindrome
        String[] testCase = {
                "RACECAR",
                "ABBA",
                "TART"
        };
        for (int k = 0; k < testCase.length; k++) {
            System.out.println("Test Case # " + (k + 1));
            System.out.println(Palindrome.isPalindrome(testCase[k]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
         */



        /*

        Given an array of integers, nums, and an integer value, target, determine if there are any three
        integers in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
        Return TRUE if three such integers exist in the array. Otherwise, return FALSE.
        Note: A valid triplet consists of elements with distinct indexes. This means, for the triplet
        nums[i], nums[j], and nums[k], i ≠= j, i ≠= k and j ≠= k.

        Solution:
        First, sort the array in ascending order. To find a triplet whose sum is equal to the target value, loop through the entire array. In each iteration:
        Store the current array element and set up two pointers (low and high) to find the other two elements that complete the required triplet.
        The low pointer is set to the current loop’s index + 1.
        The high is set to the last index of the array.
        Calculate the sum of array elements pointed to by the current loop’s index and the low and high pointers.
        If the sum is equal to target, return TRUE.
        If the sum is less than target, move the low pointer forward.
        If the sum is greater than target, move the high pointer backward.
        Repeat until the loop has processed the entire array. If, after processing the entire array, we don’t find any triplet that matches our requirement, we return FALSE.
        */

        /* Code to run the findSumOfThree function
        TwoPointerPattern tpp = new TwoPointerPattern();
        boolean answer;
        System.out.println("Answer = " + FindSumOfThree.findSumOfThree(new int[]{3,-1,0,1,2},4));
        System.out.println("Answer = " + FindSumOfThree.findSumOfThree(new int[]{3,-1,0},4));
        System.out.println("Answer = " + FindSumOfThree.findSumOfThree(new int[]{5, 8, 13, -6, 7, 3,-1,0,1,2},15));
        System.out.println("Answer = " + FindSumOfThree.findSumOfThree(new int[]{5, 8, 13, -6, 7, 3,-1,0,1,2},235));
        */

        /*
        Problem: Remove the nth node from a linked list

        Solution summary
            Two pointers, right and left, are set at the head node.
            Move the right pointer n steps forward.
            If right reaches NULL, return head's next node.
            Move both right and left pointers forward till right reaches the last node.
            Relink the left node to the node at left's next to the next node.
            Return head.
        Time complexity
            The time complexity is O(n), where n is the number of nodes in the linked list.
        Space complexity
            The space complexity is O(1) because we use constant space to store two pointers.
         */

        /* Code to run: Remove the nth node from a linked list
        int[][] inputs = {
                {23, 89, 10, 5, 67, 39, 70,28},
                {34, 53, 6, 95, 38, 28, 17, 63, 16, 76},
                {288, 224, 275, 390, 4, 383, 330, 60, 193},
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {69, 8, 49, 106, 116, 112, 104, 129, 39, 14, 27, 12}
        };

        int[] n = {4, 1, 6, 9, 11};

        for (int i = 0; i < inputs.length; i++) {
            LinkedList < Integer > inputLinkedList = new LinkedList < Integer > ();
            inputLinkedList.createLinkedList(inputs[i]);
            System.out.print((i + 1) + ".\tLinked List:\t\t");
            PrintList.printListWithForwardArrow(inputLinkedList.head);
            System.out.print("\n\tn = " + n[i]);
            System.out.print("\n\tUpdated Linked List:\t");
            PrintList.printListWithForwardArrow(ReverseLinkedList.removeNthLastNode(inputLinkedList.head, n[i]));
            System.out.println();
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
         */

        /*
            Problem: Sort Colors

            Given an array, colors, which contains a combination of the following three elements:
                0 (representing red)
                1 (representing white)
                2 (representing blue)
            Sort the array in place so that the elements of the same color are adjacent, with the colors in the order of red, white, and blue. The function should return the same array.
            Constraints:
                1≤ colors.length ≤300
                colors[i] can only contain 0s, 1s, or 2s.

            Solution summary
                To recap, the solution to this problem can be divided into five main parts:
                We traverse the array using three pointers, red, white, and blue.
                If the element pointed to by the white pointer is 0, we swap it with the element pointed to by the red pointer if it’s not pointing to 0, and increment both the red and white pointers.
                If the element pointed to by the white pointer is 1, we increment the white pointer.
                If the element pointed to by the white pointer is 2, we swap it with the element pointed to by the blue pointer if it’s not pointing to 2 and decrement the blue pointer.
                The array is sorted when the blue pointer becomes less than the white pointer.
            Time complexity
                The time complexity of this solution is O(n) since we’re only traversing the array once.
            Space complexity
                The space complexity of this solution is O(1) since no extra space is used.


         */

        /* Code to execute SortColors

        int[][] inputs = {
                {0, 1, 0},
                {1, 1, 0, 2},
                {2, 1, 1, 0, 0},
                {2, 2, 2, 0, 1, 0},
                {2, 1, 1, 0, 1, 0, 2}
        };

        for (int i = 0; i < inputs.length; i++) {
            System.out.println((i + 1) + ".\tcolors: " + Arrays.toString(inputs[i]));

            int[] sortedColors = SortColors.sortColors(inputs[i].clone());
            System.out.println("\n\tThe sorted array is: " + Arrays.toString(sortedColors));

            System.out.println(new String(new char[100]).replace('\0', '-'));
        }

         */

        /* Code to execute: Reverse Words in a String */

        String[] inputs = {
                "Hello World", "We love Python",
                "The quick brown fox jumped over the lazy dog.",
                "Hey", "To be or not to be", "AAAAA", " Hello     World "};

        for(int i=0; i<inputs.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tActual string:\t\t" + inputs[i]);
            System.out.println("\tReversed String:\t" + ReverseWordsInSentence.reverseWords(inputs[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }


    }

}
