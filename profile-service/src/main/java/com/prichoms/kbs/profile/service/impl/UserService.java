package com.prichoms.kbs.profile.service.impl;

import com.prichoms.kbs.profile.dto.UserDto;
import com.prichoms.kbs.profile.repository.UserRepository;
import com.prichoms.kbs.profile.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * @param userDto
     */
    @Override
    public void createUser(UserDto userDto) {
    }
}
