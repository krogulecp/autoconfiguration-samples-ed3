package info.samples.autoconfigurationsamples;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class DummyConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public String dummyString(){
        return "dummyString";
    }
}
