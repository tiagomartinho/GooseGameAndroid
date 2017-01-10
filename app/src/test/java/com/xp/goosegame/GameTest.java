package com.xp.goosegame;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    private Game game;
    private Player player;

    @Before
    public void setUp() throws Exception {
        game = new Game();
        player = new Player("Pippo");
    }

    @Test
    public void
    when_the_game_starts_it_has_no_players() throws Exception {

        assertEquals(0, game.numberOfPlayers());
    }

    @Test
    public void
    when_adding_the_first_player_the_number_of_players_increases() throws Exception {

        game.add(player);

        assertEquals(1, game.numberOfPlayers());
    }

    @Test
    public void
    when_adding_the_first_player_the_first_player_returned_is_the_same() throws Exception {

        game.add(player);

        assertEquals(player, game.players().get(0));
    }
}