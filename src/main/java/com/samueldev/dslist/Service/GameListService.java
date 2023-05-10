package com.samueldev.dslist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samueldev.dslist.DTO.GameListDto;
import com.samueldev.dslist.Repository.GameListRepository;

@Service
public class GameListService {
    @Autowired
    GameListRepository gameListRepository;

    @Transactional
    public List<GameListDto> findAll() {
        var result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDto(x)).toList();
    }
}
