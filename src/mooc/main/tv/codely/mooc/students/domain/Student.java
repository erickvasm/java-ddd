package tv.codely.mooc.students.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Student {
    private String id;
    private String name;
    private String lastName;
    private String email;
}
