package com.producter.backendProject.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.producter.backendProject.entity.Player;
import com.producter.backendProject.repository.PlayerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	private final PlayerRepository playerRepository = null;
	
	@Override
	public Player createPlayer(Player player) {
		// name & surname must be a non-empty string - invalid input error
		// allow creation if playerList length < 12  - max capacity error
		return playerRepository.save(player);
	}
	
	@Override
	public Player deletePlayer(UUID id) {
		Optional<Player> removedPlayer = playerRepository.findById(id);
        // remove player from repository if user with given id exists
		if(removedPlayer.isPresent()) {
        	playerRepository.deleteById(id);
        }
        return removedPlayer.orElse(null);
	}
	
	@Override
	public Iterable<Player> findAllPlayers() {
		// returns empty list if no player exists
		return playerRepository.findAll();
	}
}