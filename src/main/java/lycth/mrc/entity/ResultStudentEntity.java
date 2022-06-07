package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter

public class ResultStudentEntity extends StudentEntity{

    @Column(name = "score_subject", nullable = false)
    private Number scoreSubject;

    @Column(name = "average_score", nullable = false)
    private Number averageScore;

    @Column(name = "performance")
    private String performance;

    @Column(name = "conduct")
    private String conduct;

    @Column(name = "subject_fail")
    private String subjectFail;
}
