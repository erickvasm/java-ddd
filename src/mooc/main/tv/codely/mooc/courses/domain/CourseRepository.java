package tv.codely.mooc.courses.domain;

import org.springframework.stereotype.Service;

@Service
public interface CourseRepository {
    void save(Course course);
}
