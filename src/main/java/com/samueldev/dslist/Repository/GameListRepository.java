package com.samueldev.dslist.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samueldev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
