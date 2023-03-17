package Threads;

class Addition extends Thread {
    public int sum;
    public Addition()
    {
        sum = 0;
    }
    public void run() {

        synchronized (this) {
            //Add numbers from 1 to 5
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }

            notify();
        }
    }
}

public class sync {

    public static void main(String[] args) {
        Addition a = new Addition();
        a.start();
        a.setPriority(10);
        synchronized (a) {
            try {
                a.wait();
            } catch (InterruptedException e) {
                System.err.println("Exception");
            }
            System.out.println(a.sum);
        }
    }
}
