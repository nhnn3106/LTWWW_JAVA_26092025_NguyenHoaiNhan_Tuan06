package fit.iuh.se.beans.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyNumberFormatterService {
    private final MyNumberFormatter myNumberFormatter;

    @Autowired
    public MyNumberFormatterService(MyNumberFormatter myNumberFormatter) {
        this.myNumberFormatter = myNumberFormatter;
    }

    public void printFormat(double number) {
        System.out.println(myNumberFormatter.format(number));
    }
}
