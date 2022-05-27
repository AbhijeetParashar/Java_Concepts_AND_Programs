import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle amount ");
        int prin = sc.nextInt();

        System.out.println("Enter time period ");
        double time = sc.nextDouble();

        System.out.println("Enter rate ");
        double rate = sc.nextDouble();

        double si = (prin * rate * time) / 100;
        System.out.println("Simple Interest is " + si);
    }
}