package com.axsos.dojoandninjas.services;


import com.axsos.dojoandninjas.models.Ninja;
import com.axsos.dojoandninjas.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public Ninja createNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public List<Ninja> allNinjas(){
        return ninjaRepository.findAll();
    }

    public Ninja findNinja(Long id){
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()){
            return optionalNinja.get();
        }
        else{
            return null;
        }
    }

    public Ninja updateNinja(Ninja ninja){
        return ninjaRepository.save(ninja);
    }

    public void deleteNinja(Long id){
        ninjaRepository.deleteById(id);
    }
}
