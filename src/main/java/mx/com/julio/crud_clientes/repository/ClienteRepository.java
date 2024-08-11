package mx.com.julio.crud_clientes.repository;

import mx.com.julio.crud_clientes.entities.ClienteEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {

    ClienteEntity findFirstById(Long id);
    ClienteEntity findFirstByName(String name);

}
