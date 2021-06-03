package com.fabriciosaand.personapi.mapper;

import com.fabriciosaand.personapi.dto.request.PersonDTO;
import com.fabriciosaand.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mappings({ @Mapping(target="birthDate", source="entity.birthDate", dateFormat = "dd-MM-yyyy") })
    PersonDTO personToPersonDTO(Person entity);

    @Mappings({ @Mapping(target="birthDate", source="birthDate", dateFormat = "dd-MM-yyyy") })
    Person personDTOtoPerson(PersonDTO dto);
}
