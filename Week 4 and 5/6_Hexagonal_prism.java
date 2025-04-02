public class HexagonalPrism {
    public static void main(String[] args) {
        double side = 4, height = 6;
        double baseArea = ((3 * Math.sqrt(3)) / 2) * side * side;
        double surfaceArea = 2 * baseArea + 6 * side * height;
        System.out.println("Surface Area of Hexagonal Prism: " + surfaceArea);
    }
}
