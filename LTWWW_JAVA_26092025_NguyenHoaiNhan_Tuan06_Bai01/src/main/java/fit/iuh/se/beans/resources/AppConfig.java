package fit.iuh.se.beans.resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("fit.iuh.se.beans.resources")
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public ClientBean clientBean() {
        return new ClientBean();
    }
}
