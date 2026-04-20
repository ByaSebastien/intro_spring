package be.storm.intro_spring.models;

import be.storm.intro_spring.entities.Bike;

public record BikeDetailsDto(
        Integer id,
        String brand,
        String model,
        String power,
        String cylinder
) {

    public static BikeDetailsDto fromBike(Bike b) {
        return new BikeDetailsDto(
                b.getId(),
                b.getBrand(),
                b.getModel(),
                b.getPower() + "ch",
                b.getCylinder() + "cc"
        );
    }
}
