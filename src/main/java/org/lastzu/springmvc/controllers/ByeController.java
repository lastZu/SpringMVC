package org.lastzu.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exit")
public class ByeController {
    @GetMapping("/bye")
    public String sayBye() {
        return "bye/bye";
    }


}
