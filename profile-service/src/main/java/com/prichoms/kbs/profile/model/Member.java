package com.prichoms.kbs.profile.model;

import com.prichoms.kbs.profile.model.enums.Gender;
import com.prichoms.kbs.profile.model.enums.Gotra;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;
    String firstName;
    String lastName;
    Date dateOfBirth;
    Gotra gotra;
    Email email;
    String mobileNumber;
    Integer age;
    Gender gender;
}
