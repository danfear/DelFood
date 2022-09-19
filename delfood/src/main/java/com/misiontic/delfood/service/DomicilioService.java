package com.misiontic.delfood.service;

import org.springframework.stereotype.Service;

import com.misiontic.delfood.models.Domicilio;
import com.misiontic.delfood.models.Plato;
import com.misiontic.delfood.repository.DomicilioRepository;
import com.misiontic.delfood.repository.PlatoRepository;

@Service
public class DomicilioService {
    private final DomicilioRepository domiciliorepository;
    private final PlatoRepository platoRepository;
    
    public DomicilioService(DomicilioRepository domicilioRepository, PlatoRepository platoRepository){
        this.domiciliorepository=domicilioRepository;
        this.platoRepository=platoRepository;
    }

    public Domicilio crearDomicilio(Long platoId,Domicilio domicilio){
        Plato plato=platoRepository.findById(platoId).orElseThrow(() -> new RuntimeException("Compte Introuvable"));
        domicilio.setPlato(plato);
        domiciliorepository.save(domicilio);
        return domicilio;
    }
}