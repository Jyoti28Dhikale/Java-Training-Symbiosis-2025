public class EmployeeRating {
    public static void main(String[] args) {
        int certifications = 8; 
        double salary = 50000;
        double increment = (certifications >= 10) ? 10 : (certifications >= 5) ? 5 : (certifications >= 1) ? 2.5 : 0;
        double newSalary = salary + (salary * increment / 100);
        System.out.println("New Salary: " + newSalary);
    }
}
