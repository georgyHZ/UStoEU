package src;

public class Main {
    public static void main(String[] args) {
        //Singleton
        Government government = Government.getInstance();

        Double centimetres = 25.4;
        Number inches = government.convertCmToInch(centimetres);

        System.out.println("Inches: " + inches);

        //Adapter
        AmericanCar car = new AmericanCar();
        SpeedAdapter adapter = new SpeedAdapter(car);
        Speedometer speedometer = new Speedometer();

        System.out.println("Can the car drive? " + speedometer.checkIfBelowMaxSpeed(adapter));

        //Template
        USD usd = new USD();
        usd.print();


        //Factory Method Weight Converter

        WeightConverter poundsConverter = new PoundsToKilogramsConverter();
        UnitConverter poundsToKg = poundsConverter.createConverter();
        double kilograms = poundsToKg.convert(150);
        System.out.println("150 pounds is " + kilograms + " kilograms.");

        WeightConverter ouncesConverter = new OuncesToGramsConverter();
        UnitConverter ouncesToGrams = ouncesConverter.createConverter();
        double grams = ouncesToGrams.convert(16);
        System.out.println("16 ounces is " + grams + " grams.");


        // Command pattern

        Converter converter = new Converter();
        Command tempCommand = new TemperatureConversionCommand(converter, 100);
        Command distCommand = new DistanceConversionCommand(converter, 50);
        ConversionInvoker invoker = new ConversionInvoker();
        invoker.setCommand(tempCommand);
        invoker.executeCommand();
        invoker.setCommand(distCommand);
        invoker.executeCommand();

        // Decorator (sadly we were out of units)

        Convertion basicConverter = new BasicConverter(0.453592);
        Convertion loggingConverter = new LoggingConverterDecorator(basicConverter);
        Convertion validatedLoggingConverter = new ValidationConverterDecorator(loggingConverter);

        double result = validatedLoggingConverter.convert(150);
        System.out.println("150 pounds is " + result + " kilograms.");

        result = validatedLoggingConverter.convert(-5);
        System.out.println("Result for invalid input: " + result);
    }
}
