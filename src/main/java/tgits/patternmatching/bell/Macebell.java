package tgits.patternmatching.bell;

public final class Macebell implements Bell {

    int weight;

    public Macebell(int weight) {
        this.weight = weight;
    }

    public String doShieldCast() {
        return "Doing shield cast with this macebell of " + this.weight + " kg";
    }

    public int getWeight() {
        return this.weight;
    }
}
