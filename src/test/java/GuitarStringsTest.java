import org.junit.Before;
import org.junit.Test;
import shopItems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("Ernie Ball", 3, 8);
    }

    @Test
    public void hasType() {
        assertEquals("Ernie Ball", guitarStrings.getType());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(3, guitarStrings.getBoughtPrice(), 0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(8, guitarStrings.getSalePrice(), 0);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(5, guitarStrings.calculateMarkup(), 0);
    }
}
