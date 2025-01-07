package src;

public class SpeedAdapter implements Speed {
    private AmericanCar americanCar;

    public SpeedAdapter(AmericanCar americanCar) {
        this.americanCar = americanCar;
    }

    @Override
    public int getSpeedInKm() {
        return (int) (americanCar.getSpeedInMiles() * 1.6);
    }
}
