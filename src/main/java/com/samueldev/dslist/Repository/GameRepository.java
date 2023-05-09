package com.samueldev.dslist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
