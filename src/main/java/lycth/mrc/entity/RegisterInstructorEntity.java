package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter

public class RegisterInstructorEntity extends InstructorEntity{

    @Column(name = "semester", nullable = false)
    private String semester;

    @Column(name = "school_year", nullable = false)
    private String schoolYear;
}
