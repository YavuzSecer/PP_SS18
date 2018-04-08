package Logic;

public enum Direction {

    VERTICAL("v"),
    HORIZONTAL("h"),
    NONE("");

    public final String value;

    Direction(final String value) {
        this.value = value;
    }
}
