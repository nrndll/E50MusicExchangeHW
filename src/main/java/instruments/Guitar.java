package instruments;

public class Guitar extends Instrument {

    private int strings;

    public Guitar(String material, String colour, InstrumentType instrumentType) {
        super(material, colour, instrumentType);
        this.strings = 6;
    }

    public String play() {
        return "BOOM";
    }

    public int getStrings() {
        return strings;
    }
}
