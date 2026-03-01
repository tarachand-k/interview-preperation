package patterns.slow_fast_pointer;

public class LinkedListCycle {
    public static void main(String[] args) {
    }

    public boolean optimized(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
