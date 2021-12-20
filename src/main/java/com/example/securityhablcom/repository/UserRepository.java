package com.example.securityhablcom.repository;

import com.example.securityhablcom.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private List<User> users;

  {
        this.users = new ArrayList<>();
        this.users.add(new User("anton", "1234", "Антон", "Иванов", 20));
        this.users.add(new User("ivan", "12345", "Сергей", "Петров", 21));
    }

    public UserRepository() {



    }

    public User getByLogin(String login) {
        return this.users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAll() {
        return this.users;
    }
}