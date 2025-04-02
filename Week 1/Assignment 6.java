import java.util.Scanner;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        
        Circle c = new Circle(radius);
        System.out.println("Area: " + c.getArea());
        System.out.println("Circumference: " + c.getCircumference());
        
        sc.close();
    }
}

