package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n" +
                    " __     __  __                            ________                                                  \n" +
                    "|  \\   |  \\|  \\                          |        \\                                                 \n" +
                    "| $$   | $$ \\$$ __     __  ______        | $$$$$$$$__    __   ______    ______    ______    ______  \n" +
                    "| $$   | $$|  \\|  \\   /  \\|      \\       | $$__   |  \\  |  \\ /      \\  /      \\  /      \\  |      \\ \n" +
                    " \\$$\\ /  $$| $$ \\$$\\ /  $$ \\$$$$$$\\      | $$  \\  | $$  | $$|  $$$$$$\\|  $$$$$$\\|  $$$$$$\\  \\$$$$$$\\\n" +
                    "  \\$$\\  $$ | $$  \\$$\\  $$ /      $$      | $$$$$  | $$  | $$| $$   \\$$| $$  | $$| $$  | $$ /      $$\n" +
                    "   \\$$ $$  | $$   \\$$ $$ |  $$$$$$$      | $$_____| $$__/ $$| $$      | $$__/ $$| $$__/ $$|  $$$$$$$\n" +
                    "    \\$$$   | $$    \\$$$   \\$$    $$      | $$     \\\\$$    $$| $$       \\$$    $$| $$    $$ \\$$    $$\n" +
                    "     \\$     \\$$     \\$     \\$$$$$$$       \\$$$$$$$$ \\$$$$$$  \\$$        \\$$$$$$ | $$$$$$$   \\$$$$$$$\n" +
                    "                                                                                | $$                \n" +
                    "                                                                                | $$                \n" +
                    "                                                                                 \\$$                \n");
            System.out.println("Choose an operation:");
            System.out.println("1. Convert centimeters to inches");
            System.out.println("2. Check if the car can drive");
            System.out.println("3. Print USD details");
            System.out.println("4. Convert pounds to kilograms");
            System.out.println("5. Convert ounces to grams");
            System.out.println("6. Execute temperature conversion command");
            System.out.println("7. Execute distance conversion command");
            System.out.println("8. Use pound to kg converter (again)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    // Singleton
                    Government government = Government.getInstance();

                    System.out.print("Enter centimeters: ");
                    double centimetres = scanner.nextDouble();
                    Number inches = government.convertCmToInch(centimetres);
                    System.out.println(centimetres + " cm is " + inches + " inches.");
                    break;
                }
                case 2: {
                    // Adapter
                    AmericanCar car = new AmericanCar();
                    SpeedAdapter adapter = new SpeedAdapter(car);
                    Speedometer speedometer = new Speedometer();

                    System.out.println("Can the car drive? " + speedometer.checkIfBelowMaxSpeed(adapter));
                    System.out.print("Car details are adjustable in the code ");
                    break;
                }
                case 3: {
                    // Template
                    USD usd = new USD();
                    usd.print();
                    break;
                }
                case 4: {
                    // Factory Method Weight Converter
                    WeightConverter poundsConverter = new PoundsToKilogramsConverter();
                    UnitConverter poundsToKg = poundsConverter.createConverter();

                    System.out.print("Enter pounds: ");
                    double pounds = scanner.nextDouble();
                    double kilograms = poundsToKg.convert(pounds);
                    System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
                    break;
                }
                case 5: {
                    // Factory Method Weight Converter
                    WeightConverter ouncesConverter = new OuncesToGramsConverter();
                    UnitConverter ouncesToGrams = ouncesConverter.createConverter();

                    System.out.print("Enter ounces: ");
                    double ounces = scanner.nextDouble();
                    double grams = ouncesToGrams.convert(ounces);
                    System.out.println(ounces + " ounces is " + grams + " grams.");
                    break;
                }
                case 6: {
                    // Command pattern
                    Converter converter = new Converter();
                    System.out.print("Enter temperature in Celsius: ");
                    double temperature = scanner.nextDouble();
                    Command tempCommand = new TemperatureConversionCommand(converter, temperature);
                    ConversionInvoker invoker = new ConversionInvoker();
                    invoker.setCommand(tempCommand);
                    invoker.executeCommand();
                    break;
                }
                case 7: {
                    // Command pattern
                    Converter converter = new Converter();
                    System.out.print("Enter distance in kilometers: ");
                    double distance = scanner.nextDouble();
                    Command distCommand = new DistanceConversionCommand(converter, distance);
                    ConversionInvoker invoker = new ConversionInvoker();
                    invoker.setCommand(distCommand);
                    invoker.executeCommand();
                    break;
                }
                case 8: {
                    // Decorator
                    Convertion basicConverter = new BasicConverter(0.453592);
                    Convertion loggingConverter = new LoggingConverterDecorator(basicConverter);
                    Convertion validatedLoggingConverter = new ValidationConverterDecorator(loggingConverter);

                    System.out.print("Enter pound value to convert: ");
                    double value = scanner.nextDouble();
                    double result = validatedLoggingConverter.convert(value);
                    System.out.println("Converted result in kg: " + result);
                    break;
                }
                case 9: {
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
            System.out.println();
        }
    }
}
