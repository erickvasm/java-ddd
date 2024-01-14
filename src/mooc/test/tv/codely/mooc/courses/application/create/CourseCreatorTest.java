package tv.codely.mooc.courses.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import static org.mockito.Mockito.*;

final class CourseCreatorTest {

    @Test
    void saveAValidCourse() {
        CourseRepository repository = mock(CourseRepository.class);
        CourseCreator creator = new CourseCreator(repository);
        Course course = new Course("id", "name", "duration");
        creator.create(course.getId(), course.getName(), course.getDuration());
        creator.create("id", "name", "duration");
        verify(repository, atLeastOnce()).save(course);
    }
}