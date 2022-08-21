package com.portfoliohr.hr.Controller;

import com.portfoliohr.hr.Entity.Proyecto;
import com.portfoliohr.hr.Interface.IProyectoService;
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
public class ProyectoController {
    
    @Autowired 
    IProyectoService iproyectoService;
   
   @GetMapping("proyectos/traer")
   public List<Proyecto> getProyecto(){
       return iproyectoService.getProyecto();
   }
   
   @PostMapping("/proyectos/crear")
   public String createProyecto(@RequestBody Proyecto proyecto){
      iproyectoService.saveProyecto(proyecto);
      return "su proyecto fue creado exitosamente";
   }
   
   @DeleteMapping("/proyectos/borrar/{id}")
   public String deleteProyecto(@PathVariable Long id){
       iproyectoService.deleteProyecto(id);
      return "su proyecto fue borrado exitosamente";
   }
   
   @PutMapping("/proyectos/editar/{id}")
    public ResponseEntity<Proyecto> editProyecto(@PathVariable Long id,
            @RequestBody Proyecto e) {
        Proyecto nuevaPro = iproyectoService.findProyecto(id);

        nuevaPro.setNombreproyecto(e.getNombreproyecto());
        nuevaPro.setDescripcionproyecto(e.getDescripcionproyecto());
        nuevaPro.setImgproyecto(e.getImgproyecto());

        iproyectoService.saveProyecto(nuevaPro);
        return ResponseEntity.ok(nuevaPro);
    }

    @GetMapping("/proyectos/traer/perfil")
    public Proyecto findProyecto() {
        return iproyectoService.findProyecto((long) 1);
    }
    
    @GetMapping("/proyectos/details/{id}")
    public Proyecto findProyecto(@PathVariable Long id) {
        return iproyectoService.findProyecto(id);
    }
}
