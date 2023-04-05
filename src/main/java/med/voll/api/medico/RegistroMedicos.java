package med.voll.api.medico;

import med.voll.api.direccion.DatosDireccion;

public record RegistroMedicos(String nombre, String email, String Cedula, Especialidad especialidad, DatosDireccion direccion) {

}
