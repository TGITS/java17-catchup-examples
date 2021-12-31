package tgits.random;


import java.util.random.RandomGeneratorFactory;

public record AlgorithmInformation(String name, String group, int stateBits,
                                   AlgorithmCharacteristics characteristics) implements Comparable<AlgorithmInformation> {

    public static AlgorithmInformation fromRandomGenerator(RandomGeneratorFactory<java.util.random.RandomGenerator> factory) {
        return new AlgorithmInformation(
                factory.name(),
                factory.group(),
                factory.stateBits(),
                AlgorithmCharacteristics.fromRandomGenerator(factory));
    }

    @Override
    public int compareTo(AlgorithmInformation o) {
        return name.compareTo(o.name());
    }
}
