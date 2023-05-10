package com.samueldev.dslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samueldev.dslist.DTO.GameDto;
import com.samueldev.dslist.DTO.GameMinDto;
import com.samueldev.dslist.Projection.GameMinProjection;
import com.samueldev.dslist.Repository.GameRepository;
import com.samueldev.dslist.entities.Game;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> resultDto = result.stream().map(x -> new GameMinDto(x)).toList();
        return resultDto;
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDto(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDto> resultDto = result.stream().map(x -> new GameMinDto(x)).toList();
        return resultDto;
    }

}
