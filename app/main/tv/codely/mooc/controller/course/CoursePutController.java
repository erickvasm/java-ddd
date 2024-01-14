package tv.codely.mooc.controller.course;

import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class CoursePutController {

    @PutMapping("/courses/{id}")
    public ResponseEntity<Object> create(@PathVariable String id, @RequestBody CoursePutRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

@Setter
final class CoursePutRequest {
    private String name;
    private String duration;
}
