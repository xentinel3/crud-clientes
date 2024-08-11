package mx.com.julio.crud_clientes.service;

import mx.com.julio.crud_clientes.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {


    public Cliente getCliente(Long id){
        return new Cliente("julio", null, null, null);
    }

    public void createCliente(Cliente c){

        var rfc = c.nombre() + c.apellidoMaterno();

    }
}
