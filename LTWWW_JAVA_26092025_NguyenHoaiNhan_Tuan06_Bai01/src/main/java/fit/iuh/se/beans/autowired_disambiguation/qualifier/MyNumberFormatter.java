package fit.iuh.se.beans.autowired_disambiguation.qualifier;

import org.springframework.stereotype.Component;

@Component("myNumberFormatter")
public class MyNumberFormatter implements MyFormatter {
    @Override
    public String format() {
        return "Format number.";
    }
}
