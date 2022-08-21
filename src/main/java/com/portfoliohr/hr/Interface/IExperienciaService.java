package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
 //traer una lista de experiencia
    public List<Experiencia> getExperiencia();

    //guardar un objeto de tipo Experiencia
    public void saveExperiencia(Experiencia experiencia);

    //eliminar un objeto buscado por ID
    public void deleteExperiencia(Long id);

    //buscar una experiencia por id
    public Experiencia findExperiencia(Long id);
}
