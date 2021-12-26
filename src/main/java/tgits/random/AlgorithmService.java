package tgits.random;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class AlgorithmService {

    public String allAlgorithmsAsString() {
        return RandomGeneratorFactory.all().map(fac -> "Algorithm name : %s - group : %s - characteristics : {%s%s%s%s%s%s%s%s stateBits: %d }".formatted(
                fac.name(),
                fac.group(),
                fac.isSplittable() ? " splitable" : "",
                fac.isStreamable() ? " streamable" : "",
                fac.isJumpable() ? " jumpable" : "",
                fac.isArbitrarilyJumpable() ? " arbitrary-jumpable" : "",
                fac.isLeapable() ? " leapable" : "",
                fac.isHardware() ? " hardware" : "",
                fac.isStatistical() ? " statistical" : "",
                fac.isStochastic() ? " stochastic" : "",
                fac.stateBits())).sorted().collect(Collectors.joining("\n"));
    }
}
