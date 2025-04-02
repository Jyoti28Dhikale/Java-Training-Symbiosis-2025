public class AdditionWays {
    static int add1(int a, int b) { return a + b; }
    static int add2(int a, int b) { return Math.addExact(a, b); }
    static int add3(int a, int b) { return a - (-b); }
    static int add4(int a, int b) { while (b != 0) { int carry = a & b; a = a ^ b; b = carry << 1; } return a; }
    static int add5(int a, int b) { return Integer.sum(a, b); }

    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(add1(a, b));
        System.out.println(add2(a, b));
        System.out.println(add3(a, b));
        System.out.println(add4(a, b));
        System.out.println(add5(a, b));
    }
}
