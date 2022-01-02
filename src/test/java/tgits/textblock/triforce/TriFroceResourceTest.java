package tgits.textblock.triforce;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

@QuarkusTest
public class TriFroceResourceTest {

    @Test
    void testTriForceEndpoint() {

        given()
                .when().get("/java17/textblock/triforce")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(ContentType.TEXT)
                .body(
                        startsWith("***** *****"),
                        endsWith("     *")
                );
    }
}
