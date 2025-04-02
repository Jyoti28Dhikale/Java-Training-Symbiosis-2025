import java.util.Scanner;

//(A) Using Switch Case
public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: 1-Addition, 2-Subtraction");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Addition: " + (5 + 3));
            case 2 -> System.out.println("Subtraction: " + (5 - 3));
            default -> System.out.println("Invalid Choice");
        }
    }
}
//B) Using Recursion (Factorial Example)
public class RecursionExample {
    static int factorial(int n) { return (n == 0) ? 1 : n * factorial(n - 1); }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
//(C) Print Patterns
public class PrintPatterns {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


