package user;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeEach;

import java.util.Map;

import static io.restassured.RestAssured.baseURI;

public class Hooks {

    public Response response;
    public Map<Object, Object> responseMap;
    public static int pet_id;
    public static int storeId;

    @BeforeEach
    public void createSetup() {
        baseURI = "https://petstore.swagger.io/v2";

    }
}
