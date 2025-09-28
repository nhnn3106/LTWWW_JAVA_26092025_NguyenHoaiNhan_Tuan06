package fit.iuh.se.beans.autowired_disambiguation.primary;

import fit.iuh.se.beans.autowired_disambiguation.primary.MyFormatter;
import org.springframework.stereotype.Component;

@Component("myDateTimeFormatter")
public class MyDataTimeFormatter implements MyFormatter {
    @Override
    public String format() {
        return "Format data time.";
    }
}
