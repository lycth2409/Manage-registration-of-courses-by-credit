package lycth.mrc.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class CourseEntity {
    @Id
    @Column(name = "course_id", nullable = false)
    private String courseId;

    @Column(name = "start_date", nullable = false)
    private Date startDate;

    @Column(name = "time", nullable = false)
    private Date time;

    @Column(name = "room", nullable = false)
    private String room;

    @Column(name = "capacity", nullable = false)
    private Number capacity;

    @Column(name = "exam_date", nullable = false)
    private Date examDate;

    @Column(name = "exam_time", nullable = false)
    private Date  examTime;

    @Column(name = "exam_room", nullable = false)
    private Date  examRoom;

}
