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
    private Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String cedula;
    @Enumerated
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;
    private Boolean estado;
    public Medico(RegisterMedicos medicos) {
        this.nombre=medicos.nombre();
        this.email=medicos.email();
        this.telefono=medicos.telefono();
        this.cedula=medicos.Cedula();
        this.especialidad=medicos.especialidad();
        this.direccion=new Direccion(medicos.direccion());
        this.estado=true;
        System.out.println(this.nombre);
        System.out.println(medicos.nombre());
    }

    public void ActualizarDatos(ActualizarMedicos nuevosDatosmedico) {
        if(nuevosDatosmedico.nombre()!=null){
            this.nombre=nuevosDatosmedico.nombre();
        }
        if(nuevosDatosmedico.email()!=null){
            this.email=nuevosDatosmedico.email();
        }
        if(nuevosDatosmedico.direccion()!=null){
            this.direccion=direccion.actualizarDireccion(nuevosDatosmedico.direccion());
        }


    }

    public void CambioEstado() {
        this.estado=false;
    }
}
