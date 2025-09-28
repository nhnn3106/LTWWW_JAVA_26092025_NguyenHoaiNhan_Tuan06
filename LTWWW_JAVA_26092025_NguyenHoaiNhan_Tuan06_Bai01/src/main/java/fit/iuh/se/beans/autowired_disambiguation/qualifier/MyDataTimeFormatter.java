package fit.iuh.se.beans.autowired_disambiguation.qualifier;

import org.springframework.stereotype.Component;

@Component("myDateTimeFormatter")
public class MyDataTimeFormatter implements MyFormatter {
    @Override
    public String format() {
        return "Format data time.";
    }
}
