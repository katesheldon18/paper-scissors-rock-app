package com.paperscissorsrock.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userId;
    private Boolean result;

    protected Game() {}

    public Game(Long userId, boolean result) {
        this.userId = userId;
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format(
            "Game[id=%d, userId=%d, result=%b]",
            id, userId, result);
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public Boolean getResult() {
        return result;
    }
}