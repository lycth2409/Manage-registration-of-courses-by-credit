package lycth.mrc.dto;

import lombok.Getter;
import lombok.Setter;
import lycth.mrc.Enum.Sex;
import lycth.mrc.Enum.Type;


@Getter
@Setter

public class StudentDto{
    private String account;

    private String password;

    private String dateOfBirth;

    private String firstName;

    private String lastName;

    private String phone;

    private String section;

    private String town;

    private String district;

    private String city;

    private Type type;

    private Sex sex;

    private String sId;

    private String email;

    private String faculty;

    private String major;

    private String clazz;

}
