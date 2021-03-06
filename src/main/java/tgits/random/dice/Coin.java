package tgits.random.dice;

import javax.inject.Singleton;
import java.util.random.RandomGenerator;

@Singleton
public final class Coin implements RandomDevice<Boolean> {

    private final RandomGenerator generator;

    public Coin() {
        generator = RandomGenerator.getDefault();
    }

    @Override
    public Boolean getValue() {
        return generator.nextBoolean();
    }

    @Override
    public int numberOfPossibleValues() {
        return 2;
    }
}
