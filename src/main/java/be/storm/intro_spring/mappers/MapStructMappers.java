package be.storm.intro_spring.mappers;

import be.storm.intro_spring.entities.Bike;
import be.storm.intro_spring.models.BikeForm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface MapStructMappers {

    @Mapping(target = "id", ignore = true)
    Bike toBike(BikeForm form);
}
