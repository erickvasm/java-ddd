package tv.codely.mooc.controller.greetter;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.controller.RequestTestCase;

class GreeterControllerGetControllerTest extends RequestTestCase {

    @Test
    void checkTheAppIsWorking() throws Exception {
        assertResponse("/greeter?name=Pepe", 200, "{\"message\":\"Hello Pepe\"}");
    }
}