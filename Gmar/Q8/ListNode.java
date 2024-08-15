package Gmar.Q8;

import org.w3c.dom.traversal.NodeIterator;

import java.util.List;

public class ListNode {
    public int data;
    public ListNode nextNode;

    // todo: Write a non-recursive method that will reverse the elements in the list

    public static ListNode reverse (ListNode head) {
        if (head == null || head.nextNode == null) {
            return null;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.nextNode;
            current.nextNode = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static ListNode test (ListNode head) { // todo: returns the first element as last
        if (head == null) {
            return null;
        }
        ListNode first = head;
        ListNode last = head;
        ListNode temp = first;

        while (first != null) {
            first = first.nextNode;
        }

        temp = first;
        first = last;
        last = temp;

        return head;
    }
}
