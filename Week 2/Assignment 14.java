public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, sum;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
