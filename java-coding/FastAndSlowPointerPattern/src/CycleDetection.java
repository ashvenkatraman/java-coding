import java.util.*;

public class CycleDetection{
    public static boolean detectCycle(LinkedListNode head) {

        if (head.next == null){
            return false;
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head.next;

        while ((fast != null) && (fast.next != null) && (fast != slow)){

            System.out.println("Fast: " + fast.data + ", Slow: " + slow.data);

            if (fast == null ||fast.next == null){
                return false;
            }

            if (fast == slow){
                return true;
            }

            fast = fast.next.next;
            slow = slow.next;

        }

        if ((fast != null) && (slow != null)){
            System.out.println("Fast: " + fast.data + ", Slow: " + slow.data);

            if (fast == slow){
                return true;
            }
        }

        System.out.println("Should never get here");
        return false;
    }

    /* This is the MUCH more elegant solution below
    public static boolean detectCycle(LinkedListNode head) {
        if (head == null) {
            return false;
        }

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

     */


}