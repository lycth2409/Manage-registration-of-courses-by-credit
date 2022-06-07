package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class SubjectEntity {
    @Id
    @Column(name = "subject_id", nullable = false)
    private String subjectId;

    @Column(name = "sub_name", nullable = false)
    private String subjectName;

    @Column(name = "credit", nullable = false)
    private String credit;

    @Column(name = "major")
    private String major;

    @Column(name = "class")
    private String clazz;

}
