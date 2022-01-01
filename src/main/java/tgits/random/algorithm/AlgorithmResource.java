package tgits.random.algorithm;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/java17/random/algorithms")
public class AlgorithmResource {

    private final AlgorithmService algorithmService;

    public AlgorithmResource(AlgorithmService algorithmService) {
        this.algorithmService = algorithmService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String allAlgorithmsAsString() {
        return algorithmService.allAlgorithmsAsString();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<AlgorithmInformation> allAlgorithms() {
        return algorithmService.allAlgorithms();
    }

    @GET
    @Path("/count")
    @Produces(MediaType.TEXT_PLAIN)
    public long countAlgorithms() {
        return algorithmService.countAlgorithms();
    }

    @GET
    @Path("/count/{type}")
    @Produces(MediaType.TEXT_PLAIN)
    public long countAlgorithmsOfType(@NotNull @PathParam("type") String type) {
        return algorithmService.countAlgorithmsOfType(type);
    }
}