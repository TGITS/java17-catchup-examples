package tgits.patternmatching.bell;

public final class Clubbell implements Bell {

    int weight;

    public Clubbell(int weight) {
        this.weight = weight;
    }

    public String doShieldCast() {
        return "Doing shield cast with this clubbell of " + this.weight + " kg";
    }

    public int getWeight() {
        return this.weight;
    }
}
