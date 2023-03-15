package com.bartendersbible.services;

import com.bartendersbible.entities.Recettes;
import com.bartendersbible.repositories.RecettesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RecettesService {

    private final RecettesRepository recettesRepository;

    @Autowired
    public RecettesService(RecettesRepository recettesRepository){
        this.recettesRepository = recettesRepository;
    }

    public List<Recettes> getSomeRecipes() { return this.recettesRepository.getASomeRecipes();}
}
