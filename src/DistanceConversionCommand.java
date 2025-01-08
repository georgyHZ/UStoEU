package src;

public class DistanceConversionCommand implements Command {
    private Converter converter;
    private double value;

    public DistanceConversionCommand(Converter converter, double value) {
        this.converter = converter;
        this.value = value;
    }

    @Override
    public void execute() {
        converter.convertDistance(value);
    }
}
