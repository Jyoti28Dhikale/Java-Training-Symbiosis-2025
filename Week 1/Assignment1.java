import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Adding two integers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + (num1 + num2));

        // Adding two binary numbers
        System.out.print("Enter first binary number: ");
        int bin1 = sc.nextInt(2);
        System.out.print("Enter second binary number: ");
        int bin2 = sc.nextInt(2);
        System.out.println("Binary Sum: " + Integer.toBinaryString(bin1 + bin2));

        // Adding two characters
        System.out.print("Enter first character: ");
        char ch1 = sc.next().charAt(0);
        System.out.print("Enter second character: ");
        char ch2 = sc.next().charAt(0);
        System.out.println("Character Sum (ASCII values): " + (ch1 + ch2));
        
        sc.close();
    }
}


