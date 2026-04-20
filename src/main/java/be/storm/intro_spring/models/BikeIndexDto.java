package be.storm.intro_spring.models;

import be.storm.intro_spring.entities.Bike;

public record BikeIndexDto(
        Integer id,
        String brand,
        String model
) {

    public static BikeIndexDto fromBike(Bike b){
        return new BikeIndexDto(
                b.getId(),
                b.getBrand(),
                b.getModel());
    }
}


//@AllArgsConstructor
//@EqualsAndHashCode @ToString
//public class BikeIndexDto {
//
//    @Getter
//    private Integer id;
//    @Getter
//    private String brand;
//    @Getter
//    private String model;
//}
