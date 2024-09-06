import java.util.Scanner;

class Calc implements Runnable {
    public void run() {
        System.out.println("Calculation Task Started");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the 1st number");
            int num1 = sc.nextInt();

            System.out.println("Enter the 2nd Number");
            int num2 = sc.nextInt();

            int res = num1 + num2;

            System.out.println(res);
        }
        System.out.println("Calculation Task Ended");
        System.out.println("________________________________________");

    }
}

class Message implements Runnable {
    public void run()
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

public class CreateThreadByRunnableInterface05 {
    public static void main(String[] args) {

        System.out.println(" main Thread started");

        Calc c1 = new Calc();

        Message m2 = new Message();

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m2 );

        t1.start();
        t2.start();
    }
}

