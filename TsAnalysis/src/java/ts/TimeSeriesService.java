package ts;

import java.util.Calendar;
import java.util.Date;

public class TimeSeriesService {

    public static Date generateNextDate(TimeSeries forecast) {
        return Calendar.getInstance().getTime();
    }
    
}
