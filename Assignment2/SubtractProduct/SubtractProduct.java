// Input: n = 4421
// Output: 21
// Explanation:
// Product of digits = 4 * 4 * 2 * 1 = 32
// Sum of digits = 4 + 4 + 2 + 1 = 11
// Result = 32 – 11 = 21

import java.util.*;

class subtract_product_and_sum
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number : ")
        int n = scn.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("Result of Products of digit - Sum of digits is = "+ result);
    }
    static int subtractProductAndSum(int n)
    {
        int product = 1 , sum = 0;
        while(n > 0)
        {
            //n % 10 extracts the last digit out of N
            product *= (n % 10);
            sum += (n % 10);
            n /= 10;
        }
        return product - sum;
    }
}