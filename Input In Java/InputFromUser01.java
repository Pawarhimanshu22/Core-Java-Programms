import java.util.Scanner;
class InputFromUser01
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name  = sc.next(); // Taking input as a string
        System.out.println("Enter your Age : ");
        int age = sc.nextInt(); // Taking input as a Integer
        System.out.println("Enter Gender : ");
        char gender = sc.next().charAt(0); //taking input as a character on 0 index
        System.out.println("Enter your Phone Number : ");
        long phoneno = sc.nextLong(); // Taking input as a Long

        System.out.println("______________________________________________________________");

        System.out.println("Your Name Is : " + name);
        System.out.println("Your Gender is : " + gender);
        System.out.println("Your age Is : " + age);
        System.out.println("Your Phone Number Is : " + phoneno);


    }

}