package src;

public abstract class Banknote {

    protected String name;
    protected int width;
    protected int height;
    protected int size;
    protected String colour;
    protected int monetaryValue;
    protected String country;

    public final void initialize() {
        setName();
        setColour();
        setWidth();
        setHeight();
        setValue();
        setCountry();
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Size: " + width * height);
        System.out.println("Colour: " + colour);
        System.out.println("Monetary Value: " + monetaryValue);
        System.out.println("Country: " + country);
    }

    abstract void setName();

    abstract void setColour();

    abstract void setWidth();

    abstract void setHeight();

    abstract void setValue();

    abstract void setCountry();
}
