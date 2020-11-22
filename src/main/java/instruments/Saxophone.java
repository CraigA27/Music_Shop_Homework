package instruments;

public class Saxophone extends Instrument {

    String type;

    public Saxophone(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, String type) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "Brrrert";
    }
}
