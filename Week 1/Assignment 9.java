import java.util.Scanner;

public class PrimeNumbersN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        
        System.out.println("Prime numbers between 1 and " + N + ":");
        for (int num = 1; num <= N; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

