package org.lastzu.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    public String sayHello() {
        return "hello/hello_world";
    }

    @GetMapping("/Bella")
    public String sayBella() {
        return "hello/bella";
    }
}
