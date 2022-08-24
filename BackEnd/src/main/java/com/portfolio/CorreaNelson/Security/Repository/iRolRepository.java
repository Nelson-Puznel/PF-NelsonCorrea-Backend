package com.portfolio.CorreaNelson.Security.Repository;

import com.portfolio.CorreaNelson.Security.Entity.Rol;
import com.portfolio.CorreaNelson.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}