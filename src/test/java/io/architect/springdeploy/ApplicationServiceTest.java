package io.architect.springdeploy;

import io.architect.springdeploy.service.ApplicationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationServiceTest {

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void getWelcomeMessageString() throws Exception {
        String response = applicationService.getWelcomeMessage();
        assertThat(response, equalTo("Hello from Spring Boot!"));
    }
}

