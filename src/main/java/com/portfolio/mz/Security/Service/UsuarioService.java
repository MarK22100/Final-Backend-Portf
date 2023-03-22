/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mz.Security.Service;

<<<<<<< HEAD:src/main/java/com/portfolio/mgb/Security/Service/UsuarioService.java
import com.portfolio.mgb.Entity.Educacion;
import com.portfolio.mgb.Security.Entity.Usuario;
import com.portfolio.mgb.Security.Repository.iUsuarioRepository;
=======
import com.portfolio.mz.Entity.Educacion;
import com.portfolio.mz.Security.Entity.Usuario;
import com.portfolio.mz.Security.Repository.iUsuarioRepository;
>>>>>>> 12d93b4e9c504794943c3a61c8bdbf158af3248a:src/main/java/com/portfolio/mz/Security/Service/UsuarioService.java

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public List<Usuario> list(){
        return iusuarioRepository.findAll();}
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }


    public void delete(int id){
        iusuarioRepository.deleteById(id);
    }
}
