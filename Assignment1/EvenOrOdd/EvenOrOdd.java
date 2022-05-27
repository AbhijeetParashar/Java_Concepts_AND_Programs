import java.util.Scanner;

public class EvenOrOdd {
  public static void main(String args[])
  {
    int num;
    System.out.print("Enter an Integer number:");
    Scanner scn = new Scanner(System.in);
    num = scn.nextInt();
    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}