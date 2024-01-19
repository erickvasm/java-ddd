package tv.codely.mooc.controller.student;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.controller.RequestTestCase;

class CoursePutControllerTest extends RequestTestCase {

    @Test
    void createAValidStudent() throws Exception {
        assertRequestWithBody(
                "PUT",
                "/student/4e2e4e7f-1c5d-4d4d-8f24-2b0d958c6a1e",
                "{\"name\": \"Pepe\", \"lastname\": \"Smith\", \"email\": \"pepe.smith@gmail.com\"}",
                201
        );
    }

}