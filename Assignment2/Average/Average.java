import java.util.*;

public class Average{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("\n Enter the number = ");
        int n = scn.nextInt();
        double sum = 0 ;
        double avg;
        for(int i=1; i<=n; i++){
            System.out.print("\nEnter the "+ i +" number = ");
            double num = scn.nextDouble();
            sum = sum + num;
        }

        System.out.println("\nAverage of the numbers is = "+sum/n);
    }
}