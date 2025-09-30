package fit.iuh.se.bai02.beans.annotationbased;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class AppConfig {

        @Bean
        public Address address() {
            return new Address("HCM", "VN", "VN");
        }

        @Bean
        public Employee employee() {
            return new Employee(1, "Nguyễn Hoài Nhân", address());
        }
    }

