package org.academiadecodigo.ramsters.hackathon.converters;

import org.academiadecodigo.ramsters.hackathon.command.BeachDto;
import org.academiadecodigo.ramsters.hackathon.persistence.model.Beach;
import org.springframework.stereotype.Component;


@Component
public class BeachToBeachDto extends AbstractConverter<Beach, BeachDto> {


    @Override
    public BeachDto convert(Beach beach) {
        BeachDto beachDto = new BeachDto();
        beachDto.setAddress(beach.getAddress());
        beachDto.setName(beach.getName());
        beachDto.setUrlImg(beach.getUrlImg());
        beachDto.setStatus(beach.getStatus());

        return beachDto;
    }
}
