package algorithms.stack_queue;

public class MyMain {
    public static void main(String[] args) {
//        testStack();
        testQueue();
    }

    private static void testStack() {
        System.out.println("Test stack");
        MyArrayStack myArrayStack = new MyArrayStack(3);
        myArrayStack.push(1);
        myArrayStack.push(2);
        myArrayStack.push(3);
        myArrayStack.push(4);

        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();
        myArrayStack.pop();
        myArrayStack.display();
        System.out.println(myArrayStack.pop());
    }

    private static void testQueue() {
        System.out.println("Test queue");
        MyArrayQueue myArrayQueue = new MyArrayQueue(3);
        myArrayQueue.push(1);
        myArrayQueue.push(2);
        myArrayQueue.push(3);
        myArrayQueue.push(4);

        System.out.println("\nCount: " + myArrayQueue.count());
        myArrayQueue.display();

        myArrayQueue.pop();
        myArrayQueue.display();
        System.out.println("\nCount: " + myArrayQueue.count());

        myArrayQueue.pop();
        myArrayQueue.display();
        System.out.println("\nCount: " + myArrayQueue.count());

        myArrayQueue.pop();
        myArrayQueue.display();
        System.out.println("\nCount: " + myArrayQueue.count());
        System.out.println(myArrayQueue.pop());
    }

    private static void calculateSizeOfFolders() {

    }
}
