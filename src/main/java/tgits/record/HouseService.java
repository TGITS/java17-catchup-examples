package tgits.record;

import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@ApplicationScoped
public class HouseService {

    private final ConcurrentMap<String, House> mainHousesOfWesteros = new ConcurrentHashMap<>();

    public HouseService() {
        mainHousesOfWesteros.put("Stark", new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming"));
        mainHousesOfWesteros.put("Lannister", new House("Lannister", "Casterly Rock", "A Golden Lion", "Hear me roar !"));
        mainHousesOfWesteros.put("Baratheon", new House("Baratheon", "King's Landing", "A Crowned Black Stag", "Our is the fury !"));
        mainHousesOfWesteros.put("Greyjoy", new House("Greyjoy", "Pyke", "A Golden Kraken", "We do not sow"));
        mainHousesOfWesteros.put("Arryn", new House("Arryn of the Eyrie", "The Eyrie", "Moon and Falcon", "As high as Honor"));
        mainHousesOfWesteros.put("Targaryen", new House("Targaryen", "Dragonstone", "Three-Headed Dragon", "Fire and Blood"));
        mainHousesOfWesteros.put("Tully", new House("Tully", "Riverun", "A leaping silver trout on a field of blue and mud red", "Family, Duty, Honor"));
        mainHousesOfWesteros.put("Tyrell", new House("Tyrell", "Highgarden", "A golden rose, on a green field", "Growing Strong"));
        mainHousesOfWesteros.put("Martell", new House("Martell", "Old Palace within Sunspear", "A gold spear piercing a red sun on an orange field", "Unbowed, Unbent, Unbroken"));
    }

    public Collection<House> mainHousesOfWesteros() {
        return mainHousesOfWesteros.values();
    }

    public Uni<House> getHouseByName(String name) {
        return Uni.createFrom().item(mainHousesOfWesteros.get(name));
    }
}
