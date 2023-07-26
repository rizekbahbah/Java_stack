package com.axsos.dojoandninjas.services;


import com.axsos.dojoandninjas.models.Dojo;
import com.axsos.dojoandninjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public Dojo createDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }

    public List<Dojo> allDojos(){
        return dojoRepository.findAll();
    }

    public Dojo findDojo(Long id){
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()){
            return optionalDojo.get();
        }else {
            return null;
        }
    }

    public Dojo updateDojo(Dojo dojo){
        return dojoRepository.save(dojo);
    }

    public void deleteDojo(Long id){
        dojoRepository.deleteById(id);
    }
}
