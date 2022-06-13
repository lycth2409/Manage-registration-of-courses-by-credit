package lycth.mrc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentEntity extends PeopleEntity {

    @Column(name = "sId",unique = true, nullable = false)
    private String sId;

    @Column(name= "email", unique = true)
    private String email;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "major")
    private String major;

    @Column(name = "class")
    private String clazz;
}
