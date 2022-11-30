import io.restassured.response.Response;
import java.util.Map;

public class CardServices extends BaseServices {

    public Response createCard(String path, String nameVal, String idList) {
        Map<String, String> queryParams = Map.of("name", nameVal, "idList", idList);
        return postService(path, queryParams);
    }

    public Response updateCard(String path, String cardId, String nameVal) {
        Map<String, String> queryParams = Map.of("name", nameVal);
        return putService(path + cardId + "/", queryParams);
    }

    public Response deleteCard(String path, String cardId) {
        return deleteService(path + cardId + "/");
    }

    public Response getACard(String path, String cardId) {
        return getService(path + cardId + "/");
    }
}
