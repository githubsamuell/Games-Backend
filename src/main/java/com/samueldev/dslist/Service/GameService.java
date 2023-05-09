package com.samueldev.dslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samueldev.dslist.DTO.GameMinDto;
import com.samueldev.dslist.Repository.GameRepository;
import com.samueldev.dslist.entities.Game;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> resultDto = result.stream().map(x -> new GameMinDto(x)).toList();
        return resultDto;
    }
}
