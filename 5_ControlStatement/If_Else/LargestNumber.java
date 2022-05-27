import java.util.Scanner;

class LargesrNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Please Enter the First no : ");
        int num1 = scn.nextInt();

        System.out.print("Please Enter the Second no : ");
        int num2 = scn.nextInt();

        System.out.print("Please Enter the Third no : ");
        int num3 = scn.nextInt();

        if(num1 > num2){
            if(num1 > num3){
                System.out.println("First Number " +num1 + " is the largest among the three numbers");
            }
            else{
                System.out.println("Third Number " +num3 + " is the largest among the three numbers");
            }
        }else{
            if(num2 > num3){
                System.out.println("Second Number " +num2 + " is the largest among the three numbers");
            }
            else{
                System.out.println("Third Number " +num3 + " is the largest among the three numbers");
            }
        }
    }
}