package instruments;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(String material, String colour, InstrumentType instrumentType) {
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
