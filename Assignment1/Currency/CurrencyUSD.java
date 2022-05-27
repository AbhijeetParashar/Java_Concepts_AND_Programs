import java.util.*;

public class CurrencyUSD {
    public static void main(String []args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value in INR : ");
        double inr = scn.nextInt();
        double usd = inr * 0.013;
        System.out.println("The value in USD : "+usd);
        scn.close();
    }
}