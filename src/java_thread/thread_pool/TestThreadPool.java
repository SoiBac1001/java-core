package java_thread.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5); //creating a pool of 5 threads
        for(int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executorService.execute(worker); //calling execute method of ExecutorService
//            executorService.submit()
        }

        executorService.shutdown();

        while (executorService.isTerminated()) {

        }

        System.out.println("Finished all threads");
    }
}
