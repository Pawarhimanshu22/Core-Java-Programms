import java.util.Scanner;
class Addition{
   void Add()
   {
    Scanner scan = new Scanner(System.in); //for getting input from user

    System.out.println("Enter the first number:");
    int num1 = scan.nextInt(); // for integer input
    System.out.println("Enter second number:");
    int num2 = scan.nextInt();
    if(num1>0 && num2 < 100)
    {
        int res = num1 + num2 ;
        System.out.println("The sum is :" + res );
    }
    else
    {
        System.out.println("Invailid Input");
    }
   }
public static void main(String[] args)
   {
    Addition a = new Addition();
    a.Add();
   }

}