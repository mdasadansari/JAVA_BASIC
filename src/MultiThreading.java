
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main method thread name "+Thread.currentThread().getName());

        MyThread t1 = new MyThread();
        t1.start();
//        t1.join();
        MyThreadImp t2 = new MyThreadImp();
        Thread thread = new Thread(t2);
        thread.start();
//        thread.join();
    }
}

//By Extending Thread CLass
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Custom thread by Thread class extension "+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
        Thread.currentThread().setName("ThreadByExtension");
        System.out.println("Custom thread by Thread class extension "+Thread.currentThread().getName());
    }
}

//By Implementing Runnable
class MyThreadImp implements Runnable{
    @Override
    public void run() {
        System.out.println("Custom thread by Runnable interface implementation "+Thread.currentThread().getName());
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        Thread.currentThread().setName("ThreadByRunnable");
        System.out.println("Custom thread by Runnable interface implementation "+Thread.currentThread().getName());

    }
}
