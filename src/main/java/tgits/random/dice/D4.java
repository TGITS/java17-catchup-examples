package tgits.random.dice;

import java.util.random.RandomGenerator;

public final class D4 implements RandomDevice<Integer> {

    private final RandomGenerator generator;

    public D4() {
        generator = RandomGenerator.of("RandomSecure");
    }

    @Override
    public Integer getValue() {
        return generator.nextInt(1, 5);
    }

    @Override
    public int numberOfPossibleValues() {
        return 4;
    }
}
