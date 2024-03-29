package com.portfolio.mgb.Entity;

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
    @Size(min = 1, max = 50, message = "No tiene la longitud requerida")
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "No tiene la longitud requerida")
    private String apellido;
    @NotNull
    @Size(min = 1, max = 9999, message = "No tiene la longitud requerida")
    private String img;
    @NotNull
    @Size(min = 1, max = 5000, message = "No tiene la longitud requerida")
    private String about;
    
    
    
}
