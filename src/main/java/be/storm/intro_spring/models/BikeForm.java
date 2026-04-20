package be.storm.intro_spring.models;

import be.storm.intro_spring.entities.Bike;
import be.storm.intro_spring.validators.Cylinder;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class BikeForm {

    @NotBlank
    @Size(min = 1, max = 50)
    private String brand = "";

    @NotBlank
    @Size(min = 1, max = 50)
    private String model = "";

    @NotNull
    @Min(1)
    @Max(1000)
    private Integer power = 1;

    @NotNull
    @Cylinder(test = 125)
    private Integer cylinder;

    public Bike toBike() {
        return new Bike(
                brand,
                model,
                power,
                cylinder
        );
    }
}
