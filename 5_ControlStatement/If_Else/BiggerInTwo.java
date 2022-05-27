import java.util.Scanner;

class BiggerInTwo
{
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your First number : ");
        int num1 = scn.nextInt();
        System.out.print("Enter your Second number : ");
        int num2 = scn.nextInt();
        System.out.println();

        if(num1 > num2)
        {
            System.out.println("First number is the bigger number ");
        }
        else
        {
            System.out.println("Second number is the bigger number ");
        }
    }
}