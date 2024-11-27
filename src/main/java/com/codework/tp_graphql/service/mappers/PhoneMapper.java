package com.codework.tp_graphql.service.mappers;

import com.codework.tp_graphql.dao.entities.Phone;
import com.codework.tp_graphql.service.dtos.PhoneDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PhoneMapper {
    ModelMapper modelMapper = new ModelMapper();
    public PhoneDto fromPhoneToPhoneDTO(Phone phone) {
        return modelMapper.map(phone, PhoneDto.class);
    }
    public PhoneDto fromPhoneDTOToPhone(PhoneDto phoneDto) {
        return modelMapper.map(phoneDto, PhoneDto.class);
    }
}
