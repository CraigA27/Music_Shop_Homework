import accessories.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void before(){
        amplifier = new Amplifier(175.00, 250.00, "Fender", 100);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(75.00, amplifier.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(250.00, amplifier.getSellPrice(), 0.01);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(175.00, amplifier.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetBrand(){
        assertEquals("Fender", amplifier.getBrand());
    }

    @Test
    public void canGetWattage(){
        assertEquals(100, amplifier.getWattage(), 0.01);
    }


}
