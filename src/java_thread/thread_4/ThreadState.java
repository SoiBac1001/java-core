package java_thread.thread_4;

// ABC class implements the interface Runnable
class ABC implements Runnable {
    private void execute() throws InterruptedException {
        wait();
    }
    public void run() {

        // try-catch block
        try {
            // moving thread t2 to the state timed waiting
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


//        System.out.println("Current the state of thread T2 - " + Thread.currentThread().getState()); // always RUNNABLE
        System.out.println("The state of thread T1 after invoking the method sleep() on it - " + ThreadState.t1.getState());

        // try-catch block
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread T1 while it invoked the method join() on thread T2 - " + ThreadState.t1.getState());
    }
}

// ThreadState class implements the interface Runnable  
public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    // main method
    public static void main(String argvs[]) {
        // creating an object of the class ThreadState
        obj = new ThreadState();
        t1 = new Thread(obj);

        // thread T1 is spawned
        // The thread T1 is currently in the NEW state.
        System.out.println("The state of thread T1 after spawning it - " + t1.getState());

        // invoking the start() method on
        // the thread T1
        t1.start();

        // thread T1 is moved to the Runnable state
        System.out.println("The state of thread T1 after invoking the method start() on it - " + t1.getState());
    }

    public void run() {
        ABC myObj = new ABC();
        Thread t2 = new Thread(myObj); // child thread

        // thread T2 is created and is currently in the NEW state.
        System.out.println("The state of thread T2 after spawning it - " + t2.getState());
        t2.start();

        // thread T2 is moved to the runnable state
        System.out.println("the state of thread T2 after calling the method start() on it - " + t2.getState() + "\n");
        System.out.println("==================================\n");

        // try-catch block for the smooth flow of the  program
        try {
            // moving the thread T1 to the state timed waiting
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("The state of thread T2 after invoking the method sleep() on it - " + t2.getState());

        // try-catch block for the smooth flow of the  program
        try {
        // waiting for thread T2 to complete its execution
//            t2.join();
            t2.join(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("The state of thread T2 when it has completed it's execution - " + t2.getState());
    }

} 