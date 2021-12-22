package java_thread.thread_1;

public class TestInterruptingThread3 extends Thread {
    public TestInterruptingThread3(String name) {
        super(name);
    }

    public void run(){
        for(int i=1;i<=2;i++){
            // The isInterrupted() method returns the interrupted flag either true or false.
            // The static interrupted() method returns the interrupted flag afterthat it sets the flag to false if it is true.
            if(Thread.interrupted()){
                System.out.println("code for interrupted " + Thread.currentThread().getName());
            }
            else{
                System.out.println("code for normal " + Thread.currentThread().getName());
            }

        }//end of for loop
    }

    public static void main(String args[]){

        TestInterruptingThread3 t1=new TestInterruptingThread3("Thread 1");
        TestInterruptingThread3 t2=new TestInterruptingThread3("Thread 2");

        t1.start();
        t1.interrupt();

        t2.start();

    }
}