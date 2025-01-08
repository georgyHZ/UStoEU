package src;

public class Converter {
    public void convertTemperature(double value) {
        double celsius = (value - 32) * 5/9;
        System.out.println("Converted temperature: " + celsius + " Celsius");
    }

    public void convertDistance(double value) {
        double kilometers = value * 1.60934;
        System.out.println("Converted distance: " + kilometers + " kilometers");
    }
}