package src;

public class BasicConverter implements Convertion {
    private double conversionFactor;

    public BasicConverter(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    @Override
    public double convert(double value) {
        return value * conversionFactor;
    }
}
