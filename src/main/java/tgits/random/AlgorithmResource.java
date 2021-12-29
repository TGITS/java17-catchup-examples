package tgits.random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

@Path("/java17/random/algorithm")
public class AlgorithmResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
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
}