import java.util.*;

public class FastAndSlowPointerPattern {

    public static void main(String[] args){


        /*
        Is Happy Number Problem
            Write an algorithm to determine if a number n is a happy number.

            We use the following process to check if a given number is a happy number:

            Starting with the given number n, replace the number with the sum of the squares of its digits.
            Repeat the process until:
            The number equals 1, which will depict that the given number n is a happy number.
            It enters a cycle, which will depict that the given number n is not a happy number.
            Return TRUE if n is a happy number, and FALSE if not.


         */
        /* Code for Fast and Slow Pointer pattern

        int[] a = {1, 5, 19, 25, 7};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Num = " + a[i] + ", isHappyNumber = " + IsHappyNumber.isHappyNumber(a[i]));
        }
         */


        /* Problem and solution for checking if LinkedList is a cycle
        Solution summary
            To recap, the solution to this problem can be divided into the following three parts:
            Initialize both the slow and fast pointers to the head node.
            Move both pointers at different rates, i.e. the slow pointer will move one step ahead whereas the fast pointer will move two steps.
            If both pointers are equal at some point, we know that a cycle exists.
        Time complexity
            The time complexity of the algorithm is O(n), where n is the number of nodes in the linked list.
        Space complexity
            The space complexity of the algorithm above is O(1).
        */

        /* Code for checking if a Linked List is a cycle

        int[][] input = { { 2, 4, 6, 8, 10, 12 }, { 1, 3, 5, 7, 9, 11 },
                { 0, 1, 2, 3, 4, 6 }, { 3, 4, 7, 9, 11, 17 }, { 5, 1, 4, 9, 2, 3 } };
        int[] pos = { 0, -1, 1, -1, 2 };
        for (int i = 0; i < input.length; i++) {
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.createLinkedList(input[i]);
            System.out.print(i + 1 + ".\tInput:");
            System.out.print("\t");
            if (pos[i] == -1) {
                PrintList.printListWithForwardArrow(list.head);
            } else {
                PrintList.printListWithForwardArrowLoop(list.head);
            }
            System.out.println("\n\tpos: " + pos[i]);

            if (pos[i] != -1) {
                int length = list.getLength(list.head);
                LinkedListNode lastNode = list.getNode(list.head, length - 1);
                lastNode.next = list.getNode(list.head, pos[i]);
            }
            System.out.println("\n\tDetected Cycle =  " + CycleDetection.detectCycle(list.head));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
        */

        /*
            Statement
                Given the head of a singly linked list, return the middle node of the linked list. If the number of nodes in the linked list is even, there will be two middle nodes, so return the second one.
            Constraints:
                head ≠= NULL

            Solution summary
                To recap, the solution to this problem can be divided into the following steps:
                Create two pointers, slow and fast, initially at the head of the linked list.
                While traversing the linked list, move the slow pointer one step forward and the fast pointer two steps forward.
                When the fast pointer reaches the last node or NULL, the slow pointer will point to the middle node of the linked list. Return the node that the slow pointer points to.
            Time complexity
                The time complexity of the solution above is O(n), where n is the number of nodes in the linked list.
            Space complexity
                The space complexity of this solution is constant, that is, O(1).
         */

        /* Code to find the middle node in a Linked List

        int[][] input = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5, 6}, {3, 2, 1}, {10}, {1, 2}};

        for(int i=0; i<input.length; i++){
            System.out.print(i+1);
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.createLinkedList(input[i]);
            System.out.print(".\tInput linked list:  ");
            PrintList.printListWithForwardArrow(list.head);
            System.out.print("\tMiddle of the linked list is:  " );
            System.out.println(MiddleNode.middleNode(list.head).data);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
        */

        /*
        Problem: Circular Array Loop
        Statement
            An input array, nums containing non-zero integers, is given, where the value at each index represents the number of places to skip forward (if the value is positive) or backward (if the value is negative). When skipping forward or backward, wrap around if you reach either end of the array. For this reason, we are calling it a circular array. Determine if this circular array has a cycle. A cycle is a sequence of indices in the circular array characterized by the following:
            The same set of indices is repeated when the sequence is traversed in accordance with the aforementioned rules.
            The length of the sequence is at least two.
            The loop must be in a single direction, forward or backward.
            It should be noted that a cycle in the array does not have to originate at the beginning. A cycle can begin from any point in the array.
        Constraints:
            1≤ nums.length ≤104
            −5000≤ nums[i] ≤5000
            nums[i] !=0

        Solution summary
            To recap, the solution to this problem can be divided into the following parts:
            Move the slow pointer x steps forward/backward, where x is the value at the ith index of the array.
            Move the fast pointer x steps forward/backward, where x is the value at ith index. Then, move fast pointer y steps forward/backward, where y is the value at xth index.
            Return TRUE when both pointers meet at the same point.
            If the direction changes after moving the slow or fast pointer or taking a step return to the same location, then follow the steps above for the next element of the array.
            Return FALSE if we have traversed every element of the array without finding a loop.
        Time complexity
            The time complexity of the solution is O(n), where n is the number of elements in the array.
        Space complexity
            The algorithm has constant space complexity, that is O(1).
         */

        /* Code to run Circular Array loop - there is an issue I didn't resolve because I moved on instead
        -- If a number exists that makes you loop around the array more than once, the math doesn't work

        int[][] input = {
                {-2, -3, -9},
                {-5, -4, -3, -2, -1},
                {-1, -2, -3, -4, -5},
                {2, 1, -1, -2},
                {-1, -2, -3, -4, -5, 6},
                {1, 2, -3, 3, 4, 7, 1},
                {2, 2, 2, 7, 2, -1, 2, -1, -1}
        };

        for (int i = 0; i < input.length; i++) {
            System.out.println((i + 1) + ".\tCircular array = " + Arrays.toString(input[i]) + "\n");
            boolean result = CircularArrayLoop.circularArrayLoop(input[i]);
            System.out.println("\tFound Loop = " + result);
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
        */

        /* Problem: Find the duplicate

        Statement
            Given an unsorted array of positive numbers, nums, such that the values lie in the range [1,n], inclusive, and that there are n+1 numbers in the array, find and return the duplicate number present in nums. There is only one repeated number in nums.
            Note: You cannot modify the given array nums. You have to solve the problem using only constant extra space.
        Constraints:
            1≤n≤105
            nums.length =n+1
            1≤ nums[i] ≤n
            All the integers in nums are unique, except for one integer that will appear more than once.

         */

        /* Code to run Find Duplicates
        int[][] nums = {
                {1, 3, 2, 3, 5, 4},
                {2, 4, 5, 4, 1, 3},
                {1, 6, 3, 5, 1, 2, 7, 4},
                {1, 2, 2, 4, 3},
                {3, 1, 3, 5, 6, 4, 2}
        };
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + 1);
            System.out.println(".\tnums = "+ Arrays.toString(nums[i]));
            System.out.println("\tDuplicate number = "+ FindDuplicate.findDuplicate(nums[i]));
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }
         */


        /* Problem: Palindrome in a linked list
        Solution
            The fast and slow pointers technique helps determine whether a linked list is a palindrome or not, because it allows us to efficiently traverse the list and find the middle node in a single pass. We can do this in linear time and with constant extra space.
            To determine whether a linked list is a palindrome, we first find the middle node of the linked list using the fast and slow pointers approach. Then, we will reverse the second half of the linked list, starting from the node after the middle node until the end of the list. Next, we will compare the first half with the second half.
            If both halves of the list match, the linked list is a palindrome. Otherwise, it is not. In the end, we reverse the second half of the linked list again. This is done to revert it to the original structure of the linked list so that the input linked list is not modified by the palindrome checking process.
            The algorithm to solve this problem is as follows:
            First, we will find the middle node of the linked list. To do this, we’ll traverse the linked list using two pointers, where the slow pointer will move one step forward, and the fast pointer will move two steps forward. We’ll do this until the fast pointer reaches the end of the list or a null node. At this point, the slow pointer will be pointing at the middle node of the list.
            Next, we’ll reverse the second half of the linked list, starting from the node after the middle node. To reverse the list, we will follow these steps:
            Initialize three pointers: prev, next, and curr. The prev and next pointers are initialized as NULL, while curr is initialized to the head of the linked list.
            Iterate over the linked list. While iterating, perform the following steps:
            Before changing the next of curr, store the next node using the following line of code: next = curr.next.
            Next, we’ll assign the next pointer of curr to prev using the following line of code curr.next = prev. The effect of this line of code is that it will reverse the pointer from forward to backward to reverse the linked list.
            After reversing the pointer, we will update prev as curr and curr as next, using the following lines of code respectively: prev = curr and curr = next.
            After finding the mid of the linked list and reversing its second half, the last step is to compare every element of the first half of the linked list with the corresponding element in the second half of the reversed linked list. If both halves are the same, the list is a palindrome, and we’ll return TRUE. Otherwise, we’ll return FALSE.

        Time complexity
            The algorithm’s time complexity is O(n), where n is the total number of nodes in the linked list.
        Space complexity
            The space complexity of the algorithm above is O(1), because it does not use any extra space in memory.
         */

        /*
        Code for checking if a linked list contains a palindrome
         */

        int[][] input={
                {2, 4, 6, 4, 2},
                {0, 3, 5, 5, 0},
                {9, 27, 4, 4, 27, 9},
                {5, 4, 7, 9, 4, 5},
                {5, 10, 15, 20, 15, 10, 5}
        };

        for(int i=0; i<input.length; i++){
            System.out.print(i+1);
            LinkedList<Integer> list = new LinkedList<Integer>();
            list.createLinkedList(input[i]);
            System.out.print(".\tLinked list:  ");
            PrintList.printListWithForwardArrow(list.head);
            System.out.print("\tIs it a palindrome?  ");
            boolean result = PalindromeList.palindrome(list.head);
            if(result){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            System.out.println(new String(new char[100]).replace('\0', '-'));
        }


    }
}
