package com.nelioalves.workshopmongo.dto;

import com.nelioalves.workshopmongo.domain.User;

import java.io.Serializable;
import java.util.Optional;

public class UserDTO implements Serializable {
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public UserDTO(Optional<User> obj) {
        id = obj.get().getId();
        name = obj.get().getName();
        email = obj.get().getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
