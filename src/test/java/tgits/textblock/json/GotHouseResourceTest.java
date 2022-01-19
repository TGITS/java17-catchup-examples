package tgits.textblock.json;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
public class GotHouseResourceTest {

    @Test
    void testStarkEndpoint() {

        given()
                .when().get("/java17/textblock/json/stark")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(ContentType.JSON)
                .body("name", is("Stark"),
                        "main_seat", is("Winterfell"),
                        "ancestral_seat", is("Winterfell"),
                        "sigil", is("A Gray Direwolf"),
                        "family_words", is("Winter is coming"));
    }
}
