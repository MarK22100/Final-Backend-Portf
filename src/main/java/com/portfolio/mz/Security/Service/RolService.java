/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mz.Security.Service;

import com.portfolio.mz.Entity.Educacion;
import com.portfolio.mz.Security.Entity.Rol;
import com.portfolio.mz.Security.Enums.RolNombre;
import com.portfolio.mz.Security.Repository.iRolRepository;

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
