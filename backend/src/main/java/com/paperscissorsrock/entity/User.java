// https://spring.io/guides/gs/accessing-data-jpa#initial

package com.paperscissorsrock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    // auto generate ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    protected User() {}

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return String.format(
            "User[id=%d, username='%s']",
            id, username);
    }

    // getter methods

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}