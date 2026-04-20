package be.storm.intro_spring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @ToString
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Integer id;

    @Getter @Setter
    private String brand = "";

    @Getter @Setter
    private String model = "";

    @Getter @Setter
    private int power;

    @Getter @Setter
    private int cylinder;

    public Bike(String brand, String model, int power, int cylinder) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.cylinder = cylinder;
    }
}
