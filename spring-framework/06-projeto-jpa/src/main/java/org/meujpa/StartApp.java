package org.meujpa;

import org.meujpa.model.User;
import org.meujpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        insertUser();
        List<User> users = repository.findByNameContaining("Gabriel");
        for (User u: users){
            System.out.println(u);
        }
    }

    private void insertUser(){
        User user  = new User("Gabriel", "Gabs", "SofiaGatinha");
        repository.save(user);

        for (User u: repository.findAll()){
            System.out.println(u);
        }
    }
}
