
package com.portfoliohr.hr.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String institucion;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String anioinicio;
    
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String aniofinal;
    
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
    private String tituloobtenido;
    
    public Educacion(){
        
    }
    public Educacion(long id, String institucion, String anioinicio, String aniofinal, String tituloobtenido){
       
        this.id = id;
        this.institucion = institucion;
        this.anioinicio = anioinicio;
        this.aniofinal = aniofinal;
        this.tituloobtenido = tituloobtenido;
    }

}
