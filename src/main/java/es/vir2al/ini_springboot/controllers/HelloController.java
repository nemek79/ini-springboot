package es.vir2al.ini_springboot.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
@AllArgsConstructor
public class HelloController {

    @GetMapping({"/hello-world", "/hello"})
    public String helloWorld() {
        return "Hello World!";
    }

}
