package tgits.random.dice;

import javax.ws.rs.Path;

@Path("/java17/random/dice")
public class DiceResource {

    private DiceService diceService;

    public DiceResource(DiceService diceService){
        this.diceService = diceService;
    }
}
