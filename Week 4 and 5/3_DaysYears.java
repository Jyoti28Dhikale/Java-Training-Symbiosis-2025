public class DaysToYears {
    public static void main(String[] args) {
        int days = 800;
        int years = days / 365;
        int remainingDays = days % 365;
        System.out.println(days + " days = " + years + " years and " + remainingDays + " days");
    }
}
