package com.hackathon3.api.mappers;

import com.hackathon3.api.dto.UserDto;
import com.hackathon3.api.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User create(UserDto dto) {
        User user = new User();
        user.setLogin(dto.getLogin());
        user.setPassword(dto.getPassword());
        user.setCustomer(dto.getCustomer());
        return user;
    }

    public User update(User user, UserDto dto) {
        user.setLogin(dto.getLogin());
        user.setPassword(dto.getPassword());
        user.setCustomer(dto.getCustomer());
        return user;
    }
}
