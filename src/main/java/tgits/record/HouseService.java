package tgits.record;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class HouseService {

    public List<House> mainHouseOfWesteros() {
        return List.of(
                new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming")
                , new House("Lannister", "Casterly Rock", "A Golden Lion", "Hear me roar !")
                , new House("Baratheon", "King's Landing", "A Crowned Black Stag", "Our is the fury !")
                , new House("Greyjoy", "Pyke", "A Golden Kraken", "We do not sow")
                , new House("Arryn of the Eyrie", "The Eyrie", "Moon and Falcon", "As high as Honor")
                , new House("Targaryen", "Dragonstone", "Three-Headed Dragon", "Fire and Blood")
                , new House("Tully", "Riverun", "A leaping silver trout on a field of blue and mud red", "Family, Duty, Honor")
                , new House("Tyrell", "Highgarden", "A golden rose, on a green field", "Growing Strong")
                , new House("Martell", "Old Palace within Sunspear", "A gold spear piercing a red sun on an orange field", "Unbowed, Unbent, Unbroken")
        );
    }
}
