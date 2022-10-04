package com.delfood.delfood.service;

import org.springframework.stereotype.Service;

import com.delfood.delfood.Models.Domicilio;
import com.delfood.delfood.Models.Plato;
import com.delfood.delfood.repository.DomicilioRepository;
import com.delfood.delfood.repository.PlatoRepository;

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
        domicilio.setPrecio(plato.getPrecio()*domicilio.getCantidad()); //
        domicilio.setTiempo(plato.getTiempo()+10); //
        domiciliorepository.save(domicilio);
        return domicilio;
    }

    public Domicilio guardarDomicilio(Long DomicilioId,Domicilio domiclio){
        Domicilio domicilioex=domiciliorepository.findById(DomicilioId).orElseThrow(() -> new RuntimeException("Compte Introuvable"));
        domicilioex.setNombre(domiclio.getNombre());
        domicilioex.setTelefono(domiclio.getTelefono());
        domicilioex.setDireccion(domiclio.getDireccion());
        //domicilioex.setTiempo(domiclio.getTiempo());
        System.out.println(domicilioex.getTiempo());
        domiciliorepository.save(domicilioex);
        return domicilioex;
    }

}
