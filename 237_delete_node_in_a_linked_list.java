public class Main {

    public static void main(String[] args) {
        ListNode node_0 = new ListNode(1);
        ListNode node_1 = new ListNode(2);
        ListNode node_2 = new ListNode(3);
        ListNode node_3 = new ListNode(4);
        ListNode node_4 = new ListNode(5);
        node_0.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;

        System.out.println("List before: ");
        printList(node_0);
        System.out.println("Removed " + node_2.val + " from end. Now List is:");
        deleteNode(node_2);
        printList(node_0);
    }

    private static void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }

        node.val = node.next.val;
        node.next = null;
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
