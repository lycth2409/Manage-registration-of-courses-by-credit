package lycth.mrc.dto;

import lombok.Data;
import lycth.mrc.Enum.Sex;
import lycth.mrc.Enum.Type;
import lycth.mrc.entity.SubjectEntity;

import java.io.Serializable;

@Data
public class RegisterStudentDto implements Serializable {
    private final String id;
    private final String account;
    private final String password;
    private final String dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final String phone;
    private final String section;
    private final String town;
    private final String district;
    private final String city;
    private final Type type;
    private final Sex sex;
    private final String sId;
    private final String email;
    private final String faculty;
    private final String major;
    private final String clazz;
    private final String subjectId;
    private final SubjectEntity subject;
    private final String semester;
    private final String schoolYear;
    private final String finalScore;
}
