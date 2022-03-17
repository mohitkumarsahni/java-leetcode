public class Main {

    public static void main(String[] args) {
        ListNode node_0 = new ListNode(1);
        ListNode node_1 = new ListNode(0);
        ListNode node_2 = new ListNode(0);
        ListNode node_3 = new ListNode(1);
        node_0.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        System.out.println("List before: ");
        printList(node_0);
        System.out.println("\nPrint the integer value "+getDecimalValue(node_0));
    }

    private static int getDecimalValue(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
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
