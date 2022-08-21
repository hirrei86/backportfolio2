package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer una lista de persona
    public List<Persona> getPersona();
   
    //guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto buscado por ID
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
    }
