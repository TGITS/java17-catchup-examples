package baptiste.test;

/*
 * Pour exécuter ce code depuis une invite de commande : javac RandomGenerationExample.java
 * Puis : java RandomGeneration.java
 */

import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGenerationExample {

    public static void main(String[] args) {

        System.out.println("Création de la liste des noms d'algorithme de génération de nombres aléatoires disponibles en java 17");
        List<String> algorithmNames = RandomGeneratorFactory.all().map(RandomGeneratorFactory::name).toList();
        System.out.println("La liste contient les noms suivants : " + String.join(", ", algorithmNames));

        System.out.println("Sélectionnons un nom au hasard dans la liste avec le générateur par défaut");
        var randomGeneratorDefault = RandomGenerator.getDefault();
        var algorithmName = algorithmNames.get(randomGeneratorDefault.nextInt(0, algorithmNames.size()));
        System.out.println("L'algorithme choisi aléatoirement est : " + algorithmName);

        System.out.println("Créons un  générateur à partir de ce nom ");
        var generator = createRandomGeneratorFromName(algorithmName);

        System.out.println("Utilisons  ce générateur pour générer des valeurs :");
        System.out.println("Génération d'une valeur aléatoire booléenne : " + generator.nextBoolean());
        System.out.println("Génération d'une valeur aléatoire entière de type 'int' : " + generator.nextInt());
        System.out.println("Génération d'une valeur aléatoire entière de type 'long' : " + generator.nextLong());
        System.out.println("Génération d'une valeur aléatoire réelle de type 'double' : " + generator.nextDouble());
        System.out.println("Génération d'une flux de 5 valeurs entières : ");
        generator.ints(5).forEach(System.out::println);
        System.out.println("Génération d'une flux de 5 valeurs réelles : ");
        generator.doubles(5).forEach(System.out::println);
    }

    private static RandomGenerator createRandomGeneratorFromName(String name) {
        return switch (name) {
            case "L128X1024MixRandom", "L128X128MixRandom", "L128X256MixRandom", "L32X64MixRandom", "L64X1024MixRandom",
                    "L64X128MixRandom", "L64X128StarStarRandom", "L64X256MixRandom" -> {
                System.out.println("Creating a splittable Random Generator");
                yield RandomGenerator.SplittableGenerator.of(name);
            }
            case "Random", "SecureRandom" -> {
                System.out.println("Creating a old school Random Generator");
                yield RandomGenerator.of(name);
            }
            case "SplittableRandom" -> {
                System.out.println("Creating a Streamable Random Generator (yep it is also Splittable!)");
                yield RandomGenerator.StreamableGenerator.of(name);
            }
            case "Xoroshiro128PlusPlus", "Xoshiro256PlusPlus" -> {
                System.out.println("Creating a Leapable Random Generator");
                yield RandomGenerator.LeapableGenerator.of(name);
            }
            default -> RandomGenerator.getDefault();
        };
    }
}
