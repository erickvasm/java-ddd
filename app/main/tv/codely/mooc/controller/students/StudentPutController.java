package tv.codely.mooc.controller.students;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreator;
import tv.codely.mooc.students.application.create.StudentCreator;

@RestController
public final class StudentPutController {

    private StudentCreator studentCreator;

    public StudentPutController(StudentCreator studentCreator) {
        this.studentCreator = studentCreator;
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Object> create(@PathVariable String id, @RequestBody StudentPutRequest request) {
        studentCreator.create(id, request.getName(), request.getLastName(), request.getEmail());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

@Getter
final class StudentPutRequest {
    private String name;
    private String lastName;
    private String email;
}
