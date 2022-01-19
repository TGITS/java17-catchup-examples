package tgits.patternmatching.bell;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class BellServiceTest {

    private final BellService bellService;

    public BellServiceTest(final BellService bellService) {
        this.bellService = bellService;
    }

    @Test
    void shouldOutputStringForBarbellExercise() {
        Bell bell = bellService.createBarbell(80);
        String expected = "Deadlifting this barbell of 80 kg";
        assertEquals(expected, bellService.doExerciseWithBell(bell));
    }

    @Test
    void shouldOutputStringForClubbellExercise() {
        Bell bell = bellService.createClubbell(10);
        String expected = "Doing shield cast with this clubbell of 10 kg";
        assertEquals(expected, bellService.doExerciseWithBell(bell));
    }

    @Test
    void shouldOutputStringForDumbbellExercise() {
        Bell bell = bellService.createDumbbell(12);
        String expected = "Doing curl with this dumbbell of 12 kg";
        assertEquals(expected, bellService.doExerciseWithBell(bell));
    }

    @Test
    void shouldOutputStringForKettlebellExercise() {
        Bell bell = bellService.createKettlebell(24);
        String expected = "Swinging this kettlebell of 24 kg";
        assertEquals(expected, bellService.doExerciseWithBell(bell));
    }

    @Test
    void shouldOutputStringForMacebellExercise() {
        Bell bell = bellService.createMacebell(5);
        String expected = "Doing shield cast with this macebell of 5 kg";
        assertEquals(expected, bellService.doExerciseWithBell(bell));
    }
}
