package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Setter
@Getter

public class DetailSubjectEntity extends SubjectEntity{

    @Column(name = "class_hour_theory")
    private Date classHourTheory;

    @Column(name = "class_hour_practice")
    private Date classHourPractice;

}
