import io.restassured.response.Response;
import java.util.Map;

public class BoardServices extends BaseServices {

    public Response createBoard(String path, String nameVal) {
        Map<String, String> queryParams = Map.of("name", nameVal);
        return postService(path, queryParams);
    }

    public Response deleteBoard(String path, String boardId) {
        return deleteService(path + boardId + "/");
    }

    public Response getABoard(String path, String boardId) {
        return getService(path + boardId + "/");
    }
}
