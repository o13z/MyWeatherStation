package WeatherUndeground;

import WeatherUndeground.ResponseClasses.WeatherResponse;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;

public class GetWeather {

    private final String baseURL = "http://api.wunderground.com/api/3d7a4bb220d83404/conditions/RU/q/";
    private final String DEGREE  = "\u00b0";

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

        Gson gson = new Gson();
        WeatherResponse responseClass = gson.fromJson(output, WeatherResponse.class);

        System.out.println(responseClass.getCurrent_observation().getDisplay_location().getFull());
        System.out.println(responseClass.getCurrent_observation().getTemp_c()+ DEGREE + " / " + responseClass.getCurrent_observation().getFeelslike_c() + DEGREE);
        System.out.println(responseClass.getCurrent_observation().getObservation_time());
        System.out.println("Humidity: " + responseClass.getCurrent_observation().getRelative_humidity());
        System.out.println("Wind kph: " + responseClass.getCurrent_observation().getWind_kph());
        System.out.println(responseClass.getCurrent_observation().getWeather());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(output);
    }
}
