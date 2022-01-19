package tgits.random.dice;

import io.smallrye.mutiny.Multi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.random.RandomGenerator;

@Path("/java17/random")
public class RandomDeviceResource {

    private RandomDeviceService randomDeviceService;

    public RandomDeviceResource(RandomDeviceService randomDeviceService){
        this.randomDeviceService = randomDeviceService;
    }

    @GET
    @Path("/flip/coin")
    public boolean flipCoin() {
        return this.randomDeviceService.flipCoin();
    }

    @GET
    @Path("/roll/{dice_type}")
    public int rollDice(@PathParam("dice_type") String diceType) {
        return this.randomDeviceService.rollDice(diceType);
    }

    @GET
    @Path("/stream/double/{number}")
    public Multi<Double> streamOfRandomDoubles(@PathParam("number") int number) {
        return Multi.createFrom().items(() -> RandomGenerator.getDefault().doubles(number).boxed());
    }

    @GET
    @Path("/stream/integer/{number}")
    public Multi<Integer> streamOfRandomIntegers(@PathParam("number") int number) {
        return Multi.createFrom().items(() -> RandomGenerator.getDefault().ints(number).boxed());
    }
}
