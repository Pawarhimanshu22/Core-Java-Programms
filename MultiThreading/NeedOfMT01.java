import java.util.Scanner;
//Thread and need Of Multiple Thread
public class NeedOfMT01 {

    public static void main(String[] args) {
        System.out.println("Calculation Task Started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Plase Inter First Number");

        int num1 = sc.nextInt();

        System.out.println("Please inter 2nd Number");
        int num2 = sc.nextInt();

        int res = num1 + num2 ;
        System.out.println(res);

        System.out.println("Calculation Tast End");

        System.out.println("***************************************");

        System.out.println("Printing * tasks ");
        for(int i = 0; i < 4; i++)
        {
            System.out.println("*");
        }

            System.out.println("Printing *  Tasks Endeded");

            System.out.println("*******************************************");

            System.out.println("displying impotant message task is starting");

            for(int i = 0; i < 4; i++)
            {
                System.out.println("Focous is important to master skills");

            }
    
            System.out.println("Displaying Important message  Task Ended");

        


    }
}