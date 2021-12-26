package tgits.record;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    public void testingACoupleOfPair() {
        Pair<String, String> couple1 = new Pair<>("Jon","Ygritte");
        Pair<String, String> couple2 = new Pair<>("Cersei","Jaimee");
        assertEquals("Jon", couple1.first());
        assertEquals("Jaimee", couple2.second());
    }
}
