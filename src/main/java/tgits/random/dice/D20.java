package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D20 extends Dice {

    public D20() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 20;
    }
}
