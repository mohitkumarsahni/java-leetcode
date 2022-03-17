public class Main {

    public static void main(String[] args) {
        ListNode node_0 = new ListNode(1);
        ListNode node_1 = new ListNode(2);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(4);
        node_0.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        System.out.println("List before: ");
        printList(node_0);
        System.out.println("\nIs it palindrome Linked List: "+isPalindrome(node_0));
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            fast = fast.next;
            if (fast == null) {
                break;
            }
            fast = fast.next;
            slow = slow.next;
        }
        ListNode start = head;
        ListNode end = reverseList(slow);
        while (start != null && end != null) {
            if (start.val != end.val) return false;
            start = start.next;
            end = end.next;
        }
        return true;
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
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
