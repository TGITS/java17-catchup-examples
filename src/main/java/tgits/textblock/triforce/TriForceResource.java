package tgits.textblock.triforce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/java17/textblock/triforce")
public class TriForceResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String triForce() {
        return """
                  ***** *****
                   ***   ***
                    *     *
                     *****
                      ***
                       *""";
    }
}
