class Demo1 implements Runnable
{
    public void run()
    {
        System.out.println("Child Thread Executing");
        try{
            Thread.sleep(3000);

        }
        catch(Exception e)
        {
            System.out.println("Some Problem");

        }
        System.out.println("Child Thread task Completed");
    }
}

public class StateOfThread08 {
    public static void main(String[] args) {
        System.out.println("Mainn Thread Started");

        Demo1 d = new Demo1();

        Thread t1 = new Thread(d);

        t1.start();

    }
}
