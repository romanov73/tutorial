package methods;

import ts.TimeSeries;

public abstract class ExponentialSmoothing {

    protected TimeSeries original;
    TimeSeries model;
    protected TimeSeries forecast;

    protected void init() {
        model = new TimeSeries("model of time series");
        forecast = new TimeSeries("mforecast of time series");
    }

    public TimeSeries getOriginal() {
        return original;
    }

    public void setOriginal(TimeSeries original) {
        this.original = original;
    }

    protected void createModel() {
        init();
    }

    protected void createForecast(int length) {
        init();
    }

    public TimeSeries getModel() {
        createModel();
        return model;
    }

    public TimeSeries getForecast(int length) {
        createModel();
        createForecast(length);
        return forecast;
    }
}
