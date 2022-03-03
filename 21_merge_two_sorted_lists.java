import java.util.*;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node4_1 = new ListNode(4);

        head.next = node2;
        node2.next = node4;

        node1.next = node3;
        node3.next = node4_1;

        System.out.println("Merged Linked List:");
        printList(mergeTwoLists(head, node1));
    }

    //1ms
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode prev = null;
        while(l1 != null || l2 != null) {
            if (l1 == null && l2 != null) {
                if (result == null) {
                    result = l2;
                    prev = l2;
                    l2 = l2.next;
                    continue;
                }
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
                continue;
            }
            if (l1 != null && l2 == null) {
                if (result == null) {
                    result = l1;
                    prev = l1;
                    l1 = l1.next;
                    continue;
                }
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
                continue;
            }
            if (l1.val == l2.val) {
                if (result == null) {
                    result = l1;
                    prev = l1;
                    l1 = l1.next;
                    prev.next = l2;
                    prev = l2;
                    l2 = l2.next;
                    continue;
                }
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
                continue;
            }
            if (l1.val <= l2.val) {
                if (result == null) {
                    result = l1;
                    prev = l1;
                    l1 = l1.next;
                    continue;
                }
                prev.next = l1;
                prev = l1;
                l1 = l1.next;
                continue;
            }
            if (l1.val >= l2.val) {
                if (result == null) {
                    result = l2;
                    prev = l2;
                    l2 = l2.next;
                    continue;
                }
                prev.next = l2;
                prev = l2;
                l2 = l2.next;
                continue;
            }
        }
        return result;
    }

    private static void printList(ListNode list) {
        while(list != null) {
            System.out.print(list.val+",");
            list = list.next;
        }

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
