package com.lcwd.electronic.store.services;

import com.lcwd.electronic.store.entities.User;

import com.lcwd.electronic.store.dtos.UserDto;
import java.util.List;

public interface UserService
{
    //create
    UserDto createUser(UserDto userDto);

    //update
    UserDto updateUser(UserDto userDto,String userId);


    void deleteUser(String userId);

    UserDto getUserById(String userId);

    List<UserDto> searchUser(String keyword);


}
