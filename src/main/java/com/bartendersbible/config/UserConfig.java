package com.bartendersbible.config;

import com.bartendersbible.entities.User;
import com.bartendersbible.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User i = new User();
            i.setName("Amaury BET");
            i.setUserName("momo");
            i.setEmail("amaury.bet@hotmail.com");
            i.setPassword("momomotdepasse");
            i.setPhoneNumber("0666666666");
            userRepository.save(i);

            i = new User();
            i.setName("Kévin Navaro");
            i.setUserName("keke");
            i.setEmail("kevin.navaro@test.fr");
            i.setPassword("kekemotdepasse");
            i.setPhoneNumber("0777777777");
            userRepository.save(i);
        };
    }
}
