package tgits.random.dice;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public abstract sealed class Dice implements RandomDevice<Integer> permits D4, D6, D8, D10, D12, D20, D100 {

    protected final RandomGenerator generator;

    protected Dice() {
        generator = RandomGeneratorFactory
                .all()
                .filter(RandomGeneratorFactory::isStochastic)
                .findFirst()
                .orElseGet(RandomGeneratorFactory::getDefault)
                .create();
    }

    @Override
    public Integer getValue() {
        return generator.nextInt(1, numberOfPossibleValues() + 1);
    }

}
