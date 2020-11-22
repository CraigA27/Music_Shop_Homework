package accessories;

import behaviours.ISell;

public abstract class Accessory implements ISell {

    double buyPrice;
    double sellPrice;

    public Accessory(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
