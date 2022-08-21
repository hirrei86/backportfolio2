
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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String nombreproyecto;
    
    @NotNull
    @Size(min = 1, max = 500, message = "No cumple con la longitud")
    private String descripcionproyecto;
    
    @Size(min = 1, max = 3000, message = "No cumple con la longitud")
    private String imgproyecto;
    
    public Proyecto(){
        
    }
    public Proyecto(long id, String nombreproyecto, String descripcionproyecto, String imgproyecto){
       
        this.id = id;
        this.nombreproyecto = nombreproyecto;
        this.descripcionproyecto = descripcionproyecto;
        this.imgproyecto = imgproyecto;
    }
    
    
     }