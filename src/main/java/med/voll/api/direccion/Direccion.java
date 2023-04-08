package med.voll.api.direccion;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Direccion {
    private String calle;
    private String numero;
    private String barrio;
    private String ciudad;

    public Direccion(DatosDireccion direccion) {
        this.calle=direccion.calle();
        this.numero= direccion.numero();
        this.barrio=direccion.barrio();
        this.ciudad= direccion.ciudad();
    }

    public Direccion actualizarDireccion(DatosDireccion direccion) {
        this.calle=direccion.calle();
        this.numero= direccion.numero();
        this.barrio=direccion.barrio();
        this.ciudad= direccion.ciudad();
        return this;
    }
}
