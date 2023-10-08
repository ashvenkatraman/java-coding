public class ReverseLinkedList {
    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {

        // First create a left and right pointer
        LinkedListNode left = head;
        LinkedListNode right = head;

        // Move the right pointer n times
        for (int i = 1;i<=n;i++){
            right = right.next;
        }

        if (right == null){
            return left.next;
        }

        while (right.next != null){
            // Now that we have the right and left separated by n spaces, move the them together until right hits the end
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return head;
    }

}
