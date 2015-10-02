package ts;

import java.util.ArrayList;
import java.util.List;

public class TimeSeries {

    private List<TimeSeriesItem> items;
    private String name;

    public TimeSeries(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public List<TimeSeriesItem> getItems() {
        return items;
    }

    public void setItems(List<TimeSeriesItem> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimeSeriesItem getLastItem() {
        return items.get(items.size() - 1);
    }
    
    public TimeSeriesItem getFirstItem() {
        return items.get(0);
    }
}
