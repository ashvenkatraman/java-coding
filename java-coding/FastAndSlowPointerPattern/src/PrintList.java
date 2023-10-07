public class PrintList {

    public static void printListWithForwardArrow(LinkedListNode node){

        System.out.print("[");

        while (node != null){
            System.out.print(node.data);
            node = node.next;
            if (node != null){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void printListWithForwardArrowLoop(LinkedListNode head) {
        LinkedListNode temp = head;

        while (temp != null) {
            System.out.print(temp.data); // print node value
            temp = temp.next;
            if (temp != null) {
                System.out.print(" → ");
            }
        }
    }

}
