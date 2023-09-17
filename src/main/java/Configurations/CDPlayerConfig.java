import Implimentation.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class CDPlayerConfig {

    @Bean
    public SgtPeppers getSgtPeppersbean()
    {
        return new SgtPeppers();
    }
}