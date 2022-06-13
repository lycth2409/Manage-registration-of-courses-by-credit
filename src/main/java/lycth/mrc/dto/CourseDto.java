package lycth.mrc.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter

public class CourseDto  {
    private String courseId;
    private Date startDate;
    private Date time;
    private String room;
    private Number capacity;
    private Date examDate;
    private Date examTime;
    private Date examRoom;
}
