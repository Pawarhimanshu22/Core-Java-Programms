import java.util.Scanner;

class MyThread1 extends Thread {
    public void run() 
    {
        String tname = Thread.currentThread().getName();
        if (tname.equals("CALC")) {
            calc();
        }
        else 
        {
            importantMessage();

        }


    }
    public void calc()
    {
        System.out.println("Calculation Task Started");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();

        System.out.println("Enter the 2nd Number");
        int num2 = sc.nextInt();

        int res = num1 + num2;

        System.out.println(res);

        System.out.println("Calculation Task Ended");
        System.out.println("________________________________________");

    }

    public void importantMessage()
    {
        System.out.println("Displaying Important Message task");
        
            try
            {
                for(int i = 0; i<9; i++)
        {
            System.out.println("If you want to get succes in your life you have to work aisa jaise teri 7 oushto me kisi ne nahi kiya BC");

            Thread.sleep(2000);

            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem22");

        }
        System.out.println("Displaying message task is ended");

        System.out.println("________________________________________");

    }
}

// class Message extends Thread {
//     public void run()
//     {
        
//     }
// }  is class ki koi requrement nahi hai kyonki sare task run() method ke sath execute kar rahe hai

public class MultipleTaskWithinSingleRun07 {
    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();

        MyThread1 thread2 = new MyThread1();

        thread1.setName("CALC");
        thread2.setName("PRINT");

        thread1.start();
        thread2.start();
    }
}
