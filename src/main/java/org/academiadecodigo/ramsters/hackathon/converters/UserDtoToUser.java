package org.academiadecodigo.ramsters.hackathon.converters;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.core.convert.converter.Converter;

public class UserDtoToUser implements Converter<UserDto, User> {

    @Override
    public User convert(UserDto userDto) {

        User user = new User();

        user.setPass(userDto.getPass());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());

        return user;
    }
}
