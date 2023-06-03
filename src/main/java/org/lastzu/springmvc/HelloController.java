package org.lastzu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello2")
    public String sayHello() {
        return "hello_world";
    }
}
