package info.samples.autoconfigurationsamples;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class PeacemakerConfig {

    @Bean
    public Peacemaker peacemaker(){
        return new Peacemaker();
    }
}
