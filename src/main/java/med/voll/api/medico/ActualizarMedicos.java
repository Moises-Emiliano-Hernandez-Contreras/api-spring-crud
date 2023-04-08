package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;
import med.voll.api.direccion.Direccion;

public record ActualizarMedicos(Long id, String nombre, String email, Direccion direccion) {
    public ActualizarMedicos(Medico medico) {
        this(medico.getId(),medico.getNombre(),medico.getEmail(),medico.getDireccion());
    }
}
