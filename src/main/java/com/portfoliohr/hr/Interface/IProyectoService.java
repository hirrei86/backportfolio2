package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {

    //traer una lista de proyectos
    public List<Proyecto> getProyecto();

    //guardar un objeto de tipo Proyecto
    public void saveProyecto(Proyecto proyecto);

    //eliminar un objeto buscado por ID
    public void deleteProyecto(Long id);

    //buscar una proyecto por id
    public Proyecto findProyecto(Long id);
}
