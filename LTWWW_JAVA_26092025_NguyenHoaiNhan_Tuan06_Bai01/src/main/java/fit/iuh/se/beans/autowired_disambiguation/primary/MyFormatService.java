package fit.iuh.se.beans.autowired_disambiguation.primary;

import fit.iuh.se.beans.autowired_disambiguation.primary.MyFormatter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyFormatService {
    private final MyFormatter formatter;

    public MyFormatService(MyFormatter formatter) {
        this.formatter = formatter;
    }

    public void printFormat() {
        System.out.println(formatter.format());
    }
}
