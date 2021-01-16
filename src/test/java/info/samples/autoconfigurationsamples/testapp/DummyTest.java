package info.samples.autoconfigurationsamples.testapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DummyTest {

    @Autowired
    private ConfigurableApplicationContext context;

    @Test
    void should_have_dummyString_in_context(){
        //when
        final boolean dummyString = context.containsBean("dummyString");

        //then
        assertTrue(dummyString);
    }
}
