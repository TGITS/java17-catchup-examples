package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D10 extends Dice {

    public D10() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 10;
    }
}
