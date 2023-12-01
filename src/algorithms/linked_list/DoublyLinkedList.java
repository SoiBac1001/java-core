package algorithms.linked_list;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int length;

    private static class DoublyNode {
        private final int data;
        private DoublyNode previous;
        private DoublyNode next;

        public DoublyNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int length() {
        return this.length;
    }

    public void insertLast(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if(isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
        }
        this.tail = newNode;
        this.length++;
    }

    public void insertFirst(int value) {
        DoublyNode node = new DoublyNode(value);
        if(isEmpty()) {
            tail = node;
        } else {
            head.previous = node;
            node.next = head;
        }
        head = node;
        length++;
    }

    public void displayForward() {
        System.out.println("\n=== Display forward DLL ===");
        if(head == null) {
            return;
        }

        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public void displayBackward() {
        System.out.println("\n=== Display backward DLL ===");
        if(tail == null) {
            return;
        }

        DoublyNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.previous;
        }
        System.out.print("null\n");
    }

    public static void main(String[] args) {
//        DoublyLinkedList doublyLinkedList = initWithInsertLast();
        DoublyLinkedList doublyLinkedList = initWithInsertFirst();

        display(doublyLinkedList);
    }

    private static DoublyLinkedList initWithInsertLast() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertLast(1);
        doublyLinkedList.insertLast(2);
        doublyLinkedList.insertLast(3);
        doublyLinkedList.insertLast(4);
        doublyLinkedList.insertLast(5);

        return doublyLinkedList;
    }

    private static DoublyLinkedList initWithInsertFirst() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(4);
        doublyLinkedList.insertFirst(5);

        return doublyLinkedList;
    }

    private static void display(DoublyLinkedList doublyLinkedList) {
        if(doublyLinkedList != null) {
            System.out.println("Size of DLL: " + doublyLinkedList.length());
            doublyLinkedList.displayForward();
            doublyLinkedList.displayBackward();
        }
    }
}
