package tgits.record;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class HouseServiceTest {

    private final HouseService houseService;

    public HouseServiceTest(HouseService houseService){
        this.houseService = houseService;
    }

    @Test
    public void verifyListOfHousesGenerated(){
        List<House> houses = houseService.mainHousesOfWesteros();
        assertEquals(9, houses.size());
        assertEquals(new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming"), (houses.get(0)));
    }
}
