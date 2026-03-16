package com.paperscissorsrock.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
import com.paperscissorsrock.repository.GameRepository;
import com.paperscissorsrock.entity.Game;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public Optional<Game> getGameById(Long id) {
        return gameRepository.findById(id);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Game game) {
        return gameRepository.save(game);
    }

    public void removeGame(Long id) {
        gameRepository.deleteById(id);
    }
}