package com.prichoms.kbs.profile.service;

import com.prichoms.kbs.profile.dto.UserDto;

public interface IUserService {
    /**
     * @param userDto
     */
    void createUser(UserDto userDto);
}
