//main Thread in java
public class MainThreadInJava02 {
    public static void main(String[] args) 
    {
        System.out.println("Main Thread");

        System.out.println("Before Changing");

        String name = Thread.currentThread().getName();// for getting name of thread

        System.out.println("the name of thread is :" + name);

        int priority = Thread.currentThread().getPriority(); // for getting the priority of threads

        System.out.println("The priority of main Thread is: " + priority);

        System.out.println("After Changing");

        //for setting the name of your thread 

        Thread t = Thread.currentThread();

        t.setName("Himanshu");
        t.setPriority(1 );

        String name1 = Thread.currentThread().getName();

        System.out.println("the name of thread is :" + name1);

        int priority1 = Thread.currentThread().getPriority();

        System.out.println("The priority of main Thread is: " + priority1);

// we can change the thread name and priority By using Inbuld class ki Inbuild menthods ko use kar ke 
//these all are static methods 
    }
}
