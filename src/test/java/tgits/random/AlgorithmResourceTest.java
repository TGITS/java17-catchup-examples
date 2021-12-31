package tgits.random;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class AlgorithmResourceTest {

    @Test
    void algorithmsAsStringEndpoint() {
        String expectedString = """
                Algorithm name : L128X1024MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 1152 }
                Algorithm name : L128X128MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 256 }
                Algorithm name : L128X256MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 384 }
                Algorithm name : L32X64MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 96 }
                Algorithm name : L64X1024MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 1088 }
                Algorithm name : L64X128MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 192 }
                Algorithm name : L64X128StarStarRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 192 }
                Algorithm name : L64X256MixRandom - group : LXM - characteristics : { splittable streamable statistical stateBits: 320 }
                Algorithm name : Random - group : Legacy - characteristics : { statistical stateBits: 48 }
                Algorithm name : SecureRandom - group : Legacy - characteristics : { stochastic stateBits: 2147483647 }
                Algorithm name : SplittableRandom - group : Legacy - characteristics : { splittable streamable statistical stateBits: 64 }
                Algorithm name : Xoroshiro128PlusPlus - group : Xoroshiro - characteristics : { streamable jumpable leapable statistical stateBits: 128 }
                Algorithm name : Xoshiro256PlusPlus - group : Xoshiro - characteristics : { streamable jumpable leapable statistical stateBits: 256 }""";
        given()
                .when().get("/java17/random/algorithms")
                .then()
                .statusCode(200)
                .body(is(expectedString));
    }

}