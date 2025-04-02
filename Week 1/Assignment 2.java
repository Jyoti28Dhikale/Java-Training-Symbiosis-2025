import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time (years): ");
        int time = sc.nextInt();
        
        System.out.print("Enter number of times interest applied per year: ");
        int n = sc.nextInt();
        
        double amount = principal * Math.pow(1 + (rate / 100) / n, n * time);
        double interest = amount - principal;
        
        System.out.println("Compound Interest: " + interest);
        sc.close();
    }
}

