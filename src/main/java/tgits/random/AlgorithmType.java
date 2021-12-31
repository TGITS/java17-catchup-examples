package tgits.random;

public enum AlgorithmType {
    SPLITTABLE("SPLITTABLE"),
    STREAMABLE("STREAMABLE"),
    JUMPABLE("JUMPABLE"),
    ARBITRARY_JUMPABLE("ARBITRARY-JUMPABLE"),
    LEAPABLE("LEAPABLE"),
    HARDWARE("HARDWARE"),
    STATISTICAL("STATISTICAL"),
    STOCHASTIC("STOCHASTIC");

    private final String typeName;

    AlgorithmType(String typeName) {
        this.typeName = typeName;
    }
}
