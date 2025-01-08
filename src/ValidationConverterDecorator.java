package src;

public class ValidationConverterDecorator extends ConverterDecorator {
    public ValidationConverterDecorator(Convertion decoratedConverter) {
        super(decoratedConverter);
    }

    @Override
    public double convert(double value) {
        if (value < 0) {
            System.out.println("Invalid value: " + value);
            return 0;
        }
        return super.convert(value);
    }
}

