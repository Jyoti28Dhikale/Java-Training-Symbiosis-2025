public class SquareRoot {
    public static void main(String[] args) {
        int num = 25;
        double guess = num / 2.0;
        double epsilon = 0.001;

        while (Math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2;
        }
        System.out.println("Square root: " + guess);
    }
}
