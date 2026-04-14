package be.storm.intro_spring.models;

import lombok.*;

@AllArgsConstructor @Builder
@EqualsAndHashCode(of = {"id"}) @ToString(exclude = {"power"})
public class Moto {

    private static Integer nextId = 1;

    @Getter
    private Integer id;

    @Getter @Setter
    private String brand;

    @Getter @Setter
    private String model;

    @Getter @Setter
    private int power;

    public Moto() {
        id = nextId++;
        brand = "";
        model = "";
    }

    public Moto(String brand, String model, int power) {
        this();
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    //region Ce que genere lombok au runtime

//    public Integer getId() {
//        return id;
//    }
//
//    public String getBrand() {
//        return brand;
//    }
//
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getPower() {
//        return power;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Moto moto = (Moto) o;
//        return Objects.equals(id, moto.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }
//
//    @Override
//    public String toString() {
//        return "Moto{" +
//                "id=" + id +
//                ", brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                '}';
//    }

    //endregion
}
