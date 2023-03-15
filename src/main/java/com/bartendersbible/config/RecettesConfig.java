package com.bartendersbible.config;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.Recettes;
import com.bartendersbible.repositories.RecettesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;

public class RecettesConfig {

    @Bean
    CommandLineRunner commandLineRunner(RecettesRepository recettesRepository) {
        return args -> {
            Recettes i = new Recettes();
            i.setName("Mojito");
            i.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été. Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
            i.setCreatedAt(new Date());
            i.setEstimatedTime(10);
            i.setImage("https://cdn.pixabay.com/photo/2015/03/30/12/35/mojito-698499_960_720.jpg");
            i.hasAlcohol();
            recettesRepository.save(i);

            i = new Recettes();
            i.setName("Cuba Libre");
            i.setDescription("Cocktail rafraîchissant à base de Rhum, idéal lors d'une soirée estivale ou d'été. Possibilité d'utiliser du rhum ambré pour une variation d'intensité.");
            i.setCreatedAt(new Date());
            i.setEstimatedTime(5);
            i.setImage("https://www.rhum-cocktails.com/medias/cuba-libre.jpg");
            i.hasAlcohol();
            recettesRepository.save(i);

        };
    }
}
