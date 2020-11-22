package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    String material;
    String colour;
    InstrumentType instrumentType;
    double buyPrice;
    double sellPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getInstrumentType() {
        return instrumentType.getName();
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        double markup = this.sellPrice - this.buyPrice;
        return markup;
    }


}
