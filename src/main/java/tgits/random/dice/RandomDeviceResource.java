package tgits.random.dice;

import javax.ws.rs.Path;

@Path("/java17/random")
public class RandomDeviceResource {

    private RandomDeviceService randomDeviceService;

    public RandomDeviceResource(RandomDeviceService randomDeviceService){
        this.randomDeviceService = randomDeviceService;
    }
}
