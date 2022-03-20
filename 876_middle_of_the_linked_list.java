public class Main {

    public static void main(String[] args) {
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;

        System.out.println("List before: ");
        printList(node_1);
        System.out.println("\nPrinting from the middle ");
        printList(middleNode(node_1));
    }

    private static ListNode middleNode(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer.next != null && fastPointer.next.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        if (fastPointer.next != null) {
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print("" + head.val + ",");
            head = head.next;
        }
        System.out.print("\b");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
}
