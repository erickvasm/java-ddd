package tv.codely.mooc.courses.infrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;

import java.util.Optional;

final class InMemoryCourseRepositoryTest {

    @Test
    void saveAValidCourse() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course("id", "name", "duration");
        repository.save(course);
    }

    @Test
    void searchAValidCourse() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Course course = new Course("id", "name", "duration");
        repository.save(course);
        Assert.assertEquals(Optional.of(course), repository.search("id"));
    }

    @Test
    void searchAnInvalidCourse() {
        InMemoryCourseRepository repository = new InMemoryCourseRepository();
        Assert.assertFalse(repository.search("non-existing").isPresent());
    }

}