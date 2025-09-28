package fit.iuh.se.beans.autowired_disambiguation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyFormatService {
    private final MyFormatter formatter;

    public MyFormatService(@Qualifier("myNumberFormatter") MyFormatter formatter) {
        this.formatter = formatter;
    }

    public void printFormat() {
        System.out.println(formatter.format());
    }
}
