package com.api_rest.api_rest_DS3.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aOpController {
    @GetMapping("/suma")
    public double suma(@RequestParam double a, @RequestParam double b) {
        return a+b;
    }

    @GetMapping("/resta")
    public double resta(@RequestParam double a, @RequestParam double b) {
        return a-b;
    }

    @GetMapping("/times")
    public double times(@RequestParam double a, @RequestParam double b) {
        return a*b;
    }

    @GetMapping("/division")
    public double division(@RequestParam double a, @RequestParam double b){
        return a/b;
    }

    @GetMapping("/modulo")
    public double modulo(@RequestParam double a, @RequestParam double b){
        if (b!=0){
            return a%b;
        } else {
            throw new IllegalArgumentException("El segundo número no puede ser cero.");
        }
    }

    @GetMapping("/exp")
    public double exp(@RequestParam double a, @RequestParam double b) {
        return Math.pow(a,b);
    }

    @GetMapping("/raiz2")
    public double raiz2(@RequestParam double a) {
        return Math.sqrt(a);
    }
}