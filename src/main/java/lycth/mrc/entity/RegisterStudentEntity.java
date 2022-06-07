package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter

public class RegisterStudentEntity extends StudentEntity{
    @Column(name = "subject_id", nullable = false)
    private String subjectId;

    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "subject_id", insertable = false, updatable = false)
    @OneToOne
    private SubjectEntity subject;

    @Column(name = "semester", nullable = false)
    private String semester;

    @Column(name = "school_year", nullable = false)
    private String schoolYear;

    @Column(name = "final_score", nullable = false)
    private String finalScore;
}
