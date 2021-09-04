import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Rosewood", "Sunburst", InstrumentType.ACOUSTIC);
    }

    @Test
    public void hasStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasMaterial() {
        assertEquals("Rosewood", guitar.getMaterial());
    }

    @Test
    public void hasColour() {
        assertEquals("Sunburst", guitar.getColour());
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(InstrumentType.ACOUSTIC, guitar.getInstrumentType());
    }

    @Test
    public void canPlay() {
        assertEquals("BOOM", guitar.play());
    }
}
