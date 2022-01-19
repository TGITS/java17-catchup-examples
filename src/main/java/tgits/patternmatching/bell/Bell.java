package tgits.patternmatching.bell;

public sealed interface Bell permits Barbell, Clubbell, Dumbbell, Kettlebell, Macebell {
    int getWeight();
}
