package tgits.record;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/java17/record")
public class HouseResource {

    private final HouseService houseService;

    public HouseResource(HouseService houseService){
        this.houseService = houseService;
    }

    @GET
    @Path("/house")
    @Produces(MediaType.APPLICATION_JSON)
    public List<House> mainHousesOfWesteros() {
        return houseService.mainHousesOfWesteros();
    }
}
