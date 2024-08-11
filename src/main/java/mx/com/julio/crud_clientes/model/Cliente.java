package mx.com.julio.crud_clientes.model;

import java.time.LocalDate;

public record Cliente(String nombre, String apellidoPaterno,
                      String apellidoMaterno, LocalDate fechaNacimiento) {
}
