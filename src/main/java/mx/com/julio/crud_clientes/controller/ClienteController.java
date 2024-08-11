package mx.com.julio.crud_clientes.controller;

import mx.com.julio.crud_clientes.model.Cliente;
import mx.com.julio.crud_clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {


    @Autowired
    ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<Cliente> getCliente() {
        return ResponseEntity.ok(clienteService.getCliente(20L));
    }

}
