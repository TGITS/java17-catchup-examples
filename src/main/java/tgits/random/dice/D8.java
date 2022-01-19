package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D8 extends Dice {

    public D8() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 8;
    }
}
