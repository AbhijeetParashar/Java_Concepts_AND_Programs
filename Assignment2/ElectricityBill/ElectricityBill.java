/* How to calculate Electricity Bill

For example, a consumer consumes 500 watts per hour daily for one month.  Calculate the total energy bill of that consumer if per unit rate is 7? ( In $, £, €, INR, DHR, Riyal etc) [Take 1 month = 30 Days].

Solution :

s we know that 1 Unit = 1kWh

So total kWh = 500 watts x 24 hours x 30 days = 360000

So, we want to convert into units:

Where 1 unit = 1kWh

Total consumed units are as 360000/1000 = 360

And, cost per unit is = 7, the total cost of the electricity bill is 360 x 7 = 2520
 */

/*
Assume 
    1 to 100 units – Rs. 10/unit
    100 to 200 units – Rs. 15/unit
    200 to 300 units – Rs. 20/unit
    above 300 units – Rs. 25/unit
 */

import java.util.Scanner;

public class ElectricityBill{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("\nEnter the no of units = ");
        int units = scn.nextInt();
        scn.close();
        double bill =0;
        if(units <= 100){
            bill = units * 10;
            System.out.println("\nElectricity bill = "+bill);
        }
        else if(units <= 200){
            bill = (100 * 10) + (units - 100) * 15;
            System.out.println("\nElectricity bill = "+bill);
        }
        else if(units <= 300){
            bill = (100 * 10) +(100 * 15) + (units - 200)*20;
            System.out.println("\nElectricity bill = "+bill);
        }
        else if(units > 300){
            bill = (100 * 10) +(100 * 15) +(100*20)+ (units - 200)*25;
            System.out.println("\nElectricity bill = "+bill);
        }else{
            System.out.println("\nElectricity bill = "+bill);
        }
    }
}