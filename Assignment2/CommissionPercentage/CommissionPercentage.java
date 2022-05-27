import java.util.*;

public class CommissionPercentage{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("\nEnter the Amount in Rs. = ");
        double amount = scn.nextDouble();

        System.out.print("\nEnter the Commission %  = ");
        double commission = scn.nextDouble();

        double finalAmount = ( commission  / 100) * amount;

        System.out.println("\nThe Commission Amount will be = "+finalAmount);
    }
}