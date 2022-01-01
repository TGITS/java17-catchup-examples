package tgits.record.house;

import org.junit.jupiter.api.Test;
import tgits.record.house.House;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseTest {

    @Test
    void aRecordAsDefaultAccessorMethods() {
        House house = new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming");
        assertEquals("Stark", house.name());
        assertEquals("Winterfell", house.seat());
        assertEquals("A Gray Direwolf", house.sigil());
        assertEquals("Winter is coming", house.familyWords());
    }

    @Test
    void aRecordHasADefaultToStringMethod() {
        String expectedToStringResult = "House[name=Stark, seat=Winterfell, sigil=A Gray Direwolf, familyWords=Winter is coming]";
        House house = new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming");
        assertEquals(expectedToStringResult, house.toString());
    }

    @Test
    void twoIdenticalRecordsShouldBeEqualAndHaveTheSameHAsh() {
        House house1 = new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming");
        House house2 = new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming");
        assertEquals(house1,house2);
        assertEquals(house1.hashCode(),house2.hashCode());
    }

}
