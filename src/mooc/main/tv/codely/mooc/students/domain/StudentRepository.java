package tv.codely.mooc.students.domain;

import org.springframework.stereotype.Repository;
import tv.codely.mooc.courses.domain.Course;

import java.util.Optional;

@Repository
public interface StudentRepository {
    void save(Student student);
    Optional<Student> search(String id);
}
