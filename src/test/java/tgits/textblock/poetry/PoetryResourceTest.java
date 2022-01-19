package tgits.textblock.poetry;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.startsWith;

@QuarkusTest
public class PoetryResourceTest {

    @Test
    void testIfEndpoint() {

        given()
                .when().get("/java17/textblock/poetry/if")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(ContentType.TEXT)
                .body(
                        startsWith("If..."),
                        endsWith("Rudyard Kipling\n")
                );
    }
}
