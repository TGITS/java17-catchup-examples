package tgits.record.house;

import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;


@Path("/java17/record/houses")
public class HouseResource {

    private final HouseService houseService;

    public HouseResource(HouseService houseService) {
        this.houseService = houseService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<House> mainHousesOfWesteros() {
        return houseService.mainHousesOfWesteros();
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Response> houseByName(@NotNull @PathParam("name") String name) {
        return houseService.getHouseByName(name)
                .onItem().ifNotNull().transform(fruit -> Response.ok(fruit).
                        build())
                .onItem().ifNull().continueWith(Response.status(Response.Status.NOT_FOUND).
                        build());
    }


}
