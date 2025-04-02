class Vehicle {
    double price, interestRate;
    int loanTerm;

    Vehicle(double price, double interestRate, int loanTerm) {
        this.price = price;
        this.interestRate = interestRate;
        this.loanTerm = loanTerm;
    }

    double calculateEMI() {
        double monthlyRate = (interestRate / 100) / 12;
        return (price * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTerm));
    }
}

public class VehicleLoan {
    public static void main(String[] args) {
        Vehicle car = new Vehicle(500000, 7, 60);
        System.out.println("Monthly EMI: " + car.calculateEMI());
    }
}
