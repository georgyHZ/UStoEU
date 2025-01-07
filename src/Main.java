package src;

public class Main {
    public static void main(String[] args) {
        Government government = Government.getInstance();

        Double centimetres = 25.4;
        Number inches = government.convertCmToInch(centimetres);

        System.out.println("Inches: " + inches);
    }
}
