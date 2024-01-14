package tv.codely.mooc.courses.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor()
@EqualsAndHashCode
public class Course {
    private String id;
    private String name;
    private String duration;
}
