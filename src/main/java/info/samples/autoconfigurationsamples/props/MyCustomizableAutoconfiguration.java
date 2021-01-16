package info.samples.autoconfigurationsamples.props;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "custom.enabled", havingValue = "true")
@EnableConfigurationProperties(MyAutoconfigurationProps.class)
public class MyCustomizableAutoconfiguration {

    private final MyAutoconfigurationProps props;

    public MyCustomizableAutoconfiguration(MyAutoconfigurationProps props) {
        this.props = props;
    }

    @Bean
    public String myCustomizableAutoconfigurationBean(){
        return "myCustomizableAutoconfigurationBean";
    }
}
