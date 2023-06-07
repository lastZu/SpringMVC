package org.lastzu.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc")
public class CalcController {
    @GetMapping("")
    public String calc(@RequestParam(value = "a") int a,
                       @RequestParam(value = "b") int b,
                       @RequestParam(value = "action") String action,
                       Model model) {

        String answer = switch (action) {
            case ("mult") -> a + " * " + b + " = " + (a * b);
            case ("plus") -> a + " + " + b + " = " + (a + b);
            case ("del") -> a + " / " + b + " = " + (a / b);
            case ("sub") -> a + " - " + b + " = " + (a - b);
            default -> "no action";
        };

        model.addAttribute("result", answer);

        return "calc/calc";
    }
}
