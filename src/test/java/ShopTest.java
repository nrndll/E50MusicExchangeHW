import org.junit.Before;
import org.junit.Test;
import shopItems.GuitarStrings;
import shopItems.instruments.Guitar;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        shop = new Shop();
        guitar = new Guitar("Acoustic Guitar", 800, 1900,"Rosewood", "Sunburst", InstrumentType.STRING);
        guitarStrings = new GuitarStrings("Martin", 6, 14);
    }

    @Test
    public void canAddStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.getTotalStock());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(guitar);
        shop.removeStock(guitar);
        assertEquals(0, shop.getTotalStock());
    }

    @Test
    public void canGetPotentialProfit() {
        shop.addStock(guitar);
        shop.addStock(guitarStrings);
        assertEquals(1108, shop.getPotentialProfit(), 0);
    }
}
