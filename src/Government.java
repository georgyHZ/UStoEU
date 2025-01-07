package src;

//this is a Singleton class
//the Government declares how many centimetres are in an inch

public class Government {

    private static Government instance = null;

    public Double cmToInchRatio;

    private Government() {
        cmToInchRatio = 0.3937;
    }

    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }

    public Number convertInchToCm(Double arg1) {
        arg1 = arg1 / cmToInchRatio;
        return arg1;
    }

    public Number convertCmToInch(Double arg1) {
        arg1 = arg1 * cmToInchRatio;
        return arg1;
    }
};
