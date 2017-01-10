package com.xp.goosegame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Test
    public void
    when_the_game_starts_it_has_no_players() throws Exception {
        
        Game game = new Game();

        assertEquals(0, game.numberOfPlayers());
    }

    private class Game {

        private List<Player> players;

        public Game() {
            this.players = new ArrayList<>();
        }

        public int numberOfPlayers() {
            return players.size();
        }
    }

    private class Player {
    }
}