package com.portfoliohr.hr.Controller;

import com.portfoliohr.hr.Entity.Educacion;
import com.portfoliohr.hr.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {

    @Autowired
    IEducacionService ieducacionService;

    @GetMapping("educaciones/traer")
    public List<Educacion> getEducacion() {
        return ieducacionService.getEducacion();
    }

    @PostMapping("/educaciones/crear")
    public String createEducacion(@RequestBody Educacion educacion) {
        ieducacionService.saveEducacion(educacion);
        return "La educacion fue creada exitosamente";
    }

    @DeleteMapping("/educaciones/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id) {
        ieducacionService.deleteEducacion(id);
        return "La educacion fue borrada exitosamente";
    }

    @PutMapping("/educaciones/editar/{id}")
    public ResponseEntity<Educacion> editEducacion(@PathVariable Long id,
            @RequestBody Educacion e) {
        Educacion nuevaEdu = ieducacionService.findEducacion(id);

        nuevaEdu.setInstitucion(e.getInstitucion());
        nuevaEdu.setAnioinicio(e.getAnioinicio());
        nuevaEdu.setAniofinal(e.getAniofinal());
        nuevaEdu.setTituloobtenido(e.getTituloobtenido());

        ieducacionService.saveEducacion(nuevaEdu);
        return ResponseEntity.ok(nuevaEdu);
    }

    @GetMapping("/educaciones/traer/perfil")
    public Educacion findExperiencia() {
        return ieducacionService.findEducacion((long) 1);
    }
    
    @GetMapping("/educaciones/details/{id}")
    public Educacion findEducacion(@PathVariable Long id) {
        return ieducacionService.findEducacion(id);
    }
}