package java_thread.thread_3;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Integer> arr;

    public Manager() {
        this.arr = new ArrayList<>();
    }
    synchronized void add(int a){
        this.arr.add(a);
    }

    synchronized void remove(int index){
        this.arr.remove(index);
    }
}
