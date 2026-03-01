package patterns.slow_fast_pointer;

public class MiddleOfLinkedList {
    public static Node optimized(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
