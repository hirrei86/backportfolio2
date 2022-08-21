
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
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String empleo;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String anioinicio;
    
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String aniofinal;
    
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
    private String cargo;

    public Experiencia(){
        
    }
    public Experiencia(long id, String empleo, String anioinicio, String aniofinal, String cargo){
       
        this.id = id;
        this.empleo = empleo;
        this.anioinicio = anioinicio;
        this.aniofinal = aniofinal;
        this.cargo = cargo;
    }
    
    }
