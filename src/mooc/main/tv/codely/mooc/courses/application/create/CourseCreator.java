package tv.codely.mooc.courses.application.create;

import lombok.AllArgsConstructor;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.shared.domain.Service;

@Service
@AllArgsConstructor()
public final class CourseCreator {
    private CourseRepository repository;

    public void create(String id, String name, String duration) {
        Course course = new Course(id, name, duration);
        this.repository.save(course);
    }
}