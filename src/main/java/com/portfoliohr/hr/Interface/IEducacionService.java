package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    //traer una lista de educaciones
    public List<Educacion> getEducacion();
   
    //guardar un objeto de tipo educacion
    public void saveEducacion(Educacion educacion);
    
    //eliminar un objeto buscado por ID
    public void deleteEducacion(Long id);
    
    //buscar una educacion por id
    public Educacion findEducacion(Long id);
    }

