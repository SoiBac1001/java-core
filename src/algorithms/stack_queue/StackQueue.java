package algorithms.stack_queue;

public interface StackQueue {
    boolean push(int value);
    int pop();
    boolean isFull();
    boolean isEmpty();

    void display();
}
