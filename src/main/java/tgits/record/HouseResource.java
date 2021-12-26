package tgits.record;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;


@Path("/java17/record")
public class HouseResource {

    private final HouseService houseService;

    public HouseResource(HouseService houseService){
        this.houseService = houseService;
    }

    @GET
    @Path("/house")
    @Produces(MediaType.APPLICATION_JSON)
    public List<House> mainHouseOfWesteros() {
        return houseService.mainHouseOfWesteros();
    }
}
