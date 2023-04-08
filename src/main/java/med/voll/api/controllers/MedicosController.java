package med.voll.api.controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void addMedicos(@RequestBody @Valid RegisterMedicos medicos){
        System.out.println(medicos);
        medicoRepository.save(new Medico(medicos));
    }
    @GetMapping
    public Page<ListaDeMedicos> listarMedicos(@PageableDefault(size = 2,sort = "Cedula") Pageable paginacion){
        return medicoRepository.findByEstadoTrue(paginacion).map(ListaDeMedicos::new);
        //return medicoRepository.findAll(paginacion).map(ListaDeMedicos::new);
    }
    @PutMapping
    @Transactional
    public void EditarMedicos(@RequestBody @Valid ActualizarMedicos nuevosDatosmedico){
        Medico medico = medicoRepository.getReferenceById(nuevosDatosmedico.id());
        medico.ActualizarDatos(nuevosDatosmedico);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void BorrarMedico(@PathVariable Long id){
        Medico medico = medicoRepository.getReferenceById(id);
        medico.CambioEstado();
    }
}
