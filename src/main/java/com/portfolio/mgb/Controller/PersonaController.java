
package com.portfolio.mgb.Controller;

import com.portfolio.mgb.Entity.Persona;
import com.portfolio.mgb.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class PersonaController {
    @Autowired IPersonaService ipersonservice;
    
    @GetMapping("/perfil")
    public Persona findPersona(){
        return ipersonservice.findPersona((long)1);
    }
    
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona person){
        ipersonservice.savePersona(person);
        return ("El usuario se creo correctamente");
    }
    
    @DeleteMapping("/delete/{id}")
    public String deletePerson (@PathVariable Long id){
        ipersonservice.deletePersona(id);
        return ("El usuario fue eliminado correctamente");}
    

    @PutMapping("/editar/1")
    public Persona editPerson(@PathVariable Long id,
                             @RequestParam("nombre") String newNombre,
                             @RequestParam("apellido") String newApellido,
                             @RequestParam("about") String newAbout,
                             @RequestParam("img") String newimg){
    Persona person = ipersonservice.findPersona(id);
    
    person.setNombre(newNombre);
    person.setApellido(newApellido);
    person.setAbout(newAbout);
    person.setImg(newimg);
    
    ipersonservice.savePersona(person);
    return(person);
    }

}
