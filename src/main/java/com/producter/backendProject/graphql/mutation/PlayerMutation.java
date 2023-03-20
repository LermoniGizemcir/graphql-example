package com.producter.backendProject.graphql.mutation;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import com.producter.backendProject.entity.Player;
import com.producter.backendProject.service.PlayerService;

@Controller
public class PlayerMutation {
	@Autowired
	private PlayerService playerService;
	
	@MutationMapping(name = "createPlayer") 
	public Player createPlayer(@Argument(name = "playerInput") Player player) { 
		return playerService.createPlayer(player); 
	}

    @MutationMapping
    public Player deletePlayer(@Argument UUID id) {
    	return playerService.deletePlayer(id);
    }
}