package tgits.random;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

@ApplicationScoped
public class AlgorithmService {

    public List<AlgorithmInformation> allAlgorithms() {
        return RandomGeneratorFactory.all().map(AlgorithmInformation::fromRandomGenerator).sorted().toList();
    }

    public String allAlgorithmsAsString() {
        return RandomGeneratorFactory.all().map(factory -> "Algorithm name : %s - group : %s - characteristics : {%s%s%s%s%s%s%s%s stateBits: %d }".formatted(
                factory.name(),
                factory.group(),
                factory.isSplittable() ? " splittable" : "",
                factory.isStreamable() ? " streamable" : "",
                factory.isJumpable() ? " jumpable" : "",
                factory.isArbitrarilyJumpable() ? " arbitrary-jumpable" : "",
                factory.isLeapable() ? " leapable" : "",
                factory.isHardware() ? " hardware" : "",
                factory.isStatistical() ? " statistical" : "",
                factory.isStochastic() ? " stochastic" : "",
                factory.stateBits())).sorted().collect(Collectors.joining("\n"));
    }

    public long countAlgorithms() {
        return RandomGeneratorFactory.all().count();
    }

    public long countAlgorithmsOfType(@NotNull String type) {
        return switch (type.toUpperCase()) {
            case "SPLITTABLE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isSplittable).count();
            case "STREAMABLE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isStreamable).count();
            case "JUMPABLE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isJumpable).count();
            case "ARBITRARY-JUMPABLE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isArbitrarilyJumpable).count();
            case "LEAPABLE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isLeapable).count();
            case "HARDWARE" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isHardware).count();
            case "STATISTICAL" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isStatistical).count();
            case "STOCHASTIC" -> RandomGeneratorFactory.all().filter(RandomGeneratorFactory::isStochastic).count();
            default -> 0;
        };
    }

    public List<String> algorithmTypeNames(){
        return Arrays.stream(AlgorithmType.values()).map(AlgorithmType::typeName).distinct().collect(Collectors.toList());
    }

    public RandomGenerator generatorFromAlgorithmName(String name) {
        return switch (name) {
            case "L128X1024MixRandom", "L128X128MixRandom", "L128X256MixRandom",
                    "L32X64MixRandom", "L64X1024MixRandom", "L64X128MixRandom",
                    "L64X128StarStarRandom", "L64X256MixRandom" -> RandomGenerator.SplittableGenerator.of(name);
            case "Random", "SecureRandom" -> RandomGenerator.of(name);
            case "SplittableRandom" -> RandomGenerator.StreamableGenerator.of(name);
            case "Xoroshiro128PlusPlus", "Xoshiro256PlusPlus" -> RandomGenerator.LeapableGenerator.of(name);
            default -> RandomGenerator.getDefault();
        };
    }

    public boolean isThereAlgorithmWithName(String name) {
        return RandomGeneratorFactory.all().map(RandomGeneratorFactory::name).collect(Collectors.toSet()).contains(name);
    }

}
