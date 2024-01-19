package tv.codely.mooc.students.application.create;

import org.junit.jupiter.api.Test;
import tv.codely.mooc.courses.application.create.CourseCreator;
import tv.codely.mooc.courses.domain.Course;
import tv.codely.mooc.courses.domain.CourseRepository;
import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentRepository;

import static org.mockito.Mockito.*;

final class StudentCreatorTest {

    @Test
    void saveAValidSudent() {
        StudentRepository repository = mock(StudentRepository.class);
        StudentCreator creator = new StudentCreator(repository);
        Student student = new Student("id", "name", "lastName", "email");
        creator.create(student.getId(), student.getName(), student.getLastName(), student.getEmail());
        creator.create("id", "name", "lastName", "email");
        verify(repository, atLeastOnce()).save(student);
    }
}