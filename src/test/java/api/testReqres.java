package api;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import java.util.List;

import static io.restassured.RestAssured.given;

public class testReqres {
    private static final String URL = "https://reqres.in";
    @Test
    public void checkAvatarAndIdTest() {
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "/api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.forEach(x->Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
    }
}