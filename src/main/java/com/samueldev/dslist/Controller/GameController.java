package com.samueldev.dslist.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.samueldev.dslist.DTO.GameMinDto;
import com.samueldev.dslist.Service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDto> findAll() {
       List<GameMinDto> result = gameService.findAll();
       return result; 
    }
}
