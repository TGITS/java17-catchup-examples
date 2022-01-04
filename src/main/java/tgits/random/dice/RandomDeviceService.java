package tgits.random.dice;

import io.smallrye.common.constraint.NotNull;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RandomDeviceService {

    private static final String COIN = "COIN";
    private static final String D4 = "D4";
    private static final String D6 = "D6";
    private static final String D8 = "D8";
    private static final String D10 = "D10";
    private static final String D12 = "D12";
    private static final String D20 = "D20";
    private static final String D100 = "D100";

    private final Coin coin;
    private final D4 d4;
    private final D6 d6;
    private final D8 d8;
    private final D10 d10;
    private final D12 d12;
    private final D20 d20;
    private final D100 d100;

    RandomDeviceService(Coin coin, D4 d4, D6 d6, D8 d8, D10 d10, D12 d12, D20 d20, D100 d100) {
        this.coin = coin;
        this.d4 = d4;
        this.d6 = d6;
        this.d8 = d8;
        this.d10 = d10;
        this.d12 = d12;
        this.d20 = d20;
        this.d100 = d100;
    }

    public int rollDice(@NotNull final String diceType) {
        return switch(diceType.toUpperCase()) {
            case D4 -> d4.getValue();
            case D6 -> d6.getValue();
            case D8 -> d8.getValue();
            case D10 -> d10.getValue();
            case D12 -> d12.getValue();
            case D20 -> d20.getValue();
            case D100 -> d100.getValue();
            default -> d6.getValue();
        };
    }

    public boolean flipCoin() {
        return coin.getValue();
    }

}
