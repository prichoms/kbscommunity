package com.prichoms.kbs.profile.dto;

import com.prichoms.kbs.profile.model.enums.Gender;
import com.prichoms.kbs.profile.model.enums.Gotra;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ResponseDto {
    String statusCode;
    String statusMsg;
    String errorMsg;
}
