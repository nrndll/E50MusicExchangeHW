package shopItems.instruments;

import shopItems.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(String type, double boughtPrice, double salePrice, String material, String colour, InstrumentType instrumentType) {
        super(type, boughtPrice, salePrice);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
