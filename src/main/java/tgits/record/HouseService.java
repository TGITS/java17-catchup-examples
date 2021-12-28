package tgits.record;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class HouseService {

    private final static Map<String, House> MAIN_HOUSES_OF_WESTEROS = Map.of("Stark", new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming")
            , "Lannister", new House("Lannister", "Casterly Rock", "A Golden Lion", "Hear me roar !")
            , "Baratheon",new House("Baratheon", "King's Landing", "A Crowned Black Stag", "Our is the fury !")
            , "Greyjoy",new House("Greyjoy", "Pyke", "A Golden Kraken", "We do not sow")
            , "Arryn", new House("Arryn of the Eyrie", "The Eyrie", "Moon and Falcon", "As high as Honor")
            , "Targaryen",new House("Targaryen", "Dragonstone", "Three-Headed Dragon", "Fire and Blood")
            , "Tully",new House("Tully", "Riverun", "A leaping silver trout on a field of blue and mud red", "Family, Duty, Honor")
            , "Tyrell",new House("Tyrell", "Highgarden", "A golden rose, on a green field", "Growing Strong")
            , "Martell",new House("Martell", "Old Palace within Sunspear", "A gold spear piercing a red sun on an orange field", "Unbowed, Unbent, Unbroken"));

    public List<House> mainHousesOfWesteros() {
        return MAIN_HOUSES_OF_WESTEROS.values().stream().toList();
    }
}
