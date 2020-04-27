package org.academiadecodigo.ramsters.hackathon.converters;

import org.academiadecodigo.ramsters.hackathon.command.UserDto;
import org.academiadecodigo.ramsters.hackathon.persistence.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDto extends AbstractConverter<User, UserDto>{

    @Override
    public UserDto convert(User user) {
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setPhone(String.valueOf(user.getPhone()));
        userDto.setPass(user.getPass());

        return userDto;
    }
}
