package src;

public class Speedometer {
    // Maximum allowed speed in kilometers
    private int maxSpeedAllowed = 150;

    public boolean checkIfBelowMaxSpeed(Speed speed) {
        return speed.getSpeedInKm() < maxSpeedAllowed;
    }
}
