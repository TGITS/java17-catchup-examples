package baptiste.test;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomTest {

    public static void main(String[] args){

        RandomGeneratorFactory.all().forEach(randomGeneratorFactory -> System.out.println(randomGeneratorFactory.name()));

        var randomGenerator1= RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();
        var randomGenerator2 = RandomGenerator.of("Xoshiro256PlusPlus");
        var randomGeneratorDefault = RandomGenerator.getDefault();

        randomGeneratorDefault.ints(10).forEach(System.out::println);
        randomGeneratorDefault.nextInt();
    }
}
