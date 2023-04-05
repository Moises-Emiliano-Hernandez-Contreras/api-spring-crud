package med.voll.api.controllers;

import med.voll.api.medico.Medico;
import med.voll.api.medico.MedicoRepository;
import med.voll.api.medico.RegistroMedicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void addMedicos(@RequestBody RegistroMedicos medicos){
        medicoRepository.save(new Medico(medicos));
        System.out.println(medicoRepository);
    }
}
