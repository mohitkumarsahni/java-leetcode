import java.util.*;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node3.next = node4;
        node2.next = node3;
        head.next = node2;
        node4.next = node2;
        System.out.println("Does the above linked list have a cycle: "+hasCycle(head));
        System.out.println("Does the above linked list have a cycle: "+checkCycle(head));
    }

    private static boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> nodeFrequencyMap = new HashMap<>();
        ListNode temp = head;
        while(temp != null) {
            if (nodeFrequencyMap.containsKey(temp)) {
                return true;
            }
            nodeFrequencyMap.put(temp, 1);
            temp = temp.next;
        }
        return false;
    }

    //2 pointer approach.
    private static boolean checkCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
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
