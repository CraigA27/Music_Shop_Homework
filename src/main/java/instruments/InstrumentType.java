package instruments;

public enum InstrumentType {

    STRING("String"),
    WOODWIND("Woodwind"),
    BRASS("Brass"),
    PERCUSSION("Percussion"),
    KEYBOARD("Keyboard");

    private String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
