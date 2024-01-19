package tv.codely.mooc.students.application.create;

import lombok.AllArgsConstructor;
import tv.codely.mooc.students.domain.Student;
import tv.codely.mooc.students.domain.StudentRepository;
import tv.codely.shared.domain.Service;

@Service
@AllArgsConstructor
public final class StudentCreator {
    private StudentRepository repository;

    public void create(String id, String name, String lastName, String email) {
        Student student = new Student(id, name, lastName, email);
        this.repository.save(student);
    }
}
