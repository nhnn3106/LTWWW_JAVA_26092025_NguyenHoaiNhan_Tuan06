package fit.iuh.se.beans.autowired_disambiguation.primary;

import fit.iuh.se.beans.autowired_disambiguation.primary.MyFormatter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("myNumberFormatter")
@Primary
public class MyNumberFormatter implements MyFormatter {
    @Override
    public String format() {
        return "Format number.";
    }
}
