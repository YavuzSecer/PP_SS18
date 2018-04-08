package Logic;


public enum Color {

    ANY("d"),
    BLUE("b"),
    GREEN("g"),
    WHITE("w"),
    YELLOW("y"),
    RED("r"),
    PINK("p");

    public final String value;

    Color(final String value) {
        this.value = value;
    }
}

