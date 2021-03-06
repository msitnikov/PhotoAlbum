package com.alikian.service;

import com.alikian.dto.UserDto;

import java.util.List;

/**
 * Created by akian on 2/22/17.
 */
public interface UserService {
    void saveAll(List<UserDto> userDtos);
    List<UserDto> getAll();

    UserDto getOne(Integer userId);
    UserDto saveOrUpdate(UserDto userDto);
    void delete(Integer userId);
}
