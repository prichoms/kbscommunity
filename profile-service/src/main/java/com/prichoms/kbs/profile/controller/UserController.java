package com.prichoms.kbs.profile.controller;

import com.prichoms.kbs.profile.dto.ResponseDto;
import com.prichoms.kbs.profile.dto.UserDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.prichoms.kbs.profile.constants.UserConstants.*;

@RestController
@RequestMapping(path = "/api/v1", produces = {MediaType.APPLICATION_JSON_VALUE})

public class UserController {
    @PostMapping("/createUser")
    public ResponseEntity<ResponseDto> createUser(@RequestBody UserDto userDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(STATUS_201,STATUS_201_msg,null));
    }
}
