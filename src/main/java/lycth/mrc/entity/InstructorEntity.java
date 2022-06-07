package lycth.mrc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class InstructorEntity extends PeopleEntity{

    @Column(name = "iId",unique = true, nullable = false)
    private String iId;

    @Column(name= "email", unique = true)
    private String email;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "subject_group")
    private String subjectGroup;

    @Column(name = "class")
    private String clazz;

    @Column(name = "rank")
    private String rank;
}
