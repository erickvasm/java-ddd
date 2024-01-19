package tv.codely.mooc.courses.infrastructure;

import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;

import java.util.HashMap;
import java.util.Optional;

public final class InMemoryCourseRepository implements CourseRepository {

    // I supose that this is a database for now
    private HashMap<String, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        this.courses.put(course.getId(), course);
    }

    @Override
    public Optional<Course> search(String id) {
       return Optional.ofNullable(courses.get(id));
    }
}
