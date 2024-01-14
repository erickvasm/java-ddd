package tv.codely.mooc.controller.health_check;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.controller.RequestTestCase;

class HealthCheckGetControllerTest extends RequestTestCase {
    @Test
    void checkTheAppIsRunningOk() throws Exception {
        assertResponse("/health-check", 200, "{\"status\":\"ok\"}");
    }
}