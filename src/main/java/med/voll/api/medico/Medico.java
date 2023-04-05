package med.voll.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.direccion.Direccion;
@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nombre;
    private String email;
    private String cedula;
    @Enumerated
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(RegistroMedicos medicos) {
        this.nombre=medicos.nombre();
        this.email=medicos.email();
        this.cedula=medicos.Cedula();
        this.especialidad=medicos.especialidad();
        this.direccion=new Direccion(medicos.direccion());
    }
}
