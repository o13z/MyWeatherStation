package WeatherUndeground;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;

public class GetWeather {

    private String baseURL = "http://api.wunderground.com/api/3d7a4bb220d83404/conditions/RU/q/";

    public void getCurrentWeather(String location) {
        String URL = baseURL + location;

        Client client = new Client();
        WebResource res = client.resource(URL);

        ClientResponse clientResponse = res.accept(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);

        if (clientResponse.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + clientResponse.getStatus());
        }

        String output = clientResponse.getEntity(String.class);

        System.out.println(output);
    }
}
