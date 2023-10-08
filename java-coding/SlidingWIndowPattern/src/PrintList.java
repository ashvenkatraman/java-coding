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

}
