package tgits.patternmatching.bell;

public final class Kettlebell implements Bell {

    int weight;

    public Kettlebell(int weight) {
        this.weight = weight;
    }

    public String doSwing() {
        return "Swinging this kettlebell of " + this.weight + " kg";
    }

    public int getWeight() {
        return this.weight;
    }
}
