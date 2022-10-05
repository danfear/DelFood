package com.delfood.delfood.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.delfood.delfood.Models.Plato;
public interface PlatoRepository extends JpaRepository<Plato, Long>{
    
}