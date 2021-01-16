package info.samples.autoconfigurationsamples.testapp.props;

import info.samples.autoconfigurationsamples.props.MyCustomizableAutoconfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class PropsConfigTest {
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(MyCustomizableAutoconfiguration.class));

    @Test
    void should_find_my_customizable_config_bean_in_context(){
        this.contextRunner
                .withPropertyValues("custom.enabled=false")
                .run(context -> {
                    assertThat(context).getBean("myCustomizableAutoconfigurationBean").isNotNull();
                });
    }
}
