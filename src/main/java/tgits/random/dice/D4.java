package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D4 extends Dice {

    public D4() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 4;
    }
}
