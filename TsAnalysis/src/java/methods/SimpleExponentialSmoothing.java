package methods;

import ts.TimeSeriesService;
import ts.TimeSeriesItem;

public class SimpleExponentialSmoothing extends ExponentialSmoothing {

    private float alpha;

    @Override
    public void init() {
        super.init();
        model.getItems().add(original.getFirstItem());
    }

    @Override
    protected void createModel() {
        double e;
        for (TimeSeriesItem item : original.getItems()) {
            e = item.getValue() - model.getLastItem().getValue();
            model.getItems().add(new TimeSeriesItem(model.getLastItem().getValue() + alpha * e, item.getTime()));
        }
    }

    @Override
    protected void createForecast(int length) {
        forecast.getItems().add(original.getLastItem());
        for (int i = 0; i < length; i++) {
            forecast.getItems().add(new TimeSeriesItem(original.getLastItem().getValue(), TimeSeriesService.generateNextDate(forecast)));
        }
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

}
