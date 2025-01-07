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
    }
}
