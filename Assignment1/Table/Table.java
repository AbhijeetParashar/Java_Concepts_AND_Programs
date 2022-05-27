import java.util.*;

public class Table{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter the no : ");
        int num = scn.nextInt();
        scn.close();
        System.out.println();

        for(int i = 1; i<= 10; i++){
            int multiply = num * i ;
            System.out.println(num + " * " +i +" = "+ multiply);
        }
    }
}