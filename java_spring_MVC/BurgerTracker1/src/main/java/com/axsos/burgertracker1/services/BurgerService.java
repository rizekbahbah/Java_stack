package com.axsos.burgertracker1.services;

import com.axsos.burgertracker1.models.Burger;
import com.axsos.burgertracker1.repositories.BurgerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BurgerService {
    private final BurgerRepository burgerRepository;

    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }


    public Burger createBurger(Burger burger){
        return burgerRepository.save(burger);
    }

    public List<Burger> allBurgers(){
        return burgerRepository.findAll();
    }

    public Burger findBurger(Long id){
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()){
            return optionalBurger.get();
        }
        else {
            return null;
        }
    }

}
