package be.storm.intro_spring.repositories;

import be.storm.intro_spring.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BikeRepository extends JpaRepository<Bike, Integer> {

    @Query("select b from Bike b where b.brand like %:brand%")
    List<Bike> findBikesByBrandContaining(String brand);
}
