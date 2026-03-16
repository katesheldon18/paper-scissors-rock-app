package com.paperscissorsrock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.paperscissorsrock.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {}