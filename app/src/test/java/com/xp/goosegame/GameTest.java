package com.xp.goosegame;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void
    when_the_game_starts_it_has_no_players() throws Exception {

        assertEquals(0, game.numberOfPlayers());
    }

    @Test
    public void
    when_adding_the_first_player_the_number_of_players_increases() throws Exception {

        game.add(new Player("Pippo"));

        assertEquals(1, game.numberOfPlayers());
    }
}