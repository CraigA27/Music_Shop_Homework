import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("wood", "black", InstrumentType.KEYBOARD, 350.00, 500.00, "upright");
    }

    @Test
    public void canPlay(){
        assertEquals("Plink plink", piano.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(150.00, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals("Keyboard", piano.getInstrumentType());
    }




}
