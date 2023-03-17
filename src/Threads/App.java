package Threads;


class AppThread extends Thread {
    public void run() {
        for(int i = 0; i< 5; i++) {
            System.out.println("Thread " + currentThread().getName() + " is running");
        }

    }
}


public class App {

    public  static void main(String[] args) {
         AppThread t1 = new AppThread();
         t1.setName("T1");

        AppThread t2 = new AppThread();
        t2.setName("T2");

        AppThread t3 = new AppThread();
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();

        t3.suspend();
        t3.resume();
    }
}
