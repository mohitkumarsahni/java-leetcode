public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(6);
        ListNode node6_1 = new ListNode(6);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6_1.next = node6;
        System.out.println("Linked List before: ");
        printList(head);
        System.out.println("\nRemoved the duplicates, Linked List now: ");
        printList(deleteDuplicates(head));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            ListNode temp = current;
            while (temp.next != null && temp.val == temp.next.val) {
                temp = temp.next;
            }
            current.next = temp.next;
            current = current.next;
        }
        return head;
    }

    private static void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + ",");
            head = head.next;
        }
        System.out.print("\b");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
