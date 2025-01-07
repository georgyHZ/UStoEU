package src;

public class USD extends Banknote {

    public USD() {
        initialize();
    }

    void setName() {
        this.name = "United States Dollar";
    }

    void setColour() {
        this.colour = "Green";
    }

    void setWidth() {
        this.width = 156;
    }

    void setHeight() {
        this.height = 66;
    }

    void setValue() {
        this.monetaryValue = 100;
    }

    void setCountry() {
        this.country = "United States of America";
    }
}
