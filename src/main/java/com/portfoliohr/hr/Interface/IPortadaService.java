
package com.portfoliohr.hr.Interface;

import com.portfoliohr.hr.Entity.Portada;
import java.util.List;


public interface IPortadaService {
    
     public void savePortada(Portada portada);
     
     public Portada findPortada(Long id);
     
     public List<Portada> getPortada();

    }
