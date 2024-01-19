package tv.codely.mooc.courses.domain;

import org.springframework.stereotype.Service;

import java.util.Optional;

// In the course, they use @Serivice
@Service
public interface CourseRepository {
    void save(Course course);
    Optional<Course> search(String id);
}
