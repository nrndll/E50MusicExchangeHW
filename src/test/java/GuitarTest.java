import shopItems.instruments.Guitar;
import shopItems.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Acoustic Guitar", 800, 1900,"Rosewood", "Sunburst", InstrumentType.STRING);
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
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }

    @Test
    public void hasType() {
        assertEquals("Acoustic Guitar", guitar.getType());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(800, guitar.getBoughtPrice(), 0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(1900, guitar.getSalePrice(), 0);
    }

    @Test
    public void canPlay() {
        assertEquals("BOOM", guitar.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(1100, guitar.calculateMarkup(), 0);
    }
}
