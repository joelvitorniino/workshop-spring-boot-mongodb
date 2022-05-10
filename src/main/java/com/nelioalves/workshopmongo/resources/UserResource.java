package com.nelioalves.workshopmongo.resources;

import com.nelioalves.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        User joel = new User("1", "Joel Vitor", "joel@gmail.com");
        User felipe = new User("2", "Felipe Perdomo", "felipe@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(joel, felipe));

        return ResponseEntity.ok().body(list);
    }
}
