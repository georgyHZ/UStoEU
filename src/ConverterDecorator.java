package src;

public abstract class ConverterDecorator implements Convertion {
    protected Convertion decoratedConverter;

    public ConverterDecorator(Convertion decoratedConverter) {
        this.decoratedConverter = decoratedConverter;
    }

    @Override
    public double convert(double value) {
        return decoratedConverter.convert(value);
    }
}