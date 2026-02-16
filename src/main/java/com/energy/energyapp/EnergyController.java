package com.energy.energyapp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EnergyController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam int units, Model model) {

        double bill = units * 12.0;

        model.addAttribute("units", units);
        model.addAttribute("bill", bill);

        return "result";
    }
}