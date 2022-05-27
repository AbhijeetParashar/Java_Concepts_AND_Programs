import java.util.Scanner;

public class CheckLeapYear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Year you want to check : ");
        int year = scn.nextInt();
        scn.close();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a Leap Year");
        }else{
            System.out.println(year + " is a not Leap Year");
        }
    }
}