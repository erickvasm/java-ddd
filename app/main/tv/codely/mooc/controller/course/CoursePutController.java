package tv.codely.mooc.controller.course;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tv.codely.mooc.courses.application.create.CourseCreator;

@RestController
public final class CoursePutController {

    private CourseCreator creator;

    public CoursePutController(CourseCreator creator) {
        this.creator = creator;
    }

    @PutMapping("/courses/{id}")
    public ResponseEntity<Object> create(@PathVariable String id, @RequestBody CoursePutRequest request) {
        creator.create(id, request.getName(), request.getDuration());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

@Getter
final class CoursePutRequest {
    private String name;
    private String duration;
}
