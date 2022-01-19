package tgits.textblock.json;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/java17/textblock/json")
public class GotHouseResource {

    @GET
    @Path("/stark")
    @Produces(MediaType.APPLICATION_JSON)
    public String houseStark(){
        return """
               {
                 "name": "Stark",
                 "main_seat": "Winterfell",
                 "ancestral_seat": "Winterfell",
                 "sigil": "A Gray Direwolf",
                 "family_words": "Winter is coming"
               }""";
    }

}
