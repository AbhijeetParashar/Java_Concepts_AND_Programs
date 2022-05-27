import java.util.*;

public class HCFLCM{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int hcf = 1, num1, num2;
        System.out.print("\nEnter the First number = ");
        num1 = scn.nextInt();
        System.out.print("\nEnter the Second number = ");
        num2 = scn.nextInt();
        int small = num1 > num2 ? num2 : num1;
        for(int i =1; i<=small; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("\nThe HCF of "+num1+" and "+num2+" is = "+hcf);
        int lcm = (num1 * num2) / hcf;
        System.out.println("\nThe LCM of "+num1+" and "+num2+" is = "+lcm);
    }
}