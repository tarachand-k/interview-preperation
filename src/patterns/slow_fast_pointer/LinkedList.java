package patterns.slow_fast_pointer;

class Node {
    final int value;
    Node next;


    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        int currIndex = 1;
        Node currNode = head;

        while (currIndex < index) {
            currNode = currNode.next;
            currIndex++;
        }

        currNode.next = new Node(value, currNode.next);
        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;

        return value;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        int value = tail.value;
        tail = get(size - 2);
        tail.next = null;

        return value;
    }

    public int delete(int index) {
        if (index == 0) return deleteFirst();
        if (index == size - 1) deleteLast();

        Node prevNode = get(index - 1);
        int value = prevNode.next.value;

        Node targetNode = prevNode.next;
        prevNode.next = targetNode.next;
        targetNode.next = null;

        return value;
    }

    private Node get(int index) {
        Node currNode = head;
        int currIdx = 0;
        while (currIdx < index) {
            currNode = currNode.next;
            currIdx++;
        }

        return currNode;
    }

    public boolean find(int value) {
        Node currNode = head;
        while (currNode.next != null) {
            if (currNode.value == value) {
                return true;
            }
            currNode = currNode.next;
        }

        return false;
    }

    public void printList() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.value + " -> ");
            pointer = pointer.next;
        }
        System.out.println("END");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(5);
        list.insertLast(10);
        list.insertFirst(15);
        list.insertLast(25);
        list.insert(20, 3);
        list.insert(99, 2);
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.find(15));
    }
}
