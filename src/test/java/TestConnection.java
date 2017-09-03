import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.junit.Test;
import com.sun.jersey.api.client.Client;

import javax.ws.rs.core.MediaType;

public class TestConnection {
    @Test
    public void testConnection() {
        String aiportURL = "http://api.wunderground.com/api/3d7a4bb220d83404/conditions/RU/q/LUKK.json";
        String ciorescuURL = "http://api.wunderground.com/api/3d7a4bb220d83404/conditions/RU/q/ciorescu.json";
        String autoipURL = "http://api.wunderground.com/api/3d7a4bb220d83404/conditions/RU/q/autoip.json";
        Client client = new Client();
        WebResource res = client.resource(aiportURL);

        ClientResponse clientResponse = res.accept(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);

        if (clientResponse.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + clientResponse.getStatus());
        }

        String output = clientResponse.getEntity(String.class);

        System.out.println(output);

    }
}
