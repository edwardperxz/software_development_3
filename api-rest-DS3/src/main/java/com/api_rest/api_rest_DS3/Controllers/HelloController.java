package com.api_rest.api_rest_DS3.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hola() {
        return "Hola mundito dijo el pepe";
    }
}
