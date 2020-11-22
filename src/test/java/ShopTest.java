import accessories.Amplifier;
import accessories.GuitarStrings;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Saxophone saxophone;
    Piano piano;
    Amplifier amplifier;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitarStrings = new GuitarStrings(5.00, 8.00, "nylon");
        saxophone = new Saxophone("metal", "brass", InstrumentType.WOODWIND, 220.00, 300.00, "tenor");
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 350.00, 500.00, "upright");
        amplifier = new Amplifier(175.00, 250.00, "fender", 100);
        guitar = new Guitar("wood", "red", InstrumentType.STRING, 180.00, 270.00, "Bass", 4);

    }

    @Test
    public void canAddToStock(){
        shop.addToStock(piano);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(piano);
        shop.removeFromStock(piano);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canGetPotentialProfit(){
        shop.addToStock(piano);
        shop.addToStock(saxophone);
        shop.addToStock(amplifier);
        shop.addToStock(guitarStrings);
        assertEquals(308.00, shop.getPotentialProfit(), 0.01);

    }
}
