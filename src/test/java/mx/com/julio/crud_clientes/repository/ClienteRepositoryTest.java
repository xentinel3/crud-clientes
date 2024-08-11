package mx.com.julio.crud_clientes.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class ClienteRepositoryTest {

    @Autowired
    ClienteRepository clienteRepository;

    @Test
    void findFirstById() {
        var cliente = clienteRepository.findFirstById(1L);
        log.info("El cliente obtenido fue {}", cliente);
        assertNotNull(cliente);
    }
    @Test
    void findFirstByName() {
        var cliente = clienteRepository.findFirstByName("julio");
        log.info("El cliente obtenido fue {}", cliente);
        assertNotNull(cliente);
    }
}