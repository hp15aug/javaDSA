import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadLearn{

    public static void main(String[] args) {
        // Thread t = new Thread(() -> {
        //     System.out.println(Thread.currentThread().getName());
        // });

        // t.start();

        // MyThread t = new MyThread();
        // t.start();

        // try (ExecutorService ex = new Executors.newSingleThreadExecutor()){
        // try (ExecutorService ex = Executors.newFixedThreadPool(2)) {
        //     Future<Integer> future = ex.submit(() -> {
        //         System.out.println(" Callable Thread: " + Thread.currentThread().getName());
        //         return 100;
        //     });
        //     Future<Integer> future2 = ex.submit(() -> {
        //         System.out.println(" Callable Thread: " + Thread.currentThread().getName());
        //         return 500;
        //     });
        //     System.out.println(future.get()+": Result by "+Thread.currentThread().getName());
        //     System.out.println(future2.get()+": Result by "+Thread.currentThread().getName());
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // Thread vThread = Thread.ofVirtual().name("my-virtual-thread").start(() -> {
        //     System.out.println("Vir: "+Thread.currentThread());
        //     System.out.println("Vir: "+Thread.currentThread().getName());
        // });
        // try {
        //     vThread.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    }
}

class MyThread extends Thread{
    @Override 
    public void run(){
        System.out.println("My thread "+getName());
    }
}