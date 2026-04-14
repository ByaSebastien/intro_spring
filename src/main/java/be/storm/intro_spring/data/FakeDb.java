package be.storm.intro_spring.data;

import be.storm.intro_spring.models.Moto;

import java.util.ArrayList;
import java.util.List;

public class FakeDb {

    public static final List<Moto> MOTOS = new ArrayList<>();

    static {
        MOTOS.add(new Moto("Yamaha", "MT-07", 74));
        MOTOS.add(new Moto("Yamaha", "R1", 200));
        MOTOS.add(new Moto("Honda", "CB500F", 48));
        MOTOS.add(new Moto("Honda", "CBR1000RR", 217));
        MOTOS.add(new Moto("Kawasaki", "Z900", 125));
        MOTOS.add(new Moto("Kawasaki", "Ninja 650", 67));
        MOTOS.add(new Moto("Suzuki", "GSX-8S", 84));
        MOTOS.add(new Moto("Suzuki", "Hayabusa", 190));
        MOTOS.add(new Moto("BMW", "S1000RR", 210));
        MOTOS.add(new Moto("Ducati", "Panigale V4", 215));
    }
}
