package tgits.random.algorithm;


import java.math.BigInteger;
import java.util.random.RandomGeneratorFactory;

public record AlgorithmCharacteristics(boolean splittable, boolean streamable, boolean jumpable,
                                       boolean arbitrarilyJumpable, boolean leapable, boolean hardware,
                                       boolean statistical, boolean stochastic, boolean deprecated,
                                       int equidistribution, BigInteger period) {

    public static AlgorithmCharacteristics of(RandomGeneratorFactory<java.util.random.RandomGenerator> factory) {
        return new AlgorithmCharacteristics(
                factory.isSplittable(),
                factory.isStreamable(),
                factory.isJumpable(),
                factory.isArbitrarilyJumpable(),
                factory.isLeapable(),
                factory.isHardware(),
                factory.isStatistical(),
                factory.isStochastic(),
                factory.isDeprecated(),
                factory.equidistribution(),
                factory.period());
    }
}
