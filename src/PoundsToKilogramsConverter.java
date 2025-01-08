package src;

public class PoundsToKilogramsConverter extends WeightConverter {
    @Override
    public UnitConverter createConverter() {
        return new UnitConverter(0.453592); // Conversion factor for pounds to kilograms
    }
}
