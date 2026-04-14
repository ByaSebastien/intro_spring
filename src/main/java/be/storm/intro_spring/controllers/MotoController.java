package be.storm.intro_spring.controllers;

import be.storm.intro_spring.data.FakeDb;
import be.storm.intro_spring.models.Moto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/moto")
public class MotoController {


    @GetMapping
    public String index(
            Model model
    ){
        List<Moto> motos = FakeDb.MOTOS;
        model.addAttribute("motos",motos);
        return "moto/index";
    }

    @GetMapping("/{id}")
    public String details(
            @PathVariable Integer id,
            Model model
    ) {
        Moto moto = FakeDb.MOTOS.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElseThrow();

        model.addAttribute("moto",moto);

        return "moto/details";
    }

    @GetMapping("/create")
    public String create(
            Model model
    ) {
        model.addAttribute("moto",new Moto());
        return "moto/create";
    }

    @PostMapping("/create")
    public String create(
            @ModelAttribute Moto moto
    ){
        FakeDb.MOTOS.add(moto);
        return "redirect:/moto";
    }
}
