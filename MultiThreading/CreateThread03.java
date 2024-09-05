class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Child Thread");
    }

} 
public class CreateThread03 {
    public static void main(String[] args)
    {
        System.out.println("Main Thread");
        MyThread t = new MyThread();
        t.start();


    }
}
