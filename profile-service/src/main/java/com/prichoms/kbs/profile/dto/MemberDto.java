package com.prichoms.kbs.profile.dto;

import com.prichoms.kbs.profile.model.enums.Gender;
import com.prichoms.kbs.profile.model.enums.Gotra;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.util.Date;

@Data
public class MemberDto {
    String firstName;
    String lastName;
    Date dateOfBirth;
    Gotra gotra;
    Email email;
    String mobileNumber;
    Gender gender;
}
