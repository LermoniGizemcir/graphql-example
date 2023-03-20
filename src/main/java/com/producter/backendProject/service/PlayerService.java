package com.producter.backendProject.service;

import java.util.UUID;

import com.producter.backendProject.entity.Player;

public interface PlayerService {
    Player createPlayer(Player player);
    Player deletePlayer(UUID id);
    Iterable<Player> findAllPlayers();
}