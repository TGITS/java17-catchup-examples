package tgits.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class AlgorithmService {

	public String allAlgorithmsAsString() {
		return RandomGeneratorFactory.all().map(fac -> "Algorithm name : %s - group : %s - characteristics : {%s%s%s%s%s%s%s%s stateBits: %d }".formatted(
				fac.name(),
				fac.group(),
				fac.isSplittable() ? " splittable" : "",
				fac.isStreamable() ? " streamable" : "",
				fac.isJumpable() ? " jumpable" : "",
				fac.isArbitrarilyJumpable() ? " arbitrary-jumpable" : "",
				fac.isLeapable() ? " leapable" : "",
				fac.isHardware() ? " hardware" : "",
				fac.isStatistical() ? " statistical" : "",
				fac.isStochastic() ? " stochastic" : "",
				fac.stateBits())).sorted().collect(Collectors.joining("\n"));
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
}
