package accessories;

public class GuitarStrings extends Accessory {

    String type;

    public GuitarStrings(double buyPrice, double sellPrice, String type) {
        super(buyPrice, sellPrice);
        this.type = type;
    }
}
