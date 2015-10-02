package ts;

import java.util.Date;

public class TimeSeriesItem {

    private double value;
    private Date time;

    public TimeSeriesItem(double value, Date time) {
        this.value = value;
        this.time = time;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
