package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D6 extends Dice {

    public D6() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 6;
    }
}
