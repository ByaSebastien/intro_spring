package be.storm.intro_spring.controllers;

import be.storm.intro_spring.entities.Bike;
import be.storm.intro_spring.models.BikeDetailsDto;
import be.storm.intro_spring.models.BikeForm;
import be.storm.intro_spring.models.BikeIndexDto;
import be.storm.intro_spring.repositories.BikeRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Controller
@RequestMapping("/moto")
@RequiredArgsConstructor
public class MotoController {

    private final BikeRepository  bikeRepository;
//    private final MapStructMappers mappers;

    // RequiredArgsConstructor
//    public MotoController(BikeRepository bikeRepository) {
//        this.bikeRepository = bikeRepository;
//    }


    @GetMapping
    public String index(
            Model model
    ){
        List<BikeIndexDto> motos = bikeRepository.findAll().stream()
                .map(BikeIndexDto::fromBike)
                .toList();

        model.addAttribute("motos",motos);
        return "moto/index";
    }

    @GetMapping("/{id}")
    public String details(
            @PathVariable Integer id,
            Model model
    ) {
        BikeDetailsDto moto = BikeDetailsDto.fromBike(bikeRepository.findById(id).orElseThrow());

        model.addAttribute("moto",moto);

        return "moto/details";
    }

    @GetMapping("/create")
    public String create(
            Model model
    ) {
        model.addAttribute("moto",new BikeForm());
        return "moto/create";
    }

    @PostMapping("/create")
    public String create(
            @Valid @ModelAttribute("moto") BikeForm moto,
            BindingResult br,
            Model model){

        if(br.hasErrors()){
            model.addAttribute("moto", moto);
            return "moto/create";
        }

        bikeRepository.save(moto.toBike());
//        bikeRepository.save(mappers.toBike(moto));
//        bikeRepository.save(BikeMappers.toBike(moto));
        return "redirect:/moto";
    }
}
