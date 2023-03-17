package Threads;

class Number extends Thread
{
    public void run()
    {   // write thread codes here
        for(int counter=1;counter<=20;counter++)
        {
            if (counter==10)
            {   stop();
                System.out.println("counter is "+counter);

            }
        }
    }
}
public class test {
    public static void main(String[] args) {
        Number threadx=new Number();
        threadx.start();
    }
}