package med.voll.api.medico;

public record ListaDeMedicos(Long id, String nombre,String especialidad, String telefono) {
    public ListaDeMedicos(Medico medico) {
        this(medico.getId(),medico.getNombre(),medico.getCedula(),medico.getTelefono());
    }
}
