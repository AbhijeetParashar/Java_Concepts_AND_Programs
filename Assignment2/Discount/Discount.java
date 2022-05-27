import java.util.*;

public class Discount{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("\nEnter the Price of the Product Rs. = ");
        double price = scn.nextDouble();

        System.out.print("\nEnter the Discount % on the Product = ");
        double discount = scn.nextDouble();

        double finalPrice = ( price * discount ) / 100;

        System.out.println("\nThe Final Price of the Product is = "+finalPrice);
    }
}