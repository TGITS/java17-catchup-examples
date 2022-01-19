package tgits.random.algorithm;


import java.util.random.RandomGeneratorFactory;

public record AlgorithmInformation(String name, String group, int stateBits,
                                   AlgorithmCharacteristics characteristics) implements Comparable<AlgorithmInformation> {

    public static AlgorithmInformation of(RandomGeneratorFactory<java.util.random.RandomGenerator> factory) {
        return new AlgorithmInformation(
                factory.name(),
                factory.group(),
                factory.stateBits(),
                AlgorithmCharacteristics.of(factory));
    }

    @Override
    public int compareTo(AlgorithmInformation o) {
        return name.compareTo(o.name());
    }
}
