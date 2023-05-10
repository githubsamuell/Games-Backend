package com.samueldev.dslist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.samueldev.dslist.DTO.GameListDto;
import com.samueldev.dslist.DTO.GameMinDto;
import com.samueldev.dslist.Service.GameListService;
import com.samueldev.dslist.Service.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
       var result = gameListService.findAll();
       return result; 
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
       List<GameMinDto> result = gameService.findByList(listId);
       return result; 
    }

    
}
