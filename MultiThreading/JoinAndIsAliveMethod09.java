class Printing implements Runnable
{
    public void run()
    {
        try
        {
            for(int i = 0; i < 4; i++)
            {
                System.out.println("Focus is Important");
                Thread.sleep(3000);

            }
        }
        catch(Exception e)
        {
            System.out.println("Some Problem");

        }
    }
}

public class JoinAndIsAliveMethod09 {
    public static void main(String[] args) {
        System.out.println("Main MEthos is started");

        Printing p = new Printing();

        Thread t1 = new Thread(p);

        System.out.println(t1.isAlive());

        t1.start();
        
        System.out.println(t1.isAlive());

        try {
            t1.join();
        }
        catch (InterruptedException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("Main Thread Finished the work");
    }
}
