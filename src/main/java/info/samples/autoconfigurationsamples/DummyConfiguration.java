package info.samples.autoconfigurationsamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DummyConfiguration {

    @Bean
    public String dummyString(){
        return "dummyString";
    }
}
