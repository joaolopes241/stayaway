package org.academiadecodigo.ramsters.hackathon.converters;

import org.academiadecodigo.ramsters.hackathon.command.BeachDto;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BeachDtoToBeach implements Converter<BeachDto, Beach> {


    @Override
    public Beach convert(BeachDto beachDto) {

        Beach beach = new Beach();

        beach.setAddress(beachDto.getAddress());
        beach.setName(beachDto.getName());
        beach.setUrlImg(beachDto.getUrlImg());
        beach.setStatus(beachDto.getStatus());

        return beach;

    }
}
