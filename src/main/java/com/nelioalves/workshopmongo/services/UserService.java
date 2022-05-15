package com.nelioalves.workshopmongo.services;

import com.nelioalves.workshopmongo.domain.User;
import com.nelioalves.workshopmongo.repository.UserRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public Optional<User> findById(String id) {
        Optional<User> user = repository.findById(id);

        if(user.isPresent()) {
            return user;
        } else {
            user.orElseThrow(() -> new ObjectNotFoundException("Object is not found!"));
        }

        return user;
    }
}
