package be.storm.intro_spring.mappers;

import be.storm.intro_spring.entities.Bike;
import be.storm.intro_spring.models.BikeForm;

public class BikeMappers {

    public static Bike toBike(BikeForm form) {
        return new Bike(
                form.getBrand(),
                form.getModel(),
                form.getPower(),
                form.getCylinder()
        );
    }
}
