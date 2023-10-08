import java.util.*;

public class PalindromeList{
    public static boolean palindrome(LinkedListNode head) {

        // Replace this placeholder return statement with your code
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        // Find the middle
        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }

        // slow is at the middle now
        LinkedListNode reversed = LinkedListReversal.reverseLinkedList(slow);
        LinkedListNode orig = head;

        while (reversed != null){
            if (reversed.data != orig.data)
                return false;

            if (reversed.next == null)
                return true;

            reversed = reversed.next;
            orig = orig.next;

        }

        return true;
    }
}