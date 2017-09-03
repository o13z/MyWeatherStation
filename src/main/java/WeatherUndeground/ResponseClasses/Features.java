package WeatherUndeground.ResponseClasses;

public class Features {
    private String conditions;

    public String getConditions ()
    {
        return conditions;
    }

    public void setConditions (String conditions)
    {
        this.conditions = conditions;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [conditions = "+conditions+"]";
    }
}
