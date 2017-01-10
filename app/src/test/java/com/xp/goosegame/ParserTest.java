package com.xp.goosegame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ParserTest {

    @Test
    public void
    add_player_command() throws Exception {
        String input = "aggiungi giocatore Pippo";
        Player expectedPlayer = new Player("Pippo");
        Parser parser = new Parser();

        Player player = parser.parse(input);

        assertEquals(expectedPlayer, player);
    }

}