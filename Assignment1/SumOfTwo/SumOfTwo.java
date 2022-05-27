import java.util.*;

public class SumOfTwo{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println();

        System.out. print("Enter the First no = ");
        int num1 = scn.nextInt();

        System.out.println();
        System.out. print("Enter the Second no = ");
        int num2 = scn.nextInt();

        scn.close();
        int result = num1 + num2 ;

        System.out. println();
        System.out.println("The Sum of "+num1 +" and " +num2 +" is = "+result);

    }
}