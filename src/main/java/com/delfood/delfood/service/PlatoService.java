package com.delfood.delfood.service;

import com.delfood.delfood.repository.PlatoRepository;
import org.springframework.stereotype.Service;
import com.delfood.delfood.Models.Plato;
import java.util.List;

@Service
public class PlatoService {
  private final PlatoRepository platorepository;
  
  public PlatoService(PlatoRepository platorepository){
    this.platorepository=platorepository;
  }

  public List<Plato> buscartodos(){
    return platorepository.findAll();
  } 
  public Plato getplatobyId(Long Id){
    Plato plato=platorepository.findById(Id).orElseThrow(() -> new RuntimeException("No existe el plato"));
    return plato;
  }
}