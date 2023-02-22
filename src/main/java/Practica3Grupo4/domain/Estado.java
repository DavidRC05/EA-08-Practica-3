
package Practica3Grupo4.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long idEstado;
    String nombreEstado;
    String nombreCapital;
    String costas;
    String poblacion;

    public Estado() {
    }

    public Estado(Long idEstado, String nombreEstado, String nombreCapital, String costas, String poblacion) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.nombreCapital = nombreCapital;
        this.costas = costas;
        this.poblacion = poblacion;
    }

    
}
