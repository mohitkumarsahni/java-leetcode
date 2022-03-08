import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node4 = new ListNode(9);
        ListNode node5 = new ListNode(9);

        ListNode node3 = new ListNode(9);
        ListNode node1 = new ListNode(9);
        ListNode node4_1 = new ListNode(9);

        head.next = node2;
        node2.next = node4;
        node4.next = node5;

        node1.next = node3;
        node3.next = node4_1;
        System.out.println("Adding the two numbers: ");
        printList(addTwoNumbers(head, node1));
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        int carry = 0;
        int sum = 0;
        while (l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                sum = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null && l1 != null) {
                sum = l1.val + carry;
                l1 = l1.next;
            } else {
                sum = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            if (sum > 9) {
                carry = 1;
                result = addElement(sum%10, result);
                continue;
            }
            carry = 0;
            result = addElement(sum, result);
        }

        if (carry != 0) {
            result = addElement(1, result);
        }
        return result;
    }

    private static ListNode addElement(int val, ListNode head) {
        ListNode temp = head;
        if (head == null) {
            return new ListNode(val);
        }
        while(head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(val);
        return temp;
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val+",");
            head = head.next;
        }
        System.out.print("\b");
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
