package tv.codely.mooc.students.infrastructure;

import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentRepository;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryStudentRepository implements StudentRepository {

    private HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student student) {
    this.students.put(student.getId(), student);
    }

    @Override
    public Optional<Student> search(String id) {
        return Optional.ofNullable(students.get(id));
    }
}
