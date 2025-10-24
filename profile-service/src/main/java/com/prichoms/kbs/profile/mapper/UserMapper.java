package com.prichoms.kbs.profile.mapper;

import com.prichoms.kbs.profile.dto.UserDto;
import com.prichoms.kbs.profile.model.User;

public class UserMapper {
    public static User mapToUser(User user, UserDto userDto){
        return user;
    }

    public static UserDto mapToUserDto(User user, UserDto userDto){
        return userDto;
    }
}
