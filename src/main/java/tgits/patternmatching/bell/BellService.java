package tgits.patternmatching.bell;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class BellService {

    public Barbell createBarbell(int weight) {
        return new Barbell(weight);
    }

    public Clubbell createClubbell(int weight) {
        return new Clubbell(weight);
    }

    public Dumbbell createDumbbell(int weight) {
        return new Dumbbell(weight);
    }

    public Kettlebell createKettlebell(int weight) {
        return new Kettlebell(weight);
    }

    public Macebell createMacebell(int weight) {
        return new Macebell(weight);
    }

    //Avec Pattern Matching sur instanceof
    public String doExerciseWithBell(Bell bell) {
        if (bell instanceof Barbell barbell) {
            return barbell.doDeadlift();
        } else if (bell instanceof Clubbell clubbell) {
            return clubbell.doShieldCast();
        } else if (bell instanceof Dumbbell dumbbell) {
            return dumbbell.doCurl();
        } else if (bell instanceof Kettlebell kettlebell) {
            return kettlebell.doSwing();
        } else if (bell instanceof Macebell macebell) {
            return macebell.doShieldCast();
        } else {
            throw new IllegalArgumentException("Pas un type de matériel possible");
        }
    }

    //Sans Pattern Matching avec instanceof
    public String doExerciseWithBellOldSchool(Bell bell) {
        if (bell instanceof Barbell) {
            return ((Barbell) bell).doDeadlift();
        } else if (bell instanceof Clubbell) {
            return ((Clubbell) bell).doShieldCast();
        } else if (bell instanceof Dumbbell) {
            return ((Dumbbell) bell).doCurl();
        } else if (bell instanceof Kettlebell) {
            return ((Kettlebell) bell).doSwing();
        } else if (bell instanceof Macebell) {
            return ((Macebell) bell).doShieldCast();
        } else {
            throw new IllegalArgumentException("Pas un type de matériel possible");
        }
    }
}
