// d(P, Q) = √ (x2 − x1)^2 + (y2 − y1)^2

import java.util.*;
import java.lang.Math;

public class DistanceBwTwoPoints{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x1, x2, y1, y2 ;
        double d;

        System.out.println("\nEnter First Cordinates values :");
        System.out.print("\nEnter the value for X1 = ");
        x1 = scn.nextInt();
        System.out.print("\nEnter the value for Y1 = ");
        y1 = scn.nextInt();
        
        System.out.println("\nEnter Second Cordinates values :");
        System.out.print("\nEnter the value for X2 = ");
        x2 = scn.nextInt();
        System.out.print("\nEnter the value for Y2 = ");
        y2 = scn.nextInt();

        d= Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.println("\nThe distance between the two points is = "+d);
    }
}