package tgits.record;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import io.restassured.http.ContentType;
import io.smallrye.mutiny.Uni;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.ws.rs.core.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

@QuarkusTest
class HouseResourceTest {

    @InjectMock
    private HouseService houseService;

    @Test
    void testHouseByNameEndpoint() {
        Mockito.when(houseService.getHouseByName("Stark")).
                thenReturn(Uni.createFrom().item(new House("Stark", "Winterfell", "A Gray Direwolf", "Winter is coming")));

        given()
                .pathParam("name", "Stark")
                .when().get("/java17/record/houses/{name}")
                .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .contentType(ContentType.JSON)
                .body(
                        "name", is("Stark"),
                        "seat", is("Winterfell")
                );

        Mockito.verify(houseService).getHouseByName("Stark");
        Mockito.verifyNoMoreInteractions(houseService);
    }
}
