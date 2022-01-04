package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D100 extends Dice {

    public D100() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 100;
    }
}
