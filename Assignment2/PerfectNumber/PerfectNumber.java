// What is a perfect number in Java?

// A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
//In other words, if the sum of positive divisors (excluding the number itself)
//of a number equals the number itself is called a perfect number. Let's understood it through an example.

// Example of a Perfect Number
// Let's take the number 496 and heck it is a perfect number or not.

// First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248.
// Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496). 
// We observe that the sum of factors is equal to the number itself. 
// Hence, the number 496 is a perfect number. Similarly, we can check other numbers also.


import java.util.Scanner;

public class PerfectNumberExample1  
{  
    public static void main(String args[])
    {  
        long n, sum=0;  
        Scanner sc=new Scanner(System.in);         
        System.out.print("Enter the number: ");  
        n=sc.nextLong();  
        int i=1;  
        //executes until the condition becomes false  
        while(i <= n/2)  
        { 
            if(n % i == 0)  
            {  
            //calculates the sum of factors  
            Sum = sum + i;  
            } //end of if  
            //after each iteration, increments the value of variable i by 1  
            i++;  
        } //end of while  
        //compares sum with the number  
        if(sum==n)  
        {  
            //prints if sum and n are equal  
            System.out.println(n+" is a perfect number.");  
        } //end of if  
        else{
            //prints if sum and n are not equal  
            System.out.println(n+" is not a perfect number.");
        }
    }  
}