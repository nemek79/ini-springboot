package es.vir2al.ini_springboot.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pathvariable")
@Slf4j
public class GreetingController {

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name) {

        return "Hola " + name;

    }

}
