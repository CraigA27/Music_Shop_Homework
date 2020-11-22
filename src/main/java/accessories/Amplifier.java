package accessories;

public class Amplifier extends Accessory{

    String brand;
    int wattage;

    public Amplifier(double buyPrice, double sellPrice, String brand, int wattage) {
        super(buyPrice, sellPrice);
        this.brand = brand;
        this.wattage = wattage;
    }

    public String getBrand() {
        return brand;
    }

    public double getWattage() {
        return wattage;
    }


}
