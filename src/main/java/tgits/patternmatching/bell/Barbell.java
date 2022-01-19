package tgits.patternmatching.bell;

public final class Barbell implements Bell {

    int weight;

    public Barbell(int weight) {
        this.weight = weight;
    }

    public String doDeadlift() {
        return "Deadlifting this barbell of " + this.weight + " kg";
    }

    public int getWeight() {
        return this.weight;
    }
}
