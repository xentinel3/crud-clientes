package mx.com.julio.crud_clientes.controller;

import org.springframework.web.bind.annotation.*;


// get, put, post, delete, all,.... Sobre un solo recurso
@RestController
@RequestMapping("/v1/cliente")
public class HolaMundoController {

    @GetMapping
    public String holaMundo(){
        return "Hola mundo";
    }

}
