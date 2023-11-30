package algorithms.linked_list;

public class MyLinkedList {
    private static class Node {
        private final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private static Node addToHead(Node currentHead, int newValue) {
        Node newHeadNode = new Node(newValue);
        if(currentHead != null) {
            newHeadNode.next = currentHead;
        }

        return newHeadNode;
    }

    /*private static Node addToTail(Node currentHead, int newValue) {
        Node tailNode = new Node(newValue);
        if(currentHead != null) {
            Node temp = currentHead.next;
            if(temp == null) {
                currentHead.next = tailNode;
            } else {
                while(true) {
                    if(temp.next == null) {
                        temp.next = tailNode;
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
            }
        }

        return tailNode;
    }*/

    private static Node addToTail(Node currentHead, int newValue) {
        Node newTailNode = new Node(newValue);
        if(currentHead != null) {
            Node tailNode = currentHead;
            while(tailNode.next != null) {
                tailNode = tailNode.next;
            }
            tailNode.next = newTailNode;
        }

        return newTailNode;
    }

    private static Node addToIndex(Node currentHead, int newValue, int index) {
        Node newNode = new Node(newValue);

        if(currentHead != null) {
            if(index == 0) {
                newNode.next = currentHead;
            } else {
                int currentIndex = 1;

                Node currentNode = currentHead;
                while (currentNode != null) {
                    if(currentIndex == index) {
                        newNode.next = currentNode.next;
                        currentNode.next = newNode;
                        break;
                    }
                    currentIndex++;
                    currentNode = currentNode.next;
                }
            }
        }

        return newNode;
    }
    private static Node removeHeadNode(Node currentHead) {
        if(currentHead != null) {
            return currentHead.next;
        }

        return null;
    }

    private static Node removeTailNode(Node currentHead) {
        if(currentHead != null) {
            Node currentNode = currentHead;
            while(true) {
                if(currentNode.next != null) {
                    if(currentNode.next.next == null) {
                        currentNode.next = null;
                        return currentHead;
                    }
                } else {
                    return currentHead;
                }

                currentNode = currentNode.next;
            }
        }

        return currentHead;
    }

    private static Node removeNode(Node currentHead, int removedValue) {
        if(currentHead != null) {
            if(currentHead.value == removedValue) {
                Node next = currentHead.next;
                currentHead.next = null;

                return next;
            }

            Node currentNode = currentHead;
            while (true) {
                Node nextNode = currentNode.next;
                if(nextNode != null) {
                    if(nextNode.value == removedValue) {
                        currentNode.next = nextNode.next;
                        break;
                    }
                    currentNode = currentNode.next;
                } else {
                    System.out.println("Not found removed value: " + removedValue);
                    break;
                }
            }
        }

        return currentHead;
    }

    private static void displayLinkedList(Node head) {
        System.out.print("=========");
        if(head == null) {
            System.out.println("\nLinked list is empty !");
        } else {
            System.out.print("\nLinked list: " + head.value);

            Node temp = head.next;
            while (temp != null) {
                System.out.print(" -> " + temp.value);
                temp = temp.next;
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.next = node2;
        node2.next = node3;

        System.out.println("Init linked list");
        displayLinkedList(node1);

//        testAddLinkedList(node1);
        testRemoveLinkedList(node1);
    }

    private static void testAddLinkedList(Node headNode) {
        System.out.println("Add 0 to head");
        headNode = addToHead(headNode, 0);
        displayLinkedList(headNode);

        System.out.println("Add 5 to tail");
        addToTail(headNode, 5);
        displayLinkedList(headNode);

        System.out.println("Add 4 to index: " + 4);
        addToIndex(headNode, 4, 4);
        displayLinkedList(headNode);
    }

    private static void testRemoveLinkedList(Node headNode) {
        System.out.println("Remove head");
        headNode = removeHeadNode(headNode);
        displayLinkedList(headNode);

        System.out.println("Remove tail");
        removeTailNode(headNode);
        displayLinkedList(headNode);

        int removedValue = 2;
        System.out.println("Remove " + removedValue + " from linked list");
        Node newHeadNode = removeNode(headNode, removedValue);
        displayLinkedList(newHeadNode);
    }
}
