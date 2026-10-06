import java.util.concurrent.*;

class MyThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("ID: "+Thread.currentThread().getId() + " "+i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class MyCallable implements Callable<String>{

    private final String name;
    MyCallable(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        String s="";
        for (int i = 0; i < 5; i++) {
            s="Callable "+name+" is running: "+i;
            System.out.println(s);
            Thread.sleep(500);
        }
        return s;
    }
}

public class ThreadLearn{
    public static void main(String[] args) {
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//        MyThread thread3 = new MyThread();
//        MyThread thread4 = new MyThread();
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<String> callable1 = new MyCallable("task1");
        Callable<String> callable2 = new MyCallable("task2");

        try {
            Future<String> f1=executor.submit(callable1);
            Future<String> f2=executor.submit(callable2);

            System.out.println("Task 1: " +f1.get());
            System.out.println("Task 2: "+f2.get());
        }catch (InterruptedException | ExecutionException e){
            System.out.println(e);
        }finally {
            executor.shutdown();
        }
    }
}
