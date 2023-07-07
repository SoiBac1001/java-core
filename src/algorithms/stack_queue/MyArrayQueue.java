package algorithms.stack_queue;

public class MyArrayQueue implements StackQueue {
    private int array[];
    private int size;
    private int headIndex, tailIndex;

    public MyArrayQueue(int size) {
        this.size = size;
        array = new int[size];
        headIndex = tailIndex = -1;
    }

    @Override
    public boolean push(int value) {
        if(!isFull()) {
            if(isEmpty()) {
                headIndex++;
            }
            tailIndex++;
            array[tailIndex] = value;
            return true;
        }

        return false;
    }

    @Override
    public int pop() {
        if(!isEmpty()) {
            int value = array[headIndex];
            if(tailIndex == headIndex) {
                headIndex = tailIndex = -1;
            } else {
                headIndex++;
            }

            return value;
        }

        return -1;
    }

    @Override
    public boolean isFull() {
        return tailIndex == size - 1;
    }

    @Override
    public boolean isEmpty() {
        return headIndex == -1 && tailIndex == -1;
    }

    public int count() {
        if(isEmpty()) {
            return 0;
        }

        return tailIndex - headIndex + 1;
    }

    @Override
    public void display() {
        if(isEmpty()) {
            System.out.println("\nQueue is empty !");
        } else {
            System.out.println();
            for (int i = headIndex; i <= tailIndex; i++){
                System.out.print(" " + array[i]);
            }
        }
    }
}
