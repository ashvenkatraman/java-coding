import java.util.*;

public class TwoPointerPattern {


    public static void main(String[] args){

        /*
        Full credit to "Grokking the Coding Interview for Java", located on educative.io:

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

        int[][] inputs = {
                {23, 89, 10, 5, 67, 39, 70,28},
 //               {34, 53, 6, 95, 38, 28, 17, 63, 16, 76},
 //               {288, 224, 275, 390, 4, 383, 330, 60, 193},
 //               {1, 2, 3, 4, 5, 6, 7, 8, 9},
 //               {69, 8, 49, 106, 116, 112, 104, 129, 39, 14, 27, 12}
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
    }

}
