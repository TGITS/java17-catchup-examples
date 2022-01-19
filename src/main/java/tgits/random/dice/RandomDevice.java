package tgits.random.dice;

public sealed interface RandomDevice<T> permits Coin, Dice {
    T getValue();
    int numberOfPossibleValues();
}
