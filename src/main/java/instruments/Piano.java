package instruments;

public class Piano extends Instrument {

    String type;

    public Piano(String material, String colour, InstrumentType instrumentType, Double buyPrice, Double sellPrice, String type) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.type = type;
    }

    public String play(){
        return "Plink plink";
    }
}
