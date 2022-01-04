package tgits.random.dice;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public final class D6 implements RandomDevice<Integer> {

    private final RandomGenerator generator;

    public D6() {
        generator = RandomGeneratorFactory
                .all()
                .filter(RandomGeneratorFactory::isStochastic)
                .findFirst()
                .orElseGet(RandomGeneratorFactory::getDefault)
                .create();
    }

    @Override
    public Integer getValue() {
        return generator.nextInt(1, 7);
    }

    @Override
    public int numberOfPossibleValues() {
        return 6;
    }
}
