//Find if a number is palindrome or not

import java.util.*;

public class PalindromeNumber{
    public static void main(String[] args)
    {
        int rev=0;
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int newNum = num;
        //reversing a number
        while(num != 0){
            rev = num % 10 + rev * 10;
            num /= 10;
        }
        //checking
        if(rev == newNum){
            System.out.print("Given Number is a Palindrome Number...!!");
        }
        else{
            System.out.print("Given Number is NOT a Palindrome Number...!!");
        }
        

    }
}