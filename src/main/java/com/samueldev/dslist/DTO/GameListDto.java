package com.samueldev.dslist.DTO;

import com.samueldev.dslist.entities.Game;
import com.samueldev.dslist.entities.GameList;

public class GameListDto {
    private Long id;
    private String name;

    public GameListDto() {

    }

    public GameListDto(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
