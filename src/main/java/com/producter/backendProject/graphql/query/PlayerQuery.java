package com.producter.backendProject.graphql.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.producter.backendProject.entity.Player;
import com.producter.backendProject.service.PlayerService;

@Controller
public class PlayerQuery {
	@Autowired
	private PlayerService playerService;

    @QueryMapping
    public Iterable<Player> findAllPlayers() {
        return playerService.findAllPlayers();
    }
}