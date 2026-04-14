package be.storm.intro_spring.controllers;

import be.storm.intro_spring.entities.Bike;
import be.storm.intro_spring.repositories.BikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/moto")
@RequiredArgsConstructor
public class MotoController {

    private final BikeRepository  bikeRepository;

    // RequiredArgsConstructor
//    public MotoController(BikeRepository bikeRepository) {
//        this.bikeRepository = bikeRepository;
//    }


    @GetMapping
    public String index(
            Model model
    ){
        List<Bike> motos = bikeRepository.findAll();
        model.addAttribute("motos",motos);
        return "moto/index";
    }

    @GetMapping("/{id}")
    public String details(
            @PathVariable Integer id,
            Model model
    ) {
        Bike moto = bikeRepository.findById(id).orElseThrow();

        model.addAttribute("moto",moto);

        return "moto/details";
    }

    @GetMapping("/create")
    public String create(
            Model model
    ) {
        model.addAttribute("moto",new Bike());
        return "moto/create";
    }

    @PostMapping("/create")
    public String create(
            @ModelAttribute Bike moto
    ){
        bikeRepository.save(moto);
        return "redirect:/moto";
    }
}
