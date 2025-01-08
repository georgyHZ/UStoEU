package src;

public class TemperatureConversionCommand implements Command {
    private Converter converter;
    private double value;

    public TemperatureConversionCommand(Converter converter, double value) {
        this.converter = converter;
        this.value = value;
    }

    @Override
    public void execute() {
        converter.convertTemperature(value);
    }
}