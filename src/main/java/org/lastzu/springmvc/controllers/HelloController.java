package org.lastzu.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/person")
    public String sayHello(@RequestParam(value = "name", required = false) String name,
                           Model model) {

        if (name == null) {
            name = "World";
        }

        model.addAttribute("helloName", "Hello, " + name);

        return "hello/hello";
    }

    @GetMapping("/Bella")
    public String sayBella() {
        return "hello/bella";
    }
}
