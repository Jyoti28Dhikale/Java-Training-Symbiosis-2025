public class WindSpeed {
    public static void main(String[] args) {
        double temperature = 10, windSpeed = 20;
        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.println("Wind Chill Index: " + windChill);
    }
}
