package lycth.mrc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lycth.mrc.Enum.Sex;
import lycth.mrc.Enum.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class PeopleEntity {
    @Id
    @Column(name = "id",unique = true, nullable = false)
    private String id;

    @Column(name = "account", unique = true)
    private String account;

    @Column(name = "password")
    private String password;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "section")
    private String section;

    @Column(name = "town")
    private String town;

    @Column(name = "district")
    private String district;

    @Column(name ="city")
    private String city;

    @Column(name = "type")
    private Type type;

    @Column(name = "sex")
    private Sex sex;

    private String fullName(){
        return firstName + ' ' + lastName;
    }

}
