public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(num + " is " + (sum == num ? "Armstrong" : "Not Armstrong"));
    }
}
