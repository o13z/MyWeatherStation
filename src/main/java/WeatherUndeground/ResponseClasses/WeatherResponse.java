package WeatherUndeground.ResponseClasses;

public class WeatherResponse {
    private Response response;

    private CurrentObservation current_observation;

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    public CurrentObservation getCurrent_observation ()
    {
        return current_observation;
    }

    public void setCurrent_observation (CurrentObservation current_observation)
    {
        this.current_observation = current_observation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [response = "+response+", current_observation = "+current_observation+"]";
    }
}
