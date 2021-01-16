package info.samples.autoconfigurationsamples;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
@AutoConfigureAfter(PeacemakerConfig.class)
public class DummyConfiguration {

    @Bean
    @ConditionalOnBean(PeacemakerConfig.class)
    public String dummyString(){
        return "dummyString";
    }
}
