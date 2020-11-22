import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public void removeFromStock(ISell item){
        stock.remove(item);
    }

    public double getPotentialProfit() {
        double total = stock
                .stream()
                .map(ISell::calculateMarkup)
                .reduce(0.00, (sum, markup) -> sum += markup);
                return total;
    }
}
