package com.xp.goosegame;

import java.util.ArrayList;
import java.util.List;

class Game {

    private List<Player> players;

    public Game() {
        this.players = new ArrayList<>();
    }

    public int numberOfPlayers() {
        return players.size();
    }

    public void add(Player player) {
        players.add(player);
    }

    public List<Player> players() {
        return players;
    }
}
