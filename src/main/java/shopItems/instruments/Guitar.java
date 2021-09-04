package shopItems.instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String type, double boughtPrice, double salePrice, String material, String colour, InstrumentType instrumentType) {
        super(type, boughtPrice, salePrice, material, colour, instrumentType);
        this.strings = 6;
    }

    public String play() {
        return "BOOM";
    }

    public int getStrings() {
        return strings;
    }
}
