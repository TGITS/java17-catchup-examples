package tgits.record.tuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    public void testingACoupleOfPairs() {
        Pair<String, String> couple1 = new Pair<>("Jon", "Ygritte");
        Pair<String, String> couple2 = new Pair<>("Cersei", "Jaimee");
        assertEquals("Jon", couple1.first());
        assertEquals("Jaimee", couple2.second());
    }

    @Test
    public void testingACoupleOfPairs2() {
        Pair<String, String> couple1 = Pair.of("Jon", "Ygritte");
        Pair<String, String> couple2 = Pair.of("Cersei", "Jaimee");
        assertEquals("Ygritte", couple1.second());
        assertEquals("Cersei", couple2.first());
    }
}
