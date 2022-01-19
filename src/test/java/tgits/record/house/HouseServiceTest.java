package tgits.record.house;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import tgits.record.house.House;
import tgits.record.house.HouseService;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@QuarkusTest
public class HouseServiceTest {

    private final HouseService houseService;

    public HouseServiceTest(final HouseService houseService) {
        this.houseService = houseService;
    }

    @Test
    public void verifyListOfHousesGenerated() {
        Collection<House> houses = houseService.mainHousesOfWesteros();
        assertEquals(9, houses.size());
        assertTrue(houses.contains(new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming")));
    }
}
