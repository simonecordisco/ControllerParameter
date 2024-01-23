//Scrivi una applicazione web Spring Boot che alla endpoint GET v1/ciao?nome=Giuseppe&provincia=Lombardia risponde con
// "Ciao Giuseppe, com'è il tempo in Lombardia?"


package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")

public class Controller {


    @GetMapping(path = "/ciao")
    public String ciao(
    @RequestParam(required = true) String nome,
    @RequestParam(required = false, defaultValue = "li da te ") String provincia
){
        return "ciao " + nome + " com'è il tempo in provincia di  " + provincia + "?";
    }



}
