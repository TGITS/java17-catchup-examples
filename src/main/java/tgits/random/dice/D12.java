package tgits.random.dice;

import javax.inject.Singleton;

@Singleton
public final class D12 extends Dice {

    public D12() {
        super();
    }

    @Override
    public int numberOfPossibleValues() {
        return 12;
    }
}
