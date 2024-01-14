package tv.codely.mooc.controller.course;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.controller.RequestTestCase;

public final class CoursePutControllerTest extends RequestTestCase {

    @Test
    void createAValidCourse() throws Exception {
        assertRequestWithBody(
                "PUT",
                "/courses/4e2e4e7f-1c5d-4d4d-8f24-2b0d958c6a1e",
                "{\"name\": \"The best course\", \"duration\": \"5 hours\", \"description\": \"The best course\"}",
                201
        );
    }
}