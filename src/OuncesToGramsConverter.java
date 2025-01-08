package src;

public class OuncesToGramsConverter extends WeightConverter {
    @Override
    public UnitConverter createConverter() {
        return new UnitConverter(28.3495); // Conversion factor for ounces to grams
    }
}