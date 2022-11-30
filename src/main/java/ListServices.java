import io.restassured.response.Response;
import java.util.Map;

public class ListServices extends BaseServices {

    public Response createList(String path, String nameVal, String idBoard) {
        Map<String, String> queryParams = Map.of("name", nameVal, "idBoard", idBoard);
        return postService(path, queryParams);
    }
}
