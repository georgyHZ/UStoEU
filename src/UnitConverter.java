package src;

public class UnitConverter {
    private double conversionFactor;

    public UnitConverter(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convert(double value) {
        return value * conversionFactor;
    }
}