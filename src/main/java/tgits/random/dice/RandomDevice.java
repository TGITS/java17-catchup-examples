package tgits.random.dice;

public sealed interface RandomDevice<T> permits Coin, D4, D6 {
    T getValue();
    int numberOfPossibleValues();
}
