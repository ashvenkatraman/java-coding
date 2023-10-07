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

        /* Code for checking if a Linked List is a cycle */

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


    }
}
