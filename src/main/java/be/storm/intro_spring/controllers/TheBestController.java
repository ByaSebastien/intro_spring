package be.storm.intro_spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheBestController {

    @GetMapping("/tf/java/thebest")
    public String theBest()
    {
        return "thebest/index";
    }
}
