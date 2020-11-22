package instruments;

public class Guitar extends Instrument {

    String type;
    int stringNumber;

    public Guitar(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, String type, int stringNumber) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.type = type;
        this.stringNumber = stringNumber;
    }

    public String getType() {
        return type;
    }

    public int getStringNumber() {
        return stringNumber;
    }

    public String play(){
        return "Bwow chicka wow";
    }
}
