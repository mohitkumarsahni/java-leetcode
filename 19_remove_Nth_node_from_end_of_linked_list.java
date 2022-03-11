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

        int n = 2;

        System.out.println("List before: ");
        printList(node_0);
        System.out.println("Removed " + n + " from end. Now List is:");
        printList(removeNthFromEnd(node_0, n));
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print("" + head.val + ",");
            head = head.next;
        }
        System.out.print("\b");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode f_pointer = head;
        ListNode s_pointer = head;
        int distanceFromTempToCursor = 0;
        while (f_pointer.next != null) {
            f_pointer = f_pointer.next;
            count++;

            if (distanceFromTempToCursor < n) {
                distanceFromTempToCursor++;
            } else {
                s_pointer = s_pointer.next;
            }
        }

        if (n == count) {
            return head.next;
        }

        s_pointer.next = s_pointer.next.next;
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
