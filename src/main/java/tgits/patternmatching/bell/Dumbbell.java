package tgits.patternmatching.bell;

public final class Dumbbell implements Bell {

    int weight;

    public Dumbbell(int weight) {
        this.weight = weight;
    }

    public String doCurl() {
        return "Doing curl with this dumbbell of " + this.weight + " kg";
    }

    public int getWeight() {
        return this.weight;
    }
}
