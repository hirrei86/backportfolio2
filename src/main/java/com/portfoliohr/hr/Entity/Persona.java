
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
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    private String apellido;
    
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
    private String imgperfil;
    
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
    private String acercaDe;
    
    public Persona(){
        
    }
    public Persona(long id, String nombre, String apellido, String imgperfil, String acercaDe){
       
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imgperfil = imgperfil;
        this.acercaDe = acercaDe;
    }
    
    }

     
