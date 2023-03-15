package com.bartendersbible.services;

import com.bartendersbible.entities.Ingredients;
import com.bartendersbible.entities.User;
import com.bartendersbible.repositories.IngredientsRepository;
import com.bartendersbible.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getSomeIngredients() {
        return this.userRepository.getSomeUsers();
    }

}
