import java.util.*;

// The code in "LinkedList.java" can be used to create a linked list out of a list. 
// The code in "LinkedListTraversal.java" can be used to traverse the linked list.
// The code in "LinkedListReversal.java" can be used to reverse the linked list.

public class MiddleNode{
    public static LinkedListNode middleNode(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        if (head.next == null)
            return head;

        while ((fast != null) && (fast.next != null))
        {
            slow = slow.next;
            fast = fast.next.next;
        }


        return slow;
    }
}