package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import med.voll.api.direccion.DatosDireccion;

public record RegisterMedicos(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefono,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String Cedula,
        @NotNull
        Especialidad especialidad,
        @NotNull
        @Valid
        DatosDireccion direccion) {

}
