package src;

public class LoggingConverterDecorator extends ConverterDecorator {
    public LoggingConverterDecorator(Convertion decoratedConverter) {
        super(decoratedConverter);
    }

    @Override
    public double convert(double value) {
        double result = super.convert(value);
        System.out.println("Converted value: " + result);
        return result;
    }
}
