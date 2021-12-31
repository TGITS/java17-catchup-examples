package tgits.random;

import java.util.HashMap;
import java.util.Map;

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

    public String typeName(){
        return typeName;
    }

    private static final Map<String,AlgorithmType> mapSymbols = new HashMap<>();

    static {
        for (AlgorithmType algorithmType : values()) {
            mapSymbols.put(algorithmType.typeName(), algorithmType);
        }
    }

    // récupération de l'instance
    public static AlgorithmType fromTypeName(String typeName) {
        final AlgorithmType value = mapSymbols.get(typeName.toUpperCase());
        if (value != null) {
            return value;
        }
        throw new IllegalArgumentException("Unknown algorithm type : " + typeName);
    }
}
