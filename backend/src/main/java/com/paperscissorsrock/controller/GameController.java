package com.paperscissorsrock.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;
import com.paperscissorsrock.service.GameService;
import com.paperscissorsrock.entity.Game;

@RestController
// https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-requestmapping.html
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    // create endpoint

    @GetMapping("/{id}")
    public Optional<Game> getGameById(@PathVariable Long id) {
        return gameService.getGameById(id);
    }

    @GetMapping()
    public List<Game> getGames() {
        return gameService.getGames();
    }

    @PostMapping()
    public Game createGame(Game game) {
        return gameService.createGame(game);
    }
}