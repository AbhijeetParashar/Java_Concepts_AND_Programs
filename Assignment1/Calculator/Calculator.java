import java.util.*;
//5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all the numbers entered.
public class Calculator{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println();
            System.out.print("Enter the Operator : ");
            char op = scn.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){

                System.out.println();
                System.out.print("Enter First No = ");
                int num1 = scn.nextInt();
                
                System.out.println();
                System.out.print("Enter Second No = ");
                int num2 = scn.nextInt();

                switch(op){

                    case '+' :
                        ans = num1 + num2;
                        break;
                    
                    case '-' :
                        ans = num1 - num2;
                        break;
                    
                    case '/' :
                        if(num2 != 0){
                            ans = num1 / num2;
                        }else{
                            System.out.println("Invalid Operation, can not divide by 0");
                        }
                        
                        break;
                    
                    case '*' :
                        ans = num1 * num2;
                        break;
                    
                    case '%' :
                        ans = num1 % num2;
                        break;

                }
                System.out.println();
                System.out.println(num1 + " " +op+ " " +num2 + " = " +ans);
                System.out.println();
            }
            else if(op == 'x' || op == 'X'){
                System.out.println("\nProgram Ends, Thank you.");
                break;
            }
            else{
                System.out.println("\nInvalid Operator Entered. Please choose any of the following operator : + , - , * , / , % ");
            }
        }
    }
}