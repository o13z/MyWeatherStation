package WeatherUndeground.ResponseClasses;

public class Response {
    private Error error;

    private Features features;

    private String termsofService;

    private String version;

    public Error getError ()
    {
        return error;
    }

    public void setError (Error error)
    {
        this.error = error;
    }

    public Features getFeatures ()
    {
        return features;
    }

    public void setFeatures (Features features)
    {
        this.features = features;
    }

    public String getTermsofService ()
    {
        return termsofService;
    }

    public void setTermsofService (String termsofService)
    {
        this.termsofService = termsofService;
    }

    public String getVersion ()
    {
        return version;
    }

    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [error = "+error+", features = "+features+", termsofService = "+termsofService+", version = "+version+"]";
    }
}
