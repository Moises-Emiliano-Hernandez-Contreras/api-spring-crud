package med.voll.api.controllers;

import med.voll.api.medico.RegistroMedicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @PostMapping
    public void addMedicos(@RequestBody RegistroMedicos medicos){
        System.out.println("Peticion correcta");
        System.out.println(medicos);
    }
}
