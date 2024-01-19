package tv.codely.mooc.students.infrastructure;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tv.codely.mooc.students.domain.Student;
import java.util.Optional;

final class InMemoryStudentRepositoryTest {

    @Test
    void saveAValidStudent() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        Student student = new Student("id", "name", "lastName", "email");
        repository.save(student);
    }

    @Test
    void searchAValidStudent() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        Student student = new Student("id", "name", "lastName", "email");
        repository.save(student);
        Assert.assertEquals(Optional.of(student), repository.search("id"));
    }

    @Test
    void searchAnInvalidCourse() {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        Assert.assertFalse(repository.search("non-existing").isPresent());
    }
}