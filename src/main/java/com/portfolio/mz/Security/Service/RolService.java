/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mz.Security.Service;

<<<<<<< HEAD:src/main/java/com/portfolio/mgb/Security/Service/RolService.java
import com.portfolio.mgb.Entity.Educacion;
import com.portfolio.mgb.Security.Entity.Rol;
import com.portfolio.mgb.Security.Enums.RolNombre;
import com.portfolio.mgb.Security.Repository.iRolRepository;
=======
import com.portfolio.mz.Entity.Educacion;
import com.portfolio.mz.Security.Entity.Rol;
import com.portfolio.mz.Security.Enums.RolNombre;
import com.portfolio.mz.Security.Repository.iRolRepository;
>>>>>>> 12d93b4e9c504794943c3a61c8bdbf158af3248a:src/main/java/com/portfolio/mz/Security/Service/RolService.java

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }

    public List<Rol> list(){
        return irolRepository.findAll();
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
