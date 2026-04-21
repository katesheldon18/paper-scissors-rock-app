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
    private boolean win;

    protected Game() {}

    public Game(Long userId, boolean win) {
        this.userId = userId;
        this.win = win;
    }

    @Override
    public String toString() {
        return String.format(
            "Game[id=%d, userId=%d, win=%b]",
            id, userId, win);
    }

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isWin() {
        return win;
    }
}
