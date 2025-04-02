import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateManipulator {
    public static Date stringToDate(String date) throws Exception {
        return new SimpleDateFormat("dd-MM-yyyy").parse(date);
    }

    public static String dateToString(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

    public static long daysBetween(String date1, String date2) throws Exception {
        Date d1 = stringToDate(date1);
        Date d2 = stringToDate(date2);
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public static void main(String[] args) throws Exception {
        String date1 = "01-01-2024", date2 = "10-01-2024";
        System.out.println("Days Between: " + daysBetween(date1, date2));
    }
}
