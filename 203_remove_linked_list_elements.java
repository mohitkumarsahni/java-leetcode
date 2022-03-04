import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node6_1 = new ListNode(6);
        head.next = node2;
        node2.next = node6;
        node6.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6_1;
        int removeVal = 1;
        System.out.println("Linked List before removing the element: ");
        printList(head);
        System.out.println("\nRemoved the element: " + removeVal + ". Now the List is: ");
        printList(recursiveRemove(head, removeVal));
    }

    //1ms
    public static ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        ListNode remove;
        while(current != null) {
            if (prev == null && current.val == val) {
                remove = current;
                current = current.next;
                head = head.next;
                remove.next = null;
                continue;
            }
            if (current.val == val) {
                remove = current;
                prev.next = current.next;
                current = current.next;
                remove.next = null;
                continue;
            }
            prev = current;
            current = current.next;
        }
        return head;
    }

    private static ListNode recursiveRemove(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return removeElements(head.next, val);

        ListNode copyHead = head;

        while(head.next != null) {
            if(head.next.val == val) head.next = head.next.next;
            else head = head.next;
        }

        return copyHead;
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
