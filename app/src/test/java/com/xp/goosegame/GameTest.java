package com.xp.goosegame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Test
    public void
    when_the_game_starts_it_has_no_players() throws Exception {
        Game game = new Game();

        assertEquals(0, game.numberOfPlayers());
    }

    @Test
    public void
    when_adding_a_player_the_game_returns_the_list_of_players() throws Exception {
        Game game = new Game();

        game.add(new Player("Pippo"));

        assertEquals(1, game.numberOfPlayers());
    }
}